/*
 * Decompiled with CFR 0.152.
 */
public final class dft
implements dau {
    public final ddn a;
    public final int b;
    private final int c;

    public /* synthetic */ dft(ddn ddn2, int n2, int n3) {
        this.c = n3;
        this.a = ddn2;
        this.b = n2;
    }

    @Override
    public final void a(Object object) {
        if (this.c != 0) {
            object = (bzq)object;
            int n2 = this.b;
            ((bzq)object).m(this.a, n2);
            return;
        }
        object = (bzq)object;
        int n3 = this.b;
        ((bzq)object).m(this.a, n3);
    }
}

