/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

public final class jdf
implements jgf {
    public final Object a;
    public final iym b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public jge f;
    public Collection g;
    public volatile ksb h;
    private final ivn i = ivn.a(jdf.class, null);
    private final Executor j;

    public jdf(Executor executor, iym iym2) {
        this.a = new Object();
        this.g = new LinkedHashSet();
        this.h = new ksb((Object)null, (Object)null);
        this.j = executor;
        this.b = iym2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(iwf object) {
        int n2;
        ArrayList arrayList;
        Object object2;
        Object object3;
        Object object4 = this.a;
        synchronized (object4) {
            object3 = this.h;
            object2 = new ksb(object, ((ksb)object3).a);
            this.h = object2;
            if (object != null && this.e()) {
                arrayList = new ArrayList(this.g);
                // MONITOREXIT @DISABLED, blocks:[4, 14] lbl8 : MonitorExitStatement: MONITOREXIT : var4_2
                object2 = new ArrayList();
                n2 = arrayList.size();
            } else {
                return;
            }
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            jde jde2 = (jde)arrayList.get(i2);
            object4 = ((iwf)object).a(jde2.a);
            jcm jcm2 = jeb.c((iwb)object4, ((itw)(object3 = jde2.a.a)).h());
            if (jcm2 == null) continue;
            object4 = this.j;
            object3 = ((itw)object3).c;
            if (object3 != null) {
                object4 = object3;
            }
            object3 = jde2.p(jcm2);
            if (object3 != null) {
                object4.execute((Runnable)object3);
            }
            ((ArrayList)object2).add(jde2);
        }
        object = this.a;
        synchronized (object) {
            if (!this.e()) {
                return;
            }
            this.g.removeAll((Collection<?>)object2);
            if (this.g.isEmpty()) {
                object4 = new LinkedHashSet();
                this.g = object4;
            }
            if (!this.e()) {
                this.b.b(this.d);
                if (this.h.a != null && (object4 = this.e) != null) {
                    this.b.b((Runnable)object4);
                    this.e = null;
                }
            }
        }
        this.b.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final jcj b(ixb object, iwx object22, itw itw2, iuc[] iucArray) {
        iwc iwc2;
        Object object3;
        try {
            object3 = new jgq();
            iwc2 = new iwc((ixb)object, (iwx)object22, itw2, (iwa)object3);
            object = this.h;
        }
        catch (Throwable throwable) {
            this.b.a();
            throw throwable;
        }
        while (true) {
            block21: {
                block19: {
                    block20: {
                        block18: {
                            if ((object22 = ((ksb)object).a) == null) break block18;
                            object = new jdq((iyh)object22, iucArray);
                            break block19;
                        }
                        object22 = ((ksb)object).b;
                        if (object22 == null || (object22 = jeb.c(((iwf)object22).a(iwc2), itw2.h())) == null) break block20;
                        object = object22.b(iwc2.c, iwc2.b, iwc2.a, iucArray);
                        break block19;
                    }
                    object3 = this.a;
                    // MONITORENTER : object3
                    object22 = this.h;
                    if (object != object22) break block21;
                    object = new jde(this, iwc2, iucArray);
                    this.g.add(object);
                    object22 = this.a;
                    // MONITORENTER : object22
                    int n2 = this.g.size();
                    // MONITOREXIT : object22
                    if (n2 == 1) {
                        this.b.b(this.c);
                    }
                    for (Object object22 : iucArray) {
                    }
                    // MONITOREXIT : object3
                }
                this.b.a();
                return object;
            }
            // MONITOREXIT : object3
            object = object22;
        }
    }

    @Override
    public final ivn c() {
        return this.i;
    }

    @Override
    public final Runnable d(jge jge2) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e() {
        Object object = this.a;
        synchronized (object) {
            boolean bl2 = this.g.isEmpty();
            return bl2 ^ true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(iyh object) {
        Object object2 = this.a;
        synchronized (object2) {
            if (this.h.a != null) {
                return;
            }
            ksb ksb2 = this.h;
            Object object3 = new ksb(ksb2.b, object);
            this.h = object3;
            object = this.b;
            object3 = new iuk(this, 13);
            ((iym)object).b((Runnable)object3);
            if (!this.e() && (object = this.e) != null) {
                this.b.b((Runnable)object);
                this.e = null;
            }
        }
        this.b.a();
    }

    @Override
    public final void p(iyh iyh2) {
        throw null;
    }
}

