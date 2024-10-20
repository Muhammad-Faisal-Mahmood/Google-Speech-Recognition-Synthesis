/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class khb {
    public static final byte[] a;
    public static final kgk b;
    public static final kgx c;
    public static final TimeZone d;
    public static final String e;
    private static final jtv f;

    static {
        int n2;
        Object object;
        Object object2;
        int n3;
        Object object3;
        a = new byte[0];
        for (String object42 : (String[])new String[0].clone()) {
            if (object42 != null) {
                object3[n3] = ((Object)jse.w(object42)).toString();
                continue;
            }
            throw new IllegalArgumentException("Headers cannot be null");
        }
        int n4 = jsd.g(0, ((String[])object3).length - 1, 2);
        if (n4 >= 0) {
            n3 = 0;
            while (true) {
                object2 = object3[n3];
                String string = object3[n3 + 1];
                jvf.x((String)object2);
                jvf.y(string, (String)object2);
                if (n3 == n4) break;
                n3 += 2;
            }
        }
        b = new kgk((String[])object3);
        object3 = new klm();
        ((klm)object3).N(a);
        c = new kgw((klo)object3);
        khb.B(0L, 0L);
        kmp kmp2 = klx.a;
        object3 = new klp[5];
        object2 = klp.a;
        object3[0] = kmp.u("efbbbf");
        object3[1] = kmp.u("feff");
        object3[2] = kmp.u("fffe");
        object3[3] = kmp.u("0000ffff");
        object3[4] = kmp.u("ffff0000");
        object2 = jns.S((Object[])object3);
        jns.j((List)object2);
        n4 = object2.size();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            arrayList.add(-1);
        }
        n4 = 0;
        n3 = 0;
        while (n4 < 5) {
            object = object3[n4];
            n2 = object2.size();
            int n5 = object2.size();
            if (n2 >= 0) {
                if (n2 <= n5) {
                    block18: {
                        n5 = n2 - 1;
                        n2 = 0;
                        while (n2 <= n5) {
                            int n6 = n2 + n5 >>> 1;
                            int n7 = jjj.t((Comparable)object2.get(n6), (Comparable)object);
                            if (n7 < 0) {
                                n2 = n6 + 1;
                                continue;
                            }
                            n5 = n6;
                            if (n7 > 0) {
                                n5 = n6 - 1;
                                continue;
                            }
                            break block18;
                        }
                        n5 = -(n2 + 1);
                    }
                    arrayList.set(n5, n3);
                    ++n4;
                    ++n3;
                    continue;
                }
                object3 = new StringBuilder("toIndex (");
                ((StringBuilder)object3).append(n2);
                ((StringBuilder)object3).append(") is greater than size (");
                ((StringBuilder)object3).append(n5);
                ((StringBuilder)object3).append(").");
                throw new IndexOutOfBoundsException(((StringBuilder)object3).toString());
            }
            throw new IllegalArgumentException(a.ah(n2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (((klp)object2.get(0)).b() > 0) {
            n3 = 0;
            while (n3 < object2.size()) {
                klp klp2 = (klp)object2.get(n3);
                n2 = n4 = n3 + 1;
                while (n2 < object2.size() && ((klp)(object = (klp)object2.get(n2))).i(klp2)) {
                    if (((klp)object).b() != klp2.b()) {
                        if (((Number)arrayList.get(n2)).intValue() > ((Number)arrayList.get(n3)).intValue()) {
                            object2.remove(n2);
                            ((Number)arrayList.remove(n2)).intValue();
                            continue;
                        }
                        ++n2;
                        continue;
                    }
                    Objects.toString(object);
                    throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(object)));
                }
                n3 = n4;
            }
            object = new klm();
            kmp2.r(0L, (klm)object, 0, (List)object2, 0, object2.size(), arrayList);
            n4 = (int)kmp.s((klm)object);
            int[] nArray = new int[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                nArray[n3] = ((klm)object).f();
            }
            object3 = Arrays.copyOf(object3, 5);
            jse.d(object3, "copyOf(...)");
            object3 = (klp[])object3;
            object3 = DesugarTimeZone.getTimeZone("GMT");
            jse.b(object3);
            d = object3;
            f = new jtv("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            object3 = kgp.class.getName();
            jse.d(object3, "getName(...)");
            String string = jse.x((String)object3, "okhttp3.");
            jse.e(string, "<this>");
            jse.e(string, "<this>");
            boolean bl2 = string instanceof String ? jse.G(string, "Client") : jse.R(string, string.length() - "Client".length(), "Client", 0, "Client".length());
            object3 = string;
            if (bl2) {
                object3 = string.substring(0, string.length() - "Client".length());
                jse.d(object3, "substring(...)");
            }
            e = object3;
            return;
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static final int A(long l2, TimeUnit timeUnit) {
        long l3 = 0L;
        long l4 = l2 - 0L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l5 >= 0) {
            if (timeUnit != null) {
                if ((l2 = timeUnit.toMillis(l2)) <= Integer.MAX_VALUE) {
                    if (l2 == 0L) {
                        if (l5 <= 0) {
                            l2 = l3;
                        } else {
                            throw new IllegalArgumentException("timeout too small.");
                        }
                    }
                    return (int)l2;
                }
                throw new IllegalArgumentException("timeout too large.");
            }
            throw new IllegalStateException("unit == null");
        }
        throw new IllegalStateException("timeout < 0");
    }

    public static final void B(long l2, long l3) {
        if (l2 >= 0L && l2 >= l3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static /* synthetic */ int C(String string, char c2, int n2, int n3) {
        if ((n3 & 4) != 0) {
            n2 = string.length();
        }
        return khb.a(string, c2, 0, n2);
    }

    public static final boolean D(kmk kmk2, TimeUnit timeUnit) {
        boolean bl2;
        jse.e((Object)timeUnit, "timeUnit");
        try {
            bl2 = khb.x(kmk2, 100, timeUnit);
        }
        catch (IOException iOException) {
            bl2 = false;
        }
        return bl2;
    }

    public static final void E(Exception exception, List object) {
        jse.e(exception, "<this>");
        object = object.iterator();
        while (object.hasNext()) {
            jns.b(exception, (Exception)object.next());
        }
    }

    public static final int a(String string, char c2, int n2, int n3) {
        jse.e(string, "<this>");
        while (n2 < n3) {
            if (string.charAt(n2) == c2) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final int b(String string, String string2, int n2, int n3) {
        jse.e(string, "<this>");
        while (n2 < n3) {
            if (jse.E(string2, string.charAt(n2))) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final int c(String string) {
        jse.e(string, "<this>");
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (jse.a(c2, 31) > 0 && jse.a(c2, 127) < 0) {
                continue;
            }
            return i2;
        }
        return -1;
    }

    public static final int d(String string, int n2, int n3) {
        jse.e(string, "<this>");
        while (n2 < n3) {
            char c2 = string.charAt(n2);
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final int e(String string, int n2, int n3) {
        jse.e(string, "<this>");
        if (n2 <= --n3) {
            while (true) {
                char c2;
                if ((c2 = string.charAt(n3)) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    return n3 + 1;
                }
                if (n3 == n2) break;
                --n3;
            }
        }
        return n2;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            c2 = (char)(c2 - 48);
        } else if (c2 >= 'a' && c2 < 'g') {
            c2 = (char)(c2 - 87);
        } else {
            if (c2 >= 'A' && c2 < 'G') {
                return c2 - 55;
            }
            c2 = (char)-1;
        }
        return c2;
    }

    public static final int g(klo klo2) {
        jse.e(klo2, "<this>");
        int n2 = khb.z(klo2.d());
        int n3 = khb.z(klo2.d());
        return khb.z(klo2.d()) | (n2 << 16 | n3 << 8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int h(String string, int n2) {
        if (string == null) return n2;
        try {
            long l2 = Long.parseLong(string);
            if (l2 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (l2 >= 0L) return (int)l2;
            return 0;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final long i(kgv object) {
        long l2;
        object = ((kgv)object).f.b("Content-Length");
        long l3 = l2 = -1L;
        if (object == null) return l3;
        try {
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static final Object j(Object object, Class clazz, String string) {
        jse.e(object, "instance");
        jse.e(clazz, "fieldType");
        Class<?> clazz2 = object.getClass();
        while (true) {
            Object object2;
            Object var5_6;
            block5: {
                boolean bl2 = jse.i(clazz2, Object.class);
                var5_6 = null;
                if (bl2) break;
                try {
                    object2 = clazz2.getDeclaredField(string);
                    ((Field)object2).setAccessible(true);
                    object2 = ((Field)object2).get(object);
                    if (clazz.isInstance(object2)) break block5;
                    object = var5_6;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    clazz2 = clazz2.getSuperclass();
                    continue;
                }
            }
            var5_6 = clazz.cast(object2);
            object = var5_6;
            return object;
        }
        if (!jse.i(string, "delegate") && (object = khb.j(object, Object.class, "delegate")) != null) {
            return khb.j(object, clazz, string);
        }
        return null;
    }

    public static final String k(String string, Object ... objectArray) {
        int n2 = objectArray.length;
        Locale locale = Locale.US;
        objectArray = Arrays.copyOf(objectArray, n2);
        string = String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
        jse.d(string, "format(...)");
        return string;
    }

    public static final String l(kgm object, boolean bl2) {
        String string;
        if (jse.F(((kgm)object).c, ":")) {
            string = ((kgm)object).c;
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(string);
            stringBuilder.append("]");
            string = stringBuilder.toString();
        } else {
            string = ((kgm)object).c;
        }
        if (!bl2 && ((kgm)object).d == jvf.t(((kgm)object).b)) {
            return string;
        }
        int n2 = ((kgm)object).d;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n2);
        return ((StringBuilder)object).toString();
    }

    public static final String m(String string, int n2, int n3) {
        jse.e(string, "<this>");
        n2 = khb.d(string, n2, n3);
        string = string.substring(n2, khb.e(string, n2, n3));
        jse.d(string, "substring(...)");
        return string;
    }

    @SafeVarargs
    public static final List n(Object ... object) {
        jse.e(object, "elements");
        object = (Object[])object.clone();
        object = DesugarCollections.unmodifiableList(jns.f(Arrays.copyOf(object, ((Object[])object).length)));
        jse.d(object, "unmodifiableList(...)");
        return object;
    }

    public static final List o(List list) {
        jse.e(list, "<this>");
        list = DesugarCollections.unmodifiableList(jns.u(list));
        jse.d(list, "unmodifiableList(...)");
        return list;
    }

    public static final kgk p(List object) {
        jse.e(object, "<this>");
        bzo bzo2 = new bzo(null, null, null);
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2 = (kir)iterator.next();
            object = ((kir)object2).g;
            object2 = ((kir)object2).h;
            bzo2.ax(((klp)object).e(), ((klp)object2).e());
        }
        return bzo2.aw();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void q(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void r(Socket socket) {
        jse.e(socket, "<this>");
        try {
            socket.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            if (!jse.i(runtimeException.getMessage(), "bio == null")) throw runtimeException;
            return;
        }
        catch (AssertionError assertionError) {
            throw assertionError;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final boolean s(String string) {
        jse.e(string, "<this>");
        return f.b(string);
    }

    public static final boolean t(kgm kgm2, kgm kgm3) {
        return jse.i(kgm2.c, kgm3.c) && kgm2.d == kgm3.d && jse.i(kgm2.b, kgm3.b);
    }

    public static final boolean u(String[] stringArray, String[] stringArray2, Comparator comparator) {
        int n2 = stringArray.length;
        if (n2 != 0 && stringArray2 != null && stringArray2.length != 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                String string = stringArray[i2];
                Iterator iterator = jsd.b(stringArray2);
                while (iterator.hasNext()) {
                    if (comparator.compare(string, (String)iterator.next()) != 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean v(Socket socket, klo klo2) {
        boolean bl2;
        jse.e(socket, "<this>");
        jse.e(klo2, "source");
        boolean bl3 = true;
        int n2 = socket.getSoTimeout();
        try {
            socket.setSoTimeout(1);
            bl2 = klo2.y();
        }
        catch (Throwable throwable) {
            try {
                socket.setSoTimeout(n2);
                throw throwable;
            }
            catch (IOException iOException) {
                return false;
            }
            catch (SocketTimeoutException socketTimeoutException) {
                return bl3;
            }
        }
        socket.setSoTimeout(n2);
        return bl2 ^ true;
    }

    public static final boolean w(String string) {
        jse.e(string, "name");
        return jse.H(string, "Authorization") || jse.H(string, "Cookie") || jse.H(string, "Proxy-Authorization") || jse.H(string, "Set-Cookie");
        {
        }
    }

    public static final boolean x(kmk object, int n2, TimeUnit object2) {
        boolean bl2;
        jse.e(object2, "timeUnit");
        long l2 = System.nanoTime();
        long l3 = object.a().h() ? object.a().j() - l2 : Long.MAX_VALUE;
        object.a().m(Math.min(l3, ((TimeUnit)((Object)object2)).toNanos(n2)) + l2);
        try {
            object2 = new klm();
            while (object.b((klm)object2, 8192L) != -1L) {
                ((klm)object2).v();
            }
            bl2 = true;
        }
        catch (Throwable throwable) {
            object = object.a();
            if (l3 == Long.MAX_VALUE) {
                ((kmm)object).k();
            } else {
                ((kmm)object).m(l2 + l3);
            }
            throw throwable;
        }
        catch (InterruptedIOException interruptedIOException) {
            bl2 = false;
        }
        if (l3 == Long.MAX_VALUE) {
            object.a().k();
        } else {
            object.a().m(l2 + l3);
        }
        return bl2;
    }

    public static final String[] y(String[] stringArray, String[] stringArray2, Comparator comparator) {
        jse.e(stringArray, "<this>");
        jse.e(stringArray2, "other");
        ArrayList<String> arrayList = new ArrayList<String>();
        block0: for (String string : stringArray) {
            int n2 = stringArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (comparator.compare(string, stringArray2[i2]) != 0) continue;
                arrayList.add(string);
                continue block0;
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static final int z(byte by2) {
        return by2 & 0xFF;
    }
}

