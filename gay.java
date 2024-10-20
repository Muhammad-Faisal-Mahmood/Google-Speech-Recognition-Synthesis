/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class gay {
    public static final hei a;
    public static final hqa b;
    public final AtomicLong c = new AtomicLong(0L);
    public final Object d = new Object();
    public final ConcurrentHashMap e = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final UUID h = UUID.randomUUID();

    static {
        hqa hqa2;
        a = hei.m("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
        b = hqa2 = new hqa();
        hqa2.m(new Object());
    }

    public static int a(long l2) {
        return (int)(l2 & 0xFFFFFFFFL);
    }
}

