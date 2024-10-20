/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.com.android.tools.r8.b;
import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.u;
import j$.util.concurrent.w;
import j$.util.concurrent.x;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class ConcurrentLinkedQueue<E>
extends AbstractQueue<E>
implements Queue<E>,
Serializable,
Collection<E> {
    private static final b a;
    private static final b b;
    static final b c;
    static final b d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient Node<E> head;
    private volatile transient Node<E> tail;

    static {
        try {
            b b2;
            a = b2 = new b(ConcurrentLinkedQueue.class, "head", Node.class);
            b = b2 = new b(ConcurrentLinkedQueue.class, "tail", Node.class);
            c = b2 = new b(Node.class, "item", Object.class);
            d = b2 = new b(Node.class, "next", Node.class);
            return;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new ExceptionInInitializerError(reflectiveOperationException);
        }
    }

    public ConcurrentLinkedQueue() {
        Node node = new Node();
        this.tail = node;
        this.head = node;
    }

    private boolean a(Predicate predicate) {
        boolean bl2;
        boolean bl3 = false;
        block0: while (true) {
            Node<E> node;
            Node<E> node2 = node = this.head;
            Node<E> node3 = null;
            int n2 = 8;
            bl2 = bl3;
            while (node != null) {
                Node node4;
                block16: {
                    block18: {
                        int n3;
                        int n4;
                        Object object;
                        block17: {
                            boolean bl4;
                            block14: {
                                block15: {
                                    node4 = node.next;
                                    object = node.item;
                                    bl4 = true;
                                    n4 = object != null ? 1 : 0;
                                    bl3 = bl2;
                                    n3 = n4;
                                    if (n4 != 0) {
                                        bl3 = bl2;
                                        n3 = n4;
                                        if (predicate.test(object)) {
                                            bl3 = bl2;
                                            if (c.a(node, object, null)) {
                                                bl3 = true;
                                            }
                                            n3 = 0;
                                        }
                                    }
                                    n4 = n2;
                                    if (n3 != 0) break block14;
                                    n4 = n2--;
                                    if (node4 == null) break block14;
                                    if (n2 != 0) break block15;
                                    n4 = n2;
                                    break block14;
                                }
                                if (node == node4) {
                                    continue block0;
                                }
                                break block16;
                            }
                            object = node2;
                            if (node2 == node) break block17;
                            object = d;
                            if (node3 != null) {
                                bl2 = ((b)object).a(node3, node2, node);
                            } else if (a.a(this, node2, node)) {
                                ((b)object).i(node2, node2);
                                bl2 = bl4;
                            } else {
                                bl2 = false;
                            }
                            if (!bl2) break block18;
                            object = node;
                        }
                        node2 = object;
                        n2 = n4;
                        if (n3 == 0) break block16;
                    }
                    node2 = node4;
                    n2 = 8;
                    node3 = node;
                }
                node = node4;
                bl2 = bl3;
            }
            break;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Node d(Node node, Node node2, Node node3, Node object) {
        boolean bl2;
        Object object2 = object;
        if (object == null) {
            if (node2 == node3) {
                return node;
            }
            object2 = node3;
        }
        object = d;
        if (node != null) {
            bl2 = ((b)object).a(node, node2, object2);
        } else if (a.a(this, node2, object2)) {
            ((b)object).i(node2, node2);
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (!bl2) return node3;
        node2 = node;
        if (node == null) return node2;
        if (c.b(node) == null) return node3;
        return node;
    }

    private Object[] e(Object[] objectArray) {
        int n2;
        Object object = objectArray;
        block0: while (true) {
            Object object2 = this.b();
            n2 = 0;
            while (object2 != null) {
                Object e2 = object2.item;
                Object[] objectArray2 = object;
                int n3 = n2;
                if (e2 != null) {
                    if (object == null) {
                        objectArray2 = new Object[4];
                    } else {
                        objectArray2 = object;
                        if (n2 == ((Object[])object).length) {
                            objectArray2 = Arrays.copyOf(object, (n2 + 4) * 2);
                        }
                    }
                    objectArray2[n2] = e2;
                    n3 = n2 + 1;
                }
                if (object2 == (object = object2.next)) {
                    object = objectArray2;
                    continue block0;
                }
                object2 = object;
                object = objectArray2;
                n2 = n3;
            }
            break;
        }
        if (object == null) {
            return new Object[0];
        }
        if (objectArray != null && n2 <= objectArray.length) {
            if (objectArray != object) {
                System.arraycopy(object, 0, objectArray, 0, n2);
            }
            if (n2 < objectArray.length) {
                objectArray[n2] = null;
            }
            return objectArray;
        }
        if (n2 != ((Object[])object).length) {
            object = Arrays.copyOf(object, n2);
        }
        return object;
    }

    private void readObject(ObjectInputStream object) {
        Node node;
        ((ObjectInputStream)object).defaultReadObject();
        Node node2 = null;
        Node node3 = null;
        while ((node = ((ObjectInputStream)object).readObject()) != null) {
            node = new Node(node);
            if (node2 == null) {
                node2 = node;
            } else {
                node3.getClass();
                d.f(node3, node);
            }
            node3 = node;
        }
        object = node2;
        if (node2 == null) {
            object = new Node();
            node3 = object;
        }
        this.head = object;
        this.tail = node3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Node<E> node = this.b();
        while (node != null) {
            Object object = node.item;
            if (object != null) {
                objectOutputStream.writeObject(object);
            }
            if (node == (object = node.next)) {
                node = this.head;
                continue;
            }
            node = object;
        }
        objectOutputStream.writeObject(null);
    }

    @Override
    public boolean add(E e2) {
        return this.offer(e2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean addAll(java.util.Collection var1_1) {
        block11: {
            if (var1_1 == this) break block11;
            var2_2 = var1_1.iterator();
            var5_3 = null;
            var4_4 = null;
            while (var2_2.hasNext()) {
                var1_1 = new Node<E>(Objects.requireNonNull(var2_2.next()));
                if (var5_3 == null) {
                    var5_3 = var1_1;
                } else {
                    var4_4.getClass();
                    ConcurrentLinkedQueue.d.f(var4_4, var1_1);
                }
                var4_4 = var1_1;
            }
            if (var5_3 == null) {
                return false;
            }
            var2_2 = this.tail;
            var1_1 = var2_2;
            while (true) {
                if ((var6_6 = var2_2.next) == null) {
                    if (!ConcurrentLinkedQueue.d.a(var2_2, null, var5_3)) continue;
                    var2_2 = ConcurrentLinkedQueue.b;
                    if (!var2_2.l(this, var1_1, var4_4)) {
                        var1_1 = this.tail;
                        if (var4_4.next == null) {
                            var2_2.l(this, var1_1, var4_4);
                        }
                    }
                    return true;
                }
                if (var2_2 == var6_6) {
                    var2_2 = this.tail;
                    var1_1 = var1_1 != var2_2 ? var2_2 : this.head;
                    var3_5 = var1_1;
                    var1_1 = var2_2;
                    var2_2 = var3_5;
                    continue;
                }
                var3_5 = var1_1;
                if (var2_2 == var1_1) ** GOTO lbl43
                var2_2 = this.tail;
                if (var1_1 != var2_2) {
                    var1_1 = var2_2;
                } else {
                    var3_5 = var2_2;
lbl43:
                    // 2 sources

                    var2_2 = var3_5;
                    var1_1 = var6_6;
                }
                var3_5 = var2_2;
                var2_2 = var1_1;
                var1_1 = var3_5;
            }
        }
        throw new IllegalArgumentException();
    }

    final Node b() {
        boolean bl2;
        Node<E> node;
        Node<E> node2;
        block0: while (true) {
            Node node3;
            node = node2 = this.head;
            while (!(bl2 = node.item != null) && (node3 = node.next) != null) {
                if (node == node3) continue block0;
                node = node3;
            }
            break;
        }
        this.f(node2, node);
        if (!bl2) {
            node = null;
        }
        return node;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    final void c(Consumer var1_1, Node var2_2) {
        block0: while (true) {
            var4_4 = null;
            block1: while (true) {
                if (var2_2 == null) {
                    return;
                }
                var3_3 = var2_2.next;
                var5_5 /* !! */  = var2_2.item;
                if (var5_5 /* !! */  != null) {
                    var1_1.accept(var5_5 /* !! */ );
                } else {
                    var5_5 /* !! */  = var2_2;
                    break;
                }
lbl13:
                // 2 sources

                while (true) {
                    var4_4 = var2_2;
                    var2_2 = var3_3;
                    continue block1;
                    break;
                }
                break;
            }
            while (var3_3 != null && var3_3.item == null) {
                if (var5_5 /* !! */  == var3_3) {
                    var2_2 = this.head;
                    continue block0;
                }
                var6_6 = var3_3.next;
                var5_5 /* !! */  = var3_3;
                var3_3 = var6_6;
            }
            break;
        }
        var2_2 = this.d(var4_4, var2_2, (Node)var5_5 /* !! */ , var3_3);
        ** while (true)
    }

    @Override
    public final void clear() {
        this.a((Predicate)new Object());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean contains(Object var1_1) {
        if (var1_1 == null) {
            return false;
        }
        block0: while (true) {
            var2_2 = this.head;
            var4_4 = null;
            block1: while (true) {
                if (var2_2 == null) {
                    return false;
                }
                var3_3 = var2_2.next;
                var5_5 /* !! */  = var2_2.item;
                if (var5_5 /* !! */  != null) {
                    if (var1_1.equals(var5_5 /* !! */ )) {
                        return true;
                    }
                    var4_4 = var2_2;
                } else {
                    var5_5 /* !! */  = var2_2;
                    break;
                }
lbl18:
                // 2 sources

                while (true) {
                    var2_2 = var3_3;
                    continue block1;
                    break;
                }
                break;
            }
            while (var3_3 != null && var3_3.item == null) {
                if (var5_5 /* !! */  == var3_3) continue block0;
                var6_6 = var3_3.next;
                var5_5 /* !! */  = var3_3;
                var3_3 = var6_6;
            }
            break;
        }
        var4_4 = this.d(var4_4, var2_2, (Node)var5_5 /* !! */ , var3_3);
        ** while (true)
    }

    final void f(Node node, Node node2) {
        if (node != node2 && a.a(this, node, node2)) {
            d.i(node, node);
        }
    }

    @Override
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.c(consumer, this.head);
    }

    @Override
    public boolean isEmpty() {
        boolean bl2 = this.b() == null;
        return bl2;
    }

    @Override
    public Iterator<E> iterator() {
        return new x(this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean offer(E var1_1) {
        var5_2 = new Node<E>(Objects.requireNonNull(var1_1 /* !! */ ));
        var2_3 = this.tail;
        var1_1 /* !! */  = var2_3;
        while (true) {
            if ((var4_5 = var2_3.next) == null) {
                if (!ConcurrentLinkedQueue.d.a(var2_3, null, var5_2)) continue;
                if (var2_3 != var1_1 /* !! */ ) {
                    ConcurrentLinkedQueue.b.l(this, var1_1 /* !! */ , var5_2);
                }
                return true;
            }
            if (var2_3 == var4_5) {
                var2_3 = this.tail;
                var1_1 /* !! */  = var1_1 /* !! */  != var2_3 ? var2_3 : this.head;
                var3_4 /* !! */  = var2_3;
                var2_3 = var1_1 /* !! */ ;
                var1_1 /* !! */  = var3_4 /* !! */ ;
                continue;
            }
            var3_4 /* !! */  = var1_1 /* !! */ ;
            if (var2_3 == var1_1 /* !! */ ) ** GOTO lbl25
            var2_3 = this.tail;
            if (var1_1 /* !! */  != var2_3) {
                var1_1 /* !! */  = var2_3;
            } else {
                var3_4 /* !! */  = var2_3;
lbl25:
                // 2 sources

                var2_3 = var3_4 /* !! */ ;
                var1_1 /* !! */  = var4_5;
            }
            var3_4 /* !! */  = var1_1 /* !! */ ;
            var1_1 /* !! */  = var2_3;
            var2_3 = var3_4 /* !! */ ;
        }
    }

    @Override
    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    public final Object peek() {
        Object e2;
        Node<E> node;
        Node<E> node2;
        block0: while (true) {
            Node node3;
            node = node2 = this.head;
            while ((e2 = node.item) == null && (node3 = node.next) != null) {
                if (node == node3) continue block0;
                node = node3;
            }
            break;
        }
        this.f(node2, node);
        return e2;
    }

    @Override
    public E poll() {
        block0: while (true) {
            Node<E> node;
            Node<E> node2 = node = this.head;
            while (true) {
                Node node3;
                Object e2;
                if ((e2 = node2.item) != null && c.a(node2, e2, null)) {
                    if (node2 != node) {
                        node3 = node2.next;
                        if (node3 != null) {
                            node2 = node3;
                        }
                        this.f(node, node2);
                    }
                    return e2;
                }
                node3 = node2.next;
                if (node3 == null) {
                    this.f(node, node2);
                    return null;
                }
                if (node2 == node3) continue block0;
                node2 = node3;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean remove(Object var1_1) {
        if (var1_1 == null) {
            return false;
        }
        block0: while (true) {
            var2_2 = this.head;
            var4_4 = null;
            block1: while (true) {
                if (var2_2 == null) {
                    return false;
                }
                var3_3 = var2_2.next;
                var5_5 /* !! */  = var2_2.item;
                if (var5_5 /* !! */  != null) {
                    if (var1_1.equals(var5_5 /* !! */ ) && ConcurrentLinkedQueue.c.a(var2_2, var5_5 /* !! */ , null)) {
                        this.d(var4_4, var2_2, var2_2, var3_3);
                        return true;
                    }
                    var4_4 = var2_2;
                } else {
                    var5_5 /* !! */  = var2_2;
                    break;
                }
lbl20:
                // 2 sources

                while (true) {
                    var2_2 = var3_3;
                    continue block1;
                    break;
                }
                break;
            }
            while (var3_3 != null && var3_3.item == null) {
                if (var5_5 /* !! */  == var3_3) continue block0;
                var6_6 = var3_3.next;
                var5_5 /* !! */  = var3_3;
                var3_3 = var6_6;
            }
            break;
        }
        var4_4 = this.d(var4_4, var2_2, (Node)var5_5 /* !! */ , var3_3);
        ** while (true)
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        Objects.requireNonNull(collection);
        return this.a(new u(collection, 1));
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return this.a(predicate);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection) {
        Objects.requireNonNull(collection);
        return this.a(new u(collection, 0));
    }

    @Override
    public final int size() {
        int n2;
        block0: while (true) {
            Node node = this.b();
            int n3 = 0;
            while (true) {
                Node node2;
                n2 = n3;
                if (node == null) break block0;
                n2 = n3++;
                if (node.item != null) {
                    n2 = n3;
                    if (n3 == Integer.MAX_VALUE) {
                        n2 = n3;
                        break block0;
                    }
                }
                if (node == (node2 = node.next)) continue block0;
                node = node2;
                n3 = n2;
            }
            break;
        }
        return n2;
    }

    @Override
    public final Spliterator spliterator() {
        return new w(this);
    }

    @Override
    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return this.e(null);
    }

    @Override
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        Objects.requireNonNull(objectArray);
        return this.e(objectArray);
    }

    @Override
    public final String toString() {
        int n2;
        int n3;
        Object object;
        int n4;
        int n5;
        String[] stringArray;
        Object object2 = null;
        block0: while (true) {
            stringArray = this.b();
            n5 = 0;
            n4 = 0;
            object = object2;
            while (stringArray != null) {
                Object e2 = stringArray.item;
                object2 = object;
                n3 = n5;
                n2 = n4;
                if (e2 != null) {
                    if (object == null) {
                        object2 = new String[4];
                    } else {
                        object2 = object;
                        if (n5 == ((String[])object).length) {
                            object2 = Arrays.copyOf(object, n5 * 2);
                        }
                    }
                    object2[n5] = object = e2.toString();
                    n2 = n4 + ((String)object).length();
                    n3 = n5 + 1;
                }
                if (stringArray == (object = stringArray.next)) continue block0;
                stringArray = object;
                object = object2;
                n5 = n3;
                n4 = n2;
            }
            break;
        }
        if (n5 == 0) {
            return "[]";
        }
        stringArray = (String[])new char[n5 * 2 + n4];
        stringArray[0] = 91;
        n4 = 1;
        for (n2 = 0; n2 < n5; ++n2) {
            n3 = n4;
            if (n2 > 0) {
                stringArray[n4] = (String)44;
                n3 = n4 + 2;
                stringArray[n4 + 1] = (String)32;
            }
            object2 = object[n2];
            n4 = ((String)object2).length();
            ((String)object2).getChars(0, n4, (char[])stringArray, n3);
            n4 = n3 + n4;
        }
        stringArray[n4] = (String)93;
        return new String((char[])stringArray);
    }

    static final class Node<E> {
        volatile E item;
        volatile Node<E> next;

        Node() {
        }

        Node(Object object) {
            c.f(this, object);
        }
    }
}

