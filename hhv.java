/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

public final class hhv
extends hhu {
    public static final Map c;
    private final hfq d;

    static {
        EnumMap<hfq, hhv[]> enumMap = new EnumMap<hfq, hhv[]>(hfq.class);
        for (hfq hfq2 : hfq.values()) {
            hhv[] hhvArray = new hhv[10];
            for (int i2 = 0; i2 < 10; ++i2) {
                hhvArray[i2] = new hhv(i2, hfq2, hfr.a);
            }
            enumMap.put(hfq2, hhvArray);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public hhv(int n2, hfq object, hfr hfr2) {
        super(hfr2, n2);
        hhk.h(object, "format char");
        this.d = object;
        if (!hfr2.c()) {
            char c2 = ((hfq)((Object)object)).l;
            n2 = c2;
            if (hfr2.d()) {
                n2 = c2 & 0xFFDF;
            }
            object = new StringBuilder("%");
            hfr2.f((StringBuilder)object);
            ((StringBuilder)object).append((char)n2);
            return;
        }
        object = ((hfq)((Object)object)).o;
    }

    @Override
    public final void a(hhy hhy2, Object object) {
        hhy2.d(object, this.d, this.b);
    }
}

