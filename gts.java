/*
 * Decompiled with CFR 0.152.
 */
public final class gts
extends Enum
implements gtq {
    public static final /* enum */ gts a;
    public static final /* enum */ gts b;
    public static final /* enum */ gts c;
    public static final /* enum */ gts d;
    private static final gts[] e;

    static {
        gts gts2;
        gts gts3;
        gts gts4;
        gts gts5;
        a = gts5 = new gts("ALWAYS_TRUE", 0);
        b = gts4 = new gts("ALWAYS_FALSE", 1);
        c = gts3 = new gts("IS_NULL", 2);
        d = gts2 = new gts("NOT_NULL", 3);
        e = new gts[]{gts5, gts4, gts3, gts2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gts() {
        void var2_-1;
        void var1_-1;
    }

    public static gts[] values() {
        return (gts[])e.clone();
    }

    @Override
    public final /* synthetic */ boolean a(Object object) {
        int n2 = this.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return object != null;
                    }
                    throw null;
                }
                if (object == null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ String toString() {
        int n2 = this.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return super.toString();
                    }
                    return "Predicates.notNull()";
                }
                return "Predicates.isNull()";
            }
            return "Predicates.alwaysFalse()";
        }
        return "Predicates.alwaysTrue()";
    }
}

