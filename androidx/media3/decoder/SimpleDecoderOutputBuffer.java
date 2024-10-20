/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SimpleDecoderOutputBuffer
extends ahz {
    public ByteBuffer data;
    private final ahy owner;

    public SimpleDecoderOutputBuffer(ahy ahy2) {
        this.owner = ahy2;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer grow(int n2) {
        ByteBuffer byteBuffer = this.data;
        abr.i(byteBuffer);
        boolean bl2 = n2 >= byteBuffer.limit();
        abr.d(bl2);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
        int n3 = byteBuffer.position();
        byteBuffer.position(0);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.position(n3);
        byteBuffer2.limit(n2);
        this.data = byteBuffer2;
        return byteBuffer2;
    }

    public ByteBuffer init(long l2, int n2) {
        this.timeUs = l2;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < n2) {
            this.data = ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(n2);
        return this.data;
    }

    @Override
    public void release() {
        this.owner.a();
    }
}

