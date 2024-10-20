/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class gll
implements gte {
    public final Map a;
    public final Set b;
    public final long c;
    public final bng d;

    public /* synthetic */ gll(bng bng2, Map map, Set set, long l2) {
        this.d = bng2;
        this.a = map;
        this.b = set;
        this.c = l2;
    }

    @Override
    public final Object apply(Object object) {
        int n2;
        long l2;
        long l3;
        long l4;
        Serializable serializable;
        Object object2;
        object = (Map)object;
        Object object32 = new ArrayList();
        long l5 = cgw.p().toEpochMilli();
        Object object4 = this.a.entrySet().iterator();
        while (object4.hasNext()) {
            object2 = this.b;
            Object object5 = object4.next();
            serializable = (gli)object5.getKey();
            object5 = ((gkl)object5.getValue()).a();
            Object object6 = (Long)object.get(serializable);
            if (object2.contains(serializable)) {
                l4 = l5;
            } else {
                l4 = this.c;
                if (object6 != null) {
                    l4 = (Long)object6;
                }
            }
            object6 = new hat();
            l3 = ((gkh)object5).a;
            serializable = ((gkh)object5).c;
            object2 = gsl.a;
            for (gki gki2 : ((hac)serializable).g()) {
                l2 = gki2.b;
                if (l2 != -1L) {
                    l2 = l2 + l4 + ((gkh)object5).a;
                    serializable = object2;
                    if (l5 <= l2) {
                        object2 = !((gto)object2).g() ? gto.i(l2) : gto.i(Math.min((Long)((gto)object2).c(), l2));
                        ((hat)object6).j((Object)gki2.a);
                        serializable = object2;
                    }
                } else {
                    ((hat)object6).j((Object)gki2.a);
                    serializable = object2;
                }
                object2 = serializable;
            }
            serializable = new HashSet();
            fxf.n(((hat)object6).g(), serializable);
            object32.add(new glj((Set)((Object)serializable), l3 + l4, (gto)object2));
        }
        int n3 = 0;
        for (n2 = 0; n2 < object32.size(); ++n2) {
            serializable = (glj)object32.get(n2);
            l2 = ((glj)((Object)serializable)).b;
            l4 = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
            l3 = l4 + l5;
            if (l2 >= l3) continue;
            l2 = Math.max(l5, l2);
            object2 = new HashSet();
            object = gsl.a;
            fxf.n(((glj)((Object)serializable)).a, object2);
            if (((glj)((Object)serializable)).c.g()) {
                l2 = l3 - l2;
                boolean bl2 = true;
                boolean bl3 = l2 > 0L;
                fxf.A(bl3);
                bl3 = l2 <= l4 ? bl2 : false;
                fxf.A(bl3);
                object = gto.i((Long)((glj)((Object)serializable)).c.c() + l2);
            }
            object32.set(n2, new glj((Set)object2, l3, (gto)object));
        }
        l3 = Math.abs(((SecureRandom)((AmbientModeSupport$AmbientController)this.d.c).a.b()).nextLong());
        object = TimeUnit.MILLISECONDS;
        l4 = fhq.m(glo.a) ? ((TimeUnit)((Object)object)).convert(5L, TimeUnit.SECONDS) : ((TimeUnit)((Object)object)).convert(15L, TimeUnit.MINUTES);
        l4 = l3 % l4;
        for (n2 = n3; n2 < object32.size(); ++n2) {
            serializable = (glj)object32.get(n2);
            object2 = new HashSet();
            object = gsl.a;
            fxf.n(((glj)((Object)serializable)).a, object2);
            l3 = ((glj)((Object)serializable)).b;
            if (((glj)((Object)serializable)).c.g()) {
                object = gto.i((Long)((glj)((Object)serializable)).c.c() + l4);
            }
            object32.set(n2, new glj((Set)object2, l3 + l4, (gto)object));
        }
        serializable = new ot();
        object32 = object32.iterator();
        while (object32.hasNext()) {
            object4 = (glj)object32.next();
            object = ((glj)object4).a;
            object2 = (glj)serializable.get(object);
            if (object2 == null) {
                serializable.put(object, object4);
                continue;
            }
            serializable.put(object, glj.a((glj)object2, (glj)object4));
        }
        object = gsl.a;
        for (Object object32 : serializable.values()) {
            if (!((glj)object32).c.g()) continue;
            if (((gto)object).g()) {
                object = gto.i(Math.min((Long)((gto)object).c(), (Long)((glj)object32).c.c()));
                continue;
            }
            object = ((glj)object32).c;
        }
        object2 = serializable;
        if (((gto)object).g()) {
            object2 = new HashMap(serializable);
            serializable = hdc.a;
            object32 = new HashSet<glj>();
            l4 = (Long)((gto)object).c();
            fxf.n(serializable, object32);
            object = new glj((Set)object32, l4, (gto)object);
            object32 = (glj)object2.get(serializable);
            if (object32 == null) {
                object2.put(serializable, object);
            } else {
                object2.put(serializable, glj.a((glj)object32, (glj)object));
            }
            object2 = DesugarCollections.unmodifiableMap(object2);
        }
        return object2;
    }
}

