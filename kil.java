/*
 * Decompiled with CFR 0.152.
 */
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class kil
extends kii {
    final kio c;
    private long d;

    public kil(kio kio2, long l2) {
        this.c = kio2;
        super(kio2);
        this.d = l2;
        if (l2 == 0L) {
            this.c();
        }
    }

    @Override
    public final long b(klm object, long l2) {
        if (!this.a) {
            l2 = this.d;
            if (l2 == 0L) {
                return -1L;
            }
            if ((l2 = super.b((klm)object, Math.min(l2, 8192L))) != -1L) {
                long l3;
                this.d = l3 = this.d - l2;
                if (l3 == 0L) {
                    this.c();
                }
                return l2;
            }
            this.c.b.e();
            object = new ProtocolException("unexpected end of stream");
            this.c();
            throw object;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0L && !khb.D(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            this.c();
        }
        this.d();
    }
}

