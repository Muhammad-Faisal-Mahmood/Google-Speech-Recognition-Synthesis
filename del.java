/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class del
implements ddp {
    public final den a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final dfv c;

    public del(dfv dfv2, den den2) {
        this.c = dfv2;
        this.a = den2;
    }

    public final del b() {
        dec.k(this.b.get());
        return new del(this.c.b(), this.a);
    }

    @Override
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.c.close();
    }

    public final boolean equals(Object object) {
        block7: {
            boolean bl2;
            block6: {
                block5: {
                    if (this == object) {
                        return true;
                    }
                    boolean bl3 = object instanceof del;
                    bl2 = false;
                    if (!bl3) {
                        return false;
                    }
                    object = (del)object;
                    den den2 = this.a;
                    if (den2 == null) break block5;
                    bl2 = den2.equals(((del)object).a);
                    break block6;
                }
                if (((del)object).a == null) break block7;
            }
            return bl2;
        }
        return true;
    }

    public final int hashCode() {
        den den2 = this.a;
        if (den2 != null) {
            return den2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.c.toString();
    }
}

