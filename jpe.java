/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jpe
implements Iterator,
jsm {
    public boolean a;
    private final int b;
    private final int c;
    private int d;

    public jpe() {
        throw null;
    }

    public jpe(int n2, int n3, int n4) {
        this.b = n4;
        this.c = n3;
        boolean bl2 = false;
        if (n4 > 0 ? n2 <= n3 : n2 >= n3) {
            bl2 = true;
        }
        this.a = bl2;
        if (!bl2) {
            n2 = n3;
        }
        this.d = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a() {
        int n2 = this.d;
        if (n2 == this.c) {
            if (!this.a) throw new NoSuchElementException();
            this.a = false;
            return n2;
        } else {
            this.d = this.b + n2;
        }
        return n2;
    }

    @Override
    public final boolean hasNext() {
        return this.a;
    }

    @Override
    public final void remove() {
        a.b();
    }
}

