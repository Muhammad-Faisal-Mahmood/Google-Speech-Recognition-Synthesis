/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Predicate$_CC;
import java.util.function.Predicate;

public final class fbd
implements Predicate {
    public final int a;
    private final int b;

    public /* synthetic */ fbd(int n2, int n3) {
        this.b = n3;
        this.a = n2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        if (this.b != 0) {
            return Predicate$_CC.$default$and(this, predicate);
        }
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        if (this.b != 0) {
            return Predicate$_CC.$default$negate(this);
        }
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        if (this.b != 0) {
            return Predicate$_CC.$default$or(this, predicate);
        }
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        int n2;
        if (this.b != 0) {
            object = (bpq)object;
            hei hei2 = cni.a;
            return ((bpq)object).c == this.a;
        }
        int n3 = n2 = a.v(((csg)object).g);
        if (n2 == 0) {
            n3 = 1;
        }
        return n3 == this.a;
    }
}

