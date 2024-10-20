/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class hvq
extends hvt {
    private static final long serialVersionUID = 1L;
    private final int d;
    private final int e;

    public hvq(byte[] byArray, int n2, int n3) {
        super(byArray);
        hvq.n(n2, n2 + n3, byArray.length);
        this.d = n2;
        this.e = n3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override
    public final byte a(int n2) {
        hvq.w(n2, this.e);
        return this.a[this.d + n2];
    }

    @Override
    public final byte b(int n2) {
        int n3 = this.d;
        return this.a[n3 + n2];
    }

    @Override
    protected final int c() {
        return this.d;
    }

    @Override
    public final int d() {
        return this.e;
    }

    @Override
    protected final void e(byte[] byArray, int n2, int n3, int n4) {
        int n5 = this.d;
        System.arraycopy(this.a, n5 + n2, byArray, n3, n4);
    }

    Object writeReplace() {
        return new hvt(this.y());
    }
}

