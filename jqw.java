/*
 * Decompiled with CFR 0.152.
 */
public final class jqw {
    public static final Integer a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object object2;
        block3: {
            object2 = null;
            try {
                object = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                if (!(object instanceof Integer)) break block3;
                object = (Integer)object;
            }
            catch (Throwable throwable) {}
        }
        object = null;
        Object object3 = object2;
        if (object != null) {
            object3 = ((Number)object).intValue() <= 0 ? object2 : object;
        }
        a = object3;
    }
}

