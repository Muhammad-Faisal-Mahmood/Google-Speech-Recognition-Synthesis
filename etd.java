/*
 * Decompiled with CFR 0.152.
 */
public final class etd
implements esy {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/routing/impl/AudioAdapterAudioRoute");
    private final edo b;
    private final ekk c;
    private final eln d;
    private final jur e;
    private final dtu f;
    private final bzo g;

    public etd(eaz eaz2, edo edo2, gto gto2, bzo object, jvb jvb2) {
        this.b = edo2;
        this.g = object;
        this.f = cqq.av(jvb2);
        this.e = object = new jur();
        this.c = new ekk(jsd.k((jvi)object), eaz2, gto2, gsl.a);
        this.d = dpf.o(edo2);
    }

    @Override
    public final ekk a() {
        return this.c;
    }

    @Override
    public final hpn b() {
        esz esz2 = new esz(this, null, 0);
        return this.f.j(esz2);
    }

    @Override
    public final hpn c(ebg object) {
        jse.e(object, "disconnectReason");
        object = new bes(this, (ebg)object, null, 12);
        return this.f.j((jro)object);
    }

    @Override
    public final eln d() {
        return this.d;
    }

    @Override
    public final /* synthetic */ esy e() {
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public final Object f(jqb var1_1) {
        block15: {
            block16: {
                block11: {
                    block12: {
                        block14: {
                            block13: {
                                block7: {
                                    block8: {
                                        block9: {
                                            block10: {
                                                if (!(var1_1 instanceof eta)) ** GOTO lbl-1000
                                                var3_2 = (eta)var1_1;
                                                var2_3 = var3_2.c;
                                                if ((var2_3 & -2147483648) != 0) {
                                                    var3_2.c = var2_3 + -2147483648;
                                                    var1_1 = var3_2;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var1_1 = new eta(this, (jqb)var1_1);
                                                }
                                                var4_4 = var1_1.a;
                                                var5_5 = jqh.a;
                                                var2_3 = var1_1.c;
                                                if (var2_3 == 0) break block7;
                                                if (var2_3 == 1) break block8;
                                                if (var2_3 == 2) break block9;
                                                if (var2_3 != 3) break block10;
                                                jns.ak(var4_4);
                                                break block11;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        var3_2 = var1_1.d;
                                        jns.ak(var4_4);
                                        break block12;
                                    }
                                    jns.ak(var4_4);
                                    break block13;
                                }
                                jns.ak(var4_4);
                                ((heg)etd.a.f().h(hfo.a, "ALT.AdapterRoute").j("com/google/android/libraries/search/audio/routing/impl/AudioAdapterAudioRoute", "connectInternal", 63, "AudioAdapterAudioRoute.kt")).u("#audio# connect to adapter(%s)", this.b.name());
                                if (this.e.bH()) {
                                    var1_1 = dww.f(eax.a.l());
                                    var1_1.g(ebo.f);
                                    return var1_1.f();
                                }
                                if ((eds)this.g.l(this.b).f() != null) break block14;
                                var3_2 = ebg.h;
                                var1_1.c = 1;
                                if (this.h((ebg)var3_2, (jqb)var1_1) == var5_5) break block15;
                            }
                            var1_1 = dww.f(eax.a.l());
                            var1_1.g(ebo.g);
                            return var1_1.f();
                        }
                        var3_2 = hhk.K(edm.b);
                        var1_1.d = this;
                        var1_1.c = 2;
                        var4_4 = jsd.l((hpn)var3_2, (jqb)var1_1);
                        if (var4_4 == var5_5) break block15;
                        var3_2 = this;
                    }
                    if ((edm)var4_4 == edm.b) break block16;
                    var4_4 = ebg.q;
                    var1_1.d = null;
                    var1_1.c = 3;
                    if (var3_2.h((ebg)var4_4, (jqb)var1_1) == var5_5) break block15;
                }
                var1_1 = dww.f(eax.a.l());
                var1_1.g(ebo.q);
                return var1_1.f();
            }
            var1_1 = dww.f(eax.a.l());
            var1_1.g(ebo.b);
            return var1_1.f();
        }
        return var5_5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object g(ebg var1_1, jqb var2_2) {
        block9: {
            block10: {
                block8: {
                    block6: {
                        block7: {
                            if (!(var2_2 instanceof etb)) ** GOTO lbl-1000
                            var4_3 = (etb)var2_2;
                            var3_4 = var4_3.c;
                            if ((var3_4 & -2147483648) != 0) {
                                var4_3.c = var3_4 + -2147483648;
                                var2_2 = var4_3;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var2_2 = new etb(this, (jqb)var2_2);
                            }
                            var4_3 = var2_2.a;
                            var5_5 = jqh.a;
                            var3_4 = var2_2.c;
                            if (var3_4 == 0) break block6;
                            if (var3_4 != 1) break block7;
                            var1_1 = var2_2.e;
                            var2_2 = var2_2.d;
                            jns.ak(var4_3);
                            break block8;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jns.ak(var4_3);
                    var4_3 = etd.a;
                    ((heg)var4_3.f().h(hfo.a, "ALT.AdapterRoute").j("com/google/android/libraries/search/audio/routing/impl/AudioAdapterAudioRoute", "disconnectInternal", 104, "AudioAdapterAudioRoute.kt")).C("#audio# disconnect(%s) adapter(%s)", var1_1.name(), this.b.name());
                    if ((eds)this.g.l(this.b).f() == null) break block9;
                    var4_3 = hhk.K(edn.b);
                    var2_2.d = this;
                    var2_2.e = var1_1;
                    var2_2.c = 1;
                    if ((var4_3 = jsd.l((hpn)var4_3, (jqb)var2_2)) == var5_5) break block10;
                    var2_2 = this;
                }
                var4_3 = (edn)var4_3;
                if (var4_3 != edn.b) {
                    ((heg)etd.a.f().h(hfo.a, "ALT.AdapterRoute").j("com/google/android/libraries/search/audio/routing/impl/AudioAdapterAudioRoute", "disconnectInternal", 117, "AudioAdapterAudioRoute.kt")).C("#audio# adapter(%s) disconnected unsuccessfully(%s)", var2_2.b.name(), var4_3.name());
                }
                var2_2 = dpg.e(eav.a.l());
                var2_2.k(var1_1);
                return var2_2.j();
            }
            return var5_5;
        }
        ((heg)var4_3.f().h(hfo.a, "ALT.AdapterRoute").j("com/google/android/libraries/search/audio/routing/impl/AudioAdapterAudioRoute", "disconnectInternal", 110, "AudioAdapterAudioRoute.kt")).u("#audio# no adapter(%s) found for disconnection", this.b.name());
        var2_2 = dpg.e(eav.a.l());
        var2_2.k(var1_1);
        return var2_2.j();
    }

    /*
     * Unable to fully structure code
     */
    public final Object h(ebg var1_1, jqb var2_2) {
        block15: {
            block12: {
                block14: {
                    block11: {
                        block13: {
                            block8: {
                                block9: {
                                    block10: {
                                        if (!(var2_2 instanceof etc)) ** GOTO lbl-1000
                                        var4_3 = (etc)var2_2;
                                        var3_4 = var4_3.c;
                                        if ((var3_4 & -2147483648) != 0) {
                                            var4_3.c = var3_4 + -2147483648;
                                            var2_2 = var4_3;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var2_2 = new etc(this, (jqb)var2_2);
                                        }
                                        var4_3 = var2_2.a;
                                        var5_5 = jqh.a;
                                        var3_4 = var2_2.c;
                                        if (var3_4 == 0) break block8;
                                        if (var3_4 == 1) break block9;
                                        if (var3_4 != 2) break block10;
                                        var1_1 = var2_2.d;
                                        jns.ak(var4_3);
                                        break block11;
                                    }
                                    if (var3_4 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                                jns.ak(var4_3);
                                var1_1 = var4_3;
                                break block12;
                            }
                            jns.ak(var4_3);
                            if (!this.e.bH()) break block13;
                            var1_1 = this.e;
                            var2_2.c = 1;
                            if ((var1_1 = var1_1.y((jqb)var2_2)) != var5_5) {
                                return var1_1;
                            }
                            break block14;
                        }
                        var2_2.d = this;
                        var2_2.c = 2;
                        var4_3 = this.g((ebg)var1_1, (jqb)var2_2);
                        if (var4_3 == var5_5) break block14;
                        var1_1 = this;
                    }
                    var4_3 = (eav)var4_3;
                    var1_1.e.O(var4_3);
                    var1_1 = var1_1.e;
                    var2_2.d = null;
                    var2_2.c = 3;
                    var1_1 = var1_1.y((jqb)var2_2);
                    if (var1_1 != var5_5) break block15;
                }
                var1_1 = var5_5;
            }
            return var1_1;
        }
        return var1_1;
    }
}

