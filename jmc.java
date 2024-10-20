/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

public final class jmc
implements jlu {
    public int a;
    private final kln b;
    private final klm c;
    private final jlx d;
    private boolean e;

    public jmc(kln kln2) {
        this.b = kln2;
        kln2 = new klm();
        this.c = kln2;
        this.d = new jlx((klm)kln2);
        this.a = 16384;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        synchronized (this) {
            if (this.e) {
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            if (jmd.a.isLoggable(Level.FINE)) {
                jmd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", jmd.b.d()));
            }
            Object object = this.b;
            byte[] byArray = jmd.b.k();
            jse.e(byArray, "source");
            if (!((kmc)object).c) {
                ((kmc)object).b.N(byArray);
                ((kmc)object).c();
                this.b.flush();
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
    @Override
    public final void b(boolean bl2, int n2, klm object, int n3) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            this.k(n2, n3, (byte)0, (byte)(bl2 ? 1 : 0));
            if (n3 > 0) {
                this.b.bK((klm)object, n3);
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
    public final void c() {
        synchronized (this) {
            if (!this.e) {
                this.b.flush();
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
    @Override
    public final void close() {
        synchronized (this) {
            this.e = true;
            this.b.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(boolean bl2, int n2, int n3) {
        synchronized (this) {
            if (!this.e) {
                this.k(0, 8, (byte)6, (byte)(bl2 ? 1 : 0));
                this.b.I(n2);
                this.b.I(n3);
                this.b.flush();
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
    @Override
    public final void e(int n2, jlt object) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            if (object.s != -1) {
                this.k(n2, 4, (byte)3, (byte)0);
                this.b.I(object.s);
                this.b.flush();
                return;
            }
            object = new IllegalArgumentException();
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(int n2, long l2) {
        synchronized (this) {
            if (this.e) {
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            if (l2 != 0L) {
                this.k(n2, 4, (byte)8, (byte)0);
                this.b.I((int)l2);
                this.b.flush();
                return;
            }
            throw jmd.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g(jlt object, byte[] byArray) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            if (object.s != -1) {
                this.k(0, 8, (byte)7, (byte)0);
                this.b.I(0);
                this.b.I(object.s);
                this.b.flush();
                return;
            }
            throw jmd.d("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(boolean var1_1, int var2_2, List var3_3) {
        synchronized (this) {
            block26: {
                if (this.e) {
                    var3_3 = new IOException("closed");
                    throw var3_3;
                }
                var18_4 = this.d;
                var10_5 = var3_3.size();
                var8_6 = 0;
                while (true) {
                    block27: {
                        block30: {
                            block28: {
                                block25: {
                                    block29: {
                                        if (var8_6 >= var10_5) break block28;
                                        var17_13 = (jlv)var3_3.get(var8_6);
                                        var15_11 = var17_13.f.g();
                                        var16_12 = var17_13.g;
                                        var19_14 = (jlv[])jly.c.get(var15_11);
                                        if (var19_14 == null) break block29;
                                        var5_7 = var19_14.intValue();
                                        var6_8 = var5_7 + 1;
                                        if (var6_8 < 2 || var6_8 > 7) ** GOTO lbl-1000
                                        if (jly.b[var5_7].g.equals(var16_12)) {
                                            var5_7 = (int)var6_8;
                                            break block25;
                                        } else if (jly.b[var6_8].g.equals(var16_12)) {
                                            var7_9 = var5_7 + 2;
                                            var5_7 = (int)var6_8;
                                            var6_8 = var7_9;
                                            break block25;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var5_7 = (int)var6_8;
                                            var6_8 = -1;
                                        }
                                        break block25;
                                    }
                                    var5_7 = -1;
                                    var6_8 = -1;
                                }
                                var9_10 = var5_7;
                                var7_9 = var6_8;
                                if (var6_8 != -1) break block27;
                                break block30;
                            }
                            var11_15 = this.c.b;
                            var5_7 = (int)Math.min((long)this.a, var11_15);
                            var13_16 = var5_7;
                            cfr_temp_0 = var11_15 - var13_16;
                            var6_8 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            var4_17 = var6_8 == false ? 4 : 0;
                            this.k(var2_2, var5_7, (byte)1, var4_17);
                            this.b.bK(this.c, var13_16);
                            if (var6_8 > 0) {
                                var11_15 -= var13_16;
                                break;
                            }
                            break block26;
                        }
                        for (var6_8 = (long)(var18_4.d + 1); var6_8 < (var19_14 = var18_4.b).length; ++var6_8) {
                            var7_9 = var5_7;
                            if (var19_14[var6_8].f.equals(var15_11)) {
                                if (var18_4.b[var6_8].g.equals(var16_12)) {
                                    var9_10 = var18_4.d;
                                    var7_9 = jly.b.length;
                                    var7_9 = var6_8 - var9_10 + 61;
                                    var9_10 = var5_7;
                                    break block27;
                                }
                                var7_9 = var5_7;
                                if (var5_7 == -1) {
                                    var7_9 = var18_4.d;
                                    var5_7 = jly.b.length;
                                    var7_9 = var6_8 - var7_9 + 61;
                                }
                            }
                            var5_7 = (int)var7_9;
                        }
                        var7_9 = -1;
                        var9_10 = var5_7;
                    }
                    if (var7_9 != -1) {
                        var18_4.c((int)var7_9, 127, 128);
                    } else if (var9_10 == -1) {
                        var18_4.a.F(64);
                        var18_4.b(var15_11);
                        var18_4.b(var16_12);
                        var18_4.a(var17_13);
                    } else if (var15_11.i(jly.a) && !jlv.e.equals(var15_11)) {
                        var18_4.c(var9_10, 15, 0);
                        var18_4.b(var16_12);
                    } else {
                        var18_4.c(var9_10, 63, 64);
                        var18_4.b(var16_12);
                        var18_4.a(var17_13);
                    }
                    ++var8_6;
                }
                while (var11_15 > 0L) {
                    var4_17 = (var11_15 -= (var13_16 = (long)(var5_7 = (int)Math.min((long)this.a, var11_15)))) == 0L ? 4 : 0;
                    this.k(var2_2, var5_7, (byte)9, var4_17);
                    this.b.bK(this.c, var13_16);
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
    @Override
    public final void i(khv object) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            int n2 = this.a;
            if ((((khv)object).a & 0x20) != 0) {
                n2 = ((int[])((khv)object).b)[5];
            }
            this.a = n2;
            this.k(0, 0, (byte)4, (byte)1);
            this.b.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void j(khv object) {
        synchronized (this) {
            if (this.e) {
                object = new IOException("closed");
                throw object;
            }
            int n2 = Integer.bitCount(((khv)object).a);
            int n3 = 0;
            this.k(0, n2 * 6, (byte)4, (byte)0);
            while (true) {
                if (n3 >= 10) {
                    this.b.flush();
                    return;
                }
                n2 = n3;
                if (((khv)object).e(n3)) {
                    if (n3 == 4) {
                        n2 = 3;
                    } else {
                        int n4;
                        n2 = 7;
                        if (n3 == 7) {
                            n4 = 4;
                            n3 = n2;
                            n2 = n4;
                        } else {
                            n4 = n3;
                            n2 = n3;
                            n3 = n4;
                        }
                    }
                    this.b.J(n2);
                    this.b.I(((khv)object).c(n3));
                    n2 = n3;
                }
                n3 = n2 + 1;
            }
        }
    }

    final void k(int n2, int n3, byte by2, byte by3) {
        int n4;
        if (jmd.a.isLoggable(Level.FINE)) {
            jmd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", jma.a(false, n2, n3, by2, by3));
        }
        if (n3 <= (n4 = this.a)) {
            if ((Integer.MIN_VALUE & n2) == 0) {
                kln kln2 = this.b;
                kln2.G(n3 >>> 16 & 0xFF);
                kln2.G(n3 >>> 8 & 0xFF);
                kln2.G(n3 & 0xFF);
                this.b.G(by2);
                this.b.G(by3);
                this.b.I(n2 & Integer.MAX_VALUE);
                return;
            }
            throw jmd.d("reserved bit set: %s", n2);
        }
        throw jmd.d("FRAME_SIZE_ERROR length > %d: %d", n4, n3);
    }
}

