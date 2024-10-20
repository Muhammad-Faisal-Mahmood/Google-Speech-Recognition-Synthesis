/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Set;

public final class hgj {
    private static final hgf a = new hgh();
    private static final hge b = new hgi();

    public static hgg a(Set object) {
        hgc hgc2 = new hgc(a);
        hgc2.f = b;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2;
            object = (hez)iterator.next();
            hhk.h(object, "key");
            if (((hez)object).b) {
                object2 = hgc.b;
                hhk.h(object, "key");
                hhk.f(((hez)object).b, "key must be repeating");
                hgc2.c.remove(object);
                hgc2.d.put(object, object2);
                continue;
            }
            object2 = hgc.a;
            hhk.h(object, "key");
            hgc2.d.remove(object);
            hgc2.c.put(object, object2);
        }
        return new hgd(hgc2);
    }
}

