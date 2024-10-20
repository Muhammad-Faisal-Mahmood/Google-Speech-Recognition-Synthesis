/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.d;
import j$.time.g;
import j$.time.temporal.b;
import j$.time.temporal.c;
import j$.time.temporal.e;
import j$.time.temporal.p;
import j$.time.temporal.t;

abstract class f
extends Enum
implements p {
    public static final /* enum */ f DAY_OF_QUARTER;
    public static final /* enum */ f QUARTER_OF_YEAR;
    public static final /* enum */ f WEEK_BASED_YEAR;
    public static final /* enum */ f WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final f[] b;

    static {
        b b2 = new b();
        DAY_OF_QUARTER = b2;
        c c2 = new c();
        QUARTER_OF_YEAR = c2;
        j$.time.temporal.d d2 = new j$.time.temporal.d();
        WEEK_OF_WEEK_BASED_YEAR = d2;
        e e2 = new e();
        WEEK_BASED_YEAR = e2;
        b = new f[]{b2, c2, d2, e2};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static /* bridge */ /* synthetic */ int[] F() {
        return a;
    }

    static int I(g g2) {
        int n2;
        block5: {
            int n3;
            block6: {
                int n4;
                int n5;
                block4: {
                    n2 = g2.M().ordinal();
                    n5 = g2.N();
                    n4 = 1;
                    n3 = n5 - 1;
                    n2 = 3 - n2 + n3;
                    int n6 = n2 - n2 / 7 * 7;
                    n5 = n2 = n6 - 3;
                    if (n2 < -3) {
                        n5 = n6 + 4;
                    }
                    if (n3 >= n5) break block4;
                    n2 = (int)t.j(1L, f.N(f.M(g2.d0(180).Z(-1L)))).d();
                    break block5;
                }
                if ((n3 = (n3 - n5) / 7 + 1) != 53 || n5 == -3) break block6;
                n2 = n4;
                if (n5 != -2) break block5;
                n2 = n4;
                if (!g2.o()) break block5;
            }
            n2 = n3;
        }
        return n2;
    }

    static /* bridge */ /* synthetic */ int J(g g2) {
        return f.M(g2);
    }

    static /* bridge */ /* synthetic */ int K(int n2) {
        return f.N(n2);
    }

    static t L(g g2) {
        return t.j(1L, f.N(f.M(g2)));
    }

    private static int M(g g2) {
        int n2;
        int n3 = g2.P();
        int n4 = g2.N();
        if (n4 <= 3) {
            n2 = n3;
            if (n4 - g2.M().ordinal() < -2) {
                n2 = n3 - 1;
            }
        } else {
            n2 = n3;
            if (n4 >= 363) {
                int n5 = g2.M().ordinal();
                n2 = n3;
                if (n4 - 363 - g2.o() - n5 >= 0) {
                    n2 = n3 + 1;
                }
            }
        }
        return n2;
    }

    private static int N(int n2) {
        g g2 = g.T(n2, 1, 1);
        if (!(g2.M() == d.THURSDAY || g2.M() == d.WEDNESDAY && g2.o())) {
            return 52;
        }
        return 53;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])b.clone();
    }

    @Override
    public final boolean B() {
        return true;
    }
}

