/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class evi {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender");
    public final jrk b;
    public final gto c;
    public final Runnable d;
    public final Executor e;
    public final Executor f;
    public final jtz g;
    private final hpn h;
    private final hpn i;
    private final jrk j;
    private final hpn k;
    private final jnf l;
    private final jvb m;
    private final jtz n;

    public evi(hpn object, jrk jrk2, hpn hpn2, jrk jrk3, hpn hpn3, gto gto2, Runnable runnable, jnf jnf2, jvb jvb2, Executor executor, Executor executor2) {
        this.h = object;
        this.b = jrk2;
        this.i = hpn2;
        this.j = jrk3;
        this.k = hpn3;
        this.c = gto2;
        this.d = runnable;
        this.l = jnf2;
        this.m = jvb2;
        this.e = executor;
        this.f = executor2;
        this.g = new jtz(false, jud.a);
        this.n = new jtz(false, jud.a);
        object = new dqv(this, 14);
        ((jmy)jnf2).e((Runnable)object);
    }

    private final void l(ebs object) {
        bzq bzq2 = crh.X(eun.a.l());
        cxt cxt2 = euf.t(euk.a.l());
        bzo bzo2 = dpf.r(ear.a.l());
        bzb bzb2 = dww.k(ebt.a.l());
        bzb2.q((ebs)object);
        bzo2.q(bzb2.p());
        cxt2.K(bzo2.p());
        object = dpf.u(edf.a.l());
        ((cxt)object).y(((Number)((gtt)this.c).a).intValue());
        cxt2.J(((cxt)object).x());
        bzq2.M(cxt2.I());
        this.f(bzq2.I());
        this.h();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(jqb var1_1) {
        block12: {
            block10: {
                block11: {
                    if (!(var1_1 instanceof euy)) ** GOTO lbl-1000
                    var3_4 = (euy)var1_1;
                    var2_5 = var3_4.c;
                    if ((var2_5 & -2147483648) != 0) {
                        var3_4.c = var2_5 + -2147483648;
                        var1_1 = var3_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 = new euy(this, (jqb)var1_1);
                    }
                    var4_6 = var1_1.a;
                    var3_4 = jqh.a;
                    var2_5 = var1_1.c;
                    if (var2_5 != 0) {
                        if (var2_5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_4 = var1_1 = var1_1.d;
                        try {
                            jns.ak(var4_6);
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
                    }
                    jns.ak(var4_6);
                    ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "handleAudioParams", 184, "StreamListeningSessionResponseSender.kt")).r("#audio# Handle audio params for the remote client");
                    try {
                        var4_6 = this.k;
                        var1_1.d = this;
                        var1_1.c = 1;
                        var4_6 = jsd.l((hpn)var4_6, (jqb)var1_1);
                        if (var4_6 == var3_4) break block11;
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var3_4 = this;
                        break block10;
                    }
                    var3_4 = var1_1;
                    {
                        var4_6 = (eae)var4_6;
                        var3_4 = var1_1;
                        var1_1 = var4_6;
                        break block12;
                    }
                }
                return var3_4;
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        var4_6 = joe.a(var1_1);
        if (var4_6 == null) {
            return var1_1;
        }
        ((heg)((heg)evi.a.g().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var4_6).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "handleAudioParams", 190, "StreamListeningSessionResponseSender.kt")).r("#audio# Fail while getting session's audio params, shutting down");
        super.l(ebs.ae);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(jqb var1_1) {
        block12: {
            block10: {
                block11: {
                    if (!(var1_1 instanceof euz)) ** GOTO lbl-1000
                    var3_4 /* !! */  = (euz)var1_1;
                    var2_5 = var3_4 /* !! */ .c;
                    if ((var2_5 & -2147483648) != 0) {
                        var3_4 /* !! */ .c = var2_5 + -2147483648;
                        var1_1 = var3_4 /* !! */ ;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 = new euz(this, (jqb)var1_1);
                    }
                    var4_6 = var1_1.a;
                    var3_4 /* !! */  = jqh.a;
                    var2_5 = var1_1.c;
                    if (var2_5 != 0) {
                        if (var2_5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var1_1 = var1_1.d;
                        var3_4 /* !! */  = var1_1;
                        try {
                            jns.ak(var4_6);
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
                    }
                    jns.ak(var4_6);
                    ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "handleStartListeningResult", 171, "StreamListeningSessionResponseSender.kt")).r("#audio# Handle start listening result for the remote client");
                    try {
                        var4_6 = this.h;
                        var1_1.d = this;
                        var1_1.c = 1;
                        var4_6 = jsd.l((hpn)var4_6, (jqb)var1_1);
                        if (var4_6 == var3_4 /* !! */ ) break block11;
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var3_4 /* !! */  = this;
                        break block10;
                    }
                    var3_4 /* !! */  = var1_1;
                    {
                        var4_6 = (ecp)var4_6;
                        break block12;
                    }
                }
                return var3_4 /* !! */ ;
            }
            var4_6 = jns.aj((Throwable)var1_1);
            var1_1 = var3_4 /* !! */ ;
        }
        var3_4 /* !! */  = joe.a(var4_6);
        if (var3_4 /* !! */  == null) {
            return var4_6;
        }
        ((heg)((heg)evi.a.g().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var3_4 /* !! */ ).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "handleStartListeningResult", 177, "StreamListeningSessionResponseSender.kt")).r("#audio# Fail while getting session's start status, shutting down");
        super.l(ebs.ad);
        return null;
    }

    public final Object c(dzl object, jrk jrk2, jqb jqb2) {
        if ((object = jvf.f(new evc((dzl)object, this, jrk2, null), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object d(hpn var1_1, jqb var2_4) {
        block12: {
            block10: {
                block11: {
                    if (!(var2_4 instanceof evd)) ** GOTO lbl-1000
                    var4_5 = (evd)var2_4;
                    var3_6 = var4_5.c;
                    if ((var3_6 & -2147483648) != 0) {
                        var4_5.c = var3_6 + -2147483648;
                        var2_4 = var4_5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_4 = new evd(this, (jqb)var2_4);
                    }
                    var4_5 = var2_4.a;
                    var5_7 = jqh.a;
                    var3_6 = var2_4.c;
                    if (var3_6 != 0) {
                        if (var3_6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var2_4 = var1_1 = var2_4.d;
                        try {
                            jns.ak(var4_5);
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
                    }
                    jns.ak(var4_5);
                    ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendAudioStartTime", 322, "StreamListeningSessionResponseSender.kt")).r("#audio# sending audio start time to the remote client");
                    try {
                        var2_4.d = this;
                        var2_4.c = 1;
                        var4_5 = jsd.l((hpn)var1_1, (jqb)var2_4);
                        if (var4_5 == var5_7) break block11;
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var2_4 = this;
                        break block10;
                    }
                    var2_4 = var1_1;
                    {
                        var4_5 = (eaf)var4_5;
                        break block12;
                    }
                }
                return var5_7;
            }
            var4_5 = jns.aj((Throwable)var1_1);
            var1_1 = var2_4;
        }
        var2_4 = joe.a(var4_5);
        if (var2_4 == null) {
            var4_5 = (eaf)var4_5;
            var2_4 = crh.X(eun.a.l());
            var2_4.K((eaf)var4_5);
            var1_1.f(var2_4.I());
            return jon.a;
        }
        ((heg)((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var2_4).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendAudioStartTime", 329, "StreamListeningSessionResponseSender.kt")).r("#audio# unexpected fail while getting session's audio start time, send empty");
        var2_4 = crh.X(eun.a.l());
        var2_4.K(doc.m((hwr)eaf.a.l()).n());
        var1_1.f(var2_4.I());
        return jon.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e(hpn var1_1, jqb var2_4) {
        block12: {
            block10: {
                block11: {
                    if (!(var2_4 instanceof eve)) ** GOTO lbl-1000
                    var4_5 = (eve)var2_4;
                    var3_6 = var4_5.c;
                    if ((var3_6 & -2147483648) != 0) {
                        var4_5.c = var3_6 + -2147483648;
                        var2_4 = var4_5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_4 = new eve(this, (jqb)var2_4);
                    }
                    var4_5 = var2_4.a;
                    var5_7 = jqh.a;
                    var3_6 = var2_4.c;
                    if (var3_6 != 0) {
                        if (var3_6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var2_4 = var1_1 = var2_4.d;
                        try {
                            jns.ak(var4_5);
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
                    }
                    jns.ak(var4_5);
                    ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendFirstByteReadResult", 302, "StreamListeningSessionResponseSender.kt")).r("#audio# Sending first byte read result to the remote client");
                    try {
                        var2_4.d = this;
                        var2_4.c = 1;
                        var4_5 = jsd.l((hpn)var1_1, (jqb)var2_4);
                        if (var4_5 == var5_7) break block11;
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var2_4 = this;
                        break block10;
                    }
                    var2_4 = var1_1;
                    {
                        var4_5 = (eag)var4_5;
                        break block12;
                    }
                }
                return var5_7;
            }
            var4_5 = jns.aj((Throwable)var1_1);
            var1_1 = var2_4;
        }
        var2_4 = joe.a(var4_5);
        if (var2_4 == null) {
            var2_4 = (eag)var4_5;
            var4_5 = crh.X(eun.a.l());
            var4_5.L((eag)var2_4);
            var1_1.f(var4_5.I());
            return jon.a;
        }
        ((heg)((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var2_4).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendFirstByteReadResult", 309, "StreamListeningSessionResponseSender.kt")).r("#audio# Unexpected fail while getting session's first byte result, send empty");
        var2_4 = crh.X(eun.a.l());
        var2_4.L(dox.j(eag.a.l()).r());
        var1_1.f(var2_4.I());
        return jon.a;
    }

    public final Object f(eun object) {
        Object object2;
        if (!this.g.b()) {
            try {
                this.l.c(object);
                object = jon.a;
            }
            catch (Throwable throwable) {
                object = jns.aj(throwable);
            }
            Throwable throwable = joe.a(object);
            object2 = object;
            if (throwable != null) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.GrpcARCRespSender")).i(throwable).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendNext-IoAF18A", 388, "StreamListeningSessionResponseSender.kt")).r("#audio# Cannot send audio session data to the remote client, shutting down");
                this.i(throwable);
                return object;
            }
        } else {
            object2 = jns.aj(new Throwable());
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object g(jqb var1_1) {
        block11: {
            block10: {
                if (!(var1_1 instanceof evf)) ** GOTO lbl-1000
                var3_2 = (evf)var1_1;
                var2_5 = var3_2.c;
                if ((var2_5 & -2147483648) != 0) {
                    var3_2.c = var2_5 + -2147483648;
                    var1_1 = var3_2;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new evf(this, (jqb)var1_1);
                }
                var3_2 = var1_1.a;
                var4_6 = jqh.a;
                var2_5 = var1_1.c;
                if (var2_5 != 0) {
                    if (var2_5 == 1) {
                        var1_1 = var1_1.d;
                        try {
                            jns.ak(var3_2);
                        }
                        catch (Throwable var3_3) {
                            break block10;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var3_2);
                ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendStopListeningStatus", 198, "StreamListeningSessionResponseSender.kt")).r("#audio# waiting for stop status before sending to the remote client");
                try {
                    var3_2 = this.i;
                    var1_1.d = this;
                    var1_1.c = 1;
                    var3_2 = jsd.l((hpn)var3_2, (jqb)var1_1);
                    if (var3_2 != var4_6) {
                        var1_1 = this;
                        break block11;
                    }
                    return var4_6;
                }
                catch (Throwable var3_4) {
                    var1_1 = this;
                }
            }
            var3_2 = jns.aj((Throwable)var3_2);
        }
        var4_6 = joe.a(var3_2);
        if (var4_6 == null) {
            var4_6 = crh.X(eun.a.l());
            var4_6.N((eas)var1_1.j.a(var3_2));
            var1_1.f(var4_6.I());
            return jon.a;
        }
        ((heg)((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var4_6).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendStopListeningStatus", 205, "StreamListeningSessionResponseSender.kt")).r("#audio# Unexpected fail while getting stop listening status, send failing");
        var3_2 = dww.l(ebq.a.l());
        var3_2.t(ebp.H);
        var5_7 = var3_2.s();
        var3_2 = crh.X(eun.a.l());
        var4_6 = dpf.t(eas.a.l());
        var4_6.v(var5_7);
        var3_2.N(var4_6.u());
        var1_1.f(var3_2.I());
        return jon.a;
    }

    public final void h() {
        if (!this.g.c()) {
            try {
                this.l.a();
            }
            catch (Throwable throwable) {
                jns.aj(throwable);
            }
            this.j();
        }
    }

    public final void i(Throwable throwable) {
        if (!this.g.c()) {
            try {
                this.l.b(throwable);
            }
            catch (Throwable throwable2) {
                jns.aj(throwable2);
            }
            this.j();
        }
    }

    public final void j() {
        ((heg)a.f().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "shutdown", 347, "StreamListeningSessionResponseSender.kt")).r("#audio# the communication channel shut down");
        Runnable runnable = gqk.i(new dqv(this, 15));
        this.e.execute(runnable);
    }

    public final void k() {
        if (this.n.c()) {
            ((heg)a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "start", 86, "StreamListeningSessionResponseSender.kt")).r("#audio# Skipping sending due to already started");
            return;
        }
        ((heg)a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "start", 89, "StreamListeningSessionResponseSender.kt")).u("#audio# starting sending session(%s) info", ((gtt)this.c).a);
        jse.ah(this.m, null, null, new evh(this, null), 3);
    }
}

