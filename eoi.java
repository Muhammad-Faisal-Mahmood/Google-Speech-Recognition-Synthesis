/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.os.Process
 */
import android.app.AppOpsManager;
import android.os.Process;

public final class eoi
implements eot {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor");
    public final eip b;
    public final int c;
    public final edp d;
    public final gto e;
    public final eae f;
    public final jur g;
    public final jur h;
    public final eds i;
    public final bzb j;
    private final gto k;
    private final jvb l;
    private final enx m;
    private final jny n;
    private dzl o;
    private final jny p;
    private final jny q;
    private final jny r;
    private final jny s;
    private final hpn t;
    private final efq u;
    private final dtu v;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eoi(eip object, gto object2, int n2, eds eds2, edp edp2, gto gto2, bzb bzb2, jvb jvb2, enx enx2, dml dml2, dml dml3) {
        this.b = object;
        this.k = object2;
        this.c = n2;
        this.i = eds2;
        this.d = edp2;
        this.e = gto2;
        this.j = bzb2;
        this.l = jvb2;
        this.m = enx2;
        this.v = cqq.av(jvb2);
        this.n = new jog(new eop(this, 1));
        this.g = new jur();
        this.h = object = new jur();
        this.p = new jog(new al((Object)this, (Object)dml3, (Object)dml2, 4, null));
        this.q = new jog(new mq(this, 19));
        this.r = new jog(new mq(this, 18));
        this.s = object2 = new jog(new mq(this, 20));
        this.t = jsd.k((jvi)object);
        object = (gto)object2.a();
        object = object2 = edp2.c;
        if (object2 == null) {
            object = edq.a;
        }
        object = object2 = ((edq)object).d;
        if (object2 == null) {
            object = eae.a;
        }
        jse.d(object, "getAudioLibInputParams(...)");
        this.f = object;
        n2 = eds2.a.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) throw new joa();
                        object = efs.a;
                    } else {
                        object = efs.l;
                    }
                } else {
                    object = efs.h;
                }
            } else {
                object = efs.f;
            }
        } else {
            object = efs.g;
        }
        this.u = dww.i((efs)object);
    }

    private final gto q() {
        return (gto)this.q.a();
    }

    @Override
    public final int a() {
        this.p(ebs.b);
        Object object = this.m();
        jns.ak(object);
        object = (ewp)((gto)object).f();
        if (object != null && (object = ((ewp)object).a()) != null) {
            return object.b();
        }
        throw new IllegalStateException("Source was expected to be opened by this time");
    }

    @Override
    public final eae b() {
        return this.f;
    }

    public final eah c(ebu object, eom eom2) {
        Object object2;
        Object object3 = this.m();
        jns.ak(object3);
        object3 = (ewp)((gto)object3).f();
        if (object3 != null && (object2 = ((ewp)object3).a()) != null) {
            boolean bl2 = object2 instanceof edv;
            Object object4 = null;
            object3 = bl2 ? (edv)object2 : null;
            object2 = object2 instanceof eeb ? (eeb)object2 : null;
            if (object3 != null) {
                object4 = dpg.l((edx)object3, eom2.a());
            }
            object3 = gto.h(object4);
            object4 = dpg.k((eeb)object2, eom2.a());
            object2 = gto.h(this.o);
            Object object5 = dww.k(ebt.a.l());
            ((bzb)object5).r((ebu)object);
            object5 = ((bzb)object5).p();
            object = object == ebu.d ? dww.j(this.q()).b(new eex(wl.s, 5)) : this.q().b(new eex(wl.t, 6));
            return ekr.c((gto)object3, (gto)object4, (gto)object2, (ebt)object5, (gto)object, (hpn)dpg.f((gto)this.r.a(), eom2.a(), this.f).a());
        }
        throw new IllegalStateException("Source was expected to be opened by this time");
    }

    @Override
    public final efq d() {
        return this.u;
    }

    @Override
    public final /* synthetic */ eln e() {
        return null;
    }

    public final enh f() {
        return (enh)this.p.a();
    }

    @Override
    public final /* synthetic */ eot g() {
        return this;
    }

    @Override
    public final hpn h(ebv object) {
        jse.e(object, "stopListeningReason");
        object = new eof(this, (ebv)object, null, 0);
        return this.v.j((jro)object);
    }

    @Override
    public final hpn i(ebu object, eom eom2) {
        jse.e(object, "success");
        object = new eoo(this, eom2, (ebu)object, null, 1);
        return this.v.j((jro)object);
    }

    @Override
    public final hpn j() {
        return this.t;
    }

    @Override
    public final hpn k(eom object) {
        object = new eof(this, (eom)object, null, 2);
        return this.v.j((jro)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object l(jqb var1_1) {
        if (!(var1_1 instanceof eog)) ** GOTO lbl-1000
        var3_2 = (eog)var1_1;
        var2_3 = var3_2.c;
        if ((var2_3 & -2147483648) != 0) {
            var3_2.c = var2_3 + -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            var3_2 = new eog(this, (jqb)var1_1);
        }
        var1_1 = var3_2.a;
        var5_4 = jqh.a;
        var2_3 = var3_2.c;
        if (var2_3 == 0) ** GOTO lbl16
        if (var2_3 == 1) {
            jns.ak(var1_1);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl16:
            // 1 sources

            jns.ak(var1_1);
            var1_1 = this.m();
            jns.ak(var1_1);
            var6_5 = (ewp)((gto)var1_1).f();
            if (var6_5 == null) {
                return ekr.f(ebp.C);
            }
            var7_6 = edr.a.l();
            jse.d(var7_6, "newBuilder(...)");
            var4_7 /* !! */  = this.d.c;
            var1_1 = var4_7 /* !! */ ;
            if (var4_7 /* !! */  == null) {
                var1_1 = edq.a;
            }
            jse.d(var1_1, "getStartListeningParams(...)");
            jse.e(var1_1, "<this>");
            if ((var1_1.b & 4) != 0) {
                var4_7 /* !! */  = var1_1.e;
                var1_1 = var4_7 /* !! */ ;
                if (var4_7 /* !! */  == null) {
                    var1_1 = ebm.a;
                }
            } else {
                var1_1 = null;
            }
            if (var1_1 != null) {
                if (!var7_6.b.B()) {
                    var7_6.u();
                }
                var4_7 /* !! */  = (edr)var7_6.b;
                var4_7 /* !! */ .c = var1_1;
                var4_7 /* !! */ .b |= 2;
            }
            var6_5.a().f();
            var1_1 = this.i.b((edr)var7_6.o());
            var3_2.c = 1;
            var1_1 = var3_2 = jsd.l((hpn)var1_1, (jqb)var3_2);
            if (var3_2 == var5_4) {
                return var5_4;
            }
        }
        jse.d(var1_1, "await(...)");
        return var1_1;
    }

    public final Object m() {
        return ((joe)this.n.a()).a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object n(eom var1_1, jqb var2_2) {
        block16: {
            block15: {
                block13: {
                    block14: {
                        if (!(var2_2 instanceof eoh)) ** GOTO lbl-1000
                        var4_3 = (eoh)var2_2;
                        var3_4 = var4_3.d;
                        if ((var3_4 & -2147483648) != 0) {
                            var4_3.d = var3_4 + -2147483648;
                            var2_2 = var4_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new eoh(this, (jqb)var2_2);
                        }
                        var5_5 = var2_2.b;
                        var6_6 = jqh.a;
                        var3_4 = var2_2.d;
                        if (var3_4 == 0) break block13;
                        if (var3_4 != 1) break block14;
                        var4_3 = var2_2.a;
                        var1_1 = var2_2.e;
                        jns.ak(var5_5);
                        var2_2 = var4_3;
                        break block15;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var5_5);
                ((heg)eoi.a.f().h(hfo.a, "ALT.AdapterSrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor", "startListeningInternal", 170, "AudioAdapterAudioSourceDataAccessor.kt")).G("#audio# %s session(%d) opening source, offset(%s)", this.o(), new Integer(this.c), var1_1);
                if (!this.m.c()) {
                    var2_2 = this.m;
                    var1_1 = (AppOpsManager)var2_2.b.getSystemService("appops");
                    if (var1_1 == null) {
                        ((heg)((heg)enx.a.h().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "showDialog", 60, "RecordAudioOpChecker.java")).r("#audio# Unable to get access to app ops manager");
                    } else {
                        var2_2 = var2_2.b;
                        sk$$ExternalSyntheticApiModelOutline1.m((AppOpsManager)var1_1, "android:record_audio", Process.myUid(), var2_2.getPackageName(), null, null);
                    }
                    return ekr.a(ebs.k);
                }
                var4_3 = this.f();
                var4_3 = var4_3 != null ? var4_3.a() : null;
                this.o = var4_3;
                var4_3 = this.m();
                jns.ak(var4_3);
                var4_3 = (ewp)((gto)var4_3).f();
                if (var4_3 == null) {
                    return ekr.a(ebs.Y);
                }
                var4_3 = var4_3.b();
                jse.d(var4_3, "audioSourceOpeningStatus(...)");
                var2_2.e = this;
                var2_2.a = var1_1;
                var2_2.d = 1;
                var5_5 = jsd.l((hpn)var4_3, (jqb)var2_2);
                if (var5_5 == var6_6) break block16;
                var4_3 = this;
                var2_2 = var1_1;
                var1_1 = var4_3;
            }
            var4_3 = (ebt)var5_5;
            if (var4_3.b == 2) {
                var1_1 = var2_2 = ebs.b((Integer)var4_3.c);
                if (var2_2 == null) {
                    var1_1 = ebs.a;
                }
                jse.d(var1_1, "getFailure(...)");
                return ekr.a((ebs)var1_1);
            }
            var4_3 = var1_1.c(ebu.b, (eom)var2_2);
            if (var1_1.k.g()) {
                var6_6 = var1_1.m;
                var7_7 = hhk.K(var4_3);
                var5_5 = var1_1.t;
                var3_4 = var1_1.c;
                var1_1 = var2_2 = eyf.b(var1_1.d.d);
                if (var2_2 == null) {
                    var1_1 = eyf.a;
                }
                jse.d(var1_1, "getAttributionId(...)");
                var6_6.a(var7_7, (hpn)var5_5, var3_4, crh.G((eyf)var1_1));
            }
            return var4_3;
        }
        return var6_6;
    }

    public final String o() {
        if (!this.k.g()) {
            return "hotword";
        }
        return "audio request";
    }

    public final void p(ebs ebs2) {
        Object object;
        try {
            object = (ebt)this.g.A();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        Object object2 = object;
        if (object instanceof jod) {
            object2 = null;
        }
        if ((object = (ebt)object2) != null && ((ebt)object).b == 1) {
            return;
        }
        throw new elx(ekr.g(ebs2));
    }
}

