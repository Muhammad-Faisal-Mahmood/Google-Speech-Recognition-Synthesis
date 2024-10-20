/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;

public abstract class aew {
    public static final aew a = new aet();

    static {
        agf.z(0);
        agf.z(1);
        agf.z(2);
    }

    protected aew() {
    }

    public abstract int a(Object var1);

    public abstract int b();

    public abstract int c();

    public abstract aeu d(int var1, aeu var2, boolean var3);

    public abstract aev e(int var1, aev var2, long var3);

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aew)) {
            return false;
        }
        aew aew2 = (aew)object;
        if (aew2.c() == this.c() && aew2.b() == this.b()) {
            int n2;
            aev aev2 = new aev();
            aeu aeu2 = new aeu();
            aev aev3 = new aev();
            object = new aeu();
            for (n2 = 0; n2 < this.c(); ++n2) {
                if (this.o(n2, aev2).equals(aew2.o(n2, aev3))) continue;
                return false;
            }
            for (n2 = 0; n2 < this.b(); ++n2) {
                if (this.d(n2, aeu2, true).equals(aew2.d(n2, (aeu)object, true))) continue;
                return false;
            }
            n2 = this.g(true);
            if (n2 != aew2.g(true)) {
                return false;
            }
            int n3 = this.h(true);
            if (n3 == aew2.h(true)) {
                while (n2 != n3) {
                    int n4 = this.j(n2, 0, true);
                    if (n4 == aew2.j(n2, 0, true)) {
                        n2 = n4;
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int var1);

    public int g(boolean bl2) {
        if (this.p()) {
            return -1;
        }
        return 0;
    }

    public int h(boolean bl2) {
        if (this.p()) {
            return -1;
        }
        return this.c() - 1;
    }

    public final int hashCode() {
        int n2;
        aev aev2 = new aev();
        aeu aeu2 = new aeu();
        int n3 = this.c() + 217;
        int n4 = 0;
        while (true) {
            n2 = this.c();
            n3 *= 31;
            if (n4 >= n2) break;
            n3 += this.o(n4, aev2).hashCode();
            ++n4;
        }
        n4 = n3 + this.b();
        for (n3 = 0; n3 < this.b(); ++n3) {
            n4 = n4 * 31 + this.d(n3, aeu2, true).hashCode();
        }
        n3 = this.g(true);
        while (n3 != -1) {
            n2 = this.j(n3, 0, true);
            n4 = n4 * 31 + n3;
            n3 = n2;
        }
        return n4;
    }

    public final int i(int n2, aeu aeu2, aev aev2, int n3, boolean bl2) {
        int n4 = this.m((int)n2, (aeu)aeu2).c;
        if (this.o((int)n4, (aev)aev2).o == n2) {
            n2 = this.j(n4, n3, bl2);
            if (n2 == -1) {
                return -1;
            }
            return this.o((int)n2, (aev)aev2).n;
        }
        return n2 + 1;
    }

    public int j(int n2, int n3, boolean bl2) {
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 == 2) {
                    n2 = n2 == this.h(bl2) ? this.g(bl2) : ++n2;
                    return n2;
                }
                throw new IllegalStateException();
            }
            return n2;
        }
        if (n2 == this.h(bl2)) {
            return -1;
        }
        return n2 + 1;
    }

    public final Pair k(aev aev2, aeu aeu2, int n2, long l2) {
        aev2 = this.l(aev2, aeu2, n2, l2, 0L);
        abr.i(aev2);
        return aev2;
    }

    public final Pair l(aev object, aeu aeu2, int n2, long l2, long l3) {
        abr.h(n2, this.c());
        this.e(n2, (aev)object, l3);
        l3 = l2;
        if (l2 == -9223372036854775807L) {
            l2 = ((aev)object).l;
            l3 = 0L;
        }
        n2 = ((aev)object).n;
        this.m(n2, aeu2);
        while (n2 < ((aev)object).o) {
            l2 = aeu2.e;
            long l4 = l3 - 0L;
            long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l5 == false) break;
            int n3 = n2 + 1;
            l2 = this.m((int)n3, (aeu)aeu2).e;
            if (l5 < 0) break;
            n2 = n3;
        }
        this.d(n2, aeu2, true);
        l2 = aeu2.e;
        long l6 = aeu2.d;
        l2 = l3;
        if (l6 != -9223372036854775807L) {
            l2 = Math.min(l3, l6 - 1L);
        }
        l2 = Math.max(0L, l2);
        object = aeu2.b;
        abr.i(object);
        return Pair.create((Object)object, (Object)l2);
    }

    public final aeu m(int n2, aeu aeu2) {
        return this.d(n2, aeu2, false);
    }

    public aeu n(Object object, aeu aeu2) {
        return this.d(this.a(object), aeu2, true);
    }

    public final aev o(int n2, aev aev2) {
        return this.e(n2, aev2, 0L);
    }

    public final boolean p() {
        return this.c() == 0;
    }

    public int q(int n2) {
        if (n2 == this.g(false)) {
            return -1;
        }
        return n2 - 1;
    }
}

