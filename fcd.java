/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fcd
implements fbz {
    private final Optional a;

    public fcd(Optional optional) {
        this.a = optional;
    }

    @Override
    public final void a(int n2) {
        fcc fcc2 = new fcc(n2, 0);
        this.a.ifPresent(fcc2);
    }

    @Override
    public final void b() {
        fbw fbw2 = new fbw(6);
        this.a.ifPresent(fbw2);
    }

    @Override
    public final void c() {
        fbw fbw2 = new fbw(5);
        this.a.ifPresent(fbw2);
    }

    @Override
    public final void d(int n2) {
        fcc fcc2 = new fcc(n2, 1);
        this.a.ifPresent(fcc2);
    }
}

