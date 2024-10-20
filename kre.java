/*
 * Decompiled with CFR 0.152.
 */
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

final class kre
implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private kre(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream)inputStream).getChannel());
        }
        return new kre(inputStream);
    }

    @Override
    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        int n2;
        if (byteBuffer.hasArray()) {
            int n3;
            n2 = n3 = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (n3 > 0) {
                byteBuffer = (ByteBuffer)byteBuffer.position(byteBuffer.position() + n3);
                return n3;
            }
        } else {
            byte[] byArray = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
            n2 = this.a.read(byArray);
            if (n2 > 0) {
                byteBuffer.put(byArray, 0, n2);
                return n2;
            }
        }
        return n2;
    }
}

