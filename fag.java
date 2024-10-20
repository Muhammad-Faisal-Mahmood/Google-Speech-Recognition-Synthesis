/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiFunction$_CC;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class fag
implements BiFunction {
    public final hac a;

    public /* synthetic */ fag(hac hac2) {
        this.a = hac2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object, Object object2) {
        object = (Integer)object;
        object = (hav)this.a.get((ibz)object2);
        fxf.K(object);
        return object;
    }
}

