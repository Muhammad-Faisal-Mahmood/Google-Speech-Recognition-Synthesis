/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public final class fae {
    public static final Map a;

    static {
        joc joc2 = new joc("zh-Hant-TW", "cmn-Hant-TW");
        joc joc3 = new joc("zh-TW", "cmn-Hant-TW");
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(jjj.E(2));
        for (int i2 = 0; i2 < 2; ++i2) {
            joc joc4 = (new joc[]{joc2, joc3})[i2];
            linkedHashMap.put(joc4.a, joc4.b);
        }
        a = linkedHashMap;
    }
}

