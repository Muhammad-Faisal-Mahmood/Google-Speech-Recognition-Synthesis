/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public final class aus
extends jqs
implements jro {
    int a;
    final Object b;
    private final int c;

    public aus(CoroutineWorker coroutineWorker, jqb jqb2, int n2) {
        this.c = n2;
        this.b = coroutineWorker;
        super(2, jqb2);
    }

    public aus(CoroutineWorker coroutineWorker, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = coroutineWorker;
        super(2, jqb2);
    }

    public aus(ConstraintTrackingWorker constraintTrackingWorker, jqb jqb2, int n2) {
        this.c = n2;
        this.b = constraintTrackingWorker;
        super(2, jqb2);
    }

    public aus(aue aue2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = aue2;
        super(2, jqb2);
    }

    public aus(avc avc2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = avc2;
        super(2, jqb2);
    }

    public aus(dhl dhl2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = dhl2;
        super(2, jqb2);
    }

    public aus(dhl dhl2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = dhl2;
        super(2, jqb2);
    }

    public aus(eej eej2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = eej2;
        super(2, jqb2);
    }

    public aus(eej eej2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = eej2;
        super(2, jqb2);
    }

    public aus(ehq ehq2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = ehq2;
        super(2, jqb2);
    }

    public aus(ehq ehq2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = ehq2;
        super(2, jqb2);
    }

    public aus(ehq ehq2, jqb jqb2, int n2, char[] cArray) {
        this.c = n2;
        this.b = ehq2;
        super(2, jqb2);
    }

    public aus(eif eif2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = eif2;
        super(2, jqb2);
    }

    public aus(eif eif2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = eif2;
        super(2, jqb2);
    }

    public aus(eli eli2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = eli2;
        super(2, jqb2);
    }

    public aus(eli eli2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = eli2;
        super(2, jqb2);
    }

    public aus(eli eli2, jqb jqb2, int n2, char[] cArray) {
        this.c = n2;
        this.b = eli2;
        super(2, jqb2);
    }

    public aus(epa epa2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = epa2;
        super(2, jqb2);
    }

    public aus(epa epa2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = epa2;
        super(2, jqb2);
    }

    public aus(hpn hpn2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = hpn2;
        super(2, jqb2);
    }

    public aus(hpn hpn2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = hpn2;
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
        switch (this.c) {
            default: {
                var6_5 = jqh.a;
                var2_19 = this.a;
                jns.ak(var1_1 /* !! */ );
                if (var2_19 == 0) break;
                return var1_1 /* !! */ ;
            }
            case 19: {
                var6_6 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                } else {
                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = ((epa)this.b).d.j();
                    this.a = 1;
                    var1_1 /* !! */  = var5_21 = jsd.l((hpn)var1_1 /* !! */ , this);
                    if (var5_21 == var6_6) {
                        return var6_6;
                    }
                }
                var1_1 /* !! */  = (eas)var1_1 /* !! */ ;
                var1_1 /* !! */  = (epa)this.b;
                var5_21 = new aus((epa)var1_1 /* !! */ , null, 18);
                var1_1 /* !! */ .l.j((jro)var5_21);
                return jon.a;
            }
            case 18: {
                var5_22 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((epa)var1_1 /* !! */ ).c(this) != var5_22) return jon.a;
                return var5_22;
            }
            case 17: {
                var5_23 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((eli)var1_1 /* !! */ ).i(this) != var5_23) return jon.a;
                return var5_23;
            }
            case 16: {
                var5_24 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((eli)var1_1 /* !! */ ).g(this) != var5_24) return jon.a;
                return var5_24;
            }
            case 15: {
                var5_25 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((eli)var1_1 /* !! */ ).h(this) != var5_25) return jon.a;
                return var5_25;
            }
            case 14: {
                var5_26 /* !! */  = jqh.a;
                var2_20 = this.a;
                if (var2_20 == 0) ** GOTO lbl72
                if (var2_20 == 1) ** GOTO lbl135
                jns.ak(var1_1 /* !! */ );
                ** GOTO lbl128
lbl72:
                // 1 sources

                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = (heg)eif.a.f().h(hfo.a, "ALT.BtFallbackRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothFallbackAwareAudioRoute$connect$1", "invokeSuspend", 93, "BluetoothFallbackAwareAudioRoute.kt");
                var7_41 = (eif)this.b;
                var6_7 = var7_41.b;
                var7_41 = var7_41.e;
                var1_1 /* !! */ .G("#audio# connect to client(%s) route(%s, behavior(%s))", var6_7.d, var6_7.b, var7_41.name());
                if (((eif)this.b).f.bH()) {
                    var1_1 /* !! */  = (heg)eif.a.h().h(hfo.a, "ALT.BtFallbackRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothFallbackAwareAudioRoute$connect$1", "invokeSuspend", 103, "BluetoothFallbackAwareAudioRoute.kt");
                    var5_26 /* !! */  = ((eif)this.b).b;
                    var1_1 /* !! */ .C("#audio# connect to client(%s) route(%s) failed, already disconnected", var5_26 /* !! */ .d, var5_26 /* !! */ .b);
                    var1_1 /* !! */  = dww.f(eax.a.l());
                    var1_1 /* !! */ .g(ebo.f);
                    return var1_1 /* !! */ .f();
                }
                var1_1 /* !! */  = (eif)this.b;
                var6_7 = var1_1 /* !! */ .d;
                var6_7 = var6_7.d(new ehh((ehq)var6_7, null));
                var7_41 = new aus((hpn)var6_7, null, 13);
                var1_1 /* !! */  = jse.ag(var1_1 /* !! */ .c, (jro)var7_41);
                var1_1 /* !! */ .w(new mz(var6_7, 13));
                var7_41 = this.b;
                var6_7 = jsd.k((jvi)var1_1 /* !! */ );
                var8_43 = (eif)var7_41;
                var2_20 = var8_43.e.ordinal();
                if (var2_20 != 0) {
                    if (var2_20 != 1) {
                        if (var2_20 != 2) throw new joa();
                    }
                    var7_41 = var8_43.g;
                    var9_44 = var8_43.b;
                    var8_43 = var8_43.d;
                    var10_46 = var9_44.a;
                    jse.e(var10_46, "clientInfo");
                    var8_43 = var8_43.j;
                    var9_44 = var9_44.d;
                    var7_41.q(var10_46, (hpn)var6_7, (Integer)var9_44, var8_43.b);
                    var9_44 = gto.h(var9_44);
                    ((evo)var7_41.d).c((hpn)var6_7, var8_43.a, (gto)var9_44, var8_43.b);
                    var7_41 = (enc)var7_41.b;
                    var7_41.b((hpn)var6_7, (ekk)var8_43);
                    var7_41.a((hpn)var6_7, (ekk)var8_43);
                } else {
                    var9_45 = var8_43.g;
                    var7_41 = var8_43.b;
                    var8_43 = var8_43.d;
                    var10_47 = var7_41.d;
                    var9_45.q(var7_41.a, (hpn)var6_7, var10_47, var8_43.j.b);
                }
                var2_20 = ((eif)this.b).e.ordinal();
                if (var2_20 != 0) {
                    if (var2_20 != 1) {
                        if (var2_20 != 2) throw new joa();
                        var1_1 /* !! */  = dww.f(eax.a.l());
                        var1_1 /* !! */ .g(ebo.b);
                        return var1_1 /* !! */ .f();
                    }
                    this.a = 2;
                    if (var1_1 /* !! */ .m(this) == var5_26 /* !! */ ) {
                        return var5_26 /* !! */ ;
                    } else {
                        ** GOTO lbl128
                    }
                }
                ** GOTO lbl131
lbl128:
                // 3 sources

                var1_1 /* !! */  = dww.f(eax.a.l());
                var1_1 /* !! */ .g(ebo.b);
                return var1_1 /* !! */ .f();
lbl131:
                // 1 sources

                this.a = 1;
                var1_1 /* !! */  = var6_7 = var1_1 /* !! */ .m(this);
                if (var6_7 != var5_26 /* !! */ ) return (eax)var1_1 /* !! */ ;
                return var5_26 /* !! */ ;
lbl135:
                // 1 sources

                jns.ak(var1_1 /* !! */ );
                return (eax)var1_1 /* !! */ ;
            }
            case 13: {
                var6_8 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_27 = jsd.l((hpn)var1_1 /* !! */ , this);
                if (var5_27 != var6_8) return var1_1 /* !! */ ;
                return var6_8;
            }
            case 12: {
                var6_9 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                } else {
                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = this.b;
                    this.a = 1;
                    var1_1 /* !! */  = var5_28 = jsd.l(((eif)var1_1 /* !! */ ).d.j.a, this);
                    if (var5_28 == var6_9) {
                        return var6_9;
                    }
                }
                var5_28 = this.b;
                var1_1 /* !! */  = (eav)var1_1 /* !! */ ;
                var5_28 = (eif)var5_28;
                var5_28.f(new eht((eif)var5_28, (eav)var1_1 /* !! */ , null, 3));
                return jon.a;
            }
            case 11: {
                var6_10 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = ((ejz)((ehq)this.b).e.get()).a();
                this.a = 1;
                var1_1 /* !! */  = var5_29 = jsd.l((hpn)var1_1 /* !! */ , this);
                if (var5_29 != var6_10) return var1_1 /* !! */ ;
                return var6_10;
            }
            case 10: {
                var6_11 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_30 = ((ehq)var1_1 /* !! */ ).m.y(this);
                if (var5_30 != var6_11) return var1_1 /* !! */ ;
                return var6_11;
            }
            case 9: {
                var6_12 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_31 = ((ehq)var1_1 /* !! */ ).n.y(this);
                if (var5_31 != var6_12) return var1_1 /* !! */ ;
                return var6_12;
            }
            case 8: {
                var5_32 /* !! */  = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                } else {
                    jns.ak(var1_1 /* !! */ );
                    var1_1 /* !! */  = (eej)this.b;
                    var3_48 = var1_1 /* !! */ .c.toMillis();
                    var1_1 /* !! */  = new aus((eej)var1_1 /* !! */ , null, 7);
                    this.a = 1;
                    var1_1 /* !! */  = var6_13 = jns.aq(var3_48, (jro)var1_1 /* !! */ , this);
                    if (var6_13 == var5_32 /* !! */ ) {
                        return var5_32 /* !! */ ;
                    }
                }
                var5_32 /* !! */  = (eaf)var1_1 /* !! */ ;
                var1_1 /* !! */  = var5_32 /* !! */ ;
                if (var5_32 /* !! */  != null) return var1_1 /* !! */ ;
                return eej.b;
            }
            case 7: {
                var6_14 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_33 = jsd.l(((eej)var1_1 /* !! */ ).d, this);
                if (var5_33 != var6_14) return var1_1 /* !! */ ;
                return var6_14;
            }
            case 6: {
                var6_15 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_34 = ((ConstraintTrackingWorker)var1_1 /* !! */ ).i(this);
                if (var5_34 != var6_15) return var1_1 /* !! */ ;
                return var6_15;
            }
            case 5: {
                var5_35 /* !! */  = jqh.a;
                if (this.a == 0) ** GOTO lbl250
                try {
                    jns.ak(var1_1 /* !! */ );
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl260
                }
                catch (bdp var1_3) {
                    ** GOTO lbl264
                }
                catch (CancellationException var1_4) {
                    var1_1 /* !! */  = new bds(null);
                    ** GOTO lbl265
                }
lbl250:
                // 1 sources

                jns.ak(var1_1 /* !! */ );
                {
                    var1_1 /* !! */  = this.b;
                    var6_16 = ((dhl)var1_1 /* !! */ ).h;
                    var7_42 = new aus((dhl)var1_1 /* !! */ , null, 4);
                    this.a = 1;
                    var1_1 /* !! */  = var6_16 = jse.ae((jqf)var6_16, var7_42, this);
                    if (var6_16 != var5_35 /* !! */ ) ** GOTO lbl-1000
                    return var5_35 /* !! */ ;
                }
lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (ass)var1_1 /* !! */ ;
                    ** GOTO lbl265
                }
lbl260:
                // 1 sources

                var5_35 /* !! */  = bdy.a;
                bbi.a().d((String)var5_35 /* !! */ , "Unexpected error in WorkerWrapper", var1_2);
                var1_1 /* !! */  = new bds(null);
                ** GOTO lbl265
lbl264:
                // 1 sources

                var1_1 /* !! */  = new bdu(var1_3.a);
lbl265:
                // 4 sources

                var5_35 /* !! */  = (dhl)this.b;
                var1_1 /* !! */  = new bdv((ass)var1_1 /* !! */ , (dhl)var5_35 /* !! */ );
                var1_1 /* !! */  = ((aum)var5_35 /* !! */ .d).e((Callable)var1_1 /* !! */ );
                jse.d(var1_1 /* !! */ , "workDatabase.runInTransa\u2026          }\n            )");
                return var1_1 /* !! */ ;
            }
            case 4: {
                var6_17 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_36 = ((dhl)var1_1 /* !! */ ).h(this);
                if (var5_36 != var6_17) return var1_1 /* !! */ ;
                return var6_17;
            }
            case 3: {
                var6_18 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                var1_1 /* !! */  = var5_37 = ((CoroutineWorker)var1_1 /* !! */ ).c(this);
                if (var5_37 != var6_18) return var1_1 /* !! */ ;
                return var6_18;
            }
            case 2: {
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return var1_1 /* !! */ ;
                }
                jns.ak(var1_1 /* !! */ );
                this.a = 1;
                throw new IllegalStateException("Not implemented");
            }
            case 1: {
                var5_38 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((aue)var1_1 /* !! */ ).a(this) != var5_38) return jon.a;
                return var5_38;
            }
            case 0: {
                var5_39 = jqh.a;
                if (this.a != 0) {
                    jns.ak(var1_1 /* !! */ );
                    return jon.a;
                }
                jns.ak(var1_1 /* !! */ );
                var1_1 /* !! */  = this.b;
                this.a = 1;
                if (((avc)var1_1 /* !! */ ).e(this) != var5_39) return jon.a;
                return var5_39;
            }
        }
        var1_1 /* !! */  = this.b;
        this.a = 1;
        var1_1 /* !! */  = var5_40 = jsd.l((hpn)var1_1 /* !! */ , this);
        if (var5_40 != var6_5) return var1_1 /* !! */ ;
        return var6_5;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        switch (this.c) {
            default: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 19: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 18: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 17: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 16: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 15: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 14: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 13: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 12: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 11: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 10: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 9: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 8: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 7: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 6: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 5: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 4: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 3: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((aus)object).a(object2);
            }
            case 2: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                ((aus)object2).a(object);
                return object;
            }
            case 1: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((aus)object2).a(object);
            }
            case 0: 
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((aus)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        switch (this.c) {
            default: {
                return new aus((hpn)this.b, jqb2, 20, null);
            }
            case 19: {
                return new aus((epa)this.b, jqb2, 19, null);
            }
            case 18: {
                return new aus((epa)this.b, jqb2, 18);
            }
            case 17: {
                return new aus((eli)this.b, jqb2, 17, null);
            }
            case 16: {
                return new aus((eli)this.b, jqb2, 16, null);
            }
            case 15: {
                return new aus((eli)this.b, jqb2, 15);
            }
            case 14: {
                return new aus((eif)this.b, jqb2, 14, null);
            }
            case 13: {
                return new aus((hpn)this.b, jqb2, 13);
            }
            case 12: {
                return new aus((eif)this.b, jqb2, 12);
            }
            case 11: {
                return new aus((ehq)this.b, jqb2, 11, null);
            }
            case 10: {
                return new aus((ehq)this.b, jqb2, 10, null);
            }
            case 9: {
                return new aus((ehq)this.b, jqb2, 9);
            }
            case 8: {
                return new aus((eej)this.b, jqb2, 8, null);
            }
            case 7: {
                return new aus((eej)this.b, jqb2, 7);
            }
            case 6: {
                return new aus((ConstraintTrackingWorker)this.b, jqb2, 6);
            }
            case 5: {
                return new aus((dhl)this.b, jqb2, 5, null);
            }
            case 4: {
                return new aus((dhl)this.b, jqb2, 4);
            }
            case 3: {
                return new aus((CoroutineWorker)this.b, jqb2, 3, null);
            }
            case 2: {
                return new aus((CoroutineWorker)this.b, jqb2, 2);
            }
            case 1: {
                return new aus((aue)this.b, jqb2, 1);
            }
            case 0: 
        }
        return new aus((avc)this.b, jqb2, 0);
    }
}

