/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class ksi
extends kpq {
    private final kpq a;

    public ksi(kpq kpq2) {
        this.a = kpq2;
    }

    @Override
    public final long a() {
        return this.a.a();
    }

    @Override
    public final void b(kpr kpr2, ByteBuffer byteBuffer) {
        this.a.b(kpr2, byteBuffer);
    }

    @Override
    public final void c(kpr kpr2) {
        this.a.c(kpr2);
    }

    @Override
    public final void close() {
    }
}

