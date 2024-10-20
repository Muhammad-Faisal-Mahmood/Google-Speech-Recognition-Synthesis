/*
 * Decompiled with CFR 0.152.
 */
public final class die
implements dau {
    public final ddn a;
    public final String b;
    public final ded c;
    public final long d;
    public final dds e;
    private final int f;

    public /* synthetic */ die(ddn ddn2, String string, ded ded2, long l2, dds dds2, int n2) {
        this.f = n2;
        this.a = ddn2;
        this.b = string;
        this.c = ded2;
        this.d = l2;
        this.e = dds2;
    }

    @Override
    public final void a(Object object) {
        if (this.f != 0) {
            object = (dgw)object;
            dds dds2 = this.e;
            long l2 = this.d;
            ded ded2 = this.c;
            String string = this.b;
            object.d(this.a, string, ded2, l2, dds2);
            return;
        }
        object = (dgw)object;
        dds dds3 = this.e;
        long l3 = this.d;
        ded ded3 = this.c;
        String string = this.b;
        object.d(this.a, string, ded3, l3, dds3);
    }
}

