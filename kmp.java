/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.http.X509TrustManagerExtensions
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.X509TrustManager;

public class kmp {
    private static kmp a;

    public kmp() {
    }

    public kmp(char[] cArray) {
    }

    public kmp(char[] cArray, byte[] byArray) {
        new HashSet();
    }

    public static kkh A(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        jse.e(x509TrustManager, "trustManager");
        kkh kkh2 = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            kkh2 = new kkh(x509TrustManager, x509TrustManagerExtensions);
        }
        return kkh2;
    }

    public static boolean B() {
        kkf kkf2 = kkf.b;
        return kmp.D() && Build.VERSION.SDK_INT >= 29;
    }

    public static List C(List arrayList2) {
        jse.e(arrayList2, "protocols");
        Object object = new ArrayList();
        for (Object t2 : arrayList2) {
            if ((kgq)((Object)t2) == kgq.a) continue;
            object.add(t2);
        }
        ArrayList<String> arrayList = new ArrayList<String>(jns.B(object));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((kgq)((Object)object.next())).g);
        }
        return arrayList;
    }

    public static boolean D() {
        return jse.i("Dalvik", System.getProperty("java.vm.name"));
    }

    public static int E(int n2, int n3, int n4) {
        int n5 = n2;
        if ((n3 & 8) != 0) {
            n5 = n2 - 1;
        }
        if (n4 <= n5) {
            return n5 - n4;
        }
        throw new IOException(a.an(n5, n4, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static kiq F(int n2) {
        kiq kiq22;
        block2: {
            for (kiq kiq22 : kiq.values()) {
                if (kiq22.o != n2) {
                    continue;
                }
                break block2;
            }
            kiq22 = null;
        }
        return kiq22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static kig G(String string) {
        kgq kgq2;
        int n2;
        int n3;
        if (jse.X(string, "HTTP/1.")) {
            n3 = string.length();
            n2 = 9;
            if (n3 < 9 || string.charAt(8) != ' ') throw new ProtocolException("Unexpected status line: ".concat(string));
            n3 = string.charAt(7) - 48;
            if (n3 != 0) {
                if (n3 != 1) throw new ProtocolException("Unexpected status line: ".concat(string));
                kgq2 = kgq.b;
            } else {
                kgq2 = kgq.a;
            }
        } else {
            if (!jse.X(string, "ICY ")) throw new ProtocolException("Unexpected status line: ".concat(string));
            kgq2 = kgq.a;
            n2 = 4;
        }
        int n4 = string.length();
        n3 = n2 + 3;
        if (n4 < n3) throw new ProtocolException("Unexpected status line: ".concat(string));
        try {
            String string2 = string.substring(n2, n3);
            jse.d(string2, "substring(...)");
            n4 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ProtocolException("Unexpected status line: ".concat(string));
        }
        if (string.length() > n3) {
            if (string.charAt(n3) != ' ') throw new ProtocolException("Unexpected status line: ".concat(string));
            string = string.substring(n2 + 4);
            jse.d(string, "substring(...)");
            return new kig(kgq2, n4, string);
        } else {
            string = "";
        }
        return new kig(kgq2, n4, string);
    }

    public static String H(kgm object) {
        String string = ((kgm)object).b();
        if ((object = ((kgm)object).c()) != null) {
            return a.ao((String)object, string, "?");
        }
        return string;
    }

    public static boolean I(String string) {
        jse.e(string, "method");
        return !jse.i(string, "GET") && !jse.i(string, "HEAD");
    }

    public static void K(abb abb2, ixw ixw2) {
        if (((abg)abb2).b == aba.a) {
            ixw2.a();
            return;
        }
        abb2.b(new mm(ixw2, 5, null));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List L(Class serializable, Iterable serviceLoader, ClassLoader object, iyd iyd2) {
        void var1_10;
        Object object2;
        if (!kmp.M((ClassLoader)object2)) {
            object2 = ServiceLoader.load(serializable, (ClassLoader)object2);
            Iterable<Object> iterable = object2;
            if (!object2.iterator().hasNext()) {
                ServiceLoader serviceLoader2 = ServiceLoader.load(serializable);
            }
        } else {
            object2 = new ArrayList();
            Iterator iterator = serviceLoader.iterator();
            while (true) {
                void var1_7;
                Iterable<Object> iterable = object2;
                if (!iterator.hasNext()) break;
                Class clazz = (Class)iterator.next();
                Object var1_5 = null;
                try {
                    Object u2;
                    Object u3 = u2 = clazz.asSubclass(serializable).getConstructor(null).newInstance(null);
                }
                catch (Throwable throwable) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", clazz.getName(), throwable), throwable);
                }
                catch (ClassCastException classCastException) {}
                if (var1_7 == null) continue;
                object2.add(var1_7);
            }
        }
        serializable = new ArrayList();
        object2 = var1_10.iterator();
        while (true) {
            void var3_14;
            if (!object2.hasNext()) {
                Collections.sort(serializable, Collections.reverseOrder(new bvk((iyd)var3_14, 2)));
                return DesugarCollections.unmodifiableList(serializable);
            }
            Object e2 = object2.next();
            var3_14.b(e2);
            serializable.add(e2);
        }
    }

    public static boolean M(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void N(ixb ixb2, ixy ixy2, String string, iyc iyc2, Map map) {
        kmp.U(new ksb(ixb2, (Object)ixy2), string, map);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void O() {
        synchronized (kmp.class) {
            if (a == null) {
                kmp kmp2;
                a = kmp2 = new kmp(null, null);
                return;
            }
            return;
        }
    }

    public static void P() {
        dml.Q().F();
    }

    public static void Q() {
        Iterator iterator = dml.Q().E().iterator();
        while (iterator.hasNext()) {
            ((iuh)iterator.next()).a();
        }
    }

    public static iyh R(ius object) {
        a.s(object, "context must not be null");
        if (!((ius)object).i()) {
            return null;
        }
        if ((object = ((ius)object).c()) == null) {
            return iyh.c.e("io.grpc.Context was cancelled without error");
        }
        if (object instanceof TimeoutException) {
            return iyh.e.e(((Throwable)object).getMessage()).d((Throwable)object);
        }
        iyh iyh2 = iyh.c((Throwable)object);
        iye iye2 = iyh2.n;
        if (iye.c.equals((Object)iye2) && iyh2.p == object) {
            return iyh.c.e("Context cancelled").d((Throwable)object);
        }
        return iyh2.d((Throwable)object);
    }

    public static ksb S(Map map) {
        return new ksb(hac.i(map));
    }

    public static ksb T(String object, iyc object2, Map map) {
        Object object3 = object2;
        if (object2 == null) {
            object2 = new ArrayList(map.size());
            object3 = map.values().iterator();
            while (object3.hasNext()) {
                object2.add((Object)((ksb)object3.next()).b);
            }
            object = new ksb((String)object);
            ((ksb)object).a.addAll(object2);
            object3 = new iyc((ksb)object);
        }
        object = new HashMap(map);
        object2 = ((iyc)object3).b.iterator();
        while (object2.hasNext()) {
            ixb ixb2 = (ixb)object2.next();
            ksb ksb2 = (ksb)object.remove(ixb2.b);
            if (ksb2 != null) {
                if (ksb2.b == ixb2) continue;
                object = ixb2.b;
                object2 = new StringBuilder("Bound method for ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" not same instance as method in service descriptor");
                throw new IllegalStateException(((StringBuilder)object2).toString());
            }
            throw new IllegalStateException("No method bound for descriptor entry ".concat(ixb2.b));
        }
        if (object.size() <= 0) {
            return new ksb((iyc)object3, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((ixb)((ksb)object.values().iterator().next()).b).b));
    }

    public static void U(ksb ksb2, String string, Map map) {
        ixb ixb2 = (ixb)ksb2.b;
        fxf.y(string.equals(ixb2.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", string, ixb2.b);
        string = ixb2.b;
        fxf.E(map.containsKey(string) ^ true, "Method by same name already registered: %s", string);
        map.put(string, ksb2);
    }

    public static int n(Context context, String string, int n2, int n3) {
        try {
            n2 = context.checkPermission(string, n2, n3);
            return n2;
        }
        catch (RuntimeException runtimeException) {
            return -1;
        }
    }

    public static int o(kmh kmh2, int n2) {
        int n3;
        block4: {
            n3 = kmh2.e.length - 1;
            int n4 = 0;
            while (n4 <= n3) {
                int[] nArray = kmh2.f;
                int n5 = n4 + n3 >>> 1;
                int n6 = nArray[n5];
                int n7 = n2 + 1;
                if (n6 < n7) {
                    n4 = n5 + 1;
                    continue;
                }
                n3 = n5;
                if (n6 > n7) {
                    n3 = n5 - 1;
                    continue;
                }
                break block4;
            }
            n3 = -n4 - 1;
        }
        if (n3 >= 0) {
            return n3;
        }
        return ~n3;
    }

    public static String p(byte[] byArray) {
        jse.e(byArray, "<this>");
        return new String(byArray, jts.a);
    }

    public static byte[] q(String object) {
        jse.e(object, "<this>");
        object = ((String)object).getBytes(jts.a);
        jse.d(object, "getBytes(...)");
        return object;
    }

    public static long s(klm klm2) {
        return klm2.b / 4L;
    }

    public static kln t(kmi kmi2) {
        jse.e(kmi2, "<this>");
        return new kmc(kmi2);
    }

    public static klp u(String string) {
        if (string.length() % 2 == 0) {
            int n2 = string.length() / 2;
            byte[] byArray = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = i2 + i2;
                byArray[i2] = (byte)((kmo.a(string.charAt(n3)) << 4) + kmo.a(string.charAt(n3 + 1)));
            }
            return new klp(byArray);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(string));
    }

    public static klp v(String string) {
        jse.e(string, "<this>");
        klp klp2 = new klp(kmp.q(string));
        klp2.d = string;
        return klp2;
    }

    public static String w(int n2) {
        if (n2 == 0) {
            return "0";
        }
        char c2 = kmo.a[n2 >> 28 & 0xF];
        char[] cArray = kmo.a;
        char c3 = cArray[n2 >> 24 & 0xF];
        char c4 = cArray[n2 >> 20 & 0xF];
        char c5 = cArray[n2 >> 16 & 0xF];
        char c6 = cArray[n2 >> 12 & 0xF];
        char c7 = cArray[n2 >> 8 & 0xF];
        char c8 = cArray[n2 >> 4 & 0xF];
        char c9 = cArray[n2 & 0xF];
        cArray = new char[8];
        cArray[0] = c2;
        cArray[1] = c3;
        cArray[2] = c4;
        cArray[3] = c5;
        cArray[4] = c6;
        cArray[5] = c7;
        cArray[6] = c8;
        cArray[7] = c9;
        for (n2 = 0; n2 < 8 && cArray[n2] == '0'; ++n2) {
        }
        if (n2 >= 0) {
            if (n2 <= 8) {
                return new String(cArray, n2, 8 - n2);
            }
            throw new IllegalArgumentException(a.ah(n2, "startIndex: ", " > endIndex: 8"));
        }
        throw new IndexOutOfBoundsException(a.ah(n2, "startIndex: ", ", endIndex: 8, size: 8"));
    }

    public static void x(long l2, long l3, long l4) {
        if ((l3 | l4) >= 0L && l3 <= l2 && l2 - l3 >= l4) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("size=");
        stringBuilder.append(l2);
        stringBuilder.append(" offset=");
        stringBuilder.append(l3);
        stringBuilder.append(" byteCount=");
        stringBuilder.append(l4);
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static boolean y(byte[] byArray, int n2, byte[] byArray2, int n3, int n4) {
        jse.e(byArray, "a");
        jse.e(byArray2, "b");
        for (int i2 = 0; i2 < n4; ++i2) {
            if (byArray[i2 + n2] == byArray2[i2 + n3]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String z(byte[] object, byte[][] object2, int n2) {
        void var0_3;
        int n3 = ((byte[])object).length;
        int n4 = 0;
        while (n4 < n3) {
            int n5;
            block12: {
                int n6;
                int n7;
                int n8;
                int n9;
                block13: {
                    int n10;
                    block11: {
                        int n11;
                        int n12;
                        void var1_4;
                        int n13;
                        int n14;
                        block10: {
                            void var2_6;
                            for (n10 = (n4 + n3) / 2; n10 >= 0 && object[n10] != 10; --n10) {
                            }
                            n9 = n10 + 1;
                            n14 = 1;
                            while (object[n5 = n9 + n14] != 10) {
                                ++n14;
                            }
                            n8 = n5 - n9;
                            n13 = var2_6;
                            n7 = 0;
                            n6 = n14 = 0;
                            while (true) {
                                int n15;
                                n7 = n7 != 0 ? 46 : khb.z((byte)var1_4[n13][n14]);
                                n12 = n15 = n7 - khb.z(object[n9 + n6]);
                                n11 = n14++;
                                n7 = n6++;
                                if (n15 != 0) break block10;
                                if (n6 == n8) break;
                                if (((void)var1_4[n13]).length == n14) {
                                    if (n13 == ((void)var1_4).length - 1) break;
                                    ++n13;
                                    n7 = 1;
                                    n14 = -1;
                                    continue;
                                }
                                n7 = 0;
                            }
                            n12 = 0;
                            n7 = n6;
                            n11 = n14;
                        }
                        if (n12 < 0) break block11;
                        if (n12 > 0) break block12;
                        n7 = n8 - n7;
                        n6 = ((void)var1_4[n13]).length - n11;
                        n14 = n13 + true;
                        n13 = ((void)var1_4).length;
                        while (n14 < n13) {
                            n6 += ((void)var1_4[n14]).length;
                            ++n14;
                        }
                        if (n6 >= n7) break block13;
                    }
                    n3 = n10;
                    continue;
                }
                if (n6 <= n7) {
                    Charset charset = StandardCharsets.UTF_8;
                    jse.d(charset, "UTF_8");
                    String string = new String((byte[])object, n9, n8, charset);
                    return var0_3;
                }
            }
            n4 = n5 + 1;
        }
        return var0_3;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void J() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public void W() {
    }

    public void X() {
    }

    public void Y(ixz ixz2) {
        throw null;
    }

    public void b(long l2) {
    }

    public void c(long l2) {
    }

    public void e() {
    }

    public void f(Object object) {
    }

    public void g() {
    }

    public void h() {
    }

    public final void r(long l2, klm klm2, int n2, List list, int n3, int n4, List list2) {
        int n5 = n2;
        if (n3 < n4) {
            int n6;
            for (n2 = n3; n2 < n4; ++n2) {
                if (((klp)list.get(n2)).b() >= n5) {
                    continue;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            Object object = (klp)list.get(n3);
            klp klp2 = (klp)list.get(n4 - 1);
            if (n5 == ((klp)object).b()) {
                n6 = ((Number)list2.get(n3)).intValue();
                n2 = n3 + 1;
                object = (klp)list.get(n2);
                n3 = n6;
            } else {
                n6 = -1;
                n2 = n3;
                n3 = n6;
            }
            int n7 = n2 + 1;
            if (((klp)object).a(n5) != klp2.a(n5)) {
                int n8;
                n6 = 1;
                for (n8 = n7; n8 < n4; ++n8) {
                    n7 = n6;
                    if (((klp)list.get(n8 - 1)).a(n5) != ((klp)list.get(n8)).a(n5)) {
                        n7 = n6 + 1;
                    }
                    n6 = n7;
                }
                l2 = l2 + kmp.s(klm2) + 2L;
                n8 = n6 + n6;
                klm2.H(n6);
                klm2.H(n3);
                for (n3 = n2; n3 < n4; ++n3) {
                    n6 = ((klp)list.get(n3)).a(n5);
                    if (n3 != n2 && n6 == ((klp)list.get(n3 - 1)).a(n5)) continue;
                    klm2.H(n6 & 0xFF);
                }
                object = new klm();
                n3 = n8;
                n6 = n2;
                while (n6 < n4) {
                    block18: {
                        n7 = n5 + 1;
                        byte by2 = ((klp)list.get(n6)).a(n5);
                        for (n2 = n8 = n6 + 1; n2 < n4; ++n2) {
                            if (by2 == ((klp)list.get(n2)).a(n5)) {
                                continue;
                            }
                            break block18;
                        }
                        n2 = n4;
                    }
                    if (n8 == n2 && n7 == ((klp)list.get(n6)).b()) {
                        klm2.H(((Number)list2.get(n6)).intValue());
                    } else {
                        long l3 = l2 + (long)n3;
                        klm2.H(-((int)(l3 + kmp.s((klm)object))));
                        this.r(l3, (klm)object, n7, list, n6, n2, list2);
                    }
                    n6 = n2;
                }
                klm2.E((kmk)object);
                return;
            }
            int n9 = Math.min(((klp)object).b(), klp2.b());
            int n10 = 0;
            for (n6 = n5; n6 < n9 && ((klp)object).a(n6) == klp2.a(n6); ++n6) {
                ++n10;
            }
            long l4 = kmp.s(klm2);
            long l5 = n10;
            klm2.H(-n10);
            klm2.H(n3);
            n3 = n5 + n10;
            while (n5 < n3) {
                klm2.H(((klp)object).a(n5) & 0xFF);
                ++n5;
            }
            if (n7 == n4) {
                if (n3 == ((klp)list.get(n2)).b()) {
                    klm2.H(((Number)list2.get(n2)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            l2 = l2 + l4 + 2L + l5 + 1L;
            object = new klm();
            klm2.H(-((int)(kmp.s((klm)object) + l2)));
            this.r(l2, (klm)object, n3, list, n2, n4, list2);
            klm2.E((kmk)object);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

