/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class jfm
extends itx {
    final jfp a;

    public jfm(jfp jfp2) {
        this.a = jfp2;
    }

    @Override
    public final itz a(ixb object, itw itw2) {
        jfs jfs2 = this.a.c;
        Executor executor = jfs2.e(itw2);
        ScheduledExecutorService scheduledExecutorService = jfs2.C ? null : this.a.c.i.c();
        object = new jci((ixb)object, executor, itw2, jfs2.R, scheduledExecutorService, this.a.c.E);
        ((jci)object).j = this.a.c.n;
        return object;
    }

    @Override
    public final String b() {
        return this.a.b;
    }
}

