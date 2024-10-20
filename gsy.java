/*
 * Decompiled with CFR 0.152.
 */
public abstract class gsy
implements gtq {
    protected gsy() {
    }

    public static String d(char n2) {
        char[] cArray = new char[6];
        int n3 = 0;
        cArray[0] = 92;
        cArray[1] = 117;
        cArray[2] = '\u0000';
        cArray[3] = '\u0000';
        cArray[4] = '\u0000';
        cArray[5] = '\u0000';
        int n4 = n2;
        for (n2 = n3; n2 < 4; ++n2) {
            cArray[5 - n2] = "0123456789ABCDEF".charAt(n4 & 0xF);
            n4 >>= 4;
        }
        return String.copyValueOf(cArray);
    }

    public abstract boolean b(char var1);

    public final int c(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        fxf.M(n2, n3);
        while (n2 < n3) {
            if (this.b(charSequence.charAt(n2))) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public final boolean e(CharSequence charSequence) {
        int n2;
        int n3 = charSequence.length();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (this.b(charSequence.charAt(n2))) continue;
            return false;
        }
        return true;
    }
}

