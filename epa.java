/*
 * Decompiled with CFR 0.152.
 */
public final class epa
implements eot {
    private static final hei n = hei.m("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/RefAudioSourceDataAccessor");
    public final gto a;
    public final eln b;
    public final eln c;
    public final eot d;
    public final boolean e;
    public final hpn f;
    public final gto g;
    public final eae h;
    public final efq i;
    public final jur j;
    public final ell k;
    public final dtu l;
    public final bzb m;
    private final eot o;
    private final jvb p;
    private final jny q;

    public epa(eot eot2, gto object, bzb object2, ell object3, jvb jvb2) {
        jur jur2;
        this.o = eot2;
        this.a = object;
        this.m = object2;
        this.k = object3;
        this.p = jvb2;
        this.l = cqq.av(jvb2);
        this.j = jur2 = new jur();
        this.b = object = ((ell)object3).c("ref-source@");
        this.q = object3 = new jog(new eop(this, 3));
        object2 = eot2.e();
        if (object2 != null) {
            object = object2;
        }
        this.c = object;
        this.d = object = eot2.g();
        this.e = jse.i(eot2, object);
        this.f = jsd.k(jur2);
        this.g = (gto)object3.a();
        this.h = eot2.b();
        this.i = eot2.d();
        jse.ah(jvb2, null, null, new aus(this, null, 19, null), 3);
    }

    @Override
    public final int a() {
        return this.o.a();
    }

    @Override
    public final eae b() {
        return this.h;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(jqb var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (!(var1_1 instanceof eoz)) ** GOTO lbl-1000
                        var3_2 = (eoz)var1_1;
                        var2_3 = var3_2.c;
                        if ((var2_3 & -2147483648) != 0) {
                            var3_2.c = var2_3 + -2147483648;
                            var1_1 = var3_2;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new eoz(this, (jqb)var1_1);
                        }
                        var4_4 = var1_1.a;
                        var5_5 = jqh.a;
                        var2_3 = var1_1.c;
                        if (var2_3 == 0) break block6;
                        if (var2_3 != 1) break block7;
                        var3_2 = var1_1.e;
                        var1_1 = var1_1.d;
                        jns.ak(var4_4);
                        break block8;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var4_4);
                var3_2 = this.j;
                var4_4 = this.d.j();
                var1_1.d = this;
                var1_1.e = var3_2;
                var1_1.c = 1;
                var4_4 = jsd.l((hpn)var4_4, (jqb)var1_1);
                if (var4_4 == var5_5) break block9;
                var1_1 = this;
            }
            if (var3_2.O(var4_4)) {
                ((heg)epa.n.f().h(hfo.a, "ALT.RefSrcDataAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/RefAudioSourceDataAccessor", "completeStoppingAfterOrigin", 135, "RefAudioSourceDataAccessor.kt")).u("#audio# source(%s) origin stopped", var1_1.b.c);
                var1_1.k.b(var1_1.c, var1_1.b);
            }
            return jon.a;
        }
        return var5_5;
    }

    @Override
    public final efq d() {
        return this.i;
    }

    @Override
    public final eln e() {
        return this.c;
    }

    @Override
    public final eot g() {
        return this.d;
    }

    @Override
    public final hpn h(ebv object) {
        jse.e(object, "stopListeningReason");
        object = new bes(this, (ebv)object, null, 10);
        return this.l.j((jro)object);
    }

    @Override
    public final hpn i(ebu ebu2, eom eom2) {
        jse.e(ebu2, "success");
        return this.o.i(ebu2, eom2);
    }

    @Override
    public final hpn j() {
        return this.f;
    }

    @Override
    public final hpn k(eom object) {
        object = new bes(this, (eom)object, null, 11);
        return this.l.j((jro)object);
    }
}

