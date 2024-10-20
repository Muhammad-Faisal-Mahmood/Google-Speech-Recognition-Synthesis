/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.BiFunction$_CC;
import j$.util.function.BiPredicate$_CC;
import j$.util.function.IntPredicate$_CC;
import j$.util.function.Predicate$_CC;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public final class a
implements BiPredicate,
BinaryOperator,
IntPredicate,
Predicate {
    public final Object a;

    public /* synthetic */ a(Object object) {
        this.a = object;
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$_CC.$default$and(this, biPredicate);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$_CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$_CC.$default$andThen(this, function);
    }

    @Override
    public Object apply(Object object, Object object2) {
        if (((Comparator)this.a).compare(object, object2) < 0) {
            object = object2;
        }
        return object;
    }

    public /* synthetic */ BiPredicate negate() {
        return BiPredicate$_CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate negate() {
        return IntPredicate$_CC.$default$negate(this);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$_CC.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$_CC.$default$or(this, biPredicate);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$or(this, intPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$_CC.$default$or(this, predicate);
    }

    @Override
    public boolean test(int n2) {
        return ((IntPredicate)this.a).test(n2) ^ true;
    }

    public boolean test(Object object) {
        return ((Predicate)this.a).test(object) ^ true;
    }

    public boolean test(Object object, Object object2) {
        return ((BiPredicate)this.a).test(object, object2) ^ true;
    }
}

