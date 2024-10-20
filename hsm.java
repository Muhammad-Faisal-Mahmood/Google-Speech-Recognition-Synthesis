/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Queue;

public final class hsm
extends itz {
    public final Object a;
    public final Queue b;
    public itz c;
    final itx d;
    final ixb e;
    final itw f;

    public hsm(itx itx2, ixb ixb2, itw itw2) {
        this.d = itx2;
        this.e = ixb2;
        this.f = itw2;
        this.a = new Object();
        this.b = new ArrayDeque();
        this.c = itx2.a(ixb2, itw2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(fvc fvc2, iwx iwx2) {
        Object object = this.a;
        synchronized (object) {
            Object object2 = new iwx();
            ((iwx)object2).f(iwx2);
            Object object3 = this.b;
            hst hst2 = new hst(this, (Object)fvc2, object2, 1);
            object3.add(hst2);
            object3 = this.b();
            object2 = new hsl(this, fvc2);
            ((itz)object3).a((fvc)object2, iwx2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final itz b() {
        Object object = this.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(String string, Throwable throwable) {
        Object object = this.a;
        synchronized (object) {
            Queue queue = this.b;
            fbx fbx2 = new fbx(this, string, throwable, 20, null);
            queue.add(fbx2);
            this.b().c(string, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        Object object = this.a;
        synchronized (object) {
            Queue queue = this.b;
            gjf gjf2 = new gjf(this, 17);
            queue.add(gjf2);
            this.b().d();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(int n2) {
        Object object = this.a;
        synchronized (object) {
            Queue queue = this.b;
            cdw cdw2 = new cdw((Object)this, n2, 5, null);
            queue.add(cdw2);
            this.b().e(n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            Queue queue = this.b;
            hsk hsk2 = new hsk(this, object, 0);
            queue.add(hsk2);
            this.b().f(object);
            return;
        }
    }
}

