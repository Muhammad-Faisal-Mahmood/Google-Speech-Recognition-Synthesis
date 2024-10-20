/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dru
implements Closeable {
    static final dru a = new dru("", SystemClock.elapsedRealtime(), -1L, Thread.currentThread().getId(), 3);
    public String b;
    public final long c;
    long d;
    final long e;
    public volatile List f;
    final int g;
    final int h;

    public dru(String string, long l2, int n2) {
        this(string, SystemClock.elapsedRealtime(), -1L, l2, n2);
    }

    public dru(String string, long l2, long l3, long l4, int n2) {
        this.b = string;
        this.g = 1;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.h = n2;
        if (n2 == 1) {
            this.f = DesugarCollections.synchronizedList(new ArrayList());
            return;
        }
        this.f = Collections.emptyList();
    }

    public final long a() {
        long l2 = this.d;
        if (l2 == -1L) {
            return -1L;
        }
        return l2 - this.c;
    }

    public final void b(List list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    final boolean c() {
        return this.h == 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void close() {
        Object object;
        if (this.equals(a)) return;
        if (this.d < 0L) {
            this.d = SystemClock.elapsedRealtime();
        }
        if ((object = (dsa)dsd.c.get()) == null) return;
        if (this != (dru)((dsa)object).c().poll()) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 174, "Tracer.java")).r("Incorrect Span passed. Ignore...");
            return;
        }
        if (this.a() < (long)dsd.a) return;
        if (((dsa)object).b() < dsd.b) {
            if ((object = (dru)((dsa)object).c().peek()) != null) {
                if (((dru)object).f == Collections.EMPTY_LIST) {
                    ((dru)object).f = new ArrayList();
                }
                if (((dru)object).f == null) return;
                ((dru)object).f.add(this);
                return;
            }
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "linkToParent", 108, "TraceData.java")).u("null Parent for Span: %s", this.b);
            return;
        }
        ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 183, "Tracer.java")).s("Dropping trace as max buffer size is hit. Size: %d", ((dsa)object).a());
        dsd.c.set(null);
    }
}

