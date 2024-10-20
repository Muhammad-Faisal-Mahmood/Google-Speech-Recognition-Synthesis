/*
 * Decompiled with CFR 0.152.
 */
public final class kmn {
    public static final byte[] a = kmp.q("0123456789abcdef");

    public static final String a(klm object, long l2) {
        long l3;
        if (l2 > 0L && ((klm)object).c(l3 = -1L + l2) == 13) {
            String string = ((klm)object).l(l3);
            ((klm)object).x(2L);
            object = string;
        } else {
            String string = ((klm)object).l(l2);
            ((klm)object).x(1L);
            object = string;
        }
        return object;
    }
}

