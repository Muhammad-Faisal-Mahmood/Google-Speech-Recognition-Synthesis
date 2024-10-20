/*
 * Decompiled with CFR 0.152.
 */
public final class kez
extends hwv
implements hyg {
    public static final kez a;
    private static volatile hym l;
    public int b;
    public boolean c;
    public kes d;
    public String e = "";
    public String f = "";
    public int g;
    public String h = "";
    public hlo i;
    public kfb j;
    public key k;
    private byte m = (byte)2;

    static {
        kez kez2;
        a = kez2 = new kez();
        hwv.z(kez.class, kez2);
    }

    private kez() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.m;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = kei.g;
            return new hyq(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u180c\u0004\u0007\u1008\u0007\t\u1409\b\u000b\u1009\n\f\u1009\u000b", new Object[]{"b", "c", "d", "e", "f", "g", object, "h", "i", "j", "k"});
        }
        if (n2 == 3) {
            return new kez();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.m = by2;
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (kez.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

