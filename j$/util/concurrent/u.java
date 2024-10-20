/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.com.android.tools.r8.b;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.Predicate$_CC;
import java.util.Collection;
import java.util.function.Predicate;

public final class u
implements Predicate {
    public final int a;
    public final Collection b;

    public /* synthetic */ u(Collection collection, int n2) {
        this.a = n2;
        this.b = collection;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$negate(this);
            }
            case 0: 
        }
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        Collection collection = this.b;
        switch (this.a) {
            default: {
                b b2 = ConcurrentLinkedQueue.c;
                return collection.contains(object);
            }
            case 0: 
        }
        b b3 = ConcurrentLinkedQueue.c;
        return collection.contains(object) ^ true;
    }
}

