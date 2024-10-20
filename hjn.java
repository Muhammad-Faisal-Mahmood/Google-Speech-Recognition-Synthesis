/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiFunction$_CC;
import java.util.AbstractMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class hjn
implements BiFunction {
    private final int a;

    public /* synthetic */ hjn(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        if (this.a != 0) {
            return BiFunction$_CC.$default$andThen(this, function);
        }
        return BiFunction$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object, Object object2) {
        if (this.a != 0) {
            object = (Integer)object;
            object2 = (ibz)object2;
            object = idq.b((Integer)object);
            fxf.K(object);
            return object;
        }
        return new AbstractMap.SimpleImmutableEntry<Object, Object>(object, object2);
    }
}

