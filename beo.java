/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 */
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

final class beo {
    public final ComponentName a;
    public final boolean b;

    static {
        bbi.b("SystemJobInfoConverter");
    }

    public beo(Context context, boolean bl2) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.b = bl2;
    }
}

