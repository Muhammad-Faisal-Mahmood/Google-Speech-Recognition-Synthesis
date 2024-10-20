/*
 * Decompiled with CFR 0.152.
 */
public final class hta
extends fvc {
    public boolean a;
    public final hte b;
    public final fvc c;

    public hta(hte hte2, fvc fvc2) {
        this.b = hte2;
        super((short[])null);
        this.a = false;
        this.c = fvc2;
    }

    @Override
    public final void W(iwx object) {
        object = new hsk(this, object, 10);
        this.b.a.execute((Runnable)object);
    }

    @Override
    public final void X(Object object) {
        object = new hsk(this, object, 11);
        this.b.a.execute((Runnable)object);
    }

    @Override
    public final void Y() {
        gjf gjf2 = new gjf(this, 20);
        this.b.a.execute(gjf2);
    }

    @Override
    public final void a(iyh object, iwx iwx2) {
        object = new hst(this, (iyh)object, iwx2, 6);
        this.b.a.execute((Runnable)object);
    }
}

