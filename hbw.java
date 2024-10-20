/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hbw
extends gxu {
    final Map.Entry a;

    public hbw(Map.Entry entry) {
        this.a = entry;
    }

    @Override
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        return this.a.getValue();
    }
}

