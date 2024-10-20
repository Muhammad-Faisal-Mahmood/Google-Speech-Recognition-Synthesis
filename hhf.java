/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

public final class hhf
extends hgw {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile hfv g;

    static {
        boolean bl2;
        block4: {
            block3: {
                String string = Build.FINGERPRINT;
                boolean bl3 = false;
                bl2 = string == null || "robolectric".equals(Build.FINGERPRINT);
                a = bl2;
                bl2 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
                b = bl2;
                if ("eng".equals(Build.TYPE)) break block3;
                bl2 = bl3;
                if (!"userdebug".equals(Build.TYPE)) break block4;
            }
            bl2 = true;
        }
        c = bl2;
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public hhf(String string) {
        super(string);
        if (!a && !b) {
            if (c) {
                hhh hhh2 = hhj.c;
                string = hhh2.a;
                int n2 = hhh2.f;
                this.g = new hhh(2, Level.OFF, hhh2.c, hhh2.d, hhh2.e).a(this.d());
                return;
            }
            this.g = null;
            return;
        }
        this.g = new hgx().a(this.d());
    }

    public static void e() {
        hhf hhf2;
        while ((hhf2 = (hhf)hhe.a.poll()) != null) {
            hhf2.g = ((hgy)d.get()).a(hhf2.d());
        }
        hhf.f();
    }

    private static void f() {
        Object object;
        while ((object = (hth)f.poll()) != null) {
            Level level;
            e.getAndDecrement();
            Object object2 = ((hth)object).a;
            object = ((hth)object).b;
            if (!object2.N() && !((hfv)object).c(level = object2.o())) continue;
            ((hfv)object).b((hfu)object2);
        }
    }

    @Override
    public final void a(RuntimeException runtimeException, hfu hfu2) {
        if (this.g != null) {
            this.g.a(runtimeException, hfu2);
            return;
        }
        Log.e((String)"ProxyAndroidLoggerBackend", (String)"Internal logging error before configuration", (Throwable)runtimeException);
    }

    @Override
    public final void b(hfu hfu2) {
        if (this.g != null) {
            this.g.b(hfu2);
            return;
        }
        if (e.incrementAndGet() > 20L) {
            f.poll();
            Log.w((String)"ProxyAndroidLoggerBackend", (String)"Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new hth(this, hfu2));
        if (this.g != null) {
            hhf.f();
        }
    }

    @Override
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
        {
        }
    }
}

