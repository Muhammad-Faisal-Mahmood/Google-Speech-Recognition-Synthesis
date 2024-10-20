/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

final class kst
extends ksx {
    public final ksy a;
    public final long b;
    public final ByteBuffer c;
    private final kpq g = new kss(this);
    private long h;

    public kst(ksv ksv2, long l2, ksy ksy2) {
        Objects.requireNonNull(ksv2);
        if (l2 >= 0L) {
            this.b = l2;
            this.c = ByteBuffer.allocate((int)Math.min(l2, 16384L));
            this.a = ksy2;
            this.h = 0L;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    private final void f(int n2) {
        long l2 = this.h;
        long l3 = n2;
        long l4 = this.b;
        if (l2 + l3 <= l4) {
            return;
        }
        l2 = this.h;
        StringBuilder stringBuilder = new StringBuilder("expected ");
        stringBuilder.append(l4 - l2);
        stringBuilder.append(" bytes but received ");
        stringBuilder.append(n2);
        throw new ProtocolException(stringBuilder.toString());
    }

    private final void g() {
        if (!this.c.hasRemaining()) {
            this.h();
        }
    }

    private final void h() {
        this.e();
        ByteBuffer byteBuffer = (ByteBuffer)this.c.flip();
        this.a.a();
        this.d();
    }

    private final void i() {
        if (this.h == this.b) {
            this.h();
        }
    }

    @Override
    public final kpq a() {
        return this.g;
    }

    @Override
    public final void b() {
        if (this.h >= this.b) {
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length.");
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void write(int n2) {
        this.e();
        this.f(1);
        this.g();
        this.c.put((byte)n2);
        ++this.h;
        this.i();
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        this.e();
        if (byArray.length - n2 >= n3 && n2 >= 0 && n3 >= 0) {
            int n4;
            this.f(n3);
            for (int i2 = n3; i2 > 0; i2 -= n4) {
                this.g();
                n4 = Math.min(i2, this.c.remaining());
                this.c.put(byArray, n2 + n3 - i2, n4);
            }
            this.h += (long)n3;
            this.i();
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

