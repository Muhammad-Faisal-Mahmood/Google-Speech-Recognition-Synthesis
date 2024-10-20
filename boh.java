/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.IntPredicate$_CC;
import java.util.function.IntPredicate;

public final class boh
implements IntPredicate {
    public final int a;

    public /* synthetic */ boh(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$or(this, intPredicate);
    }

    @Override
    public final boolean test(int n2) {
        return this.a == n2;
    }
}

