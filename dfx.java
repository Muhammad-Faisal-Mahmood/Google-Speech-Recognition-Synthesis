/*
 * Decompiled with CFR 0.152.
 */
public final class dfx {
    public dcv a;
    private ddn b;
    private long c;
    private int d;
    private int e;
    private byte f;

    public final dfy a() {
        Object object;
        ddn ddn2;
        if (this.f == 7 && (ddn2 = this.b) != null && (object = this.a) != null) {
            return new dfq(ddn2, this.c, this.d, this.e, (dcv)object);
        }
        object = new StringBuilder();
        if (this.b == null) {
            ((StringBuilder)object).append(" name");
        }
        if ((this.f & 1) == 0) {
            ((StringBuilder)object).append(" reservedSize");
        }
        if ((this.f & 2) == 0) {
            ((StringBuilder)object).append(" gcPriority");
        }
        if ((this.f & 4) == 0) {
            ((StringBuilder)object).append(" reservationState");
        }
        if (this.a == null) {
            ((StringBuilder)object).append(" baseGcPriority");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(int n2) {
        this.d = n2;
        this.f = (byte)(this.f | 2);
    }

    public final void c(ddn ddn2) {
        if (ddn2 != null) {
            this.b = ddn2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void d(int n2) {
        this.e = n2;
        this.f = (byte)(this.f | 4);
    }

    public final void e(long l2) {
        this.c = l2;
        this.f = (byte)(this.f | 1);
    }
}

