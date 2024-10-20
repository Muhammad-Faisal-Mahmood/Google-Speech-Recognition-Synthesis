/*
 * Decompiled with CFR 0.152.
 */
public final class kox
implements Runnable {
    final long a;
    final int b;
    final Object c;
    private final int d;

    public /* synthetic */ kox(giu giu2, int n2, long l2, int n3) {
        this.d = n3;
        this.c = giu2;
        this.b = n2;
        this.a = l2;
    }

    public kox(koy koy2, long l2, int n2, int n3) {
        this.d = n3;
        this.c = koy2;
        this.a = l2;
        this.b = n2;
    }

    @Override
    public final void run() {
        if (this.d != 0) {
            akl akl2 = (akl)((giu)this.c).c;
            Object object = akl2.b;
            object = ((akk)object).b.isEmpty() ? null : (anc)fvd.P(((akk)object).b);
            long l2 = this.a;
            int n2 = this.b;
            object = akl2.r((anc)object);
            akl2.u((akc)object, 1006, new ake((akc)object, n2, l2));
            return;
        }
        int n3 = this.b;
        long l3 = this.a;
        ((koy)((Object)this.c)).b.l.z(l3, n3);
    }
}

