/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class hrj {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public ScheduledExecutorService e;
    public String f;
    public gui g;
    public hrc h;
    public Integer i;
    public Integer j;
    public long k;
    public int l;
    public long m;
    public long n;
    public byte o;
    public fvc p;

    public final void a(long l2) {
        this.m = l2;
        this.o = (byte)(this.o | 4);
    }

    public final void b(long l2) {
        this.n = l2;
        this.o = (byte)(this.o | 8);
    }

    public final void c(int n2) {
        this.l = n2;
        this.o = (byte)(this.o | 2);
    }

    public final void d(gui gui2) {
        if (gui2 != null) {
            this.g = gui2;
            return;
        }
        throw new NullPointerException("Null recordNetworkMetricsToPrimes");
    }
}

