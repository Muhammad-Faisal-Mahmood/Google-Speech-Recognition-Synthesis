/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.util.SparseArray
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

public final class ayn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ayn() {
        this.a = new ot();
        this.b = new SparseArray();
        this.c = new ox();
        this.d = new ot();
    }

    public ayn(Context context) {
        afq afq2 = new afq(this, 1);
        this.b = afq2;
        this.a = new ok(context);
        this.d = new Handler(Looper.myLooper(), (Handler.Callback)afq2);
        this.c = om.a;
    }

    public ayn(aob aob2, boolean[] blArray) {
        this.c = aob2;
        this.d = blArray;
        int n2 = aob2.b;
        this.b = new boolean[n2];
        this.a = new boolean[n2];
    }

    public ayn(bzb bzb2, ack ack2, acr acr2) {
        jse.e(bzb2, "store");
        jse.e(ack2, "factory");
        jse.e(acr2, "defaultExtras");
        this.b = bzb2;
        this.c = ack2;
        this.d = acr2;
        this.a = new wg();
    }

    public ayn(byte[] byArray) {
        this.d = new uo(10);
        this.b = new pa();
        this.a = new ArrayList();
        this.c = new HashSet();
    }

    public final ach a(jta object, String object2) {
        Object object3 = this.a;
        synchronized (object3) {
            block7: {
                Object object4;
                block6: {
                    object4 = ((bzb)this.b).Q((String)object2);
                    if (!object.d(object4)) break block6;
                    object = this.c;
                    if (object instanceof acm) {
                        object = (acm)object;
                        jse.b(object4);
                        ((acm)object).e((ach)object4);
                    }
                    jse.c(object4, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel$lambda$1");
                    object = object4;
                    break block7;
                }
                object4 = new acs((acr)this.d);
                ((acs)object4).b(acn.a, object2);
                object4 = wf.c((ack)this.c, (jta)object, (acr)object4);
                object = this.b;
                jse.e(object4, "viewModel");
                object2 = (ach)((bzb)object).a.put(object2, object4);
                object = object4;
                if (object2 == null) break block7;
                ((ach)object2).g();
                object = object4;
            }
            return object;
        }
    }

    public final ArrayList b(Object object) {
        return (ArrayList)((pa)this.b).get(object);
    }

    public final void c(Object object) {
        if (!((pa)this.b).containsKey(object)) {
            ((pa)this.b).put(object, null);
        }
    }

    public final void d(Object object, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(object)) {
            return;
        }
        if (!hashSet.contains(object)) {
            hashSet.add(object);
            ArrayList arrayList2 = (ArrayList)((pa)this.b).get(object);
            if (arrayList2 != null) {
                int n2 = arrayList2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.d(arrayList2.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(object);
            arrayList.add(object);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}

