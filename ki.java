/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.widget.EdgeEffect
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ki {
    public ki() {
    }

    public ki(qg qg2) {
        new WeakReference<qg>(qg2);
        px.o(qg2.J);
        px.o(qg2.K);
        px.o(qg2.L);
        px.o(qg2.M);
        px.o(qg2.N);
    }

    public ki(byte[] byArray) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(View view, float f2) {
        try {
            ki$$ExternalSyntheticApiModelOutline0.m(view, f2);
            return;
        }
        catch (LinkageError linkageError) {
            return;
        }
    }

    public static int c(ov ov2, int n2) {
        try {
            n2 = pd.a(ov2.a, ov2.c, n2);
            return n2;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new ConcurrentModificationException();
        }
    }

    public static int d(ov ov2, Object object, int n2) {
        int n3;
        int n4 = ov2.c;
        if (n4 == 0) {
            return -1;
        }
        int n5 = ki.c(ov2, n2);
        if (n5 < 0) {
            return n5;
        }
        if (jse.i(object, ov2.b[n5])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && ov2.a[n3] == n2; ++n3) {
            if (!jse.i(object, ov2.b[n3])) continue;
            return n3;
        }
        --n5;
        while (n5 >= 0 && ov2.a[n5] == n2) {
            if (jse.i(object, ov2.b[n5])) {
                return n5;
            }
            --n5;
        }
        return ~n3;
    }

    public static int e(ov ov2) {
        return ki.d(ov2, null, 0);
    }

    public static void f(ov ov2, int n2) {
        ov2.a = new int[n2];
        ov2.b = new Object[n2];
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(Context var0, int var1_3, SparseArray var2_4, SparseArray var3_5) {
        block22: {
            block21: {
                var9_6 = var0.getResources().getXml(var1_3);
                try {
                    var4_7 = var9_6.getEventType();
                    var8_8 = null;
lbl5:
                    // 2 sources

                    while (var4_7 != 1) {
                        if (var4_7 == 2) {
                            var10_12 = var9_6.getName();
                            var4_7 = var10_12.hashCode();
                            var6_10 = 0;
                            var5_9 = -1;
                            break block21;
                        }
                        ** GOTO lbl80
                    }
                    return;
                }
                catch (IOException var0_1) {
                    Log.e((String)"ConstraintLayoutStates", (String)a.af(var1_3, "Error parsing resource: "), (Throwable)var0_1);
                    return;
                }
                catch (XmlPullParserException var0_2) {
                    Log.e((String)"ConstraintLayoutStates", (String)a.af(var1_3, "Error parsing resource: "), (Throwable)var0_2);
                    return;
                }
            }
            switch (var4_7) {
                default: {
                    break;
                }
                case 1901439077: {
                    if (!var10_12.equals("Variant")) break;
                    var4_7 = 3;
                    break block22;
                }
                case 1657696882: {
                    if (!var10_12.equals("layoutDescription")) break;
                    var4_7 = 0;
                    break block22;
                }
                case 1382829617: {
                    if (!var10_12.equals("StateSet")) break;
                    var4_7 = 1;
                    break block22;
                }
                case 80204913: {
                    if (!var10_12.equals("State")) break;
                    var4_7 = 2;
                    break block22;
                }
                case -1349929691: {
                    if (!var10_12.equals("ConstraintSet")) break;
                    var4_7 = 4;
                    break block22;
                }
            }
            var4_7 = -1;
        }
        if (var4_7 == 2) ** GOTO lbl78
        if (var4_7 == 3) ** GOTO lbl-1000
        if (var4_7 != 4) ** GOTO lbl80
        {
            var11_13 = new ro();
            var7_11 = var9_6.getAttributeCount();
            for (var4_7 = var6_10; var4_7 < var7_11; ++var4_7) {
                var12_14 = var9_6.getAttributeName(var4_7);
                var10_12 = var9_6.getAttributeValue(var4_7);
                if (var12_14 == null || var10_12 == null || !"id".equals(var12_14)) continue;
                if (var10_12.contains("/")) {
                    var12_14 = var10_12.substring(var10_12.indexOf(47) + 1);
                    var4_7 = var0.getResources().getIdentifier(var12_14, "id", var0.getPackageName());
                } else {
                    var4_7 = -1;
                }
                if (var4_7 == -1) {
                    if (var10_12.length() > 1) {
                        var4_7 = Integer.parseInt(var10_12.substring(1));
                    } else {
                        Log.e((String)"ConstraintLayoutStates", (String)"error in parsing id");
                        var4_7 = var5_9;
                    }
                }
                var11_13.d(var0, (XmlPullParser)var9_6);
                var3_5.put(var4_7, (Object)var11_13);
                ** GOTO lbl80
            }
            ** GOTO lbl80
        }
lbl-1000:
        // 1 sources

        {
            block23: {
                var10_12 = new rh(var0, (XmlPullParser)var9_6);
                if (var8_8 != null) {
                    ((ArrayList)var8_8.b).add(var10_12);
                }
                break block23;
lbl78:
                // 1 sources

                var8_8 = new age(var0, (XmlPullParser)var9_6);
                var2_4.put(var8_8.a, (Object)var8_8);
            }
            var4_7 = var9_6.next();
            ** GOTO lbl5
        }
    }

    public static qz h(qg qg2, int n2, ArrayList arrayList, qz object) {
        qg qg3;
        Object object2;
        int n3;
        int n4;
        block17: {
            n4 = n2 == 0 ? qg2.ao : qg2.ap;
            if (n4 != -1 && (object == null || n4 != ((qz)object).c)) {
                n3 = 0;
                while (true) {
                    object2 = object;
                    if (n3 >= arrayList.size()) break block17;
                    object2 = (qz)arrayList.get(n3);
                    if (((qz)object2).c == n4) {
                        if (object != null) {
                            ((qz)object).c(n2, (qz)object2);
                            arrayList.remove(object);
                        }
                        break block17;
                    }
                    ++n3;
                }
            }
            object2 = object;
            if (n4 != -1) {
                return object;
            }
        }
        object = object2;
        if (object2 == null) {
            object = object2;
            if (qg2 instanceof qk) {
                block18: {
                    object = (qk)qg2;
                    for (n4 = 0; n4 < ((qk)object).as; ++n4) {
                        qg3 = ((qk)object).ar[n4];
                        if (n2 == 0) {
                            n3 = qg3.ao;
                            if (n3 == -1) continue;
                            n4 = n3;
                        } else {
                            n3 = qg3.ap;
                            if (n3 == -1) continue;
                            n4 = n3;
                        }
                        break block18;
                    }
                    n4 = -1;
                }
                object = object2;
                if (n4 != -1) {
                    n3 = 0;
                    while (true) {
                        object = object2;
                        if (n3 >= arrayList.size()) break;
                        object = (qz)arrayList.get(n3);
                        if (((qz)object).c == n4) break;
                        ++n3;
                    }
                }
            }
            object2 = object;
            if (object == null) {
                object2 = new qz(n2);
            }
            arrayList.add(object2);
            object = object2;
        }
        if (((qz)object).d(qg2)) {
            if (qg2 instanceof qj) {
                qg3 = (qj)qg2;
                object2 = qg3.d;
                n4 = qg3.ar == 0 ? 1 : 0;
                ((qf)object2).c(n4, arrayList, (qz)object);
            }
            if (n2 == 0) {
                qg2.ao = ((qz)object).c;
                qg2.J.c(0, arrayList, (qz)object);
                qg2.L.c(0, arrayList, (qz)object);
            } else {
                qg2.ap = ((qz)object).c;
                qg2.K.c(1, arrayList, (qz)object);
                qg2.N.c(1, arrayList, (qz)object);
                qg2.M.c(1, arrayList, (qz)object);
            }
            qg2.Q.c(n2, arrayList, (qz)object);
        }
        return object;
    }

    public static qz i(ArrayList arrayList, int n2) {
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            qz qz2 = (qz)arrayList.get(i2);
            if (n2 != qz2.c) continue;
            return qz2;
        }
        return null;
    }

    public static boolean j(int n2, int n3, int n4, int n5) {
        n2 = n4 != 1 && n4 != 2 && (n4 != 4 || n2 == 2) ? 0 : 1;
        n3 = n5 != 1 && n5 != 2 && (n5 != 4 || n3 == 2) ? 0 : 1;
        return n2 != 0 || n3 != 0;
        {
        }
    }

    public static int m(int n2) {
        for (int i2 = 0; i2 < 6; ++i2) {
            int n3 = (new int[]{1, 2, 3, 4, 5, 6})[i2];
            if (n3 != 0) {
                if (n3 - 1 != n2) continue;
                return n3;
            }
            throw null;
        }
        return 1;
    }

    public static int n(int n2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            int n3 = (new int[]{1, 2, 3})[i2];
            if (n3 != 0) {
                if (n3 - 1 != n2) continue;
                return n3;
            }
            throw null;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long o(byte[] byArray) {
        int n2 = byArray.length;
        long l2 = -7286425919675154353L;
        byte by2 = 0;
        if (n2 <= 32) {
            if (n2 <= 16) {
                if (n2 >= 8) {
                    long l3 = (long)(n2 + n2) - 7286425919675154353L;
                    long l4 = ki.r(byArray, 0) - 7286425919675154353L;
                    l2 = ki.r(byArray, n2 - 8);
                    return ki.q(Long.rotateRight(l2, 37) * l3 + l4, (Long.rotateRight(l4, 25) + l2) * l3, l3);
                }
                if (n2 >= 4) {
                    long l5 = n2 + n2;
                    l2 = ki.p(byArray, 0);
                    long l6 = ki.p(byArray, n2 - 4);
                    return ki.q((long)n2 + ((l2 & 0xFFFFFFFFL) << 3), l6 & 0xFFFFFFFFL, l5 - 7286425919675154353L);
                }
                if (n2 <= 0) return l2;
                byte by3 = byArray[0];
                byte by4 = byArray[n2 >> 1];
                by2 = byArray[n2 - 1];
                return -7286425919675154353L * ki.s((long)((by3 & 0xFF) + ((by4 & 0xFF) << 8)) * -7286425919675154353L ^ (long)(n2 + ((by2 & 0xFF) << 2)) * -4348849565147123417L);
            }
            l2 = ki.r(byArray, 0) * -5435081209227447693L;
            long l7 = ki.r(byArray, 8);
            long l8 = ki.r(byArray, n2 - 8);
            long l9 = (long)(n2 + n2) - 7286425919675154353L;
            long l10 = l8 * l9;
            l8 = ki.r(byArray, n2 - 16);
            return ki.q(Long.rotateRight(l2 + l7, 43) + Long.rotateRight(l10, 30) + l8 * -7286425919675154353L, l2 + Long.rotateRight(l7 - 7286425919675154353L, 18) + l10, l9);
        }
        if (n2 <= 64) {
            l2 = ki.r(byArray, 0) * -7286425919675154353L;
            long l11 = ki.r(byArray, 8);
            long l12 = ki.r(byArray, n2 - 8);
            long l13 = (long)(n2 + n2) - 7286425919675154353L;
            long l14 = l12 * l13;
            long l15 = ki.r(byArray, n2 - 16);
            long l16 = Long.rotateRight(l2 + l11, 43);
            long l17 = Long.rotateRight(l14, 30);
            long l18 = Long.rotateRight(l11 - 7286425919675154353L, 18);
            l12 = ki.r(byArray, 16) * l13;
            l11 = ki.r(byArray, 24);
            long l19 = ki.r(byArray, n2 - 32);
            l15 = l16 + l17 + l15 * -7286425919675154353L;
            l16 = ki.r(byArray, n2 - 24);
            l14 = ki.q(l15, l18 + l2 + l14, l13);
            l18 = Long.rotateRight(l12 + l11, 43);
            l19 = (l15 + l19) * l13;
            return ki.q(l18 + Long.rotateRight(l19, 30) + (l14 + l16) * l13, l12 + Long.rotateRight(l11 + l2, 18) + l19, l13);
        }
        long[] lArray = new long[2];
        long[] lArray2 = new long[2];
        long l20 = ki.r(byArray, 0) + 95310865018149119L;
        l2 = ki.s(-7956866745689871395L) * -7286425919675154353L;
        long l21 = 2480279821605975764L;
        int n3 = 0;
        while (true) {
            int n4 = n2 - 1;
            int n5 = (n4 >> 6) * 64;
            l20 = Long.rotateRight(l20 + l21 + lArray[by2] + ki.r(byArray, n3 + 8), 37);
            long l22 = Long.rotateRight(l21 + lArray[1] + ki.r(byArray, n3 + 48), 42);
            l21 = l20 * -5435081209227447693L ^ lArray2[1];
            long l23 = lArray[by2];
            long l24 = ki.r(byArray, n3 + 40);
            l20 = Long.rotateRight(l2 + lArray2[by2], 33) * -5435081209227447693L;
            ki.t(byArray, n3, lArray[1] * -5435081209227447693L, l21 + lArray2[by2], lArray);
            l2 = lArray2[1];
            long l25 = ki.r(byArray, n3 + 16);
            l22 = l22 * -5435081209227447693L + (l23 + l24);
            ki.t(byArray, n3 + 32, l20 + l2, l25 + l22, lArray2);
            if ((n3 += 64) == n5) {
                n3 = n4 & 0x3F;
                n2 = n5 + n3;
                l2 = l21 & 0xFFL;
                l2 = l2 + l2 - 5435081209227447693L;
                l23 = lArray2[by2] + (long)n3;
                lArray[by2] = l24 = lArray[by2] + l23;
                lArray2[by2] = l23 + l24;
                l20 = Long.rotateRight(l20 + l22 + l24 + ki.r(byArray, n2 - 55), 37);
                l23 = Long.rotateRight(l22 + lArray[1] + ki.r(byArray, n2 - 15), 42);
                long l26 = lArray2[1];
                l24 = lArray[by2];
                l22 = ki.r(byArray, n2 - 23);
                l21 = Long.rotateRight(l21 + lArray2[by2], 33) * l2;
                long l27 = lArray[1];
                l25 = lArray2[by2];
                l20 = l20 * l2 ^ l26 * 9L;
                ki.t(byArray, n2 - 63, l27 * l2, l20 + l25, lArray);
                l26 = lArray2[1];
                l25 = ki.r(byArray, n2 - 47);
                l22 = l23 * l2 + (l24 * 9L + l22);
                ki.t(byArray, n2 - 31, l26 + l21, l22 + l25, lArray2);
                l23 = ki.q(lArray[by2], lArray2[by2], l2);
                l24 = ki.q(lArray[1], lArray2[1], l2);
                return ki.q(l23 + ki.s(l22) * -4348849565147123417L + l20, l24 + l21, l2);
            }
            l2 = l21;
            l21 = l22;
        }
    }

    private static int p(byte[] byArray, int n2) {
        byte by2 = byArray[n2];
        byte by3 = byArray[n2 + 1];
        byte by4 = byArray[n2 + 2];
        return (byArray[n2 + 3] & 0xFF) << 24 | ((by3 & 0xFF) << 8 | by2 & 0xFF | (by4 & 0xFF) << 16);
    }

    private static long q(long l2, long l3, long l4) {
        l2 = (l2 ^ l3) * l4;
        l2 = (l2 ^ l2 >>> 47 ^ l3) * l4;
        return (l2 ^ l2 >>> 47) * l4;
    }

    private static long r(byte[] object, int n2) {
        object = ByteBuffer.wrap((byte[])object, n2, 8);
        ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
        return ((ByteBuffer)object).getLong();
    }

    private static long s(long l2) {
        return l2 ^ l2 >>> 47;
    }

    private static void t(byte[] byArray, int n2, long l2, long l3, long[] lArray) {
        long l4 = l2 + ki.r(byArray, n2);
        long l5 = ki.r(byArray, n2 + 8);
        long l6 = ki.r(byArray, n2 + 16);
        l2 = ki.r(byArray, n2 + 24);
        l6 = l5 + l4 + l6;
        l3 = Long.rotateRight(l3 + l4 + l2, 21);
        l5 = Long.rotateRight(l6, 44);
        lArray[0] = l6 + l2;
        lArray[1] = l3 + l5 + l4;
    }

    public EdgeEffect b(RecyclerView recyclerView) {
        throw null;
    }

    @Deprecated
    public ccp k(Context context, Looper looper, cfe cfe2, Object object, cct cct2, ccu ccu2) {
        return this.l(context, looper, cfe2, object, cct2, ccu2);
    }

    public ccp l(Context context, Looper looper, cfe cfe2, Object object, cdr cdr2, cel cel2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

