/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
import j$.util.Objects;

public final class htm
extends fvc {
    public final fvc a;
    private final gqn b;

    public htm(fvc fvc2) {
        super((short[])null);
        this.a = fvc2;
        this.b = gqn.b();
    }

    private final void aI(Runnable runnable) {
        if (!fxf.aw(gqv.a)) {
            gqn.d(this.b, runnable).run();
            return;
        }
        runnable.run();
    }

    @Override
    public final void W(iwx iwx2) {
        this.aI(new hsk(this, iwx2, 12));
    }

    @Override
    public final void X(Object object) {
        this.aI(new hsk(this, object, 13));
    }

    @Override
    public final void Y() {
        fvc fvc2 = this.a;
        Objects.requireNonNull(fvc2);
        this.aI(new iuk(fvc2, 1, null));
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        this.aI(new hst(this, iyh2, iwx2, 7));
    }
}

