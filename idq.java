/*
 * Decompiled with CFR 0.152.
 */
public final class idq
extends Enum
implements hwx {
    public static final /* enum */ idq a;
    public static final /* enum */ idq b;
    public static final /* enum */ idq c;
    public static final /* enum */ idq d;
    public static final /* enum */ idq e;
    public static final /* enum */ idq f;
    public static final /* enum */ idq g;
    public static final /* enum */ idq h;
    public static final /* enum */ idq i;
    public static final /* enum */ idq j;
    public static final /* enum */ idq k;
    public static final hwy l;
    private static final idq[] n;
    public final int m;

    static {
        idq idq2;
        idq idq3;
        idq idq4;
        idq idq5;
        idq idq6;
        idq idq7;
        idq idq8;
        idq idq9;
        idq idq10;
        idq idq11;
        idq idq12;
        a = idq12 = new idq("UNKNOWN", 0, 0);
        b = idq11 = new idq("DEFAULT_ONESHOT", 1, 1);
        c = idq10 = new idq("DEFAULT_CONTINUOUS", 2, 2);
        d = idq9 = new idq("AMBIENT_ONESHOT", 3, 3);
        e = idq8 = new idq("AMBIENT_CONTINUOUS", 4, 4);
        f = idq7 = new idq("AMBIENT_TELEPHONY", 5, 7);
        g = idq6 = new idq("FARFIELD_ONESHOT", 6, 5);
        h = idq5 = new idq("FARFIELD_CONTINUOUS", 7, 6);
        i = idq4 = new idq("NATCON_ONESHOT", 8, 9);
        j = idq3 = new idq("HIGH_QUALITY_CONTINUOUS", 9, 10);
        k = idq2 = new idq("BALANCED_CONTINUOUS", 10, 11);
        n = new idq[]{idq12, idq11, idq10, idq9, idq8, idq7, idq6, idq5, idq4, idq3, idq2};
        l = new iby(2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private idq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.m = var3_2;
    }

    public static idq b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 11: {
                return k;
            }
            case 10: {
                return j;
            }
            case 9: {
                return i;
            }
            case 7: {
                return f;
            }
            case 6: {
                return h;
            }
            case 5: {
                return g;
            }
            case 4: {
                return e;
            }
            case 3: {
                return d;
            }
            case 2: {
                return c;
            }
            case 1: {
                return b;
            }
            case 0: 
        }
        return a;
    }

    public static idq[] values() {
        return (idq[])n.clone();
    }

    @Override
    public final int a() {
        return this.m;
    }

    public final String toString() {
        return Integer.toString(this.m);
    }
}

