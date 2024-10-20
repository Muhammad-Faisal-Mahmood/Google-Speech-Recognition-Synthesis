/*
 * Decompiled with CFR 0.152.
 */
public final class dbt {
    public byte[] a;
    private gzs b;
    private gzx c;
    private boolean d;
    private byte e;

    public final dbu a() {
        gzs gzs2 = this.b;
        if (gzs2 != null) {
            this.c = gzs2.g();
        } else if (this.c == null) {
            int n2 = gzx.d;
            this.c = hct.a;
        }
        if (this.e == 1) {
            return new dax(this.c, this.d, this.a);
        }
        throw new IllegalStateException("Missing required properties: isLastBatch");
    }

    public final void b(der der2) {
        if (this.b == null) {
            this.b = new gzs();
        }
        this.b.h(der2);
    }

    public final void c(boolean bl2) {
        this.d = bl2;
        this.e = 1;
    }
}

