/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class alq
extends ahx {
    public long g;
    public int h;
    private int i = 32;

    public alq() {
        super(2);
    }

    @Override
    public final void clear() {
        super.clear();
        this.h = 0;
    }

    public final void d(int n2) {
        abr.d(true);
        this.i = n2;
    }

    public final boolean e(ahx ahx2) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        abr.d(ahx2.c() ^ true);
        abr.d(ahx2.hasSupplementalData() ^ true);
        abr.d(ahx2.isEndOfStream() ^ true);
        if (this.f() && (this.h >= this.i || (byteBuffer2 = ahx2.c) != null && (byteBuffer = this.c) != null && byteBuffer.position() + byteBuffer2.remaining() > 0x2EE000)) {
            return false;
        }
        int n2 = this.h;
        this.h = n2 + 1;
        if (n2 == 0) {
            this.e = ahx2.e;
            if (ahx2.isKeyFrame()) {
                this.setFlags(1);
            }
        }
        if ((byteBuffer = ahx2.c) != null) {
            this.a(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.g = ahx2.e;
        return true;
    }

    public final boolean f() {
        return this.h > 0;
    }
}

