/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class hgd
extends hgg {
    private final Map a;
    private final Map b;
    private final hgf c;
    private final hge d;

    public hgd(hgc hgc2) {
        HashMap hashMap;
        HashMap hashMap2;
        this.a = hashMap2 = new HashMap();
        this.b = hashMap = new HashMap();
        hashMap2.putAll(hgc2.c);
        hashMap.putAll(hgc2.d);
        this.c = hgc2.e;
        this.d = hgc2.f;
    }

    @Override
    protected final void a(hez hez2, Object object, Object object2) {
        hgf hgf2 = (hgf)this.a.get(hez2);
        if (hgf2 != null) {
            hgf2.a(hez2, object, object2);
            return;
        }
        this.c.a(hez2, object, object2);
    }

    @Override
    protected final void b(hez hez2, Iterator iterator, Object object) {
        hge hge2 = (hge)this.b.get(hez2);
        if (hge2 != null) {
            hge2.a(hez2, iterator, object);
            return;
        }
        if (this.d != null && !this.a.containsKey(hez2)) {
            this.d.a(hez2, iterator, object);
            return;
        }
        while (iterator.hasNext()) {
            ((hgg)this).a(hez2, iterator.next(), object);
        }
    }
}

