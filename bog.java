/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarArrays;
import j$.util.function.IntPredicate$_CC;
import java.util.function.IntPredicate;

public final class bog
implements IntPredicate {
    public final boi a;

    public /* synthetic */ bog(boi boi2) {
        this.a = boi2;
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
        return DesugarArrays.stream(this.a.a).noneMatch(new boh(n2));
    }
}

