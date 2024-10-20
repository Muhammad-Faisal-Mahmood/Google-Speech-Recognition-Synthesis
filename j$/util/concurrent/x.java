/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class x
implements Iterator {
    private ConcurrentLinkedQueue.Node a;
    private Object b;
    private ConcurrentLinkedQueue.Node c;
    final ConcurrentLinkedQueue d;

    x(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
        block0: while (true) {
            ConcurrentLinkedQueue.Node node;
            ConcurrentLinkedQueue.Node node2 = node = concurrentLinkedQueue.head;
            while (true) {
                Object object;
                block6: {
                    block5: {
                        block4: {
                            if ((object = node2.item) == null) break block4;
                            this.a = node2;
                            this.b = object;
                            break block5;
                        }
                        object = node2.next;
                        if (object != null) break block6;
                    }
                    concurrentLinkedQueue.f(node, node2);
                    return;
                }
                if (node2 == object) continue block0;
                node2 = object;
            }
            break;
        }
    }

    @Override
    public final boolean hasNext() {
        boolean bl2 = this.b != null;
        return bl2;
    }

    public final Object next() {
        ConcurrentLinkedQueue.Node node = this.a;
        if (node != null) {
            this.c = node;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
            concurrentLinkedQueue.getClass();
            ConcurrentLinkedQueue.Node node2 = node.next;
            Object object = node2;
            if (node == node2) {
                object = concurrentLinkedQueue.head;
            }
            concurrentLinkedQueue = null;
            node2 = object;
            object = concurrentLinkedQueue;
            while (node2 != null) {
                concurrentLinkedQueue = node2.item;
                if (concurrentLinkedQueue != null) {
                    object = concurrentLinkedQueue;
                    break;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue2 = this.d;
                concurrentLinkedQueue2.getClass();
                object = node2.next;
                if (node2 == object) {
                    object = concurrentLinkedQueue2.head;
                }
                if (object != null) {
                    ConcurrentLinkedQueue.d.a(node, node2, object);
                }
                node2 = object;
                object = concurrentLinkedQueue;
            }
            this.a = node2;
            node2 = this.b;
            this.b = object;
            return node2;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        ConcurrentLinkedQueue.Node node = this.c;
        if (node != null) {
            node.item = null;
            this.c = null;
            return;
        }
        throw new IllegalStateException();
    }
}

