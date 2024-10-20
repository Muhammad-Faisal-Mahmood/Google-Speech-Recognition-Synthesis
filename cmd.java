/*
 * Decompiled with CFR 0.152.
 */
public final class cmd {
    private static cmg a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cmg a() {
        synchronized (cmd.class) {
            if (a != null) return a;
            cmg cmg2 = new cmg();
            cmd.b(cmg2);
            return a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(cmg object) {
        synchronized (cmd.class) {
            if (a == null) {
                a = object;
                return;
            }
            object = new IllegalStateException("init() already called");
            throw object;
        }
    }
}

