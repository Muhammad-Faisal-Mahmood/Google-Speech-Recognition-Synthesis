/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class jtg
implements jtl {
    public final jtl a;
    public final int b;

    public jtg(jtl jtl2, int n2) {
        this.a = jtl2;
        this.b = n2;
    }

    @Override
    public final Iterator a() {
        return new jtf(this, 0);
    }
}

