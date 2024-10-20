/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiPredicate$_CC;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public final class hjo
implements BiPredicate {
    public final Predicate a;
    private final int b;

    public /* synthetic */ hjo(Predicate predicate, int n2) {
        this.b = n2;
        this.a = predicate;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        if (this.b != 0) {
            return BiPredicate$_CC.$default$and(this, biPredicate);
        }
        return BiPredicate$_CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        if (this.b != 0) {
            return BiPredicate$_CC.$default$negate(this);
        }
        return BiPredicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        if (this.b != 0) {
            return BiPredicate$_CC.$default$or(this, biPredicate);
        }
        return BiPredicate$_CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object object, Object object2) {
        if (this.b != 0) {
            return ag$$ExternalSyntheticApiModelOutline1.m(this.a, object);
        }
        return ag$$ExternalSyntheticApiModelOutline1.m(this.a, object2);
    }
}

