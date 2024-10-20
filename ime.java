/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ime
extends ily {
    public static final img b = imc.a(Collections.emptyMap());

    public ime(Map map) {
        super(map);
    }

    public final Map a() {
        LinkedHashMap linkedHashMap = fvc.ai(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((img)entry.getValue()).b());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }
}

