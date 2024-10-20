/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class jbd
implements jjw {
    public final ByteBuffer a;

    public jbd(ByteBuffer byteBuffer) {
        a.s(byteBuffer, "buffer");
        this.a = byteBuffer;
    }

    @Override
    public final int a() {
        return this.a.position();
    }

    @Override
    public final int b() {
        return this.a.remaining();
    }

    @Override
    public final void c(byte by2) {
        this.a.put(by2);
    }

    @Override
    public final void d(byte[] byArray, int n2, int n3) {
        this.a.put(byArray, n2, n3);
    }
}

