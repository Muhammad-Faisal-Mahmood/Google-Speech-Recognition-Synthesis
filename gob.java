/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gob {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReferenceQueue b = new ReferenceQueue();
    public final ExecutorService c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public gob(ExecutorService executorService) {
        this.c = executorService;
    }
}

