/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.util.Log
 *  android.util.StatsEvent
 *  android.util.StatsEvent$Builder
 *  android.util.StatsLog
 */
import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;

public class jjj {
    public static Context c;

    public jjj() {
    }

    public jjj(short[] sArray) {
    }

    public static boolean A(Object[] objectArray, int n2, int n3, List list) {
        if (n3 == list.size()) {
            for (int i2 = 0; i2 < n3; ++i2) {
                if (jse.i(objectArray[n2 + i2], list.get(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static Object[] B(Object[] objectArray, int n2) {
        jse.e(objectArray, "<this>");
        objectArray = Arrays.copyOf(objectArray, n2);
        jse.d(objectArray, "copyOf(...)");
        return objectArray;
    }

    public static Set C(Set set) {
        ((jpu)set).b.e();
        if (((jow)set).a() > 0) {
            return set;
        }
        return jpu.a;
    }

    public static Set D(Object set) {
        set = Collections.singleton(set);
        jse.d(set, "singleton(...)");
        return set;
    }

    public static int E(int n2) {
        int n3 = n2;
        if (n2 >= 0) {
            n3 = n2 < 3 ? n2 + 1 : (n2 >= 0x40000000 ? Integer.MAX_VALUE : (int)((float)n2 / 0.75f + 1.0f));
        }
        return n3;
    }

    public static Map F(joc object) {
        jse.e(object, "pair");
        object = Collections.singletonMap(((joc)object).a, ((joc)object).b);
        jse.d(object, "singletonMap(...)");
        return object;
    }

    public static Object G(Map object, Object object2) {
        jse.e(object, "<this>");
        jse.e(object, "<this>");
        if (object instanceof jpg) {
            object = ((jpg)object).a();
        } else {
            Object v2 = object.get(object2);
            if (v2 == null && !object.containsKey(object2)) {
                throw new NoSuchElementException(a.ak(object2, "Key ", " is missing in the map."));
            }
            object = v2;
        }
        return object;
    }

    public static Map H() {
        return jpb.a;
    }

    public static Map I(Map linkedHashMap, Map map) {
        jse.e(linkedHashMap, "<this>");
        jse.e(map, "map");
        linkedHashMap = new LinkedHashMap(linkedHashMap);
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    public static Map J(Iterable serializable) {
        int n2 = serializable.size();
        if (n2 != 0) {
            if (n2 != 1) {
                LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(jjj.E(serializable.size()));
                Iterator iterator = serializable.iterator();
                while (true) {
                    serializable = linkedHashMap;
                    if (iterator.hasNext()) {
                        serializable = (joc)iterator.next();
                        linkedHashMap.put(((joc)serializable).a, ((joc)serializable).b);
                        continue;
                    }
                    break;
                }
            } else {
                serializable = jjj.F((joc)serializable.get(0));
            }
        } else {
            serializable = jpb.a;
        }
        return serializable;
    }

    public static Map K(Map map) {
        int n2 = map.size();
        if (n2 != 0) {
            if (n2 != 1) {
                map = jjj.L(map);
            } else {
                map = map.entrySet().iterator().next();
                map = Collections.singletonMap(map.getKey(), map.getValue());
                jse.d(map, "with(...)");
            }
        } else {
            map = jpb.a;
        }
        return map;
    }

    public static Map L(Map map) {
        jse.e(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static void M(long l2, String string) {
        if (l2 >= 0L) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static boolean N(double d2, int n2, int n3) {
        return d2 >= (double)n2 && d2 < (double)n3;
    }

    public static int O(int n2) {
        return n2 - 1;
    }

    public static int P(Boolean bl2) {
        if (bl2 == null) {
            return 1;
        }
        if (bl2.booleanValue()) {
            return 2;
        }
        return 3;
    }

    public static void Q(long l2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        StatsEvent.Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(762);
        builder.writeLong(l2);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeInt(n6);
        builder.writeInt(n7);
        builder.writeInt(n8);
        builder.writeInt(n9);
        builder.writeInt(n10);
        builder.writeInt(n11);
        builder.writeInt(n12);
        builder.writeInt(n13);
        builder.writeInt(n14);
        builder.addBooleanAnnotation((byte)1, true);
        builder.usePooledBuffer();
        StatsLog.write((StatsEvent)builder.build());
    }

    public static void R(long l2, int n2, int n3, int n4, int n5, int n6, long l3, int n7, int n8, boolean bl2, boolean bl3, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        StatsEvent.Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(704);
        builder.writeLong(l2);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeInt(n6);
        builder.writeLong(l3);
        builder.writeInt(n7);
        builder.writeInt(n8);
        builder.writeBoolean(bl2);
        builder.writeBoolean(bl3);
        builder.writeInt(n9);
        builder.writeInt(n10);
        builder.writeInt(n11);
        builder.writeLong(-1L);
        builder.writeLong(-1L);
        builder.writeInt(n12);
        builder.writeInt(n13);
        builder.writeInt(n14);
        builder.writeInt(n15);
        builder.usePooledBuffer();
        StatsLog.write((StatsEvent)builder.build());
    }

    public static void S(long l2, int n2, int n3, int n4, int n5, int n6, boolean bl2, boolean bl3, int n7, boolean bl4, boolean bl5, boolean bl6, int n8, String string, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28, int n29, long l3) {
        StatsEvent.Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(703);
        builder.writeLong(l2);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeInt(n6);
        builder.writeBoolean(bl2);
        builder.writeBoolean(bl3);
        builder.writeInt(n7);
        builder.writeBoolean(bl4);
        builder.writeBoolean(bl5);
        builder.writeBoolean(bl6);
        builder.writeInt(n8);
        builder.writeString(string);
        builder.writeInt(n9);
        builder.writeInt(n10);
        builder.writeInt(n11);
        builder.writeInt(n12);
        builder.writeInt(n13);
        builder.writeInt(n14);
        builder.writeInt(n15);
        builder.writeInt(n16);
        builder.writeInt(n17);
        builder.writeInt(n18);
        builder.writeInt(n19);
        builder.writeInt(n20);
        builder.writeInt(n21);
        builder.writeInt(n22);
        builder.writeInt(n23);
        builder.writeInt(n24);
        builder.writeInt(n25);
        builder.writeInt(n26);
        builder.writeInt(n27);
        builder.writeInt(n28);
        builder.writeInt(n29);
        builder.writeLong(l3);
        builder.usePooledBuffer();
        StatsLog.write((StatsEvent)builder.build());
    }

    public static void T(long l2, int n2, int n3, int n4, int n5, long[] lArray, long[] lArray2) {
        StatsEvent.Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(764);
        builder.writeLong(l2);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeLongArray(lArray);
        builder.writeLongArray(lArray2);
        builder.usePooledBuffer();
        StatsLog.write((StatsEvent)builder.build());
    }

    public static void U(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return;
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    public static void V(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }

    public static long W(Map object) {
        long l2 = 0L;
        if (object == null) {
            return 0L;
        }
        block0: for (Map.Entry entry : object.entrySet()) {
            String string = (String)entry.getKey();
            long l3 = l2;
            if (string != null) {
                l3 = l2 + (long)string.length();
            }
            if (entry.getValue() == null) {
                l2 = l3;
                continue;
            }
            Iterator iterator = ((List)entry.getValue()).iterator();
            while (true) {
                l2 = l3;
                if (!iterator.hasNext()) continue block0;
                l3 += (long)((String)iterator.next()).length();
            }
        }
        return l2;
    }

    public static int X(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static String Y() {
        return (String)N.M6xubM8G();
    }

    public static /* synthetic */ String Z(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return "BYTES";
                    }
                    return "STRING";
                }
                return "FLOAT";
            }
            return "INT";
        }
        return "BOOL";
    }

    public static Set a(Map object, String object2) {
        if ((object = jew.f((Map)object, (String)object2)) == null) {
            return null;
        }
        object2 = EnumSet.noneOf(iye.class);
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object3;
            block9: {
                block8: {
                    block7: {
                        object3 = iterator.next();
                        if (!(object3 instanceof Double)) break block7;
                        Double d2 = (Double)object3;
                        int n2 = d2.intValue();
                        double d3 = n2;
                        double d4 = d2;
                        boolean bl2 = true;
                        boolean bl3 = d3 == d4;
                        fvd.an(bl3, "Status code %s is not integral", object3);
                        object = iyh.b((int)n2).n;
                        bl3 = ((iye)((Object)object)).r == d2.intValue() ? bl2 : false;
                        fvd.an(bl3, "Status code %s is not valid", object3);
                        break block8;
                    }
                    if (!(object3 instanceof String)) break block9;
                    try {
                        object = Enum.valueOf(iye.class, (String)object3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new guq(a.av(object3, "Status code ", " is not valid"), illegalArgumentException);
                    }
                }
                ((AbstractCollection)object2).add(object);
                continue;
            }
            object = String.valueOf(object3);
            object2 = String.valueOf(object3.getClass());
            object3 = new StringBuilder("Can not convert status code ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" to Status.Code, because its type is ");
            ((StringBuilder)object3).append((String)object2);
            throw new guq(((StringBuilder)object3).toString());
        }
        return DesugarCollections.unmodifiableSet(object2);
    }

    public static /* synthetic */ String aa(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return "VALUE_NOT_SET";
                        }
                        return "BYTES_VALUE";
                    }
                    return "STRING_VALUE";
                }
                return "FLOAT_VALUE";
            }
            return "INT_VALUE";
        }
        return "BOOL_VALUE";
    }

    public static Context ab(Context context, String string) {
        kne kne2 = kne.a();
        try {
            context = ag$$ExternalSyntheticApiModelOutline0.m(context, string);
            return context;
        }
        finally {
            kne2.close();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void ac(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void ad(String object, String string, Object ... objectArray) {
        if (Log.isLoggable((String)object, (int)3)) {
            Object object2;
            int n2 = objectArray.length;
            object = null;
            if (n2 != 0 && (object2 = objectArray[0]) instanceof Throwable) {
                object = (Throwable)object2;
            }
            if (object == null && n2 > 0) {
                String.format(Locale.US, string, objectArray);
            }
        }
    }

    public static Intent ae(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return jjj.ag(context, broadcastReceiver, intentFilter, 0);
    }

    public static boolean af() {
        if (Build.VERSION.SDK_INT >= 33) {
            return a$$ExternalSyntheticApiModelOutline0.m();
        }
        return false;
    }

    public static Intent ag(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n2) {
        return ag$$ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, null, null, n2);
    }

    public static PasswordAuthentication b(String string, InetAddress inetAddress, int n2) {
        URL uRL;
        try {
            uRL = new URL("https", string, n2, "");
        }
        catch (MalformedURLException malformedURLException) {
            jhf.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", string});
            uRL = null;
        }
        return Authenticator.requestPasswordAuthentication(string, inetAddress, n2, "https", "", null, uRL, Authenticator.RequestorType.PROXY);
    }

    public static int c(String[] stringArray) {
        return stringArray.length >> 1;
    }

    public static String d(int n2, String[] stringArray) {
        if ((n2 += n2) >= 0 && n2 < stringArray.length) {
            return stringArray[n2];
        }
        return null;
    }

    public static String e(int n2, String[] stringArray) {
        if ((n2 = n2 + n2 + 1) >= 0 && n2 < stringArray.length) {
            return stringArray[n2];
        }
        return null;
    }

    public static /* synthetic */ String f(int n2) {
        if (n2 != 1) {
            return "OUTBOUND";
        }
        return "INBOUND";
    }

    public static jez g() {
        if (jhl.a == null) {
            return new jhl();
        }
        return new jbo();
    }

    public static int h(Parcel parcel, iyh object) {
        int n2;
        int n3 = ((iyh)object).n.r;
        String string = ((iyh)object).o;
        object = string;
        if (string != null) {
            object = string;
            if (string.length() > 1000) {
                object = string.substring(0, 1000);
            }
        }
        n3 = n2 = n3 << 16;
        if (object != null) {
            n3 = n2 | 0x20;
            parcel.writeString((String)object);
        }
        return n3;
    }

    public static iyh i(int n2, Parcel parcel) {
        iyh iyh2 = iyh.b(n2 >> 16 & 0xFF);
        if ((n2 & 0x20) != 0) {
            return iyh2.e(parcel.readString());
        }
        return iyh2;
    }

    public static void j(Parcel parcel, int n2) {
        int n3 = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(n2);
        parcel.setDataPosition(n3);
    }

    public static boolean k(int n2, int n3) {
        return (n2 & n3) != 0;
    }

    public static Object l(jro jro2, Object object, jqb jqb2) {
        jse.e(jro2, "<this>");
        jqf jqf2 = jqb2.d();
        jqb2 = jqf2 == jqg.a ? new jqk(jqb2) : new jql(jqb2, jqf2);
        jsl.c(jro2, 2);
        return jro2.b(object, jqb2);
    }

    public static jqb m(jro object, Object object2, jqb jqb2) {
        jqf jqf2;
        object = object instanceof jqm ? ((jqm)object).c(object2, jqb2) : ((jqf2 = jqb2.d()) == jqg.a ? new jqi(jqb2, (jro)object, object2) : new jqj(jqb2, jqf2, (jro)object, object2));
        return object;
    }

    public static jqb n(jqb object) {
        jse.e(object, "<this>");
        jqo jqo2 = object instanceof jqo ? (jqo)object : null;
        if (jqo2 != null) {
            jqb jqb2 = jqo2.l;
            object = jqb2;
            if (jqb2 == null) {
                object = (jqc)jqo2.d().get(jqc.b);
                object = object != null ? object.bs(jqo2) : jqo2;
                jqo2.l = object;
            }
        }
        return object;
    }

    public static Object o(jqd jqd2, Object object, jro jro2) {
        jse.e(jro2, "operation");
        return jro2.b(object, jqd2);
    }

    public static jqd p(jqd jqd2, jqe jqe2) {
        jse.e(jqe2, "key");
        if (jse.i(jqd2.getKey(), jqe2)) {
            return jqd2;
        }
        return null;
    }

    public static jqf q(jqd jqd2, jqe jqe2) {
        jse.e(jqe2, "key");
        jqf jqf2 = jqd2;
        if (jse.i(jqd2.getKey(), jqe2)) {
            jqf2 = jqg.a;
        }
        return jqf2;
    }

    public static jqf r(jqd jqd2, jqf jqf2) {
        jse.e(jqf2, "context");
        return jjj.s(jqd2, jqf2);
    }

    public static jqf s(jqf jqf2, jqf jqf3) {
        jse.e(jqf3, "context");
        if (jqf3 == jqg.a) {
            return jqf2;
        }
        return (jqf)jqf3.fold(jqf2, ghk.d);
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int u(int n2) {
        return Integer.highestOneBit(jse.k(n2, 1) * 3);
    }

    public static int v(int n2) {
        return Integer.numberOfLeadingZeros(n2) + 1;
    }

    public static int w(Object[] objectArray, int n2, int n3) {
        int n4 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object = objectArray[n2 + i2];
            int n5 = object != null ? object.hashCode() : 0;
            n4 = n4 * 31 + n5;
        }
        return n4;
    }

    public static String x(Object[] objectArray, int n2, int n3, Collection collection) {
        StringBuilder stringBuilder = new StringBuilder(n3 * 3 + 2);
        stringBuilder.append("[");
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = objectArray[n2 + i2]) == collection) {
                stringBuilder.append("(this Collection)");
                continue;
            }
            stringBuilder.append(object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void y(Object[] objectArray, int n2) {
        jse.e(objectArray, "<this>");
        objectArray[n2] = null;
    }

    public static void z(Object[] objectArray, int n2, int n3) {
        jse.e(objectArray, "<this>");
        while (n2 < n3) {
            jjj.y(objectArray, n2);
            ++n2;
        }
    }
}

