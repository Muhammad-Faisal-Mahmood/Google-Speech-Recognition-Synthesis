/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.MessageQueue$IdleHandler
 *  android.os.SystemClock
 *  android.util.Log
 */
import J.N;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

final class knh
extends kng
implements MessageQueue.IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private final void c() {
        if (TraceEvent.a && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)this);
            this.f = true;
            return;
        }
        if (this.f && !TraceEvent.a) {
            Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler)this);
            this.f = false;
        }
    }

    private static void d(int n2, String string) {
        if (TraceEvent.a) {
            N.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", string);
        }
        Log.println((int)n2, (String)"TraceEvt_LooperMonitor", (String)string);
    }

    @Override
    public final void a(String string) {
        if (this.e == 0) {
            TraceEvent.d();
        }
        this.b = SystemClock.elapsedRealtime();
        this.c();
        super.a(string);
    }

    @Override
    public final void b(String string) {
        long l2 = SystemClock.elapsedRealtime() - this.b;
        if (l2 > 16L) {
            StringBuilder stringBuilder = new StringBuilder("observed a task that took ");
            stringBuilder.append(l2);
            stringBuilder.append("ms: ");
            stringBuilder.append(string);
            knh.d(5, stringBuilder.toString());
        }
        super.b(string);
        this.c();
        ++this.c;
        ++this.e;
    }

    public final boolean queueIdle() {
        long l2;
        long l3 = SystemClock.elapsedRealtime();
        long l4 = l2 = this.a;
        if (l2 == 0L) {
            this.a = l3;
            l4 = l3;
        }
        l4 = l3 - l4;
        ++this.d;
        int n2 = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(" tasks since last idle.");
        TraceEvent.b("Looper.queueIdle", stringBuilder.toString());
        if (l4 > 48L) {
            n2 = this.c;
            int n3 = this.d;
            int n4 = this.e;
            stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(" tasks and ");
            stringBuilder.append(n3);
            stringBuilder.append(" idles processed so far, ");
            stringBuilder.append(n4);
            stringBuilder.append(" tasks bursted and ");
            stringBuilder.append(l4);
            stringBuilder.append("ms elapsed since last idle");
            knh.d(3, stringBuilder.toString());
        }
        this.a = l3;
        this.e = 0;
        return true;
    }
}

