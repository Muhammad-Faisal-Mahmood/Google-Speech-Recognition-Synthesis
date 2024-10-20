/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
import android.net.TrafficStats;

public final class krm
implements Runnable {
    public final int a;
    public final boolean b;
    public final int c;
    public final Runnable d;

    public /* synthetic */ krm(int n2, boolean bl2, int n3, Runnable runnable) {
        this.a = n2;
        this.b = bl2;
        this.c = n3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int n2;
        block4: {
            n2 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag((int)this.a);
            Runnable runnable = this.d;
            boolean bl2 = this.b;
            if (bl2) {
                kpp.b(this.c);
            }
            try {
                runnable.run();
                if (!bl2) break block4;
            }
            catch (Throwable throwable) {
                if (bl2) {
                    kpp.a();
                }
                TrafficStats.setThreadStatsTag((int)n2);
                throw throwable;
            }
            kpp.a();
        }
        TrafficStats.setThreadStatsTag((int)n2);
    }
}

