/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cgx {
    private static final cgx a = new cgx();
    private bzq b = null;

    public static bzq b(Context context) {
        return a.a(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final bzq a(Context object) {
        synchronized (this) {
            if (this.b != null) return this.b;
            Context context = object;
            if (object.getApplicationContext() != null) {
                context = object.getApplicationContext();
            }
            object = new bzq((Object)context, null);
            this.b = object;
            return this.b;
        }
    }
}

