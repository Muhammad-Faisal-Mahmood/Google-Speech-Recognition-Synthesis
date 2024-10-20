/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;

public final class khk
extends klr {
    final kmb a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    public khk(kmb kmb2, kmk kmk2, long l2) {
        jse.e(kmk2, "delegate");
        this.a = kmb2;
        super(kmk2);
        this.c = l2;
        this.e = true;
        if (l2 == 0L) {
            this.c(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(klm object, long l2) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long l3 = this.b.b((klm)object, 8192L);
            if (this.e) {
                this.e = false;
            }
            if (l3 == -1L) {
                this.c(null);
                return -1L;
            }
            l2 = this.d + l3;
            long l4 = this.c;
            if (l4 != -1L && l2 > l4) {
                l3 = this.c;
                StringBuilder stringBuilder = new StringBuilder("expected ");
                stringBuilder.append(l3);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(l2);
                object = new ProtocolException(stringBuilder.toString());
                throw object;
            }
            this.d = l2;
            if (l2 == l4) {
                this.c(null);
            }
            return l3;
        }
        catch (IOException iOException) {
            throw this.c(iOException);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        return this.a.e(true, false, iOException);
    }

    @Override
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            this.b.close();
            Void void_ = (Void)((Object)this.c(null));
            return;
        }
        catch (IOException iOException) {
            throw this.c(iOException);
        }
    }
}

