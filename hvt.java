/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class hvt
extends hvs {
    private static final long serialVersionUID = 1L;
    protected final byte[] a;

    public hvt(byte[] byArray) {
        byArray.getClass();
        this.a = byArray;
    }

    @Override
    public byte a(int n2) {
        return this.a[n2];
    }

    @Override
    public byte b(int n2) {
        return this.a[n2];
    }

    protected int c() {
        return 0;
    }

    @Override
    public int d() {
        return this.a.length;
    }

    @Override
    protected void e(byte[] byArray, int n2, int n3, int n4) {
        System.arraycopy(this.a, n2, byArray, n3, n4);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hvu)) {
            return false;
        }
        if (this.d() != ((hvu)object).d()) {
            return false;
        }
        if (this.d() == 0) {
            return true;
        }
        if (object instanceof hvt) {
            object = (hvt)object;
            int n2 = this.c;
            int n3 = ((hvu)object).c;
            if (n2 != 0 && n3 != 0 && n2 != n3) {
                return false;
            }
            return this.g((hvu)object, 0, this.d());
        }
        return object.equals(this);
    }

    @Override
    public final boolean g(hvu object, int n2, int n3) {
        if (n3 <= ((hvu)object).d()) {
            int n4 = n2 + n3;
            if (n4 <= ((hvu)object).d()) {
                if (object instanceof hvt) {
                    hvt hvt2 = (hvt)object;
                    byte[] byArray = this.a;
                    object = hvt2.a;
                    int n5 = this.c();
                    n4 = this.c();
                    n2 = hvt2.c() + n2;
                    while (n4 < n5 + n3) {
                        if (byArray[n4] != object[n2]) {
                            return false;
                        }
                        ++n4;
                        ++n2;
                    }
                    return true;
                }
                return ((hvu)object).j(n2, n4).equals(this.j(0, n3));
            }
            n4 = ((hvu)object).d();
            object = new StringBuilder("Ran off end of other: ");
            ((StringBuilder)object).append(n2);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n4);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        n2 = this.d();
        object = new StringBuilder("Length too large: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(n2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    @Override
    protected final int i(int n2, int n3, int n4) {
        int n5 = this.c();
        return hxl.b(n2, this.a, n5 + n3, n4);
    }

    @Override
    public final hvu j(int n2, int n3) {
        if ((n3 = hvt.n(n2, n3, this.d())) == 0) {
            return hvu.b;
        }
        return new hvq(this.a, this.c() + n2, n3);
    }

    @Override
    public final hvy k() {
        return hvy.P(this.a, this.c(), this.d());
    }

    @Override
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.a, this.c(), this.d()).asReadOnlyBuffer();
    }

    @Override
    public final void m(hvn hvn2) {
        hvn2.a(this.a, this.c(), this.d());
    }
}

