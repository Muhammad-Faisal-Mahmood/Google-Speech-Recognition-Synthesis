/*
 * Decompiled with CFR 0.152.
 */
public final class esz
extends jqs
implements jro {
    int a;
    final Object b;
    private final int c;

    public esz(etd etd2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = etd2;
        super(2, jqb2);
    }

    public esz(etn etn2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = etn2;
        super(2, jqb2);
    }

    public esz(etn etn2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = etn2;
        super(2, jqb2);
    }

    public esz(euw euw2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = euw2;
        super(2, jqb2);
    }

    public esz(evi evi2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = evi2;
        super(2, jqb2);
    }

    public esz(evl evl2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = evl2;
        super(2, jqb2);
    }

    public esz(hpn hpn2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = hpn2;
        super(2, jqb2);
    }

    public esz(jyx jyx2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = jyx2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(Object var1_1) {
        block43: {
            switch (this.c) {
                default: {
                    var3_2 = jqh.a;
                    var2_12 = this.a;
                    jns.ak(var1_1 /* !! */ );
                    if (var2_12 == 0) break;
                    break block43;
                }
                case 6: {
                    var3_3 /* !! */  = jqh.a;
                    if (this.a == 0) ** GOTO lbl13
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl-1000
lbl13:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = this.b;
                    var4_13 = crh.W(euo.a.l());
                    var5_18 = idi.H(hwh.a.l()).s();
                    jse.e(var5_18, "value");
                    var6_20 = (hwp)var4_13.a;
                    if (!var6_20.b.B()) {
                        var6_20.u();
                    }
                    var6_20 = (euo)var6_20.b;
                    var5_18.getClass();
                    var6_20.c = var5_18;
                    var6_20.b = 1;
                    var4_13 = var4_13.y();
                    if (joe.a(((evl)var1_1 /* !! */ ).b((euo)var4_13)) == null) {
                        var4_13 = this.b;
                        var1_1 /* !! */  = crh.W(euo.a.l());
                        var5_18 = dpf.u(edf.a.l());
                        var4_13 = (evl)var4_13;
                        var5_18.y(var4_13.b);
                        var5_18 = var5_18.x();
                        jse.e(var5_18, "value");
                        var6_20 = (hwp)var1_1 /* !! */ .a;
                        if (!var6_20.b.B()) {
                            var6_20.u();
                        }
                        var6_20 = (euo)var6_20.b;
                        var5_18.getClass();
                        var6_20.c = var5_18;
                        var6_20.b = 2;
                        if (joe.a(var4_13.b(var1_1 /* !! */ .y())) == null) {
                            var1_1 /* !! */  = this.b;
                            this.a = 1;
                            ** if (((evl)var1_1 /* !! */ ).a((jqb)this) != var3_3 /* !! */ ) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var1_1 /* !! */  = var3_3 /* !! */ ;
                                ** GOTO lbl63
                            }
                        }
                    }
                    ** GOTO lbl62
lbl-1000:
                    // 2 sources

                    {
                        ((heg)evl.a.f().h(hfo.a, "ALT.GrpcRouteRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender$start$1", "invokeSuspend", 65, "StreamRouteSessionResponseSender.kt")).s("#audio# completing sending route(%d) data", ((evl)this.b).b);
                        var3_3 /* !! */  = this.b;
                        var1_1 /* !! */  = (evl)var3_3 /* !! */ ;
                        if (!var1_1 /* !! */ .e.c()) {
                            try {
                                ((evl)var3_3 /* !! */ ).d.a();
                            }
                            catch (Throwable var3_4) {
                                jns.aj(var3_4);
                            }
                            var1_1 /* !! */ .c();
                        }
lbl62:
                        // 4 sources

                        var1_1 /* !! */  = jon.a;
                    }
lbl63:
                    // 2 sources

                    return var1_1 /* !! */ ;
                }
                case 5: {
                    var3_5 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        if (((evi)var1_1 /* !! */ ).g(this) == var3_5) {
                            return var3_5;
                        }
                    }
                    return jon.a;
                }
                case 4: {
                    var3_6 /* !! */  = jqh.a;
                    if (this.a == 0) ** GOTO lbl80
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl-1000
lbl80:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = this.b;
                    var4_14 = crh.Y(eum.a.l());
                    var5_19 = idi.H(hwh.a.l()).s();
                    jse.e(var5_19, "value");
                    var6_21 = (hwp)var4_14.a;
                    if (!var6_21.b.B()) {
                        var6_21.u();
                    }
                    var6_21 = (eum)var6_21.b;
                    var5_19.getClass();
                    var6_21.c = var5_19;
                    var6_21.b = 4;
                    var4_14 = var4_14.O();
                    if (joe.a(((euw)var1_1 /* !! */ ).b((eum)var4_14)) == null) {
                        var4_14 = this.b;
                        var1_1 /* !! */  = crh.Y(eum.a.l());
                        var5_19 = dox.m(eco.a.l());
                        var4_14 = (euw)var4_14;
                        var5_19.E(var4_14.b);
                        var5_19 = var5_19.D();
                        jse.e(var5_19, "value");
                        var6_21 = (hwp)var1_1 /* !! */ .a;
                        if (!var6_21.b.B()) {
                            var6_21.u();
                        }
                        var6_21 = (eum)var6_21.b;
                        var5_19.getClass();
                        var6_21.c = var5_19;
                        var6_21.b = 2;
                        if (joe.a(var4_14.b(var1_1 /* !! */ .O())) == null) {
                            var1_1 /* !! */  = this.b;
                            this.a = 1;
                            ** if (((euw)var1_1 /* !! */ ).a((jqb)this) != var3_6 /* !! */ ) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var1_1 /* !! */  = var3_6 /* !! */ ;
                                ** GOTO lbl130
                            }
                        }
                    }
                    ** GOTO lbl129
lbl-1000:
                    // 2 sources

                    {
                        ((heg)euw.a.f().h(hfo.a, "ALT.GrpcClientRespSndr").j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender$start$1", "invokeSuspend", 71, "StreamAudioClientResponseSender.kt")).s("#audio# completing sending audio client(%d) data", ((euw)this.b).b);
                        var3_6 /* !! */  = this.b;
                        var1_1 /* !! */  = (euw)var3_6 /* !! */ ;
                        if (!var1_1 /* !! */ .f.c()) {
                            try {
                                ((euw)var3_6 /* !! */ ).d.a();
                            }
                            catch (Throwable var3_7) {
                                jns.aj(var3_7);
                            }
                            var1_1 /* !! */ .c();
                        }
lbl129:
                        // 4 sources

                        var1_1 /* !! */  = jon.a;
                    }
lbl130:
                    // 2 sources

                    return var1_1 /* !! */ ;
                }
                case 3: {
                    var4_15 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        var1_1 /* !! */  = var3_8 = jsd.l(((etn)var1_1 /* !! */ ).f, this);
                        if (var3_8 == var4_15) {
                            return var4_15;
                        }
                    }
                    var1_1 /* !! */  = (eav)var1_1 /* !! */ ;
                    var3_8 = (etn)this.b;
                    var1_1 /* !! */  = new esz((etn)var3_8, null, 2);
                    var3_8.i.j((jro)var1_1 /* !! */ );
                    return jon.a;
                }
                case 2: {
                    var3_9 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        if (((etn)var1_1 /* !! */ ).f(this) == var3_9) {
                            return var3_9;
                        }
                    }
                    return jon.a;
                }
                case 1: {
                    var4_16 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        var1_1 /* !! */  = var3_10 = jsd.l((hpn)var1_1 /* !! */ , this);
                        if (var3_10 == var4_16) {
                            return var4_16;
                        }
                    }
                    return var1_1 /* !! */ ;
                }
                case 0: {
                    var4_17 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        var1_1 /* !! */  = var3_11 = ((etd)var1_1 /* !! */ ).f(this);
                        if (var3_11 == var4_17) {
                            return var4_17;
                        }
                    }
                    return var1_1 /* !! */ ;
                }
            }
            var1_1 /* !! */  = this.b;
            this.a = 1;
            if (jsd.s((jyx)var1_1 /* !! */ , this) == var3_2) {
                return var3_2;
            }
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        switch (this.c) {
            default: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((esz)object).a(object2);
            }
            case 6: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((esz)object).a(object2);
            }
            case 5: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((esz)object2).a(object);
            }
            case 4: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((esz)object).a(object2);
            }
            case 3: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((esz)object2).a(object);
            }
            case 2: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((esz)object2).a(object);
            }
            case 1: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((esz)object2).a(object);
            }
            case 0: 
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((esz)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        switch (this.c) {
            default: {
                return new esz((jyx)this.b, jqb2, 7);
            }
            case 6: {
                return new esz((evl)this.b, jqb2, 6);
            }
            case 5: {
                return new esz((evi)this.b, jqb2, 5);
            }
            case 4: {
                return new esz((euw)this.b, jqb2, 4);
            }
            case 3: {
                return new esz((etn)this.b, jqb2, 3, null);
            }
            case 2: {
                return new esz((etn)this.b, jqb2, 2);
            }
            case 1: {
                return new esz((hpn)this.b, jqb2, 1);
            }
            case 0: 
        }
        return new esz((etd)this.b, jqb2, 0);
    }
}

