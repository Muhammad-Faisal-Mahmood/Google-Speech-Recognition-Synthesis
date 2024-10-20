/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class cxv {
    public final Object a;
    public final Object b;

    public cxv(cyu cyu2, cys cys2) {
        this.a = cyu2;
        this.b = cys2;
    }

    public cxv(frr frr2, gcv gcv2) {
        this.b = frr2;
        this.a = gcv2;
    }

    public cxv(Executor executor) {
        this.b = new CopyOnWriteArrayList();
        this.a = executor;
    }

    public cxv(Executor executor, Executor executor2) {
        this.a = executor;
        this.b = executor2;
    }

    public cxv(jnu jnu2, jnu jnu3) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    public cxv(jnu jnu2, jnu jnu3, jnu jnu4) {
        jnu2.getClass();
        jnu3.getClass();
        this.a = jnu3;
        this.b = jnu4;
    }

    public cxv(jnu jnu2, jnu jnu3, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public cxv(jnu jnu2, jnu jnu3, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(dau dau2) {
        Object object = this.b;
        synchronized (object) {
            Iterator iterator = ((CopyOnWriteArrayList)this.b).iterator();
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                Object object2 = this.a;
                ckr ckr2 = new ckr((Object)dau2, e2, 20, null);
                object2.execute(ckr2);
            }
            return;
        }
    }

    public final boolean b() {
        return ((CopyOnWriteArrayList)this.b).isEmpty();
    }

    public final void c(Object object) {
        ((CopyOnWriteArrayList)this.b).add(object);
    }

    public final void d(String string, long l2, int n2, gto object) {
        dap dap2 = new dap(this, string, l2, n2);
        object = this.b;
        hom hom2 = hom.a;
        fxf.al(((frr)object).b(dap2, (Executor)hom2), new daq(this, string, l2, n2, 0), (Executor)hom.a);
    }

    public final void e(String string, long l2, int n2, boolean bl2) {
        gch gch2 = gcl.a(dal.class);
        bao bao2 = new bao();
        bao2.b = true;
        bao2.a = true;
        int n3 = n2 - 1;
        n2 = 2;
        Object object = n3 != 0 ? (n3 != 2 ? bbj.c : bbj.a) : bbj.b;
        bao2.b((bbj)((Object)object));
        gch2.b(bao2.a());
        if (bl2) {
            n2 = 3;
        }
        gch2.f(new gck(string, n2));
        gch2.c(new gci(new gcj(l2, TimeUnit.SECONDS), gsl.a));
        object = new LinkedHashMap();
        AmbientMode$AmbientCallback.d("MDD_TASK_TAG_KEY", string, (Map)object);
        gch2.f = AmbientMode$AmbientCallback.a((Map)object);
        object = gch2.a();
        fxf.al(((gcv)this.a).b((gcl)object), new dar(string, l2), (Executor)hom.a);
    }

    public final egm f(String string) {
        string.getClass();
        Context context = ((ilt)this.a).a();
        ((dpg)this.b.b()).getClass();
        return new egm(string, context);
    }

    public final egb g(eae eae2) {
        eae2.getClass();
        Object object = this.b;
        Object object2 = this.a.b();
        object = object.b();
        object.getClass();
        return new egb(eae2, (dpq)object2, (iku)object);
    }
}

