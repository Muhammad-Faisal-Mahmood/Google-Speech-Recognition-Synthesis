/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Map$_EL;
import j$.util.function.BiConsumer$_CC;
import j$.util.stream.Collectors;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/*
 * Renamed from j$.util.stream.i
 */
public final class i_0
implements BiConsumer {
    public final Function a;
    public final Function b;
    public final BinaryOperator c;

    public /* synthetic */ i_0(Function function, Function function2, BinaryOperator binaryOperator) {
        this.a = function;
        this.b = function2;
        this.c = binaryOperator;
    }

    public final void accept(Object object, Object object2) {
        Map map = (Map)object;
        object = Collectors.a;
        Map$_EL.b(map, this.a.apply(object2), this.b.apply(object2), this.c);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }
}

