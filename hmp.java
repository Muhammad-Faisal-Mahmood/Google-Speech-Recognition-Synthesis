/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class hmp {
    private static final byte[] a;

    static {
        byte[] byArray = new byte[128];
        Arrays.fill(byArray, (byte)-1);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= 10) break;
            byArray[n3 + 48] = (byte)n3;
            ++n3;
        }
        for (int i2 = n2; i2 < 26; ++i2) {
            byte by2;
            byArray[i2 + 65] = by2 = (byte)(i2 + 10);
            byArray[i2 + 97] = by2;
        }
        a = byArray;
    }

    public static int a(char c2) {
        if (c2 < '\u0080') {
            return a[c2];
        }
        return -1;
    }
}

