/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;

public final class ils
implements imb {
    private final jnu a;

    public ils(jnu jnu2) {
        this.a = jnu2;
    }

    public static void c(Activity activity) {
        if (activity != null) {
            return;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }

    public final Activity a() {
        Activity activity = (Activity)((imc)this.a).a;
        ils.c(activity);
        return activity;
    }
}

