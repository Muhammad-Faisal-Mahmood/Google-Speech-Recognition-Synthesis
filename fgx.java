/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Function$_CC;
import java.util.function.Function;

public final class fgx
implements Function {
    public final int a;

    public /* synthetic */ fgx(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        object = new fhc((fhd)object);
        ((fhc)object).d(this.a);
        return ((fhc)object).a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

