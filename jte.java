/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class jte
implements jtl {
    private final AtomicReference a;

    public jte(jtl jtl2) {
        this.a = new AtomicReference<jtl>(jtl2);
    }

    @Override
    public final Iterator a() {
        jtl jtl2 = this.a.getAndSet(null);
        if (jtl2 != null) {
            return jtl2.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

