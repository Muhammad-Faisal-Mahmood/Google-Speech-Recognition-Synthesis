/*
 * Decompiled with CFR 0.152.
 */
public final class deq {
    private den a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g;

    public final der a() {
        Object object;
        if (this.g == 31 && (object = this.a) != null) {
            return new deg((den)object, this.b, this.c, this.d, this.e, this.f);
        }
        object = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object).append(" packManifest");
        }
        if ((this.g & 1) == 0) {
            ((StringBuilder)object).append(" connectionConstraints");
        }
        if ((this.g & 2) == 0) {
            ((StringBuilder)object).append(" chargingConstraints");
        }
        if ((this.g & 4) == 0) {
            ((StringBuilder)object).append(" idleConstraints");
        }
        if ((this.g & 8) == 0) {
            ((StringBuilder)object).append(" batteryConstraints");
        }
        if ((this.g & 0x10) == 0) {
            ((StringBuilder)object).append(" schedulingFlags");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(int n2) {
        this.e = n2;
        this.g = (byte)(this.g | 8);
    }

    public final void c(int n2) {
        this.c = n2;
        this.g = (byte)(this.g | 2);
    }

    public final void d(int n2) {
        this.b = n2;
        this.g = (byte)(this.g | 1);
    }

    public final void e(int n2) {
        this.d = n2;
        this.g = (byte)(this.g | 4);
    }

    public final void f(den den2) {
        if (den2 != null) {
            this.a = den2;
            return;
        }
        throw new NullPointerException("Null packManifest");
    }

    public final void g(int n2) {
        this.f = n2;
        this.g = (byte)(this.g | 0x10);
    }
}

