/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.function.LongUnaryOperator$_CC;
import java.util.function.LongUnaryOperator;

public final class h
implements LongUnaryOperator {
    public final int a;
    public final LongUnaryOperator b;
    public final LongUnaryOperator c;

    public /* synthetic */ h(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int n2) {
        this.a = n2;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            default: {
                return LongUnaryOperator$_CC.$default$andThen(this, longUnaryOperator);
            }
            case 0: 
        }
        return LongUnaryOperator$_CC.$default$andThen(this, longUnaryOperator);
    }

    @Override
    public final long applyAsLong(long l2) {
        switch (this.a) {
            default: {
                l2 = this.c.applyAsLong(l2);
                return this.b.applyAsLong(l2);
            }
            case 0: 
        }
        l2 = this.b.applyAsLong(l2);
        return this.c.applyAsLong(l2);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            default: {
                return LongUnaryOperator$_CC.$default$compose(this, longUnaryOperator);
            }
            case 0: 
        }
        return LongUnaryOperator$_CC.$default$compose(this, longUnaryOperator);
    }
}

