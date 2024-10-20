/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class bee
implements bcc {
    public static final String a = bbi.b("CommandHandler");
    public final Context b;
    public final Map c;
    public final Object d;
    public final bcs e;

    public bee(Context context, bcs bcs2) {
        this.b = context;
        this.e = bcs2;
        this.c = new HashMap();
        this.d = new Object();
    }

    static Intent b(Context context) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_CONSTRAINTS_CHANGED");
        return context;
    }

    static Intent c(Context context, bgs bgs2) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_DELAY_MET");
        bee.f((Intent)context, bgs2);
        return context;
    }

    public static Intent d(Context context, bgs bgs2) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_SCHEDULE_WORK");
        bee.f((Intent)context, bgs2);
        return context;
    }

    static bgs e(Intent intent) {
        return new bgs(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, bgs bgs2) {
        intent.putExtra("KEY_WORKSPEC_ID", bgs2.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", bgs2.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(bgs object, boolean bl2) {
        Object object2 = this.d;
        synchronized (object2) {
            beh beh2 = (beh)this.c.remove(object);
            this.e.c((bgs)object);
            if (beh2 != null) {
                bej bej2;
                Intent intent;
                bbi.a();
                Objects.toString(beh2.c);
                beh2.a();
                if (bl2) {
                    intent = bee.d(beh2.a, beh2.c);
                    object = beh2.g;
                    bej2 = new bej(beh2.d, intent, beh2.b);
                    object.execute(bej2);
                }
                if (beh2.i) {
                    intent = bee.b(beh2.a);
                    object = beh2.g;
                    bej2 = new bej(beh2.d, intent, beh2.b);
                    object.execute(bej2);
                }
            }
            return;
        }
    }
}

