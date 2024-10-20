/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Map;

public abstract class ily
implements imb {
    public final Map a;

    public ily(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}

