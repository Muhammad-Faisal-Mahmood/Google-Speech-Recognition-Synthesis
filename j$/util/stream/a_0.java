/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.L;
import j$.util.Map$_EL;
import j$.util.Spliterator;
import j$.util.function.BiFunction$_CC;
import j$.util.function.Consumer$_CC;
import j$.util.stream.B0;
import j$.util.stream.Collectors;
import j$.util.stream.J0;
import j$.util.stream.N;
import j$.util.stream.R0;
import j$.util.stream.T0;
import j$.util.stream.b_0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.a
 */
public final class a_0
implements Supplier,
BinaryOperator,
LongFunction,
Consumer,
BooleanSupplier {
    public final int a;
    public final Object b;

    public /* synthetic */ a_0(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public void accept(Object object) {
        switch (this.a) {
            default: {
                ((ArrayList)this.b).add(object);
                return;
            }
            case 4: 
        }
        ((B0)this.b).accept(object);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$_CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 4: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public Object apply(long l2) {
        Object object = l2 >= 0L && l2 < 0x7FFFFFF7L ? new N(l2, (IntFunction)this.b) : new J0();
        return object;
    }

    @Override
    public Object apply(Object object, Object object22) {
        object = (Map)object;
        Map map = (Map)object22;
        Set set = Collectors.a;
        for (Map.Entry entry : map.entrySet()) {
            Map$_EL.b((Map)object, entry.getKey(), entry.getValue(), (BinaryOperator)this.b);
        }
        return object;
    }

    public Object get() {
        Object object = this.b;
        switch (this.a) {
            default: {
                return (Spliterator)object;
            }
            case 1: {
                Set set = Collectors.a;
                return new L((CharSequence)object);
            }
            case 0: 
        }
        return ((b_0)object).l();
    }

    @Override
    public boolean getAsBoolean() {
        switch (this.a) {
            default: {
                T0 t0 = (T0)this.b;
                return t0.d.o(t0.e);
            }
            case 5: 
        }
        R0 r0 = (R0)this.b;
        return r0.d.o(r0.e);
    }
}

