/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class w
implements Spliterator {
    ConcurrentLinkedQueue.Node a;
    int b;
    boolean c;
    final ConcurrentLinkedQueue d;

    w(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    private ConcurrentLinkedQueue.Node c() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node node2 = node = this.a;
        if (node == null) {
            node2 = node;
            if (!this.c) {
                this.a = node = this.d.b();
                node2 = node;
                if (node == null) {
                    this.c = true;
                    node2 = node;
                }
            }
        }
        return node2;
    }

    @Override
    public final int a() {
        return 4368;
    }

    @Override
    public final Spliterator b() {
        Object[] objectArray;
        Object object = this.c();
        Object object2 = objectArray = null;
        if (object != null) {
            Object object3 = object.next;
            if (object3 == null) {
                object2 = objectArray;
            } else {
                Object object4;
                Object[] objectArray2;
                int n2;
                int n3;
                this.b = n3 = Math.min(this.b + 1, 0x2000000);
                object2 = null;
                int n4 = 0;
                do {
                    Object e2 = object.item;
                    objectArray2 = object2;
                    n2 = n4;
                    if (e2 != null) {
                        object4 = object2;
                        if (object2 == null) {
                            object4 = new Object[n3];
                        }
                        object4[n4] = e2;
                        n2 = n4 + 1;
                        objectArray2 = object4;
                    }
                    if ((object4 = object == object3 ? this.d.b() : object3) == null || (object3 = object4.next) == null) break;
                    object = object4;
                    object2 = objectArray2;
                    n4 = n2;
                } while (n2 < n3);
                this.a = object4;
                if (object4 == null) {
                    this.c = true;
                }
                object2 = n2 == 0 ? objectArray : Spliterators.g(objectArray2, 0, n2, 4368);
            }
        }
        return object2;
    }

    @Override
    public final long d() {
        return Long.MAX_VALUE;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        ConcurrentLinkedQueue.Node node = this.c();
        if (node != null) {
            this.a = null;
            this.c = true;
            this.d.c(consumer, node);
        }
    }

    @Override
    public final /* synthetic */ boolean k(int n2) {
        return z.f(this, n2);
    }

    @Override
    public final /* synthetic */ long l() {
        return z.e(this);
    }

    @Override
    public final Comparator m() {
        throw new IllegalStateException();
    }

    @Override
    public final boolean o(Consumer consumer) {
        Objects.requireNonNull(consumer);
        ConcurrentLinkedQueue.Node node = this.c();
        if (node != null) {
            Object e2;
            ConcurrentLinkedQueue.Node node2;
            do {
                e2 = node.item;
                node2 = node.next;
                if (node == node2) {
                    node2 = this.d.b();
                }
                if (e2 != null) break;
                node = node2;
            } while (node2 != null);
            this.a = node2;
            if (node2 == null) {
                this.c = true;
            }
            if (e2 != null) {
                consumer.accept(e2);
                return true;
            }
        }
        return false;
    }
}

