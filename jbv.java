/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

final class jbv
extends jdu {
    private final jcu a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile iyh c;

    public jbv(jcu jcu2, String string) {
        this.a = jcu2;
        a.s(string, "authority");
    }

    @Override
    protected final jcu a() {
        return this.a;
    }

    @Override
    public final jcj b(ixb ixb2, iwx iwx2, itw itw2, iuc[] iucArray) {
        if (this.b.get() >= 0) {
            return new jdq(this.c, iucArray);
        }
        return this.a.b(ixb2, iwx2, itw2, iucArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(iyh iyh2) {
        a.s(iyh2, "status");
        synchronized (this) {
            if (this.b.get() >= 0) {
                return;
            }
            this.c = iyh2;
            this.b.addAndGet(Integer.MAX_VALUE);
            if (this.b.get() != 0) {
                return;
            }
        }
        super.o(iyh2);
    }
}

