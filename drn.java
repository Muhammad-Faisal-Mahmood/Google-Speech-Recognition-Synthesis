/*
 * Decompiled with CFR 0.152.
 */
public final class drn {
    public static final drn a;
    public static final cgw e;
    public final dmy b;
    boolean c = false;
    public int d = 1;

    static {
        e = new cgw();
        a = new drn();
    }

    public drn() {
        this.b = new dmy();
    }

    public drn(long l2, long l3) {
        if (l3 >= l2) {
            this.b = new dmy(new dmz(l2, l2), new dmz(l3, l3));
            return;
        }
        throw new IllegalArgumentException(fvd.aq("End time %s is before start time %s.", l3, l2));
    }

    public static boolean b(drn drn2) {
        return drn2 == null || drn2 == a;
        {
        }
    }

    final long a() {
        dmy dmy2 = this.b;
        return dmy2.b.a - dmy2.a.a;
    }
}

