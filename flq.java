/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.LongUnaryOperator$_CC;
import java.util.function.LongUnaryOperator;

public final class flq
implements LongUnaryOperator {
    public final fme a;

    public /* synthetic */ flq(fme fme2) {
        this.a = fme2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$_CC.$default$andThen(this, longUnaryOperator);
    }

    @Override
    public final long applyAsLong(long l2) {
        return Math.max(l2, this.a.c);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$_CC.$default$compose(this, longUnaryOperator);
    }
}

