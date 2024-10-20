/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class afu {
    public final afl a;
    public final afp b;
    public final afs c;
    public final CopyOnWriteArraySet d;
    public boolean e;
    private final ArrayDeque f;
    private final ArrayDeque g;
    private final Object h;
    private boolean i;

    public afu(Looper looper, afl afl2, afs afs2) {
        this(new CopyOnWriteArraySet(), looper, afl2, afs2, true);
    }

    public afu(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, afl afl2, afs afs2, boolean bl2) {
        this.a = afl2;
        this.d = copyOnWriteArraySet;
        this.c = afs2;
        this.h = new Object();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.b = afl2.b(looper, new afq(this, 0));
        this.e = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            if (this.i) {
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = this.d;
            aft aft2 = new aft(object);
            copyOnWriteArraySet.add(aft2);
            return;
        }
    }

    public final void b() {
        this.f();
        if (!this.g.isEmpty()) {
            if (!this.b.b()) {
                afp afp2 = this.b;
                afp2.g(afp2.e(1));
            }
            boolean bl2 = this.f.isEmpty();
            this.f.addAll(this.g);
            this.g.clear();
            if (bl2) {
                while (!this.f.isEmpty()) {
                    ((Runnable)this.f.peekFirst()).run();
                    this.f.removeFirst();
                }
            }
        }
    }

    public final void c(int n2, afr object) {
        this.f();
        object = new mp(new CopyOnWriteArraySet(this.d), n2, object, 3);
        this.g.add(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        this.f();
        Object object = this.h;
        synchronized (object) {
            this.i = true;
        }
        Iterator iterator = this.d.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.d.clear();
                return;
            }
            ((aft)iterator.next()).a(this.c);
        }
    }

    public final void e(int n2, afr afr2) {
        this.c(n2, afr2);
        this.b();
    }

    public final void f() {
        if (!this.e) {
            return;
        }
        afp afp2 = this.b;
        boolean bl2 = Thread.currentThread() == ((agd)afp2).b.getLooper().getThread();
        abr.f(bl2);
    }
}

