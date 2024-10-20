/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class arm {
    public final arn a = new arn();
    public final aga b = new aga(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int n2) {
        int n3;
        int n4;
        int n5 = 0;
        this.e = 0;
        do {
            n4 = this.e;
            int n6 = n2 + n4;
            arn arn2 = this.a;
            n3 = n5;
            if (n6 >= arn2.c) break;
            this.e = n4 + 1;
            n4 = arn2.f[n6];
            n5 = n3 = n5 + n4;
        } while (n4 == 255);
        return n3;
    }

    public final boolean a(app app2) {
        abr.f(true);
        if (this.d) {
            this.d = false;
            this.b.s(0);
        }
        while (!this.d) {
            Object object;
            int n2;
            int n3 = n2 = this.c;
            if (n2 < 0) {
                if (this.a.c(app2) && this.a.b(app2, true)) {
                    object = this.a;
                    n2 = ((arn)object).d;
                    if ((((arn)object).a & 1) == 1 && this.b.c == 0) {
                        n2 += this.b(0);
                        n3 = this.e;
                    } else {
                        n3 = 0;
                    }
                    if (!wc.r(app2, n2)) {
                        return false;
                    }
                    this.c = n3;
                } else {
                    return false;
                }
            }
            n3 = this.b(n3);
            n2 = this.c + this.e;
            if (n3 > 0) {
                int n4 = ((aga)object).c + n3;
                object = this.b;
                if (n4 > ((aga)object).b()) {
                    ((aga)object).a = Arrays.copyOf(((aga)object).a, n4);
                }
                object = this.b;
                if (!wc.q(app2, ((aga)object).a, ((aga)object).c, n3)) {
                    return false;
                }
                object = this.b;
                ((aga)object).u(((aga)object).c + n3);
                boolean bl2 = this.a.f[n2 - 1] != 255;
                this.d = bl2;
            }
            n3 = n2;
            if (n2 == this.a.c) {
                n3 = -1;
            }
            this.c = n3;
        }
        return true;
    }
}

