/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class hpe
extends hnk {
    private hpf a;

    public hpe(hpf hpf2) {
        this.a = hpf2;
    }

    @Override
    protected final String a() {
        Object object = this.a;
        if (object != null) {
            Object object2 = ((hpf)object).d;
            object = ((hpf)object).c;
            int n2 = ((hpn[])object2).length;
            int n3 = ((AtomicInteger)object).get();
            object2 = new StringBuilder("inputCount=[");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append("], remaining=[");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append("]");
            return ((StringBuilder)object2).toString();
        }
        return null;
    }

    @Override
    protected final void b() {
        this.a = null;
    }

    @Override
    public final boolean cancel(boolean bl2) {
        hpf hpf2 = this.a;
        if (super.cancel(bl2)) {
            hpf2 = Objects.requireNonNull(hpf2);
            hpf2.a = true;
            if (!bl2) {
                hpf2.b = false;
            }
            hpf2.a();
            return true;
        }
        return false;
    }
}

