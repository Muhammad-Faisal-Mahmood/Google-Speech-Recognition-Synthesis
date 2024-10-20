/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.nio.ByteBuffer;

public final class bvs
implements aeq,
akx {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/network/OggPlayer");
    public static final Uri b = new Uri.Builder().scheme("bytes").authority("audio").build();
    public final Runnable c;
    public final Object d = new Object();
    public boolean e;
    public boolean f;
    public int g = -5;
    public final aiq h;
    public final Handler i;
    public final bsj j;
    private final bws k;
    private boolean l;
    private aeo m;
    private long n;
    private long o;

    public bvs(Context object, bsj bsj2, bws bws2, Runnable runnable) {
        Handler handler;
        this.i = handler = new Handler(Looper.getMainLooper());
        this.j = bsj2;
        this.c = runnable;
        this.k = bws2;
        this.m = aeo.a;
        object = new aio((Context)object, new bvr(this, (Context)object, 0));
        ((aio)object).b(handler.getLooper());
        this.h = ((aio)object).a();
        handler.post((Runnable)new bpv(this, 16));
    }

    @Override
    public final void a(int n2) {
        if (n2 != 1 && n2 != 4) {
            return;
        }
        Handler handler = this.i;
        aiq aiq2 = this.h;
        Objects.requireNonNull(aiq2);
        handler.post((Runnable)new bpv(aiq2, 17));
    }

    @Override
    public final void b(aen aen2) {
        a.as(a.g(), "ogg decoder didn't return any bytes", "com/google/android/apps/speech/tts/googletts/network/OggPlayer", "onPlayerError", '\u0097', "OggPlayer.java", aen2);
        this.k.a("OggDecoderFailure");
        this.z(-5);
    }

    @Override
    public final /* synthetic */ void c(aen aen2) {
    }

    @Override
    public final /* synthetic */ void d() {
    }

    @Override
    public final /* synthetic */ void e() {
    }

    @Override
    public final /* synthetic */ void f() {
    }

    @Override
    public final /* synthetic */ void g() {
    }

    @Override
    public final /* synthetic */ void h() {
    }

    @Override
    public final /* synthetic */ void i() {
    }

    @Override
    public final /* synthetic */ void j() {
    }

    @Override
    public final /* synthetic */ void k() {
    }

    @Override
    public final /* synthetic */ void l() {
    }

    @Override
    public final /* synthetic */ void m(int n2) {
    }

    @Override
    public final /* synthetic */ void n() {
    }

    @Override
    public final /* synthetic */ void o() {
    }

    @Override
    public final /* synthetic */ void p() {
    }

    @Override
    public final int q(adu adu2) {
        if (adu2.D == 1 && adu2.F == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final aeo r() {
        return this.m;
    }

    @Override
    public final void s() {
        this.z(0);
    }

    @Override
    public final void t(aeo aeo2) {
        this.m = aeo2;
    }

    @Override
    public final boolean u() {
        return this.f;
    }

    @Override
    public final boolean v(adu adu2) {
        return this.q(adu2) != 0;
    }

    @Override
    public final void w(adu adu2) {
        if (this.e) {
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/network/OggPlayer", "configure", 186, "OggPlayer.java")).r("Multiple calls to configure! Ignoring.");
            return;
        }
        boolean bl2 = true;
        this.e = true;
        int n2 = adu2.E;
        this.n = n2;
        if ((n2 = this.j.start(n2, adu2.F, adu2.D)) != 0) {
            bl2 = false;
        }
        this.l = bl2;
        if (bl2) {
            this.c.run();
            return;
        }
        ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/network/OggPlayer", "configure", 198, "OggPlayer.java")).s("callback.start() failed: %d", n2);
        this.k.a("CallbackStartFailed");
        this.z(-1);
    }

    @Override
    public final long x() {
        return this.o;
    }

    @Override
    public final boolean y(ByteBuffer byteBuffer) {
        if (!this.l) {
            return false;
        }
        int n2 = byteBuffer.remaining();
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        if (this.j.audioAvailable(byArray, 0, n2) != 0) {
            ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/network/OggPlayer", "handleBuffer", 170, "OggPlayer.java")).r("callback.audioAvailable() failed");
            this.k.a("CallBackAudioAvailableFailed");
            this.z(-1);
            return false;
        }
        long l2 = this.o;
        long l3 = n2;
        long l4 = this.n;
        this.o = l2 + l3 * 1000000L / (l4 + l4);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(int n2) {
        this.f = true;
        this.g = n2;
        Object object = this.d;
        synchronized (object) {
            this.d.notifyAll();
            return;
        }
    }
}

