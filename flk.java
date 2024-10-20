/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.LongUnaryOperator$_CC;
import java.util.function.LongUnaryOperator;

public final class flk
implements LongUnaryOperator {
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$_CC.$default$andThen(this, longUnaryOperator);
    }

    @Override
    public final long applyAsLong(long l2) {
        return Math.max(l2, cgw.p().toEpochMilli());
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$_CC.$default$compose(this, longUnaryOperator);
    }
}

