/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;

public final class khj
extends klq {
    final kmb a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    public khj(kmb kmb2, kmi kmi2, long l2) {
        jse.e(kmi2, "delegate");
        this.a = kmb2;
        super(kmi2);
        this.c = l2;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override
    public final void bK(klm object, long l2) {
        if (!this.f) {
            long l3 = this.c;
            if (l3 != -1L && this.e + l2 > l3) {
                long l4 = this.e;
                object = new StringBuilder("expected ");
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append(" bytes but received ");
                ((StringBuilder)object).append(l4 + l2);
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            try {
                this.b.bK((klm)object, l2);
                this.e += l2;
                return;
            }
            catch (IOException iOException) {
                throw this.c(iOException);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        long l2 = this.c;
        if (l2 != -1L && this.e != l2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
            Void void_ = (Void)((Object)this.c(null));
            return;
        }
        catch (IOException iOException) {
            throw this.c(iOException);
        }
    }

    @Override
    public final void flush() {
        try {
            this.b.flush();
            return;
        }
        catch (IOException iOException) {
            throw this.c(iOException);
        }
    }
}

