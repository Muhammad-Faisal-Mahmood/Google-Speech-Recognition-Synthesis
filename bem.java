/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Looper
 *  android.os.PowerManager$WakeLock
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class bem
implements bcc {
    public static final String a = bbi.b("SystemAlarmDispatcher");
    final Context b;
    public final bir c;
    public final bcn d;
    public final bdn e;
    final bee f;
    final List g;
    Intent h;
    public bek i;
    final czh j;
    public final bxt k;
    private final bcs l;

    public bem(Context object) {
        bcs bcs2;
        Object object2 = object.getApplicationContext();
        this.b = object2;
        this.l = bcs2 = abr.m();
        object = bdn.i(object);
        this.e = object;
        AmbientMode$AmbientCallback ambientMode$AmbientCallback = object.c.p;
        this.f = new bee((Context)object2, bcs2);
        this.c = new bir(object.c.e);
        object2 = object.f;
        this.d = object2;
        object = object.k;
        this.j = object;
        this.k = new bxt((bcn)object2, (czh)object);
        ((bcn)object2).a(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @Override
    public final void a(bgs object, boolean bl2) {
        Intent intent = new Intent(this.b, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", bl2);
        bee.f(intent, (bgs)object);
        object = new bej(this, intent, 0);
        this.j.c.execute((Runnable)object);
    }

    public final void b() {
        bbi.a();
        this.d.b(this);
        this.i = null;
    }

    public final void c() {
        bem.e();
        PowerManager.WakeLock wakeLock = bik.a(this.b, "ProcessCommand");
        try {
            wakeLock.acquire();
            czh czh2 = this.e.k;
            bei bei2 = new bei(this);
            czh2.a(bei2);
            return;
        }
        finally {
            wakeLock.release();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Intent intent, int n2) {
        bbi.a();
        Objects.toString(intent);
        bem.e();
        Object object = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)object)) {
            bbi.a().f(a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(object)) {
            bem.e();
            object = this.g;
            synchronized (object) {
                Iterator iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    if (!"ACTION_CONSTRAINTS_CHANGED".equals(((Intent)iterator.next()).getAction())) continue;
                    return;
                }
            }
        }
        intent.putExtra("KEY_START_ID", n2);
        object = this.g;
        synchronized (object) {
            boolean bl2 = this.g.isEmpty();
            this.g.add(intent);
            if (bl2) {
                this.c();
            }
            return;
        }
    }
}

