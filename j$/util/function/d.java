/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.Function$_CC;
import java.util.function.Function;

public final class d
implements Function {
    public final int a;
    public final Function b;
    public final Function c;

    public /* synthetic */ d(Function function, Function function2, int n2) {
        this.a = n2;
        this.b = function;
        this.c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                object = this.c.apply(object);
                return this.b.apply(object);
            }
            case 0: 
        }
        object = this.b.apply(object);
        return this.c.apply(object);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$compose(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$compose(this, function);
    }
}

