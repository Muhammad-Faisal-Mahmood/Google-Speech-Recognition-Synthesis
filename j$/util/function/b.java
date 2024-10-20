/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.BiPredicate$_CC;
import java.util.function.BiPredicate;

public final class b
implements BiPredicate {
    public final int a;
    public final BiPredicate b;
    public final BiPredicate c;

    public /* synthetic */ b(BiPredicate biPredicate, BiPredicate biPredicate2, int n2) {
        this.a = n2;
        this.b = biPredicate;
        this.c = biPredicate2;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        switch (this.a) {
            default: {
                return BiPredicate$_CC.$default$and(this, biPredicate);
            }
            case 0: 
        }
        return BiPredicate$_CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        switch (this.a) {
            default: {
                return BiPredicate$_CC.$default$negate(this);
            }
            case 0: 
        }
        return BiPredicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        switch (this.a) {
            default: {
                return BiPredicate$_CC.$default$or(this, biPredicate);
            }
            case 0: 
        }
        return BiPredicate$_CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object object, Object object2) {
        switch (this.a) {
            default: {
                boolean bl2 = this.b.test(object, object2) && this.c.test(object, object2);
                return bl2;
            }
            case 0: 
        }
        boolean bl3 = this.b.test(object, object2) || this.c.test(object, object2);
        return bl3;
    }
}

