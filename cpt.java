/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;

public final class cpt
implements ThreadFactory {
    public final HashSet a = new HashSet();
    private final ThreadFactory b;

    public cpt(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList a() {
        HashSet hashSet = this.a;
        synchronized (hashSet) {
            return new ArrayList(this.a);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Thread newThread(Runnable object) {
        Thread thread = this.b.newThread((Runnable)(object = new ckr((Object)this, object, 15, null)));
        if (thread == null) return thread;
        object = this.a;
        synchronized (object) {
            this.a.add(thread);
            return thread;
        }
    }
}

