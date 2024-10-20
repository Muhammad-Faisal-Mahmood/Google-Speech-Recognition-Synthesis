/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Iterator;

final class hvw
extends hvy {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int k = Integer.MAX_VALUE;
    private int l;
    private int m;
    private long n;
    private long o;
    private long p;

    public hvw(Iterable iterable, int n2) {
        this.i = n2;
        this.f = iterable;
        this.g = iterable.iterator();
        this.m = 0;
        if (n2 == 0) {
            this.h = hxl.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        this.T();
    }

    private final int G() {
        return (int)((long)(this.i - this.m) - this.n + this.o);
    }

    private final long Q() {
        return this.p - this.n;
    }

    private final void R() {
        if (this.g.hasNext()) {
            this.T();
            return;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void S() {
        int n2;
        this.i = n2 = this.i + this.j;
        int n3 = this.k;
        if (n2 > n3) {
            this.j = n3 = n2 - n3;
            this.i = n2 - n3;
            return;
        }
        this.j = 0;
    }

    private final void T() {
        long l2;
        ByteBuffer byteBuffer;
        this.h = byteBuffer = (ByteBuffer)this.g.next();
        this.m += (int)(this.n - this.o);
        this.n = l2 = (long)byteBuffer.position();
        this.o = l2;
        this.p = this.h.limit();
        l2 = hzj.e(this.h);
        this.n += l2;
        this.o += l2;
        this.p += l2;
    }

    private final void U(byte[] byArray, int n2) {
        block7: {
            block6: {
                block5: {
                    if (n2 > this.G()) break block5;
                    int n3 = n2;
                    while (n3 > 0) {
                        if (this.Q() == 0L) {
                            this.R();
                        }
                        int n4 = Math.min(n3, (int)this.Q());
                        long l2 = this.n;
                        long l3 = n4;
                        hzj.k(l2, byArray, n2 - n3, l3);
                        n3 -= n4;
                        this.n += l3;
                    }
                    break block6;
                }
                if (n2 > 0) break block7;
            }
            return;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final void A(int n2) {
        this.k = n2;
        this.S();
    }

    public final void B(int n2) {
        long l2;
        long l3;
        int n3;
        int n4;
        long l4;
        if (n2 >= 0 && (long)n2 <= (l4 = (long)((n4 = this.i) - (n3 = this.m))) - (l3 = this.n) + (l2 = this.o)) {
            while (n2 > 0) {
                if (this.Q() == 0L) {
                    this.R();
                }
                n3 = Math.min(n2, (int)this.Q());
                n2 -= n3;
                this.n += (long)n3;
            }
            return;
        }
        if (n2 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final boolean C() {
        return (long)this.m + this.n - this.o == (long)this.i;
    }

    @Override
    public final boolean D() {
        return this.r() != 0L;
    }

    @Override
    public final boolean E(int n2) {
        int n3 = hzo.b(n2);
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n3 == 5) {
                                this.B(4);
                                return true;
                            }
                            throw new hxm();
                        }
                        return false;
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
        for (int i2 = 0; i2 < 10; ++i2) {
            if (this.a() < 0) continue;
            return true;
        }
        throw new hxn("CodedInputStream encountered a malformed varint.");
    }

    @Override
    public final byte[] F() {
        block5: {
            block6: {
                byte[] byArray;
                block3: {
                    int n2;
                    block4: {
                        block2: {
                            long l2;
                            long l3;
                            n2 = this.j();
                            if (n2 < 0 || (l3 = (long)n2) > (l2 = this.Q())) break block2;
                            byArray = new byte[n2];
                            hzj.k(this.n, byArray, 0L, l3);
                            this.n += l3;
                            break block3;
                        }
                        if (n2 < 0 || n2 > this.G()) break block4;
                        byArray = new byte[n2];
                        this.U(byArray, n2);
                        break block3;
                    }
                    if (n2 > 0) break block5;
                    if (n2 != 0) break block6;
                    byArray = hxl.b;
                }
                return byArray;
            }
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final byte a() {
        if (this.Q() == 0L) {
            this.R();
        }
        long l2 = this.n;
        this.n = 1L + l2;
        return hzj.a(l2);
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
        return (int)((long)this.m + this.n - this.o);
    }

    @Override
    public final int e(int n2) {
        if (n2 >= 0) {
            int n3 = n2 + this.d();
            if (n3 <= (n2 = this.k)) {
                this.k = n3;
                this.S();
                return n2;
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        if (this.Q() >= 4L) {
            long l2 = this.n;
            this.n = 4L + l2;
            byte by2 = hzj.a(l2);
            byte by3 = hzj.a(1L + l2);
            byte by4 = hzj.a(2L + l2);
            return (hzj.a(l2 + 3L) & 0xFF) << 24 | (by2 & 0xFF | (by3 & 0xFF) << 8 | (by4 & 0xFF) << 16);
        }
        return this.a() & 0xFF | (this.a() & 0xFF) << 8 | (this.a() & 0xFF) << 16 | (this.a() & 0xFF) << 24;
    }

    @Override
    public final int j() {
        block4: {
            long l2;
            int n2;
            block6: {
                long l3;
                long l4;
                long l5;
                block8: {
                    block7: {
                        block5: {
                            if (this.p == (l5 = this.n++)) break block4;
                            n2 = hzj.a(l5);
                            if (n2 >= 0) {
                                return n2;
                            }
                            if (this.p - this.n < 10L) break block4;
                            l2 = 2L + l5;
                            n2 = hzj.a(l5 + 1L) << 7 ^ n2;
                            if (n2 >= 0) break block5;
                            n2 ^= 0xFFFFFF80;
                            break block6;
                        }
                        l4 = 3L + l5;
                        n2 = hzj.a(l2) << 14 ^ n2;
                        if (n2 < 0) break block7;
                        n2 ^= 0x3F80;
                        l2 = l4;
                        break block6;
                    }
                    l2 = 4L + l5;
                    if ((n2 ^= hzj.a(l4) << 21) >= 0) break block8;
                    n2 = 0xFFE03F80 ^ n2;
                    break block6;
                }
                l4 = 5L + l5;
                byte by2 = hzj.a(l2);
                n2 = n2 ^ by2 << 28 ^ 0xFE03F80;
                l2 = l4;
                if (by2 >= 0) break block6;
                l2 = l3 = 6L + l5;
                if (hzj.a(l4) >= 0) break block6;
                l2 = l4 = 7L + l5;
                if (hzj.a(l3) >= 0) break block6;
                l2 = l3 = 8L + l5;
                if (hzj.a(l4) >= 0) break block6;
                l2 = l4 = 9L + l5;
                if (hzj.a(l3) >= 0) break block6;
                if (hzj.a(l4) < 0) break block4;
                l2 = l5 + 10L;
            }
            this.n = l2;
            return n2;
        }
        return (int)this.s();
    }

    @Override
    public final int k() {
        return this.i();
    }

    @Override
    public final int l() {
        return hvw.H(this.j());
    }

    @Override
    public final int m() {
        int n2;
        if (this.C()) {
            this.l = 0;
            return 0;
        }
        this.l = n2 = this.j();
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long q() {
        long l2;
        long l3;
        if (this.Q() >= 8L) {
            l3 = this.n;
            this.n = 8L + l3;
            long l4 = hzj.a(l3);
            long l5 = hzj.a(1L + l3);
            l2 = hzj.a(2L + l3);
            long l6 = hzj.a(3L + l3);
            long l7 = hzj.a(l3 + 4L);
            long l8 = hzj.a(l3 + 5L);
            long l9 = hzj.a(l3 + 6L);
            l3 = ((long)hzj.a(l3 + 7L) & 0xFFL) << 56;
            l2 = l4 & 0xFFL | (l5 & 0xFFL) << 8 | (l2 & 0xFFL) << 16 | (l6 & 0xFFL) << 24 | (l7 & 0xFFL) << 32 | (l8 & 0xFFL) << 40 | (l9 & 0xFFL) << 48;
            return l2 | l3;
        }
        long l10 = this.a();
        long l11 = this.a();
        long l12 = this.a();
        long l13 = this.a();
        l2 = this.a();
        long l14 = this.a();
        long l15 = this.a();
        l3 = ((long)this.a() & 0xFFL) << 56;
        l2 = l10 & 0xFFL | (l11 & 0xFFL) << 8 | (l12 & 0xFFL) << 16 | (l13 & 0xFFL) << 24 | (l2 & 0xFFL) << 32 | (l14 & 0xFFL) << 40 | (l15 & 0xFFL) << 48;
        return l2 | l3;
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
                                    if (this.p == (var10_1 = this.n++)) break block9;
                                    var1_2 = hzj.a(var10_1);
                                    if (var1_2 >= 0) {
                                        return var1_2;
                                    }
                                    if (this.p - this.n < 10L) break block9;
                                    var4_3 = 2L + var10_1;
                                    var1_2 = hzj.a(var10_1 + 1L) << 7 ^ var1_2;
                                    if (var1_2 >= 0) break block10;
                                    var2_4 = var1_2 ^ -128;
                                    break block8;
                                }
                                var2_4 = 3L + var10_1;
                                var1_2 = hzj.a(var4_3) << 14 ^ var1_2;
                                if (var1_2 < 0) break block11;
                                var6_5 = var1_2 ^ 16256;
                                var4_3 = var2_4;
                                var2_4 = var6_5;
                                break block8;
                            }
                            var6_6 = 4L + var10_1;
                            if ((var1_2 ^= hzj.a(var2_4) << 21) >= 0) break block12;
                            var2_4 = -2080896 ^ var1_2;
                            var4_3 = var6_6;
                            break block8;
                        }
                        var4_3 = 5L + var10_1;
                        if ((var6_6 = (long)hzj.a(var6_6) << 28 ^ (long)var1_2) < 0L) break block13;
                        var2_4 = 266354560L ^ var6_6;
                        break block8;
                    }
                    var2_4 = 6L + var10_1;
                    if ((var6_6 ^= (long)hzj.a(var4_3) << 35) < 0L) {
                        var8_7 = -34093383808L;
                        var4_3 = var6_6;
                        var6_6 = var8_7;
lbl36:
                        // 2 sources

                        while (true) {
                            var6_6 ^= var4_3;
                            var4_3 = var2_4;
                            var2_4 = var6_6;
                            break block8;
                            break;
                        }
                    }
                    var4_3 = 7L + var10_1;
                    if ((var6_6 ^= (long)hzj.a(var2_4) << 42) < 0L) break block14;
                    var2_4 = 4363953127296L ^ var6_6;
                    break block8;
                }
                var2_4 = 8L + var10_1;
                var8_8 = var6_6 ^ (long)hzj.a(var4_3) << 49;
                if (var8_8 < 0L) {
                    var6_6 = -558586000294016L;
                    var4_3 = var8_8;
                    ** continue;
                }
                var4_3 = 9L + var10_1;
                if ((var2_4 = var8_8 ^ (long)hzj.a(var2_4) << 56 ^ 71499008037633920L) >= 0L) break block8;
                if ((long)hzj.a(var4_3) < 0L) break block9;
                var4_3 = var10_1 + 10L;
            }
            this.n = var4_3;
            return var2_4;
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
        return hvw.J(this.r());
    }

    @Override
    public final long v() {
        return this.r();
    }

    @Override
    public final hvu w() {
        long l2;
        long l3;
        long l4;
        int n2 = this.j();
        if (n2 > 0 && (l4 = (long)n2) <= (l3 = this.p) - (l2 = this.n)) {
            byte[] byArray = new byte[n2];
            hzj.k(l2, byArray, 0L, l4);
            this.n += l4;
            return new hvt(byArray);
        }
        if (n2 > 0 && n2 <= this.G()) {
            byte[] byArray = new byte[n2];
            this.U(byArray, n2);
            return new hvt(byArray);
        }
        if (n2 == 0) {
            return hvu.b;
        }
        if (n2 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final String x() {
        long l2;
        long l3;
        long l4;
        int n2 = this.j();
        if (n2 > 0 && (l4 = (long)n2) <= (l3 = this.p) - (l2 = this.n)) {
            Object object = new byte[n2];
            hzj.k(l2, object, 0L, l4);
            object = new String((byte[])object, hxl.a);
            this.n += l4;
            return object;
        }
        if (n2 > 0 && n2 <= this.G()) {
            byte[] byArray = new byte[n2];
            this.U(byArray, n2);
            return new String(byArray, hxl.a);
        }
        if (n2 == 0) {
            return "";
        }
        if (n2 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final String y() {
        long l2;
        long l3;
        long l4;
        int n2 = this.j();
        if (n2 > 0 && (l4 = (long)n2) <= (l3 = this.p) - (l2 = this.n)) {
            l3 = this.o;
            Object object = this.h;
            int n3 = hzl.a;
            boolean bl2 = ((ByteBuffer)object).hasArray();
            int n4 = (int)(l2 - l3);
            if (bl2) {
                n3 = ((ByteBuffer)object).arrayOffset();
                object = fvc.av(((ByteBuffer)object).array(), n3 + n4, n2);
            } else {
                object = ((ByteBuffer)object).isDirect() ? fvc.au((ByteBuffer)object, n4, n2) : fvc.au((ByteBuffer)object, n4, n2);
            }
            this.n += l4;
            return object;
        }
        if (n2 >= 0 && n2 <= this.G()) {
            byte[] byArray = new byte[n2];
            this.U(byArray, n2);
            return fvc.av(byArray, 0, n2);
        }
        if (n2 == 0) {
            return "";
        }
        if (n2 <= 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override
    public final void z(int n2) {
        if (this.l == n2) {
            return;
        }
        throw new hxn("Protocol message end-group tag did not match expected tag.");
    }
}

