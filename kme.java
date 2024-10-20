/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class kme
implements klo {
    public final kmk a;
    public final klm b;
    public boolean c;

    public kme(kmk kmk2) {
        this.a = kmk2;
        this.b = new klm();
    }

    @Override
    public final byte[] A(long l2) {
        this.w(l2);
        return this.b.A(l2);
    }

    @Override
    public final kmm a() {
        return this.a.a();
    }

    @Override
    public final long b(klm klm2, long l2) {
        if (l2 >= 0L) {
            if (!this.c) {
                klm klm3 = this.b;
                if (klm3.b == 0L && this.a.b(klm3, 8192L) == -1L) {
                    return -1L;
                }
                l2 = Math.min(l2, this.b.b);
                return this.b.b(klm2, l2);
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount < 0: "));
    }

    public final int c() {
        this.w(4L);
        int n2 = this.b.f();
        return (n2 & 0xFF) << 24 | (n2 >>> 24 | (0xFF0000 & n2) >>> 8 | (0xFF00 & n2) << 8);
    }

    @Override
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.v();
        }
    }

    @Override
    public final byte d() {
        this.w(1L);
        return this.b.d();
    }

    public final boolean e(long l2) {
        block2: {
            block3: {
                boolean bl2;
                block4: {
                    block1: {
                        klm klm2;
                        if (l2 < 0L) break block2;
                        if (this.c) break block3;
                        do {
                            klm2 = this.b;
                            if (klm2.b >= l2) break block1;
                        } while (this.a.b(klm2, 8192L) != -1L);
                        bl2 = false;
                        break block4;
                    }
                    bl2 = true;
                }
                return bl2;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount < 0: "));
    }

    @Override
    public final int f() {
        this.w(4L);
        return this.b.f();
    }

    public final long g() {
        return this.h((byte)0, Long.MAX_VALUE);
    }

    public final long h(byte by2, long l2) {
        if (!this.c) {
            long l3;
            long l4 = 0L;
            while (true) {
                long l5;
                l3 = l5 = -1L;
                if (l4 >= l2 || (l3 = this.b.h(by2, l4, l2)) != -1L) break;
                klm klm2 = this.b;
                long l6 = klm2.b;
                l3 = l5;
                if (l6 >= l2) break;
                if (this.a.b(klm2, 8192L) == -1L) {
                    l3 = l5;
                    break;
                }
                l4 = Math.max(l4, l6);
            }
            return l3;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final InputStream i() {
        return new kmd(this, 0);
    }

    @Override
    public final boolean isOpen() {
        return !this.c;
    }

    @Override
    public final String m() {
        return this.n(Long.MAX_VALUE);
    }

    @Override
    public final String n(long l2) {
        block2: {
            block5: {
                String string;
                block4: {
                    long l3;
                    block3: {
                        if (l2 < 0L) break block2;
                        l3 = l2 == Long.MAX_VALUE ? Long.MAX_VALUE : l2 + 1L;
                        long l4 = this.h((byte)10, l3);
                        if (l4 == -1L) break block3;
                        string = kmn.a(this.b, l4);
                        break block4;
                    }
                    if (l3 >= Long.MAX_VALUE || !this.e(l3) || this.b.c(-1L + l3) != 13 || !this.e(1L + l3) || this.b.c(l3) != 10) break block5;
                    string = kmn.a(this.b, l3);
                }
                return string;
            }
            Object object = new klm();
            Object object2 = this.b;
            ((klm)object2).M((klm)object, Math.min(32L, ((klm)object2).b));
            l2 = Math.min(this.b.b, l2);
            object = ((klm)object).o().d();
            object2 = new StringBuilder("\\n not found: limit=");
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(" content=");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\u2026");
            throw new EOFException(((StringBuilder)object2).toString());
        }
        throw new IllegalArgumentException(a.ap(l2, "limit < 0: "));
    }

    @Override
    public final klp p(long l2) {
        this.w(l2);
        return this.b.p(l2);
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        jse.e(byteBuffer, "sink");
        klm klm2 = this.b;
        if (klm2.b == 0L && this.a.b(klm2, 8192L) == -1L) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override
    public final short t() {
        this.w(2L);
        return this.b.t();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public final void w(long l2) {
        if (this.e(l2)) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public final void x(long l2) {
        if (!this.c) {
            while (l2 > 0L) {
                klm klm2 = this.b;
                if (klm2.b == 0L && this.a.b(klm2, 8192L) == -1L) {
                    throw new EOFException();
                }
                long l3 = Math.min(l2, this.b.b);
                this.b.x(l3);
                l2 -= l3;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final boolean y() {
        if (!this.c) {
            klm klm2 = this.b;
            return klm2.y() && this.a.b(klm2, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }
}

