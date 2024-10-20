/*
 * Decompiled with CFR 0.152.
 */
public final class cta {
    public boolean a;
    public gto b;
    public gto c;
    public gto d;
    public gto e;
    public boolean f;
    public boolean g;
    public byte h;

    public cta() {
        throw null;
    }

    public cta(byte[] object) {
        object = gsl.a;
        this.b = object;
        this.c = object;
        this.d = object;
        this.e = object;
    }

    public final void a(boolean bl2) {
        this.a = bl2;
        this.h = (byte)(this.h | 1);
    }

    public final void b(boolean bl2) {
        this.f = bl2;
        this.h = (byte)(this.h | 4);
    }
}

