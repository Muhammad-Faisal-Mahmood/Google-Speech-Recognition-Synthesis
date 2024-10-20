/*
 * Decompiled with CFR 0.152.
 */
public abstract class atw
extends aup {
    public atw(aum aum2) {
        super(aum2);
    }

    public final void b(Object object) {
        axc axc2 = this.d();
        try {
            this.c(axc2, object);
            axc2.a.executeInsert();
            return;
        }
        finally {
            this.f(axc2);
        }
    }

    protected abstract void c(axc var1, Object var2);
}

