/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class cra
implements cqz {
    private final Map b = new ConcurrentHashMap();
    private final cqx c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile cqv f;

    public cra(cqx cqx2) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = cqx2;
        this.f = cqv.a;
    }

    @Override
    public final void a() {
        this.e.getAndIncrement();
    }

    @Override
    public final void b() {
        this.d.getAndIncrement();
    }

    @Override
    public final void c(long l2) {
        Object object = (cqw)this.b.remove(l2);
        if (object != null) {
            int n2 = ((cqw)object).a;
            object = StrictMode.allowThreadDiskReads();
            try {
                Object object2 = new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", n2));
                object2 = cqu.a((File)object2);
                if (object2 != cqv.a) {
                    object = this.f;
                    this.f = new cqv(((cqv)object).b + ((cqv)object2).b, ((cqv)object).c + ((cqv)object2).c, ((cqv)object).d + ((cqv)object2).d);
                    return;
                }
            }
            finally {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object);
            }
        }
    }

    @Override
    public final void d(long l2) {
        Object object = this.b;
        Long l3 = l2;
        if (object.containsKey(l3)) {
            return;
        }
        Map map = this.b;
        object = Thread.currentThread();
        map.put(l3, new cqw(Process.myTid(), l2, ((Thread)object).getName(), this.c.a));
    }
}

