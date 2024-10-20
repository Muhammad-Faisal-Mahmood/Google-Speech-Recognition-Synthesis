/*
 * Decompiled with CFR 0.152.
 */
public final class dcz {
    public int a;
    public int b;
    public String c;
    int d;
    int e = -1;

    public final int hashCode() {
        int n2 = this.d;
        int n3 = this.b;
        int n4 = n2;
        if (n2 == 0) {
            int n5;
            n4 = 0;
            n2 = 0;
            if (n3 - n5 > 0) {
                n4 = n2;
                for (n5 = this.a; n5 <= this.b; ++n5) {
                    n4 = n4 * 31 + this.c.charAt(n5);
                }
                this.d = n4;
            }
        }
        return n4;
    }

    public final String toString() {
        String string = this.c;
        string = string != null ? string.substring(this.a, this.b + 1) : "";
        return string;
    }
}

