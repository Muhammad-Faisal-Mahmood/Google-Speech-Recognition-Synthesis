/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Function$_CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class fft
implements UnaryOperator {
    public final ffu a;
    public final int b;

    public /* synthetic */ fft(ffu ffu2, int n2) {
        this.a = ffu2;
        this.b = n2;
    }

    @Override
    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object object) {
        if ((object = (hpp)object) != null) {
            object.cancel(false);
        }
        int n2 = this.b;
        object = this.a;
        Runnable runnable = gqk.i(new cdw(object, n2, 3, null));
        long l2 = n2;
        return ((ffu)object).b.b.b(runnable, l2, TimeUnit.MILLISECONDS);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

