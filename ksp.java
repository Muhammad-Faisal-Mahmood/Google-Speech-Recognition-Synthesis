/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

final class ksp
extends ksx {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final ksv g;
    private final kpq h = new kso(this);
    private boolean i;

    public ksp(ksv ksv2) {
        this.g = Objects.requireNonNull(ksv2);
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    public ksp(ksv ksv2, long l2) {
        Objects.requireNonNull(ksv2, "Argument connection cannot be null.");
        if (l2 <= Integer.MAX_VALUE) {
            if (l2 >= 0L) {
                int n2;
                this.g = ksv2;
                this.a = n2 = (int)l2;
                this.b = ByteBuffer.allocate(n2);
                return;
            }
            throw new IllegalArgumentException("Content length < 0.");
        }
        throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
    }

    private final void f(int n2) {
        int n3;
        int n4;
        if (this.a != -1 && (n4 = this.b.position()) + n2 > (n3 = this.a)) {
            throw new ProtocolException(a.ah(n3, "exceeded content-length limit of ", " bytes"));
        }
        if (this.a != -1 || this.b.limit() - this.b.position() > n2) {
            return;
        }
        n3 = this.b.capacity();
        ByteBuffer byteBuffer = ByteBuffer.allocate(Math.max(n3 + n3, this.b.capacity() + n2));
        ByteBuffer byteBuffer2 = (ByteBuffer)this.b.flip();
        byteBuffer.put(this.b);
        this.b = byteBuffer;
    }

    @Override
    public final kpq a() {
        return this.h;
    }

    @Override
    public final void b() {
    }

    @Override
    public final boolean c() {
        if (!this.e) {
            this.i = true;
            return false;
        }
        this.c = true;
        if (this.b.position() >= this.a) {
            ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
            return true;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    @Override
    public final void close() {
        super.close();
        if (this.i) {
            this.g.connect();
            this.i = false;
        }
    }

    @Override
    public final void write(int n2) {
        this.e();
        this.f(1);
        this.b.put((byte)n2);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        this.e();
        this.f(n3);
        this.b.put(byArray, n2, n3);
    }
}

