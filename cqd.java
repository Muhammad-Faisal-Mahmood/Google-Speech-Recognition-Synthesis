/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
import android.os.Build;

public final class cqd {
    public static final int[] a;

    static {
        "ranchu".equals(Build.HARDWARE);
        a = new int[]{19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    }

    static int a(int n2) {
        int n3;
        int n4 = 0;
        while (true) {
            int[] nArray = a;
            int n5 = nArray.length;
            n3 = 10;
            if (n4 >= 10) break;
            n3 = n5 = n4 + 1;
            if (n2 >= nArray[n4]) break;
            n4 = n5;
        }
        return n3;
    }
}

