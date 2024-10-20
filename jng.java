/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledExecutorService;

public abstract class jng
extends ivz {
    @Override
    public final iwe b(ivw ivw2) {
        return this.g().b(ivw2);
    }

    @Override
    public final iym c() {
        return this.g().c();
    }

    @Override
    public final ScheduledExecutorService d() {
        return this.g().d();
    }

    @Override
    public final void e() {
        this.g().e();
    }

    @Override
    public void f(iui iui2, iwf iwf2) {
        throw null;
    }

    protected abstract ivz g();

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.g());
        return gtn2.toString();
    }
}

