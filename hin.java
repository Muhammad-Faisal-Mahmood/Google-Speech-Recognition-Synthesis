/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class hin
extends hio
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final byte[] a;

    public hin(byte[] byArray) {
        fxf.K(byArray);
        this.a = byArray;
    }

    @Override
    public final int a() {
        int n2 = this.a.length;
        boolean bl2 = n2 >= 4;
        fxf.C(bl2, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", n2);
        byte[] byArray = this.a;
        byte by2 = byArray[0];
        byte by3 = byArray[1];
        n2 = byArray[2];
        return (byArray[3] & 0xFF) << 24 | (by2 & 0xFF | (by3 & 0xFF) << 8 | (n2 & 0xFF) << 16);
    }

    @Override
    public final int b() {
        return this.a.length * 8;
    }

    @Override
    public final boolean c(hio hio2) {
        int n2 = hio2.d().length;
        if (this.a.length == n2) {
            byte[] byArray;
            boolean bl2 = true;
            for (n2 = 0; n2 < (byArray = this.a).length; ++n2) {
                boolean bl3 = byArray[n2] == hio2.d()[n2];
                bl2 &= bl3;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final byte[] d() {
        return this.a;
    }
}

