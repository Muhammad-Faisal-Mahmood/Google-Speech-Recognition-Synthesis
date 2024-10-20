/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class hyi
implements hyu {
    public static final int[] a = new int[0];
    public static final Unsafe b = hzj.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final hyf g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final hzd m;

    public hyi(int[] nArray, Object[] objectArray, int n2, int n3, hyf hyf2, int[] nArray2, int n4, int n5, hzd hzd2, idi idi2) {
        boolean bl2;
        this.c = nArray;
        this.d = objectArray;
        this.e = n2;
        this.f = n3;
        this.i = hyf2 instanceof hwv;
        boolean bl3 = bl2 = false;
        if (idi2 != null) {
            bl3 = bl2;
            if (hyf2 instanceof hws) {
                bl3 = true;
            }
        }
        this.h = bl3;
        this.j = nArray2;
        this.k = n4;
        this.l = n5;
        this.m = hzd2;
        this.g = hyf2;
    }

    private final Object A(Object object, int n2, Object object2, hzd hzd2, Object object3) {
        int n3 = this.p(n2);
        if ((object = hzj.h(object, hyi.w(this.v(n2)))) == null) {
            return object2;
        }
        hwz hwz2 = this.y(n2);
        if (hwz2 == null) {
            return object2;
        }
        object = (hya)object;
        gpm gpm2 = idi.z(this.B(n2));
        Iterator iterator = object.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (hwz2.a((Integer)entry.getValue())) continue;
            object = object2;
            if (object2 == null) {
                object = hzd2.b(object3);
            }
            n2 = dlm.M(gpm2, entry.getKey(), entry.getValue());
            object2 = hvu.b;
            object2 = new byte[n2];
            hwd hwd2 = hwd.ag((byte[])object2);
            try {
                dlm.N(hwd2, gpm2, entry.getKey(), entry.getValue());
                hzd2.c(object, n3, idi.w(hwd2, (byte[])object2));
                iterator.remove();
                object2 = object;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return object2;
    }

    private final Object B(int n2) {
        return this.d[(n2 /= 3) + n2];
    }

    private final Object C(Object object, int n2) {
        hyu hyu2 = this.z(n2);
        long l2 = hyi.w(this.v(n2));
        if (!this.N(object, n2)) {
            return hyu2.e();
        }
        Object object2 = b.getObject(object, l2);
        if (hyi.Q(object2)) {
            return object2;
        }
        object = hyu2.e();
        if (object2 != null) {
            hyu2.h(object, object2);
        }
        return object;
    }

    private final Object D(Object object, int n2, int n3) {
        hyu hyu2 = this.z(n3);
        if (!this.R(object, n2, n3)) {
            return hyu2.e();
        }
        if (hyi.Q(object = b.getObject(object, hyi.w(this.v(n3))))) {
            return object;
        }
        Object object2 = hyu2.e();
        if (object != null) {
            hyu2.h(object2, object);
        }
        return object2;
    }

    private static void E(Object object) {
        if (hyi.Q(object)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(object))));
    }

    private final void F(Object object, Object object2, int n2) {
        if (!this.N(object2, n2)) {
            return;
        }
        Unsafe unsafe = b;
        long l2 = hyi.w(this.v(n2));
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            Object object4;
            hyu hyu2 = this.z(n2);
            if (!this.N(object, n2)) {
                if (!hyi.Q(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = hyu2.e();
                    hyu2.h(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.H(object, n2);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l2);
            if (!hyi.Q(object4)) {
                object2 = hyu2.e();
                hyu2.h(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            hyu2.h(object2, object3);
            return;
        }
        n2 = this.p(n2);
        object = object2.toString();
        object2 = new StringBuilder("Source subfield ");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(" is present but null: ");
        ((StringBuilder)object2).append((String)object);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    private final void G(Object object, Object object2, int n2) {
        int n3 = this.p(n2);
        if (!this.R(object2, n3, n2)) {
            return;
        }
        Unsafe unsafe = b;
        long l2 = hyi.w(this.v(n2));
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            Object object4;
            hyu hyu2 = this.z(n2);
            if (!this.R(object, n3, n2)) {
                if (!hyi.Q(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = hyu2.e();
                    hyu2.h(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.I(object, n3, n2);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l2);
            if (!hyi.Q(object4)) {
                object2 = hyu2.e();
                hyu2.h(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            hyu2.h(object2, object3);
            return;
        }
        n2 = this.p(n2);
        object = object2.toString();
        object2 = new StringBuilder("Source subfield ");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(" is present but null: ");
        ((StringBuilder)object2).append((String)object);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    private final void H(Object object, int n2) {
        long l2 = 0xFFFFF & (n2 = this.s(n2));
        if (l2 == 1048575L) {
            return;
        }
        hzj.s(object, l2, 1 << (n2 >>> 20) | hzj.d(object, l2));
    }

    private final void I(Object object, int n2, int n3) {
        hzj.s(object, this.s(n3) & 0xFFFFF, n2);
    }

    private final void J(Object object, int n2, Object object2) {
        b.putObject(object, hyi.w(this.v(n2)), object2);
        this.H(object, n2);
    }

    private final void K(Object object, int n2, int n3, Object object2) {
        b.putObject(object, hyi.w(this.v(n3)), object2);
        this.I(object, n2, n3);
    }

    private final boolean L(Object object, Object object2, int n2) {
        return this.N(object, n2) == this.N(object2, n2);
    }

    private static boolean M(int n2) {
        return (n2 & 0x20000000) != 0;
    }

    private final boolean N(Object object, int n2) {
        int n3 = this.s(n2);
        long l2 = 0xFFFFF & n3;
        if (l2 == 1048575L) {
            n2 = this.v(n2);
            l2 = hyi.w(n2);
            switch (hyi.u(n2)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    return hzj.h(object, l2) != null;
                }
                case 16: {
                    return hzj.f(object, l2) != 0L;
                }
                case 15: {
                    return hzj.d(object, l2) != 0;
                }
                case 14: {
                    return hzj.f(object, l2) != 0L;
                }
                case 13: {
                    return hzj.d(object, l2) != 0;
                }
                case 12: {
                    return hzj.d(object, l2) != 0;
                }
                case 11: {
                    return hzj.d(object, l2) != 0;
                }
                case 10: {
                    return !hvu.b.equals(hzj.h(object, l2));
                }
                case 9: {
                    return hzj.h(object, l2) != null;
                }
                case 8: {
                    object = hzj.h(object, l2);
                    if (object instanceof String) {
                        return !((String)object).isEmpty();
                    }
                    if (object instanceof hvu) {
                        return !hvu.b.equals(object);
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return hzj.w(object, l2);
                }
                case 6: {
                    return hzj.d(object, l2) != 0;
                }
                case 5: {
                    return hzj.f(object, l2) != 0L;
                }
                case 4: {
                    return hzj.d(object, l2) != 0;
                }
                case 3: {
                    return hzj.f(object, l2) != 0L;
                }
                case 2: {
                    return hzj.f(object, l2) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(hzj.c(object, l2)) != 0;
                }
                case 0: 
            }
            return Double.doubleToRawLongBits(hzj.b(object, l2)) != 0L;
        }
        return (hzj.d(object, l2) & 1 << (n3 >>> 20)) != 0;
    }

    private final boolean O(Object object, int n2, int n3, int n4, int n5) {
        if (n3 == 1048575) {
            return this.N(object, n2);
        }
        return (n4 & n5) != 0;
    }

    private static boolean P(Object object, int n2, hyu hyu2) {
        return hyu2.k(hzj.h(object, hyi.w(n2)));
    }

    private static boolean Q(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof hwv) {
            return ((hwv)object).B();
        }
        return true;
    }

    private final boolean R(Object object, int n2, int n3) {
        return hzj.d(object, this.s(n3) & 0xFFFFF) == n2;
    }

    private static boolean S(Object object, long l2) {
        return (Boolean)hzj.h(object, l2);
    }

    private final void T(Object object, int n2, hvz hvz2) {
        if (hyi.M(n2)) {
            hzj.u(object, hyi.w(n2), hvz2.v());
            return;
        }
        if (this.i) {
            hzj.u(object, hyi.w(n2), hvz2.u());
            return;
        }
        hzj.u(object, hyi.w(n2), hvz2.o());
    }

    private static final int U(byte[] byArray, int n2, int n3, hzm hzm2, Class clazz, hvj hvj2) {
        hzm hzm3 = hzm.a;
        switch (hzm2.ordinal()) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                n2 = hvk.w(byArray, n2, hvj2);
                hvj2.c = hvy.J(hvj2.b);
                break;
            }
            case 16: {
                n2 = hvk.t(byArray, n2, hvj2);
                hvj2.c = hvy.H(hvj2.a);
                break;
            }
            case 11: {
                n2 = hvk.c(byArray, n2, hvj2);
                break;
            }
            case 10: {
                n2 = hvk.f(hyo.a.a(clazz), byArray, n2, n3, hvj2);
                break;
            }
            case 8: {
                n2 = hvk.r(byArray, n2, hvj2);
                break;
            }
            case 7: {
                n2 = hvk.w(byArray, n2, hvj2);
                boolean bl2 = hvj2.b != 0L;
                hvj2.c = bl2;
                break;
            }
            case 6: 
            case 14: {
                n3 = n2 + 4;
                hvj2.c = hvk.d(byArray, n2);
                n2 = n3;
                break;
            }
            case 5: 
            case 15: {
                n3 = n2 + 8;
                hvj2.c = hvk.A(byArray, n2);
                n2 = n3;
                break;
            }
            case 4: 
            case 12: 
            case 13: {
                n2 = hvk.t(byArray, n2, hvj2);
                hvj2.c = hvj2.a;
                break;
            }
            case 2: 
            case 3: {
                n2 = hvk.w(byArray, n2, hvj2);
                hvj2.c = hvj2.b;
                break;
            }
            case 1: {
                n3 = n2 + 4;
                hvj2.c = Float.valueOf(hvk.b(byArray, n2));
                n2 = n3;
                break;
            }
            case 0: {
                n3 = n2 + 8;
                hvj2.c = hvk.a(byArray, n2);
                n2 = n3;
            }
        }
        return n2;
    }

    private static final void V(int n2, Object object, dlm dlm2) {
        if (object instanceof String) {
            dlm2.J(n2, (String)object);
            return;
        }
        dlm2.u(n2, (hvu)object);
    }

    static hze d(Object object) {
        hwv hwv2 = (hwv)object;
        hze hze2 = hwv2.unknownFields;
        object = hze2;
        if (hze2 == hze.a) {
            hwv2.unknownFields = object = new hze();
        }
        return object;
    }

    public static Field f(Class object, String string) {
        try {
            Field field = ((Class)object).getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object object2;
            Object object3 = ((Class)object).getDeclaredFields();
            int n2 = ((Field[])object3).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = object3[i2];
                if (!string.equals(((Field)object2).getName())) continue;
                return object2;
            }
            object = ((Class)object).getName();
            object2 = Arrays.toString((Object[])object3);
            object3 = new StringBuilder("Field ");
            ((StringBuilder)object3).append(string);
            ((StringBuilder)object3).append(" for ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" not found. Known fields are ");
            ((StringBuilder)object3).append((String)object2);
            throw new RuntimeException(((StringBuilder)object3).toString());
        }
    }

    private static double n(Object object, long l2) {
        return (Double)hzj.h(object, l2);
    }

    private static float o(Object object, long l2) {
        return ((Float)hzj.h(object, l2)).floatValue();
    }

    private final int p(int n2) {
        return this.c[n2];
    }

    private static int q(Object object, long l2) {
        return (Integer)hzj.h(object, l2);
    }

    private final int r(int n2) {
        if (n2 >= this.e && n2 <= this.f) {
            return this.t(n2, 0);
        }
        return -1;
    }

    private final int s(int n2) {
        return this.c[n2 + 2];
    }

    private final int t(int n2, int n3) {
        int n4 = this.c.length / 3 - 1;
        while (n3 <= n4) {
            int n5 = n4 + n3 >>> 1;
            int n6 = n5 * 3;
            int n7 = this.p(n6);
            if (n2 == n7) {
                return n6;
            }
            if (n2 < n7) {
                n4 = n5 - 1;
                continue;
            }
            n3 = n5 + 1;
        }
        return -1;
    }

    private static int u(int n2) {
        return n2 >>> 20 & 0xFF;
    }

    private final int v(int n2) {
        return this.c[n2 + 1];
    }

    private static long w(int n2) {
        return n2 & 0xFFFFF;
    }

    private static long x(Object object, long l2) {
        return (Long)hzj.h(object, l2);
    }

    private final hwz y(int n2) {
        return (hwz)this.d[(n2 /= 3) + n2 + 1];
    }

    private final hyu z(int n2) {
        hyu hyu2;
        Object object = this.d;
        n2 /= 3;
        if ((hyu2 = (hyu)object[n2 += n2]) != null) {
            return hyu2;
        }
        this.d[n2] = object = hyo.a.a((Class)object[n2 + 1]);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final int a(Object var1_1) {
        var14_2 = hyi.b;
        var2_3 = 1048575;
        var3_4 = 0;
        var5_6 = 0;
        for (var8_5 = 0; var8_5 < this.c.length; var8_5 += 3) {
            block107: {
                block108: {
                    var11_12 = this.v(var8_5);
                    var9_10 = hyi.u(var11_12);
                    var10_11 = this.p(var8_5);
                    var7_9 = this.c[var8_5 + 2];
                    var6_8 = var7_9 & 1048575;
                    if (var9_10 <= 17) {
                        var4_7 = var2_3;
                        if (var6_8 != var2_3) {
                            var2_3 = var6_8 == 1048575 ? 0 : var14_2.getInt(var1_1, var6_8);
                            var4_7 = var6_8;
                            var3_4 = var2_3;
                        }
                        var2_3 = 1 << (var7_9 >>> 20);
                        var7_9 = var4_7;
                        var6_8 = var3_4;
                    } else {
                        var4_7 = 0;
                        var6_8 = var3_4;
                        var7_9 = var2_3;
                        var2_3 = var4_7;
                    }
                    var12_13 = hyi.w(var11_12);
                    if (var9_10 >= hwm.J.Z) {
                        var3_4 = hwm.W.Z;
                    }
                    switch (var9_10) {
                        default: {
                            var2_3 = var5_6;
                            ** GOTO lbl446
                        }
                        case 68: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.J(var10_11, (hyf)var14_2.getObject(var1_1, var12_13), this.z(var8_5));
                            ** GOTO lbl445
                        }
                        case 67: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.V(var10_11, hyi.x(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 66: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.T(var10_11, hyi.q(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 65: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.ay(var10_11);
                            ** GOTO lbl445
                        }
                        case 64: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.ax(var10_11);
                            ** GOTO lbl445
                        }
                        case 63: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.I(var10_11, hyi.q(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 62: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.aa(var10_11, hyi.q(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 61: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.G(var10_11, (hvu)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 60: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hyv.c(var10_11, var14_2.getObject(var1_1, var12_13), this.z(var8_5));
                            ** GOTO lbl445
                        }
                        case 59: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var15_14 = var14_2.getObject(var1_1, var12_13);
                            var2_3 = var15_14 instanceof hvu ? hwd.G(var10_11, (hvu)var15_14) : hwd.X(var10_11, (String)var15_14);
                            ** GOTO lbl445
                        }
                        case 58: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.as(var10_11);
                            ** GOTO lbl445
                        }
                        case 57: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.au(var10_11);
                            ** GOTO lbl445
                        }
                        case 56: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.av(var10_11);
                            ** GOTO lbl445
                        }
                        case 55: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.K(var10_11, hyi.q(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 54: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.ac(var10_11, hyi.x(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 53: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.M(var10_11, hyi.x(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 52: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.aw(var10_11);
                            ** GOTO lbl445
                        }
                        case 51: {
                            var2_3 = var5_6;
                            if (!this.R(var1_1, var10_11, var8_5)) ** GOTO lbl446
                            var2_3 = hwd.at(var10_11);
                            ** GOTO lbl445
                        }
                        case 50: {
                            var16_15 = var14_2.getObject(var1_1, var12_13);
                            var15_14 = this.B(var8_5);
                            var16_15 = (hya)var16_15;
                            var15_14 = (dlm)var15_14;
                            if (var16_15.isEmpty()) ** GOTO lbl-1000
                            var17_16 = var16_15.entrySet().iterator();
                            var3_4 = 0;
                            while (true) {
                                var2_3 = var3_4;
                                if (var17_16.hasNext()) {
                                    var18_17 /* !! */  = (Map.Entry)var17_16.next();
                                    var16_15 = var18_17 /* !! */ .getKey();
                                    var18_17 /* !! */  = var18_17 /* !! */ .getValue();
                                    var3_4 += hwd.Z(var10_11) + hwd.P(dlm.M((gpm)var15_14.a, var16_15, var18_17 /* !! */ ));
                                    continue;
                                }
                                ** GOTO lbl401
                                break;
                            }
                        }
                        case 49: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = this.z(var8_5);
                            var17_16 = hyv.a;
                            var9_10 = var15_14.size();
                            if (var9_10 == 0) {
                                var4_7 = 0;
                            } else {
                                var3_4 = 0;
                                var2_3 = 0;
                                while (true) {
                                    var4_7 = var2_3;
                                    if (var3_4 >= var9_10) break;
                                    var2_3 += hwd.J(var10_11, (hyf)var15_14.get(var3_4), (hyu)var16_15);
                                    ++var3_4;
                                }
                            }
                            var2_3 = var5_6 + var4_7;
                            ** GOTO lbl446
                        }
                        case 48: {
                            var3_4 = hyv.e((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 47: {
                            var3_4 = hyv.d((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 46: {
                            var3_4 = hyv.b((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 45: {
                            var3_4 = hyv.a((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 44: {
                            var3_4 = hyv.l((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 43: {
                            var3_4 = hyv.f((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 42: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var3_4 = var15_14.size();
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 41: {
                            var3_4 = hyv.a((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 40: {
                            var3_4 = hyv.b((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 39: {
                            var3_4 = hyv.l((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 38: {
                            var3_4 = hyv.m((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 37: {
                            var3_4 = hyv.m((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 36: {
                            var3_4 = hyv.a((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var3_4 <= 0) ** GOTO lbl446
                            var9_10 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var3_4);
                            var2_3 = var3_4;
                            var3_4 = var9_10;
                            ** GOTO lbl284
                        }
                        case 35: {
                            var9_10 = hyv.b((List)var14_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var9_10 <= 0) ** GOTO lbl446
                            var3_4 = hwd.Z(var10_11);
                            var4_7 = hwd.ab(var9_10);
                            var2_3 = var9_10;
lbl284:
                            // 14 sources

                            var3_4 += var4_7;
lbl285:
                            // 2 sources

                            while (true) {
                                var3_4 += var2_3;
lbl287:
                                // 3 sources

                                while (true) {
                                    var2_3 = var5_6 + var3_4;
                                    ** GOTO lbl446
                                    break;
                                }
                                break;
                            }
                            ** GOTO lbl446
                        }
                        case 34: {
                            var16_15 = (List)var14_2.getObject(var1_1, var12_13);
                            var15_14 = hyv.a;
                            var3_4 = var16_15.size();
                            if (var3_4 != 0) ** GOTO lbl300
lbl297:
                            // 7 sources

                            while (true) {
                                var2_3 = 0;
                                ** GOTO lbl445
                                break;
                            }
lbl300:
                            // 1 sources

                            var2_3 = hyv.e((List)var16_15);
                            var4_7 = hwd.Z(var10_11);
lbl302:
                            // 6 sources

                            while (true) {
                                var2_3 += var3_4 * var4_7;
                                ** GOTO lbl445
                                break;
                            }
                        }
                        case 33: {
                            var16_15 = (List)var14_2.getObject(var1_1, var12_13);
                            var15_14 = hyv.a;
                            var3_4 = var16_15.size();
                            if (var3_4 == 0) ** GOTO lbl297
                            var2_3 = hyv.d((List)var16_15);
                            var4_7 = hwd.Z(var10_11);
                            ** GOTO lbl302
                        }
                        case 32: {
                            var2_3 = hyv.k(var10_11, (List)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 31: {
                            var2_3 = hyv.j(var10_11, (List)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 30: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var3_4 = var15_14.size();
                            if (var3_4 == 0) ** GOTO lbl297
                            var2_3 = hyv.l((List)var15_14);
                            var4_7 = hwd.Z(var10_11);
                            ** GOTO lbl302
                        }
                        case 29: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var3_4 = var15_14.size();
                            if (var3_4 == 0) ** GOTO lbl297
                            var2_3 = hyv.f((List)var15_14);
                            var4_7 = hwd.Z(var10_11);
                            ** GOTO lbl302
                        }
                        case 28: {
                            var16_15 = (List)var14_2.getObject(var1_1, var12_13);
                            var15_14 = hyv.a;
                            var2_3 = var16_15.size();
                            if (var2_3 != 0) ** GOTO lbl343
                            while (true) {
                                var3_4 = 0;
                                ** GOTO lbl287
                                break;
                            }
lbl343:
                            // 1 sources

                            var2_3 *= hwd.Z(var10_11);
                            var4_7 = 0;
                            while (true) {
                                var3_4 = var2_3;
                                if (var4_7 < var16_15.size()) ** break;
                                ** continue;
                                var2_3 += hwd.H((hvu)var16_15.get(var4_7));
                                ++var4_7;
                            }
                        }
                        case 27: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = this.z(var8_5);
                            var17_16 = hyv.a;
                            var9_10 = var15_14.size();
                            if (var9_10 == 0) {
                                var4_7 = 0;
                            } else {
                                var2_3 = hwd.Z(var10_11) * var9_10;
                                var3_4 = 0;
                                while (true) {
                                    var4_7 = var2_3;
                                    if (var3_4 >= var9_10) break;
                                    var17_16 = var15_14.get(var3_4);
                                    var4_7 = var17_16 instanceof hxt != false ? hwd.O((hxt)var17_16) : hwd.R((hyf)var17_16, (hyu)var16_15);
                                    var2_3 += var4_7;
                                    ++var3_4;
                                }
                            }
                            var2_3 = var5_6 + var4_7;
                            ** GOTO lbl446
                        }
                        case 26: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var9_10 = var15_14.size();
                            if (var9_10 == 0) lbl-1000:
                            // 2 sources

                            {
                                var2_3 = 0;
                            } else {
                                var3_4 = hwd.Z(var10_11) * var9_10;
                                if (var15_14 instanceof hxu) {
                                    var16_15 = (hxu)var15_14;
                                    var4_7 = 0;
                                    while (true) {
                                        var2_3 = var3_4;
                                        if (var4_7 < var9_10) {
                                            var15_14 = var16_15.c();
                                            var2_3 = var15_14 instanceof hvu != false ? hwd.H((hvu)var15_14) : hwd.Y((String)var15_14);
                                            var3_4 += var2_3;
                                            ++var4_7;
                                            continue;
                                        }
                                        break;
                                    }
                                } else {
                                    var4_7 = 0;
                                    while (true) {
                                        var2_3 = var3_4;
                                        if (var4_7 >= var9_10) break;
                                        var16_15 = var15_14.get(var4_7);
                                        var2_3 = var16_15 instanceof hvu != false ? hwd.H((hvu)var16_15) : hwd.Y((String)var16_15);
                                        var3_4 += var2_3;
                                        ++var4_7;
                                    }
                                }
                            }
lbl401:
                            // 4 sources

                            var2_3 = var5_6 + var2_3;
                            ** GOTO lbl446
                        }
                        case 25: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var2_3 = var15_14.size();
                            if (var2_3 == 0) ** GOTO lbl297
                            var2_3 *= hwd.as(var10_11);
                            ** GOTO lbl445
                        }
                        case 24: {
                            var2_3 = hyv.j(var10_11, (List)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 23: {
                            var2_3 = hyv.k(var10_11, (List)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 22: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var3_4 = var15_14.size();
                            if (var3_4 == 0) ** GOTO lbl297
                            var2_3 = hyv.l((List)var15_14);
                            var4_7 = hwd.Z(var10_11);
                            ** GOTO lbl302
                        }
                        case 21: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            var3_4 = var15_14.size();
                            if (var3_4 != 0) ** break;
                            ** continue;
                            var2_3 = hyv.m((List)var15_14);
                            var4_7 = hwd.Z(var10_11);
                            ** continue;
                        }
                        case 20: {
                            var15_14 = (List)var14_2.getObject(var1_1, var12_13);
                            var16_15 = hyv.a;
                            if (var15_14.size() == 0) ** continue;
                            var3_4 = hyv.m((List)var15_14);
                            var2_3 = var15_14.size() * hwd.Z(var10_11);
                            ** continue;
                        }
                        case 19: {
                            var2_3 = hyv.j(var10_11, (List)var14_2.getObject(var1_1, var12_13));
                            ** GOTO lbl445
                        }
                        case 18: {
                            var2_3 = hyv.k(var10_11, (List)var14_2.getObject(var1_1, var12_13));
lbl445:
                            // 27 sources

                            var2_3 = var5_6 + var2_3;
lbl446:
                            // 39 sources

                            var4_7 = var2_3;
                            break block107;
                        }
                        case 17: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.J(var10_11, (hyf)var14_2.getObject(var1_1, var12_13), this.z(var8_5));
                            break block108;
                        }
                        case 16: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.V(var10_11, var14_2.getLong(var1_1, var12_13));
                            break block108;
                        }
                        case 15: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.T(var10_11, var14_2.getInt(var1_1, var12_13));
                            break block108;
                        }
                        case 14: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.ay(var10_11);
                            break block108;
                        }
                        case 13: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.ax(var10_11);
                            break block108;
                        }
                        case 12: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.I(var10_11, var14_2.getInt(var1_1, var12_13));
                            break block108;
                        }
                        case 11: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.aa(var10_11, var14_2.getInt(var1_1, var12_13));
                            break block108;
                        }
                        case 10: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.G(var10_11, (hvu)var14_2.getObject(var1_1, var12_13));
                            break block108;
                        }
                        case 9: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hyv.c(var10_11, var14_2.getObject(var1_1, var12_13), this.z(var8_5));
                            break block108;
                        }
                        case 8: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var15_14 = var14_2.getObject(var1_1, var12_13);
                            var2_3 = var15_14 instanceof hvu ? hwd.G(var10_11, (hvu)var15_14) : hwd.X(var10_11, (String)var15_14);
                            break block108;
                        }
                        case 7: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.as(var10_11);
                            break block108;
                        }
                        case 6: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.au(var10_11);
                            break block108;
                        }
                        case 5: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.av(var10_11);
                            break block108;
                        }
                        case 4: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.K(var10_11, var14_2.getInt(var1_1, var12_13));
                            break block108;
                        }
                        case 3: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.ac(var10_11, var14_2.getLong(var1_1, var12_13));
                            break block108;
                        }
                        case 2: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.M(var10_11, var14_2.getLong(var1_1, var12_13));
                            break block108;
                        }
                        case 1: {
                            var4_7 = var5_6;
                            if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                            var2_3 = hwd.aw(var10_11);
                            break block108;
                        }
                        case 0: 
                    }
                    var4_7 = var5_6;
                    if (!this.O(var1_1, var8_5, var7_9, var6_8, var2_3)) break block107;
                    var2_3 = hwd.at(var10_11);
                }
                var4_7 = var5_6 + var2_3;
            }
            var2_3 = var7_9;
            var3_4 = var6_8;
            var5_6 = var4_7;
        }
        var2_3 = var4_7 = var5_6 + hzd.f(var1_1).a();
        if (this.h) {
            var14_2 = idi.s(var1_1);
            var5_6 = var14_2.b.b;
            var2_3 = 0;
            for (var3_4 = 0; var3_4 < var5_6; ++var3_4) {
                var1_1 = (hyw)var14_2.b.d(var3_4);
                var2_3 += hwl.k((hwu)var1_1.a, var1_1.b);
            }
            for (Object var1_1 : var14_2.b.a()) {
                var2_3 += hwl.k((hwu)var1_1.getKey(), var1_1.getValue());
            }
            var2_3 = var4_7 + var2_3;
        }
        return var2_3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int b(Object var1_1) {
        var3_3 = 0;
        for (var4_2 = 0; var4_2 < this.c.length; var4_2 += 3) {
            block44: {
                block45: {
                    var2_4 = this.v(var4_2);
                    var5_5 = this.p(var4_2);
                    var7_7 = hyi.w(var2_4);
                    var6_6 = hyi.u(var2_4);
                    var2_4 = 37;
                    switch (var6_6) {
                        default: {
                            var2_4 = var3_3;
                            break block44;
                        }
                        case 68: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 67: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hyi.x(var1_1, var7_7));
                            break block45;
                        }
                        case 66: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 65: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hyi.x(var1_1, var7_7));
                            break block45;
                        }
                        case 64: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 63: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 62: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 61: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 60: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 59: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = ((String)hzj.h(var1_1, var7_7)).hashCode();
                            break block45;
                        }
                        case 58: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = a.f(hyi.S(var1_1, var7_7));
                            break block45;
                        }
                        case 57: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 56: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hyi.x(var1_1, var7_7));
                            break block45;
                        }
                        case 55: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hyi.q(var1_1, var7_7);
                            break block45;
                        }
                        case 54: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hyi.x(var1_1, var7_7));
                            break block45;
                        }
                        case 53: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hyi.x(var1_1, var7_7));
                            break block45;
                        }
                        case 52: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = Float.floatToIntBits(hyi.o(var1_1, var7_7));
                            break block45;
                        }
                        case 51: {
                            var2_4 = var3_3;
                            if (!this.R(var1_1, var5_5, var4_2)) break block44;
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(Double.doubleToLongBits(hyi.n(var1_1, var7_7)));
                            break block45;
                        }
                        case 50: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 18: 
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: 
                        case 24: 
                        case 25: 
                        case 26: 
                        case 27: 
                        case 28: 
                        case 29: 
                        case 30: 
                        case 31: 
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                        case 36: 
                        case 37: 
                        case 38: 
                        case 39: 
                        case 40: 
                        case 41: 
                        case 42: 
                        case 43: 
                        case 44: 
                        case 45: 
                        case 46: 
                        case 47: 
                        case 48: 
                        case 49: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 17: {
                            var5_5 = var3_3 * 53;
                            var9_8 = hzj.h(var1_1, var7_7);
                            var3_3 = var5_5;
                            if (var9_8 != null) {
                                var2_4 = var9_8.hashCode();
                                var3_3 = var5_5;
                            }
                            ** GOTO lbl171
                        }
                        case 16: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hzj.f(var1_1, var7_7));
                            break block45;
                        }
                        case 15: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 14: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hzj.f(var1_1, var7_7));
                            break block45;
                        }
                        case 13: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 12: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 11: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 10: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.h(var1_1, var7_7).hashCode();
                            break block45;
                        }
                        case 9: {
                            var5_5 = var3_3 * 53;
                            var9_8 = hzj.h(var1_1, var7_7);
                            var3_3 = var5_5;
                            if (var9_8 != null) {
                                var2_4 = var9_8.hashCode();
                                var3_3 = var5_5;
                            }
lbl171:
                            // 4 sources

                            var2_4 = var3_3 + var2_4;
                            break block44;
                        }
                        case 8: {
                            var2_4 = var3_3 * 53;
                            var3_3 = ((String)hzj.h(var1_1, var7_7)).hashCode();
                            break block45;
                        }
                        case 7: {
                            var2_4 = var3_3 * 53;
                            var3_3 = a.f(hzj.w(var1_1, var7_7));
                            break block45;
                        }
                        case 6: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 5: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hzj.f(var1_1, var7_7));
                            break block45;
                        }
                        case 4: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hzj.d(var1_1, var7_7);
                            break block45;
                        }
                        case 3: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hzj.f(var1_1, var7_7));
                            break block45;
                        }
                        case 2: {
                            var2_4 = var3_3 * 53;
                            var3_3 = hxl.a(hzj.f(var1_1, var7_7));
                            break block45;
                        }
                        case 1: {
                            var2_4 = var3_3 * 53;
                            var3_3 = Float.floatToIntBits(hzj.c(var1_1, var7_7));
                            break block45;
                        }
                        case 0: 
                    }
                    var2_4 = var3_3 * 53;
                    var3_3 = hxl.a(Double.doubleToLongBits(hzj.b(var1_1, var7_7)));
                }
                var2_4 += var3_3;
            }
            var3_3 = var2_4;
        }
        var2_4 = var3_3 = var3_3 * 53 + hzd.f(var1_1).hashCode();
        if (this.h) {
            var2_4 = var3_3 * 53 + idi.s(var1_1).hashCode();
        }
        return var2_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    final int c(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, hvj var6_6) {
        var25_7 = this;
        var27_8 /* !! */  = var1_1;
        var8_9 /* !! */  = var4_4;
        var9_10 /* !! */  = var5_5;
        var24_11 = var6_6;
        hyi.E(var1_1);
        var23_12 = hyi.b;
        var13_13 /* !! */  = -1;
        var14_14 = 0;
        var7_15 = 0;
        var10_16 = 0;
        var11_17 /* !! */  = 1048575;
        block74: while (true) {
            block181: {
                block210: {
                    block215: {
                        block213: {
                            block214: {
                                block212: {
                                    block211: {
                                        block184: {
                                            block207: {
                                                block206: {
                                                    block180: {
                                                        block198: {
                                                            block178: {
                                                                block197: {
                                                                    block203: {
                                                                        block194: {
                                                                            block182: {
                                                                                block208: {
                                                                                    block204: {
                                                                                        block190: {
                                                                                            block205: {
                                                                                                block191: {
                                                                                                    block196: {
                                                                                                        block195: {
                                                                                                            block199: {
                                                                                                                block192: {
                                                                                                                    block193: {
                                                                                                                        block202: {
                                                                                                                            block201: {
                                                                                                                                block200: {
                                                                                                                                    block179: {
                                                                                                                                        block189: {
                                                                                                                                            block185: {
                                                                                                                                                block187: {
                                                                                                                                                    block186: {
                                                                                                                                                        block188: {
                                                                                                                                                            block183: {
                                                                                                                                                                if (var3_3 >= var8_9 /* !! */ ) break block182;
                                                                                                                                                                var8_9 /* !! */  = var3_3 + 1;
                                                                                                                                                                var12_18 = var2_2 /* !! */ [var3_3];
                                                                                                                                                                if (var12_18 < 0) {
                                                                                                                                                                    var8_9 /* !! */  = hvk.u(var12_18, var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var12_18 = var24_11.a;
                                                                                                                                                                }
                                                                                                                                                                if ((var7_15 = var12_18 >>> 3) > var13_13 /* !! */ ) {
                                                                                                                                                                    var3_3 = var14_14 / 3;
                                                                                                                                                                    var3_3 = var7_15 >= var25_7.e && var7_15 <= var25_7.f ? var25_7.t(var7_15, var3_3) : -1;
                                                                                                                                                                } else {
                                                                                                                                                                    var3_3 = var25_7.r(var7_15);
                                                                                                                                                                }
                                                                                                                                                                if (var3_3 != -1) break block183;
                                                                                                                                                                var13_13 /* !! */  = var11_17 /* !! */ ;
                                                                                                                                                                var28_26 = var23_12;
                                                                                                                                                                var3_3 = var7_15;
                                                                                                                                                                var14_14 = 0;
                                                                                                                                                                var3_3 = var9_10 /* !! */ ;
                                                                                                                                                                var23_12 = var25_7;
                                                                                                                                                                var11_17 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                                var26_25 = var24_11;
                                                                                                                                                                var8_9 /* !! */  = var12_18;
                                                                                                                                                                var9_10 /* !! */  = var13_13 /* !! */ ;
                                                                                                                                                                var12_18 = var14_14;
                                                                                                                                                                var24_11 = var28_26;
                                                                                                                                                                break block184;
                                                                                                                                                            }
                                                                                                                                                            var16_20 /* !! */  = var12_18 & 7;
                                                                                                                                                            var28_26 = var25_7.c;
                                                                                                                                                            var15_19 /* !! */  = var28_26[var3_3 + 1];
                                                                                                                                                            var17_21 = hyi.u((int)var15_19 /* !! */ );
                                                                                                                                                            var19_23 = hyi.w((int)var15_19 /* !! */ );
                                                                                                                                                            if (var17_21 > 17) break block185;
                                                                                                                                                            var9_10 /* !! */  = (int)var28_26[var3_3 + 2];
                                                                                                                                                            var14_14 = 1 << (var9_10 /* !! */  >>> 20);
                                                                                                                                                            if ((var9_10 /* !! */  &= 1048575) != var11_17 /* !! */ ) {
                                                                                                                                                                if (var11_17 /* !! */  != 1048575) {
                                                                                                                                                                    var23_12.putInt(var27_8 /* !! */ , var11_17 /* !! */ , var10_16);
                                                                                                                                                                }
                                                                                                                                                                var11_17 /* !! */  = var9_10 /* !! */  == 1048575 ? 0 : var23_12.getInt(var27_8 /* !! */ , var9_10 /* !! */ );
                                                                                                                                                            } else {
                                                                                                                                                                var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                                                                                                var11_17 /* !! */  = var10_16;
                                                                                                                                                            }
                                                                                                                                                            switch (var17_21) {
                                                                                                                                                                default: {
                                                                                                                                                                    if (var16_20 /* !! */  != 3) break block186;
                                                                                                                                                                    var25_7 = this.C(var27_8 /* !! */ , var3_3);
                                                                                                                                                                    var10_16 = hvk.x(var25_7, this.z(var3_3), var2_2 /* !! */ , var8_9 /* !! */ , var4_4, var7_15 << 3 | 4, (hvj)var6_6);
                                                                                                                                                                    this.J(var27_8 /* !! */ , var3_3, var25_7);
                                                                                                                                                                    var8_9 /* !! */  = var12_18;
                                                                                                                                                                    var8_9 /* !! */  = var11_17 /* !! */  | var14_14;
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var11_17 /* !! */  = var3_3;
                                                                                                                                                                    ** GOTO lbl159
                                                                                                                                                                }
                                                                                                                                                                case 16: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl146
                                                                                                                                                                    var8_9 /* !! */  = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putLong(var1_1, var19_23, hvy.J(var24_11.b));
                                                                                                                                                                    var10_16 = var11_17 /* !! */  | var14_14;
                                                                                                                                                                    ** GOTO lbl77
                                                                                                                                                                }
                                                                                                                                                                case 15: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl88
                                                                                                                                                                    var10_16 = var11_17 /* !! */  | var14_14;
                                                                                                                                                                    var8_9 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putInt(var27_8 /* !! */ , var19_23, hvy.H(var24_11.a));
lbl77:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var15_19 /* !! */  = var4_4;
                                                                                                                                                                    var16_20 /* !! */  = var5_5;
                                                                                                                                                                    var14_14 = var3_3;
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var3_3 = var8_9 /* !! */ ;
                                                                                                                                                                    var13_13 /* !! */  = var7_15;
                                                                                                                                                                    var7_15 = var12_18;
                                                                                                                                                                    var11_17 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                                    var9_10 /* !! */  = var16_20 /* !! */ ;
                                                                                                                                                                    var8_9 /* !! */  = (int)var15_19 /* !! */ ;
                                                                                                                                                                    continue block74;
lbl88:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var10_16 = var3_3;
                                                                                                                                                                    ** GOTO lbl204
                                                                                                                                                                }
                                                                                                                                                                case 12: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl103
                                                                                                                                                                    var10_16 = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var13_13 /* !! */  = var24_11.a;
                                                                                                                                                                    var25_7 = this.y(var3_3);
                                                                                                                                                                    if ((var15_19 /* !! */  & -2147483648) != 0 && var25_7 != null && !var25_7.a(var13_13 /* !! */ )) {
                                                                                                                                                                        hyi.d(var1_1).e(var12_18, var13_13 /* !! */ );
                                                                                                                                                                        var8_9 /* !! */  = var11_17 /* !! */ ;
                                                                                                                                                                    } else {
                                                                                                                                                                        var8_9 /* !! */  = var11_17 /* !! */  | var14_14;
                                                                                                                                                                        var23_12.putInt(var27_8 /* !! */ , var19_23, var13_13 /* !! */ );
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl156
lbl103:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    ** GOTO lbl202
                                                                                                                                                                }
                                                                                                                                                                case 10: {
                                                                                                                                                                    if (var16_20 /* !! */  != 2) ** GOTO lbl192
                                                                                                                                                                    var10_16 = hvk.c(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putObject(var27_8 /* !! */ , var19_23, var24_11.c);
                                                                                                                                                                    var8_9 /* !! */  = var11_17 /* !! */  |= var14_14;
                                                                                                                                                                    ** GOTO lbl156
                                                                                                                                                                }
                                                                                                                                                                case 9: {
                                                                                                                                                                    if (var16_20 /* !! */  != 2) ** GOTO lbl192
                                                                                                                                                                    var25_7 = this.C(var27_8 /* !! */ , var3_3);
                                                                                                                                                                    var8_9 /* !! */  = hvk.y(var25_7, this.z(var3_3), var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hvj)var6_6);
                                                                                                                                                                    this.J(var27_8 /* !! */ , var3_3, var25_7);
                                                                                                                                                                    var10_16 = var12_18;
                                                                                                                                                                    var10_16 = var3_3;
                                                                                                                                                                    var10_16 = var14_14 | var11_17 /* !! */ ;
                                                                                                                                                                    ** GOTO lbl180
                                                                                                                                                                }
                                                                                                                                                                case 8: {
                                                                                                                                                                    if (var16_20 /* !! */  != 2) ** GOTO lbl192
                                                                                                                                                                    var10_16 = hyi.M((int)var15_19 /* !! */ ) != false ? hvk.r(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11) : hvk.q(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putObject(var27_8 /* !! */ , var19_23, var24_11.c);
                                                                                                                                                                    var8_9 /* !! */  = var11_17 /* !! */  |= var14_14;
                                                                                                                                                                    ** GOTO lbl156
                                                                                                                                                                }
                                                                                                                                                                case 7: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl192
                                                                                                                                                                    var10_16 = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var18_22 = var24_11.b != 0L;
                                                                                                                                                                    hzj.m(var27_8 /* !! */ , var19_23, var18_22);
                                                                                                                                                                    var8_9 /* !! */  = var11_17 /* !! */  |= var14_14;
                                                                                                                                                                    ** GOTO lbl156
                                                                                                                                                                }
                                                                                                                                                                case 6: 
                                                                                                                                                                case 13: {
                                                                                                                                                                    if (var16_20 /* !! */  != 5) ** GOTO lbl192
                                                                                                                                                                    var10_16 = var8_9 /* !! */  + 4;
                                                                                                                                                                    var23_12.putInt(var27_8 /* !! */ , var19_23, hvk.d(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                                    var8_9 /* !! */  = var11_17 /* !! */  |= var14_14;
                                                                                                                                                                    ** GOTO lbl156
                                                                                                                                                                }
                                                                                                                                                                case 5: 
                                                                                                                                                                case 14: {
                                                                                                                                                                    if (var16_20 /* !! */  != 1) ** GOTO lbl146
                                                                                                                                                                    var13_13 /* !! */  = var8_9 /* !! */  + 8;
                                                                                                                                                                    var10_16 = var14_14 | var11_17 /* !! */ ;
                                                                                                                                                                    var23_12.putLong(var1_1, var19_23, hvk.A(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                                    var8_9 /* !! */  = var13_13 /* !! */ ;
                                                                                                                                                                    ** GOTO lbl178
lbl146:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var10_16 = var3_3;
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    break block187;
                                                                                                                                                                }
                                                                                                                                                                case 4: 
                                                                                                                                                                case 11: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl192
                                                                                                                                                                    var10_16 = var11_17 /* !! */  | var14_14;
                                                                                                                                                                    var11_17 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putInt(var27_8 /* !! */ , var19_23, var24_11.a);
                                                                                                                                                                    var8_9 /* !! */  = var10_16;
                                                                                                                                                                    var10_16 = var11_17 /* !! */ ;
lbl156:
                                                                                                                                                                    // 7 sources

                                                                                                                                                                    var11_17 /* !! */  = var12_18;
                                                                                                                                                                    var11_17 /* !! */  = var3_3;
                                                                                                                                                                    var25_7 = this;
lbl159:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var11_17 /* !! */  = var12_18;
                                                                                                                                                                    var14_14 = var3_3;
                                                                                                                                                                    var12_18 = var4_4;
                                                                                                                                                                    var15_19 /* !! */  = var5_5;
                                                                                                                                                                    var3_3 = var10_16;
                                                                                                                                                                    var13_13 /* !! */  = var7_15;
                                                                                                                                                                    var7_15 = var11_17 /* !! */ ;
                                                                                                                                                                    var10_16 = var8_9 /* !! */ ;
                                                                                                                                                                    var11_17 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                                    var9_10 /* !! */  = (int)var15_19 /* !! */ ;
                                                                                                                                                                    var8_9 /* !! */  = var12_18;
                                                                                                                                                                    continue block74;
                                                                                                                                                                }
                                                                                                                                                                case 2: 
                                                                                                                                                                case 3: {
                                                                                                                                                                    if (var16_20 /* !! */  != 0) ** GOTO lbl192
                                                                                                                                                                    var10_16 = var14_14 | var11_17 /* !! */ ;
                                                                                                                                                                    var8_9 /* !! */  = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                                    var23_12.putLong(var1_1, var19_23, var24_11.b);
lbl178:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var11_17 /* !! */  = var12_18;
                                                                                                                                                                    var11_17 /* !! */  = var3_3;
lbl180:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var11_17 /* !! */  = var12_18;
                                                                                                                                                                    var14_14 = var3_3;
                                                                                                                                                                    var12_18 = var4_4;
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var15_19 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                                    var9_10 /* !! */  = var5_5;
                                                                                                                                                                    var3_3 = var8_9 /* !! */ ;
                                                                                                                                                                    var13_13 /* !! */  = var7_15;
                                                                                                                                                                    var7_15 = var11_17 /* !! */ ;
                                                                                                                                                                    var11_17 /* !! */  = (int)var15_19 /* !! */ ;
                                                                                                                                                                    var8_9 /* !! */  = var12_18;
                                                                                                                                                                    continue block74;
lbl192:
                                                                                                                                                                    // 7 sources

                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    ** GOTO lbl202
                                                                                                                                                                }
                                                                                                                                                                case 1: {
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    if (var16_20 /* !! */  != 5) ** GOTO lbl202
                                                                                                                                                                    var10_16 = var8_9 /* !! */  + 4;
                                                                                                                                                                    hzj.r(var27_8 /* !! */ , var19_23, hvk.b(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                                    var8_9 /* !! */  = var10_16;
                                                                                                                                                                    var10_16 = var11_17 /* !! */  |= var14_14;
                                                                                                                                                                    break block188;
lbl202:
                                                                                                                                                                    // 3 sources

                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    var10_16 = var3_3;
lbl204:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    var10_16 = var3_3;
                                                                                                                                                                    var25_7 = this;
                                                                                                                                                                    break block187;
                                                                                                                                                                }
                                                                                                                                                                case 0: 
                                                                                                                                                            }
                                                                                                                                                            if (var16_20 /* !! */  != 1) break block186;
                                                                                                                                                            var13_13 /* !! */  = var8_9 /* !! */  + 8;
                                                                                                                                                            var10_16 = var11_17 /* !! */  | var14_14;
                                                                                                                                                            hzj.q(var27_8 /* !! */ , var19_23, hvk.a(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                            var8_9 /* !! */  = var13_13 /* !! */ ;
                                                                                                                                                        }
                                                                                                                                                        var15_19 /* !! */  = var4_4;
                                                                                                                                                        var16_20 /* !! */  = var5_5;
                                                                                                                                                        var25_7 = this;
                                                                                                                                                        var14_14 = var3_3;
                                                                                                                                                        var3_3 = var8_9 /* !! */ ;
                                                                                                                                                        var13_13 /* !! */  = var7_15;
                                                                                                                                                        var7_15 = var12_18;
                                                                                                                                                        var11_17 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                        var9_10 /* !! */  = var16_20 /* !! */ ;
                                                                                                                                                        var8_9 /* !! */  = (int)var15_19 /* !! */ ;
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    var25_7 = this;
                                                                                                                                                    var10_16 = var3_3;
                                                                                                                                                }
                                                                                                                                                var13_13 /* !! */  = var3_3;
                                                                                                                                                var26_25 = this;
                                                                                                                                                var3_3 = var5_5;
                                                                                                                                                var25_7 = var23_12;
                                                                                                                                                var10_16 = var7_15;
                                                                                                                                                var10_16 = var11_17 /* !! */ ;
                                                                                                                                                var23_12 = var26_25;
                                                                                                                                                var11_17 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                var26_25 = var24_11;
                                                                                                                                                var8_9 /* !! */  = var12_18;
                                                                                                                                                var12_18 = var13_13 /* !! */ ;
                                                                                                                                                var24_11 = var25_7;
                                                                                                                                                break block184;
                                                                                                                                            }
                                                                                                                                            var13_13 /* !! */  = var12_18;
                                                                                                                                            if (var17_21 != 27) break block189;
                                                                                                                                            if (var16_20 /* !! */  == 2) {
                                                                                                                                                var26_25 = var28_26 = (hxk)var23_12.getObject(var27_8 /* !! */ , var19_23);
                                                                                                                                                if (!var28_26.c()) {
                                                                                                                                                    var9_10 /* !! */  = var28_26.size();
                                                                                                                                                    var9_10 /* !! */  = var9_10 /* !! */  == 0 ? 10 : (var9_10 /* !! */  += var9_10 /* !! */ );
                                                                                                                                                    var26_25 = var28_26.d(var9_10 /* !! */ );
                                                                                                                                                    var23_12.putObject(var27_8 /* !! */ , var19_23, var26_25);
                                                                                                                                                }
                                                                                                                                                var14_14 = hvk.g(super.z(var3_3), var13_13 /* !! */ , var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hxk)var26_25, (hvj)var6_6);
                                                                                                                                                var9_10 /* !! */  = var5_5;
                                                                                                                                                var8_9 /* !! */  = var4_4;
                                                                                                                                                var12_18 = var13_13 /* !! */ ;
                                                                                                                                                var13_13 /* !! */  = var14_14;
                                                                                                                                                var14_14 = var3_3;
                                                                                                                                                var3_3 = var13_13 /* !! */ ;
                                                                                                                                                var13_13 /* !! */  = var7_15;
                                                                                                                                                var7_15 = var12_18;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            var25_7 = var24_11;
                                                                                                                                            break block190;
                                                                                                                                        }
                                                                                                                                        if (var17_21 > 49) break block191;
                                                                                                                                        var21_24 = (long)var15_19 /* !! */ ;
                                                                                                                                        var26_25 = hyi.b;
                                                                                                                                        var25_7 = (hxk)var26_25.getObject(var27_8 /* !! */ , var19_23);
                                                                                                                                        if (!var25_7.c()) {
                                                                                                                                            var9_10 /* !! */  = var25_7.size();
                                                                                                                                            var25_7 = var25_7.d(var9_10 /* !! */  + var9_10 /* !! */ );
                                                                                                                                            var26_25.putObject(var27_8 /* !! */ , var19_23, var25_7);
                                                                                                                                        }
                                                                                                                                        switch (var17_21) {
                                                                                                                                            default: {
                                                                                                                                                var26_25 = var24_11;
                                                                                                                                                var15_19 /* !! */  = var4_4;
                                                                                                                                                var27_8 /* !! */  = var23_12;
                                                                                                                                                if (var16_20 /* !! */  != 3) break block192;
                                                                                                                                                var16_20 /* !! */  = var13_13 /* !! */  & -8 | 4;
                                                                                                                                                var28_26 = this.z(var3_3);
                                                                                                                                                var14_14 = var8_9 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                var27_8 /* !! */  = this;
                                                                                                                                                var12_18 = hvk.e((hyu)var28_26, var2_2 /* !! */ , var8_9 /* !! */ , var4_4, var16_20 /* !! */ , (hvj)var6_6);
                                                                                                                                                var25_7.add(var26_25.c);
                                                                                                                                                break block193;
                                                                                                                                            }
                                                                                                                                            case 34: 
                                                                                                                                            case 48: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl292
                                                                                                                                                var9_10 /* !! */  = hvk.n(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl326
lbl292:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  != 0) ** GOTO lbl328
                                                                                                                                                var9_10 /* !! */  = hvk.a;
                                                                                                                                                var25_7 = (hxw)var25_7;
                                                                                                                                                var12_18 = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                var25_7.e(hvy.J(var24_11.b));
                                                                                                                                                while (true) {
                                                                                                                                                    var9_10 /* !! */  = var12_18;
                                                                                                                                                    if (var12_18 >= var4_4) ** GOTO lbl326
                                                                                                                                                    var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                    var9_10 /* !! */  = var12_18;
                                                                                                                                                    if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                        var12_18 = hvk.w(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                                                                                                        var25_7.e(hvy.J(var24_11.b));
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl326
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            case 33: 
                                                                                                                                            case 47: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl311
                                                                                                                                                var9_10 /* !! */  = hvk.m(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl326
lbl311:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  == 0) {
                                                                                                                                                    var9_10 /* !! */  = hvk.a;
                                                                                                                                                    var25_7 = (hww)var25_7;
                                                                                                                                                    var12_18 = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                    var25_7.g(hvy.H(var24_11.a));
                                                                                                                                                    while (true) {
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var12_18 >= var4_4) ** break;
                                                                                                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var13_13 /* !! */  != var24_11.a) ** break;
                                                                                                                                                        var12_18 = hvk.t(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                                                                                                        var25_7.g(hvy.H(var24_11.a));
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl328
lbl326:
                                                                                                                                                // 6 sources

                                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                                ** GOTO lbl504
lbl328:
                                                                                                                                                // 2 sources

                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                ** GOTO lbl514
                                                                                                                                            }
                                                                                                                                            case 30: 
                                                                                                                                            case 44: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl334
                                                                                                                                                var9_10 /* !! */  = hvk.o(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl336
lbl334:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  != 0) ** GOTO lbl347
                                                                                                                                                var9_10 /* !! */  = hvk.v(var13_13 /* !! */ , var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hxk)var25_7, (hvj)var6_6);
lbl336:
                                                                                                                                                // 2 sources

                                                                                                                                                hyv.h(var1_1, var7_15, (List)var25_7, this.y(var3_3), null, this.m);
                                                                                                                                                var25_7 = var24_11;
                                                                                                                                                var12_18 = var3_3;
                                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                                var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                var25_7 = var23_12;
                                                                                                                                                var9_10 /* !! */  = var4_4;
                                                                                                                                                var25_7 = this;
                                                                                                                                                var9_10 /* !! */  = var12_18;
                                                                                                                                                break block180;
lbl347:
                                                                                                                                                // 1 sources

                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                ** GOTO lbl514
                                                                                                                                            }
                                                                                                                                            case 28: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl362
                                                                                                                                                var9_10 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                var12_18 = var24_11.a;
                                                                                                                                                if (var12_18 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                                                                                                if (var12_18 > var2_2 /* !! */ .length - var9_10 /* !! */ ) throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                                                                                                if (var12_18 != 0) ** GOTO lbl359
                                                                                                                                                var25_7.add(hvu.b);
                                                                                                                                                ** GOTO lbl866
lbl359:
                                                                                                                                                // 1 sources

                                                                                                                                                var25_7.add(hvu.s(var2_2 /* !! */ , var9_10 /* !! */ , var12_18));
                                                                                                                                                break block194;
lbl362:
                                                                                                                                                // 1 sources

                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                break block195;
                                                                                                                                            }
                                                                                                                                            case 27: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl378
                                                                                                                                                var27_8 /* !! */  = this.z(var3_3);
                                                                                                                                                var26_25 = var24_11;
                                                                                                                                                var9_10 /* !! */  = hvk.g((hyu)var27_8 /* !! */ , var13_13 /* !! */ , var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hxk)var25_7, (hvj)var6_6);
                                                                                                                                                var25_7 = this;
                                                                                                                                                var12_18 = var3_3;
                                                                                                                                                var12_18 = var4_4;
                                                                                                                                                var25_7 = var23_12;
                                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                                var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var12_18;
                                                                                                                                                break block180;
lbl378:
                                                                                                                                                // 1 sources

                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                var9_10 /* !! */  = var4_4;
                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                var25_7 = this;
                                                                                                                                                break block196;
                                                                                                                                            }
                                                                                                                                            case 26: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl490
                                                                                                                                                if ((var21_24 & 0x20000000L) != 0L) ** GOTO lbl396
                                                                                                                                                var9_10 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                var12_18 = var24_11.a;
                                                                                                                                                if (var12_18 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                                                                                                if (var12_18 != 0) ** GOTO lbl393
                                                                                                                                                var25_7.add("");
                                                                                                                                                ** GOTO lbl895
lbl393:
                                                                                                                                                // 1 sources

                                                                                                                                                var25_7.add(new String(var2_2 /* !! */ , var9_10 /* !! */ , var12_18, hxl.a));
                                                                                                                                                break block197;
lbl396:
                                                                                                                                                // 1 sources

                                                                                                                                                var9_10 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                var14_14 = var24_11.a;
                                                                                                                                                if (var14_14 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                                                                                                if (var14_14 == 0) {
                                                                                                                                                    var25_7.add("");
                                                                                                                                                } else {
                                                                                                                                                    var12_18 = var9_10 /* !! */  + var14_14;
                                                                                                                                                    if (hzl.d(var2_2 /* !! */ , var9_10 /* !! */ , var12_18) == false) throw new hxn("Protocol message had invalid UTF-8.");
                                                                                                                                                    var25_7.add(new String(var2_2 /* !! */ , var9_10 /* !! */ , var14_14, hxl.a));
                                                                                                                                                    var9_10 /* !! */  = var12_18;
                                                                                                                                                }
                                                                                                                                                while (true) {
                                                                                                                                                    var12_18 = var9_10 /* !! */ ;
                                                                                                                                                    if (var9_10 /* !! */  < var4_4) {
                                                                                                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var9_10 /* !! */ , (hvj)var24_11);
                                                                                                                                                        var12_18 = var9_10 /* !! */ ;
                                                                                                                                                        if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                            var12_18 = hvk.t(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                                                                                                            var14_14 = var24_11.a;
                                                                                                                                                            if (var14_14 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                                                                                                            if (var14_14 == 0) {
                                                                                                                                                                var25_7.add("");
                                                                                                                                                                var9_10 /* !! */  = var12_18;
                                                                                                                                                                continue;
                                                                                                                                                            }
                                                                                                                                                            var9_10 /* !! */  = var12_18 + var14_14;
                                                                                                                                                            if (hzl.d(var2_2 /* !! */ , var12_18, var9_10 /* !! */ ) == false) throw new hxn("Protocol message had invalid UTF-8.");
                                                                                                                                                            var25_7.add(new String(var2_2 /* !! */ , var12_18, var14_14, hxl.a));
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break block178;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            case 25: 
                                                                                                                                            case 42: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl432
                                                                                                                                                var9_10 /* !! */  = hvk.h(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl498
lbl432:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  != 0) ** GOTO lbl490
                                                                                                                                                var9_10 /* !! */  = hvk.a;
                                                                                                                                                var25_7 = (hvm)var25_7;
                                                                                                                                                var12_18 = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                var18_22 = var24_11.b != 0L;
                                                                                                                                                var25_7.e(var18_22);
                                                                                                                                                while (true) {
                                                                                                                                                    var9_10 /* !! */  = var12_18;
                                                                                                                                                    if (var12_18 < var4_4) {
                                                                                                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                            var12_18 = hvk.w(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                                                                                                            var18_22 = var24_11.b != 0L;
                                                                                                                                                            var25_7.e(var18_22);
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl498
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            case 24: 
                                                                                                                                            case 31: 
                                                                                                                                            case 41: 
                                                                                                                                            case 45: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl454
                                                                                                                                                var9_10 /* !! */  = hvk.j(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl498
lbl454:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  != 5) ** GOTO lbl490
                                                                                                                                                var12_18 = var8_9 /* !! */  + 4;
                                                                                                                                                var9_10 /* !! */  = hvk.a;
                                                                                                                                                var25_7 = (hww)var25_7;
                                                                                                                                                var25_7.g(hvk.d(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                while (true) {
                                                                                                                                                    var9_10 /* !! */  = var12_18;
                                                                                                                                                    if (var12_18 < var4_4) {
                                                                                                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                            var25_7.g(hvk.d(var2_2 /* !! */ , var14_14));
                                                                                                                                                            var12_18 = var14_14 + 4;
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl498
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            case 23: 
                                                                                                                                            case 32: 
                                                                                                                                            case 40: 
                                                                                                                                            case 46: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl474
                                                                                                                                                var9_10 /* !! */  = hvk.k(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                ** GOTO lbl498
lbl474:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  == 1) {
                                                                                                                                                    var12_18 = var8_9 /* !! */  + 8;
                                                                                                                                                    var9_10 /* !! */  = hvk.a;
                                                                                                                                                    var25_7 = (hxw)var25_7;
                                                                                                                                                    var25_7.e(hvk.A(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                    while (true) {
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var12_18 < var4_4) {
                                                                                                                                                            var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                            var9_10 /* !! */  = var12_18;
                                                                                                                                                            if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                                var25_7.e(hvk.A(var2_2 /* !! */ , var14_14));
                                                                                                                                                                var12_18 = var14_14 + 8;
                                                                                                                                                                continue;
                                                                                                                                                            } else {
                                                                                                                                                                ** GOTO lbl489
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            ** GOTO lbl489
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl490
lbl489:
                                                                                                                                                // 4 sources

                                                                                                                                                ** GOTO lbl498
lbl490:
                                                                                                                                                // 4 sources

                                                                                                                                                var25_7 = this;
                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var4_4;
                                                                                                                                                break block196;
                                                                                                                                            }
                                                                                                                                            case 22: 
                                                                                                                                            case 29: 
                                                                                                                                            case 39: 
                                                                                                                                            case 43: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl501
                                                                                                                                                var9_10 /* !! */  = hvk.o(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
lbl498:
                                                                                                                                                // 7 sources

                                                                                                                                                var12_18 = var3_3;
                                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                                break block198;
lbl501:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  != 0) ** GOTO lbl513
                                                                                                                                                var9_10 /* !! */  = hvk.v(var13_13 /* !! */ , var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hxk)var25_7, (hvj)var6_6);
                                                                                                                                                var12_18 = var8_9 /* !! */ ;
lbl504:
                                                                                                                                                // 2 sources

                                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                                var8_9 /* !! */  = var3_3;
                                                                                                                                                var25_7 = var23_12;
                                                                                                                                                var8_9 /* !! */  = var4_4;
                                                                                                                                                var25_7 = this;
                                                                                                                                                var25_7 = var24_11;
                                                                                                                                                var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var12_18;
                                                                                                                                                break block180;
lbl513:
                                                                                                                                                // 1 sources

                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
lbl514:
                                                                                                                                                // 3 sources

                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                var9_10 /* !! */  = var4_4;
                                                                                                                                                var25_7 = this;
                                                                                                                                                break block196;
                                                                                                                                            }
                                                                                                                                            case 20: 
                                                                                                                                            case 21: 
                                                                                                                                            case 37: 
                                                                                                                                            case 38: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl523
                                                                                                                                                var9_10 /* !! */  = hvk.p(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                break block179;
lbl523:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  == 0) {
                                                                                                                                                    var9_10 /* !! */  = hvk.a;
                                                                                                                                                    var25_7 = (hxw)var25_7;
                                                                                                                                                    var12_18 = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var24_11);
                                                                                                                                                    var25_7.e(var24_11.b);
                                                                                                                                                    while (true) {
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var12_18 >= var4_4) break block179;
                                                                                                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                            var12_18 = hvk.w(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                                                                                                            var25_7.e(var24_11.b);
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        break block179;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl559
                                                                                                                                            }
                                                                                                                                            case 19: 
                                                                                                                                            case 36: {
                                                                                                                                                if (var16_20 /* !! */  != 2) ** GOTO lbl543
                                                                                                                                                var9_10 /* !! */  = hvk.l(var2_2 /* !! */ , var8_9 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                                break block179;
lbl543:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var16_20 /* !! */  == 5) {
                                                                                                                                                    var12_18 = var8_9 /* !! */  + 4;
                                                                                                                                                    var9_10 /* !! */  = hvk.a;
                                                                                                                                                    var25_7 = (hwn)var25_7;
                                                                                                                                                    var25_7.g(hvk.b(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                                                                                    while (true) {
                                                                                                                                                        var9_10 /* !! */  = var12_18;
                                                                                                                                                        if (var12_18 < var4_4) {
                                                                                                                                                            var14_14 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                                                                                            var9_10 /* !! */  = var12_18;
                                                                                                                                                            if (var13_13 /* !! */  == var24_11.a) {
                                                                                                                                                                var25_7.g(hvk.b(var2_2 /* !! */ , var14_14));
                                                                                                                                                                var12_18 = var14_14 + 4;
                                                                                                                                                                continue;
                                                                                                                                                            } else {
                                                                                                                                                                ** GOTO lbl-1000
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            ** GOTO lbl-1000
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl559
lbl-1000:
                                                                                                                                                // 4 sources

                                                                                                                                                {
                                                                                                                                                    break block179;
                                                                                                                                                }
lbl559:
                                                                                                                                                // 2 sources

                                                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                                                break block199;
                                                                                                                                            }
                                                                                                                                            case 18: 
                                                                                                                                            case 35: 
                                                                                                                                        }
                                                                                                                                        var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                                                        if (var16_20 /* !! */  != 2) break block200;
                                                                                                                                        var9_10 /* !! */  = hvk.i(var2_2 /* !! */ , var9_10 /* !! */ , (hxk)var25_7, (hvj)var24_11);
                                                                                                                                    }
                                                                                                                                    var12_18 = var3_3;
                                                                                                                                    var12_18 = var8_9 /* !! */ ;
                                                                                                                                    var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                    break block201;
                                                                                                                                }
                                                                                                                                if (var16_20 /* !! */  != 1) break block202;
                                                                                                                                var12_18 = var9_10 /* !! */  + 8;
                                                                                                                                var8_9 /* !! */  = hvk.a;
                                                                                                                                var25_7 = (hwf)var25_7;
                                                                                                                                var25_7.f(hvk.a(var2_2 /* !! */ , var9_10 /* !! */ ));
                                                                                                                                var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                                var9_10 /* !! */  = var12_18;
                                                                                                                                while (var9_10 /* !! */  < var4_4) {
                                                                                                                                    var12_18 = hvk.t(var2_2 /* !! */ , var9_10 /* !! */ , (hvj)var24_11);
                                                                                                                                    if (var13_13 /* !! */  != var24_11.a) break;
                                                                                                                                    var25_7.f(hvk.a(var2_2 /* !! */ , var12_18));
                                                                                                                                    var9_10 /* !! */  = var12_18 + 8;
                                                                                                                                }
                                                                                                                                var12_18 = var3_3;
                                                                                                                                var12_18 = var8_9 /* !! */ ;
                                                                                                                                var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                                                                            }
                                                                                                                            var9_10 /* !! */  = var3_3;
                                                                                                                            var9_10 /* !! */  = var12_18;
                                                                                                                            break block203;
                                                                                                                        }
                                                                                                                        var9_10 /* !! */  = var3_3;
                                                                                                                        break block195;
                                                                                                                    }
                                                                                                                    while (true) {
                                                                                                                        var8_9 /* !! */  = var12_18;
                                                                                                                        var9_10 /* !! */  = var14_14;
                                                                                                                        if (var12_18 < var15_19 /* !! */ ) {
                                                                                                                            var17_21 = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var26_25);
                                                                                                                            var8_9 /* !! */  = var12_18;
                                                                                                                            var9_10 /* !! */  = var14_14;
                                                                                                                            if (var13_13 /* !! */  == var26_25.a) {
                                                                                                                                var12_18 = hvk.e((hyu)var28_26, var2_2 /* !! */ , var17_21, var4_4, var16_20 /* !! */ , (hvj)var6_6);
                                                                                                                                var25_7.add(var26_25.c);
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break block180;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                                var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                            }
                                                                                                            var9_10 /* !! */  = var3_3;
                                                                                                            var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                        }
                                                                                                        var9_10 /* !! */  = var3_3;
                                                                                                        var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                        var9_10 /* !! */  = var4_4;
                                                                                                        var25_7 = this;
                                                                                                    }
                                                                                                    var9_10 /* !! */  = var3_3;
                                                                                                    var9_10 /* !! */  = var4_4;
                                                                                                    var25_7 = this;
                                                                                                    var25_7 = var23_12;
                                                                                                    var25_7 = var24_11;
                                                                                                    var12_18 = var8_9 /* !! */ ;
                                                                                                    var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                                    var8_9 /* !! */  = var12_18;
                                                                                                    break block180;
                                                                                                }
                                                                                                var14_14 = var11_17 /* !! */ ;
                                                                                                var24_11 = var23_12;
                                                                                                var9_10 /* !! */  = var3_3;
                                                                                                if (var17_21 != 50) break block204;
                                                                                                if (var16_20 /* !! */  != 2) break block205;
                                                                                                var28_26 = hyi.b;
                                                                                                var27_8 /* !! */  = this.B(var9_10 /* !! */ );
                                                                                                var25_7 = var6_6;
                                                                                                var23_12 = var26_25 = var28_26.getObject(var1_1, var19_23);
                                                                                                if (idi.n(var26_25)) {
                                                                                                    var23_12 = idi.p();
                                                                                                    idi.o(var23_12, var26_25);
                                                                                                    var28_26.putObject(var1_1, var19_23, var23_12);
                                                                                                }
                                                                                                var29_27 = idi.z(var27_8 /* !! */ );
                                                                                                var28_26 = (hya)var23_12;
                                                                                                var12_18 = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var25_7);
                                                                                                var3_3 = var25_7.a;
                                                                                                if (var3_3 < 0) throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                                                if (var3_3 > var4_4 - var12_18) throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                                                var3_3 = var12_18 + var3_3;
                                                                                                var26_25 = var29_27.b;
                                                                                                var27_8 /* !! */  = var29_27.d;
                                                                                                var23_12 = var24_11;
                                                                                                var24_11 = var26_25;
                                                                                                var26_25 = var27_8 /* !! */ ;
                                                                                                break block206;
                                                                                            }
                                                                                            var25_7 = var6_6;
                                                                                        }
                                                                                        var13_13 /* !! */  = var12_18;
                                                                                        var12_18 = var3_3;
                                                                                        var3_3 = var8_9 /* !! */ ;
                                                                                        var24_11 = var23_12;
                                                                                        break block207;
                                                                                    }
                                                                                    var26_25 = var6_6;
                                                                                    var25_7 = hyi.b;
                                                                                    var21_24 = var28_26[var9_10 /* !! */  + 2] & 1048575;
                                                                                    switch (var17_21) {
                                                                                        default: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            ** GOTO lbl-1000
                                                                                        }
                                                                                        case 68: {
                                                                                            if (var16_20 /* !! */  != 3) ** GOTO lbl684
                                                                                            var23_12 = this.D(var1_1, var7_15, var9_10 /* !! */ );
                                                                                            var11_17 /* !! */  = hvk.x(var23_12, this.z(var9_10 /* !! */ ), var2_2 /* !! */ , var8_9 /* !! */ , var4_4, var13_13 /* !! */  & -8 | 4, (hvj)var6_6);
                                                                                            this.K(var1_1, var7_15, var9_10 /* !! */ , var23_12);
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
lbl684:
                                                                                            // 1 sources

                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            var23_12 = this;
                                                                                            ** GOTO lbl-1000
                                                                                        }
                                                                                        case 67: {
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl703
                                                                                            var11_17 /* !! */  = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var25_7.putObject(var1_1, var19_23, hvy.J(var26_25.b));
                                                                                            var25_7.putInt(var1_1, var21_24, var7_15);
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl703
                                                                                            var11_17 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var25_7.putObject(var1_1, var19_23, hvy.H(var26_25.a));
                                                                                            var25_7.putInt(var1_1, var21_24, var7_15);
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            ** GOTO lbl724
lbl703:
                                                                                            // 2 sources

                                                                                            var9_10 /* !! */  = var3_3;
                                                                                            ** GOTO lbl729
                                                                                        }
                                                                                        case 63: {
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl728
                                                                                            var11_17 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var15_19 /* !! */  = var26_25.a;
                                                                                            var23_12 = this.y(var9_10 /* !! */ );
                                                                                            if (var23_12 != null && !var23_12.a((int)var15_19 /* !! */ )) {
                                                                                                hyi.d(var1_1).e(var13_13 /* !! */ , (long)var15_19 /* !! */ );
                                                                                                var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            } else {
                                                                                                var25_7.putObject(var1_1, var19_23, (int)var15_19 /* !! */ );
                                                                                                var25_7.putInt(var1_1, var21_24, var7_15);
                                                                                                var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            }
                                                                                            ** GOTO lbl723
                                                                                        }
                                                                                        case 61: {
                                                                                            if (var16_20 /* !! */  != 2) ** GOTO lbl728
                                                                                            var9_10 /* !! */  = hvk.c(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var25_7.putObject(var1_1, var19_23, var26_25.c);
                                                                                            var25_7.putInt(var1_1, var21_24, var7_15);
lbl723:
                                                                                            // 3 sources

                                                                                            var11_17 /* !! */  = var3_3;
lbl724:
                                                                                            // 2 sources

                                                                                            var11_17 /* !! */  = var3_3;
                                                                                            var23_12 = this;
                                                                                            var11_17 /* !! */  = var7_15;
                                                                                            break block208;
lbl728:
                                                                                            // 2 sources

                                                                                            var9_10 /* !! */  = var3_3;
lbl729:
                                                                                            // 2 sources

                                                                                            var9_10 /* !! */  = var3_3;
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            ** GOTO lbl-1000
                                                                                        }
                                                                                        case 60: {
                                                                                            if (var16_20 /* !! */  != 2) ** GOTO lbl743
                                                                                            var25_7 = this.D(var1_1, var7_15, var9_10 /* !! */ );
                                                                                            var23_12 = this.z(var9_10 /* !! */ );
                                                                                            var13_13 /* !! */  = var7_15;
                                                                                            var11_17 /* !! */  = hvk.y(var25_7, (hyu)var23_12, var2_2 /* !! */ , var8_9 /* !! */ , var4_4, (hvj)var6_6);
                                                                                            this.K(var1_1, var13_13 /* !! */ , var9_10 /* !! */ , var25_7);
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
lbl743:
                                                                                            // 1 sources

                                                                                            var11_17 /* !! */  = var7_15;
                                                                                            var23_12 = this;
                                                                                            ** GOTO lbl-1000
                                                                                        }
                                                                                        case 59: {
                                                                                            var23_12 = this;
                                                                                            var11_17 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 2) ** GOTO lbl-1000
                                                                                            var13_13 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var16_20 /* !! */  = var26_25.a;
                                                                                            if (var16_20 /* !! */  == 0) {
                                                                                                var25_7.putObject(var1_1, var19_23, "");
                                                                                                var9_10 /* !! */  = var13_13 /* !! */ ;
                                                                                            } else {
                                                                                                var9_10 /* !! */  = var13_13 /* !! */  + var16_20 /* !! */ ;
                                                                                                if ((var15_19 /* !! */  & 0x20000000) != 0) {
                                                                                                    if (hzl.d(var2_2 /* !! */ , var13_13 /* !! */ , var9_10 /* !! */ ) == false) throw new hxn("Protocol message had invalid UTF-8.");
                                                                                                }
                                                                                                var25_7.putObject(var1_1, var19_23, new String(var2_2 /* !! */ , var13_13 /* !! */ , var16_20 /* !! */ , hxl.a));
                                                                                            }
                                                                                            var25_7.putInt(var1_1, var21_24, var11_17 /* !! */ );
                                                                                            break block208;
                                                                                        }
                                                                                        case 58: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var18_22 = var26_25.b != 0L;
                                                                                            var25_7.putObject(var1_1, var19_23, var18_22);
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 57: 
                                                                                        case 64: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 5) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = var8_9 /* !! */  + 4;
                                                                                            var25_7.putObject(var1_1, var19_23, hvk.d(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 56: 
                                                                                        case 65: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 1) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = var8_9 /* !! */  + 8;
                                                                                            var25_7.putObject(var1_1, var19_23, hvk.A(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 55: 
                                                                                        case 62: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = hvk.t(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var25_7.putObject(var1_1, var19_23, var26_25.a);
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 53: 
                                                                                        case 54: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 0) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = hvk.w(var2_2 /* !! */ , var8_9 /* !! */ , (hvj)var26_25);
                                                                                            var25_7.putObject(var1_1, var19_23, var26_25.b);
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 52: {
                                                                                            var23_12 = this;
                                                                                            var9_10 /* !! */  = var7_15;
                                                                                            if (var16_20 /* !! */  != 5) ** GOTO lbl-1000
                                                                                            var11_17 /* !! */  = var8_9 /* !! */  + 4;
                                                                                            var25_7.putObject(var1_1, var19_23, Float.valueOf(hvk.b(var2_2 /* !! */ , var8_9 /* !! */ )));
                                                                                            var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                            break block208;
                                                                                        }
                                                                                        case 51: 
                                                                                    }
                                                                                    var23_12 = this;
                                                                                    var9_10 /* !! */  = var7_15;
                                                                                    if (var16_20 /* !! */  == 1) {
                                                                                        var11_17 /* !! */  = var8_9 /* !! */  + 8;
                                                                                        var25_7.putObject(var1_1, var19_23, hvk.a(var2_2 /* !! */ , var8_9 /* !! */ ));
                                                                                        var25_7.putInt(var1_1, var21_24, var9_10 /* !! */ );
                                                                                        var9_10 /* !! */  = var11_17 /* !! */ ;
                                                                                    } else lbl-1000:
                                                                                    // 12 sources

                                                                                    {
                                                                                        var9_10 /* !! */  = var3_3;
                                                                                        var9_10 /* !! */  = var7_15;
                                                                                        var23_12 = this;
                                                                                        var9_10 /* !! */  = var8_9 /* !! */ ;
                                                                                    }
                                                                                }
                                                                                var13_13 /* !! */  = var7_15;
                                                                                var23_12 = this;
                                                                                var11_17 /* !! */  = var12_18;
                                                                                var27_8 /* !! */  = var1_1;
                                                                                if (var9_10 /* !! */  != var8_9 /* !! */ ) {
                                                                                    var8_9 /* !! */  = var4_4;
                                                                                    var12_18 = var5_5;
                                                                                    var15_19 /* !! */  = var14_14;
                                                                                    var14_14 = var3_3;
                                                                                    var7_15 = var11_17 /* !! */ ;
                                                                                    var3_3 = var9_10 /* !! */ ;
                                                                                    var11_17 /* !! */  = (int)var15_19 /* !! */ ;
                                                                                    var25_7 = var23_12;
                                                                                    var23_12 = var24_11;
                                                                                    var24_11 = var26_25;
                                                                                    var9_10 /* !! */  = var12_18;
                                                                                    continue;
                                                                                }
                                                                                var8_9 /* !! */  = var5_5;
                                                                                var13_13 /* !! */  = var9_10 /* !! */ ;
                                                                                var12_18 = var3_3;
                                                                                var9_10 /* !! */  = var14_14;
                                                                                var3_3 = var8_9 /* !! */ ;
                                                                                var8_9 /* !! */  = var11_17 /* !! */ ;
                                                                                var11_17 /* !! */  = var13_13 /* !! */ ;
                                                                                break block184;
                                                                            }
                                                                            var2_2 /* !! */  = (byte[])var25_7;
                                                                            var5_5 = var9_10 /* !! */ ;
                                                                            var8_9 /* !! */  = var7_15;
                                                                            var7_15 = var11_17 /* !! */ ;
                                                                            var24_11 = var23_12;
                                                                            break;
                                                                        }
                                                                        block85: while (true) {
                                                                            var9_10 /* !! */  += var12_18;
                                                                            while (var9_10 /* !! */  < var4_4) {
                                                                                var12_18 = hvk.t(var2_2 /* !! */ , var9_10 /* !! */ , (hvj)var24_11);
                                                                                if (var13_13 /* !! */  != var24_11.a) break block85;
                                                                                var9_10 /* !! */  = hvk.t(var2_2 /* !! */ , var12_18, (hvj)var24_11);
                                                                                var12_18 = var24_11.a;
                                                                                if (var12_18 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                                if (var12_18 > var2_2 /* !! */ .length - var9_10 /* !! */ ) throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                                if (var12_18 == 0) {
                                                                                    var25_7.add(hvu.b);
                                                                                    continue;
                                                                                }
                                                                                var25_7.add(hvu.s(var2_2 /* !! */ , var9_10 /* !! */ , var12_18));
                                                                                continue block85;
                                                                            }
                                                                            break;
                                                                        }
                                                                        var12_18 = var3_3;
                                                                        var12_18 = var8_9 /* !! */ ;
                                                                        var8_9 /* !! */  = var9_10 /* !! */ ;
                                                                        var9_10 /* !! */  = var12_18;
                                                                    }
                                                                    var12_18 = var3_3;
                                                                    var25_7 = var23_12;
                                                                    var12_18 = var4_4;
                                                                    var25_7 = var24_11;
                                                                    var25_7 = this;
                                                                    break block180;
                                                                }
                                                                block87: while (true) {
                                                                    var9_10 /* !! */  += var12_18;
lbl895:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var12_18 = var9_10 /* !! */ ;
                                                                        if (var9_10 /* !! */  >= var4_4) break block87;
                                                                        var14_14 = hvk.t(var2_2 /* !! */ , var9_10 /* !! */ , (hvj)var24_11);
                                                                        var12_18 = var9_10 /* !! */ ;
                                                                        if (var13_13 /* !! */  != var24_11.a) break block87;
                                                                        var9_10 /* !! */  = hvk.t(var2_2 /* !! */ , var14_14, (hvj)var24_11);
                                                                        var12_18 = var24_11.a;
                                                                        if (var12_18 < 0) throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        if (var12_18 != 0) break;
                                                                        var25_7.add("");
                                                                    }
                                                                    var25_7.add(new String(var2_2 /* !! */ , var9_10 /* !! */ , var12_18, hxl.a));
                                                                }
                                                            }
                                                            var9_10 /* !! */  = var3_3;
                                                            var9_10 /* !! */  = var12_18;
                                                            var12_18 = var8_9 /* !! */ ;
                                                        }
                                                        var12_18 = var3_3;
                                                        var12_18 = var8_9 /* !! */ ;
                                                        var25_7 = var23_12;
                                                        var25_7 = this;
                                                        var25_7 = var24_11;
                                                        var8_9 /* !! */  = var4_4;
                                                        var8_9 /* !! */  = var9_10 /* !! */ ;
                                                        var9_10 /* !! */  = var12_18;
                                                    }
                                                    var12_18 = var3_3;
                                                    var3_3 = var4_4;
                                                    var25_7 = this;
                                                    var14_14 = var11_17 /* !! */ ;
                                                    if (var8_9 /* !! */  != var9_10 /* !! */ ) {
                                                        var9_10 /* !! */  = var5_5;
                                                        var11_17 /* !! */  = var13_13 /* !! */ ;
                                                        var15_19 /* !! */  = var14_14;
                                                        var14_14 = var12_18;
                                                        var12_18 = var3_3;
                                                        var27_8 /* !! */  = var1_1;
                                                        var3_3 = var8_9 /* !! */ ;
                                                        var13_13 /* !! */  = var7_15;
                                                        var7_15 = var11_17 /* !! */ ;
                                                        var11_17 /* !! */  = (int)var15_19 /* !! */ ;
                                                        var8_9 /* !! */  = var12_18;
                                                        continue;
                                                    }
                                                    var26_25 = var24_11;
                                                    var24_11 = var23_12;
                                                    var3_3 = var7_15;
                                                    var27_8 /* !! */  = var1_1;
                                                    var3_3 = var5_5;
                                                    var23_12 = var25_7;
                                                    var11_17 /* !! */  = var8_9 /* !! */ ;
                                                    var8_9 /* !! */  = var13_13 /* !! */ ;
                                                    var9_10 /* !! */  = var14_14;
                                                    break block184;
                                                }
                                                while (var12_18 < var3_3) {
                                                    block209: {
                                                        var16_20 /* !! */  = var12_18 + 1;
                                                        var17_21 = var2_2 /* !! */ [var12_18];
                                                        var15_19 /* !! */  = var17_21;
                                                        var12_18 = var16_20 /* !! */ ;
                                                        if (var17_21 < 0) {
                                                            var12_18 = hvk.u(var17_21, var2_2 /* !! */ , var16_20 /* !! */ , (hvj)var25_7);
                                                            var15_19 /* !! */  = var25_7.a;
                                                        }
                                                        var16_20 /* !! */  = (int)(var15_19 /* !! */  >>> 3);
                                                        var17_21 = var15_19 /* !! */  & 7;
                                                        if (var16_20 /* !! */  == 1) break block209;
                                                        if (var16_20 /* !! */  == 2) {
                                                            var27_8 /* !! */  = (hzm)var29_27.a;
                                                            if (var17_21 == var27_8 /* !! */ .t) {
                                                                var12_18 = hyi.U(var2_2 /* !! */ , var12_18, var4_4, (hzm)var27_8 /* !! */ , var29_27.d.getClass(), (hvj)var6_6);
                                                                var26_25 = var25_7.c;
                                                                var15_19 /* !! */  = var3_3;
                                                                var15_19 /* !! */  = var9_10 /* !! */ ;
                                                                var15_19 /* !! */  = var13_13 /* !! */ ;
                                                                continue;
                                                            }
                                                        }
                                                        ** GOTO lbl-1000
                                                    }
                                                    var27_8 /* !! */  = (hzm)var29_27.c;
                                                    if (var17_21 == var27_8 /* !! */ .t) {
                                                        var12_18 = hyi.U(var2_2 /* !! */ , var12_18, var4_4, (hzm)var27_8 /* !! */ , null, (hvj)var6_6);
                                                        var24_11 = var25_7.c;
                                                        var15_19 /* !! */  = var3_3;
                                                        var15_19 /* !! */  = var9_10 /* !! */ ;
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var12_18 = hvk.z((int)var15_19 /* !! */ , var2_2 /* !! */ , var12_18, var4_4, (hvj)var25_7);
                                                        var15_19 /* !! */  = var3_3;
                                                        var15_19 /* !! */  = var9_10 /* !! */ ;
                                                    }
                                                    var15_19 /* !! */  = var3_3;
                                                    var15_19 /* !! */  = var9_10 /* !! */ ;
                                                    var15_19 /* !! */  = var13_13 /* !! */ ;
                                                }
                                                if (var12_18 != var3_3) throw new hxn("Failed to parse the message.");
                                                var28_26.put(var24_11, var26_25);
                                                if (var3_3 != var8_9 /* !! */ ) {
                                                    var8_9 /* !! */  = var5_5;
                                                    var12_18 = var4_4;
                                                    var15_19 /* !! */  = var7_15;
                                                    var7_15 = var13_13 /* !! */ ;
                                                    var11_17 /* !! */  = var14_14;
                                                    var26_25 = this;
                                                    var27_8 /* !! */  = var1_1;
                                                    var24_11 = var25_7;
                                                    var13_13 /* !! */  = (int)var15_19 /* !! */ ;
                                                    var14_14 = var9_10 /* !! */ ;
                                                    var25_7 = var26_25;
                                                    var9_10 /* !! */  = var8_9 /* !! */ ;
                                                    var8_9 /* !! */  = var12_18;
                                                    continue;
                                                }
                                                var12_18 = var9_10 /* !! */ ;
                                                var24_11 = var23_12;
                                            }
                                            var9_10 /* !! */  = var11_17 /* !! */ ;
                                            var14_14 = var5_5;
                                            var23_12 = this;
                                            var8_9 /* !! */  = var7_15;
                                            var8_9 /* !! */  = var13_13 /* !! */ ;
                                            var27_8 /* !! */  = var1_1;
                                            var11_17 /* !! */  = var3_3;
                                            var26_25 = var25_7;
                                            var3_3 = var14_14;
                                        }
                                        var13_13 /* !! */  = var7_15;
                                        if (var8_9 /* !! */  == var3_3 && var3_3 != 0) {
                                            var2_2 /* !! */  = (byte[])var23_12;
                                            var5_5 = var3_3;
                                            var7_15 = var9_10 /* !! */ ;
                                            var3_3 = var11_17 /* !! */ ;
                                            break;
                                        }
                                        if (!var23_12.h) break block210;
                                        var25_7 = var26_25.d;
                                        var28_26 = hwj.a;
                                        var28_26 = hyo.a;
                                        if (var25_7 == hwj.a) break block210;
                                        var28_26 = var23_12.g;
                                        var25_7 = var23_12.m;
                                        var29_27 = var26_25.d;
                                        var7_15 = hvk.a;
                                        var30_28 = var29_27.b((hyf)var28_26, var13_13 /* !! */ );
                                        if (var30_28 != null) break block211;
                                        var7_15 = hvk.s(var8_9 /* !! */ , var2_2 /* !! */ , var11_17 /* !! */ , var4_4, hyi.d(var1_1), (hvj)var6_6);
                                        ** GOTO lbl1067
                                    }
                                    var28_26 = (hws)var27_8 /* !! */ ;
                                    var28_26.c();
                                    var29_27 = var28_26.r;
                                    var31_29 = (hwu)var30_28.a;
                                    if (!var31_29.d || !var31_29.e) break block212;
                                    var31_29 = hzm.a;
                                    switch (var30_28.j().ordinal()) {
                                        default: {
                                            throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf((Object)((hwu)var30_28.a).c))));
                                        }
                                        case 17: {
                                            var25_7 = new hxw();
                                            var7_15 = hvk.n(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** GOTO lbl1067
                                        }
                                        case 16: {
                                            var25_7 = new hww();
                                            var7_15 = hvk.m(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** GOTO lbl1067
                                        }
                                        case 13: {
                                            var31_29 = new hww();
                                            var7_15 = hvk.o(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var31_29, (hvj)var26_25);
                                            hyv.g(var28_26, var13_13 /* !! */ , (List)var31_29, ((hwu)var30_28.a).a, null, (hzd)var25_7);
                                            var29_27.n((hwu)var30_28.a, var31_29);
lbl1067:
                                            // 4 sources

                                            var25_7 = var23_12;
                                            var11_17 /* !! */  = var3_3;
                                            break block181;
                                        }
                                        case 7: {
                                            var25_7 = new hvm(hvm.a, 0, true);
                                            var7_15 = hvk.h(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 6: 
                                        case 14: {
                                            var25_7 = new hww();
                                            var7_15 = hvk.j(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 5: 
                                        case 15: {
                                            var25_7 = new hxw();
                                            var7_15 = hvk.k(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 4: 
                                        case 12: {
                                            var25_7 = new hww();
                                            var7_15 = hvk.o(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 2: 
                                        case 3: {
                                            var25_7 = new hxw();
                                            var7_15 = hvk.p(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 1: {
                                            var25_7 = new hwn(hwn.a, 0, true);
                                            var7_15 = hvk.l(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                            var29_27.n((hwu)var30_28.a, var25_7);
                                            ** break;
                                        }
                                        case 0: 
                                    }
                                    var25_7 = new hwf(hwf.a, 0, true);
                                    var7_15 = hvk.i(var2_2 /* !! */ , var11_17 /* !! */ , (hxk)var25_7, (hvj)var26_25);
                                    var29_27.n((hwu)var30_28.a, var25_7);
                                    ** break;
lbl1105:
                                    // 7 sources

                                    ** GOTO lbl1161
                                }
                                if (var30_28.j() != hzm.n) break block213;
                                var7_15 = hvk.t(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var11_17 /* !! */  = var26_25.a;
                                if (iav.b(var11_17 /* !! */ ) != null) break block214;
                                hyv.i(var28_26, var13_13 /* !! */ , var11_17 /* !! */ , null, (hzd)var25_7);
                                ** GOTO lbl1161
                            }
                            var25_7 = var11_17 /* !! */ ;
                            break block215;
                        }
                        switch (var30_28.j().ordinal()) {
                            default: {
                                var25_7 = null;
                                var7_15 = var11_17 /* !! */ ;
                                ** break;
                            }
                            case 17: {
                                var7_15 = hvk.w(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = hvy.J(var26_25.b);
                                ** break;
                            }
                            case 16: {
                                var7_15 = hvk.t(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = hvy.H(var26_25.a);
                                ** break;
                            }
                            case 13: {
                                throw new IllegalStateException("Shouldn't reach here.");
                            }
                            case 11: {
                                var7_15 = hvk.c(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = var26_25.c;
                                ** break;
                            }
                            case 10: {
                                var25_7 = var30_28.b;
                                var31_29 = hyo.a.a(var25_7.getClass());
                                if (var30_28.n()) {
                                    var7_15 = hvk.f((hyu)var31_29, var2_2 /* !! */ , var11_17 /* !! */ , var4_4, (hvj)var26_25);
                                    var28_26 = var30_28.a;
                                    var25_7 = var26_25.c;
                                    var29_27.m((hwu)var28_26, var25_7);
                                } else {
                                    var25_7 = var28_26 = var29_27.l((hwu)var30_28.a);
                                    if (var28_26 == null) {
                                        var25_7 = var31_29.e();
                                        var29_27.n((hwu)var30_28.a, var25_7);
                                    }
                                    var7_15 = hvk.y(var25_7, (hyu)var31_29, var2_2 /* !! */ , var11_17 /* !! */ , var4_4, (hvj)var6_6);
                                }
                                ** GOTO lbl1161
                            }
                            case 9: {
                                var7_15 = var13_13 /* !! */  << 3 | 4;
                                var25_7 = var30_28.b;
                                var31_29 = hyo.a.a(var25_7.getClass());
                                if (var30_28.n()) {
                                    var7_15 = hvk.e((hyu)var31_29, var2_2 /* !! */ , var11_17 /* !! */ , var4_4, var7_15, (hvj)var6_6);
                                    var25_7 = var30_28.a;
                                    var28_26 = var26_25.c;
                                    var29_27.m((hwu)var25_7, var28_26);
lbl1161:
                                    // 5 sources

                                    var25_7 = var23_12;
                                    var11_17 /* !! */  = var3_3;
                                    break block181;
                                } else {
                                    var25_7 = var28_26 = var29_27.l((hwu)var30_28.a);
                                    if (var28_26 == null) {
                                        var25_7 = var31_29.e();
                                        var29_27.n((hwu)var30_28.a, var25_7);
                                    }
                                    var11_17 /* !! */  = hvk.x(var25_7, (hyu)var31_29, var2_2 /* !! */ , var11_17 /* !! */ , var4_4, var7_15, (hvj)var6_6);
                                    var7_15 = var3_3;
                                    var25_7 = var23_12;
                                    var7_15 = var11_17 /* !! */ ;
                                }
                                break block181;
                            }
                            case 8: {
                                var7_15 = hvk.q(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = var26_25.c;
                                ** break;
                            }
                            case 7: {
                                var7_15 = hvk.w(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var18_22 = var26_25.b != 0L;
                                var25_7 = var18_22;
                                ** break;
                            }
                            case 6: 
                            case 14: {
                                var7_15 = var11_17 /* !! */  + 4;
                                var25_7 = hvk.d(var2_2 /* !! */ , var11_17 /* !! */ );
                                ** break;
                            }
                            case 5: 
                            case 15: {
                                var7_15 = var11_17 /* !! */  + 8;
                                var25_7 = hvk.A(var2_2 /* !! */ , var11_17 /* !! */ );
                                ** break;
                            }
                            case 4: 
                            case 12: {
                                var7_15 = hvk.t(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = var26_25.a;
                                ** break;
                            }
                            case 2: 
                            case 3: {
                                var7_15 = hvk.w(var2_2 /* !! */ , var11_17 /* !! */ , (hvj)var26_25);
                                var25_7 = var26_25.b;
                                ** break;
                            }
                            case 1: {
                                var7_15 = var11_17 /* !! */  + 4;
                                var25_7 = Float.valueOf(hvk.b(var2_2 /* !! */ , var11_17 /* !! */ ));
                                ** break;
                            }
                            case 0: 
                        }
                        var7_15 = var11_17 /* !! */  + 8;
                        var25_7 = hvk.a(var2_2 /* !! */ , var11_17 /* !! */ );
                    }
                    if (var30_28.n()) {
                        var29_27.m((hwu)var30_28.a, var25_7);
                    } else {
                        var29_27.n((hwu)var30_28.a, var25_7);
                    }
                    var11_17 /* !! */  = var3_3;
                    var25_7 = var23_12;
                    break block181;
                }
                var28_26 = hyi.d(var1_1);
                var7_15 = var3_3;
                var25_7 = var23_12;
                var7_15 = hvk.s(var8_9 /* !! */ , var2_2 /* !! */ , var11_17 /* !! */ , var4_4, (hze)var28_26, (hvj)var6_6);
            }
            var15_19 /* !! */  = var4_4;
            var16_20 /* !! */  = var3_3;
            var25_7 = var23_12;
            var23_12 = var24_11;
            var3_3 = var7_15;
            var14_14 = var12_18;
            var7_15 = var8_9 /* !! */ ;
            var11_17 /* !! */  = var9_10 /* !! */ ;
            var24_11 = var26_25;
            var9_10 /* !! */  = var16_20 /* !! */ ;
            var8_9 /* !! */  = (int)var15_19 /* !! */ ;
        }
        if (var7_15 != 1048575) {
            var24_11.putInt(var27_8 /* !! */ , var7_15, var10_16);
        }
        var6_6 = null;
        for (var7_15 = var2_2 /* !! */ .k; var7_15 < var2_2 /* !! */ .l; ++var7_15) {
            var23_12 = var2_2 /* !! */ .j;
            var24_11 = var2_2 /* !! */ .m;
            var6_6 = this.A(var1_1, (int)var23_12[var7_15], var6_6, (hzd)var24_11, var1_1);
        }
        if (var6_6 != null) {
            hzd.g(var27_8 /* !! */ , (hze)var6_6);
        }
        if (var5_5 == 0) {
            if (var3_3 != var4_4) throw new hxn("Failed to parse the message.");
            return var3_3;
        }
        if (var3_3 > var4_4) throw new hxn("Failed to parse the message.");
        if (var8_9 /* !! */  != var5_5) throw new hxn("Failed to parse the message.");
        return var3_3;
    }

    @Override
    public final Object e() {
        return ((hwv)this.g).n();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void g(Object var1_1) {
        block8: {
            if (!hyi.Q(var1_1)) break block8;
            var6_2 = var1_1 instanceof hwv;
            var2_3 = 0;
            if (var6_2) {
                var7_4 = (hwv)var1_1;
                var7_4.memoizedSerializedSize = var7_4.memoizedSerializedSize & -2147483648 | 0x7FFFFFFF;
                var7_4.memoizedHashCode = 0;
                var7_4.y();
            }
            var9_5 = this.c;
            while (var2_3 < var9_5.length) {
                var3_6 = this.v(var2_3);
                var4_7 = hyi.w(var3_6);
                if ((var3_6 = hyi.u(var3_6)) == 9) ** GOTO lbl-1000
                if (var3_6 == 60 || var3_6 == 68) ** GOTO lbl28
                switch (var3_6) {
                    default: {
                        break;
                    }
                    case 50: {
                        var7_4 = hyi.b;
                        var8_8 = var7_4.getObject(var1_1, var4_7);
                        if (var8_8 == null) break;
                        ((hya)var8_8).c();
                        var7_4.putObject(var1_1, var4_7, var8_8);
                        break;
                    }
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: {
                        idi.q(var1_1, var4_7).b();
                        break;
                    }
lbl28:
                    // 1 sources

                    if (!this.R(var1_1, this.p(var2_3), var2_3)) break;
                    this.z(var2_3).g(hyi.b.getObject(var1_1, var4_7));
                    break;
                    case 17: lbl-1000:
                    // 2 sources

                    {
                        if (!this.N(var1_1, var2_3)) break;
                        this.z(var2_3).g(hyi.b.getObject(var1_1, var4_7));
                    }
                }
                var2_3 += 3;
            }
            this.m.e(var1_1);
            if (this.h) {
                idi.v(var1_1);
            }
        }
    }

    @Override
    public final void h(Object object, Object object2) {
        hyi.E(object);
        object2.getClass();
        block26: for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int n2 = this.v(i2);
            long l2 = hyi.w(n2);
            int n3 = this.p(i2);
            switch (hyi.u(n2)) {
                default: {
                    continue block26;
                }
                case 68: {
                    this.G(object, object2, i2);
                    continue block26;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (!this.R(object2, n3, i2)) continue block26;
                    hzj.u(object, l2, hzj.h(object2, l2));
                    this.I(object, n3, i2);
                    continue block26;
                }
                case 60: {
                    this.G(object, object2, i2);
                    continue block26;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if (!this.R(object2, n3, i2)) continue block26;
                    hzj.u(object, l2, hzj.h(object2, l2));
                    this.I(object, n3, i2);
                    continue block26;
                }
                case 50: {
                    Object object3 = hyv.a;
                    hzj.u(object, l2, idi.o(hzj.h(object, l2), hzj.h(object2, l2)));
                    continue block26;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    hxk hxk2 = idi.q(object, l2);
                    hxk hxk3 = idi.q(object2, l2);
                    n2 = hxk2.size();
                    n3 = hxk3.size();
                    Object object3 = hxk2;
                    if (n2 > 0) {
                        object3 = hxk2;
                        if (n3 > 0) {
                            object3 = hxk2;
                            if (!hxk2.c()) {
                                object3 = hxk2.d(n3 + n2);
                            }
                            object3.addAll(hxk3);
                        }
                    }
                    if (n2 <= 0) {
                        object3 = hxk3;
                    }
                    hzj.u(object, l2, object3);
                    continue block26;
                }
                case 17: {
                    this.F(object, object2, i2);
                    continue block26;
                }
                case 16: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.t(object, l2, hzj.f(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 15: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 14: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.t(object, l2, hzj.f(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 13: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 12: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 11: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 10: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.u(object, l2, hzj.h(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 9: {
                    this.F(object, object2, i2);
                    continue block26;
                }
                case 8: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.u(object, l2, hzj.h(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 7: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.m(object, l2, hzj.w(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 6: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 5: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.t(object, l2, hzj.f(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 4: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.s(object, l2, hzj.d(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 3: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.t(object, l2, hzj.f(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 2: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.t(object, l2, hzj.f(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 1: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.r(object, l2, hzj.c(object2, l2));
                    this.H(object, i2);
                    continue block26;
                }
                case 0: {
                    if (!this.N(object2, i2)) continue block26;
                    hzj.q(object, l2, hzj.b(object2, l2));
                    this.H(object, i2);
                }
            }
        }
        hyv.o(object, object2);
        if (this.h) {
            hyv.n(object, object2);
        }
    }

    @Override
    public final void i(Object object, byte[] byArray, int n2, int n3, hvj hvj2) {
        this.c(object, byArray, n2, n3, 0, hvj2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean j(Object var1_1, Object var2_2) {
        block23: for (var3_3 = 0; var3_3 < this.c.length; var3_3 += 3) {
            block43: {
                var4_4 = this.v(var3_3);
                var8_7 = hyi.w(var4_4);
                switch (hyi.u(var4_4)) {
                    default: {
                        continue block23;
                    }
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: 
                    case 59: 
                    case 60: 
                    case 61: 
                    case 62: 
                    case 63: 
                    case 64: 
                    case 65: 
                    case 66: 
                    case 67: 
                    case 68: {
                        var6_6 = this.s(var3_3) & 1048575;
                        if (hzj.d(var1_1, var6_6) == hzj.d(var2_2, var6_6) && a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7))) continue block23;
                        break block43;
                    }
                    case 50: {
                        var5_5 = a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7));
                        ** GOTO lbl16
                    }
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: {
                        var5_5 = a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7));
lbl16:
                        // 2 sources

                        if (var5_5) continue block23;
                        break block43;
                    }
                    case 17: {
                        if (this.L(var1_1, var2_2, var3_3) && a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7))) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 16: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.f(var1_1, var8_7) == hzj.f(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 15: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 14: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.f(var1_1, var8_7) == hzj.f(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 13: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 12: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 11: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 10: {
                        if (this.L(var1_1, var2_2, var3_3) && a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7))) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 9: {
                        if (this.L(var1_1, var2_2, var3_3) && a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7))) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 8: {
                        if (this.L(var1_1, var2_2, var3_3) && a.k(hzj.h(var1_1, var8_7), hzj.h(var2_2, var8_7))) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 7: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.w(var1_1, var8_7) == hzj.w(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 6: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 5: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.f(var1_1, var8_7) == hzj.f(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 4: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.d(var1_1, var8_7) == hzj.d(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 3: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.f(var1_1, var8_7) == hzj.f(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 2: {
                        if (this.L(var1_1, var2_2, var3_3) && hzj.f(var1_1, var8_7) == hzj.f(var2_2, var8_7)) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 1: {
                        if (this.L(var1_1, var2_2, var3_3) && Float.floatToIntBits(hzj.c(var1_1, var8_7)) == Float.floatToIntBits(hzj.c(var2_2, var8_7))) {
                            continue block23;
                        }
                        break block43;
                    }
                    case 0: 
                }
                if (this.L(var1_1, var2_2, var3_3) && Double.doubleToLongBits(hzj.b(var1_1, var8_7)) == Double.doubleToLongBits(hzj.b(var2_2, var8_7))) continue;
            }
            return false;
        }
        if (!hzd.f(var1_1).equals(hzd.f(var2_2))) {
            return false;
        }
        if (this.h) {
            return idi.s(var1_1).equals(idi.s(var2_2));
        }
        return true;
    }

    @Override
    public final boolean k(Object object) {
        int n2 = 0;
        int n3 = 1048575;
        for (int i2 = 0; i2 < this.k; ++i2) {
            int n4 = this.j[i2];
            int n5 = this.p(n4);
            int n6 = this.v(n4);
            int n7 = this.c[n4 + 2];
            int n8 = n7 & 0xFFFFF;
            n7 = 1 << (n7 >>> 20);
            if (n8 != n3) {
                if (n8 != 1048575) {
                    long l2 = n8;
                    n2 = b.getInt(object, l2);
                }
                n3 = n8;
            }
            if ((0x10000000 & n6) != 0 && !this.O(object, n4, n3, n2, n7)) {
                return false;
            }
            n8 = hyi.u(n6);
            if (n8 != 9 && n8 != 17) {
                Object object2;
                Object object3;
                if (n8 != 27) {
                    if (n8 != 60 && n8 != 68) {
                        if (n8 != 49) {
                            if (n8 != 50 || (object3 = (hya)hzj.h(object, hyi.w(n6))).isEmpty() || ((hzm)((Object)idi.z((Object)this.B((int)n4)).a)).s != hzn.i) continue;
                            Iterator iterator = object3.values().iterator();
                            object3 = null;
                            while (iterator.hasNext()) {
                                Object v2 = iterator.next();
                                object2 = object3;
                                if (object3 == null) {
                                    object2 = hyo.a.a(v2.getClass());
                                }
                                object3 = object2;
                                if (object2.k(v2)) continue;
                                return false;
                            }
                            continue;
                        }
                    } else {
                        if (!this.R(object, n5, n4) || hyi.P(object, n6, this.z(n4))) continue;
                        return false;
                    }
                }
                if ((object2 = (List)hzj.h(object, hyi.w(n6))).isEmpty()) continue;
                object3 = this.z(n4);
                for (n8 = 0; n8 < object2.size(); ++n8) {
                    if (object3.k(object2.get(n8))) continue;
                    return false;
                }
                continue;
            }
            if (!this.O(object, n4, n3, n2, n7) || hyi.P(object, n6, this.z(n4))) continue;
            return false;
        }
        return !this.h || idi.s(object).j();
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void l(Object var1_1, hvz var2_2, hwj var3_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 148[TRYBLOCK] [358 : 4843->4851)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void m(Object var1_1, dlm var2_2) {
        if (this.h && !(var13_3 = idi.s(var1_1)).i()) {
            var14_4 = var13_3.e();
            var13_3 = (Map.Entry)var14_4.next();
        } else {
            var13_3 = null;
            var14_4 = null;
        }
        var15_5 = this.c;
        var17_6 = hyi.b;
        var4_7 = 1048575;
        var3_8 = 0;
        block71: for (var5_9 = 0; var5_9 < var15_5.length; var5_9 += 3) {
            var9_13 = this.v(var5_9);
            var7_11 = this.p(var5_9);
            var8_12 = hyi.u(var9_13);
            if (var8_12 <= 17) {
                var10_14 = this.c[var5_9 + 2];
                var6_10 = var10_14 & 1048575;
                if (var6_10 != var4_7) {
                    var3_8 = var6_10 == 1048575 ? 0 : var17_6.getInt(var1_1, var6_10);
                    var4_7 = var6_10;
                }
                var6_10 = 1 << (var10_14 >>> 20);
                var16_16 = var13_3;
            } else {
                var16_16 = var13_3;
                var6_10 = 0;
            }
            while (var13_3 != null && ((hwu)var13_3.getKey()).b <= var7_11) {
                idi.I(var2_2, (Map.Entry)var13_3);
                if (var14_4.hasNext()) {
                    var13_3 = (Map.Entry)var14_4.next();
                    continue;
                }
                var13_3 = null;
            }
            var11_15 = hyi.w(var9_13);
            switch (var8_12) lbl-1000:
            // 21 sources

            {
                default: {
                    continue block71;
                }
                case 68: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.A(var7_11, var17_6.getObject(var1_1, var11_15), this.z(var5_9));
                    continue block71;
                }
                case 67: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.I(var7_11, hyi.x(var1_1, var11_15));
                    continue block71;
                }
                case 66: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.H(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 65: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.G(var7_11, hyi.x(var1_1, var11_15));
                    continue block71;
                }
                case 64: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.F(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 63: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.w(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 62: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.K(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 61: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.u(var7_11, (hvu)var17_6.getObject(var1_1, var11_15));
                    continue block71;
                }
                case 60: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.D(var7_11, var17_6.getObject(var1_1, var11_15), this.z(var5_9));
                    continue block71;
                }
                case 59: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    hyi.V(var7_11, var17_6.getObject(var1_1, var11_15), var2_2);
                    continue block71;
                }
                case 58: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.t(var7_11, hyi.S(var1_1, var11_15));
                    continue block71;
                }
                case 57: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.x(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 56: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.y(var7_11, hyi.x(var1_1, var11_15));
                    continue block71;
                }
                case 55: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.B(var7_11, hyi.q(var1_1, var11_15));
                    continue block71;
                }
                case 54: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.L(var7_11, hyi.x(var1_1, var11_15));
                    continue block71;
                }
                case 53: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.C(var7_11, hyi.x(var1_1, var11_15));
                    continue block71;
                }
                case 52: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.z(var7_11, hyi.o(var1_1, var11_15));
                    continue block71;
                }
                case 51: {
                    if (!this.R(var1_1, var7_11, var5_9)) ** GOTO lbl-1000
                    var2_2.v(var7_11, hyi.n(var1_1, var11_15));
                    continue block71;
                }
                case 50: {
                    var18_17 = var17_6.getObject(var1_1, var11_15);
                    if (var18_17 == null) ** GOTO lbl-1000
                    var16_16 = idi.z(this.B(var5_9));
                    var19_18 = (hya)var18_17;
                    var18_17 = var2_2.a;
                    var18_17 = var19_18.entrySet().iterator();
                    while (true) {
                        if (!var18_17.hasNext()) ** GOTO lbl-1000
                        var19_18 = var18_17.next();
                        ((hwd)var2_2.a).A(var7_11, 2);
                        var20_19 = var2_2.a;
                        var6_10 = dlm.M((gpm)var16_16, var19_18.getKey(), var19_18.getValue());
                        ((hwd)var20_19).C(var6_10);
                        var20_19 = var2_2.a;
                        var21_20 = var19_18.getKey();
                        var19_18 = var19_18.getValue();
                        dlm.N((hwd)var20_19, (gpm)var16_16, var21_20, var19_18);
                    }
                }
                case 49: {
                    hyv.w(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, this.z(var5_9));
                    continue block71;
                }
                case 48: {
                    hyv.D(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 47: {
                    hyv.C(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 46: {
                    hyv.B(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 45: {
                    hyv.A(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 44: {
                    hyv.s(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 43: {
                    hyv.F(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 42: {
                    hyv.p(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 41: {
                    hyv.t(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 40: {
                    hyv.u(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 39: {
                    hyv.x(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 38: {
                    hyv.G(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 37: {
                    hyv.y(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 36: {
                    hyv.v(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 35: {
                    hyv.r(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, true);
                    continue block71;
                }
                case 34: {
                    hyv.D(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 33: {
                    hyv.C(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 32: {
                    hyv.B(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 31: {
                    hyv.A(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 30: {
                    hyv.s(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 29: {
                    hyv.F(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 28: {
                    hyv.q(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2);
                    continue block71;
                }
                case 27: {
                    hyv.z(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, this.z(var5_9));
                    continue block71;
                }
                case 26: {
                    hyv.E(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2);
                    continue block71;
                }
                case 25: {
                    hyv.p(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 24: {
                    hyv.t(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 23: {
                    hyv.u(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 22: {
                    hyv.x(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 21: {
                    hyv.G(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 20: {
                    hyv.y(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 19: {
                    hyv.v(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 18: {
                    hyv.r(this.p(var5_9), (List)var17_6.getObject(var1_1, var11_15), var2_2, false);
                    continue block71;
                }
                case 17: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.A(var7_11, var17_6.getObject(var1_1, var11_15), this.z(var5_9));
                    continue block71;
                }
                case 16: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.I(var7_11, var17_6.getLong(var1_1, var11_15));
                    continue block71;
                }
                case 15: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.H(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 14: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.G(var7_11, var17_6.getLong(var1_1, var11_15));
                    continue block71;
                }
                case 13: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.F(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 12: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.w(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 11: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.K(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 10: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.u(var7_11, (hvu)var17_6.getObject(var1_1, var11_15));
                    continue block71;
                }
                case 9: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.D(var7_11, var17_6.getObject(var1_1, var11_15), this.z(var5_9));
                    continue block71;
                }
                case 8: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    hyi.V(var7_11, var17_6.getObject(var1_1, var11_15), var2_2);
                    continue block71;
                }
                case 7: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.t(var7_11, hzj.w(var1_1, var11_15));
                    continue block71;
                }
                case 6: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.x(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 5: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.y(var7_11, var17_6.getLong(var1_1, var11_15));
                    continue block71;
                }
                case 4: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.B(var7_11, var17_6.getInt(var1_1, var11_15));
                    continue block71;
                }
                case 3: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.L(var7_11, var17_6.getLong(var1_1, var11_15));
                    continue block71;
                }
                case 2: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.C(var7_11, var17_6.getLong(var1_1, var11_15));
                    continue block71;
                }
                case 1: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.z(var7_11, hzj.c(var1_1, var11_15));
                    continue block71;
                }
                case 0: {
                    if (!this.O(var1_1, var5_9, var4_7, var3_8, var6_10)) continue block71;
                    var2_2.v(var7_11, hzj.b(var1_1, var11_15));
                }
            }
        }
        while (var13_3 != null) {
            idi.I(var2_2, (Map.Entry)var13_3);
            if (var14_4.hasNext()) {
                var13_3 = (Map.Entry)var14_4.next();
                continue;
            }
            var13_3 = null;
        }
        hzd.f(var1_1).f(var2_2);
    }
}

