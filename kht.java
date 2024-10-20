/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class kht {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public kht(gui gui2, gui gui3, jnu jnu2) {
        this.a = SystemClock.uptimeMillis();
        this.b = gui2;
        this.d = gui3;
        this.c = jnu2;
    }

    public kht(khh khh2, TimeUnit timeUnit) {
        jse.e(khh2, "taskRunner");
        jse.e((Object)timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.b = khh2.a();
        this.c = new khs(this, String.valueOf(khb.e).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(kfs kfs2, khp khp2, List list, boolean bl2) {
        Iterator iterator = ((ConcurrentLinkedQueue)this.d).iterator();
        jse.d(iterator, "iterator(...)");
        while (iterator.hasNext()) {
            khr khr2 = (khr)iterator.next();
            jse.b(khr2);
            synchronized (khr2) {
                void var3_3;
                void var4_4;
                if ((var4_4 == false || khr2.i()) && khr2.h(kfs2, (List)var3_3)) {
                    void var2_2;
                    var2_2.e(khr2);
                    return true;
                }
            }
        }
        return false;
    }
}

