/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class bbs
extends bby {
    public bbs(Class object, long l2, TimeUnit timeUnit) {
        super((Class)object);
        object = this.b;
        long l3 = timeUnit.toMillis(l2);
        if (l3 < 900000L) {
            bbi.a().f(bhd.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        l2 = jse.m(l3, 900000L);
        l3 = jse.m(l3, 900000L);
        if (l2 < 900000L) {
            bbi.a().f(bhd.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        ((bhd)object).i = jse.m(l2, 900000L);
        if (l3 < 300000L) {
            bbi.a().f(bhd.a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (l3 > ((bhd)object).i) {
            bbi.a().f(bhd.a, a.ap(l2, "Flex duration greater than interval duration; Changed to "));
        }
        ((bhd)object).j = jse.o(l3, 300000L, ((bhd)object).i);
    }
}

