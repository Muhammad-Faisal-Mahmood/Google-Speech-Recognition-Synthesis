/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class dvp
implements cah {
    public final cya a;

    public dvp(cya cya2) {
        this.a = cya2;
    }

    @Override
    public final void a(cai cai2) {
        if (cai2.a.c()) {
            return;
        }
        cya.c(cai2, new drq(this, cai2, 4), new bte(this, cai2, 13, null));
        drq drq2 = new drq(this, cai2, 5);
        cya cya2 = this.a;
        Objects.requireNonNull(cya2);
        cya.c(cai2, drq2, new cym(cya2, 15));
    }
}

