/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class iwr
implements Iterable {
    public final iws a;
    public final int b;
    final iwx c;

    public iwr(iwx iwx2, iws iws2, int n2) {
        this.c = iwx2;
        this.a = iws2;
        this.b = n2;
    }

    public final Iterator iterator() {
        return new iwq(this);
    }
}

