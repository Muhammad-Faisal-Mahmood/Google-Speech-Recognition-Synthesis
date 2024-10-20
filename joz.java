/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

public final class joz
implements ListIterator,
jsm {
    public static final joz a = new joz();

    private joz() {
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        return false;
    }

    @Override
    public final int nextIndex() {
        return 0;
    }

    @Override
    public final int previousIndex() {
        return -1;
    }

    @Override
    public final void remove() {
        a.b();
    }
}

