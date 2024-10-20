/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 */
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;
import java.util.concurrent.Callable;

final class bed {
    public static final int a = 0;

    static {
        bbi.b("Alarms");
    }

    public static void a(Context context, bgs bgs2, int n2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        if ((context = PendingIntent.getService((Context)context, (int)n2, (Intent)bee.c(context, bgs2), (int)0x24000000)) != null && alarmManager != null) {
            bbi.a();
            Objects.toString(bgs2);
            alarmManager.cancel((PendingIntent)context);
        }
    }

    public static void b(Context context, WorkDatabase object, bgs bgs2, long l2) {
        bgn bgn2 = ((WorkDatabase)object).w();
        Object object2 = ass.d(bgn2, bgs2);
        if (object2 != null) {
            bed.a(context, bgs2, ((bgm)object2).c);
            bed.c(context, bgs2, ((bgm)object2).c, l2);
            return;
        }
        object2 = new bzb((WorkDatabase)object, null);
        object = ((bzb)object2).a;
        object2 = new bdr(object2, 3);
        object = ((aum)object).e((Callable)object2);
        jse.d(object, "workDatabase.runInTransa\u2026NAGER_ID_KEY) }\n        )");
        int n2 = ((Number)object).intValue();
        bgn2.a(AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.e(bgs2, n2));
        bed.c(context, bgs2, n2, l2);
    }

    private static void c(Context context, bgs bgs2, int n2, long l2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService((Context)context, (int)n2, (Intent)bee.c(context, bgs2), (int)0xC000000);
        if (alarmManager != null) {
            alarmManager.setExact(0, l2, (PendingIntent)context);
        }
    }
}

