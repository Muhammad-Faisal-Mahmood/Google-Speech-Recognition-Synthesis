/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

public final class fby
implements csv {
    public static final hei a = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback");
    public final ezj b;
    public final long c;
    public final String d;
    public final Optional e;
    public final hpr f;
    public final Optional g;
    public int h;
    public boolean i = false;
    public hpp j;
    public boolean k = false;
    public final cxt l = new cxt(null, null);

    public fby(String string, Optional optional, Optional optional2, ezj ezj2, hpr hpr2, feh feh2) {
        long l2;
        this.e = optional;
        this.b = ezj2;
        this.c = l2 = TimeUnit.SECONDS.toMillis(feh2.f.b);
        this.f = hpr2;
        this.g = optional2;
        this.d = string;
        this.j = hpr2.b(gqk.i(new fbx(this, optional, hpr2, 0)), l2, TimeUnit.MILLISECONDS);
    }

    @Override
    public final void a(csg object) {
        object = new cqg(this, 19);
        hpr hpr2 = this.f;
        this.l.F((hnx)object, hpr2);
    }

    @Override
    public final void b(Throwable object) {
        object = new etu(this, object, 5, null);
        hpr hpr2 = this.f;
        this.l.F((hnx)object, hpr2);
    }

    @Override
    public final void c(long l2) {
        fzm fzm2 = new fzm(this, l2, 1);
        hpr hpr2 = this.f;
        this.l.F(fzm2, hpr2);
    }

    @Override
    public final void d() {
        cqg cqg2 = new cqg(this, 18);
        hpr hpr2 = this.f;
        this.l.F(cqg2, hpr2);
        ((heg)((heg)a.f().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "pausedForConnectivity", 169, "ModelDownloadCallback.java")).r("onPause: scheduled download in the background.");
    }

    public final void e(String string, int n2) {
        this.j.cancel(false);
        fbv fbv2 = new fbv(this, n2);
        this.g.ifPresent(fbv2);
        ((heg)((heg)a.f().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "endEventHelper", 222, "ModelDownloadCallback.java")).u("%s", string);
    }
}

