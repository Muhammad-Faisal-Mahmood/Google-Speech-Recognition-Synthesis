/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class knb
implements Iterable {
    public final List a = new ArrayList();
    public int b;
    public int c;
    public boolean d;

    public final Object a(int n2) {
        return this.a.get(n2);
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final void c(Object object) {
        if (object != null && !this.a.contains(object)) {
            this.a.add(object);
            ++this.c;
        }
    }

    public final Iterator iterator() {
        return new kna(this);
    }
}

