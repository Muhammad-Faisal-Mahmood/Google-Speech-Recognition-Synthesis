/*
 * Decompiled with CFR 0.152.
 */
public final class hmj {
    static {
        Math.log(2.0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(double d2) {
        boolean bl2;
        boolean bl3 = hhk.ax(d2);
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        if (d2 == 0.0) return true;
        fxf.r(hhk.ax(d2), "not a normal value");
        int n2 = Math.getExponent(d2);
        long l2 = Double.doubleToRawLongBits(d2) & 0xFFFFFFFFFFFFFL;
        l2 = n2 == -1023 ? (l2 += l2) : (l2 |= 0x10000000000000L);
        if (52 - Long.numberOfTrailingZeros(l2) <= Math.getExponent(d2)) return true;
        return bl2;
    }
}

