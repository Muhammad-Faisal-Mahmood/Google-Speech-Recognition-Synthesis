/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class hiw
extends him {
    private long b = 0L;
    private long c = 0L;
    private int d = 0;

    private static long k(long l2) {
        l2 = (l2 ^ l2 >>> 33) * -49064778989728563L;
        l2 = (l2 ^ l2 >>> 33) * -4265267296055464877L;
        return l2 ^ l2 >>> 33;
    }

    private static long l(long l2) {
        return Long.rotateLeft(l2 * -8663945395140668459L, 31) * 5545529020109919103L;
    }

    private static long m(long l2) {
        return Long.rotateLeft(l2 * 5545529020109919103L, 33) * -8663945395140668459L;
    }

    @Override
    public final hio c() {
        long l2 = this.b;
        long l3 = this.d;
        long l4 = l3 ^ this.c;
        this.b = l2 = (l2 ^ l3) + l4;
        this.c = l3 = l4 + l2;
        this.b = l4 = hiw.k(l2);
        l2 = hiw.k(l3);
        this.b = l4 += l2;
        this.c = l2 + l4;
        byte[] byArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.b).putLong(this.c).array();
        int n2 = hio.b;
        return new hin(byArray);
    }

    @Override
    protected final void i(ByteBuffer byteBuffer) {
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        long l4 = this.b;
        this.b = l2 = hiw.l(l2) ^ l4;
        l2 = Long.rotateLeft(l2, 27);
        l4 = this.c;
        this.b = (l2 + l4) * 5L + 1390208809L;
        this.c = l3 = hiw.m(l3) ^ l4;
        this.c = (Long.rotateLeft(l3, 31) + this.b) * 5L + 944331445L;
        this.d += 16;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void j(ByteBuffer var1_1) {
        block17: {
            block18: {
                this.d += var1_1.remaining();
                var2_2 = var1_1.remaining();
                var7_4 = var3_3 = 0L;
                var15_5 = var3_3;
                var9_6 = var3_3;
                var13_7 = var3_3;
                var17_8 = var3_3;
                var11_9 = var3_3;
                var5_10 = var3_3;
                switch (var2_2) {
                    default: {
                        throw new AssertionError((Object)"Should never get here.");
                    }
                    case 15: {
                        var7_4 = (long)hhk.ad(var1_1.get(14)) << 48;
                    }
                    case 14: {
                        var15_5 = var7_4 ^ (long)hhk.ad(var1_1.get(13)) << 40;
                    }
                    case 13: {
                        var9_6 = var15_5 ^ (long)hhk.ad(var1_1.get(12)) << 32;
                    }
                    case 12: {
                        var13_7 = var9_6 ^ (long)hhk.ad(var1_1.get(11)) << 24;
                    }
                    case 11: {
                        var17_8 = var13_7 ^ (long)hhk.ad(var1_1.get(10)) << 16;
                    }
                    case 10: {
                        var11_9 = var17_8 ^ (long)hhk.ad(var1_1.get(9)) << 8;
                    }
                    case 9: {
                        var5_10 = var11_9 ^ (long)hhk.ad(var1_1.get(8));
                    }
                    case 8: {
                        var7_4 = var1_1.getLong();
                        var3_3 = var5_10;
                        break block17;
                    }
                    case 7: {
                        var5_10 = (long)hhk.ad(var1_1.get(6)) << 48;
                        ** GOTO lbl36
                    }
                    case 6: {
                        var5_10 = 0L;
lbl36:
                        // 2 sources

                        var5_10 = (long)hhk.ad(var1_1.get(5)) << 40 ^ var5_10;
                        ** GOTO lbl40
                    }
                    case 5: {
                        var5_10 = 0L;
lbl40:
                        // 2 sources

                        var5_10 ^= (long)hhk.ad(var1_1.get(4)) << 32;
                        ** GOTO lbl44
                    }
                    case 4: {
                        var5_10 = 0L;
lbl44:
                        // 2 sources

                        var5_10 ^= (long)hhk.ad(var1_1.get(3)) << 24;
                        ** GOTO lbl48
                    }
                    case 3: {
                        var5_10 = 0L;
lbl48:
                        // 2 sources

                        var5_10 ^= (long)hhk.ad(var1_1.get(2)) << 16;
                        ** GOTO lbl52
                    }
                    case 2: {
                        var5_10 = 0L;
lbl52:
                        // 2 sources

                        var5_10 ^= (long)hhk.ad(var1_1.get(1)) << 8;
                        break block18;
                    }
                    case 1: 
                }
                var5_10 = 0L;
            }
            var7_4 = var5_10 ^ (long)hhk.ad(var1_1.get(0));
        }
        var5_10 = this.b;
        this.b = hiw.l(var7_4) ^ var5_10;
        this.c ^= hiw.m(var3_3);
    }
}

