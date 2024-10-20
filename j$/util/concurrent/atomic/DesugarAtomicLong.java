/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

public class DesugarAtomicLong {
    public static long getAndUpdate(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long l2;
        while (!atomicLong.compareAndSet(l2 = atomicLong.get(), longUnaryOperator.applyAsLong(l2))) {
        }
        return l2;
    }

    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long l2;
        long l3;
        while (!atomicLong.compareAndSet(l3 = atomicLong.get(), l2 = longUnaryOperator.applyAsLong(l3))) {
        }
        return l2;
    }
}

