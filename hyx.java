/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hyx
implements Iterator {
    final hyz a;
    private int b;
    private boolean c;
    private Iterator d;

    public hyx(hyz hyz2) {
        this.a = hyz2;
        this.b = -1;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean hasNext() {
        int n2 = this.b;
        boolean bl2 = true;
        hyz hyz2 = this.a;
        boolean bl3 = bl2;
        if (n2 + 1 < hyz2.b) return bl3;
        if (hyz2.c.isEmpty()) return false;
        if (!this.a().hasNext()) return false;
        return bl2;
    }

    @Override
    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.e();
            int n2 = this.b;
            hyz hyz2 = this.a;
            if (n2 < hyz2.b) {
                this.b = n2 - 1;
                hyz2.c(n2);
                return;
            }
            this.a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

