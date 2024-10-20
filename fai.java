/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.function.Predicate$_CC;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public final class fai
implements Predicate {
    public final Object a;
    private final int b;

    public /* synthetic */ fai(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            default: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 14: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 13: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 12: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 11: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 10: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 9: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 8: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 7: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 6: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 5: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 4: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 3: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 2: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 1: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
            default: {
                return Predicate$_CC.$default$negate(this);
            }
            case 14: {
                return Predicate$_CC.$default$negate(this);
            }
            case 13: {
                return Predicate$_CC.$default$negate(this);
            }
            case 12: {
                return Predicate$_CC.$default$negate(this);
            }
            case 11: {
                return Predicate$_CC.$default$negate(this);
            }
            case 10: {
                return Predicate$_CC.$default$negate(this);
            }
            case 9: {
                return Predicate$_CC.$default$negate(this);
            }
            case 8: {
                return Predicate$_CC.$default$negate(this);
            }
            case 7: {
                return Predicate$_CC.$default$negate(this);
            }
            case 6: {
                return Predicate$_CC.$default$negate(this);
            }
            case 5: {
                return Predicate$_CC.$default$negate(this);
            }
            case 4: {
                return Predicate$_CC.$default$negate(this);
            }
            case 3: {
                return Predicate$_CC.$default$negate(this);
            }
            case 2: {
                return Predicate$_CC.$default$negate(this);
            }
            case 1: {
                return Predicate$_CC.$default$negate(this);
            }
            case 0: 
        }
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            default: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 14: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 13: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 12: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 11: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 10: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 9: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 8: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 7: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 6: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 5: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 4: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 3: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 2: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 1: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        switch (this.b) {
            default: {
                Map.Entry entry = (Map.Entry)object;
                object = entry.getKey();
                entry = entry.getValue();
                return ag$$ExternalSyntheticApiModelOutline1.m((BiPredicate)this.a, object, (Object)entry);
            }
            case 14: {
                object = (gkl)((Map.Entry)object).getValue();
                return !((gld)this.a).m((gkl)object);
            }
            case 13: {
                object = (iaz)object;
                return new hxd(((fhv)this.a).f, fhv.b).contains(object);
            }
            case 12: {
                object = (String)object;
                return this.a.contains(object);
            }
            case 11: {
                return ((fen)object).c.equals(this.a);
            }
            case 10: {
                object = (ezj)object;
                hfn hfn2 = fcl.a;
                return ((ezj)object).a.toLanguageTag().equals(this.a);
            }
            case 9: {
                object = (ezj)object;
                return Collection$_EL.stream((Collection)this.a).noneMatch(new fai(object, 7));
            }
            case 8: {
                return ((ezj)object).a.equals(this.a);
            }
            case 7: {
                return ((ezj)object).d((ezj)this.a);
            }
            case 6: {
                return ((ezj)object).a.equals(this.a);
            }
            case 5: {
                object = (fal)object;
                hfn hfn3 = fbj.a;
                return ((fal)object).b.equals(((ezj)this.a).a.toLanguageTag());
            }
            case 4: {
                object = (fan)object;
                Object object2 = fbj.a;
                object = Collection$_EL.stream(((fan)object).h);
                object2 = this.a;
                return object.filter(new fai(object2, 5)).anyMatch(new fai(object2, 3));
            }
            case 3: {
                object = (fal)object;
                hfn hfn4 = fbj.a;
                return Collection$_EL.stream(((fal)object).c).anyMatch(new fai(this.a, 2));
            }
            case 2: {
                object = (Long)object;
                hfn hfn5 = fbj.a;
                return (Long)object == (long)((ezj)this.a).b;
            }
            case 1: {
                int n2 = (Integer)object;
                object = (huw)this.a;
                return fah.d(n2, ((huw)object).d, ((huw)object).f);
            }
            case 0: 
        }
        ezj ezj2 = (ezj)object;
        object = faj.a;
        return ezj2.a.toLanguageTag().equals(this.a);
    }
}

