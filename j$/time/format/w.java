/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.B;
import j$.time.format.x;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class w {
    private final Map a;

    w(Map object) {
        this.a = object;
        HashMap<B, Object> hashMap = new HashMap<B, Object>();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : object.entrySet()) {
            Object object2;
            HashMap<String, AbstractMap.SimpleImmutableEntry<Object, Long>> hashMap2 = new HashMap<String, AbstractMap.SimpleImmutableEntry<Object, Long>>();
            for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                String string = (String)entry2.getValue();
                object2 = (String)entry2.getValue();
                Long object3 = (Long)entry2.getKey();
                int n2 = x.d;
                hashMap2.put(string, new AbstractMap.SimpleImmutableEntry<Object, Long>(object2, object3));
            }
            object2 = new ArrayList(hashMap2.values());
            Collections.sort(object2, x.a());
            hashMap.put((B)((Object)entry.getKey()), object2);
            arrayList.addAll(object2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, x.a());
    }

    final String a(long l2, B object) {
        object = (object = (Map)this.a.get(object)) != null ? (String)object.get(l2) : null;
        return object;
    }
}

