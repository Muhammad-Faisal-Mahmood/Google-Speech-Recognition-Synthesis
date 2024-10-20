/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class kik
extends kii {
    final kio c;
    private final kgm d;
    private long e;
    private boolean f;

    public kik(kio kio2, kgm kgm2) {
        this.c = kio2;
        super(kio2);
        this.d = kgm2;
        this.e = -1L;
        this.f = true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(klm var1_1, long var2_3) {
        block18: {
            block16: {
                block17: {
                    if (this.a != false) throw new IllegalStateException("closed");
                    if (!this.f) {
                        return -1L;
                    }
                    var2_3 = var12_4 = this.e;
                    if (var12_4 == 0L) break block17;
                    if (var12_4 != -1L) break block18;
                    var2_3 = -1L;
                }
                if (var2_3 != -1L) {
                    this.c.c.m();
                }
                try {
                    var15_5 = this.c.c;
                    ((kme)var15_5).w(1L);
                    var6_6 = 0;
                    while (var14_9 = ((kme)var15_5).e(var7_7 = var6_6 + 1)) {
                        var8_8 = ((kme)var15_5).b.c(var6_6);
                        if (var8_8 >= 48 && var8_8 <= 57 || var8_8 >= 97 && var8_8 <= 102 || var8_8 >= 65 && var8_8 <= 70) {
                            var6_6 = var7_7;
                            continue;
                        }
                        if (var6_6 != 0) break;
                        jse.ab(16);
                        var15_5 = Integer.toString(var8_8, 16);
                        jse.d(var15_5, "toString(...)");
                        var1_1 = new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(String.valueOf(var15_5)));
                        throw var1_1;
                    }
                    var17_10 = ((kme)var15_5).b;
                    if (var17_10.b != 0L) {
                        var9_11 = 0;
                        var2_3 = 0L;
                        var7_7 = 0;
lbl32:
                        // 2 sources

                        while (true) {
                            var15_5 = var17_10.a;
                            jse.b(var15_5);
                            var16_14 /* !! */  = var15_5.a;
                            var8_8 = var15_5.b;
                            var10_12 = var15_5.c;
                            break;
                        }
                    }
                    ** GOTO lbl120
                }
                catch (NumberFormatException var1_2) {
                    throw new ProtocolException(var1_2.getMessage());
                }
                while (true) {
                    block20: {
                        block21: {
                            block19: {
                                var6_6 = var7_7;
                                if (var8_8 >= var10_12) ** GOTO lbl74
                                var11_13 = var16_14 /* !! */ [var8_8];
                                if (var11_13 < 48 || var11_13 > 57) break block19;
                                var6_6 = var11_13 - 48;
                                break block20;
                            }
                            if (var11_13 < 97 || var11_13 > 102) break block21;
                            var6_6 = var11_13 - 87;
                            break block20;
                        }
                        if (var11_13 < 65 || var11_13 > 70) ** GOTO lbl67
                        var6_6 = var11_13 - 55;
                    }
                    if ((var2_3 & -1152921504606846976L) != 0L) break;
                    var2_3 = var2_3 << 4 | (long)var6_6;
                    ++var9_11;
                    ++var8_8;
                }
                {
                    var1_1 = new klm();
                    var1_1.O(var2_3);
                    var1_1.F(var11_13);
                    var15_5 = new NumberFormatException("Number too large: ".concat(var1_1.k()));
                    throw var15_5;
lbl67:
                    // 1 sources

                    var6_6 = 1;
                    if (var9_11 == 0) {
                        var5_15 = kmo.a[var11_13 >> 4 & 15];
                        var4_16 = kmo.a[var11_13 & 15];
                        var15_5 = new String(new char[]{var5_15, var4_16});
                        var1_1 = new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat((String)var15_5));
                        throw var1_1;
                    }
lbl74:
                    // 3 sources

                    if (var8_8 == var10_12) {
                        var17_10.a = var15_5.a();
                        kmg.b((kmf)var15_5);
                    } else {
                        var15_5.b = var8_8;
                    }
                    if (var6_6 == 0 && var17_10.a != null) {
                        var7_7 = var6_6;
                        ** continue;
                    }
                    var17_10.b -= (long)var9_11;
                    this.e = var2_3;
                    var15_5 = jse.w(this.c.c.m()).toString();
                    if (this.e < 0L || var15_5.length() > 0 && !(var14_9 = jse.X((String)var15_5, ";"))) ** GOTO lbl-1000
                    if (this.e != 0L) break block16;
                    this.f = false;
                    var15_5 = this.c;
                }
                var15_5.g = var15_5.f.b();
                var15_5 = this.c.a;
                jse.b(var15_5);
                var16_14 /* !! */  = (byte[])this.d;
                var17_10 = this.c.g;
                jse.b(var17_10);
                kic.a(var15_5.i, (kgm)var16_14 /* !! */ , (kgk)var17_10);
                this.c();
            }
            if (this.f == false) return -1L;
        }
        if ((var2_3 = super.b((klm)var1_1, Math.min(8192L, this.e))) != -1L) {
            this.e -= var2_3;
            return var2_3;
        }
        this.c.b.e();
        var1_1 = new ProtocolException("unexpected end of stream");
        this.c();
        throw var1_1;
lbl-1000:
        // 1 sources

        {
            var16_14 /* !! */  = (byte[])new ProtocolException;
            var2_3 = this.e;
            var1_1 = new StringBuilder();
            var1_1.append("expected chunk size and optional extensions but was \"");
            var1_1.append(var2_3);
            var1_1.append((String)var15_5);
            var1_1.append("\"");
            var16_14 /* !! */ (var1_1.toString());
            throw var16_14 /* !! */ ;
lbl120:
            // 1 sources

            var1_1 = new EOFException();
            throw var1_1;
        }
    }

    @Override
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.f && !khb.D(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            this.c();
        }
        this.d();
    }
}

