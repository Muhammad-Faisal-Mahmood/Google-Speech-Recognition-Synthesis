/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public abstract class hvy {
    public static final int e = 0;
    private static volatile int f = 100;
    int a;
    final int b = f;
    public int c = Integer.MAX_VALUE;
    hvz d;

    public static int H(int n2) {
        return n2 >>> 1 ^ -(n2 & 1);
    }

    public static int I(int n2, InputStream inputStream) {
        int n3;
        int n4;
        block5: {
            if ((n2 & 0x80) == 0) {
                return n2;
            }
            n4 = n2 & 0x7F;
            n2 = 7;
            while (true) {
                if (n2 >= 32) break block5;
                n3 = inputStream.read();
                if (n3 == -1) break;
                n4 |= (n3 & 0x7F) << n2;
                if ((n3 & 0x80) == 0) {
                    return n4;
                }
                n2 += 7;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        for (n3 = n2; n3 < 64; n3 += 7) {
            n2 = inputStream.read();
            if (n2 != -1) {
                if ((n2 & 0x80) != 0) continue;
                return n4;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long l2) {
        return l2 >>> 1 ^ -(1L & l2);
    }

    public static hvy K(InputStream inputStream) {
        return hvy.M(inputStream, 4096);
    }

    public static hvy L(byte[] byArray) {
        int n2 = byArray.length;
        return hvy.O(byArray, 0);
    }

    public static hvy M(InputStream inputStream, int n2) {
        if (n2 > 0) {
            if (inputStream == null) {
                return hvy.L(hxl.b);
            }
            return new hvx(inputStream, n2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static hvy O(byte[] byArray, int n2) {
        return hvy.P(byArray, 0, n2);
    }

    static hvy P(byte[] object, int n2, int n3) {
        object = new hvv((byte[])object, n2, n3);
        try {
            ((hvv)object).e(n3);
            return object;
        }
        catch (hxn hxn2) {
            throw new IllegalArgumentException(hxn2);
        }
    }

    public abstract void A(int var1);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int var1);

    public abstract byte[] F();

    public final void N() {
        block2: {
            int n2;
            while ((n2 = this.m()) != 0) {
                int n3 = this.a;
                if (n3 < this.b) {
                    this.a = n3 + 1;
                    boolean bl2 = this.E(n2);
                    --this.a;
                    if (bl2) continue;
                }
                break block2;
            }
            return;
        }
        throw new hxn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int var1);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract hvu w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int var1);
}

