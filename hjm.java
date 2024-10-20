/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Function$_CC;
import java.util.Map;
import java.util.function.Function;

public final class hjm
implements Function {
    private final int a;

    public /* synthetic */ hjm(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return Function$_CC.$default$andThen(this, function);
            }
            return Function$_CC.$default$andThen(this, function);
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return ((kof)object).d();
            }
            return ((Map.Entry)object).getKey();
        }
        return ((Map.Entry)object).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return Function$_CC.$default$compose(this, function);
            }
            return Function$_CC.$default$compose(this, function);
        }
        return Function$_CC.$default$compose(this, function);
    }
}

