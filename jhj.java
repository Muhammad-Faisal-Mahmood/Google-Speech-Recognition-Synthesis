/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class jhj
extends jbh {
    final ByteBuffer a;

    public jhj(ByteBuffer byteBuffer) {
        a.s(byteBuffer, "bytes");
        this.a = byteBuffer;
    }

    @Override
    public final void b() {
        this.a.mark();
    }

    @Override
    public final void c() {
        this.a.reset();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e() {
        this.a(1);
        return this.a.get() & 0xFF;
    }

    @Override
    public final int f() {
        return this.a.remaining();
    }

    @Override
    public final void i(ByteBuffer byteBuffer) {
        a.s(byteBuffer, "dest");
        int n2 = byteBuffer.remaining();
        this.a(n2);
        ByteBuffer byteBuffer2 = this.a;
        int n3 = byteBuffer2.limit();
        ((Buffer)byteBuffer2).limit(byteBuffer2.position() + n2);
        byteBuffer.put(this.a);
        this.a.limit(n3);
    }

    @Override
    public final void j(OutputStream object, int n2) {
        this.a(n2);
        if (this.a.hasArray()) {
            ByteBuffer byteBuffer = this.a;
            ((OutputStream)object).write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), n2);
            object = this.a;
            ((Buffer)object).position(((Buffer)object).position() + n2);
            return;
        }
        byte[] byArray = new byte[n2];
        this.a.get(byArray);
        ((OutputStream)object).write(byArray);
    }

    @Override
    public final void k(byte[] byArray, int n2, int n3) {
        this.a(n3);
        this.a.get(byArray, n2, n3);
    }

    @Override
    public final void l(int n2) {
        this.a(n2);
        int n3 = this.a.position();
        ((Buffer)this.a).position(n3 + n2);
    }
}

