/*
 * Decompiled with CFR 0.152.
 */
public final class dfe {
    public ded a;
    private String b;
    private int c;
    private gzx d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private long l;
    private byte m;

    public final dff a() {
        if (this.m == -1 && this.b != null && this.d != null && this.k != null) {
            deu deu2 = new deu(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            dec.o("startTimestampMillis", deu2.e);
            dec.o("ttlMillis", deu2.l);
            return deu2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b == null) {
            stringBuilder.append(" id");
        }
        if ((this.m & 1) == 0) {
            stringBuilder.append(" priority");
        }
        if (this.d == null) {
            stringBuilder.append(" urls");
        }
        if ((this.m & 2) == 0) {
            stringBuilder.append(" startTimestampMillis");
        }
        if ((this.m & 4) == 0) {
            stringBuilder.append(" requiresUnmeteredNetwork");
        }
        if ((this.m & 8) == 0) {
            stringBuilder.append(" requiresCharging");
        }
        if ((this.m & 0x10) == 0) {
            stringBuilder.append(" requiresIdle");
        }
        if ((this.m & 0x20) == 0) {
            stringBuilder.append(" requiresBatteryNotLow");
        }
        if ((this.m & 0x40) == 0) {
            stringBuilder.append(" schedulingFlags");
        }
        if (this.k == null) {
            stringBuilder.append(" filePath");
        }
        if ((this.m & 0x80) == 0) {
            stringBuilder.append(" ttlMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(String string) {
        if (string != null) {
            this.k = string;
            return;
        }
        throw new NullPointerException("Null filePath");
    }

    public final void c(String string) {
        if (string != null) {
            this.b = string;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void d(int n2) {
        this.c = n2;
        this.m = (byte)(this.m | 1);
    }

    public final void e(boolean bl2) {
        this.i = bl2;
        this.m = (byte)(this.m | 0x20);
    }

    public final void f(boolean bl2) {
        this.g = bl2;
        this.m = (byte)(this.m | 8);
    }

    public final void g(boolean bl2) {
        this.h = bl2;
        this.m = (byte)(this.m | 0x10);
    }

    public final void h(boolean bl2) {
        this.f = bl2;
        this.m = (byte)(this.m | 4);
    }

    public final void i(int n2) {
        this.j = n2;
        this.m = (byte)(this.m | 0x40);
    }

    public final void j(long l2) {
        this.e = l2;
        this.m = (byte)(this.m | 2);
    }

    public final void k(long l2) {
        this.l = l2;
        this.m = (byte)(this.m | 0xFFFFFF80);
    }

    public final void l(gzx gzx2) {
        if (gzx2 != null) {
            this.d = gzx2;
            return;
        }
        throw new NullPointerException("Null urls");
    }
}

