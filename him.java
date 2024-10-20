/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class him
extends hil {
    public final ByteBuffer a;

    protected him() {
        fxf.q(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public final void a(char c2) {
        this.a.putChar(c2);
        this.h();
    }

    public abstract hio c();

    @Override
    public final void d(byte[] object, int n2) {
        int n3 = 0;
        if (((Buffer)(object = (Object)ByteBuffer.wrap((byte[])object, 0, n2).order(ByteOrder.LITTLE_ENDIAN))).remaining() <= this.a.remaining()) {
            this.a.put((ByteBuffer)object);
            this.h();
            return;
        }
        int n4 = this.a.position();
        for (n2 = n3; n2 < 16 - n4; ++n2) {
            this.a.put(((ByteBuffer)object).get());
        }
        this.g();
        while (((Buffer)object).remaining() >= 16) {
            this.i((ByteBuffer)object);
        }
        this.a.put((ByteBuffer)object);
    }

    public final void g() {
        ((Buffer)this.a).flip();
        while (this.a.remaining() >= 16) {
            this.i(this.a);
        }
        this.a.compact();
    }

    public final void h() {
        if (this.a.remaining() < 8) {
            this.g();
        }
    }

    protected abstract void i(ByteBuffer var1);

    public void j(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override
    public final hio n() {
        throw null;
    }
}

