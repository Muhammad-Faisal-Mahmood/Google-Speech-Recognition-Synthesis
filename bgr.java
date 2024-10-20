/*
 * Decompiled with CFR 0.152.
 */
public final class bgr
implements bgn {
    public final aum a;
    public final aup b;
    public final aup c;
    private final atw d;

    public bgr(aum aum2) {
        this.a = aum2;
        this.d = new bgo(aum2);
        this.b = new bgp(aum2);
        this.c = new bgq(aum2);
    }

    @Override
    public final void a(bgm bgm2) {
        this.a.j();
        this.a.k();
        try {
            this.d.b(bgm2);
            this.a.n();
            return;
        }
        finally {
            this.a.l();
        }
    }
}

