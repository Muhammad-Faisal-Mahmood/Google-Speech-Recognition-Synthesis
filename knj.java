/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.MessageQueue$IdleHandler
 *  android.os.SystemClock
 */
import J.N;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

public final class knj
implements MessageQueue.IdleHandler {
    public static boolean a;
    public static knj b;
    private long c;

    public static void a() {
        PostTask.b(new gni(10));
    }

    public final boolean queueIdle() {
        long l2 = SystemClock.elapsedRealtime();
        long l3 = this.c;
        if (l3 == 0L || l2 - l3 > 1000L) {
            this.c = l2;
            if (TraceEvent.a && N.MnfJQqTB()) {
                TraceEvent.b("instantAndroidViewHierarchy", null);
                ApplicationStatus.b();
                ArrayList arrayList = new ArrayList();
                if (arrayList.isEmpty()) {
                    TraceEvent.d();
                } else {
                    l2 = arrayList.hashCode();
                    PostTask.a(0, new knf(l2, arrayList, 0));
                    TraceEvent.c(l2);
                }
            }
        }
        return true;
    }
}

