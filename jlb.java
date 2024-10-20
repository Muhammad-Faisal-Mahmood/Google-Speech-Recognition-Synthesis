/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class jlb {
    public final klm a;
    public int b;
    public int c;
    public boolean d;
    final jle e;
    private final int f;
    private final jla g;

    public jlb(jle jle2, int n2, int n3, jla jla2) {
        this.e = jle2;
        this.a = new klm();
        this.d = false;
        this.f = n2;
        this.b = n3;
        this.g = jla2;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int)this.a.b)) - this.c;
    }

    final int b() {
        return Math.min(this.b, ((jlb)this.e.d).b);
    }

    /*
     * Loose catch block
     */
    final void c(klm klm2, int n2, boolean bl2) {
        int n3;
        do {
            boolean bl3;
            n3 = Math.min(n2, ((jmc)((jke)((jkd)this.e.c).b).a).a);
            jle jle2 = this.e;
            int n4 = -n3;
            ((jlb)jle2.d).f(n4);
            this.f(n4);
            long l2 = klm2.b;
            long l3 = n3;
            boolean bl4 = bl3 = false;
            if (l2 == l3) {
                bl4 = bl3;
                if (bl2) {
                    bl4 = true;
                }
            }
            Object object = this.e.c;
            n4 = this.f;
            ((jkd)object).c.d(2, n4, klm2, n3, bl4);
            try {
                ((jke)((jkd)object).b).a.b(bl4, n4, klm2, n3);
            }
            catch (IOException iOException) {
                ((jkd)object).a.a(iOException);
            }
            this.g.h(n3);
            n2 = n3 = n2 - n3;
        } while (n3 > 0);
        return;
        {
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0L;
    }

    final void e(int n2, jld jld2) {
        int n3 = Math.min(n2, this.b());
        int n4 = 0;
        while (this.d() && n3 > 0) {
            klm klm2 = this.a;
            long l2 = n3;
            long l3 = klm2.b;
            if (l2 >= l3) {
                n3 = (int)l3;
                n4 += n3;
                this.c(klm2, n3, this.d);
            } else {
                n4 += n3;
                this.c(klm2, n3, false);
            }
            ++jld2.a;
            n3 = Math.min(n2 - n4, this.b());
        }
    }

    final void f(int n2) {
        if (n2 > 0 && Integer.MAX_VALUE - n2 < this.b) {
            n2 = this.f;
            StringBuilder stringBuilder = new StringBuilder("Window size overflow for stream: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.b += n2;
    }
}

