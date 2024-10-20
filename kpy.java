/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.Map;

public final class kpy {
    public Object a;
    public Object b;

    public kpy() {
    }

    public kpy(its its2) {
        this.a = its2;
    }

    public final its a() {
        if (this.b != null) {
            Object object = this.a;
            Object object2 = its.a;
            object2 = ((its)object).b.entrySet().iterator();
            while (object2.hasNext()) {
                Object object3 = this.b;
                object = (Map.Entry)object2.next();
                Object object4 = object.getKey();
                if (((IdentityHashMap)object3).containsKey(object4)) continue;
                object3 = this.b;
                object4 = (itr)object.getKey();
                object = object.getValue();
                ((IdentityHashMap)object3).put(object4, object);
            }
            this.a = new its((IdentityHashMap)this.b);
            this.b = null;
        }
        return (its)this.a;
    }

    public final void b(itr itr2, Object object) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        ((IdentityHashMap)this.b).put(itr2, object);
    }
}

