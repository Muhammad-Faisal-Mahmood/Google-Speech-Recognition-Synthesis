/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class kge {
    public final ArrayDeque a;
    public final ArrayDeque b;
    private int c;
    private int d;
    private ExecutorService e;
    private final ArrayDeque f;

    public kge() {
        this.c = 64;
        this.d = 5;
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public kge(ExecutorService executorService) {
        jse.e(executorService, "executorService");
        this();
        this.e = executorService;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void g(Deque object, Object object2) {
        synchronized (this) {
            void var2_2;
            boolean bl2 = object.remove(var2_2);
            if (bl2) {
                // MONITOREXIT @DISABLED, blocks:[2, 3] lbl4 : MonitorExitStatement: MONITOREXIT : this
                this.e();
                return;
            }
            object = new AssertionError((Object)"Call wasn't in-flight!");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService a() {
        synchronized (this) {
            SynchronousQueue<Runnable> synchronousQueue;
            if (this.e == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                synchronousQueue = new SynchronousQueue<Runnable>();
                String string = String.valueOf(khb.e);
                kha kha2 = new kha(string.concat(" Dispatcher"), false);
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, kha2);
                this.e = threadPoolExecutor;
            }
            synchronousQueue = this.e;
            jse.b(synchronousQueue);
            return synchronousQueue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(khp khp2) {
        synchronized (this) {
            this.f.add(khp2);
            return;
        }
    }

    public final void c(khm khm2) {
        khm2.a.decrementAndGet();
        this.g(this.b, khm2);
    }

    public final void d(khp khp2) {
        this.g(this.f, khp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object = khb.a;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        synchronized (this) {
            Iterator iterator = this.a.iterator();
            jse.d(iterator, "iterator(...)");
            while (iterator.hasNext()) {
                object = (khm)iterator.next();
                if (this.b.size() >= this.c) break;
                if (object.a.get() >= this.d) continue;
                iterator.remove();
                object.a.incrementAndGet();
                jse.b(object);
                arrayList.add((byte[])object);
                this.b.add(object);
            }
            this.f();
        }
        int n2 = arrayList.size();
        int n3 = 0;
        while (n3 < n2) {
            ((khm)arrayList.get(n3)).b(this.a());
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            this.b.size();
            this.f.size();
            return;
        }
    }
}

