/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kjt
implements Closeable {
    private static final Logger b = Logger.getLogger(kiv.class.getName());
    public int a;
    private final kln c;
    private final klm d;
    private boolean e;
    private final kit f;

    public kjt(kln kln2) {
        jse.e(kln2, "sink");
        this.c = kln2;
        kln2 = new klm();
        this.d = kln2;
        this.a = 16384;
        this.f = new kit((klm)kln2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(kjx object) {
        synchronized (this) {
            jse.e(object, "peerSettings");
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            int n2 = this.a;
            if ((((kjx)object).a & 0x20) != 0) {
                n2 = ((int[])((kjx)object).b)[5];
            }
            this.a = n2;
            if (((kjx)object).b() != -1) {
                kit kit2 = this.f;
                int n3 = kit2.d;
                n2 = Math.min(((kjx)object).b(), 16384);
                if (n3 != n2) {
                    if (n2 < n3) {
                        kit2.b = Math.min(kit2.b, n2);
                    }
                    kit2.c = true;
                    kit2.d = n2;
                    n3 = kit2.h;
                    if (n2 < n3) {
                        if (n2 == 0) {
                            kit2.a();
                        } else {
                            kit2.e(n3 - n2);
                        }
                    }
                }
            }
            this.e(0, 0, 4, 1);
            this.c.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            if (this.e) {
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            Object object = b;
            if (((Logger)object).isLoggable(Level.FINE)) {
                ((Logger)object).fine(khb.k(">> CONNECTION ".concat(kiv.a.d()), new Object[0]));
            }
            kln kln2 = this.c;
            object = kiv.a;
            jse.e(object, "byteString");
            if (!((kmc)kln2).c) {
                ((kmc)kln2).b.B((klp)object);
                ((kmc)kln2).c();
                this.c.flush();
                return;
            }
            object = new IllegalStateException("closed");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(boolean bl2, int n2, klm object, int n3) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            this.e(n2, n3, 0, bl2 ? 1 : 0);
            if (n3 > 0) {
                kln kln2 = this.c;
                jse.b(object);
                kln2.bK((klm)object, n3);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        synchronized (this) {
            this.e = true;
            this.c.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            if (!this.e) {
                this.c.flush();
                return;
            }
            IOException iOException = new IOException("closed");
            throw iOException;
        }
    }

    public final void e(int n2, int n3, int n4, int n5) {
        int n6;
        Object object;
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            object = kiv.a;
            logger.fine(kiv.b(false, n2, n3, n4, n5));
        }
        if (n3 <= (n6 = this.a)) {
            if ((Integer.MIN_VALUE & n2) == 0) {
                object = this.c;
                jse.e(object, "<this>");
                object.G(n3 >>> 16 & 0xFF);
                object.G(n3 >>> 8 & 0xFF);
                object.G(n3 & 0xFF);
                this.c.G(n4);
                this.c.G(n5);
                this.c.I(n2 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.af(n2, "reserved bit set: "));
        }
        throw new IllegalArgumentException(a.an(n3, n6, "FRAME_SIZE_ERROR length > ", ": "));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(boolean var1_1, int var2_2, List var3_3) {
        synchronized (this) {
            block29: {
                if (this.e) {
                    var3_3 = new IOException("closed");
                    throw var3_3;
                }
                var15_4 = this.f;
                if (var15_4.c) {
                    var4_5 = var15_4.b;
                    if (var4_5 < var15_4.d) {
                        var15_4.d(var4_5, 31, 32);
                    }
                    var15_4.c = false;
                    var15_4.b = 0x7FFFFFFF;
                    var15_4.d(var15_4.d, 31, 32);
                }
                var9_6 = var3_3.size();
                var7_7 = 0;
                while (true) {
                    block30: {
                        block33: {
                            block31: {
                                block28: {
                                    block32: {
                                        if (var7_7 >= var9_6) break block31;
                                        var17_13 = (kir)var3_3.get(var7_7);
                                        var16_12 = var17_13.g.g();
                                        var14_11 = var17_13.h;
                                        var18_14 = kiu.a;
                                        var18_14 = (Integer)kiu.b.get(var16_12);
                                        if (var18_14 == null) break block32;
                                        var4_5 = var18_14.intValue();
                                        var5_8 = var4_5 + 1;
                                        if (var5_8 < 2 || var5_8 >= 8) ** GOTO lbl-1000
                                        if (jse.i(kiu.a[var4_5].h, var14_11)) {
                                            var4_5 = var5_8;
                                            break block28;
                                        } else if (jse.i(kiu.a[var5_8].h, var14_11)) {
                                            var6_9 = var4_5 + 2;
                                            var4_5 = var5_8;
                                            var5_8 = (int)var6_9;
                                            break block28;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var4_5 = var5_8;
                                            var5_8 = -1;
                                        }
                                        break block28;
                                    }
                                    var4_5 = -1;
                                    var5_8 = -1;
                                }
                                var8_10 = var4_5;
                                var6_9 = var5_8;
                                if (var5_8 != -1) break block30;
                                var8_10 = var15_4.e.length;
                                break block33;
                            }
                            var10_15 = this.d.b;
                            var12_16 = Math.min((long)this.a, var10_15);
                            cfr_temp_0 = var10_15 - var12_16;
                            var6_9 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            var4_5 = var6_9 == false ? 4 : 0;
                            var5_8 = var4_5;
                            if (var1_1) {
                                var5_8 = var4_5 | 1;
                            }
                            this.e(var2_2, (int)var12_16, 1, var5_8);
                            this.c.bK(this.d, var12_16);
                            if (var6_9 > 0) {
                                var10_15 -= var12_16;
                                break;
                            }
                            break block29;
                        }
                        for (var5_8 = var15_4.f + 1; var5_8 < var8_10; ++var5_8) {
                            var18_14 = var15_4.e[var5_8];
                            jse.b(var18_14);
                            var6_9 = var4_5;
                            if (jse.i(var18_14.g, var16_12)) {
                                var18_14 = var15_4.e[var5_8];
                                jse.b(var18_14);
                                if (jse.i(var18_14.h, var14_11)) {
                                    var6_9 = var15_4.f;
                                    var8_10 = kiu.a.length;
                                    var6_9 = var5_8 - var6_9 + 61;
                                    var8_10 = var4_5;
                                    break block30;
                                }
                                var6_9 = var4_5;
                                if (var4_5 == -1) {
                                    var4_5 = var15_4.f;
                                    var6_9 = kiu.a.length;
                                    var6_9 = var5_8 - var4_5 + 61;
                                }
                            }
                            var4_5 = (int)var6_9;
                        }
                        var6_9 = -1;
                        var8_10 = var4_5;
                    }
                    if (var6_9 != -1) {
                        var15_4.d((int)var6_9, 127, 128);
                    } else if (var8_10 == -1) {
                        var15_4.a.F(64);
                        var15_4.c(var16_12);
                        var15_4.c(var14_11);
                        var15_4.b(var17_13);
                    } else if (var16_12.i(kir.a) && !jse.i(kir.f, var16_12)) {
                        var15_4.d(var8_10, 15, 0);
                        var15_4.c(var14_11);
                    } else {
                        var15_4.d(var8_10, 63, 64);
                        var15_4.c(var14_11);
                        var15_4.b(var17_13);
                    }
                    ++var7_7;
                }
                while (var10_15 > 0L) {
                    var12_16 = Math.min((long)this.a, var10_15);
                    var5_8 = (int)var12_16;
                    var4_5 = (var10_15 -= var12_16) == 0L ? 4 : 0;
                    this.e(var2_2, var5_8, 9, var4_5);
                    this.c.bK(this.d, var12_16);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(boolean bl2, int n2, int n3) {
        synchronized (this) {
            if (!this.e) {
                this.e(0, 8, 6, bl2 ? 1 : 0);
                this.c.I(n2);
                this.c.I(n3);
                this.c.flush();
                return;
            }
            IOException iOException = new IOException("closed");
            throw iOException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(int n2, kiq object) {
        synchronized (this) {
            jse.e(object, "errorCode");
            if (!this.e) {
                int n3 = object.o;
                this.e(n2, 4, 3, 0);
                this.c.I(object.o);
                this.c.flush();
                return;
            }
            object = new IOException("closed");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(kjx object) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            int n2 = Integer.bitCount(((kjx)object).a);
            int n3 = 0;
            this.e(0, n2 * 6, 4, 0);
            while (true) {
                if (n3 >= 10) {
                    this.c.flush();
                    return;
                }
                if (((kjx)object).f(n3)) {
                    n2 = n3 != 4 ? (n3 != 7 ? n3 : 4) : 3;
                    this.c.J(n2);
                    this.c.I(((kjx)object).a(n3));
                }
                ++n3;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(int n2, long l2) {
        synchronized (this) {
            if (this.e) {
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            if (l2 != 0L && l2 <= Integer.MAX_VALUE) {
                this.e(n2, 4, 8, 0);
                this.c.I((int)l2);
                this.c.flush();
                return;
            }
            String string = a.ap(l2, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string);
            throw illegalArgumentException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(int n2, kiq object) {
        synchronized (this) {
            jse.e(object, "errorCode");
            if (!this.e) {
                int n3 = object.o;
                this.e(0, 8, 7, 0);
                this.c.I(n2);
                this.c.I(object.o);
                this.c.flush();
                return;
            }
            object = new IOException("closed");
            throw object;
        }
    }
}

