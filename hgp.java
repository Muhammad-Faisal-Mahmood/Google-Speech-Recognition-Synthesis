/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hgp
extends hgq {
    private final Map a;

    public hgp(hfz object, hfz object22) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hgp.d(linkedHashMap, (hfz)((Object)object));
        hgp.d(linkedHashMap, (hfz)object22);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((hez)entry.getKey()).b) continue;
            entry.setValue(DesugarCollections.unmodifiableList((List)entry.getValue()));
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, hfz hfz2) {
        for (int i2 = 0; i2 < hfz2.b(); ++i2) {
            hez hez2 = hfz2.c(i2);
            Object object = map.get(hez2);
            if (hez2.b) {
                List list = (List)object;
                object = list;
                if (list == null) {
                    object = new ArrayList();
                    map.put(hez2, object);
                }
                object.add((Object)hez2.c(hfz2.e(i2)));
                continue;
            }
            map.put(hez2, hez2.c(hfz2.e(i2)));
        }
    }

    @Override
    public final int a() {
        return this.a.size();
    }

    @Override
    public final Set b() {
        return this.a.keySet();
    }

    @Override
    public final void c(hgg hgg2, Object object) {
        for (Map.Entry entry : this.a.entrySet()) {
            hez hez2 = (hez)entry.getKey();
            entry = entry.getValue();
            if (hez2.b) {
                hgg2.b(hez2, ((List)((Object)entry)).iterator(), object);
                continue;
            }
            hgg2.a(hez2, entry, object);
        }
    }
}

