/*
 * Decompiled with CFR 0.152.
 */
public abstract class hio {
    private static final char[] a = "0123456789abcdef".toCharArray();
    public static final int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract boolean c(hio var1);

    public byte[] d() {
        throw null;
    }

    public final boolean equals(Object object) {
        if (object instanceof hio) {
            object = (hio)object;
            if (this.b() == ((hio)object).b() && this.c((hio)object)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b() >= 32) {
            return this.a();
        }
        byte[] byArray = this.d();
        int n2 = byArray[0] & 0xFF;
        for (int i2 = 1; i2 < byArray.length; ++i2) {
            n2 |= (byArray[i2] & 0xFF) << i2 * 8;
        }
        return n2;
    }

    public final String toString() {
        byte[] byArray = this.d();
        int n2 = byArray.length;
        StringBuilder stringBuilder = new StringBuilder(n2 + n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = byArray[i2];
            char[] cArray = a;
            stringBuilder.append(cArray[by2 >> 4 & 0xF]);
            stringBuilder.append(cArray[by2 & 0xF]);
        }
        return stringBuilder.toString();
    }
}

