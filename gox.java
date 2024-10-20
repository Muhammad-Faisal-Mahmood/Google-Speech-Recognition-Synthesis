/*
 * Decompiled with CFR 0.152.
 */
public final class gox
extends Enum {
    public static final /* enum */ gox a;
    public static final /* enum */ gox b;
    public static final /* enum */ gox c;
    public static final /* enum */ gox d;
    public static final /* enum */ gox e;
    public static final /* enum */ gox f;
    public static final /* enum */ gox g;
    public static final /* enum */ gox h;
    private static final gox[] i;

    static {
        gox gox2;
        gox gox3;
        gox gox4;
        gox gox5;
        gox gox6;
        gox gox7;
        gox gox8;
        gox gox9;
        a = gox9 = new gox("APPLICATION_CREATE", 0);
        b = gox8 = new gox("ACTIVITY_CREATE", 1);
        c = gox7 = new gox("ACTIVITY_START", 2);
        d = gox6 = new gox("ACTIVITY_RESUME", 3);
        e = gox5 = new gox("ACTIVITY_PAUSE", 4);
        f = gox4 = new gox("ACTIVITY_STOP", 5);
        g = gox3 = new gox("ACTIVITY_DESTROY", 6);
        h = gox2 = new gox("INTENT_TO_ACTIVITY", 7);
        i = new gox[]{gox9, gox8, gox7, gox6, gox5, gox4, gox3, gox2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gox() {
        void var2_-1;
        void var1_-1;
    }

    public static gox[] values() {
        return (gox[])i.clone();
    }
}

