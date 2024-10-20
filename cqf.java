/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

public final class cqf
implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new ov();
    private final int d;

    public cqf(int n2) {
        this.d = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Thread newThread(Runnable runnable) {
        Object object = this.a;
        synchronized (object) {
            cqe cqe2 = new cqe(this.d, runnable);
            this.b.add(cqe2);
            cqe2.a = runnable = new ckr((Object)this, (Object)cqe2, 16, null);
            cqe2.b = runnable = new ckr((Object)this, (Object)cqe2, 17, null);
            return cqe2;
        }
    }
}

