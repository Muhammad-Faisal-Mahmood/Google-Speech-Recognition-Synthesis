/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$_CC;
import j$.util.stream.B;
import j$.util.stream.C;
import j$.util.stream.E;
import j$.util.stream.P0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class A
implements Supplier,
Consumer {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ A(int n2, Object object, Object object2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    public void accept(Object object) {
        switch (this.a) {
            default: {
                ((BiConsumer)this.b).accept(this.c, object);
                return;
            }
            case 3: {
                if (object == null) {
                    ((AtomicBoolean)this.b).set(true);
                } else {
                    Boolean bl2 = Boolean.TRUE;
                    ((ConcurrentHashMap)this.c).putIfAbsent(object, bl2);
                }
                return;
            }
            case 2: 
        }
        ((P0)this.b).r((Consumer)this.c, object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 2: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public Object get() {
        switch (this.a) {
            default: {
                return new B((E)((Object)this.b), (Predicate)this.c);
            }
            case 0: 
        }
        return new C((E)((Object)this.b), (IntPredicate)this.c);
    }
}

