/*
 * Decompiled with CFR 0.152.
 */
public final class hse {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public String g;
    public int h;
    public byte i;

    public final void a(int n2) {
        this.f = n2;
        this.i = (byte)(this.i | 0x20);
    }

    public final void b(boolean bl2) {
        this.c = bl2;
        this.i = (byte)(this.i | 2);
    }

    public final void c(boolean bl2) {
        this.d = bl2;
        this.i = (byte)(this.i | 4);
    }

    public final void d(boolean bl2) {
        this.e = bl2;
        this.i = (byte)(this.i | 0x10);
    }

    public final void e(boolean bl2) {
        this.b = bl2;
        this.i = (byte)(this.i | 1);
    }

    public final void f(int n2) {
        this.h = n2;
        this.i = (byte)(this.i | 0xFFFFFF80);
    }
}

