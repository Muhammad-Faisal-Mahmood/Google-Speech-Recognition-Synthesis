/*
 * Decompiled with CFR 0.152.
 */
public final class etn
implements esy {
    private static final hei j = hei.m("com/google/android/libraries/search/audio/routing/impl/RefAudioRoute");
    public final eln a;
    public final eln b;
    public final esy c;
    public final ekk d;
    public final boolean e;
    public final hpn f;
    public final jur g;
    public final ell h;
    public final dtu i;
    private final jvb k;

    public etn(esy esy2, jvb jvb2, ell object) {
        eln eln2;
        jur jur2;
        this.k = jvb2;
        this.h = object;
        this.i = cqq.av(jvb2);
        this.g = jur2 = new jur();
        this.a = eln2 = ((ell)object).c("ref-route@");
        eln eln3 = esy2.d();
        object = eln3;
        if (eln3 == null) {
            object = eln2;
        }
        this.b = object;
        this.c = object = esy2.e();
        this.d = new ekk(jsd.k(jur2), object.a().b, object.a().c, gto.h(eln2));
        this.e = jse.i(esy2, object);
        this.f = object.a().a;
        jse.ah(jvb2, null, null, new esz(this, null, 3, null), 3);
    }

    @Override
    public final ekk a() {
        return this.d;
    }

    @Override
    public final hpn b() {
        etm etm2 = new etm(this, null);
        return this.i.j(etm2);
    }

    @Override
    public final hpn c(ebg object) {
        jse.e(object, "disconnectReason");
        object = new bes(this, (ebg)object, null, 13);
        return this.i.j((jro)object);
    }

    @Override
    public final eln d() {
        return this.b;
    }

    @Override
    public final esy e() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f(jqb var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (!(var1_1 instanceof etl)) ** GOTO lbl-1000
                        var3_2 = (etl)var1_1;
                        var2_3 = var3_2.c;
                        if ((var2_3 & -2147483648) != 0) {
                            var3_2.c = var2_3 + -2147483648;
                            var1_1 = var3_2;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new etl(this, (jqb)var1_1);
                        }
                        var5_4 = var1_1.a;
                        var4_5 /* !! */  = jqh.a;
                        var2_3 = var1_1.c;
                        if (var2_3 == 0) break block6;
                        if (var2_3 != 1) break block7;
                        var3_2 = var1_1.e;
                        var4_5 /* !! */  = var1_1.d;
                        jns.ak(var5_4);
                        var1_1 = var5_4;
                        break block8;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var5_4);
                var3_2 = this.g;
                var5_4 = this.f;
                var1_1.d = this;
                var1_1.e = var3_2;
                var1_1.c = 1;
                var1_1 = jsd.l((hpn)var5_4, (jqb)var1_1);
                if (var1_1 == var4_5 /* !! */ ) break block9;
                var4_5 /* !! */  = this;
            }
            jse.d(var1_1, "await(...)");
            if (var3_2.O(var1_1)) {
                ((heg)etn.j.f().h(hfo.a, "ALT.RefRoute").j("com/google/android/libraries/search/audio/routing/impl/RefAudioRoute", "completeDisconnectionAfterOrigin", 142, "RefAudioRoute.kt")).u("#audio# route(%s) origin disconnected", var4_5 /* !! */ .a.c);
                var4_5 /* !! */ .h.b(var4_5 /* !! */ .b, var4_5 /* !! */ .a);
            }
            return jon.a;
        }
        return var4_5 /* !! */ ;
    }
}

