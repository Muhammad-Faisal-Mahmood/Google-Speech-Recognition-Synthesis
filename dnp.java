/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class dnp
implements hnx {
    public final dnr a;
    public final AtomicInteger b;
    public final int c;

    public /* synthetic */ dnp(dnr dnr2, AtomicInteger atomicInteger, int n2) {
        this.a = dnr2;
        this.b = atomicInteger;
        this.c = n2;
    }

    @Override
    public final hpn a() {
        Object object;
        if (this.b.getAndDecrement() <= 0) {
            object = hpj.a;
        } else {
            int n2 = this.c;
            object = this.a;
            object = ((dnr)object).n(n2, (dnf)((dnr)object).b.b());
        }
        return object;
    }
}

