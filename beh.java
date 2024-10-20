/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class beh
implements bew,
biq {
    public final Context a;
    public final int b;
    public final bgs c;
    public final bem d;
    public int e;
    public final Executor f;
    public final Executor g;
    public PowerManager.WakeLock h;
    public boolean i;
    public final juy j;
    public volatile jwi k;
    public final bzb l;
    public final bzb m;
    private final Object n;

    static {
        bbi.b("DelayMetCommandHandler");
    }

    public beh(Context object, int n2, bem object2, bzb bzb2) {
        this.a = object;
        this.b = n2;
        this.d = object2;
        this.c = (bgs)bzb2.a;
        this.m = bzb2;
        object = ((bem)object2).e.j;
        object2 = ((bem)object2).j;
        this.f = ((czh)object2).a;
        this.g = ((czh)object2).c;
        this.j = (juy)((czh)object2).d;
        this.l = new bzb((cya)object, null);
        this.i = false;
        this.e = 0;
        this.n = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.n;
        synchronized (object) {
            if (this.k != null) {
                this.k.r(null);
            }
            this.d.c.a(this.c);
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && wakeLock.isHeld()) {
                bbi.a();
                Objects.toString(this.h);
                Objects.toString(this.c);
                this.h.release();
            }
            return;
        }
    }

    @Override
    public final void b(bgs object) {
        bbi.a();
        Objects.toString(object);
        object = new akt(this, 15);
        this.f.execute((Runnable)object);
    }

    @Override
    public final void e(bhd bhd2, ass ass2) {
        if (ass2 instanceof beq) {
            this.f.execute(new akt(this, 16));
            return;
        }
        this.f.execute(new akt(this, 15));
    }
}

