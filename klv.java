/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

final class klv
implements kmk {
    private final InputStream a;
    private final kmm b;

    public klv(InputStream inputStream, kmm kmm2) {
        jse.e(inputStream, "input");
        this.a = inputStream;
        this.b = kmm2;
    }

    @Override
    public final kmm a() {
        return this.b;
    }

    @Override
    public final long b(klm klm2, long l2) {
        int n2;
        block7: {
            kmf kmf2;
            try {
                this.b.g();
                kmf2 = klm2.s(1);
                n2 = (int)Math.min(l2, (long)(8192 - kmf2.c));
                n2 = this.a.read(kmf2.a, kmf2.c, n2);
                if (n2 != -1) break block7;
            }
            catch (AssertionError assertionError) {
                if (klw.e(assertionError)) {
                    throw new IOException((Throwable)((Object)assertionError));
                }
                throw assertionError;
            }
            if (kmf2.b == kmf2.c) {
                klm2.a = kmf2.a();
                kmg.b(kmf2);
            }
            return -1L;
        }
        kmf2.c += n2;
        l2 = klm2.b;
        long l3 = n2;
        klm2.b = l2 + l3;
        return l3;
    }

    @Override
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

