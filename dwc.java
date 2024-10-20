/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

public final class dwc
implements gui {
    public static final int a = 0;
    private static volatile gfb h = new gfb(new dwb(0));
    private final String b;
    private final String c;
    private Object d;
    private volatile int e = -1;
    private volatile Object f;
    private volatile boolean g;
    private final bng i;
    private volatile dml j;

    public dwc(String string, String string2, bng bng2, String string3) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.i = bng2;
        this.g = true;
    }

    public dwc(String string, String string2, Object object, bng bng2) {
        this.b = string;
        this.c = string2;
        this.d = object;
        this.i = bng2;
        this.g = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object c(dua var1_1) {
        block23: {
            block26: {
                block27: {
                    block22: {
                        block24: {
                            block25: {
                                var2_4 = this.e;
                                var6_5 = this.f;
                                if (this.j != null && var2_4 >= this.j.c()) {
                                    var5_6 = var6_5;
                                    if (var6_5 != null) return var5_6;
                                }
                                // MONITORENTER : this
                                var5_6 = this.j;
                                var7_7 = null;
                                var6_5 = null;
                                if (var5_6 == null) {
                                    var8_8 = this.i;
                                    var5_6 = this.b;
                                    var5_6 = dua.f() != false ? new dml(null) : var8_8.b((dua)var1_1, (String)dtx.c((Context)var1_1.c, (String)var5_6)).h;
                                    this.j = var5_6;
                                }
                                if (this.e >= this.j.c()) break block23;
                                this.e = this.j.c();
                                var4_9 = dua.f();
                                var8_8 = this.c;
                                var10_10 = this.b;
                                var9_11 = this.i;
                                var3_12 = var4_9;
                                if (var1_1 != null) break block24;
                                if (!var4_9) break block25;
                                var1_1 = var7_7;
                                break block26;
                            }
                            var3_12 = false;
                        }
                        if (!(var7_7 = dtv.a(var1_1.c)).g()) ** GOTO lbl-1000
                        var11_13 = var7_7.c();
                        var5_6 = dtx.a((String)var10_10);
                        if ((var5_6 = ((dlm)var11_13).c((Uri)var5_6, null, (String)var8_8)) != null) {
                            var5_6 = var9_11.a((String)var8_8, (String)var5_6);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_6 = null;
                        }
                        if (var3_12) break block27;
                        var11_13 = dtx.c(var1_1.c, (String)var10_10);
                        if (var9_11.a) {
                            fxf.E(true, "DirectBoot aware package %s can not access account-scoped flags.", var11_13);
                        }
                        var10_10 = var1_1.d();
                        var12_14 = new dpw(var1_1, var11_13, 6, null);
                        dww.c(var10_10.be(var12_14));
                        var1_1 = ((hac)var9_11.b((dua)var1_1, (String)var11_13).d().a).get(var8_8);
                        if (var1_1 == null) {
                            var1_1 = var6_5;
                        } else {
                            try {
                                var1_1 = var9_11.c.a(var1_1);
                                break block22;
                            }
                            catch (IOException var1_2) {
                            }
                            catch (ClassCastException var1_3) {
                                // empty catch block
                            }
                            Log.e((String)"PhenotypeCombinedFlags", (String)"Invalid Phenotype flag value for flag ".concat((String)var8_8), (Throwable)var1_1);
                            var1_1 = var6_5;
                        }
                    }
                    if (!var7_7.g()) break block26;
                }
                var1_1 = var5_6;
            }
            var5_6 = var1_1;
            if (var1_1 == null) {
                if (this.g) {
                    // MONITORENTER : this
                    if (this.g) {
                        var1_1 = this.i.a(this.c, (String)this.d);
                        fxf.K(var1_1);
                        this.d = var1_1;
                        this.g = false;
                    }
                    // MONITOREXIT : this
                }
                var5_6 = this.d;
            }
            this.f = var5_6;
        }
        var5_6 = this.f;
        // MONITOREXIT : this
        return var5_6;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object a() {
        void var1_5;
        Context context;
        Context context2 = dua.a;
        duc.e = true;
        if (duc.f == null) {
            duc.f = new dub();
        }
        if ((context = dua.a) == null) {
            if (!duc.a()) throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
            return this.c((dua)var1_5);
        }
        dua dua2 = dua.a(context);
        return this.c((dua)var1_5);
    }

    public final Object b(Context context) {
        context = context.getApplicationContext();
        fxf.K(context);
        return this.c(dua.a(context));
    }
}

