/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.IntPredicate$_CC;
import java.util.function.IntPredicate;

public final class f
implements IntPredicate {
    public final int a;
    public final IntPredicate b;
    public final IntPredicate c;

    public /* synthetic */ f(IntPredicate intPredicate, IntPredicate intPredicate2, int n2) {
        this.a = n2;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
            default: {
                return IntPredicate$_CC.$default$and(this, intPredicate);
            }
            case 0: 
        }
        return IntPredicate$_CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.a) {
            default: {
                return IntPredicate$_CC.$default$negate(this);
            }
            case 0: 
        }
        return IntPredicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
            default: {
                return IntPredicate$_CC.$default$or(this, intPredicate);
            }
            case 0: 
        }
        return IntPredicate$_CC.$default$or(this, intPredicate);
    }

    @Override
    public final boolean test(int n2) {
        switch (this.a) {
            default: {
                boolean bl2 = this.b.test(n2) && this.c.test(n2);
                return bl2;
            }
            case 0: 
        }
        boolean bl3 = this.b.test(n2) || this.c.test(n2);
        return bl3;
    }
}

