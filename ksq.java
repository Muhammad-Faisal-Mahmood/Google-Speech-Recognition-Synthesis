/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpRetryException;
import java.nio.ByteBuffer;

final class ksq
extends kpq {
    final ksr a;

    public ksq(ksr ksr2) {
        this.a = ksr2;
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final void b(kpr object, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.b.remaining()) {
            byteBuffer.put(this.a.b);
            byteBuffer = (ByteBuffer)this.a.b.clear();
            ((kpr)object).a(this.a.c);
            object = this.a;
            if (!((ksr)object).c) {
                ((ksr)object).a.c();
            }
            return;
        }
        ByteBuffer byteBuffer2 = this.a.b;
        int n2 = byteBuffer2.limit();
        byteBuffer2 = (ByteBuffer)byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.b);
        byteBuffer = (ByteBuffer)this.a.b.limit(n2);
        ((kpr)object).a(false);
    }

    @Override
    public final void c(kpr kpr2) {
        kpr2.b(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}

