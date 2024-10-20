/*
 * Decompiled with CFR 0.152.
 */
final class jih
extends jdw {
    static final itr b = new itr("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final jif c;
    public final iym d;

    public jih(ixi ixi2, jif jif2, iym iym2) {
        super(ixi2);
        this.c = jif2;
        this.d = iym2;
    }

    @Override
    public final void c() {
        this.a.c();
        this.c.a();
    }

    @Override
    public final void d(ixf ixf2) {
        ixf2 = new jig(this, ixf2);
        this.a.d(ixf2);
    }
}

