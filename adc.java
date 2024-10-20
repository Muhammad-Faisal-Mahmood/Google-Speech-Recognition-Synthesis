/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public class adc {
    public int d;
    public final Context e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public boolean i = false;
    public acw j;

    public adc(Context context) {
        this.e = context.getApplicationContext();
    }

    public static final String e(Object object) {
        StringBuilder stringBuilder = new StringBuilder(64);
        if (object == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(object.getClass().getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public void d() {
        throw null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" id=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

