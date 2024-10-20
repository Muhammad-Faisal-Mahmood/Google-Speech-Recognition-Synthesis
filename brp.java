/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class brp
implements brn {
    @Override
    public final void a() {
        throw null;
    }

    @Override
    public final void b(iim iim2) {
        throw new IllegalStateException("No decoder callback is set, cannot call stop callback");
    }

    @Override
    public final boolean c(ByteBuffer byteBuffer) {
        throw new IllegalStateException("No decoder callback is set, cannot call audioAvailable callback");
    }

    @Override
    public final void d() {
        throw new IllegalStateException("No decoder callback is set, cannot call start callback");
    }
}

