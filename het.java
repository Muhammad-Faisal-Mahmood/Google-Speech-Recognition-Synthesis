/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;

public abstract class het {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected het() {
    }

    protected abstract Object a();

    public final Object b(hes hes2, hfz hfz2) {
        Object object = this.a.get(hes2);
        if (object != null) {
            return object;
        }
        Object object2 = this.a();
        object = this.a.putIfAbsent(hes2, object2);
        if (object == null) {
            int n2 = ((hen)hfz2).b;
            object = null;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object3 = object;
                if (hem.f.equals(hfz2.c(i2))) {
                    Object object4 = hfz2.e(i2);
                    if (!(object4 instanceof hex)) {
                        object3 = object;
                    } else {
                        object3 = object;
                        if (object == null) {
                            object3 = new ffe((Object)this, (Object)hes2, 19, null);
                        }
                        ((hex)object4).a();
                    }
                }
                object = object3;
            }
            return object2;
        }
        return object;
    }
}

