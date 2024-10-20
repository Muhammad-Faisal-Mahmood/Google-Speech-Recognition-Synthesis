/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ahx
extends aht {
    public adu a;
    public final ahu b = new ahu();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    private final int g;

    static {
        aeg.b("media3.decoder");
    }

    public ahx(int n2) {
        this.g = n2;
    }

    private final ByteBuffer d(int n2) {
        int n3 = this.g;
        if (n3 == 1) {
            return ByteBuffer.allocate(n2);
        }
        if (n3 == 2) {
            return ByteBuffer.allocateDirect(n2);
        }
        ByteBuffer byteBuffer = this.c;
        n3 = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new ahw(n3, n2);
    }

    public final void a(int n2) {
        int n3;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = this.d(n2);
            return;
        }
        int n4 = byteBuffer.capacity();
        if (n4 >= (n2 += (n3 = byteBuffer.position()))) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer2 = this.d(n2);
        byteBuffer2.order(byteBuffer.order());
        if (n3 > 0) {
            byteBuffer.flip();
            byteBuffer2.put(byteBuffer);
        }
        this.c = byteBuffer2;
    }

    public final void b() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.f) != null) {
            byteBuffer.flip();
        }
    }

    public final boolean c() {
        return this.getFlag(0x40000000);
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.f) != null) {
            byteBuffer.clear();
        }
        this.d = false;
    }
}

