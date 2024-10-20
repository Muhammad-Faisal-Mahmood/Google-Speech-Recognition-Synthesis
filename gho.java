/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 */
import android.content.Context;
import android.content.ContextWrapper;

public final class gho {
    public static final gtq a = new agx(5);
    public static final gtq b = new agx(6);

    public static ghn a(Context object, gtq object2) {
        Context context = object;
        while (!object2.a(context)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper)context).getBaseContext();
                continue;
            }
            object = String.valueOf(object.getClass());
            object2 = new StringBuilder("Cannot use base context of type ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" for ViewContext.");
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        return new ghn((Context)object);
    }
}

