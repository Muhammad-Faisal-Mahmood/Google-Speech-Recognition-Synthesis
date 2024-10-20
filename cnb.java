/*
 * Decompiled with CFR 0.152.
 */
public final class cnb {
    public iez a;
    public gto b;
    private gto c;
    private gto d;

    public cnb() {
        throw null;
    }

    public cnb(byte[] object) {
        object = gsl.a;
        this.b = object;
        this.c = object;
        this.d = object;
    }

    public final cnc a() {
        Object object = this.a;
        if (object != null) {
            object = new cnc((iez)object, this.b, this.c, this.d);
            fxf.K(((cnc)object).a);
            return object;
        }
        throw new IllegalStateException("Missing required properties: sodaCoreConfig");
    }

    public final void b(giu giu2) {
        this.c = gto.i(giu2);
    }
}

