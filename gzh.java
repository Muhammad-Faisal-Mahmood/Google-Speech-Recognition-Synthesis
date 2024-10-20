/*
 * Decompiled with CFR 0.152.
 */
import java.util.Queue;

public abstract class gzh
extends gze
implements Queue {
    protected gzh() {
    }

    protected abstract Queue c();

    public final Object element() {
        return this.c().element();
    }

    public boolean offer(Object object) {
        return this.c().offer(object);
    }

    public final Object peek() {
        return this.c().peek();
    }

    public final Object poll() {
        return this.c().poll();
    }

    public final Object remove() {
        return this.c().remove();
    }
}

