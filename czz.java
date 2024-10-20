/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class czz
implements fqm {
    public final csv a;
    public final AtomicLong b;
    final daa c;
    private final String d;

    public czz(daa daa2, String string, csv csv2) {
        this.c = daa2;
        this.b = new AtomicLong();
        this.d = string;
        this.a = csv2;
    }

    @Override
    public final void a(int n2) {
        this.b.getAndAdd(n2);
        cyr.l("%s: Received data for groupName = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, n2, this.b.get());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        synchronized (daa.class) {
            if (this.c.c.containsKey(this.d)) {
                Executor executor = this.c.a;
                cmw cmw2 = new cmw(this, 10);
                executor.execute(cmw2);
            }
            return;
        }
    }
}

