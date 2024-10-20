/*
 * Decompiled with CFR 0.152.
 */
public final class dey {
    public ded a;
    public String b;
    private ddn c;
    private long d;
    private int e;
    private int f;
    private long g;
    private int h;
    private byte i;

    public final dez a() {
        Object object;
        if (this.i == 31 && (object = this.c) != null) {
            object = new det((ddn)object, this.a, this.d, this.e, this.f, this.g, this.b, this.h);
            long l2 = ((det)object).b;
            if (l2 >= 0L) {
                l2 = ((det)object).e;
                if (l2 >= 0L) {
                    return object;
                }
                throw new IllegalArgumentException(a.ap(l2, "Last access must be larger or equals than 0, value: "));
            }
            throw new IllegalArgumentException(a.ap(l2, "Reserved size must be larger or equals than 0, value: "));
        }
        object = new StringBuilder();
        if (this.c == null) {
            ((StringBuilder)object).append(" name");
        }
        if ((this.i & 1) == 0) {
            ((StringBuilder)object).append(" reservedSize");
        }
        if ((this.i & 2) == 0) {
            ((StringBuilder)object).append(" gcPriority");
        }
        if ((this.i & 4) == 0) {
            ((StringBuilder)object).append(" reservationState");
        }
        if ((this.i & 8) == 0) {
            ((StringBuilder)object).append(" lastAccessMillis");
        }
        if ((this.i & 0x10) == 0) {
            ((StringBuilder)object).append(" validationFailureCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(int n2) {
        this.e = n2;
        this.i = (byte)(this.i | 2);
    }

    public final void c(long l2) {
        this.g = l2;
        this.i = (byte)(this.i | 8);
    }

    public final void d(ddn ddn2) {
        if (ddn2 != null) {
            this.c = ddn2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void e(int n2) {
        this.f = n2;
        this.i = (byte)(this.i | 4);
    }

    public final void f(long l2) {
        this.d = l2;
        this.i = (byte)(this.i | 1);
    }

    public final void g(int n2) {
        this.h = n2;
        this.i = (byte)(this.i | 0x10);
    }
}

