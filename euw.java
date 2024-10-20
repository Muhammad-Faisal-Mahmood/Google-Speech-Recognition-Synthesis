/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class euw {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender");
    public final int b;
    public final Runnable c;
    public final jnf d;
    public final jvb e;
    public final jtz f;
    public final jtz g;
    private final hpn h;
    private final Executor i;

    public euw(int n2, hpn object, Runnable runnable, jnf jnf2, jvb jvb2, Executor executor) {
        this.b = n2;
        this.h = object;
        this.c = runnable;
        this.d = jnf2;
        this.e = jvb2;
        this.i = executor;
        this.f = new jtz(false, jud.a);
        this.g = new jtz(false, jud.a);
        object = new dqv(this, 13);
        ((jmy)jnf2).e((Runnable)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(jqb var1_1) {
        block13: {
            block11: {
                block12: {
                    if (!(var1_1 instanceof euv)) ** GOTO lbl-1000
                    var3_4 = (euv)var1_1;
                    var2_5 = var3_4.c;
                    if ((var2_5 & -2147483648) != 0) {
                        var3_4.c = var2_5 + -2147483648;
                        var1_1 = var3_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 = new euv(this, (jqb)var1_1);
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
                            break block11;
                        }
                    }
                    jns.ak(var4_6);
                    ((heg)euw.a.c().h(hfo.a, "ALT.GrpcClientRespSndr").j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "sendDeactivateStatus", 77, "StreamAudioClientResponseSender.kt")).s("#audio# sending audio client(%d) deactivate status once done", this.b);
                    try {
                        var4_6 = this.h;
                        var1_1.d = this;
                        var1_1.c = 1;
                        var4_6 = jsd.l((hpn)var4_6, (jqb)var1_1);
                        if (var4_6 == var3_4) break block12;
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var3_4 = this;
                        break block11;
                    }
                    var3_4 = var1_1;
                    {
                        var4_6 = (eaq)var4_6;
                        var3_4 = var1_1;
                        var1_1 = var4_6;
                        break block13;
                    }
                }
                return var3_4;
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        var4_6 = joe.a(var1_1);
        if (var4_6 != null) {
            ((heg)((heg)euw.a.h().h(hfo.a, "ALT.GrpcClientRespSndr")).i((Throwable)var4_6).j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "sendDeactivateStatus", 84, "StreamAudioClientResponseSender.kt")).s("#audio# unexpected fail while getting audio client(%d) deactivate status, sending failure", var3_4.b);
            var1_1 = dox.l(eaq.a.l());
            var1_1.C(eap.f);
            var1_1 = var1_1.B();
        }
        var1_1 = (eaq)var1_1;
        var4_6 = crh.Y(eum.a.l());
        jse.e(var1_1, "value");
        var5_7 /* !! */  = (hwp)var4_6.a;
        if (!var5_7 /* !! */ .b.B()) {
            var5_7 /* !! */ .u();
        }
        var5_7 /* !! */  = (eum)var5_7 /* !! */ .b;
        var1_1.getClass();
        var5_7 /* !! */ .c = var1_1;
        var5_7 /* !! */ .b = 3;
        var3_4.b(var4_6.O());
        return jon.a;
    }

    public final Object b(eum object) {
        Object object2;
        if (!this.f.b()) {
            try {
                this.d.c(object);
                object = jon.a;
            }
            catch (Throwable throwable) {
                object = jns.aj(throwable);
            }
            Throwable throwable = joe.a(object);
            object2 = object;
            if (throwable != null) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.GrpcClientRespSndr")).i(throwable).j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "sendNext-IoAF18A", 120, "StreamAudioClientResponseSender.kt")).s("#audio# cannot send audio client(%d) data to the remote client, shutting down", this.b);
                if (!this.f.c()) {
                    try {
                        this.d.b(throwable);
                    }
                    catch (Throwable throwable2) {
                        jns.aj(throwable2);
                    }
                    this.c();
                }
                return object;
            }
        } else {
            object2 = jns.aj(new Throwable());
        }
        return object2;
    }

    public final void c() {
        ((heg)a.f().h(hfo.a, "ALT.GrpcClientRespSndr").j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "shutdown", 94, "StreamAudioClientResponseSender.kt")).s("#audio# the client's(%d) communication channel shut down", this.b);
        Runnable runnable = gqk.i(new dqv(this, 12));
        this.i.execute(runnable);
    }
}

