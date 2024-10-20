/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class gsn
extends gsy {
    private final char[] a;

    public gsn() {
        char[] cArray = "-_".toString().toCharArray();
        this.a = cArray;
        Arrays.sort(cArray);
    }

    @Override
    public final boolean b(char c2) {
        return Arrays.binarySearch(this.a, c2) >= 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
        char[] cArray = this.a;
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(gsy.d(cArray[i2]));
        }
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }
}

