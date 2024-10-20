/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.function.BiConsumer$_CC;
import j$.util.function.BiFunction$_CC;
import j$.util.function.Consumer$_CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public final class y
implements BiConsumer,
BiFunction,
Consumer {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ y(int n2, Object object, Object object2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    public /* synthetic */ y(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    public void accept(Object object) {
        ((Consumer)this.b).accept(object);
        ((Consumer)this.c).accept(object);
    }

    public void accept(Object object, Object object2) {
        ConcurrentMap concurrentMap;
        Object object3 = object2;
        switch (this.a) {
            default: {
                ((BiConsumer)this.b).accept(object, object2);
                ((BiConsumer)this.c).accept(object, object2);
                return;
            }
            case 0: 
        }
        while (!(concurrentMap = (ConcurrentMap)this.b).replace(object, object3, object2 = ((BiFunction)this.c).apply(object, object3))) {
            object3 = object2 = concurrentMap.get(object);
            if (object2 != null) continue;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            default: {
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            case 0: 
        }
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$_CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public Object apply(Object object, Object object2) {
        object = ((BiFunction)this.c).apply(object, object2);
        return ((Function)this.b).apply(object);
    }
}

