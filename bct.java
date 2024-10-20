/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class bct
implements bcs {
    private final Map a = new LinkedHashMap();

    @Override
    public final List a(String object2) {
        jse.e(object2, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            if (!jse.i(((bgs)entry.getKey()).a, object2)) continue;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Object object2 : linkedHashMap.keySet()) {
            this.a.remove(object2);
        }
        return jns.s(linkedHashMap.values());
    }

    @Override
    public final boolean b(bgs bgs2) {
        return this.a.containsKey(bgs2);
    }

    @Override
    public final bzb c(bgs bgs2) {
        jse.e(bgs2, "id");
        return (bzb)this.a.remove(bgs2);
    }

    @Override
    public final bzb d(bgs bgs2) {
        Object v2;
        Map map = this.a;
        Object object = v2 = map.get(bgs2);
        if (v2 == null) {
            object = new bzb(bgs2);
            map.put(bgs2, object);
        }
        return (bzb)object;
    }

    @Override
    public final /* synthetic */ bzb e(bhd bhd2) {
        return abr.n(this, bhd2);
    }
}

