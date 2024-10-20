/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

final class gbo
extends hnk {
    private gbq a;
    private final int b;

    public gbo(gbq gbq2, int n2) {
        this.a = gbq2;
        this.b = n2;
    }

    @Override
    protected final String a() {
        Object object = this.a;
        if (object == null) {
            return null;
        }
        object = ((gbq)object).d.a;
        if (object == null) {
            return null;
        }
        String string = a.ar(object, "callable=[", "]");
        Object object2 = (gbp)this.a.b.get();
        object = string;
        if (object2 != null) {
            object = object2.toString();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(", trial=[");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("]");
            object = ((StringBuilder)object2).toString();
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final void b() {
        gbp gbp2;
        int n2;
        int n3;
        int n4;
        long l2;
        gbq gbq2 = this.a;
        this.a = null;
        if (gbq2 == null) return;
        do {
            l2 = gbq2.a.get();
            n3 = (int)l2;
            int n5 = gbq.a(l2);
            if (n3 == Integer.MIN_VALUE) throw new AssertionError((Object)a.ap(l2, "Refcount is: "));
            n2 = n3 == -2147483647 ? 1 : 0;
            n4 = n5;
            if (n2 == 0) continue;
            n4 = n5 + 1;
        } while (!gbq2.a.compareAndSet(l2, gbq.b(n4, n3 - 1)));
        if (n2 == 0) return;
        block1: while ((gbp2 = (gbp)gbq2.b.get()) != null && gbp2.a <= (n2 = this.b)) {
            gbp2.cancel(true);
            AtomicReference atomicReference = gbq2.b;
            while (!atomicReference.compareAndSet(gbp2, null)) {
                if (atomicReference.get() == gbp2) continue;
                continue block1;
            }
            break block1;
        }
    }
}

