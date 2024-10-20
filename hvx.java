/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class hvx
extends hvy {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public hvx(InputStream inputStream, int n2) {
        byte[] byArray = hxl.b;
        this.f = inputStream;
        this.g = new byte[n2];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int G(InputStream inputStream, byte[] byArray, int n2, int n3) {
        try {
            n2 = inputStream.read(byArray, n2, n3);
            return n2;
        }
        catch (hxn hxn2) {
            hxn2.a();
            throw hxn2;
        }
    }

    private final List Q(int n2) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while (n2 > 0) {
            int n3;
            int n4 = Math.min(n2, 4096);
            byte[] byArray = new byte[n4];
            for (int i2 = 0; i2 < n4; i2 += n3) {
                n3 = this.f.read(byArray, i2, n4 - i2);
                if (n3 != -1) {
                    this.l += n3;
                    continue;
                }
                throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            n2 -= n4;
            arrayList.add(byArray);
        }
        return arrayList;
    }

    private final void R() {
        int n2;
        this.h = n2 = this.h + this.i;
        int n3 = this.l + n2;
        int n4 = this.m;
        if (n3 > n4) {
            this.i = n4 = n3 - n4;
            this.h = n2 - n4;
            return;
        }
        this.i = 0;
    }

    private final void S(int n2) {
        if (!this.T(n2)) {
            if (n2 > this.c - this.l - this.j) {
                throw new hxn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final boolean T(int n2) {
        int n3 = this.j;
        int n4 = this.h;
        if (n3 + n2 > n4) {
            Object object;
            Object object2;
            int n5 = this.c;
            int n6 = this.l;
            if (n2 > n5 - n6 - n3) {
                return false;
            }
            if (n6 + n3 + n2 > this.m) {
                return false;
            }
            n5 = n4;
            if (n3 > 0) {
                if (n4 > n3) {
                    object2 = this.g;
                    System.arraycopy(object2, n3, object2, 0, n4 - n3);
                }
                this.l = n6 = this.l + n3;
                this.h = n5 = this.h - n3;
                this.j = 0;
            }
            if ((n6 = hvx.G((InputStream)(object2 = this.f), object = this.g, n5, Math.min(((byte[])object).length - n5, (n4 = this.c) - n6 - n5))) != 0 && n6 >= -1 && n6 <= this.g.length) {
                if (n6 > 0) {
                    this.h += n6;
                    this.R();
                    if (this.h >= n2) {
                        return true;
                    }
                    return this.T(n2);
                }
                return false;
            }
            object = String.valueOf(this.f.getClass());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("#read(byte[]) returned invalid result: ");
            ((StringBuilder)object2).append(n6);
            ((StringBuilder)object2).append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        throw new IllegalStateException(a.ah(n2, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    private final byte[] U(int n2) {
        if (n2 == 0) {
            return hxl.b;
        }
        int n3 = this.l;
        int n4 = this.j;
        int n5 = n3 + n4 + n2;
        int n6 = this.c;
        if (n5 - n6 <= 0) {
            n6 = this.m;
            if (n5 <= n6) {
                Object object;
                n3 = this.h - n4;
                n5 = n2 - n3;
                if (n5 >= 4096) {
                    object = this.f;
                    try {
                        n4 = ((InputStream)object).available();
                        if (n5 > n4) {
                            return null;
                        }
                    }
                    catch (hxn hxn2) {
                        hxn2.a();
                        throw hxn2;
                    }
                }
                object = new byte[n2];
                System.arraycopy(this.g, this.j, object, 0, n3);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (n3 < n2) {
                    n5 = hvx.G(this.f, (byte[])object, n3, n2 - n3);
                    if (n5 != -1) {
                        this.l += n5;
                        n3 += n5;
                        continue;
                    }
                    throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                return object;
            }
            this.B(n6 - n3 - n4);
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new hxn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final byte[] V(int n2) {
        byte[] byArray = this.U(n2);
        if (byArray != null) {
            return byArray;
        }
        int n3 = this.j;
        int n4 = this.h;
        int n5 = n4 - n3;
        this.l += n4;
        this.j = 0;
        this.h = 0;
        Object object = this.Q(n2 - n5);
        byArray = new byte[n2];
        System.arraycopy(this.g, n3, byArray, 0, n5);
        object = object.iterator();
        n2 = n5;
        while (object.hasNext()) {
            byte[] byArray2 = (byte[])object.next();
            n5 = byArray2.length;
            System.arraycopy(byArray2, 0, byArray, n2, n5);
            n2 += n5;
        }
        return byArray;
    }

    @Override
    public final void A(int n2) {
        this.m = n2;
        this.R();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B(int n2) {
        int n3 = this.h;
        int n4 = this.j;
        if (n2 <= (n3 -= n4) && n2 >= 0) {
            this.j = n4 + n2;
            return;
        }
        if (n2 < 0) {
            throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int n5 = this.l;
        int n6 = n5 + n4;
        int n7 = this.m;
        if (n6 + n2 > n7) {
            this.B(n7 - n5 - n4);
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = n6;
        this.h = 0;
        this.j = 0;
        while (n3 < n2) {
            Object object;
            try {
                object = this.f;
            }
            catch (Throwable throwable) {
                this.l += n3;
                this.R();
                throw throwable;
            }
            long l2 = n2 - n3;
            {
                long l3;
                try {
                    l3 = ((InputStream)object).skip(l2);
                }
                catch (hxn hxn2) {
                    hxn2.a();
                    throw hxn2;
                }
                long l4 = l3 - 0L;
                n4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (n4 >= 0 && l3 <= l2) {
                    if (n4 == 0) break;
                    n3 += (int)l3;
                    continue;
                }
                String string = String.valueOf(this.f.getClass());
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("#skip returned invalid result: ");
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append("\nThe InputStream implementation is buggy.");
                IllegalStateException illegalStateException = new IllegalStateException(((StringBuilder)object).toString());
                throw illegalStateException;
            }
        }
        this.l += n3;
        this.R();
        if (n3 < n2) {
            n4 = this.h;
            n3 = n4 - this.j;
            this.j = n4;
            this.S(1);
            while ((n5 = n2 - n3) > (n4 = this.h)) {
                n3 += n4;
                this.j = n4;
                this.S(1);
            }
            this.j = n5;
        }
    }

    @Override
    public final boolean C() {
        return this.j == this.h && !this.T(1);
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
        if (this.h - this.j >= 10) {
            for (n2 = n5; n2 < 10; ++n2) {
                byte[] byArray = this.g;
                n5 = this.j;
                this.j = n5 + 1;
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
        int n2;
        int n3;
        int n4 = this.j();
        if (n4 <= (n3 = this.h) - (n2 = this.j) && n4 > 0) {
            byte[] byArray = Arrays.copyOfRange(this.g, n2, n2 + n4);
            this.j += n4;
            return byArray;
        }
        if (n4 >= 0) {
            return this.V(n4);
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() {
        if (this.j == this.h) {
            this.S(1);
        }
        byte[] byArray = this.g;
        int n2 = this.j;
        this.j = n2 + 1;
        return byArray[n2];
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
        return this.l + this.j;
    }

    @Override
    public final int e(int n2) {
        if (n2 >= 0) {
            if ((n2 += this.l + this.j) >= 0) {
                int n3 = this.m;
                if (n2 <= n3) {
                    this.m = n2;
                    this.R();
                    return n3;
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
        int n2;
        int n3 = n2 = this.j;
        if (this.h - n2 < 4) {
            this.S(4);
            n3 = this.j;
        }
        byte[] byArray = this.g;
        this.j = n3 + 4;
        n2 = byArray[n3];
        byte by2 = byArray[n3 + 1];
        byte by3 = byArray[n3 + 2];
        return (byArray[n3 + 3] & 0xFF) << 24 | ((by2 & 0xFF) << 8 | n2 & 0xFF | (by3 & 0xFF) << 16);
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
                                    n3 = this.h;
                                    n5 = this.j;
                                    if (n3 == n5) {
                                        return (int)this.s();
                                    }
                                    byArray = this.g;
                                    n4 = n5 + 1;
                                    n2 = byArray[n5];
                                    if (n2 >= 0) {
                                        this.j = n4;
                                        return n2;
                                    }
                                    if (n3 - n4 < 9) return (int)this.s();
                                    n3 = n5 + 2;
                                    if ((n4 = byArray[n4] << 7 ^ n2) >= 0) break block3;
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
        this.j = n3;
        return n2;
    }

    @Override
    public final int k() {
        return this.i();
    }

    @Override
    public final int l() {
        return hvx.H(this.j());
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
        int n2;
        int n3 = n2 = this.j;
        if (this.h - n2 < 8) {
            this.S(8);
            n3 = this.j;
        }
        byte[] byArray = this.g;
        this.j = n3 + 8;
        long l2 = byArray[n3];
        long l3 = byArray[n3 + 1];
        long l4 = byArray[n3 + 2];
        long l5 = byArray[n3 + 3];
        long l6 = byArray[n3 + 4];
        long l7 = byArray[n3 + 5];
        long l8 = byArray[n3 + 6];
        return ((long)byArray[n3 + 7] & 0xFFL) << 56 | (l2 & 0xFFL | (l3 & 0xFFL) << 8 | (l4 & 0xFFL) << 16 | (l5 & 0xFFL) << 24 | (l6 & 0xFFL) << 32 | (l7 & 0xFFL) << 40 | (l8 & 0xFFL) << 48);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long r() {
        block5: {
            block4: {
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                block7: {
                                    block6: {
                                        var2_2 = this.h;
                                        var4_1 = this.j;
                                        if (var2_2 == var4_1) break block5;
                                        var9_3 = this.g;
                                        var3_4 = var4_1 + 1;
                                        var1_5 = var9_3[var4_1];
                                        if (var1_5 >= 0) {
                                            this.j = var3_4;
                                            return var1_5;
                                        }
                                        if (var2_2 - var3_4 < 9) break block5;
                                        var2_2 = var4_1 + 2;
                                        if ((var3_4 = var9_3[var3_4] << 7 ^ var1_5) >= 0) break block6;
                                        var5_6 = var3_4 ^ -128;
                                        var1_5 = var2_2;
                                        break block4;
                                    }
                                    var1_5 = var4_1 + 3;
                                    if ((var3_4 = var9_3[var2_2] << 14 ^ var3_4) < 0) break block7;
                                    var5_6 = var3_4 ^ 16256;
                                    break block4;
                                }
                                var2_2 = var4_1 + 4;
                                if ((var3_4 ^= var9_3[var1_5] << 21) >= 0) break block8;
                                var5_6 = -2080896 ^ var3_4;
                                var1_5 = var2_2;
                                break block4;
                            }
                            var1_5 = var4_1 + 5;
                            var5_6 = (long)var9_3[var2_2] << 28 ^ (long)var3_4;
                            if (var5_6 < 0L) break block9;
                            var5_6 ^= 266354560L;
                            break block4;
                        }
                        var2_2 = var4_1 + 6;
                        var7_7 = (long)var9_3[var1_5] << 35 ^ var5_6;
                        if (var7_7 < 0L) {
                            var5_6 = -34093383808L;
                            var1_5 = var2_2;
lbl39:
                            // 2 sources

                            while (true) {
                                var5_6 = var7_7 ^ var5_6;
                                break block4;
                                break;
                            }
                        }
                        var3_4 = var4_1 + 7;
                        var5_6 = var7_7 ^ (long)var9_3[var2_2] << 42;
                        if (var5_6 < 0L) break block10;
                        var5_6 ^= 4363953127296L;
                        var1_5 = var3_4;
                        break block4;
                    }
                    var1_5 = var4_1 + 8;
                    var7_7 = var5_6 ^ (long)var9_3[var3_4] << 49;
                    if (var7_7 < 0L) {
                        var5_6 = -558586000294016L;
                        ** continue;
                    }
                    var2_2 = var4_1 + 9;
                    var5_6 = var7_7 ^ (long)var9_3[var1_5] << 56 ^ 71499008037633920L;
                    if (var5_6 >= 0L) break block11;
                    var1_5 = var4_1 + 10;
                    if ((long)var9_3[var2_2] < 0L) break block5;
                    break block4;
                }
                var1_5 = var2_2;
            }
            this.j = var1_5;
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
        return hvx.J(this.r());
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
        if (n4 <= (n3 = this.h) - (n2 = this.j) && n4 > 0) {
            hvu hvu2 = hvu.s(this.g, n2, n4);
            this.j += n4;
            return hvu2;
        }
        if (n4 == 0) {
            return hvu.b;
        }
        if (n4 >= 0) {
            Object object = this.U(n4);
            if (object != null) {
                object = hvu.q(object);
            } else {
                int n5 = this.j;
                n3 = this.h;
                n2 = n3 - n5;
                this.l += n3;
                this.j = 0;
                this.h = 0;
                Object object2 = this.Q(n4 - n2);
                object = new byte[n4];
                System.arraycopy(this.g, n5, object, 0, n2);
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object2 = (byte[])iterator.next();
                    n4 = ((Object)object2).length;
                    System.arraycopy(object2, 0, object, n2, n4);
                    n2 += n4;
                }
                object = new hvt((byte[])object);
            }
            return object;
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override
    public final String x() {
        int n2;
        int n3;
        int n4 = this.j();
        if (n4 > 0 && n4 <= (n3 = this.h) - (n2 = this.j)) {
            String string = new String(this.g, n2, n4, hxl.a);
            this.j += n4;
            return string;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 >= 0) {
            if (n4 <= this.h) {
                this.S(n4);
                String string = new String(this.g, this.j, n4, hxl.a);
                this.j += n4;
                return string;
            }
            return new String(this.V(n4), hxl.a);
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override
    public final String y() {
        block8: {
            byte[] byArray;
            int n2;
            int n3;
            block7: {
                int n4;
                block6: {
                    n3 = this.j();
                    if (n3 > (n4 = this.h) - (n2 = this.j) || n3 <= 0) break block6;
                    byArray = this.g;
                    this.j = n2 + n3;
                    break block7;
                }
                if (n3 == 0) {
                    return "";
                }
                if (n3 < 0) break block8;
                n2 = 0;
                if (n3 <= n4) {
                    this.S(n3);
                    byArray = this.g;
                    this.j = n3;
                } else {
                    byArray = this.V(n3);
                }
            }
            return fvc.av(byArray, n2, n3);
        }
        throw new hxn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override
    public final void z(int n2) {
        if (this.k == n2) {
            return;
        }
        throw new hxn("Protocol message end-group tag did not match expected tag.");
    }
}

