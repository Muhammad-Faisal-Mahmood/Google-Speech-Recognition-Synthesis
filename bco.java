/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class bco
extends avp {
    private final Context c;

    public bco(Context context, int n2, int n3) {
        jse.e(context, "mContext");
        super(n2, n3);
        this.c = context;
    }

    @Override
    public final void a(awl awl2) {
        if (this.b >= 10) {
            awl2.l(new Object[]{"reschedule_needed", 1});
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}

