/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class jkz
implements jjx {
    private final int a;

    public jkz(int n2) {
        this.a = n2;
    }

    @Override
    public final jjw a(int n2) {
        if (this.a != 0) {
            return new jbd(ByteBuffer.allocateDirect(Math.min(0x100000, n2)));
        }
        n2 = Math.min(0x100000, Math.max(4096, n2));
        return new jky(new klm(), n2);
    }
}

