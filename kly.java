/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

final class kly
implements kmi {
    private final OutputStream a;
    private final kmm b;

    public kly(OutputStream outputStream, kmm kmm2) {
        jse.e(outputStream, "out");
        this.a = outputStream;
        this.b = kmm2;
    }

    @Override
    public final kmm a() {
        return this.b;
    }

    @Override
    public final void bK(klm klm2, long l2) {
        kmp.x(klm2.b, 0L, l2);
        while (l2 > 0L) {
            int n2;
            this.b.g();
            kmf kmf2 = klm2.a;
            jse.b(kmf2);
            int n3 = (int)Math.min(l2, (long)(kmf2.c - kmf2.b));
            this.a.write(kmf2.a, kmf2.b, n3);
            kmf2.b = n2 = kmf2.b + n3;
            long l3 = klm2.b;
            long l4 = n3;
            klm2.b = l3 - l4;
            n3 = kmf2.c;
            l2 = l4 = l2 - l4;
            if (n2 != n3) continue;
            klm2.a = kmf2.a();
            kmg.b(kmf2);
            l2 = l4;
        }
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final void flush() {
        this.a.flush();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("sink(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

