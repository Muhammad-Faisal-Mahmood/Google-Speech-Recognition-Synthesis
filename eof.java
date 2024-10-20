/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 */
import android.net.ConnectivityManager;

public final class eof
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    private Object d;
    private final int e;

    public eof(baq baq2, beu beu2, jqb jqb2, int n2) {
        this.e = n2;
        this.c = baq2;
        this.b = beu2;
        super(2, jqb2);
    }

    public eof(eoi eoi2, ebv ebv2, jqb jqb2, int n2) {
        this.e = n2;
        this.b = eoi2;
        this.c = ebv2;
        super(2, jqb2);
    }

    public eof(eoi eoi2, eom eom2, jqb jqb2, int n2) {
        this.e = n2;
        this.c = eoi2;
        this.b = eom2;
        super(2, jqb2);
    }

    public eof(eoq eoq2, ebv ebv2, jqb jqb2, int n2) {
        this.e = n2;
        this.b = eoq2;
        this.c = ebv2;
        super(2, jqb2);
    }

    public eof(eoq eoq2, eom eom2, jqb jqb2, int n2) {
        this.e = n2;
        this.b = eoq2;
        this.c = eom2;
        super(2, jqb2);
    }

    public eof(jqb jqb2, ewg ewg2, eah eah2, int n2) {
        this.e = n2;
        this.b = ewg2;
        this.c = eah2;
        super(2, jqb2);
    }

    public eof(jqb jqb2, ewg ewg2, ecp ecp2, int n2) {
        this.e = n2;
        this.b = ewg2;
        this.c = ecp2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object var1_1) {
        block66: {
            block54: {
                block65: {
                    block55: {
                        block56: {
                            block53: {
                                block57: {
                                    block62: {
                                        block64: {
                                            block63: {
                                                block60: {
                                                    block61: {
                                                        block58: {
                                                            block59: {
                                                                var2_7 = this.e;
                                                                if (var2_7 == 0) break block55;
                                                                var5_8 /* !! */  = null;
                                                                if (var2_7 == 1) break block56;
                                                                if (var2_7 == 2) break block57;
                                                                if (var2_7 == 3) break block58;
                                                                if (var2_7 != 4) {
                                                                    if (var2_7 != 5) {
                                                                        var5_8 /* !! */  = jqh.a;
                                                                        var2_7 = this.a;
                                                                        jns.ak(var1_1 /* !! */ );
                                                                        if (var2_7 != 0) {
                                                                            return jon.a;
                                                                        }
                                                                        var1_1 /* !! */  = (jvb)this.d;
                                                                        ((heg)ewg.a.c().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore$startStoring$lambda$7$$inlined$launchPropagatingLegacy$default$4", "invokeSuspend", 115, "SessionAudioStore.kt")).s("#audio# starting storing session(%s) UNPROCESSED audio...", ((ewg)this.b).h);
                                                                        var1_1 /* !! */  = this.b;
                                                                        var6_10 = (dzl)this.c.b().c();
                                                                        var1_1 /* !! */  = ((ewg)var1_1 /* !! */ ).b("unprocessed", var6_10);
                                                                        this.a = 1;
                                                                        if (((jwp)var1_1 /* !! */ ).y(this) != var5_8 /* !! */ ) return jon.a;
                                                                        return var5_8 /* !! */ ;
                                                                    }
                                                                    var5_8 /* !! */  = jqh.a;
                                                                    if (this.a != 0) {
                                                                        jns.ak(var1_1 /* !! */ );
                                                                        return jon.a;
                                                                    }
                                                                    jns.ak(var1_1 /* !! */ );
                                                                    var1_1 /* !! */  = (jvb)this.d;
                                                                    ((heg)ewg.a.c().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore$startStoring$lambda$7$$inlined$launchPropagatingLegacy$default$3", "invokeSuspend", 107, "SessionAudioStore.kt")).s("#audio# starting storing session(%s) LOOPBACK audio...", ((ewg)this.b).h);
                                                                    var1_1 /* !! */  = this.b;
                                                                    var6_11 = (dzl)this.c.d().c();
                                                                    var1_1 /* !! */  = ((ewg)var1_1 /* !! */ ).b("loopback", var6_11);
                                                                    this.a = 1;
                                                                    if (((jwp)var1_1 /* !! */ ).y(this) != var5_8 /* !! */ ) return jon.a;
                                                                    return var5_8 /* !! */ ;
                                                                }
                                                                var6_12 /* !! */  = jqh.a;
                                                                if (this.a == 0) break block59;
                                                                jns.ak(var1_1 /* !! */ );
                                                                var5_8 /* !! */  = var1_1 /* !! */ ;
                                                                ** GOTO lbl78
                                                                {
                                                                    catch (Throwable var1_2) {}
                                                                }
                                                            }
                                                            jns.ak(var1_1 /* !! */ );
                                                            var1_1 /* !! */  = (jvb)this.d;
                                                            var8_22 = this.b;
                                                            var9_23 = this.c;
                                                            this.a = 1;
                                                            ((heg)eoq.a.f().h(hfo.a, "ALT.SrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl", "startListeningInternal", 131, "AudioSourceDataAccessorImpl.kt")).C("#audio# opening audio source(%s), offset(%s)", ((eoq)var8_22).h, var9_23);
                                                            var1_1 /* !! */  = ((eoq)var8_22).f();
                                                            var1_1 /* !! */  = var1_1 /* !! */  != null ? var1_1 /* !! */ .a() : null;
                                                            ((eoq)var8_22).i = var1_1 /* !! */ ;
                                                            var1_1 /* !! */  = var7_17 = ((eoq)var8_22).g;
                                                            if (var7_17 != null) ** GOTO lbl62
                                                            try {
                                                                var1_1 /* !! */  = ((eoq)var8_22).c.c();
                                                                ** GOTO lbl61
                                                            }
                                                            catch (Throwable var1_3) {
                                                                block52: {
                                                                    var1_1 /* !! */  = jns.aj(var1_3);
lbl61:
                                                                    // 2 sources

                                                                    var1_1 /* !! */  = var7_17 = new joe(var1_1 /* !! */ );
lbl62:
                                                                    // 2 sources

                                                                    ((eoq)var8_22).g = var1_1 /* !! */ ;
                                                                    var7_17 = ((eoq)var8_22).g;
                                                                    var1_1 /* !! */  = var5_8 /* !! */ ;
                                                                    if (var7_17 != null) {
                                                                        var1_1 /* !! */  = var7_17.a;
                                                                        jns.ak(var1_1 /* !! */ );
                                                                        var1_1 /* !! */  = (efr)((gto)var1_1 /* !! */ ).f();
                                                                    }
                                                                    if (var1_1 /* !! */  != null) {
                                                                        ((eoq)var8_22).d.a((efr)var1_1 /* !! */ );
                                                                        var1_1 /* !! */  = ebu.b;
                                                                        var1_1 /* !! */  = ((eoq)var8_22).c((ebu)var1_1 /* !! */ , (eom)var9_23);
                                                                    } else {
                                                                        var1_1 /* !! */  = ekr.a(ebs.b);
                                                                    }
                                                                    var5_8 /* !! */  = var1_1 /* !! */ ;
                                                                    if (var1_1 /* !! */  != var6_12 /* !! */ ) break block52;
                                                                    return var6_12 /* !! */ ;
                                                                }
                                                                var1_1 /* !! */  = (eah)var5_8 /* !! */ ;
                                                            }
                                                            var1_1 /* !! */  = jns.aj(var1_2);
                                                            var7_17 = this.b;
                                                            if (joe.b(var1_1 /* !! */ )) {
                                                                var5_8 /* !! */  = var6_12 /* !! */  = ((ear)((eah)var1_1 /* !! */ ).f()).c;
                                                                if (var6_12 /* !! */  == null) {
                                                                    var5_8 /* !! */  = ebt.a;
                                                                }
                                                            } else {
                                                                var5_8 /* !! */  = var1_1 /* !! */ ;
                                                            }
                                                            jsl.p(((eoq)var7_17).j, (Object)var5_8 /* !! */ );
                                                            jns.ak(var1_1 /* !! */ );
                                                            return var1_1 /* !! */ ;
                                                        }
                                                        var5_8 /* !! */  = jqh.a;
                                                        var2_7 = this.a;
                                                        if (var2_7 == 0) break block60;
                                                        if (var2_7 == 1) break block61;
                                                        jns.ak(var1_1 /* !! */ );
                                                        break block62;
                                                    }
                                                    jns.ak(var1_1 /* !! */ );
                                                    break block63;
                                                }
                                                jns.ak(var1_1 /* !! */ );
                                                var1_1 /* !! */  = (jvb)this.d;
                                                ((heg)eoq.a.f().h(hfo.a, "ALT.SrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl$closeAudioSource$1", "invokeSuspend", 149, "AudioSourceDataAccessorImpl.kt")).u("#audio# closing audio source(%s)", ((eoq)this.b).h);
                                                var1_1 /* !! */  = ((eoq)this.b).f();
                                                if (var1_1 /* !! */  != null) {
                                                    var1_1 /* !! */ .b();
                                                }
                                                var6_13 = this.b;
                                                var1_1 /* !! */  = (eoq)var6_13;
                                                if (var1_1 /* !! */ .g == null) {
                                                    var7_18 = var1_1 /* !! */ .k;
                                                    var6_13 = this.c;
                                                    var1_1 /* !! */  = dpf.t(eas.a.l());
                                                    var1_1 /* !! */ .w((ebv)var6_13);
                                                    var1_1 /* !! */ .v(elb.c(ebp.i));
                                                    var7_18.O(var1_1 /* !! */ .u());
                                                    var1_1 /* !! */  = this.b;
                                                    this.a = 1;
                                                    var1_1 /* !! */  = var6_13 = ((eoq)var1_1 /* !! */ ).k.y(this);
                                                    if (var6_13 == var5_8 /* !! */ ) {
                                                        return var5_8 /* !! */ ;
                                                    } else {
                                                        ** GOTO lbl126
                                                    }
                                                }
                                                break block64;
                                            }
                                            var5_8 /* !! */  = ((eas)var1_1 /* !! */ ).c;
                                            var1_1 /* !! */  = var5_8 /* !! */ ;
                                            if (var5_8 /* !! */  == null) {
                                                var1_1 /* !! */  = ebq.a;
                                            }
                                            jse.d(var1_1 /* !! */ , "getAudioSourceClosingStatus(...)");
                                            return var1_1 /* !! */ ;
                                        }
                                        try {
                                            var1_1 /* !! */  = ((eoq)var6_13).c.a();
                                        }
                                        catch (Throwable var1_4) {
                                            var1_1 /* !! */  = jns.aj(var1_4);
                                        }
                                        var6_13 = this.c;
                                        if (joe.a(var1_1 /* !! */ ) == null) {
                                            var1_1 /* !! */  = (ebq)var1_1 /* !! */ ;
                                            jse.b(var1_1 /* !! */ );
                                            var1_1 /* !! */  = ekr.i((ebq)var1_1 /* !! */ , (ebv)var6_13);
                                        } else {
                                            var1_1 /* !! */  = ekr.k(ebp.l, (ebv)var6_13);
                                        }
                                        ((eoq)this.b).k.O(var1_1 /* !! */ );
                                        var1_1 /* !! */  = this.b;
                                        this.a = 2;
                                        var1_1 /* !! */  = var6_13 = ((eoq)var1_1 /* !! */ ).k.y(this);
                                        if (var6_13 == var5_8 /* !! */ ) {
                                            return var5_8 /* !! */ ;
                                        }
                                    }
                                    var5_8 /* !! */  = ((eas)var1_1 /* !! */ ).c;
                                    var1_1 /* !! */  = var5_8 /* !! */ ;
                                    if (var5_8 /* !! */  == null) {
                                        var1_1 /* !! */  = ebq.a;
                                    }
                                    jse.d(var1_1 /* !! */ , "getAudioSourceClosingStatus(...)");
                                    return var1_1 /* !! */ ;
                                }
                                var5_8 /* !! */  = jqh.a;
                                if (this.a != 0) {
                                    jns.ak(var1_1 /* !! */ );
                                    break block53;
                                }
                                jns.ak(var1_1 /* !! */ );
                                var1_1 /* !! */  = (jvb)this.d;
                                var6_14 = this.c;
                                var1_1 /* !! */  = this.b;
                                try {
                                    this.a = 1;
                                    var1_1 /* !! */  = var6_14 = ((eoi)var6_14).n((eom)var1_1 /* !! */ , this);
                                    if (var6_14 != var5_8 /* !! */ ) break block53;
                                    return var5_8 /* !! */ ;
                                }
                                catch (Throwable var1_5) {}
                            }
                            var1_1 /* !! */  = (eah)var1_1 /* !! */ ;
                            var1_1 /* !! */  = jns.aj(var1_5);
                            var7_19 = this.c;
                            if (joe.b(var1_1 /* !! */ )) {
                                var6_14 = ((ear)((eah)var1_1 /* !! */ ).f()).c;
                                var5_8 /* !! */  = var6_14;
                                if (var6_14 == null) {
                                    var5_8 /* !! */  = ebt.a;
                                }
                            } else {
                                var5_8 /* !! */  = var1_1 /* !! */ ;
                            }
                            jsl.p(((eoi)var7_19).g, (Object)var5_8 /* !! */ );
                            jns.ak(var1_1 /* !! */ );
                            return var1_1 /* !! */ ;
                        }
                        var5_8 /* !! */  = jqh.a;
                        if (this.a != 0) {
                            jns.ak(var1_1 /* !! */ );
                            return jon.a;
                        }
                        jns.ak(var1_1 /* !! */ );
                        var1_1 /* !! */  = (jyh)this.d;
                        var6_15 /* !! */  = ((baq)this.c).a();
                        if (var6_15 /* !! */  == null) {
                            jns.al((jyk)var1_1 /* !! */ );
                            return jon.a;
                        }
                        var7_20 = new bet(jse.ah((jvb)var1_1 /* !! */ , null, null, new bes((beu)this.b, (jyh)var1_1 /* !! */ , null, 0), 3), (jyh)var1_1 /* !! */ );
                        bbi.a();
                        var3_24 = bfa.a;
                        ((beu)this.b).a.registerNetworkCallback(var6_15 /* !! */ , (ConnectivityManager.NetworkCallback)var7_20);
                        var6_15 /* !! */  = new bfb(this.b, (Object)var7_20, 1);
                        this.a = 1;
                        if (jns.am((jyh)var1_1 /* !! */ , (jqz)var6_15 /* !! */ , this) != var5_8 /* !! */ ) return jon.a;
                        return var5_8 /* !! */ ;
                    }
                    var5_9 /* !! */  = jqh.a;
                    var2_7 = this.a;
                    if (var2_7 == 0) break block65;
                    if (var2_7 != 1) {
                        jns.ak(var1_1 /* !! */ );
                        break block66;
                    } else {
                        jns.ak(var1_1 /* !! */ );
                        break block54;
                    }
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = (jvb)this.d;
                var1_1 /* !! */  = (heg)eoi.a.f().h(hfo.a, "ALT.AdapterSrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor$closeAudioSource$1", "invokeSuspend", 208, "AudioAdapterAudioSourceDataAccessor.kt");
                var6_16 = (eoi)this.b;
                var1_1 /* !! */ .A("#audio# %s session(%d) closing source", var6_16.o(), var6_16.c);
                var1_1 /* !! */  = ((eoi)this.b).f();
                if (var1_1 /* !! */  != null) {
                    var1_1 /* !! */ .b();
                }
                var1_1 /* !! */  = this.b;
                try {
                    this.a = 1;
                    var1_1 /* !! */  = var6_16 = ((eoi)var1_1 /* !! */ ).l(this);
                    if (var6_16 != var5_9 /* !! */ ) break block54;
                    return var5_9 /* !! */ ;
                }
                catch (Throwable var1_6) {}
            }
            var1_1 /* !! */  = (ebq)var1_1 /* !! */ ;
            var1_1 /* !! */  = jns.aj(var1_6);
            var6_16 = joe.a(var1_1 /* !! */ );
            if (var6_16 != null) {
                ((heg)((heg)eoi.a.h().h(hfo.a, "ALT.AdapterSrcAccessor")).i((Throwable)var6_16).j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor$closeAudioSource$1", "invokeSuspend", 215, "AudioAdapterAudioSourceDataAccessor.kt")).r("#audio# closeAudioSource failed");
                if (var6_16 instanceof elx) {
                    var1_1 /* !! */  = ((elx)var6_16).a;
                    if (var1_1 /* !! */ .b == 2) {
                        var1_1 /* !! */  = var6_16 = ebs.b((Integer)var1_1 /* !! */ .c);
                        if (var6_16 == null) {
                            var1_1 /* !! */  = ebs.a;
                        }
                    } else {
                        var1_1 /* !! */  = ebs.a;
                    }
                    jse.d(var1_1 /* !! */ , "getFailure(...)");
                    var6_16 = ebp.l;
                    var2_7 = var1_1 /* !! */ .ordinal();
                    var1_1 /* !! */  = var2_7 != 5 ? (var2_7 != 51 ? (var2_7 != 52 ? var6_16 : ebp.G) : ebp.F) : ebp.t;
                    var1_1 /* !! */  = ekr.f((ebp)var1_1 /* !! */ );
                } else {
                    var1_1 /* !! */  = ekr.f(ebp.l);
                }
            }
            var6_16 = this.b;
            var7_21 = this.c;
            var1_1 /* !! */  = ekr.i((ebq)var1_1 /* !! */ , (ebv)var7_21);
            ((eoi)var6_16).h.O(var1_1 /* !! */ );
            var1_1 /* !! */  = this.b;
            this.a = 2;
            var1_1 /* !! */  = var6_16 = ((eoi)var1_1 /* !! */ ).h.y(this);
            if (var6_16 == var5_9 /* !! */ ) {
                return var5_9 /* !! */ ;
            }
        }
        var5_9 /* !! */  = ((eas)var1_1 /* !! */ ).c;
        var1_1 /* !! */  = var5_9 /* !! */ ;
        if (var5_9 /* !! */  == null) {
            var1_1 /* !! */  = ebq.a;
        }
        jse.d(var1_1 /* !! */ , "getAudioSourceClosingStatus(...)");
        return var1_1 /* !! */ ;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                object = ((jqm)this).c((jvb)object, (jqb)object2);
                                object2 = jon.a;
                                return ((eof)object).a(object2);
                            }
                            object = ((jqm)this).c((jvb)object, (jqb)object2);
                            object2 = jon.a;
                            return ((eof)object).a(object2);
                        }
                        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                        object = jon.a;
                        return ((eof)object2).a(object);
                    }
                    object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                    object = jon.a;
                    return ((eof)object2).a(object);
                }
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eof)object).a(object2);
            }
            object = ((jqm)this).c((jyh)object, (jqb)object2);
            object2 = jon.a;
            return ((eof)object).a(object2);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((eof)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                Object object2 = this.b;
                                Object object3 = this.c;
                                jqb2 = new eof(jqb2, (ewg)object2, (eah)object3, 6);
                                ((eof)jqb2).d = object;
                                return jqb2;
                            }
                            Object object4 = this.b;
                            Object object5 = this.c;
                            jqb2 = new eof(jqb2, (ewg)object4, (ecp)object5, 5);
                            ((eof)jqb2).d = object;
                            return jqb2;
                        }
                        Object object6 = this.b;
                        Object object7 = this.c;
                        jqb2 = new eof((eoq)object6, (eom)object7, jqb2, 4);
                        ((eof)jqb2).d = object;
                        return jqb2;
                    }
                    Object object8 = this.b;
                    ebv ebv2 = (ebv)this.c;
                    jqb2 = new eof((eoq)object8, ebv2, jqb2, 3);
                    ((eof)jqb2).d = object;
                    return jqb2;
                }
                Object object9 = this.c;
                Object object10 = this.b;
                jqb2 = new eof((eoi)object9, (eom)object10, jqb2, 2);
                ((eof)jqb2).d = object;
                return jqb2;
            }
            Object object11 = this.c;
            beu beu2 = (beu)this.b;
            jqb2 = new eof((baq)object11, beu2, jqb2, 1);
            ((eof)jqb2).d = object;
            return jqb2;
        }
        Object object12 = this.b;
        ebv ebv3 = (ebv)this.c;
        jqb2 = new eof((eoi)object12, ebv3, jqb2, 0);
        ((eof)jqb2).d = object;
        return jqb2;
    }
}

