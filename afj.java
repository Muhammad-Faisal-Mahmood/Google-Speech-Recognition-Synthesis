/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public final class afj
implements afh {
    public float b = 1.0f;
    public float c = 1.0f;
    public aff d = aff.a;
    public aff e;
    public aff f;
    public aff g;
    public boolean h;
    public afi i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;

    public afj() {
        Object object = aff.a;
        this.e = object;
        this.f = object;
        this.g = object;
        this.j = object = a;
        this.k = ((ByteBuffer)object).asShortBuffer();
        this.l = a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        boolean bl2;
        int n2 = this.e.b;
        boolean bl3 = bl2 = false;
        if (n2 == -1) return bl3;
        if (Math.abs(this.b - 1.0f) >= 1.0E-4f) return true;
        if (Math.abs(this.c - 1.0f) >= 1.0E-4f) return true;
        if (this.e.b != this.d.b) return true;
        return bl2;
    }
}

