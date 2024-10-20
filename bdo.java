/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;

public final class bdo
extends avp {
    private final Context c;

    public bdo(Context context) {
        jse.e(context, "context");
        super(9, 10);
        this.c = context;
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long l2 = 0L;
            long l3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                l2 = 1L;
            }
            awl2.d();
            awl2.l(new Object[]{"last_cancel_all_time_ms", l3});
            awl2.l(new Object[]{"reschedule_needed", l2});
            sharedPreferences.edit().clear().apply();
            awl2.h();
        }
        sharedPreferences = this.c;
        jse.e(sharedPreferences, "context");
        sharedPreferences = sharedPreferences.getSharedPreferences("androidx.work.util.id", 0);
        if (!sharedPreferences.contains("next_job_scheduler_id") && !sharedPreferences.contains("next_job_scheduler_id")) {
            return;
        }
        int n2 = sharedPreferences.getInt("next_job_scheduler_id", 0);
        int n3 = sharedPreferences.getInt("next_alarm_manager_id", 0);
        awl2.d();
        try {
            awl2.l(new Object[]{"next_job_scheduler_id", n2});
            awl2.l(new Object[]{"next_alarm_manager_id", n3});
            sharedPreferences.edit().clear().apply();
            awl2.h();
            return;
        }
        finally {
            awl2.f();
        }
    }
}

