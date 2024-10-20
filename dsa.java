/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class dsa {
    public final AtomicInteger a = new AtomicInteger(0);
    public final dru b;
    public final Map c = new ConcurrentHashMap();
    public final List d;
    private final ThreadLocal e = new drz(this);

    public dsa() {
        this.d = new ArrayList();
        this.b = new dru("", Thread.currentThread().getId(), 2);
    }

    public final int a() {
        return this.a.get();
    }

    public final int b() {
        return this.a.incrementAndGet();
    }

    public final ArrayDeque c() {
        return (ArrayDeque)((WeakReference)this.e.get()).get();
    }
}

