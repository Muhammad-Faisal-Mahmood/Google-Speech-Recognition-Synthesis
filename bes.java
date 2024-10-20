/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class bes
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    private final int d;

    public bes(avc avc2, jqz jqz2, jqb jqb2, int n2) {
        this.d = n2;
        this.b = avc2;
        this.c = jqz2;
        super(2, jqb2);
    }

    public bes(beu beu2, jyh jyh2, jqb jqb2, int n2) {
        this.d = n2;
        this.b = beu2;
        this.c = jyh2;
        super(2, jqb2);
    }

    public bes(ehq ehq2, ebg ebg2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = ehq2;
        this.b = ebg2;
        super(2, jqb2);
    }

    public bes(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2) {
        this.d = n2;
        this.c = eie2;
        this.b = ambientMode$AmbientController;
        super(2, jqb2);
    }

    public bes(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2, byte[] byArray) {
        this.d = n2;
        this.c = eie2;
        this.b = ambientMode$AmbientController;
        super(2, jqb2);
    }

    public bes(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2, byte[] byArray, byte[] byArray2) {
        this.d = n2;
        this.c = eie2;
        this.b = ambientMode$AmbientController;
        super(2, jqb2);
    }

    public bes(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2, char[] cArray) {
        this.d = n2;
        this.c = eie2;
        this.b = ambientMode$AmbientController;
        super(2, jqb2);
    }

    public bes(eie eie2, ehi ehi2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = eie2;
        this.b = ehi2;
        super(2, jqb2);
    }

    public bes(eie eie2, ehi ehi2, jqb jqb2, int n2, byte[] byArray) {
        this.d = n2;
        this.c = eie2;
        this.b = ehi2;
        super(2, jqb2);
    }

    public bes(eif eif2, ebg ebg2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = eif2;
        this.b = ebg2;
        super(2, jqb2);
    }

    public bes(epa epa2, ebv ebv2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = epa2;
        this.b = ebv2;
        super(2, jqb2);
    }

    public bes(epa epa2, eom eom2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = epa2;
        this.b = eom2;
        super(2, jqb2);
    }

    public bes(etd etd2, ebg ebg2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = etd2;
        this.b = ebg2;
        super(2, jqb2);
    }

    public bes(etn etn2, ebg ebg2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = etn2;
        this.b = ebg2;
        super(2, jqb2);
    }

    public bes(evi evi2, ecp ecp2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = evi2;
        this.b = ecp2;
        super(2, jqb2);
    }

    public bes(evi evi2, ecp ecp2, jqb jqb2, int n2, byte[] byArray) {
        this.d = n2;
        this.c = evi2;
        this.b = ecp2;
        super(2, jqb2);
    }

    public bes(evi evi2, ecp ecp2, jqb jqb2, int n2, char[] cArray) {
        this.d = n2;
        this.c = evi2;
        this.b = ecp2;
        super(2, jqb2);
    }

    public bes(evi evi2, ecp ecp2, jqb jqb2, int n2, short[] sArray) {
        this.d = n2;
        this.c = evi2;
        this.b = ecp2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(Object var1_1) {
        block74: {
            switch (this.d) {
                default: {
                    var5_2 = jqh.a;
                    var2_20 = this.a;
                    jns.ak(var1_1 /* !! */ );
                    if (var2_20 == 0) break;
                    break block74;
                }
                case 16: {
                    var5_3 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var6_24 = this.c;
                        var1_1 /* !! */  = (hpn)this.b.c().c();
                        this.a = 1;
                        if (((evi)var6_24).e((hpn)var1_1 /* !! */ , this) == var5_3) {
                            return var5_3;
                        }
                    }
                    return jon.a;
                }
                case 15: {
                    var5_4 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1$6", "invokeSuspend", 129, "StreamListeningSessionResponseSender.kt")).r("#audio# sending LOOPBACK audio bytes receiver to the remote client");
                        var1_1 /* !! */  = this.c;
                        var6_25 = (dzl)this.b.d().c();
                        var7_40 = ero.c;
                        this.a = 1;
                        if (((evi)var1_1 /* !! */ ).c(var6_25, var7_40, this) == var5_4) {
                            return var5_4;
                        }
                    }
                    return jon.a;
                }
                case 14: {
                    var5_5 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1$5", "invokeSuspend", 121, "StreamListeningSessionResponseSender.kt")).r("#audio# sending MIC audio bytes receiver to the remote client");
                        var1_1 /* !! */  = this.c;
                        var6_26 = (dzl)this.b.b().c();
                        var7_41 = ero.b;
                        this.a = 1;
                        if (((evi)var1_1 /* !! */ ).c(var6_26, var7_41, this) == var5_5) {
                            return var5_5;
                        }
                    }
                    return jon.a;
                }
                case 13: {
                    var5_6 = jqh.a;
                    if (this.a == 0) ** GOTO lbl53
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl65
lbl53:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = (etn)this.c;
                    var1_1 /* !! */  = var1_1 /* !! */ .h.b(var1_1 /* !! */ .b, var1_1 /* !! */ .a);
                    if (!var1_1 /* !! */ .a || var1_1 /* !! */ .b != 0) ** GOTO lbl67
                    var6_27 = this.c;
                    var1_1 /* !! */  = this.b;
                    var1_1 /* !! */  = ((etn)var6_27).c.c((ebg)var1_1 /* !! */ );
                    this.a = 1;
                    var1_1 /* !! */  = var6_27 = jsd.l((hpn)var1_1 /* !! */ , this);
                    if (var6_27 != var5_6) ** GOTO lbl65
                    var1_1 /* !! */  = var5_6;
                    ** GOTO lbl73
lbl65:
                    // 2 sources

                    var1_1 /* !! */  = (eav)var1_1 /* !! */ ;
                    ** GOTO lbl71
lbl67:
                    // 1 sources

                    var1_1 /* !! */  = this.b;
                    var5_6 = dpg.e(eav.a.l());
                    var5_6.k((ebg)var1_1 /* !! */ );
                    var1_1 /* !! */  = var5_6.j();
lbl71:
                    // 2 sources

                    ((etn)this.c).g.O(var1_1 /* !! */ );
lbl73:
                    // 2 sources

                    return var1_1 /* !! */ ;
                }
                case 12: {
                    var6_28 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.c;
                        var5_7 = this.b;
                        this.a = 1;
                        var5_7 = (ebg)var5_7;
                        var1_1 /* !! */  = var5_7 = ((etd)var1_1 /* !! */ ).h((ebg)var5_7, this);
                        if (var5_7 == var6_28) {
                            return var6_28;
                        }
                    }
                    return var1_1 /* !! */ ;
                }
                case 11: {
                    var5_8 = jqh.a;
                    var2_21 = this.a;
                    if (var2_21 == 0) ** GOTO lbl97
                    if (var2_21 == 1) ** GOTO lbl95
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl-1000
lbl95:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl-1000
lbl97:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = (epa)this.c;
                    var7_42 = var1_1 /* !! */ .b;
                    var6_29 = var1_1 /* !! */ .c;
                    var1_1 /* !! */  = var1_1 /* !! */ .k.a((eln)var6_29, (eln)var7_42);
                    if (var1_1 /* !! */ .a || var1_1 /* !! */ .b > 1) ** GOTO lbl118
                    var1_1 /* !! */  = (epa)this.c;
                    if (var1_1 /* !! */ .e) {
                        var1_1 /* !! */  = var1_1 /* !! */ .d.k((eom)this.b);
                        this.a = 2;
                        var1_1 /* !! */  = var6_29 = jsd.l((hpn)var1_1 /* !! */ , this);
                        ** if (var6_29 != var5_8) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var1_1 /* !! */  = var5_8;
                            ** GOTO lbl128
                        }
                    }
                    ** GOTO lbl114
lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (eah)var1_1 /* !! */ ;
                    }
                    ** GOTO lbl128
lbl114:
                    // 1 sources

                    var1_1 /* !! */ .k.b(var1_1 /* !! */ .c, var1_1 /* !! */ .b);
                    var1_1 /* !! */  = ekr.a(ebs.o);
                    ** GOTO lbl128
lbl118:
                    // 1 sources

                    var6_29 = this.c;
                    var7_42 = this.b;
                    var1_1 /* !! */  = ebu.d;
                    var1_1 /* !! */  = ((epa)var6_29).i((ebu)var1_1 /* !! */ , (eom)var7_42);
                    this.a = 1;
                    var1_1 /* !! */  = var6_29 = jsd.l((hpn)var1_1 /* !! */ , this);
                    if (var6_29 == var5_8) {
                        var1_1 /* !! */  = var5_8;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (eah)var1_1 /* !! */ ;
                    }
lbl128:
                    // 5 sources

                    return var1_1 /* !! */ ;
                }
                case 10: {
                    var5_9 = jqh.a;
                    if (this.a == 0) ** GOTO lbl134
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl146
lbl134:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = (epa)this.c;
                    var1_1 /* !! */  = var1_1 /* !! */ .k.b(var1_1 /* !! */ .c, var1_1 /* !! */ .b);
                    if (!var1_1 /* !! */ .a || var1_1 /* !! */ .b != 0) ** GOTO lbl148
                    var1_1 /* !! */  = this.c;
                    var6_30 = this.b;
                    var1_1 /* !! */  = ((epa)var1_1 /* !! */ ).d.h((ebv)var6_30);
                    this.a = 1;
                    var1_1 /* !! */  = var6_30 = jsd.l((hpn)var1_1 /* !! */ , this);
                    if (var6_30 != var5_9) ** GOTO lbl146
                    var1_1 /* !! */  = var5_9;
                    ** GOTO lbl158
lbl146:
                    // 2 sources

                    var1_1 /* !! */  = (ebq)var1_1 /* !! */ ;
                    ** GOTO lbl154
lbl148:
                    // 1 sources

                    var5_9 = dww.l(ebq.a.l());
                    if (var1_1 /* !! */ .a) {
                        var5_9.u(ebr.b);
                    } else {
                        var5_9.t(ebp.f);
                    }
                    var1_1 /* !! */  = var5_9.s();
lbl154:
                    // 2 sources

                    var5_9 = this.c;
                    var6_30 = this.b;
                    ((epa)var5_9).j.O(ekr.i((ebq)var1_1 /* !! */ , (ebv)var6_30));
lbl158:
                    // 2 sources

                    return var1_1 /* !! */ ;
                }
                case 9: {
                    var6_31 = jqh.a;
                    var2_22 = this.a;
                    if (var2_22 == 0) ** GOTO lbl168
                    if (var2_22 == 1) ** GOTO lbl166
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl200
lbl166:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl180
lbl168:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = (heg)eif.a.f().h(hfo.a, "ALT.BtFallbackRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothFallbackAwareAudioRoute$disconnect$1", "invokeSuspend", 141, "BluetoothFallbackAwareAudioRoute.kt");
                    var7_43 = this.c;
                    var5_10 = ((ebg)this.b).name();
                    var7_43 = ((eif)var7_43).b;
                    var1_1 /* !! */ .G("#audio# disconnect client(%s) route(%s, reason(%s))", var7_43.d, var7_43.b, var5_10);
                    var5_10 = this.c;
                    var1_1 /* !! */  = this.b;
                    var1_1 /* !! */  = ((eif)var5_10).d.c((ebg)var1_1 /* !! */ );
                    this.a = 1;
                    var1_1 /* !! */  = jsd.l((hpn)var1_1 /* !! */ , this);
                    if (var1_1 /* !! */  == var6_31) ** GOTO lbl201
lbl180:
                    // 2 sources

                    var5_10 = this.c;
                    var1_1 /* !! */  = (eav)var1_1 /* !! */ ;
                    var2_22 = ((eif)var5_10).e.ordinal();
                    if (var2_22 != 0) {
                        if (var2_22 != 1 && var2_22 != 2) {
                            throw new joa();
                        }
                        var1_1 /* !! */  = this.c;
                        var7_43 = this.b;
                        var5_10 = dpg.e(eav.a.l());
                        var5_10.k((ebg)var7_43);
                        var5_10 = var5_10.j();
                        ((eif)var1_1 /* !! */ ).f.O(var5_10);
                    } else {
                        ((eif)this.c).f.O(var1_1 /* !! */ );
                    }
                    var1_1 /* !! */  = this.c;
                    this.a = 2;
                    var1_1 /* !! */  = var5_10 = ((eif)var1_1 /* !! */ ).f.y(this);
                    if (var5_10 == var6_31) ** GOTO lbl201
lbl200:
                    // 2 sources

                    return var1_1 /* !! */ ;
lbl201:
                    // 2 sources

                    return var6_31;
                }
                case 8: {
                    var5_11 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var6_32 = this.c;
                        var1_1 /* !! */  = this.b;
                        var1_1 /* !! */  = gpm.A(((eie)var6_32).l, var1_1 /* !! */ );
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_11) {
                            return var5_11;
                        }
                    }
                    return jon.a;
                }
                case 7: {
                    var5_12 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.c;
                        var6_33 = this.b;
                        var1_1 /* !! */  = gpm.A(((eie)var1_1 /* !! */ ).m, var6_33);
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_12) {
                            return var5_12;
                        }
                    }
                    return jon.a;
                }
                case 6: {
                    var5_13 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.c;
                        var7_44 /* !! */  = new mq(var1_1 /* !! */ , 15);
                        var6_34 = this.b;
                        var7_44 /* !! */  = new eia(var7_44 /* !! */ , 2);
                        var1_1 /* !! */  = ((eie)var1_1 /* !! */ ).n.w(var6_34, (jrk)var7_44 /* !! */ );
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_13) {
                            return var5_13;
                        }
                    }
                    return jon.a;
                }
                case 5: {
                    var5_14 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var6_35 = this.c;
                        var7_45 = this.b;
                        var1_1 /* !! */  = new mz(var6_35, 12);
                        var1_1 /* !! */  = gpm.z(((eie)var6_35).l, var7_45, null, (jrk)var1_1 /* !! */ , 2);
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_14) {
                            return var5_14;
                        }
                    }
                    return jon.a;
                }
                case 4: {
                    var5_15 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var6_36 = this.c;
                        var1_1 /* !! */  = this.b;
                        var7_46 = (eie)var6_36;
                        var6_36 = new mz(var7_46.c(), 11);
                        var1_1 /* !! */  = gpm.z(var7_46.m, var1_1 /* !! */ , null, (jrk)var6_36, 2);
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_15) {
                            return var5_15;
                        }
                    }
                    return jon.a;
                }
                case 3: {
                    var5_16 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.c;
                        var7_47 /* !! */  = new mq(var1_1 /* !! */ , 14);
                        var6_37 = this.b;
                        var7_47 /* !! */  = new eia(var7_47 /* !! */ , 0);
                        var1_1 /* !! */  = gpm.z(((eie)var1_1 /* !! */ ).n, var6_37, (jrk)var7_47 /* !! */ , null, 4);
                        this.a = 1;
                        if (jsd.l((hpn)var1_1 /* !! */ , this) == var5_16) {
                            return var5_16;
                        }
                    }
                    return jon.a;
                }
                case 2: {
                    var6_38 = jqh.a;
                    var2_23 = this.a;
                    if (var2_23 == 0) ** GOTO lbl296
                    if (var2_23 == 1) ** GOTO lbl294
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl308
lbl294:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl303
lbl296:
                    // 1 sources

                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = this.c;
                    var7_48 = this.b;
                    this.a = 1;
                    var5_17 = ebo.f;
                    var7_48 = (ebg)var7_48;
                    if (((ehq)var1_1 /* !! */ ).h((ebo)var5_17, (ebg)var7_48, this) == var6_38) ** GOTO lbl307
lbl303:
                    // 2 sources

                    var1_1 /* !! */  = this.c;
                    this.a = 2;
                    var1_1 /* !! */  = var5_17 = ((ehq)var1_1 /* !! */ ).l.y(this);
                    if (var5_17 != var6_38) ** GOTO lbl308
lbl307:
                    // 2 sources

                    return var6_38;
lbl308:
                    // 2 sources

                    return var1_1 /* !! */ ;
                }
                case 1: {
                    var5_18 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        if (((avc)var1_1 /* !! */ ).b(this) == var5_18) {
                            return var5_18;
                        }
                    }
                    return jon.a;
                }
                case 0: {
                    var5_19 /* !! */  = jqh.a;
                    if (this.a != 0) {
                        jns.ak(var1_1 /* !! */ );
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        this.a = 1;
                        if (jvf.d(((beu)var1_1 /* !! */ ).b, this) == var5_19 /* !! */ ) {
                            return var5_19 /* !! */ ;
                        }
                    }
                    bbi.a();
                    var3_49 = bfa.a;
                    var1_1 /* !! */  = this.c;
                    var5_19 /* !! */  = new ber(7);
                    ((jxz)var1_1 /* !! */ ).g((Object)var5_19 /* !! */ );
                    return jon.a;
                }
            }
            var1_1 /* !! */  = this.c;
            var6_39 = this.b.e();
            this.a = 1;
            if (((evi)var1_1 /* !! */ ).d(var6_39, this) == var5_2) {
                return var5_2;
            }
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        switch (this.d) {
            default: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 16: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 15: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 14: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 13: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 12: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 11: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 10: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 9: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 8: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 7: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 6: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 5: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 4: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 3: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 2: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bes)object2).a(object);
            }
            case 1: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((bes)object).a(object2);
            }
            case 0: 
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((bes)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        switch (this.d) {
            default: {
                Object object2 = this.c;
                object = this.b;
                return new bes((evi)object2, (ecp)object, jqb2, 17, null);
            }
            case 16: {
                Object object3 = this.c;
                object = this.b;
                return new bes((evi)object3, (ecp)object, jqb2, 16, null);
            }
            case 15: {
                Object object4 = this.c;
                object = this.b;
                return new bes((evi)object4, (ecp)object, jqb2, 15, null);
            }
            case 14: {
                object = this.c;
                Object object5 = this.b;
                return new bes((evi)object, (ecp)object5, jqb2, 14);
            }
            case 13: {
                object = this.c;
                ebg ebg2 = (ebg)this.b;
                return new bes((etn)object, ebg2, jqb2, 13);
            }
            case 12: {
                object = this.c;
                ebg ebg3 = (ebg)this.b;
                return new bes((etd)object, ebg3, jqb2, 12);
            }
            case 11: {
                object = this.c;
                Object object6 = this.b;
                return new bes((epa)object, (eom)object6, jqb2, 11);
            }
            case 10: {
                object = this.c;
                ebv ebv2 = (ebv)this.b;
                return new bes((epa)object, ebv2, jqb2, 10);
            }
            case 9: {
                object = this.c;
                ebg ebg4 = (ebg)this.b;
                return new bes((eif)object, ebg4, jqb2, 9);
            }
            case 8: {
                Object object7 = this.c;
                object = (AmbientMode$AmbientController)this.b;
                return new bes((eie)object7, (AmbientMode$AmbientController)object, jqb2, 8, null, null);
            }
            case 7: {
                object = this.c;
                ehi ehi2 = (ehi)this.b;
                return new bes((eie)object, ehi2, jqb2, 7, null);
            }
            case 6: {
                Object object8 = this.c;
                object = (AmbientMode$AmbientController)this.b;
                return new bes((eie)object8, (AmbientMode$AmbientController)object, jqb2, 6, null);
            }
            case 5: {
                object = this.c;
                AmbientMode$AmbientController ambientMode$AmbientController = (AmbientMode$AmbientController)this.b;
                return new bes((eie)object, ambientMode$AmbientController, jqb2, 5, null);
            }
            case 4: {
                object = this.c;
                ehi ehi3 = (ehi)this.b;
                return new bes((eie)object, ehi3, jqb2, 4);
            }
            case 3: {
                object = this.c;
                AmbientMode$AmbientController ambientMode$AmbientController = (AmbientMode$AmbientController)this.b;
                return new bes((eie)object, ambientMode$AmbientController, jqb2, 3);
            }
            case 2: {
                Object object9 = this.c;
                object = (ebg)this.b;
                return new bes((ehq)object9, (ebg)object, jqb2, 2);
            }
            case 1: {
                object = this.b;
                Object object10 = this.c;
                return new bes((avc)object, (jqz)object10, jqb2, 1);
            }
            case 0: 
        }
        object = this.b;
        jyh jyh2 = (jyh)this.c;
        return new bes((beu)object, jyh2, jqb2, 0);
    }
}

