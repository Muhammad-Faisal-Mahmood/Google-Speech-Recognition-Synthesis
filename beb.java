/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public final class beb
implements bcp,
bew,
bcc {
    private static final String b = bbi.b("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final Map d = new HashMap();
    private final bdz e;
    private boolean f;
    private final Object g = new Object();
    private final bcs h = abr.m();
    private final bcn i;
    private final bam j;
    private final Map k = new HashMap();
    private final bec l;
    private final czh m;
    private final bxt n;
    private final bzb o;

    public beb(Context object, bam bam2, cya cya2, bcn bcn2, bxt bxt2, czh czh2) {
        this.c = object;
        bbt bbt2 = bam2.e;
        object = bam2.p;
        this.e = new bdz(this, bbt2);
        this.l = new bec(bbt2, bxt2);
        this.m = czh2;
        this.o = new bzb(cya2, null);
        this.j = bam2;
        this.i = bcn2;
        this.n = bxt2;
    }

    private final void f() {
        this.a = bif.a(this.c, this.j);
    }

    private final void g() {
        if (!this.f) {
            this.i.a(this);
            this.f = true;
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
    public final void a(bgs bgs2, boolean bl2) {
        Object object = this.h.c(bgs2);
        if (object != null) {
            this.l.a((bzb)object);
        }
        object = this.g;
        // MONITORENTER : object
        jwi jwi2 = (jwi)this.d.remove(bgs2);
        // MONITOREXIT : object
        if (jwi2 != null) {
            bbi.a();
            Objects.toString(bgs2);
            jwi2.r(null);
        }
        if (bl2) return;
        object = this.g;
        // MONITORENTER : object
        this.k.remove(bgs2);
        // MONITOREXIT : object
    }

    @Override
    public final void b(String object) {
        Runnable runnable;
        if (this.a == null) {
            this.f();
        }
        if (!this.a.booleanValue()) {
            bbi.a().e(b, "Ignoring schedule request in non-main process");
            return;
        }
        this.g();
        bbi.a();
        Object object22 = this.e;
        if (object22 != null && (runnable = (Runnable)((bdz)object22).c.remove(object)) != null) {
            ((bdz)object22).b.a(runnable);
        }
        for (Object object22 : this.h.a((String)object)) {
            this.l.a((bzb)object22);
            abr.o(this.n, (bzb)object22);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(bhd ... object) {
        Object object2;
        if (this.a == null) {
            this.f();
        }
        if (!this.a.booleanValue()) {
            bbi.a().e(b, "Ignoring schedule request in a secondary process");
            return;
        }
        this.g();
        HashSet<bhd> hashSet = new HashSet<bhd>();
        Object object32 = new HashSet();
        for (bhd bhd2 : object) {
            long l2;
            long l3;
            Object object4;
            object2 = AmbientLifecycleObserverKt.o(bhd2);
            if (this.h.b((bgs)object2)) continue;
            Object object5 = this.g;
            synchronized (object5) {
                bgs bgs2 = AmbientLifecycleObserverKt.o(bhd2);
                object2 = object4 = (bea)this.k.get(bgs2);
                if (object4 == null) {
                    int n2 = bhd2.l;
                    object4 = this.j.p;
                    object2 = new bea(n2, System.currentTimeMillis());
                    this.k.put(bgs2, object2);
                }
                l3 = ((bea)object2).b;
                l2 = Math.max(bhd2.l - ((bea)object2).a - 5, 0);
            }
            l2 = Math.max(bhd2.a(), l3 + l2 * 30000L);
            object2 = this.j.p;
            l3 = System.currentTimeMillis();
            if (bhd2.c != bbv.a) continue;
            if (l3 < l2) {
                object2 = this.e;
                if (object2 == null) continue;
                object4 = bhd2.b;
                if ((object4 = (Runnable)((bdz)object2).c.remove(object4)) != null) {
                    ((bdz)object2).b.a((Runnable)object4);
                }
                object4 = new aks(object2, (Object)bhd2, 7, null);
                ((bdz)object2).c.put(bhd2.b, object4);
                l3 = System.currentTimeMillis();
                ((bdz)object2).b.b(l2 - l3, (Runnable)object4);
                continue;
            }
            if (bhd2.b()) {
                object2 = bhd2.k;
                if (((baq)object2).e) {
                    bbi.a();
                    Objects.toString(bhd2);
                    continue;
                }
                if (((baq)object2).b()) {
                    bbi.a();
                    Objects.toString(bhd2);
                    continue;
                }
                hashSet.add(bhd2);
                object32.add(bhd2.b);
                continue;
            }
            if (this.h.b(AmbientLifecycleObserverKt.o(bhd2))) continue;
            bbi.a();
            object2 = bhd2.b;
            object2 = this.h.e(bhd2);
            this.l.b((bzb)object2);
            this.n.y((bzb)object2);
        }
        object = this.g;
        synchronized (object) {
            if (!hashSet.isEmpty()) {
                TextUtils.join((CharSequence)",", object32);
                bbi.a();
                for (Object object32 : hashSet) {
                    object2 = AmbientLifecycleObserverKt.o((bhd)object32);
                    if (this.d.containsKey(object2)) continue;
                    object32 = bfa.a(this.o, (bhd)object32, (juy)this.m.d, this);
                    this.d.put(object2, object32);
                }
            }
            return;
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(bhd object, ass ass2) {
        boolean bl2 = ass2 instanceof beq;
        object = AmbientLifecycleObserverKt.o((bhd)object);
        if (bl2) {
            if (!this.h.b((bgs)object)) {
                bbi.a();
                Objects.toString(object);
                object.toString();
                object = this.h.d((bgs)object);
                this.l.b((bzb)object);
                this.n.y((bzb)object);
                return;
            }
        } else {
            bbi.a();
            Objects.toString(object);
            object.toString();
            object = this.h.c((bgs)object);
            if (object != null) {
                this.l.a((bzb)object);
                int n2 = ((ber)ass2).a;
                this.n.A((bzb)object, n2);
            }
        }
    }
}

