/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class jam
extends kmp {
    public final AtomicReference a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();

    public jam() {
        super(null);
        this.a = new AtomicReference<Object>(null);
    }

    @Override
    public final void W() {
        jaj jaj2 = new jaj(3);
        this.b.offer(jaj2);
        this.j();
    }

    @Override
    public final void X() {
        jaj jaj2 = new jaj(0);
        this.b.offer(jaj2);
        this.j();
    }

    @Override
    public final void e() {
        jaj jaj2 = new jaj(1);
        this.b.offer(jaj2);
        this.j();
    }

    @Override
    public final void f(Object object) {
        object = new jak(object);
        this.b.offer(object);
        this.j();
    }

    @Override
    public final void g() {
        jaj jaj2 = new jaj(2);
        this.b.offer(jaj2);
        this.j();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        kmp kmp2 = (kmp)this.a.get();
        if (kmp2 == null) {
            return;
        }
        synchronized (this) {
            jal jal2;
            while ((jal2 = (jal)this.b.poll()) != null) {
                jal2.a(kmp2);
            }
            return;
        }
    }
}

