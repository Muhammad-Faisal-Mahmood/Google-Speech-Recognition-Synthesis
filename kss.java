/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpRetryException;
import java.nio.ByteBuffer;

final class kss
extends kpq {
    final kst a;

    public kss(kst kst2) {
        this.a = kst2;
    }

    @Override
    public final long a() {
        return this.a.b;
    }

    @Override
    public final void b(kpr kpr2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.c.remaining()) {
            byteBuffer.put(this.a.c);
            byteBuffer = (ByteBuffer)this.a.c.clear();
            kpr2.a(false);
            this.a.a.c();
            return;
        }
        ByteBuffer byteBuffer2 = this.a.c;
        int n2 = byteBuffer2.limit();
        byteBuffer2 = (ByteBuffer)byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.c);
        byteBuffer = (ByteBuffer)this.a.c.limit(n2);
        kpr2.a(false);
    }

    @Override
    public final void c(kpr kpr2) {
        kpr2.b(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}

