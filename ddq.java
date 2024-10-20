/*
 * Decompiled with CFR 0.152.
 */
public final class ddq {
    public String a;
    public String b;
    public gzs c;
    public gzx d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private ddm j;
    private byte k;

    public final ddr a() {
        Object object = this.c;
        if (object != null) {
            this.d = ((gzs)object).g();
        } else if (this.d == null) {
            int n2 = gzx.d;
            this.d = hct.a;
        }
        if (this.k == 31 && (object = this.j) != null) {
            return new dcq(this.a, this.b, this.e, this.f, this.g, this.h, this.i, this.d, (ddm)object);
        }
        object = new StringBuilder();
        if ((this.k & 1) == 0) {
            ((StringBuilder)object).append(" connectionConstraints");
        }
        if ((this.k & 2) == 0) {
            ((StringBuilder)object).append(" chargingConstraints");
        }
        if ((this.k & 4) == 0) {
            ((StringBuilder)object).append(" idleConstraints");
        }
        if ((this.k & 8) == 0) {
            ((StringBuilder)object).append(" batteryConstraints");
        }
        if ((this.k & 0x10) == 0) {
            ((StringBuilder)object).append(" schedulingFlags");
        }
        if (this.j == null) {
            ((StringBuilder)object).append(" extras");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(int n2) {
        this.h = n2;
        this.k = (byte)(this.k | 8);
    }

    public final void c(int n2) {
        this.f = n2;
        this.k = (byte)(this.k | 2);
    }

    public final void d(int n2) {
        this.e = n2;
        this.k = (byte)(this.k | 1);
    }

    public final void e(ddm ddm2) {
        if (ddm2 != null) {
            this.j = ddm2;
            return;
        }
        throw new NullPointerException("Null extras");
    }

    public final void f(int n2) {
        this.g = n2;
        this.k = (byte)(this.k | 4);
    }

    public final void g(int n2) {
        this.i = n2;
        this.k = (byte)(this.k | 0x10);
    }
}

