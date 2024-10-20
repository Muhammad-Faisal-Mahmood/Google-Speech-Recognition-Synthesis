/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class feu {
    private Optional a;
    private Optional b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte g;

    public feu() {
        throw null;
    }

    public feu(byte[] byArray) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    public final fev a() {
        boolean bl2 = this.b() == 1 || this.b() == 2;
        fxf.B(bl2, "Invalid channelCount");
        if (this.g != 15) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((1 & this.g) == 0) {
                stringBuilder.append(" samplingRate");
            }
            if ((2 & this.g) == 0) {
                stringBuilder.append(" channelCount");
            }
            if ((this.g & 4) == 0) {
                stringBuilder.append(" encoding");
            }
            if ((this.g & 8) == 0) {
                stringBuilder.append(" isFromMic");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
        }
        return new fev(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final int b() {
        if ((this.g & 2) != 0) {
            return this.d;
        }
        throw new IllegalStateException("Property \"channelCount\" has not been set");
    }

    public final void c(int n2) {
        this.d = n2;
        this.g = (byte)(this.g | 2);
    }

    public final void d(int n2) {
        this.e = n2;
        this.g = (byte)(this.g | 4);
    }

    public final void e(Optional optional) {
        if (optional != null) {
            this.b = optional;
            return;
        }
        throw new NullPointerException("Null fileDescriptor");
    }

    public final void f(boolean bl2) {
        this.f = bl2;
        this.g = (byte)(this.g | 8);
    }

    public final void g(int n2) {
        this.c = n2;
        this.g = (byte)(this.g | 1);
    }

    public final void h(Optional optional) {
        if (optional != null) {
            this.a = optional;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}

