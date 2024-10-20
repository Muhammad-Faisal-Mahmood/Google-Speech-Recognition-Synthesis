/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer$_CC;
import j$.util.function.BiFunction$_CC;
import j$.util.function.Function$_CC;
import j$.util.function.Predicate$_CC;
import j$.util.stream.Collectors;
import j$.util.stream.I0;
import j$.util.stream.J;
import j$.util.stream.L;
import j$.util.stream.M;
import j$.util.stream.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.h
 */
public final class h_0
implements BinaryOperator,
Function,
Supplier,
LongFunction,
IntFunction,
BiConsumer,
Predicate,
IntBinaryOperator {
    public final int a;

    public /* synthetic */ h_0(int n2) {
        this.a = n2;
    }

    public void accept(Object object, Object object2) {
        switch (this.a) {
            default: {
                ((LinkedHashSet)object).addAll((LinkedHashSet)object2);
                return;
            }
            case 15: {
                ((LinkedHashSet)object).add(object2);
                return;
            }
            case 11: {
                ((j$.util.L)object).a((CharSequence)object2);
                return;
            }
            case 10: {
                ((List)object).add(object2);
                return;
            }
            case 8: 
        }
        ((Collection)object).add(object2);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$_CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            default: {
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            case 15: {
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            case 11: {
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            case 10: {
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            case 8: 
        }
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            default: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 6: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 5: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 1: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 0: 
        }
        return BiFunction$_CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 2: 
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public Object apply(int n2) {
        switch (this.a) {
            default: {
                return new Object[n2];
            }
            case 19: {
                return new Integer[n2];
            }
            case 18: {
                return new Object[n2];
            }
            case 7: 
        }
        return new Object[n2];
    }

    public Object apply(long l2) {
        Object object = l2 >= 0L && l2 < 0x7FFFFFF7L ? new V(l2) : new I0();
        return object;
    }

    public Object apply(Object object) {
        switch (this.a) {
            default: {
                return ((j$.util.L)object).toString();
            }
            case 2: 
        }
        Set set = Collectors.a;
        return object;
    }

    @Override
    public Object apply(Object object, Object object2) {
        switch (this.a) {
            default: {
                object = (j$.util.L)object;
                ((j$.util.L)object).d((j$.util.L)object2);
                return object;
            }
            case 6: {
                return new M((L)object, (L)object2);
            }
            case 5: {
                return new M((J)object, (J)object2);
            }
            case 1: {
                object = (List)object;
                object2 = (List)object2;
                Set set = Collectors.a;
                object.addAll(object2);
                return object;
            }
            case 0: 
        }
        object = (Collection)object;
        Collection collection = (Collection)object2;
        object2 = Collectors.a;
        object.addAll(collection);
        return object;
    }

    @Override
    public int applyAsInt(int n2, int n3) {
        return n2 + n3;
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$compose(this, function);
            }
            case 2: 
        }
        return Function$_CC.$default$compose(this, function);
    }

    public Object get() {
        switch (this.a) {
            default: {
                return new LinkedHashSet();
            }
            case 9: {
                return new ArrayList();
            }
            case 3: 
        }
        return new Object();
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$_CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$_CC.$default$or(this, predicate);
    }

    public boolean test(Object object) {
        return ((Optional)object).isPresent();
    }
}

