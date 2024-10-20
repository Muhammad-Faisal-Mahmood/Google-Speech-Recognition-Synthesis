/*
 * Decompiled with CFR 0.152.
 */
public final class pd {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];

    public static final int a(int[] nArray, int n2, int n3) {
        jse.e(nArray, "array");
        --n2;
        int n4 = 0;
        while (n4 <= n2) {
            int n5 = n4 + n2 >>> 1;
            int n6 = nArray[n5];
            if (n6 < n3) {
                n4 = n5 + 1;
                continue;
            }
            if (n6 > n3) {
                n2 = n5 - 1;
                continue;
            }
            return n5;
        }
        return ~n4;
    }

    public static final int b(long[] lArray, int n2, long l2) {
        jse.e(lArray, "array");
        --n2;
        int n3 = 0;
        while (n3 <= n2) {
            int n4 = n3 + n2 >>> 1;
            long l3 = lArray[n4] - l2;
            long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (l4 < 0) {
                n3 = n4 + 1;
                continue;
            }
            if (l4 > 0) {
                n2 = n4 - 1;
                continue;
            }
            return n4;
        }
        return ~n3;
    }

    public static final int c(int n2) {
        for (int i2 = 4; i2 < 32; ++i2) {
            int n3 = (1 << i2) - 12;
            if (n2 > n3) continue;
            return n3;
        }
        return n2;
    }

    public static final int d(int n2) {
        return pd.c(n2 * 4) / 4;
    }

    public static final int e(int n2) {
        return pd.c(n2 * 8) / 8;
    }
}

