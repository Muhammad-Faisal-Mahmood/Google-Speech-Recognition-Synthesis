/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Function$_CC;
import java.util.function.Function;

abstract class bzr
implements Function {
    public abstract void a(bso var1, hwp var2);

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public void b(bso bso2, hwp hwp2) {
        throw null;
    }

    public abstract void c(bso var1, hwp var2);

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }

    public abstract void d(bso var1, hwp var2);
}

