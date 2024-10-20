/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class klu
implements kmk {
    private final klo a;
    private final Inflater b;
    private int c;
    private boolean d;

    public klu(klo klo2, Inflater inflater) {
        this.a = klo2;
        this.b = inflater;
    }

    @Override
    public final kmm a() {
        return this.a.a();
    }

    @Override
    public final long b(klm klm2, long l2) {
        block2: {
            do {
                if ((l2 = this.c(klm2)) > 0L) {
                    return l2;
                }
                if (this.b.finished() || this.b.needsDictionary()) break block2;
            } while (!this.a.y());
            throw new EOFException("source exhausted prematurely");
        }
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c(klm klm2) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            int n2;
            kmf kmf2 = klm2.s(1);
            int n3 = (int)Math.min(8192L, (long)(8192 - kmf2.c));
            if (this.b.needsInput() && !this.a.y()) {
                kmf kmf3 = ((kme)this.a).b.a;
                jse.b(kmf3);
                int n4 = kmf3.c;
                n2 = kmf3.b;
                this.c = n4 -= n2;
                this.b.setInput(kmf3.a, n2, n4);
            }
            n2 = this.b.inflate(kmf2.a, kmf2.c, n3);
            n3 = this.c;
            if (n3 != 0) {
                this.c -= (n3 -= this.b.getRemaining());
                this.a.x(n3);
            }
            if (n2 > 0) {
                kmf2.c += n2;
                long l2 = klm2.b;
                long l3 = n2;
                klm2.b = l2 + l3;
                return l3;
            }
            if (kmf2.b == kmf2.c) {
                klm2.a = kmf2.a();
                kmg.b(kmf2);
            }
            return 0L;
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException(dataFormatException);
        }
    }

    @Override
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}

