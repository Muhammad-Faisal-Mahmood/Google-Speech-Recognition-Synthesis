/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.HashMap;

public abstract class ams
extends amm {
    public final HashMap d = new HashMap();
    public Handler e;
    public ahl f;

    protected ams() {
    }

    @Override
    protected final void d() {
        for (bmu bmu2 : this.d.values()) {
            bmu2.a.c((and)bmu2.c);
        }
    }

    @Override
    protected final void f() {
        for (bmu bmu2 : this.d.values()) {
            bmu2.a.e((and)bmu2.c);
        }
    }

    @Override
    protected void h(ahl ahl2) {
        throw null;
    }

    @Override
    protected void k() {
        throw null;
    }

    @Override
    public void t() {
        throw null;
    }

    protected anc u(anc anc2) {
        throw null;
    }

    protected abstract void v(aew var1);
}

