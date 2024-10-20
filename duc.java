/*
 * Decompiled with CFR 0.152.
 */
public final class duc {
    public static final Object a = new Object();
    public static boolean b = false;
    public static volatile boolean c = false;
    public static volatile dub d;
    public static volatile boolean e = false;
    public static volatile dub f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a() {
        Object object = a;
        synchronized (object) {
            return b;
        }
    }
}

