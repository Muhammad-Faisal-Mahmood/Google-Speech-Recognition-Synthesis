/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

public final class duy
implements Iterable {
    public final Map a;
    private final hac b;

    public duy(hac hac2) {
        this.b = hac2;
        this.a = new ConcurrentHashMap();
    }

    public final Iterator iterator() {
        dti dti2 = new dti(2);
        return fvd.H(this.b.k().k(), new dux(this, dti2));
    }
}

