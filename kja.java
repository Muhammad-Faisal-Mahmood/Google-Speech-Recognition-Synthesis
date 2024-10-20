/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kja
extends khd {
    final kjl d;
    final kjs e;

    public kja(String string, kjl kjl2, kjs kjs2) {
        this.d = kjl2;
        this.e = kjs2;
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a() {
        try {
            this.d.b.f(this.e);
            return -1L;
        }
        catch (IOException iOException) {
            kjl kjl2 = this.d;
            kkf.b.l("Http2Connection.Listener failure for ".concat(String.valueOf(kjl2.d)), 4, iOException);
            try {
                this.e.g(kiq.b, iOException);
                return -1L;
            }
            catch (IOException iOException2) {
                return -1L;
            }
        }
    }
}

