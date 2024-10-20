/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iun
 */
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

public final class iul
extends ius
implements Closeable {
    public final iut a;
    public ScheduledFuture b;
    private final ius h;
    private ArrayList i;
    private ium j;
    private Throwable k;
    private boolean l;

    public iul(ius ius2) {
        super(ius2, ius2.f);
        this.a = ius2.b();
        this.h = new ius(this, this.f);
    }

    public iul(ius ius2, iut iut2) {
        super(ius2, ius2.f);
        this.a = iut2;
        this.h = new ius(this, this.f);
    }

    @Override
    public final ius a() {
        return this.h.a();
    }

    @Override
    public final iut b() {
        return this.a;
    }

    @Override
    public final Throwable c() {
        if (((ius)this).i()) {
            return this.k;
        }
        return null;
    }

    @Override
    public final void close() {
        this.j(null);
    }

    @Override
    public final void d(ium ium2, Executor executor) {
        a.s(executor, "executor");
        this.e(new iuo(executor, ium2, this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(iuo object) {
        synchronized (this) {
            if (((ius)this).i()) {
                ((iuo)object).a();
            } else {
                ArrayList<iuo> arrayList = this.i;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.i = arrayList;
                    arrayList.add((iuo)object);
                    object = this.e;
                    if (object != null) {
                        this.j = arrayList = new jin((Object)this, 1);
                        arrayList = new iuo((Executor)iun.a, this.j, (ius)this);
                        ((iul)object).e((iuo)((Object)arrayList));
                    }
                } else {
                    arrayList.add((iuo)object);
                }
            }
            return;
        }
    }

    @Override
    public final void f(ius ius2) {
        this.h.f(ius2);
    }

    @Override
    public final void g(ium ium2) {
        this.h(ium2, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(ium object, ius ius2) {
        synchronized (this) {
            Object object2 = this.i;
            if (object2 != null) {
                int n2;
                int n3 = ((ArrayList)object2).size();
                while ((n2 = n3 - 1) >= 0) {
                    object2 = (iuo)this.i.get(n2);
                    n3 = n2;
                    if (((iuo)object2).a != object) continue;
                    n3 = n2;
                    if (((iuo)object2).b != ius2) continue;
                    this.i.remove(n2);
                    break;
                }
                if (this.i.isEmpty()) {
                    object = this.e;
                    if (object != null) {
                        ((iul)object).h(this.j, (ius)object);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final boolean i() {
        // MONITORENTER : this
        if (this.l) {
            // MONITOREXIT : this
            return true;
        }
        // MONITOREXIT : this
        if (!super.i()) return false;
        this.j(super.c());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(Throwable object) {
        iuo iuo2;
        Object object2;
        int n2;
        // MONITORENTER : this
        boolean bl2 = this.l;
        int n3 = 0;
        if (!bl2) {
            n2 = 1;
            this.l = true;
            object2 = this.b;
            if (object2 != null) {
                this.b = null;
            } else {
                object2 = null;
            }
            this.k = object;
        } else {
            n2 = 0;
            object2 = null;
        }
        // MONITOREXIT : this
        if (object2 != null) {
            object2.cancel(false);
        }
        if (n2 == 0) return;
        // MONITORENTER : this
        object2 = this.i;
        if (object2 == null) {
            // MONITOREXIT : this
            return;
        }
        object = this.j;
        this.j = null;
        this.i = null;
        // MONITOREXIT : this
        int n4 = object2.size();
        for (n2 = 0; n2 < n4; ++n2) {
            iuo2 = (iuo)object2.get(n2);
            if (iuo2.b != this) continue;
            iuo2.a();
        }
        n4 = object2.size();
        n2 = n3;
        while (true) {
            if (n2 >= n4) {
                object2 = this.e;
                if (object2 == null) return;
                ((iul)object2).h((ium)object, (ius)object2);
                return;
            }
            iuo2 = (iuo)object2.get(n2);
            if (iuo2.b != this) {
                iuo2.a();
            }
            ++n2;
        }
    }
}

