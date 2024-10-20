/*
 * Decompiled with CFR 0.152.
 */
final class jmq
extends hnk {
    public final itz a;

    public jmq(itz itz2) {
        this.a = itz2;
    }

    @Override
    protected final String a() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("clientCall", this.a);
        return gtn2.toString();
    }

    @Override
    protected final void k() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}

