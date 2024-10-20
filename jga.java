/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class jga
extends jdv {
    public static final Logger b;
    private static final ReferenceQueue c;
    private static final ConcurrentMap d;
    private final jfz e;

    static {
        c = new ReferenceQueue();
        d = new ConcurrentHashMap();
        b = Logger.getLogger(jga.class.getName());
    }

    public jga(iwk iwk2) {
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        super(iwk2);
        this.e = new jfz(this, iwk2, referenceQueue, concurrentMap);
    }

    @Override
    public final void d() {
        int n2 = jfz.b;
        Object object = this.e;
        if (!((jfz)object).a.getAndSet(true)) {
            ((jfz)object).clear();
        }
        object = this.a;
        jfs jfs2 = (jfs)object;
        jfs2.G.a(1, "shutdown() called");
        if (!jfs2.A.compareAndSet(false, true)) {
            return;
        }
        jfs2.m.execute(new jel(object, 8));
        jfp jfp2 = jfs2.I;
        jfp2.c.m.execute(new jel(jfp2, 11));
        jfs2.m.execute(new jel(object, 7));
    }
}

