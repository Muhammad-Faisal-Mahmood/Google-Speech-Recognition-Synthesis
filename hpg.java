/*
 * Decompiled with CFR 0.152.
 */
public final class hpg
extends hnf
implements Runnable {
    private hpn a;

    public hpg(hpn hpn2) {
        this.a = hpn2;
    }

    @Override
    protected final String a() {
        hpn hpn2 = this.a;
        if (hpn2 != null) {
            return a.ar(hpn2, "delegate=[", "]");
        }
        return null;
    }

    @Override
    protected final void b() {
        this.a = null;
    }

    @Override
    public final void run() {
        hpn hpn2 = this.a;
        if (hpn2 != null) {
            this.o(hpn2);
        }
    }
}

