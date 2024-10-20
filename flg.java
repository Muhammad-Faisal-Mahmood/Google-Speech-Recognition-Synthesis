/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Function$_CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class flg
implements UnaryOperator {
    private final int a;

    public /* synthetic */ flg(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ Function andThen(Function function) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return Function$_CC.$default$andThen(this, function);
                }
                return Function$_CC.$default$andThen(this, function);
            }
            return Function$_CC.$default$andThen(this, function);
        }
        return Function$_CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object object) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (((fli)(object = (fli)object)).a()) {
                        return object;
                    }
                    return new fli(((fli)object).a, ((fli)object).b + 1);
                }
                object = (fli)object;
                n2 = ((fli)object).b;
                if (n2 == 0) {
                    return object;
                }
                return new fli(((fli)object).a, n2 - 1);
            }
            if ((object = (hpp)object) != null) {
                object.cancel(false);
            }
            return null;
        }
        return new fli(false, ((fli)object).b);
    }

    public final /* synthetic */ Function compose(Function function) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return Function$_CC.$default$compose(this, function);
                }
                return Function$_CC.$default$compose(this, function);
            }
            return Function$_CC.$default$compose(this, function);
        }
        return Function$_CC.$default$compose(this, function);
    }
}

