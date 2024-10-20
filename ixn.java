/*
 * Decompiled with CFR 0.152.
 */
public class ixn
extends fvc {
    public final fvc g;

    protected ixn(fvc fvc2) {
        super((short[])null);
        this.g = fvc2;
    }

    @Override
    public void W(iwx iwx2) {
        this.g.W(iwx2);
    }

    @Override
    public void X(Object object) {
        this.g.X(object);
    }

    @Override
    public final void Y() {
        this.g.Y();
    }

    @Override
    public void a(iyh iyh2, iwx iwx2) {
        this.g.a(iyh2, iwx2);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.g);
        return gtn2.toString();
    }
}

