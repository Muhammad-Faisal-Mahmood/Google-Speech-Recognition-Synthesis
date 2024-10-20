/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

abstract class kii
implements kmk {
    public boolean a;
    final kio b;
    private final kls c;

    public kii(kio kio2) {
        this.b = kio2;
        this.c = new kls(kio2.c.a());
    }

    @Override
    public final kmm a() {
        return this.c;
    }

    @Override
    public long b(klm klm2, long l2) {
        try {
            l2 = this.b.c.b(klm2, l2);
            return l2;
        }
        catch (IOException iOException) {
            this.b.b.e();
            this.c();
            throw iOException;
        }
    }

    public final void c() {
        int n2 = this.b.e;
        if (n2 == 6) {
            return;
        }
        if (n2 == 5) {
            kio.l(this.c);
            this.b.e = 6;
            return;
        }
        throw new IllegalStateException(a.af(n2, "state: "));
    }

    protected final void d() {
        this.a = true;
    }
}

