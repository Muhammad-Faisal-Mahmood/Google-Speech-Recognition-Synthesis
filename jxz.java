/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public class jxz
extends jue
implements jxy {
    public final jxy b;

    public jxz(jqf jqf2, jxy jxy2) {
        super(jqf2, true);
        this.b = jxy2;
    }

    @Override
    public final void H(Throwable throwable) {
        jxy jxy2 = this.b;
        throwable = jwp.Q(this, throwable);
        jxy2.r((CancellationException)throwable);
        this.L(throwable);
    }

    @Override
    public final Object c(jqb jqb2) {
        throw null;
    }

    @Override
    public final Object e(Object object, jqb jqb2) {
        throw null;
    }

    @Override
    public final Object f() {
        throw null;
    }

    @Override
    public final Object g(Object object) {
        return this.b.g(object);
    }

    @Override
    public final void l(jrk jrk2) {
        throw null;
    }

    @Override
    public final boolean n(Throwable throwable) {
        return this.b.n(throwable);
    }

    @Override
    public final boolean q() {
        throw null;
    }

    @Override
    public final void r(CancellationException cancellationException) {
        if (this.t()) {
            return;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new jwj(((jwp)this).a(), null, this);
        }
        ((jwp)this).H(cancellationException2);
    }

    @Override
    public final jxq u() {
        throw null;
    }
}

