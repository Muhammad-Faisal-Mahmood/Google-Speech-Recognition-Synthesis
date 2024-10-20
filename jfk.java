/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledExecutorService;

public final class jfk
extends ivz {
    jbp a;
    public final jfs b;

    public jfk(jfs jfs2) {
        this.b = jfs2;
    }

    @Override
    public final ity a() {
        return this.b.G;
    }

    @Override
    public final iym c() {
        return this.b.m;
    }

    @Override
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override
    public final void e() {
        this.b.m.c();
        jel jel2 = new jel(this, 10);
        this.b.m.execute(jel2);
    }

    @Override
    public final void f(iui object, iwf iwf2) {
        this.b.m.c();
        a.s(object, "newState");
        object = new hst(this, (Object)iwf2, object, 11);
        this.b.m.execute((Runnable)object);
    }
}

