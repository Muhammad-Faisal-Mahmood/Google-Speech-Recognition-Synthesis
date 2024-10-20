/*
 * Decompiled with CFR 0.152.
 */
public final class hic {
    public static final hif a;
    private static final String[] b;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        b = new String[]{"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        int n2 = 0;
        while (true) {
            if (n2 < 2) {
                Object object2 = b[n2];
                object = null;
                object = object2 = Class.forName((String)object2).asSubclass(hif.class).getDeclaredConstructor(null).newInstance(null);
            } else {
                object = new hig();
                break;
                catch (Throwable throwable) {}
            }
            if (object != null) break;
            ++n2;
        }
        a = object;
    }
}

