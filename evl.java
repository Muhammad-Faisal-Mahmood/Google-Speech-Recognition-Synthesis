/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class evl {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender");
    public final int b;
    public final Runnable c;
    public final jnf d;
    public final jtz e;
    private final hpn f;
    private final jvb g;
    private final Executor h;
    private final jtz i;

    public evl(int n2, hpn object, Runnable runnable, jnf jnf2, jvb jvb2, Executor executor) {
        this.b = n2;
        this.f = object;
        this.c = runnable;
        this.d = jnf2;
        this.g = jvb2;
        this.h = executor;
        this.e = new jtz(false, jud.a);
        this.i = new jtz(false, jud.a);
        object = new dqv(this, 17);
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
                    if (!(var1_1 instanceof evk)) ** GOTO lbl-1000
                    var3_4 = (evk)var1_1;
                    var2_5 = var3_4.c;
                    if ((var2_5 & -2147483648) != 0) {
                        var3_4.c = var2_5 + -2147483648;
                        var1_1 = var3_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 = new evk(this, (jqb)var1_1);
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
                    ((heg)evl.a.c().h(hfo.a, "ALT.GrpcRouteRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "sendDisconnectStatus", 71, "StreamRouteSessionResponseSender.kt")).s("#audio# sending route(%d) disconnect status once done", this.b);
                    try {
                        var4_6 = this.f;
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
                        var4_6 = (eav)var4_6;
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
            ((heg)((heg)evl.a.h().h(hfo.a, "ALT.GrpcRouteRespSender")).i((Throwable)var4_6).j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "sendDisconnectStatus", 78, "StreamRouteSessionResponseSender.kt")).s("#audio# unexpected fail while getting route(%d) disconnect status, sending failure", var3_4.b);
            var1_1 = dpg.e(eav.a.l());
            var1_1.k(ebg.G);
            var1_1 = var1_1.j();
        }
        var4_6 = (eav)var1_1;
        var1_1 = crh.W(euo.a.l());
        jse.e(var4_6, "value");
        var5_7 /* !! */  = (hwp)var1_1.a;
        if (!var5_7 /* !! */ .b.B()) {
            var5_7 /* !! */ .u();
        }
        var5_7 /* !! */  = (euo)var5_7 /* !! */ .b;
        var4_6.getClass();
        var5_7 /* !! */ .c = var4_6;
        var5_7 /* !! */ .b = 3;
        var3_4.b(var1_1.y());
        return jon.a;
    }

    public final Object b(euo object) {
        Object object2;
        if (!this.e.b()) {
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
                ((heg)((heg)a.h().h(hfo.a, "ALT.GrpcRouteRespSender")).i(throwable).j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "sendNext-IoAF18A", 114, "StreamRouteSessionResponseSender.kt")).s("#audio# cannot send route(%d) data to the remote client, shutting down", this.b);
                if (!this.e.c()) {
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
        ((heg)a.f().h(hfo.a, "ALT.GrpcRouteRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "shutdown", 88, "StreamRouteSessionResponseSender.kt")).s("#audio# the route's(%d) communication channel shut down", this.b);
        Runnable runnable = gqk.i(new dqv(this, 16));
        this.h.execute(runnable);
    }

    public final void d() {
        if (this.i.c()) {
            ((heg)a.c().h(hfo.a, "ALT.GrpcRouteRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "start", 50, "StreamRouteSessionResponseSender.kt")).r("#audio# skipping sending due to already started");
            return;
        }
        ((heg)a.c().h(hfo.a, "ALT.GrpcRouteRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamRouteSessionResponseSender", "start", 53, "StreamRouteSessionResponseSender.kt")).s("#audio# starting sending route(%d) info", this.b);
        jse.ah(this.g, null, null, new esz(this, null, 6), 3);
    }
}

