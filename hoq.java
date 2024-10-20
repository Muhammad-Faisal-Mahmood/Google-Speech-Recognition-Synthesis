/*
 * Decompiled with CFR 0.152.
 */
public final class hoq
implements Runnable {
    public final hqh a;
    public final hqa b;
    public final hpn c;
    public final hpn d;
    public final hot e;

    public /* synthetic */ hoq(hqh hqh2, hqa hqa2, hpn hpn2, hpn hpn3, hot hot2) {
        this.a = hqh2;
        this.b = hqa2;
        this.c = hpn2;
        this.d = hpn3;
        this.e = hot2;
    }

    @Override
    public final void run() {
        hpn hpn2 = this.a;
        if (((hnk)hpn2).isDone()) {
            hpn2 = this.c;
            this.b.o(hpn2);
            return;
        }
        if (this.d.isCancelled() && this.e.compareAndSet(hos.a, hos.b)) {
            ((hnk)hpn2).cancel(false);
        }
    }
}

