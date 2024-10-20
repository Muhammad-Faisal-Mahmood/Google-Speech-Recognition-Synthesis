/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent.atomic;

import j$.util.concurrent.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

public class DesugarAtomicReference {
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v2;
        while (!n.a(atomicReference, v2 = atomicReference.get(), unaryOperator.apply(v2))) {
        }
        return v2;
    }

    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        Object r2;
        V v2;
        while (!n.a(atomicReference, v2 = atomicReference.get(), r2 = unaryOperator.apply(v2))) {
        }
        return (V)r2;
    }
}

