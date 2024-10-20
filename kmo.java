/*
 * Decompiled with CFR 0.152.
 */
public final class kmo {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c2) {
        block5: {
            int n2;
            block3: {
                block4: {
                    block2: {
                        if (c2 < '0' || c2 >= ':') break block2;
                        n2 = c2 - 48;
                        break block3;
                    }
                    if (c2 < 'a' || c2 >= 'g') break block4;
                    n2 = c2 - 87;
                    break block3;
                }
                if (c2 < 'A' || c2 >= 'G') break block5;
                n2 = c2 - 55;
            }
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected hex digit: ");
        stringBuilder.append(c2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

