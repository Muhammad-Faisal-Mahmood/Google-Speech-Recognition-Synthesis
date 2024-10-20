/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class jkw
extends jbh {
    private final klm a;

    public jkw(klm klm2) {
        this.a = klm2;
    }

    @Override
    public final void close() {
        this.a.v();
    }

    @Override
    public final int e() {
        try {
            byte by2 = this.a.d();
            return by2 & 0xFF;
        }
        catch (EOFException eOFException) {
            throw new IndexOutOfBoundsException(eOFException.getMessage());
        }
    }

    @Override
    public final int f() {
        return (int)this.a.b;
    }

    @Override
    public final jhg g(int n2) {
        klm klm2 = new klm();
        klm2.bK(this.a, n2);
        return new jkw(klm2);
    }

    @Override
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void j(OutputStream outputStream, int n2) {
        jse.e(outputStream, "out");
        klm klm2 = this.a;
        long l2 = klm2.b;
        long l3 = n2;
        kmp.x(l2, 0L, l3);
        kmf kmf2 = klm2.a;
        while (l3 > 0L) {
            kmf kmf3;
            jse.b(kmf2);
            int n3 = (int)Math.min(l3, (long)(kmf2.c - kmf2.b));
            outputStream.write(kmf2.a, kmf2.b, n3);
            kmf2.b = n2 = kmf2.b + n3;
            l2 = klm2.b;
            long l4 = n3;
            klm2.b = l2 - l4;
            n3 = kmf2.c;
            l3 = l2 = l3 - l4;
            if (n2 != n3) continue;
            klm2.a = kmf3 = kmf2.a();
            kmg.b(kmf2);
            kmf2 = kmf3;
            l3 = l2;
        }
    }

    @Override
    public final void k(byte[] byArray, int n2, int n3) {
        while (n3 > 0) {
            int n4 = this.a.e(byArray, n2, n3);
            if (n4 != -1) {
                n3 -= n4;
                n2 += n4;
                continue;
            }
            throw new IndexOutOfBoundsException(a.ah(n3, "EOF trying to read ", " bytes"));
        }
    }

    @Override
    public final void l(int n2) {
        try {
            this.a.x(n2);
            return;
        }
        catch (EOFException eOFException) {
            throw new IndexOutOfBoundsException(eOFException.getMessage());
        }
    }
}

