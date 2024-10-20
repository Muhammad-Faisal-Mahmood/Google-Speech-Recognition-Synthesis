/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Process
 *  hom
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

public class gaw
extends Service {
    private hpn a = hhk.K(null);
    private int b = -1;

    protected final void dump(FileDescriptor object, PrintWriter printWriter, String[] stringArray) {
        object = ((gav)idi.e((Object)this.getApplicationContext(), gav.class)).r().e.entrySet().iterator();
        while (object.hasNext()) {
            printWriter.println((String)((Map.Entry)object.next()).getValue());
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        if (!this.a.isDone()) {
            gay gay2 = ((gav)idi.e(this.getApplicationContext(), gav.class)).r();
            int n2 = this.b;
            int n3 = gay.a(gay2.c.get());
            if (n2 == n3) {
                long l2;
                while ((n2 = gay.a(l2 = gay2.c.get())) == n3 && !gay2.c.compareAndSet(l2, gay.a(n2 + 1))) {
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent intent, int n2, int n3) {
        if ((n2 & 2) == 0 && intent != null) {
            gay gay2 = ((gav)idi.e(this.getApplicationContext(), gav.class)).r();
            fxf.v(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            fxf.v(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            fxf.v(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            Object object = gay2.h;
            long l2 = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long l3 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (((UUID)object).getMostSignificantBits() == l2 && gay2.h.getLeastSignificantBits() == l3) {
                n2 = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                Object object2 = gay2.d;
                synchronized (object2) {
                    object = (hqa)gay2.f.get(n2);
                    fxf.K(object);
                    if (object != gay.b) {
                        gay2.g.put(n2, object);
                    }
                    gay2.f.remove(n2);
                }
            } else {
                ((heg)((heg)gay.a.f()).j("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).v("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                object = hhk.K(null);
            }
            this.a = object;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.c(new cdw((Object)this, n3, 4, null), (Executor)hom.a);
        return 2;
    }
}

