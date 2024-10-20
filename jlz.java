/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

final class jlz
implements kmk {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final klo f;

    public jlz(klo klo2) {
        this.f = klo2;
    }

    @Override
    public final kmm a() {
        return this.f.a();
    }

    @Override
    public final long b(klm klm2, long l2) {
        block5: {
            int n2;
            while ((n2 = this.d) == 0) {
                this.f.x(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    int n3;
                    n2 = this.c;
                    this.d = n3 = jmd.b(this.f);
                    this.a = n3;
                    n3 = this.f.d();
                    this.b = (byte)(this.f.d() & 0xFF);
                    boolean bl2 = jmd.a.isLoggable(Level.FINE);
                    byte by2 = (byte)(n3 & 0xFF);
                    if (bl2) {
                        jmd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", jma.a(true, this.c, this.a, by2, this.b));
                    }
                    this.c = n3 = this.f.f() & Integer.MAX_VALUE;
                    if (by2 == 9) {
                        if (n3 == n2) continue;
                        throw jmd.c("TYPE_CONTINUATION streamId changed", new Object[0]);
                    }
                    throw jmd.c("%s != TYPE_CONTINUATION", by2);
                }
                break block5;
            }
            l2 = this.f.b(klm2, Math.min(8192L, (long)n2));
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

