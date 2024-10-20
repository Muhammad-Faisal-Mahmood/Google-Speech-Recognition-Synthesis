/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;
import java.nio.ByteBuffer;

public final class jax {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public jax(Instant instant, boolean bl2, boolean bl3) {
        fxf.K(instant);
        this.c = instant;
        this.a = bl2;
        this.b = bl3;
    }

    public jax(ByteBuffer byteBuffer, boolean bl2, boolean bl3) {
        this.c = byteBuffer;
        this.a = bl2;
        this.b = bl3;
    }
}

