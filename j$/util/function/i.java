/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.Predicate$_CC;
import java.util.function.Predicate;

public final class i
implements Predicate {
    public final int a;
    public final Predicate b;
    public final Predicate c;

    public /* synthetic */ i(Predicate predicate, Predicate predicate2, int n2) {
        this.a = n2;
        this.b = predicate;
        this.c = predicate2;
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
        switch (this.a) {
            default: {
                boolean bl2 = this.b.test(object) || this.c.test(object);
                return bl2;
            }
            case 0: 
        }
        boolean bl3 = this.b.test(object) && this.c.test(object);
        return bl3;
    }
}

