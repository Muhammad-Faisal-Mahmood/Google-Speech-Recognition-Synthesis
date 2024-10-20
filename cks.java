/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class cks
implements cla,
ckx,
ckw {
    public final ckq a;
    public final cld b;
    private final Executor c;

    public cks(Executor executor, ckq ckq2, cld cld2) {
        this.c = executor;
        this.a = ckq2;
        this.b = cld2;
    }

    @Override
    public final void a(Object object) {
        this.b.l(object);
    }

    @Override
    public final void b(ckz object) {
        object = new ckr(this, object, 2);
        this.c.execute((Runnable)object);
    }

    @Override
    public final void c(Exception exception) {
        this.b.k(exception);
    }
}

