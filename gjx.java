/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public final class gjx
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public gjx(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gzx a() {
        Object object;
        Object object2;
        Object object3;
        Map map;
        block33: {
            map = ((gjv)this.a).a();
            pa pa2 = (pa)this.b.b();
            object3 = ((gju)this.c).a();
            Set set = map.keySet();
            synchronized (pa2) {
                object = object2 = (ArrayList)pa2.get(set);
                if (object2 == null) {
                    Object object4;
                    int n2;
                    Object object52;
                    ArrayList<hmr> arrayList;
                    int n3;
                    object2 = new ArrayList(set);
                    Collections.shuffle(object2, (Random)((bzo)object3).a);
                    Iterator iterator = new Iterator();
                    object = new ArrayDeque(object2);
                    object3 = new HashSet(object2);
                    block11: while (true) {
                        boolean bl2 = object.isEmpty();
                        int n4 = 0;
                        n3 = 0;
                        if (bl2) break;
                        arrayList = (gjt)object.remove();
                        object52 = ((gjt)((Object)arrayList)).a;
                        n4 = ((hct)object52).c;
                        for (n2 = 0; n2 < n4; ++n2) {
                            object4 = (gjt)object52.get(n2);
                            bzo.K((pa)((Object)iterator), arrayList, (gjt)object4);
                            if (!object3.add(object4)) continue;
                            object.add(object4);
                        }
                        object52 = ((gjt)((Object)arrayList)).b;
                        n4 = ((hct)object52).c;
                        n2 = n3;
                        while (true) {
                            if (n2 >= n4) continue block11;
                            object4 = (gjt)object52.get(n2);
                            bzo.K((pa)((Object)iterator), (gjt)object4, arrayList);
                            if (object3.add(object4)) {
                                object.add(object4);
                            }
                            ++n2;
                        }
                        break;
                    }
                    object52 = hav.n((Collection)object2);
                    try {
                        Object object6;
                        arrayList = new ArrayList<hmr>(object2.size());
                        object4 = new HashMap(object2.size());
                        Iterator iterator2 = object2.iterator();
                        n2 = 0;
                        while (iterator2.hasNext()) {
                            Object e2 = iterator2.next();
                            object6 = new Object(e2, n2);
                            arrayList.add((hmr)object6);
                            object = object3 = (List)object4.get(e2);
                            if (object3 == null) {
                                object = new ArrayList();
                                object4.put(e2, object);
                            }
                            object.add((hmr)object6);
                            ++n2;
                        }
                        n3 = arrayList.size();
                        for (n2 = n4; n2 < n3; ++n2) {
                            object = (hmr)arrayList.get(n2);
                            object3 = bzo.J((Set)object52, (pa)((Object)iterator), (gjt)((hmr)object).a).iterator();
                            while (object3.hasNext()) {
                                object6 = (List)object4.get(object3.next());
                                if (object6 != null) {
                                    object6 = object6.iterator();
                                    while (object6.hasNext()) {
                                        ((hmr)object6.next()).c.add(object);
                                        ++((hmr)object).d;
                                    }
                                    continue;
                                }
                                ++((hmr)object).d;
                            }
                        }
                        object = new ArrayList(object2.size());
                        object3 = new PriorityQueue();
                        object52 = arrayList.iterator();
                        while (true) {
                            if (object52.hasNext()) break block32;
                            while (!((AbstractCollection)object3).isEmpty()) {
                                iterator = (hmr)((PriorityQueue)object3).poll();
                                object.add((Object)iterator);
                                for (Object object52 : ((hmr)((Object)iterator)).c) {
                                    ((hmr)object52).d = n2 = ((hmr)object52).d - 1;
                                    if (n2 != 0) continue;
                                    ((PriorityQueue)object3).add(object52);
                                }
                            }
                            if (object.size() != object2.size()) {
                                object = new ArrayList();
                                object2 = arrayList.iterator();
                                while (true) {
                                    if (!object2.hasNext()) {
                                        object2 = new hmq((List)object);
                                        throw object2;
                                    }
                                    object3 = (hmr)object2.next();
                                    if (((hmr)object3).d <= 0) continue;
                                    object.add(((hmr)object3).a);
                                }
                            }
                            object2.clear();
                            object = object.iterator();
                            while (object.hasNext()) {
                                object2.add((Object)((hmr)object.next()).a);
                            }
                            break;
                        }
                    }
                    catch (hmq hmq2) {
                        object = new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(hmq2.a)))), hmq2);
                        throw object;
                    }
                    {
                        block32: {
                            pa2.put(set, object2);
                            object = object2;
                            break block33;
                        }
                        iterator = (hmr)object52.next();
                        if (((hmr)((Object)iterator)).d != 0) continue;
                        ((PriorityQueue)object3).add(iterator);
                        continue;
                    }
                }
            }
        }
        object2 = new gzs();
        object = object.iterator();
        block23: while (true) {
            if (!object.hasNext()) {
                object = ((gzs)object2).g();
                idi.m(object);
                return object;
            }
            object3 = ((Set)map.get((gjt)object.next())).iterator();
            while (true) {
                if (!object3.hasNext()) continue block23;
                ((gzs)object2).h((hsy)((jnu)object3.next()).b());
            }
            break;
        }
    }
}

