/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

final class jhi
extends jbh {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public jhi(byte[] byArray, int n2, int n3) {
        boolean bl2 = true;
        boolean bl3 = n2 >= 0;
        fxf.r(bl3, "offset must be >= 0");
        bl3 = n3 >= 0;
        fxf.r(bl3, "length must be >= 0");
        bl3 = (n3 += n2) <= 0 ? bl2 : false;
        fxf.r(bl3, "offset + length exceeds array boundary");
        this.c = byArray;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final void b() {
        this.d = this.a;
    }

    @Override
    public final void c() {
        int n2 = this.d;
        if (n2 != -1) {
            this.a = n2;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e() {
        this.a(1);
        int n2 = this.a;
        this.a = n2 + 1;
        return this.c[n2] & 0xFF;
    }

    @Override
    public final int f() {
        return this.b - this.a;
    }

    @Override
    public final void i(ByteBuffer byteBuffer) {
        a.s(byteBuffer, "dest");
        int n2 = byteBuffer.remaining();
        this.a(n2);
        byteBuffer.put(this.c, this.a, n2);
        this.a += n2;
    }

    @Override
    public final void j(OutputStream outputStream, int n2) {
        this.a(n2);
        outputStream.write(this.c, this.a, n2);
        this.a += n2;
    }

    @Override
    public final void k(byte[] byArray, int n2, int n3) {
        System.arraycopy(this.c, this.a, byArray, n2, n3);
        this.a += n3;
    }

    @Override
    public final void l(int n2) {
        this.a(n2);
        this.a += n2;
    }
}

