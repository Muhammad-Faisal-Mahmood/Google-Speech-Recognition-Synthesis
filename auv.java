/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.ReentrantLock;

public final class auv
extends jqs
implements jro {
    int a;
    final avc b;
    final int[] c;
    final String[] d;
    private Object e;

    public auv(avc avc2, int[] nArray, String[] stringArray, jqb jqb2) {
        this.b = avc2;
        this.c = nArray;
        this.d = stringArray;
        super(2, jqb2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object var1_1) {
        block22: {
            block16: {
                block20: {
                    block17: {
                        block18: {
                            block19: {
                                var11_3 /* !! */  = jqh.a;
                                var2_4 = this.a;
                                var4_5 /* !! */  = 0;
                                if (var2_4 == 0) break block17;
                                if (var2_4 == 1) break block18;
                                if (var2_4 != 2) break block19;
                                var9_6 = (jyy)this.e;
                                jns.ak(var1_1);
                                var1_1 = var9_6;
                                ** GOTO lbl-1000
                            }
                            try {
                                jns.ak(var1_1);
                                ** GOTO lbl68
                            }
                            catch (Throwable var10_12) {
                                break block16;
                            }
                        }
                        var9_6 = (jyy)this.e;
                        jns.ak(var1_1);
                        var10_13 = var1_1;
                        var1_1 = var9_6;
                        break block20;
                    }
                    jns.ak(var1_1);
                    var9_6 = (jyy)this.e;
                    var10_13 = this.b;
                    var1_1 = this.c;
                    jse.e(var1_1, "tableIds");
                    var13_15 = var10_13.e;
                    var10_13 = (ReentrantLock)var13_15.d;
                    var10_13.lock();
                    var5_9 = ((Object)var1_1).length;
                    var3_8 = 0;
                    for (var2_4 = 0; var2_4 < var5_9; ++var2_4) {
                        var6_10 = var1_1[var2_4];
                        var12_14 = var13_15.b;
                        var7_11 = ((long[])var12_14)[var6_10];
                        ((long[])var12_14)[var6_10] = var7_11 + 1L;
                        if (var7_11 != 0L) continue;
                        var13_15.a = true;
                        var3_8 = 1;
                        continue;
                    }
                    var10_13.unlock();
                    var1_1 = var9_6;
                    if (var3_8 == 0) ** GOTO lbl-1000
                    var1_1 = this.b;
                    this.e = var9_6;
                    this.a = 1;
                    var10_13 = wf.g(var1_1.a, this);
                    if (var10_13 == var11_3 /* !! */ ) ** GOTO lbl67
                    var1_1 = var9_6;
                }
                var12_14 = this.b;
                var9_6 = (jqf)var10_13;
                var10_13 = new aus((avc)var12_14, null, 0);
                this.e = var1_1;
                this.a = 2;
                if (jse.ae((jqf)var9_6, (jro)var10_13, this) == var11_3 /* !! */ ) ** GOTO lbl67
lbl-1000:
                // 3 sources

                {
                    block21: {
                        var12_14 = new jsj();
                        var10_13 = this.b.f;
                        var9_6 = new auu((jsj)var12_14, (jyy)var1_1, this.d, this.c);
                        this.e = null;
                        this.a = 3;
                        if (var10_13.N((jyy)var9_6, this) != var11_3 /* !! */ ) break block21;
lbl67:
                        // 3 sources

                        return var11_3 /* !! */ ;
                    }
                    var1_1 = new jnx();
                    throw var1_1;
                }
            }
            var1_1 = this.b;
            var9_6 = this.c;
            jse.e(var9_6, "tableIds");
            var12_14 = var1_1.e;
            var1_1 = (ReentrantLock)var12_14.d;
            var1_1.lock();
            try {}
            catch (Throwable var9_7) {
                var1_1.unlock();
                throw var9_7;
            }
            break block22;
lbl83:
            // 1 sources

            while (true) {
                if (var2_4 >= var3_8) {
                    var1_1.unlock();
                    throw var10_12;
                }
                var4_5 /* !! */  = (int)var9_6[var2_4];
                {
                    var11_3 /* !! */  = var12_14.b;
                    var7_11 = ((long[])var11_3 /* !! */ )[var4_5 /* !! */ ];
                    ((long[])var11_3 /* !! */ )[var4_5 /* !! */ ] = -1L + var7_11;
                    if (var7_11 == 1L) {
                        var12_14.a = true;
                    }
                    ++var2_4;
                    continue;
                }
                break;
            }
            catch (Throwable var1_2) {
                var10_13.unlock();
                throw var1_2;
            }
        }
        var3_8 = ((Object)var9_6).length;
        var2_4 = var4_5 /* !! */ ;
        ** while (true)
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new auv(this.b, this.c, this.d, jqb2);
        ((auv)jqb2).e = object;
        return jqb2;
    }
}

