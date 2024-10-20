/*
 * Decompiled with CFR 0.152.
 */
final class etm
extends jqs
implements jro {
    Object a;
    int b;
    final etn c;

    public etm(etn etn2, jqb jqb2) {
        this.c = etn2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(Object var1_1) {
        block8: {
            block10: {
                block9: {
                    block6: {
                        block7: {
                            var3_2 /* !! */  = jqh.a;
                            var2_3 = this.b;
                            if (var2_3 == 0) break block6;
                            if (var2_3 == 1) break block7;
                            var3_2 /* !! */  = this.a;
                            jns.ak(var1_1);
                            var1_1 = var3_2 /* !! */ ;
                            break block8;
                        }
                        jns.ak(var1_1);
                        ** GOTO lbl-1000
                    }
                    jns.ak(var1_1);
                    if (this.c.g.bH()) {
                        var1_1 = dww.f(eax.a.l());
                        var1_1.g(ebo.f);
                        return var1_1.f();
                    }
                    var1_1 = this.c;
                    var1_1 = var1_1.h.a(var1_1.b, var1_1.a);
                    if (var1_1.a || var1_1.b > 1) break block9;
                    var1_1 = this.c;
                    if (var1_1.e) {
                        var1_1 = var1_1.c.b();
                        this.b = 1;
                        ** if ((var1_1 = jsd.l((hpn)var1_1, (jqb)this)) == var3_2 /* !! */ ) goto lbl-1000
                    }
                    ** GOTO lbl30
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = (eax)var1_1;
                        ** GOTO lbl40
                    }
lbl-1000:
                    // 1 sources

                    {
                        return var3_2 /* !! */ ;
lbl30:
                        // 1 sources

                        var1_1.h.b(var1_1.b, var1_1.a);
                        var1_1 = dww.f(eax.a.l());
                        var1_1.g(ebo.j);
                        var1_1 = var1_1.f();
                    }
                    break block10;
                }
                var1_1 = dww.f(eax.a.l());
                var1_1.g(ebo.b);
                var1_1 = var1_1.f();
            }
            if (this.c.f.isDone()) {
                var4_4 = this.c;
                this.a = var1_1;
                this.b = 2;
                if (var4_4.f(this) == var3_2 /* !! */ ) {
                    return var3_2 /* !! */ ;
                }
            }
        }
        return var1_1;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new etm(this.c, jqb2);
    }
}

