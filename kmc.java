/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class kmc
implements kln {
    public final kmi a;
    public final klm b;
    public boolean c;

    public kmc(kmi kmi2) {
        jse.e(kmi2, "sink");
        this.a = kmi2;
        this.b = new klm();
    }

    @Override
    public final void D(byte[] byArray, int n2, int n3) {
        jse.e(byArray, "source");
        if (!this.c) {
            this.b.C(byArray, n2, n3);
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void G(int n2) {
        if (!this.c) {
            this.b.F(n2);
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void I(int n2) {
        if (!this.c) {
            this.b.H(n2);
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void J(int n2) {
        if (!this.c) {
            klm klm2 = this.b;
            kmf kmf2 = klm2.s(2);
            byte[] byArray = kmf2.a;
            int n3 = kmf2.c;
            byArray[n3] = (byte)(n2 >>> 8 & 0xFF);
            byArray[n3 + 1] = (byte)(n2 & 0xFF);
            kmf2.c = n3 + 2;
            klm2.b += 2L;
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void Q(String string) {
        jse.e(string, "string");
        if (!this.c) {
            this.b.P(string);
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final kmm a() {
        return this.a.a();
    }

    @Override
    public final void bK(klm klm2, long l2) {
        jse.e(klm2, "source");
        if (!this.c) {
            this.b.bK(klm2, l2);
            this.c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void c() {
        if (!this.c) {
            long l2 = this.b.g();
            if (l2 > 0L) {
                this.a.bK(this.b, l2);
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        if (!this.c) {
            Throwable throwable;
            block8: {
                Throwable throwable2;
                block7: {
                    klm klm2 = this.b;
                    long l2 = klm2.b;
                    throwable2 = throwable = null;
                    if (l2 <= 0L) break block7;
                    try {
                        this.a.bK(klm2, l2);
                        throwable2 = throwable;
                    }
                    catch (Throwable throwable3) {
                        // empty catch block
                    }
                }
                try {
                    this.a.close();
                    throwable = throwable2;
                }
                catch (Throwable throwable4) {
                    throwable = throwable2;
                    if (throwable2 != null) break block8;
                    throwable = throwable4;
                }
            }
            this.c = true;
            if (throwable != null) {
                throw throwable;
            }
        }
    }

    @Override
    public final void flush() {
        if (!this.c) {
            klm klm2 = this.b;
            long l2 = klm2.b;
            if (l2 > 0L) {
                this.a.bK(klm2, l2);
            }
            this.a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public final int write(ByteBuffer byteBuffer) {
        jse.e(byteBuffer, "source");
        if (!this.c) {
            int n2 = this.b.write(byteBuffer);
            this.c();
            return n2;
        }
        throw new IllegalStateException("closed");
    }
}

