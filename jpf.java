/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class jpf
implements Iterator,
jsm {
    private final long a;
    private boolean b;
    private long c;

    public jpf() {
        throw null;
    }

    public jpf(long l2, long l3) {
        this.a = l3;
        boolean bl2 = l2 <= l3;
        this.b = bl2;
        if (!bl2) {
            l2 = l3;
        }
        this.c = l2;
    }

    @Override
    public final boolean hasNext() {
        return this.b;
    }

    @Override
    public final void remove() {
        a.b();
    }
}

