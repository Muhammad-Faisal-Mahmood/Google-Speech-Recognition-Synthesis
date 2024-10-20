/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 */
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

public final class bin
implements jqz {
    public final bio a;
    public final UUID b;
    public final bay c;
    public final Context d;

    public /* synthetic */ bin(bio bio2, UUID uUID, bay bay2, Context context) {
        this.a = bio2;
        this.b = uUID;
        this.c = bay2;
        this.d = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        Object object = this.b;
        Object object2 = this.a;
        Object object3 = ((bio)object2).b;
        String string = ((UUID)object).toString();
        if ((object3 = object3.b(string)) != null && !((bhd)object3).c.a()) {
            Object object4 = ((bio)object2).a;
            object = ((bcn)object4).j;
            synchronized (object) {
                bbi.a().e(bcn.a, a.aj(string, "Moving WorkSpec (", ") to the foreground"));
                dhl dhl2 = (dhl)((bcn)object4).f.remove(string);
                object2 = this.c;
                if (dhl2 != null) {
                    Object object5;
                    if (((bcn)object4).b == null) {
                        ((bcn)object4).b = object5 = bik.a(((bcn)object4).c, "ProcessorForegroundLck");
                        ((bcn)object4).b.acquire();
                    }
                    ((bcn)object4).e.put(string, dhl2);
                    string = ((bcn)object4).c;
                    object5 = dhl2.g();
                    dhl2 = new Intent((Context)string, SystemForegroundService.class);
                    dhl2.setAction("ACTION_START_FOREGROUND");
                    dhl2.putExtra("KEY_WORKSPEC_ID", object5.a);
                    dhl2.putExtra("KEY_GENERATION", object5.b);
                    dhl2.putExtra("KEY_NOTIFICATION_ID", ((bay)object2).a);
                    dhl2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((bay)object2).b);
                    dhl2.putExtra("KEY_NOTIFICATION", (Parcelable)((bay)object2).c);
                    ag$$ExternalSyntheticApiModelOutline0.m(((bcn)object4).c, (Intent)dhl2);
                }
            }
            object = this.d;
            object4 = AmbientLifecycleObserverKt.o((bhd)object3);
            object3 = new Intent((Context)object, SystemForegroundService.class);
            object3.setAction("ACTION_NOTIFY");
            object3.putExtra("KEY_NOTIFICATION_ID", ((bay)object2).a);
            object3.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((bay)object2).b);
            object3.putExtra("KEY_NOTIFICATION", (Parcelable)((bay)object2).c);
            object3.putExtra("KEY_WORKSPEC_ID", ((bgs)object4).a);
            object3.putExtra("KEY_GENERATION", ((bgs)object4).b);
            object.startService((Intent)object3);
            return null;
        }
        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}

