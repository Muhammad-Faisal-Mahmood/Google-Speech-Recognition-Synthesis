/*
 * Decompiled with CFR 0.152.
 */
public final class kdc
extends Enum
implements hwx {
    public static final /* enum */ kdc a;
    public static final /* enum */ kdc b;
    public static final /* enum */ kdc c;
    public static final /* enum */ kdc d;
    public static final /* enum */ kdc e;
    public static final /* enum */ kdc f;
    public static final /* enum */ kdc g;
    private static final kdc[] i;
    public final int h;

    static {
        kdc kdc2;
        kdc kdc3;
        kdc kdc4;
        kdc kdc5;
        kdc kdc6;
        kdc kdc7;
        kdc kdc8;
        a = kdc8 = new kdc("UNKNOWN", 0, 0);
        b = kdc7 = new kdc("FOREGROUND_TO_BACKGROUND", 1, 1);
        c = kdc6 = new kdc("BACKGROUND_TO_FOREGROUND", 2, 2);
        d = kdc5 = new kdc("FOREGROUND_SERVICE_START", 3, 3);
        e = kdc4 = new kdc("FOREGROUND_SERVICE_STOP", 4, 4);
        f = kdc3 = new kdc("CUSTOM_MEASURE_START", 5, 5);
        g = kdc2 = new kdc("CUSTOM_MEASURE_STOP", 6, 6);
        i = new kdc[]{kdc8, kdc7, kdc6, kdc5, kdc4, kdc3, kdc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kdc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.h = var3_2;
    }

    public static kdc b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 6: {
                return g;
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

    public static kdc[] values() {
        return (kdc[])i.clone();
    }

    @Override
    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}

