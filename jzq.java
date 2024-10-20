/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class jzq
implements jyq,
kad,
jyy,
jyx {
    public int a;
    public int b;
    public final juc c;
    public dml[] d;
    private int e;

    public jzq() {
        throw null;
    }

    public jzq(Object object) {
        this.c = new juc(object, jud.a);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(jyy var1_1, jqb var2_2) {
        block35: {
            block36: {
                block37: {
                    block38: {
                        block39: {
                            if (!(var2_2 /* !! */  instanceof jzl)) ** GOTO lbl-1000
                            var6_3 /* !! */  = var2_2 /* !! */ ;
                            var3_7 = var6_3 /* !! */ .e;
                            if ((var3_7 & -2147483648) != 0) {
                                var6_3 /* !! */ .e = var3_7 + -2147483648;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var6_3 /* !! */  = new jzl(this, (jqb)var2_2 /* !! */ );
                            }
                            var14_8 = var6_3 /* !! */ .d;
                            var19_9 = jqh.a;
                            var3_7 = var6_3 /* !! */ .e;
                            if (var3_7 == 0) break block37;
                            if (var3_7 == 1) break block38;
                            if (var3_7 == 2) break block39;
                            if (var3_7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var13_10 = var6_3 /* !! */ .c;
                            var10_11 = var6_3 /* !! */ .b;
                            var7_12 /* !! */  = var6_3 /* !! */ .h;
                            var11_13 = var6_3 /* !! */ .a;
                            var8_14 = var6_3 /* !! */ .g;
                            var2_2 /* !! */  = var7_12 /* !! */ ;
                            var1_1 = var8_14;
                            try {
                                jns.ak(var14_8);
                                var17_15 = var6_3 /* !! */ ;
                                ** GOTO lbl99
                            }
                            catch (Throwable var6_4) {
                                break block35;
                            }
                        }
                        var12_16 = var6_3 /* !! */ .c;
                        var15_17 = var6_3 /* !! */ .b;
                        var7_12 /* !! */  = var6_3 /* !! */ .h;
                        var16_18 = var6_3 /* !! */ .a;
                        var9_19 = var6_3 /* !! */ .g;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var9_19;
                        {
                            jns.ak(var14_8);
                            var14_8 = var6_3 /* !! */ ;
                            var6_3 /* !! */  = var7_12 /* !! */ ;
                            ** GOTO lbl148
                        }
                    }
                    var7_12 /* !! */  = var6_3 /* !! */ .h;
                    var9_19 = var6_3 /* !! */ .a;
                    var8_14 = var6_3 /* !! */ .g;
                    var2_2 /* !! */  = var7_12 /* !! */ ;
                    var1_1 = var8_14;
                    {
                        jns.ak(var14_8);
                        break block36;
                    }
                }
                jns.ak(var14_8);
                synchronized (this) {
                    var2_2 /* !! */  = this.d;
                    if (var2_2 /* !! */  == null) {
                        var7_12 /* !! */  = new dml[2];
                        this.d = var7_12 /* !! */ ;
                    } else {
                        var4_20 = this.a;
                        var3_7 = var2_2 /* !! */ .length;
                        var7_12 /* !! */  = var2_2 /* !! */ ;
                        if (var4_20 >= var3_7) {
                            var2_2 /* !! */  = Arrays.copyOf(var2_2 /* !! */ , var3_7 + var3_7);
                            jse.d(var2_2 /* !! */ , "copyOf(...)");
                            var7_12 /* !! */  = var2_2 /* !! */ ;
                            this.d = var7_12 /* !! */ ;
                        }
                    }
                    var4_20 = this.b;
                    do {
                        var8_14 = var7_12 /* !! */ [var4_20];
                        var2_2 /* !! */  = var8_14;
                        if (var8_14 == null) {
                            var7_12 /* !! */ [var4_20] = var2_2 /* !! */  = new dml(null, null, null);
                        }
                        var3_7 = ++var4_20;
                        if (var4_20 >= var7_12 /* !! */ .length) {
                            var3_7 = 0;
                        }
                        var4_20 = var3_7;
                    } while (((AtomicReference)var2_2 /* !! */ .a).get() != null);
                    var8_14 = var2_2 /* !! */ .a;
                    var7_12 /* !! */  = jzm.a;
                    ((AtomicReference)var8_14).set(var7_12 /* !! */ );
                    this.b = var3_7;
                    ++this.a;
                }
                try {
                    var5_21 = var1_1 instanceof jzn;
                    if (!var5_21) {
                        var8_14 = this;
                        var9_19 = var1_1;
                        var7_12 /* !! */  = var2_2 /* !! */ ;
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var6_5) {
                    var1_1 = this;
                    break block35;
                }
            }
            var2_2 /* !! */  = var7_12 /* !! */ ;
            var1_1 = var8_14;
            {
                var10_11 = (jwi)var6_3 /* !! */ .d().get(jwi.c);
                var13_10 = null;
                var11_13 = var9_19;
                var17_15 = var6_3 /* !! */ ;
lbl99:
                // 2 sources

                while (true) {
                    block41: {
                        block40: {
                            var2_2 /* !! */  = var7_12 /* !! */ ;
                            var1_1 = var8_14;
                            var18_22 = var8_14.c.a;
                            if (var10_11 != null) {
                                var2_2 /* !! */  = var7_12 /* !! */ ;
                                var1_1 = var8_14;
                                jns.au((jwi)var10_11);
                            }
                            if (var13_10 == null) break block40;
                            var2_2 /* !! */  = var7_12 /* !! */ ;
                            var1_1 = var8_14;
                            var14_8 = var17_15;
                            var15_17 = var10_11;
                            var6_3 /* !! */  = var7_12 /* !! */ ;
                            var16_18 = var11_13;
                            var9_19 = var8_14;
                            var12_16 = var13_10;
                            if (jse.i(var13_10, var18_22)) break block41;
                        }
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var6_3 /* !! */  = var18_22 == kag.a ? null : var18_22;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.g = var8_14;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.a = var11_13;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.h = var7_12 /* !! */ ;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.b = var10_11;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.c = var18_22;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        var17_15.e = 2;
                        var2_2 /* !! */  = var7_12 /* !! */ ;
                        var1_1 = var8_14;
                        if (var11_13.bJ(var6_3 /* !! */ , (jqb)var17_15) == var19_9) break;
                        var12_16 = var18_22;
                        var9_19 = var8_14;
                        var16_18 = var11_13;
                        var6_3 /* !! */  = var7_12 /* !! */ ;
                        var15_17 = var10_11;
                        var14_8 = var17_15;
                    }
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var7_12 /* !! */  = var6_3 /* !! */ .a;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var8_14 = jzm.a;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var18_22 = ((AtomicReference)var7_12 /* !! */ ).getAndSet(var8_14);
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    jse.b(var18_22);
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var5_21 = jve.a;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var17_15 = var14_8;
                    var10_11 = var15_17;
                    var7_12 /* !! */  = var6_3 /* !! */ ;
                    var11_13 = var16_18;
                    var8_14 = var9_19;
                    var13_10 = var12_16;
                    if (var18_22 == jzm.b) continue;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.g = var9_19;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.a = var16_18;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.h = var6_3 /* !! */ ;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.b = var15_17;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.c = var12_16;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var14_8.e = 3;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var8_14 = new jul(jjj.n((jqb)var14_8), 1);
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var8_14.r();
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var10_11 = var6_3 /* !! */ .a;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var7_12 /* !! */  = jzm.a;
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    if (!a.l((AtomicReference)var10_11, var7_12 /* !! */ , var8_14)) {
                        var2_2 /* !! */  = var6_3 /* !! */ ;
                        var1_1 = var9_19;
                        var8_14.bD(jon.a);
                    }
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var8_14 = var8_14.a();
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    if (var8_14 == jqh.a) {
                        var2_2 /* !! */  = var6_3 /* !! */ ;
                        var1_1 = var9_19;
                        jsd.j((jqb)var14_8);
                    }
                    var2_2 /* !! */  = var6_3 /* !! */ ;
                    var1_1 = var9_19;
                    var7_12 /* !! */  = var8_14;
                    if (var8_14 != jqh.a) {
                        var2_2 /* !! */  = var6_3 /* !! */ ;
                        var1_1 = var9_19;
                        var7_12 /* !! */  = jon.a;
                    }
                    if (var7_12 /* !! */  == var19_9) break;
                    var17_15 = var14_8;
                    var10_11 = var15_17;
                    var7_12 /* !! */  = var6_3 /* !! */ ;
                    var11_13 = var16_18;
                    var8_14 = var9_19;
                    var13_10 = var12_16;
                }
                return var19_9;
            }
lbl-1000:
            // 1 sources

            {
                var7_12 /* !! */  = (jzn)var1_1;
                var6_3 /* !! */ .g = this;
                var6_3 /* !! */ .a = var1_1;
                var6_3 /* !! */ .h = var2_2 /* !! */ ;
                var6_3 /* !! */ .e = 1;
                throw null;
            }
        }
        synchronized (var1_1) {
            var1_1.a = var3_7 = var1_1.a - 1;
            if (var3_7 == 0) {
                var1_1.b = 0;
            }
            jse.c(var2_2 /* !! */ , "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            ((AtomicReference)var2_2 /* !! */ .a).set(null);
            var2_2 /* !! */  = jzr.a;
            throw var6_6;
        }
    }

    public final void b(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = kag.a;
        }
        this.c(null, object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final jyx bI(jqf object, int n2, int n3) {
        boolean bl2 = jve.a;
        int n4 = n3;
        if (n2 < 2) {
            if (n3 == 2) return this;
            n4 = 1;
        }
        if (n2 == 0) return this;
        return new jzv(this, (jqf)object, n2, n4);
    }

    @Override
    public final Object bJ(Object object, jqb jqb2) {
        this.b(object);
        return jon.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(Object dmlArray, Object object) {
        int n2;
        dml dml2;
        Object object2;
        synchronized (this) {
            boolean bl2;
            object2 = this.c.a;
            if (dmlArray != null && !(bl2 = jse.i(object2, dmlArray))) {
                return false;
            }
            bl2 = jse.i(object2, dml2);
            if (bl2) {
                return true;
            }
            this.c.c(dml2);
            n2 = this.e;
            if ((n2 & 1) != 0) {
                this.e = n2 + 2;
                return true;
            }
            this.e = ++n2;
            dmlArray = this.d;
        }
        while (true) {
            int n3;
            if (dmlArray != null) {
                block9: for (n3 = 0; n3 < dmlArray.length; ++n3) {
                    kbt kbt2;
                    Object v2;
                    dml2 = dmlArray[n3];
                    if (dml2 == null) continue;
                    while ((v2 = ((AtomicReference)dml2.a).get()) != null && v2 != (kbt2 = jzm.b)) {
                        object2 = jzm.a;
                        if (v2 == object2) {
                            if (!a.l((AtomicReference)dml2.a, v2, kbt2)) continue;
                            continue block9;
                        }
                        if (!a.l((AtomicReference)dml2.a, v2, object2)) continue;
                        ((jul)v2).bD(jon.a);
                        continue block9;
                    }
                }
            }
            synchronized (this) {
                n3 = this.e;
                if (n3 == n2) {
                    this.e = n2 + 1;
                    return true;
                }
                dmlArray = this.d;
            }
            n2 = n3;
        }
    }
}

