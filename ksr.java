/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.nio.ByteBuffer;

final class ksr
extends ksx {
    public final ksy a;
    public final ByteBuffer b;
    public boolean c;
    private final kpq g = new ksq(this);

    public ksr(ksv ksv2, int n2, ksy ksy2) {
        Objects.requireNonNull(ksv2);
        if (n2 > 0) {
            this.b = ByteBuffer.allocate(n2);
            this.a = ksy2;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    private final void f() {
        if (!this.b.hasRemaining()) {
            this.e();
            ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
            this.a.a();
            this.d();
        }
    }

    @Override
    public final kpq a() {
        return this.g;
    }

    @Override
    public final void b() {
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void close() {
        super.close();
        if (!this.c) {
            this.c = true;
            ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
        }
    }

    @Override
    public final void write(int n2) {
        this.f();
        this.b.put((byte)n2);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        this.e();
        if (byArray.length - n2 >= n3 && n2 >= 0 && n3 >= 0) {
            int n4;
            for (int i2 = n3; i2 > 0; i2 -= n4) {
                n4 = Math.min(i2, this.b.remaining());
                this.b.put(byArray, n2 + n3 - i2, n4);
                this.f();
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

