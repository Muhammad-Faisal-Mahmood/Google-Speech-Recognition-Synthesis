/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class iuz
extends iuy {
    private final jfy a;
    private final izb b;

    protected iuz() {
        throw null;
    }

    public iuz(iyp iyp2, Context context, fvc fvc2) {
        izb izb2 = new izb();
        izb2.a = context;
        izb2.h = fvc2;
        this.b = izb2;
        this.a = new jfy(iyp2, iyp2.c(), izb2);
        this.k(60L, TimeUnit.SECONDS);
    }

    @Override
    public final iwk i() {
        jgp jgp2 = this.a.h;
        a.s(jgp2, "offloadExecutorPool");
        this.b.b = jgp2;
        return super.i();
    }

    @Override
    public final kmp j() {
        return this.a;
    }

    public final void k(long l2, TimeUnit timeUnit) {
        fxf.B(true, "Idle timeouts are not supported when strict lifecycle management is enabled");
        this.a.l(l2, timeUnit);
    }
}

