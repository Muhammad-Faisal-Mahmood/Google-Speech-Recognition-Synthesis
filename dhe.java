/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class dhe
implements djg {
    final dwm a;

    public dhe(dwm dwm2) {
        this.a = dwm2;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol$LifecycleCallbackImpl", "downloadEnqueued", 316, "HttpDownloadProtocol.java")).r("A download has been enqueued.");
        if (((AtomicBoolean)this.a.d).compareAndSet(true, false)) {
            dwm dwm2 = this.a;
            dcd dcd2 = new dcd(3);
            ((cxv)dwm2.c).a(dcd2);
        }
    }

    @Override
    public final void e() {
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol$LifecycleCallbackImpl", "pausedForConnectivity", 305, "HttpDownloadProtocol.java")).r("All downloads are paused waiting for connectivity.");
        if (((AtomicBoolean)this.a.d).compareAndSet(false, true)) {
            dwm dwm2 = this.a;
            dcd dcd2 = new dcd(3);
            ((cxv)dwm2.c).a(dcd2);
        }
    }
}

