/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.Predicate$_CC;
import java.util.function.Predicate;

public final class v
implements Predicate {
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        object = ConcurrentLinkedQueue.c;
        return true;
    }
}

