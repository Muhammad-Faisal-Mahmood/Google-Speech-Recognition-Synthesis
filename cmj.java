/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 */
import android.content.ContentResolver;
import android.content.Context;

public abstract class cmj {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    protected cmj(String string, Object object) {
        this.b = string;
        this.c = object;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static cmj c(String string) {
        return new cmh(string, false);
    }

    public abstract Object a();
}

