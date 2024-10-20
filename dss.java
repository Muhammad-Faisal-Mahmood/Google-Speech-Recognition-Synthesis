/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class dss {
    static final dst a = new dsq(ket.a, true);
    private final Random b;
    private final dsg c;
    private final dox d;

    public dss(Random random, dsg dsg2, dox dox2) {
        this.b = random;
        this.d = dox2;
        this.c = dsg2;
    }

    public final dst a(ket ket2) {
        int n2 = a.F(ket2.d);
        boolean bl2 = true;
        boolean bl3 = true;
        int n3 = n2;
        if (n2 == 0) {
            n3 = 1;
        }
        if (--n3 != 1) {
            if (n3 != 3) {
                if (n3 != 4) {
                    if (n3 == 5) {
                        ket2 = ket.a;
                    }
                    return new dsq(ket2, true);
                }
                Random random = this.b;
                dsg dsg2 = this.c;
                fxf.K(dsg2);
                return new dsr(ket2, random, dsg2);
            }
            if (!(this.b.nextDouble() * 1000.0 < (double)ket2.c)) {
                bl3 = false;
            }
            return new dsq(ket2, bl3);
        }
        bl3 = ket2.c == 1000L ? bl2 : false;
        return new dsq(ket2, bl3);
    }
}

