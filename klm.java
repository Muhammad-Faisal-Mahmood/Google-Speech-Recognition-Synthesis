/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class klm
implements Cloneable,
ByteChannel,
klo,
kln {
    public kmf a;
    public long b;

    @Override
    public final byte[] A(long l2) {
        if (l2 >= 0L && l2 <= Integer.MAX_VALUE) {
            if (this.b >= l2) {
                int n2;
                int n3 = (int)l2;
                byte[] byArray = new byte[n3];
                for (int i2 = 0; i2 < n3; i2 += n2) {
                    n2 = this.e(byArray, i2, n3 - i2);
                    if (n2 != -1) {
                        continue;
                    }
                    throw new EOFException();
                }
                return byArray;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount: "));
    }

    public final void B(klp klp2) {
        jse.e(klp2, "byteString");
        klp2.m(this, klp2.b());
    }

    public final void C(byte[] byArray, int n2, int n3) {
        int n4;
        jse.e(byArray, "source");
        long l2 = byArray.length;
        long l3 = n2;
        long l4 = n3;
        kmp.x(l2, l3, l4);
        int n5 = n2;
        while (n5 < (n4 = n2 + n3)) {
            kmf kmf2 = this.s(1);
            int n6 = Math.min(n4 - n5, 8192 - kmf2.c);
            byte[] byArray2 = kmf2.a;
            int n7 = kmf2.c;
            n4 = n5 + n6;
            jns.V(byArray, byArray2, n7, n5, n4);
            kmf2.c += n6;
            n5 = n4;
        }
        this.b += l4;
    }

    public final void E(kmk kmk2) {
        while (kmk2.b(this, 8192L) != -1L) {
        }
    }

    public final void F(int n2) {
        kmf kmf2 = this.s(1);
        byte[] byArray = kmf2.a;
        int n3 = kmf2.c;
        kmf2.c = n3 + 1;
        byArray[n3] = (byte)n2;
        ++this.b;
    }

    public final void H(int n2) {
        kmf kmf2 = this.s(4);
        byte[] byArray = kmf2.a;
        int n3 = kmf2.c;
        byArray[n3] = (byte)(n2 >> 24);
        byArray[n3 + 1] = (byte)(n2 >>> 16 & 0xFF);
        byArray[n3 + 2] = (byte)(n2 >>> 8 & 0xFF);
        byArray[n3 + 3] = (byte)(n2 & 0xFF);
        kmf2.c = n3 + 4;
        this.b += 4L;
    }

    public final void K(String charSequence, int n2, int n3) {
        jse.e(charSequence, "string");
        if (n2 >= 0) {
            if (n3 >= n2) {
                if (n3 <= ((String)charSequence).length()) {
                    while (n2 < n3) {
                        int n4;
                        byte[] byArray;
                        kmf kmf2;
                        int n5 = n2 + 1;
                        int n6 = ((String)charSequence).charAt(n2);
                        if (n6 < 128) {
                            byte by2 = (byte)n6;
                            kmf2 = this.s(1);
                            byArray = kmf2.a;
                            n4 = kmf2.c - n2;
                            n6 = Math.min(n3, 8192 - n4);
                            byArray[n2 + n4] = by2;
                            for (n2 = n5; n2 < n6 && (n5 = (int)((String)charSequence).charAt(n2)) < 128; ++n2) {
                                byArray[n2 + n4] = (byte)n5;
                            }
                            n5 = kmf2.c;
                            n4 = n4 + n2 - n5;
                            kmf2.c = n5 + n4;
                            this.b += (long)n4;
                            continue;
                        }
                        if (n6 < 2048) {
                            kmf2 = this.s(2);
                            byArray = kmf2.a;
                            n2 = kmf2.c;
                            byArray[n2] = (byte)(n6 >> 6 | 0xC0);
                            byArray[n2 + 1] = (byte)(n6 & 0x3F | 0x80);
                            kmf2.c = n2 + 2;
                            this.b += 2L;
                        } else if (n6 >= 55296 && n6 <= 57343) {
                            n4 = n5 < n3 ? (int)((String)charSequence).charAt(n5) : 0;
                            if (n6 <= 56319 && n4 >= 56320 && n4 < 57344) {
                                kmf2 = this.s(4);
                                byArray = kmf2.a;
                                n5 = kmf2.c;
                                n4 = ((n6 & 0x3FF) << 10 | n4 & 0x3FF) + 65536;
                                byArray[n5] = (byte)(n4 >> 18 | 0xF0);
                                byArray[n5 + 1] = (byte)(n4 >> 12 & 0x3F | 0x80);
                                byArray[n5 + 2] = (byte)(n4 >> 6 & 0x3F | 0x80);
                                byArray[n5 + 3] = (byte)(n4 & 0x3F | 0x80);
                                kmf2.c = n5 + 4;
                                this.b += 4L;
                                n2 += 2;
                                continue;
                            }
                            this.F(63);
                        } else {
                            kmf2 = this.s(3);
                            byArray = kmf2.a;
                            n2 = kmf2.c;
                            byArray[n2] = (byte)(n6 >> 12 | 0xE0);
                            byArray[n2 + 1] = (byte)(0x3F & n6 >> 6 | 0x80);
                            byArray[n2 + 2] = (byte)(n6 & 0x3F | 0x80);
                            kmf2.c = n2 + 3;
                            this.b += 3L;
                        }
                        n2 = n5;
                    }
                    return;
                }
                n2 = ((String)charSequence).length();
                charSequence = new StringBuilder("endIndex > string.length: ");
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(" > ");
                ((StringBuilder)charSequence).append(n2);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            throw new IllegalArgumentException(a.an(n2, n3, "endIndex < beginIndex: ", " < "));
        }
        throw new IllegalArgumentException(a.af(n2, "beginIndex < 0: "));
    }

    public final void L(int n2) {
        if (n2 < 128) {
            this.F(n2);
            return;
        }
        if (n2 < 2048) {
            kmf kmf2 = this.s(2);
            byte[] byArray = kmf2.a;
            int n3 = kmf2.c;
            byArray[n3] = (byte)(n2 >> 6 | 0xC0);
            byArray[n3 + 1] = (byte)(n2 & 0x3F | 0x80);
            kmf2.c = n3 + 2;
            this.b += 2L;
            return;
        }
        if (n2 >= 55296 && n2 < 57344) {
            this.F(63);
            return;
        }
        if (n2 < 65536) {
            kmf kmf3 = this.s(3);
            byte[] byArray = kmf3.a;
            int n4 = kmf3.c;
            byArray[n4] = (byte)(n2 >> 12 | 0xE0);
            byArray[n4 + 1] = (byte)(n2 >> 6 & 0x3F | 0x80);
            byArray[n4 + 2] = (byte)(n2 & 0x3F | 0x80);
            kmf3.c = n4 + 3;
            this.b += 3L;
            return;
        }
        if (n2 <= 0x10FFFF) {
            kmf kmf4 = this.s(4);
            byte[] byArray = kmf4.a;
            int n5 = kmf4.c;
            byArray[n5] = (byte)(n2 >> 18 | 0xF0);
            byArray[n5 + 1] = (byte)(n2 >> 12 & 0x3F | 0x80);
            byArray[n5 + 2] = (byte)(n2 >> 6 & 0x3F | 0x80);
            byArray[n5 + 3] = (byte)(n2 & 0x3F | 0x80);
            kmf4.c = n5 + 4;
            this.b += 4L;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(kmp.w(n2)));
    }

    public final void M(klm klm2, long l2) {
        kmp.x(this.b, 0L, l2);
        if (l2 != 0L) {
            long l3;
            kmf kmf2;
            klm2.b += l2;
            kmf kmf3 = this.a;
            long l4 = 0L;
            while (true) {
                jse.b(kmf3);
                long l5 = kmf3.c - kmf3.b;
                kmf2 = kmf3;
                l3 = l4;
                if (l4 < l5) break;
                kmf3 = kmf3.f;
                l4 -= l5;
            }
            for (long i2 = l2; i2 > 0L; i2 -= (long)(kmf3.c - kmf3.b)) {
                int n2;
                jse.b(kmf2);
                kmf3 = kmf2.b();
                kmf3.b = n2 = kmf3.b + (int)l3;
                int n3 = kmf3.c;
                kmf3.c = Math.min(n2 + (int)i2, n3);
                kmf kmf4 = klm2.a;
                if (kmf4 == null) {
                    klm2.a = kmf3.f = (kmf3.g = kmf3);
                } else {
                    kmf4 = kmf4.g;
                    jse.b(kmf4);
                    kmf4.d(kmf3);
                }
                kmf2 = kmf2.f;
                l3 = 0L;
            }
        }
    }

    public final void N(byte[] byArray) {
        jse.e(byArray, "source");
        this.C(byArray, 0, byArray.length);
    }

    public final void O(long l2) {
        if (l2 == 0L) {
            this.F(48);
            return;
        }
        long l3 = l2 >>> 1 | l2;
        l3 |= l3 >>> 2;
        l3 |= l3 >>> 4;
        l3 |= l3 >>> 8;
        l3 |= l3 >>> 16;
        l3 |= l3 >>> 32;
        l3 -= l3 >>> 1 & 0x5555555555555555L;
        l3 = (l3 >>> 2 & 0x3333333333333333L) + (l3 & 0x3333333333333333L);
        l3 = (l3 >>> 4) + l3 & 0xF0F0F0F0F0F0F0FL;
        l3 += l3 >>> 8;
        l3 += l3 >>> 16;
        int n2 = (int)((l3 & 0x3FL) + (l3 >>> 32 & 0x3FL) + 3L >> 2);
        kmf kmf2 = this.s(n2);
        byte[] byArray = kmf2.a;
        int n3 = kmf2.c;
        int n4 = n3 + n2;
        while (--n4 >= n3) {
            byArray[n4] = kmn.a[(int)(0xFL & l2)];
            l2 >>>= 4;
        }
        kmf2.c += n2;
        this.b += (long)n2;
    }

    public final void P(String string) {
        jse.e(string, "string");
        this.K(string, 0, string.length());
    }

    @Override
    public final kmm a() {
        return kmm.j;
    }

    @Override
    public final long b(klm klm2, long l2) {
        if (l2 >= 0L) {
            long l3 = this.b;
            if (l3 != 0L) {
                long l4 = l2;
                if (l2 > l3) {
                    l4 = l3;
                }
                klm2.bK(this, l4);
                return l4;
            }
            return -1L;
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount < 0: "));
    }

    @Override
    public final void bK(klm klm2, long l2) {
        block14: {
            jse.e(klm2, "source");
            if (klm2 == this) break block14;
            kmp.x(klm2.b, 0L, l2);
            while (l2 > 0L) {
                block17: {
                    int n2;
                    int n3;
                    long l3;
                    block16: {
                        kmf kmf2;
                        int n4;
                        int n5;
                        int n6;
                        kmf kmf3;
                        block15: {
                            kmf3 = klm2.a;
                            jse.b(kmf3);
                            n6 = kmf3.c;
                            kmf3 = klm2.a;
                            jse.b(kmf3);
                            l3 = n6 - kmf3.b;
                            n5 = 0;
                            if (l2 < l3) {
                                kmf3 = this.a;
                                kmf3 = kmf3 != null ? kmf3.g : null;
                                n4 = (int)l2;
                                if (kmf3 != null && kmf3.e && (l3 = (long)kmf3.c) + l2 - (long)(n6 = kmf3.d ? 0 : kmf3.b) <= 8192L) {
                                    kmf2 = klm2.a;
                                    jse.b(kmf2);
                                    kmf2.c(kmf3, n4);
                                    klm2.b -= l2;
                                    this.b += l2;
                                    return;
                                }
                                kmf2 = klm2.a;
                                jse.b(kmf2);
                                if (n4 <= kmf2.c - kmf2.b) {
                                    if (n4 >= 1024) {
                                        kmf3 = kmf2.b();
                                    } else {
                                        byte[] byArray = kmf2.a;
                                        kmf3 = kmg.a();
                                        byte[] byArray2 = kmf3.a;
                                        n6 = kmf2.b;
                                        jns.Y(byArray, byArray2, n6, n6 + n4);
                                    }
                                    kmf3.c = kmf3.b + n4;
                                    kmf2.b += n4;
                                    kmf2 = kmf2.g;
                                    jse.b(kmf2);
                                    kmf2.d(kmf3);
                                    klm2.a = kmf3;
                                } else {
                                    throw new IllegalArgumentException("byteCount out of range");
                                }
                            }
                            kmf3 = klm2.a;
                            jse.b(kmf3);
                            n3 = kmf3.c;
                            n2 = kmf3.b;
                            klm2.a = kmf3.a();
                            kmf2 = this.a;
                            if (kmf2 != null) break block15;
                            this.a = kmf3;
                            kmf3.f = kmf3.g = kmf3;
                            break block16;
                        }
                        kmf2 = kmf2.g;
                        jse.b(kmf2);
                        kmf2.d(kmf3);
                        kmf2 = kmf3.g;
                        if (kmf2 == kmf3) break block17;
                        jse.b(kmf2);
                        if (kmf2.e) {
                            int n7 = kmf3.c - kmf3.b;
                            kmf2 = kmf3.g;
                            jse.b(kmf2);
                            n4 = kmf2.c;
                            kmf2 = kmf3.g;
                            jse.b(kmf2);
                            if (kmf2.d) {
                                n6 = n5;
                            } else {
                                kmf2 = kmf3.g;
                                jse.b(kmf2);
                                n6 = kmf2.b;
                            }
                            if (n7 <= 8192 - n4 + n6) {
                                kmf2 = kmf3.g;
                                jse.b(kmf2);
                                kmf3.c(kmf2, n7);
                                kmf3.a();
                                kmg.b(kmf3);
                            }
                        }
                    }
                    l3 = n3 - n2;
                    klm2.b -= l3;
                    this.b += l3;
                    l2 -= l3;
                    continue;
                }
                throw new IllegalStateException("cannot compact");
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final byte c(long l2) {
        kmp.x(this.b, l2, 1L);
        kmf kmf2 = this.a;
        if (kmf2 != null) {
            byte by2;
            long l3 = this.b;
            if (l3 - l2 < l2) {
                while (l3 > l2) {
                    kmf2 = kmf2.g;
                    jse.b(kmf2);
                    l3 -= (long)(kmf2.c - kmf2.b);
                }
                jse.b(kmf2);
                by2 = kmf2.a[(int)((long)kmf2.b + l2 - l3)];
            } else {
                long l4;
                l3 = 0L;
                while ((l4 = (long)(kmf2.c - kmf2.b) + l3) <= l2) {
                    kmf2 = kmf2.f;
                    jse.b(kmf2);
                    l3 = l4;
                }
                jse.b(kmf2);
                by2 = kmf2.a[(int)((long)kmf2.b + l2 - l3)];
            }
            return by2;
        }
        jse.b(null);
        throw null;
    }

    public final /* synthetic */ Object clone() {
        klm klm2 = new klm();
        if (this.b != 0L) {
            kmf kmf2;
            kmf kmf3 = this.a;
            jse.b(kmf3);
            klm2.a = kmf2 = kmf3.b();
            kmf2.f = kmf2.g = kmf2;
            kmf kmf4 = kmf3.f;
            while (kmf4 != kmf3) {
                kmf kmf5 = kmf2.g;
                jse.b(kmf5);
                jse.b(kmf4);
                kmf5.d(kmf4.b());
                kmf4 = kmf4.f;
            }
            klm2.b = this.b;
        }
        return klm2;
    }

    @Override
    public final void close() {
    }

    @Override
    public final byte d() {
        if (this.b != 0L) {
            kmf kmf2 = this.a;
            jse.b(kmf2);
            int n2 = kmf2.b;
            int n3 = kmf2.c;
            byte[] byArray = kmf2.a;
            int n4 = n2 + 1;
            byte by2 = byArray[n2];
            --this.b;
            if (n4 == n3) {
                this.a = kmf2.a();
                kmg.b(kmf2);
            } else {
                kmf2.b = n4;
            }
            return by2;
        }
        throw new EOFException();
    }

    public final int e(byte[] byArray, int n2, int n3) {
        kmf kmf2;
        block4: {
            block3: {
                block2: {
                    jse.e(byArray, "sink");
                    kmp.x(byArray.length, n2, n3);
                    kmf2 = this.a;
                    if (kmf2 != null) break block2;
                    n2 = -1;
                    break block3;
                }
                n3 = Math.min(n3, kmf2.c - kmf2.b);
                int n4 = kmf2.b;
                jns.V(kmf2.a, byArray, n2, n4, n4 + n3);
                kmf2.b = n2 = kmf2.b + n3;
                this.b -= (long)n3;
                if (n2 == kmf2.c) break block4;
                n2 = n3;
            }
            return n2;
        }
        this.a = kmf2.a();
        kmg.b(kmf2);
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (!(object instanceof klm)) return false;
        long l2 = this.b;
        object = (klm)object;
        if (l2 == ((klm)object).b) {
            if (l2 == 0L) {
                return bl2;
            }
            Object object2 = this.a;
            jse.b(object2);
            object = ((klm)object).a;
            jse.b(object);
            int n2 = ((kmf)object2).b;
            int n3 = ((kmf)object).b;
            l2 = 0L;
            block0: while (true) {
                boolean bl3 = bl2;
                if (l2 >= this.b) return bl3;
                long l3 = Math.min(((kmf)object2).c - n2, ((kmf)object).c - n3);
                int n4 = n2;
                for (long i2 = 0L; i2 < l3; ++i2, ++n4, ++n3) {
                    if (((kmf)object2).a[n4] != ((kmf)object).a[n3]) break block0;
                }
                kmf kmf2 = object2;
                n2 = n4;
                if (n4 == ((kmf)object2).c) {
                    kmf2 = ((kmf)object2).f;
                    jse.b(kmf2);
                    n2 = kmf2.b;
                }
                object2 = object;
                n4 = n3;
                if (n3 == ((kmf)object).c) {
                    object2 = ((kmf)object).f;
                    jse.b(object2);
                    n4 = ((kmf)object2).b;
                }
                l2 += l3;
                object = object2;
                object2 = kmf2;
                n3 = n4;
            }
        }
        return false;
    }

    @Override
    public final int f() {
        if (this.b >= 4L) {
            int n2;
            kmf kmf2 = this.a;
            jse.b(kmf2);
            int n3 = kmf2.b;
            int n4 = kmf2.c;
            if ((long)(n4 - n3) < 4L) {
                n2 = (this.d() & 0xFF) << 24 | (this.d() & 0xFF) << 16 | (this.d() & 0xFF) << 8 | this.d() & 0xFF;
            } else {
                byte[] byArray = kmf2.a;
                n2 = byArray[n3];
                byte by2 = byArray[n3 + 1];
                byte by3 = byArray[n3 + 2];
                byte by4 = byArray[n3 + 3];
                this.b -= 4L;
                if ((n3 += 4) == n4) {
                    this.a = kmf2.a();
                    kmg.b(kmf2);
                } else {
                    kmf2.b = n3;
                }
                n2 = by4 & 0xFF | ((by2 & 0xFF) << 16 | (n2 & 0xFF) << 24 | (by3 & 0xFF) << 8);
            }
            return n2;
        }
        throw new EOFException();
    }

    @Override
    public final void flush() {
    }

    public final long g() {
        long l2 = this.b;
        long l3 = 0L;
        if (l2 != 0L) {
            kmf kmf2 = this.a;
            jse.b(kmf2);
            kmf2 = kmf2.g;
            jse.b(kmf2);
            int n2 = kmf2.c;
            l3 = l2;
            if (n2 < 8192) {
                l3 = l2;
                if (kmf2.e) {
                    l3 = l2 - (long)(n2 - kmf2.b);
                }
            }
        }
        return l3;
    }

    /*
     * Unable to fully structure code
     */
    public final long h(byte var1_1, long var2_2, long var4_3) {
        block10: {
            block9: {
                block11: {
                    var12_4 = 0L;
                    if (var2_2 < 0L || var2_2 > var4_3) break block10;
                    var10_5 = this.b;
                    var8_6 = var4_3;
                    if (var4_3 > var10_5) {
                        var8_6 = var10_5;
                    }
                    if (var2_2 == var8_6) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            var2_2 = -1L;
                            break block9;
                            break;
                        }
                    }
                    var15_8 = this.a;
                    if (var15_8 == null) ** GOTO lbl-1000
                    var4_3 = var12_4;
                    var14_9 = var15_8;
                    if (var10_5 - var2_2 >= var2_2) break block11;
                    var14_9 = var15_8;
                    for (var4_3 = var10_5; var4_3 > var2_2; var4_3 -= (long)(var14_9.c - var14_9.b)) {
                        var14_9 = var14_9.g;
                        jse.b(var14_9);
                    }
                    var15_8 = var14_9;
                    if (var14_9 == null) ** GOTO lbl-1000
                    while (true) {
                        if (var4_3 >= var8_6) ** GOTO lbl-1000
                        var14_9 = var15_8.a;
                        var7_13 = (int)Math.min((long)var15_8.c, (long)var15_8.b + var8_6 - var4_3);
                        for (var6_11 = (int)((long)var15_8.b + var2_2 - var4_3); var6_11 < var7_13; ++var6_11) {
                            if (var14_9[var6_11] != var1_1) continue;
                            var2_2 = (long)(var6_11 - var15_8.b) + var4_3;
                            break block9;
                        }
                        var15_8 = var15_8.f;
                        jse.b(var15_8);
                        var2_2 = var4_3 += (long)(var15_8.c - var15_8.b);
                    }
                }
                while ((var10_5 = (long)(var14_9.c - var14_9.b) + var4_3) <= var2_2) {
                    var14_9 = var14_9.f;
                    jse.b(var14_9);
                    var4_3 = var10_5;
                }
                var15_8 = var14_9;
                if (var14_9 == null) ** GOTO lbl-1000
                block5: while (true) {
                    if (var4_3 < var8_6) ** break;
                    ** continue;
                    var14_9 = var15_8.a;
                    var7_14 = (int)Math.min((long)var15_8.c, (long)var15_8.b + var8_6 - var4_3);
                    for (var6_12 = (int)((long)var15_8.b + var2_2 - var4_3); var6_12 < var7_14; ++var6_12) {
                        if (var14_9[var6_12] != var1_1) continue;
                        var2_2 = (long)(var6_12 - var15_8.b) + var4_3;
                        break block5;
                    }
                    var15_8 = var15_8.f;
                    jse.b(var15_8);
                    var2_2 = var4_3 += (long)(var15_8.c - var15_8.b);
                }
            }
            return var2_2;
        }
        var8_7 = this.b;
        var14_10 = new StringBuilder("size=");
        var14_10.append(var8_7);
        var14_10.append(" fromIndex=");
        var14_10.append(var2_2);
        var14_10.append(" toIndex=");
        var14_10.append(var4_3);
        throw new IllegalArgumentException(var14_10.toString());
    }

    public final int hashCode() {
        int n2;
        kmf kmf2 = this.a;
        if (kmf2 == null) {
            n2 = 0;
        } else {
            kmf kmf3;
            int n3 = 1;
            do {
                int n4 = kmf2.c;
                n2 = n3;
                for (int i2 = kmf2.b; i2 < n4; ++i2) {
                    n2 = n2 * 31 + kmf2.a[i2];
                }
                kmf3 = kmf2.f;
                jse.b(kmf3);
                kmf2 = kmf3;
                n3 = n2;
            } while (kmf3 != this.a);
        }
        return n2;
    }

    @Override
    public final InputStream i() {
        return new kmd(this, 1);
    }

    @Override
    public final boolean isOpen() {
        return true;
    }

    public final String j(long l2, Charset object) {
        jse.e(object, "charset");
        long l3 = l2 - 0L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 >= 0 && l2 <= Integer.MAX_VALUE) {
            if (this.b >= l2) {
                if (l4 == false) {
                    return "";
                }
                kmf kmf2 = this.a;
                jse.b(kmf2);
                int n2 = kmf2.b;
                long l5 = n2;
                l4 = kmf2.c;
                if (l5 + l2 > (long)l4) {
                    return new String(this.A(l2), (Charset)object);
                }
                byte[] byArray = kmf2.a;
                int n3 = (int)l2;
                object = new String(byArray, n2, n3, (Charset)object);
                kmf2.b = n2 += n3;
                this.b -= l2;
                if (n2 == l4) {
                    this.a = kmf2.a();
                    kmg.b(kmf2);
                }
                return object;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount: "));
    }

    public final String k() {
        return this.j(this.b, jts.a);
    }

    public final String l(long l2) {
        return this.j(l2, jts.a);
    }

    @Override
    public final String m() {
        throw null;
    }

    @Override
    public final String n(long l2) {
        throw null;
    }

    public final klp o() {
        return this.p(this.b);
    }

    @Override
    public final klp p(long l2) {
        if (l2 >= 0L && l2 <= Integer.MAX_VALUE) {
            if (this.b >= l2) {
                klp klp2;
                if (l2 >= 4096L) {
                    klp2 = this.r((int)l2);
                    this.x(l2);
                } else {
                    klp2 = new klp(this.A(l2));
                }
                return klp2;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(l2, "byteCount: "));
    }

    public final klp q() {
        long l2 = this.b;
        if (l2 <= Integer.MAX_VALUE) {
            return this.r((int)l2);
        }
        throw new IllegalStateException(a.ap(l2, "size > Int.MAX_VALUE: "));
    }

    public final klp r(int n2) {
        Object object;
        if (n2 == 0) {
            object = klp.a;
        } else {
            kmp.x(this.b, 0L, n2);
            object = this.a;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            while (n4 < n2) {
                jse.b(object);
                int n6 = ((kmf)object).c;
                int n7 = ((kmf)object).b;
                if (n6 != n7) {
                    n4 += n6 - n7;
                    ++n5;
                    object = ((kmf)object).f;
                    continue;
                }
                throw new AssertionError((Object)"s.limit == s.pos");
            }
            byte[][] byArrayArray = new byte[n5][];
            int[] nArray = new int[n5 + n5];
            object = this.a;
            n4 = 0;
            while (n3 < n2) {
                jse.b(object);
                byArrayArray[n4] = ((kmf)object).a;
                nArray[n4] = Math.min(n3 += ((kmf)object).c - ((kmf)object).b, n2);
                nArray[n4 + n5] = ((kmf)object).b;
                ((kmf)object).d = true;
                ++n4;
                object = ((kmf)object).f;
            }
            object = new kmh(byArrayArray, nArray);
        }
        return object;
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        int n2;
        jse.e(byteBuffer, "sink");
        kmf kmf2 = this.a;
        if (kmf2 == null) {
            return -1;
        }
        int n3 = Math.min(byteBuffer.remaining(), kmf2.c - kmf2.b);
        byteBuffer.put(kmf2.a, kmf2.b, n3);
        kmf2.b = n2 = kmf2.b + n3;
        this.b -= (long)n3;
        if (n2 == kmf2.c) {
            this.a = kmf2.a();
            kmg.b(kmf2);
        }
        return n3;
    }

    public final kmf s(int n2) {
        if (n2 > 0) {
            kmf kmf2 = this.a;
            if (kmf2 == null) {
                this.a = kmf2 = kmg.a();
                kmf2.g = kmf2;
                kmf2.f = kmf2;
            } else {
                kmf2 = kmf2.g;
                jse.b(kmf2);
                if (kmf2.c + n2 > 8192 || !kmf2.e) {
                    kmf kmf3 = kmg.a();
                    kmf2.d(kmf3);
                    kmf2 = kmf3;
                }
            }
            return kmf2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final short t() {
        int n2;
        if (this.b < 2L) throw new EOFException();
        kmf kmf2 = this.a;
        jse.b(kmf2);
        int n3 = kmf2.b;
        int n4 = kmf2.c;
        if (n4 - n3 < 2) {
            n2 = (this.d() & 0xFF) << 8 | this.d() & 0xFF;
            return (short)n2;
        }
        byte[] byArray = kmf2.a;
        n2 = byArray[n3];
        byte by2 = byArray[n3 + 1];
        this.b -= 2L;
        if ((n3 += 2) == n4) {
            this.a = kmf2.a();
            kmg.b(kmf2);
        } else {
            kmf2.b = n3;
        }
        n2 = (n2 & 0xFF) << 8 | by2 & 0xFF;
        return (short)n2;
    }

    public final String toString() {
        return this.q().toString();
    }

    public final short u() {
        short s2 = this.t();
        return (short)((s2 & 0xFF) << 8 | s2 >>> 8 & 0xFF);
    }

    public final void v() {
        this.x(this.b);
    }

    @Override
    public final void w(long l2) {
        throw null;
    }

    @Override
    public final int write(ByteBuffer byteBuffer) {
        int n2;
        jse.e(byteBuffer, "source");
        int n3 = n2 = byteBuffer.remaining();
        while (n3 > 0) {
            kmf kmf2 = this.s(1);
            int n4 = Math.min(n3, 8192 - kmf2.c);
            byteBuffer.get(kmf2.a, kmf2.c, n4);
            n3 -= n4;
            kmf2.c += n4;
        }
        this.b += (long)n2;
        return n2;
    }

    @Override
    public final void x(long l2) {
        while (l2 > 0L) {
            kmf kmf2 = this.a;
            if (kmf2 != null) {
                int n2 = (int)Math.min(l2, (long)(kmf2.c - kmf2.b));
                long l3 = this.b;
                long l4 = n2;
                this.b = l3 - l4;
                l4 = l2 - l4;
                kmf2.b = n2 = kmf2.b + n2;
                l2 = l4;
                if (n2 != kmf2.c) continue;
                this.a = kmf2.a();
                kmg.b(kmf2);
                l2 = l4;
                continue;
            }
            throw new EOFException();
        }
    }

    @Override
    public final boolean y() {
        return this.b == 0L;
    }

    public final byte[] z() {
        return this.A(this.b);
    }
}

