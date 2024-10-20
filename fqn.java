/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class fqn
implements fqy {
    public final fqm a;
    private final fql b;
    private final long c;
    private long d;

    public fqn(fqm fqm2, fql fql2, long l2, TimeUnit timeUnit) {
        this.a = fqm2;
        this.b = fql2;
        this.c = timeUnit.toMillis(l2);
        this.d = fql2.a();
    }

    @Override
    public final void a(int n2) {
        this.a.a(n2);
        if (this.b.a() - this.d >= this.c) {
            this.a.b();
            this.d = this.b.a();
        }
    }

    @Override
    public final void close() {
        this.a.b();
    }
}

