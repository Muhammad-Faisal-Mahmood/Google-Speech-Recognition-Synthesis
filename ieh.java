/*
 * Decompiled with CFR 0.152.
 */
public final class ieh
extends Enum
implements hwx {
    public static final /* enum */ ieh a;
    public static final /* enum */ ieh b;
    public static final /* enum */ ieh c;
    public static final /* enum */ ieh d;
    public static final /* enum */ ieh e;
    public static final /* enum */ ieh f;
    public static final /* enum */ ieh g;
    public static final /* enum */ ieh h;
    public static final /* enum */ ieh i;
    public static final /* enum */ ieh j;
    public static final /* enum */ ieh k;
    public static final /* enum */ ieh l;
    public static final /* enum */ ieh m;
    public static final /* enum */ ieh n;
    public static final /* enum */ ieh o;
    private static final ieh[] q;
    public final int p;

    static {
        ieh ieh2;
        ieh ieh3;
        ieh ieh4;
        ieh ieh5;
        ieh ieh6;
        ieh ieh7;
        ieh ieh8;
        ieh ieh9;
        ieh ieh10;
        ieh ieh11;
        ieh ieh12;
        ieh ieh13;
        ieh ieh14;
        ieh ieh15;
        ieh ieh16;
        a = ieh16 = new ieh("QP_UNKNOWN", 0, 0);
        b = ieh15 = new ieh("QP_STOP_ALARM", 1, 1);
        c = ieh14 = new ieh("QP_SNOOZE_ALARM", 2, 2);
        d = ieh13 = new ieh("QP_STOP_TIMER", 3, 3);
        e = ieh12 = new ieh("QP_ANSWER_CALL", 4, 4);
        f = ieh11 = new ieh("QP_DECLINE_CALL", 5, 5);
        g = ieh10 = new ieh("QP_SILENCE_CALL", 6, 15);
        h = ieh9 = new ieh("QP_SET_ALARM", 7, 6);
        i = ieh8 = new ieh("QP_CANCEL_ALARM", 8, 7);
        j = ieh7 = new ieh("QP_SET_LIGHT_ON_OFF", 9, 8);
        k = ieh6 = new ieh("QP_SET_LIGHT_BRIGHTNESS", 10, 9);
        l = ieh5 = new ieh("QP_SET_TIMER", 11, 10);
        m = ieh4 = new ieh("QP_CANCEL_TIMER", 12, 11);
        n = ieh3 = new ieh("QP_GET_TIME", 13, 12);
        o = ieh2 = new ieh("QP_GET_WEATHER", 14, 13);
        q = new ieh[]{ieh16, ieh15, ieh14, ieh13, ieh12, ieh11, ieh10, ieh9, ieh8, ieh7, ieh6, ieh5, ieh4, ieh3, ieh2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ieh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.p = var3_2;
    }

    public static ieh b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 15: {
                return g;
            }
            case 13: {
                return o;
            }
            case 12: {
                return n;
            }
            case 11: {
                return m;
            }
            case 10: {
                return l;
            }
            case 9: {
                return k;
            }
            case 8: {
                return j;
            }
            case 7: {
                return i;
            }
            case 6: {
                return h;
            }
            case 5: {
                return f;
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

    public static ieh[] values() {
        return (ieh[])q.clone();
    }

    @Override
    public final int a() {
        return this.p;
    }

    public final String toString() {
        return Integer.toString(this.p);
    }
}

