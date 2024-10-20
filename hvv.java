/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class hvv
extends hvy {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public hvv(byte[] byArray, int n2, int n3) {
        this.f = byArray;
        this.g = n3 + n2;
        this.i = n2;
        this.j = n2;
    }

    private final void Q() {
        int n2;
        this.g = n2 = this.g + this.h;
        int n3 = n2 - this.j;
        int n4 = this.l;
        if (n3 > n4) {
            this.h = n4 = n3 - n4;
            this.g = n2 - n4;
            return;
        }
        this.h = 0;
    }

    @Override
    public final void A(int n2) {
        this.l = n2;
        this.Q();
    }

    public final void B(int n2) {
        int n3;
        int n4;
        if (n2 >= 0 && n2 <= (n4 = this.g) - (n3 = this.i)) {
            this.i = n3 + n2;
            return;
        }
        if (n2 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final boolean C() {
        return this.i == this.g;
    }

    @Override
    public final boolean D() {
        return this.r() != 0L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean E(int n2) {
        int n3 = hzo.b(n2);
        int n4 = 0;
        int n5 = 0;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 == 4) return false;
                        if (n3 != 5) throw new hxm();
                        this.B(4);
                        return true;
                    }
                    this.N();
                    this.z(hzo.c(hzo.a(n2), 4));
                    return true;
                }
                this.B(this.j());
                return true;
            }
            this.B(8);
            return true;
        }
        if (this.g - this.i >= 10) {
            for (n2 = n5; n2 < 10; ++n2) {
                byte[] byArray = this.f;
                n5 = this.i;
                this.i = n5 + 1;
                if (byArray[n5] >= 0) return true;
            }
            throw new hxn("CodedInputStream encountered a malformed varint.");
        }
        for (n2 = n4; n2 < 10; ++n2) {
            if (this.a() >= 0) return true;
        }
        throw new hxn("CodedInputStream encountered a malformed varint.");
    }

    @Override
    public final byte[] F() {
        return this.G(this.j());
    }

    public final byte[] G(int n2) {
        int n3;
        int n4;
        if (n2 > 0 && n2 <= (n4 = this.g) - (n3 = this.i)) {
            this.i = n2 += n3;
            return Arrays.copyOfRange(this.f, n3, n2);
        }
        if (n2 <= 0) {
            if (n2 == 0) {
                return hxl.b;
            }
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final byte a() {
        int n2 = this.i;
        if (n2 != this.g) {
            byte[] byArray = this.f;
            this.i = n2 + 1;
            return byArray[n2];
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final double b() {
        return Double.longBitsToDouble(this.q());
    }

    @Override
    public final float c() {
        return Float.intBitsToFloat(this.i());
    }

    @Override
    public final int d() {
        return this.i - this.j;
    }

    @Override
    public final int e(int n2) {
        if (n2 >= 0) {
            int n3 = n2 + this.d();
            if (n3 >= 0) {
                n2 = this.l;
                if (n3 <= n2) {
                    this.l = n3;
                    this.Q();
                    return n2;
                }
                throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new hxn("Failed to parse the message.");
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override
    public final int f() {
        return this.j();
    }

    @Override
    public final int g() {
        return this.i();
    }

    @Override
    public final int h() {
        return this.j();
    }

    public final int i() {
        int n2 = this.i;
        if (this.g - n2 >= 4) {
            byte[] byArray = this.f;
            this.i = n2 + 4;
            byte by2 = byArray[n2];
            byte by3 = byArray[n2 + 1];
            byte by4 = byArray[n2 + 2];
            return (byArray[n2 + 3] & 0xFF) << 24 | ((by3 & 0xFF) << 8 | by2 & 0xFF | (by4 & 0xFF) << 16);
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int j() {
        int n2;
        int n3;
        block4: {
            int n4;
            int n5;
            block9: {
                block8: {
                    block6: {
                        int n6;
                        byte[] byArray;
                        block7: {
                            block5: {
                                block3: {
                                    n3 = this.g;
                                    n5 = this.i;
                                    if (n3 == n5) {
                                        return (int)this.s();
                                    }
                                    byArray = this.f;
                                    n2 = n5 + 1;
                                    n4 = byArray[n5];
                                    if (n4 >= 0) {
                                        this.i = n2;
                                        return n4;
                                    }
                                    if (n3 - n2 < 9) return (int)this.s();
                                    n3 = n5 + 2;
                                    if ((n4 = byArray[n2] << 7 ^ n4) >= 0) break block3;
                                    n2 = n4 ^ 0xFFFFFF80;
                                    break block4;
                                }
                                n2 = n5 + 3;
                                if ((n4 = byArray[n3] << 14 ^ n4) < 0) break block5;
                                n3 = n4 ^ 0x3F80;
                                break block6;
                            }
                            n3 = n5 + 4;
                            if ((n2 = n4 ^ byArray[n2] << 21) >= 0) break block7;
                            n4 = 0xFFE03F80 ^ n2;
                            n2 = n3;
                            n3 = n4;
                            break block8;
                        }
                        n4 = n5 + 5;
                        int n7 = byArray[n3];
                        n3 = n2 ^ n7 << 28 ^ 0xFE03F80;
                        n2 = n4;
                        if (n7 >= 0) break block6;
                        n2 = n7 = n5 + 6;
                        if (byArray[n4] >= 0) break block8;
                        n2 = n6 = n5 + 7;
                        if (byArray[n7] >= 0) break block6;
                        n2 = n4 = n5 + 8;
                        if (byArray[n6] >= 0) break block8;
                        n2 = n7 = n5 + 9;
                        if (byArray[n4] >= 0) break block6;
                        if (byArray[n7] < 0) {
                            return (int)this.s();
                        }
                        break block9;
                    }
                    n4 = n2;
                    n2 = n3;
                    n3 = n4;
                    break block4;
                }
                n4 = n2;
                n2 = n3;
                n3 = n4;
                break block4;
            }
            n4 = n5 + 10;
            n2 = n3;
            n3 = n4;
        }
        this.i = n3;
        return n2;
    }

    @Override
    public final int k() {
        return this.i();
    }

    @Override
    public final int l() {
        return hvv.H(this.j());
    }

    @Override
    public final int m() {
        int n2;
        if (this.C()) {
            this.k = 0;
            return 0;
        }
        this.k = n2 = this.j();
        if (hzo.a(n2) != 0) {
            return n2;
        }
        throw new hxn("Protocol message contained an invalid tag (zero).");
    }

    @Override
    public final int n() {
        return this.j();
    }

    @Override
    public final long o() {
        return this.q();
    }

    @Override
    public final long p() {
        return this.r();
    }

    public final long q() {
        int n2 = this.i;
        if (this.g - n2 >= 8) {
            byte[] byArray = this.f;
            this.i = n2 + 8;
            long l2 = byArray[n2];
            long l3 = byArray[n2 + 1];
            long l4 = byArray[n2 + 2];
            long l5 = byArray[n2 + 3];
            long l6 = byArray[n2 + 4];
            long l7 = byArray[n2 + 5];
            long l8 = byArray[n2 + 6];
            return ((long)byArray[n2 + 7] & 0xFFL) << 56 | (l2 & 0xFFL | (l3 & 0xFFL) << 8 | (l4 & 0xFFL) << 16 | (l5 & 0xFFL) << 24 | (l6 & 0xFFL) << 32 | (l7 & 0xFFL) << 40 | (l8 & 0xFFL) << 48);
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long r() {
        block9: {
            block8: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                block10: {
                                    var1_2 = this.g;
                                    var4_1 = this.i;
                                    if (var1_2 == var4_1) break block9;
                                    var9_3 = this.f;
                                    var3_4 = var4_1 + 1;
                                    var2_5 = var9_3[var4_1];
                                    if (var2_5 >= 0) {
                                        this.i = var3_4;
                                        return var2_5;
                                    }
                                    if (var1_2 - var3_4 < 9) break block9;
                                    var1_2 = var4_1 + 2;
                                    if ((var3_4 = var9_3[var3_4] << 7 ^ var2_5) >= 0) break block10;
                                    var5_6 = var3_4 ^ -128;
                                    break block8;
                                }
                                var2_5 = var4_1 + 3;
                                if ((var3_4 = var9_3[var1_2] << 14 ^ var3_4) < 0) break block11;
                                var5_6 = var3_4 ^ 16256;
                                var1_2 = var2_5;
                                break block8;
                            }
                            var1_2 = var4_1 + 4;
                            if ((var3_4 ^= var9_3[var2_5] << 21) >= 0) break block12;
                            var5_6 = -2080896 ^ var3_4;
                            break block8;
                        }
                        var2_5 = var4_1 + 5;
                        var5_6 = (long)var9_3[var1_2] << 28 ^ (long)var3_4;
                        if (var5_6 < 0L) break block13;
                        var5_6 ^= 266354560L;
                        var1_2 = var2_5;
                        break block8;
                    }
                    var3_4 = var4_1 + 6;
                    var7_7 = (long)var9_3[var2_5] << 35 ^ var5_6;
                    if (var7_7 < 0L) {
                        var5_6 = -34093383808L;
                        var1_2 = var3_4;
lbl39:
                        // 2 sources

                        while (true) {
                            var5_6 = var7_7 ^ var5_6;
                            break block8;
                            break;
                        }
                    }
                    var1_2 = var4_1 + 7;
                    var5_6 = var7_7 ^ (long)var9_3[var3_4] << 42;
                    if (var5_6 < 0L) break block14;
                    var5_6 ^= 4363953127296L;
                    break block8;
                }
                var2_5 = var4_1 + 8;
                var7_7 = var5_6 ^ (long)var9_3[var1_2] << 49;
                if (var7_7 < 0L) {
                    var5_6 = -558586000294016L;
                    var1_2 = var2_5;
                    ** continue;
                }
                var1_2 = var4_1 + 9;
                var5_6 = var7_7 ^ (long)var9_3[var2_5] << 56 ^ 71499008037633920L;
                if (var5_6 >= 0L) break block8;
                var2_5 = var4_1 + 10;
                if ((long)var9_3[var1_2] < 0L) break block9;
                var1_2 = var2_5;
            }
            this.i = var1_2;
            return var5_6;
        }
        return this.s();
    }

    final long s() {
        long l2 = 0L;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte by2 = this.a();
            l2 |= (long)(by2 & 0x7F) << i2;
            if ((by2 & 0x80) != 0) continue;
            return l2;
        }
        throw new hxn("CodedInputStream encountered a malformed varint.");
    }

    @Override
    public final long t() {
        return this.q();
    }

    @Override
    public final long u() {
        return hvv.J(this.r());
    }

    @Override
    public final long v() {
        return this.r();
    }

    @Override
    public final hvu w() {
        int n2;
        int n3;
        int n4 = this.j();
        if (n4 > 0 && n4 <= (n3 = this.g) - (n2 = this.i)) {
            hvu hvu2 = hvu.s(this.f, n2, n4);
            this.i += n4;
            return hvu2;
        }
        if (n4 == 0) {
            return hvu.b;
        }
        return new hvt(this.G(n4));
    }

    @Override
    public final String x() {
        int n2;
        int n3;
        int n4 = this.j();
        if (n4 > 0 && n4 <= (n3 = this.g) - (n2 = this.i)) {
            String string = new String(this.f, n2, n4, hxl.a);
            this.i += n4;
            return string;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final String y() {
        int n2;
        int n3;
        int n4 = this.j();
        if (n4 > 0 && n4 <= (n3 = this.g) - (n2 = this.i)) {
            String string = fvc.av(this.f, n2, n4);
            this.i += n4;
            return string;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 <= 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final void z(int n2) {
        if (this.k == n2) {
            return;
        }
        throw new hxn("Protocol message end-group tag did not match expected tag.");
    }
}

