/*
 * Decompiled with CFR 0.152.
 */
public final class bot
extends hwv
implements hyg {
    public static final bot a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public int e;
    public hxb f = hww.a;

    static {
        bot bot2;
        a = bot2 = new bot();
        hwv.z(bot.class, bot2);
    }

    private bot() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return (byte)1;
        }
        if (n2 == 2) {
            object = hqj.a;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u180c\u0002\u0004'", new Object[]{"b", "c", "d", "e", object, "f"});
        }
        if (n2 == 3) {
            return new bot();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (bot.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

