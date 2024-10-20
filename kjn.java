/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kjn
implements kmk {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final klo f;

    public kjn(klo klo2) {
        jse.e(klo2, "source");
        this.f = klo2;
    }

    @Override
    public final kmm a() {
        return this.f.a();
    }

    @Override
    public final long b(klm object, long l2) {
        block5: {
            int n2;
            while ((n2 = this.d) == 0) {
                this.f.x(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    int n3;
                    int n4;
                    n2 = this.c;
                    this.d = n4 = khb.g(this.f);
                    this.a = n4;
                    n4 = khb.z(this.f.d());
                    this.b = khb.z(this.f.d());
                    if (kjo.a.isLoggable(Level.FINE)) {
                        Logger logger = kjo.a;
                        klp klp2 = kiv.a;
                        logger.fine(kiv.b(true, this.c, this.a, n4, this.b));
                    }
                    this.c = n3 = this.f.f() & Integer.MAX_VALUE;
                    if (n4 == 9) {
                        if (n3 == n2) continue;
                        throw new IOException("TYPE_CONTINUATION streamId changed");
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(n4);
                    ((StringBuilder)object).append(" != TYPE_CONTINUATION");
                    throw new IOException(((StringBuilder)object).toString());
                }
                break block5;
            }
            l2 = this.f.b((klm)object, Math.min(8192L, (long)n2));
            if (l2 != -1L) {
                this.d -= (int)l2;
                return l2;
            }
        }
        return -1L;
    }

    @Override
    public final void close() {
    }
}

