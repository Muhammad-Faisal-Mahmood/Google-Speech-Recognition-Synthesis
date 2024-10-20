/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class kso
extends kpq {
    final ksp a;

    public kso(ksp ksp2) {
        this.a = ksp2;
    }

    @Override
    public final long a() {
        Object object = this.a;
        int n2 = ((ksp)object).a;
        if (n2 == -1) {
            boolean bl2 = ((ksp)object).c;
            object = ((ksp)object).b;
            n2 = bl2 ? ((Buffer)object).limit() : ((Buffer)object).position();
            return n2;
        }
        return n2;
    }

    @Override
    public final void b(kpr kpr2, ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        if (n2 < this.a.b.remaining()) {
            byteBuffer.put(this.a.b.array(), this.a.b.position(), n2);
            byteBuffer = this.a.b;
            byteBuffer = (ByteBuffer)byteBuffer.position(byteBuffer.position() + n2);
        } else {
            byteBuffer.put(this.a.b);
        }
        kpr2.a(false);
    }

    @Override
    public final void c(kpr kpr2) {
        ByteBuffer byteBuffer = (ByteBuffer)this.a.b.position(0);
        kpr2.c();
    }
}

