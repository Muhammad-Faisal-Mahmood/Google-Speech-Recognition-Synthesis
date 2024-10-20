/*
 * Decompiled with CFR 0.152.
 */
public final class cwr
implements gte {
    public final cwz a;
    public final boolean b;
    public final boolean c;
    public final hac d;

    public /* synthetic */ cwr(cwz cwz2, boolean bl2, boolean bl3, hac hac2) {
        this.a = cwz2;
        this.b = bl2;
        this.c = bl3;
        this.d = hac2;
    }

    @Override
    public final Object apply(Object object) {
        boolean bl2 = this.b;
        hac hac2 = (hac)object;
        object = hac2;
        if (bl2) {
            object = this.d;
            if (this.c) {
                object = this.a.c.c((hac)object, hac2);
            }
        }
        return object;
    }
}

