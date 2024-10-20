/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import J.N;
import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;

public class knt
implements knr {
    public static final ReferenceQueue a = new ReferenceQueue();
    private static final Set h = new HashSet();
    public final int b;
    public final String c;
    public volatile long d;
    protected final Runnable e = new jhz(this, 9, null);
    public final Object f = new Object();
    public Queue g;
    private final int i;
    private boolean j;
    private List k;

    public knt(int n2) {
        this(n2, "TaskRunnerImpl", 0);
        knt.d();
    }

    protected knt(int n2, String string, int n3) {
        this.b = n2;
        this.c = string.concat(".PreNativeTask.run");
        this.i = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d() {
        kns kns2;
        while ((kns2 = (kns)a.poll()) != null) {
            N.MERCiIV8(kns2.a);
            Set set = h;
            synchronized (set) {
                set.remove(kns2);
            }
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Runnable runnable) {
        Object object = PostTask.a;
        if (this.d != 0L) {
            N.MGnQU$47(this.d, runnable, 0L, runnable.getClass().getName());
            return;
        }
        object = this.f;
        synchronized (object) {
            if (!this.j) {
                this.j = true;
                AbstractCollection abstractCollection = PostTask.a;
                synchronized (abstractCollection) {
                    List list = PostTask.b;
                    if (list == null) {
                        // MONITOREXIT @DISABLED, blocks:[7, 8, 11, 12] lbl13 : MonitorExitStatement: MONITOREXIT : var3_3 /* !! */ 
                        this.b();
                    } else {
                        list.add(this);
                        // MONITOREXIT @DISABLED, blocks:[7, 8, 10, 12] lbl18 : MonitorExitStatement: MONITOREXIT : var3_3 /* !! */ 
                        this.g = abstractCollection = new AbstractCollection();
                        abstractCollection = new AbstractCollection();
                        this.k = abstractCollection;
                    }
                }
            }
            if (this.d != 0L) {
                N.MGnQU$47(this.d, runnable, 0L, runnable.getClass().getName());
                return;
            }
            this.g.add(runnable);
            this.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object;
        long l2 = N.M5_IQXaH(this.i, this.b);
        Object object2 = this.f;
        synchronized (object2) {
            Pair pair;
            object = this.g;
            if (object != null) {
                pair = object.iterator();
                while (pair.hasNext()) {
                    object = (Runnable)pair.next();
                    N.MGnQU$47(l2, object, 0L, object.getClass().getName());
                }
                this.g = null;
            }
            if ((object = this.k) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    pair = (Pair)object.next();
                    N.MGnQU$47(l2, (Runnable)pair.first, (Long)pair.second, pair.getClass().getName());
                }
                this.k = null;
            }
            this.d = l2;
        }
        object2 = h;
        synchronized (object2) {
            object = new kns(this);
            object2.add(object);
        }
        knt.d();
    }

    protected void c() {
        Executor executor = PostTask.d;
        PostTask.c.execute(this.e);
    }
}

