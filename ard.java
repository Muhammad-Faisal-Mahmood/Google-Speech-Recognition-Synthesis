/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

public final class ard
implements apo {
    public boolean a;
    private final aga b = new aga(10);
    private final apw c = new apw();
    private final apv d = new apv();
    private final aqe e;
    private apq f;
    private aqe g;
    private aqe h;
    private int i;
    private aek j;
    private long k = -9223372036854775807L;
    private long l;
    private long m;
    private long n;
    private int o;
    private are p;
    private final bzb q = new bzb(null, null, null);

    public ard() {
        this(null);
    }

    public ard(byte[] object) {
        object = new apn();
        this.e = object;
        this.h = object;
        this.n = -1L;
    }

    /*
     * Unable to fully structure code
     */
    private final int g(app var1_1) {
        block69: {
            block65: {
                block67: {
                    block68: {
                        block63: {
                            block66: {
                                block64: {
                                    block62: {
                                        block54: {
                                            block53: {
                                                block50: {
                                                    block61: {
                                                        block59: {
                                                            block51: {
                                                                block60: {
                                                                    block58: {
                                                                        block57: {
                                                                            block56: {
                                                                                block55: {
                                                                                    if (this.i == 0) {
                                                                                        try {
                                                                                            this.l((app)var1_1, false);
                                                                                        }
                                                                                        catch (EOFException var1_2) {
                                                                                            return -1;
                                                                                        }
                                                                                    }
                                                                                    if (this.p != null) break block54;
                                                                                    var20_3 = new aga(this.c.c);
                                                                                    var1_1.h(var20_3.a, 0, this.c.c);
                                                                                    var19_4 = this.c;
                                                                                    if ((var19_4.a & 1) == 0) break block55;
                                                                                    if (var19_4.e == 1) ** GOTO lbl-1000
                                                                                    var2_5 = 36;
                                                                                    break block56;
                                                                                }
                                                                                if (var19_4.e != 1) lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var2_5 = 21;
                                                                                } else {
                                                                                    var2_5 = 13;
                                                                                }
                                                                            }
                                                                            if (var20_3.c < var2_5 + 4) break block57;
                                                                            var20_3.v(var2_5);
                                                                            var2_5 = var3_6 = var20_3.c();
                                                                            if (var3_6 == 1483304551) break block58;
                                                                            if (var3_6 != 1231971951) break block57;
                                                                            var2_5 = 1231971951;
                                                                            break block58;
                                                                        }
                                                                        if (var20_3.c < 40) ** GOTO lbl-1000
                                                                        var20_3.v(36);
                                                                        if (var20_3.c() == 1447187017) {
                                                                            var2_5 = 1447187017;
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var2_5 = 0;
                                                                        }
                                                                    }
                                                                    if (var2_5 == 1231971951) break block59;
                                                                    if (var2_5 == 1447187017) break block60;
                                                                    if (var2_5 != 1483304551) {
                                                                        var1_1.i();
lbl41:
                                                                        // 4 sources

                                                                        while (true) {
                                                                            var19_4 = null;
                                                                            break block50;
                                                                            break;
                                                                        }
                                                                    }
                                                                    break block59;
                                                                }
                                                                var19_4 = (apl)var1_1;
                                                                var7_9 = var19_4.b;
                                                                var11_13 = var19_4.c;
                                                                var22_17 = this.c;
                                                                var20_3.w(10);
                                                                var3_6 = var20_3.c();
                                                                if (var3_6 <= 0) {
                                                                    var19_4 = null;
                                                                } else {
                                                                    var4_7 = var22_17.d;
                                                                    var2_5 = var4_7 >= 32000 ? 1152 : 576;
                                                                    var9_11 = var2_5;
                                                                    var13_14 = var4_7;
                                                                    var13_14 = agf.j(var3_6, var9_11 * 1000000L, var13_14);
                                                                    var4_7 = var20_3.k();
                                                                    var5_8 = var20_3.k();
                                                                    var6_18 = var20_3.k();
                                                                    var20_3.w(2);
                                                                    var15_15 = var22_17.c;
                                                                    var19_4 = new long[var4_7];
                                                                    var21_16 = new long[var4_7];
                                                                    var9_11 = var11_13;
                                                                    for (var3_6 = 0; var3_6 < var4_7; ++var3_6) {
                                                                        var19_4[var3_6] = (long)var3_6 * var13_14 / (long)var4_7;
                                                                        var21_16[var3_6] = Math.max(var9_11, var15_15 + var11_13);
                                                                        if (var6_18 != 1) {
                                                                            if (var6_18 != 2) {
                                                                                if (var6_18 != 3) {
                                                                                    if (var6_18 != 4) {
                                                                                        var19_4 = null;
                                                                                        break block51;
                                                                                    }
                                                                                    var2_5 = var20_3.j();
                                                                                } else {
                                                                                    var2_5 = var20_3.i();
                                                                                }
                                                                            } else {
                                                                                var2_5 = var20_3.k();
                                                                            }
                                                                        } else {
                                                                            var2_5 = var20_3.h();
                                                                        }
                                                                        var17_19 = var5_8;
                                                                        var9_11 += (long)var2_5 * var17_19;
                                                                    }
                                                                    if (var7_9 != -1L && var7_9 != var9_11) {
                                                                        var20_3 = new StringBuilder("VBRI data size mismatch: ");
                                                                        var20_3.append(var7_9);
                                                                        var20_3.append(", ");
                                                                        var20_3.append(var9_11);
                                                                        afx.e("VbriSeeker", var20_3.toString());
                                                                    }
                                                                    var19_4 = new arf((long[])var19_4, (long[])var21_16, var13_14, var9_11, var22_17.f);
                                                                }
                                                            }
                                                            var1_1.j(this.c.c);
                                                            break block50;
                                                        }
                                                        var21_16 = this.c;
                                                        var5_8 = var20_3.c();
                                                        var3_6 = (var5_8 & 1) != 0 ? var20_3.j() : -1;
                                                        var7_9 = (var5_8 & 2) != 0 ? var20_3.o() : -1L;
                                                        if ((var5_8 & 4) == 4) {
                                                            var19_4 = new long[100];
                                                            for (var4_7 = 0; var4_7 < 100; ++var4_7) {
                                                                var19_4[var4_7] = (long)var20_3.h();
                                                            }
                                                        } else {
                                                            var19_4 = null;
                                                        }
                                                        if ((var5_8 & 8) != 0) {
                                                            var20_3.w(4);
                                                        }
                                                        if (var20_3.a() >= 24) {
                                                            var20_3.w(21);
                                                            var4_7 = var20_3.i();
                                                            var5_8 = var4_7 >> 12;
                                                            var4_7 &= 4095;
                                                        } else {
                                                            var4_7 = -1;
                                                            var5_8 = -1;
                                                        }
                                                        var13_14 = var3_6;
                                                        var20_3 = new apw((apw)var21_16);
                                                        var21_16 = this.d;
                                                        if ((var21_16.a == -1 || var21_16.b == -1) && var5_8 != -1) {
                                                            var21_16.a = var5_8;
                                                            var21_16.b = var4_7;
                                                        }
                                                        var21_16 = (apl)var1_1;
                                                        var11_13 = var21_16.c;
                                                        var15_15 = var21_16.b;
                                                        if (var15_15 != -1L && var7_9 != -1L && var15_15 != (var9_11 = var11_13 + var7_9)) {
                                                            var22_17 = new StringBuilder("Data size mismatch between stream (");
                                                            var22_17.append(var15_15);
                                                            var22_17.append(") and Xing frame (");
                                                            var22_17.append(var9_11);
                                                            var22_17.append("), using Xing value.");
                                                            afx.d("Mp3Extractor", var22_17.toString());
                                                        }
                                                        var1_1.j(this.c.c);
                                                        if (var2_5 != 1483304551) break block61;
                                                        var9_11 = ass.b((apw)var20_3, var13_14);
                                                        if (var9_11 == -9223372036854775807L) ** GOTO lbl41
                                                        var19_4 = var7_9 != -1L && var19_4 != null ? new arg(var11_13, var20_3.c, var9_11, var20_3.f, var7_9, (long[])var19_4) : new arg(var11_13, var20_3.c, var9_11, var20_3.f, -1L, null);
                                                        break block50;
                                                    }
                                                    var9_11 = var21_16.b;
                                                    var15_15 = ass.b((apw)var20_3, var13_14);
                                                    if (var15_15 == -9223372036854775807L) ** GOTO lbl41
                                                    if (var7_9 != -1L) {
                                                        var9_11 = var11_13 + var7_9;
                                                        var7_9 -= (long)var20_3.c;
                                                    } else {
                                                        if (var9_11 != -1L) ** break;
                                                        ** continue;
                                                        var7_9 = var9_11 - var11_13 - (long)var20_3.c;
                                                    }
                                                    var2_5 = hhk.ae(agf.k(var7_9, 8000000L, var15_15, RoundingMode.HALF_UP));
                                                    var3_6 = hhk.ae(hhk.as(var7_9, var13_14, RoundingMode.HALF_UP));
                                                    var19_4 = new ara(var9_11, var11_13 + (long)var20_3.c, var2_5, var3_6);
                                                }
                                                var22_17 = this.j;
                                                var21_16 = (apl)var1_1;
                                                var11_13 = var21_16.c;
                                                if (var22_17 != null) {
                                                    var3_6 = var22_17.a();
                                                    for (var2_5 = 0; var2_5 < var3_6; ++var2_5) {
                                                        block52: {
                                                            var20_3 = var22_17.b(var2_5);
                                                            if (!(var20_3 instanceof aqv)) continue;
                                                            var20_3 = (aqv)var20_3;
                                                            var3_6 = var22_17.a();
                                                            for (var2_5 = 0; var2_5 < var3_6; ++var2_5) {
                                                                var23_20 = var22_17.b(var2_5);
                                                                if (!(var23_20 instanceof aqx)) continue;
                                                                var23_20 = (aqx)var23_20;
                                                                if (!var23_20.f.equals("TLEN")) continue;
                                                                var7_9 = agf.i(Long.parseLong((String)var23_20.b.get(0)));
                                                                break block52;
                                                            }
                                                            var7_9 = -9223372036854775807L;
                                                        }
                                                        var2_5 = var20_3.d.length;
                                                        var3_6 = var2_5 + 1;
                                                        var23_20 = new long[var3_6];
                                                        var22_17 = new long[var3_6];
                                                        var23_20[0] = var11_13;
                                                        var22_17[0] = 0L;
                                                        var9_11 = 0L;
                                                        for (var3_6 = 1; var3_6 <= var2_5; ++var3_6) {
                                                            var5_8 = var20_3.b;
                                                            var24_21 = var20_3.d;
                                                            var4_7 = var3_6 - 1;
                                                            var23_20[var3_6] = var11_13 += (long)(var5_8 + var24_21[var4_7]);
                                                            var22_17[var3_6] = var9_11 += (long)(var20_3.c + var20_3.e[var4_7]);
                                                        }
                                                        var20_3 = new arc((long[])var23_20, (long[])var22_17, var7_9);
                                                        break block53;
                                                    }
                                                }
                                                var20_3 = null;
                                            }
                                            if (this.a) {
                                                var20_3 = new aqa(-9223372036854775807L);
                                            } else {
                                                if (var20_3 == null) {
                                                    var20_3 = var19_4;
                                                    if (var19_4 == null) {
                                                        var20_3 = null;
                                                    }
                                                }
                                                if (var20_3 != null) {
                                                    var20_3.d();
                                                } else {
                                                    var1_1.h(this.b.a, 0, 4);
                                                    this.b.v(0);
                                                    this.c.a(this.b.c());
                                                    var7_9 = var21_16.b;
                                                    var9_11 = var21_16.c;
                                                    var19_4 = this.c;
                                                    var20_3 = new ara(var7_9, var9_11, var19_4.f, var19_4.c);
                                                }
                                            }
                                            this.p = var20_3;
                                            this.f.v((aqb)var20_3);
                                            var19_4 = new adt();
                                            var19_4.a(this.c.b);
                                            var19_4.n = 4096;
                                            var20_3 = this.c;
                                            var19_4.B = var20_3.e;
                                            var19_4.C = var20_3.d;
                                            var20_3 = this.d;
                                            var19_4.E = var20_3.a;
                                            var19_4.F = var20_3.b;
                                            var19_4.k = this.j;
                                            if (this.p.b() != -2147483647) {
                                                var19_4.h = this.p.b();
                                            }
                                            this.h.h(new adu((adt)var19_4));
                                            this.m = var21_16.c;
                                            break block62;
                                        }
                                        var7_10 = this.m;
                                        if (var7_10 != 0L && (var9_12 = ((apl)var1_1).c) < var7_10) {
                                            var1_1.j((int)(var7_10 - var9_12));
                                        }
                                    }
                                    var2_5 = var3_6 = this.o;
                                    if (var3_6 != 0) break block63;
                                    var1_1.i();
                                    if (!this.k((app)var1_1)) break block64;
                                    var2_5 = -1;
                                    break block65;
                                }
                                this.b.v(0);
                                var2_5 = this.b.c();
                                if (ard.j(var2_5, this.i) && apx.a(var2_5) != -1) break block66;
                                var1_1.j(1);
                                this.i = 0;
                                break block67;
                            }
                            this.c.a(var2_5);
                            if (this.k == -9223372036854775807L) {
                                this.k = this.p.f(((apl)var1_1).c);
                            }
                            var19_4 = this.c;
                            this.o = var2_5 = var19_4.c;
                            this.n = ((apl)var1_1).c + (long)var2_5;
                            var20_3 = this.p;
                            if (var20_3 instanceof arb) {
                                var1_1 = (arb)var20_3;
                                this.h(this.l + (long)var19_4.g);
                                throw null;
                            }
                        }
                        if ((var2_5 = this.h.d((adn)var1_1, var2_5, true)) != -1) break block68;
                        var2_5 = -1;
                        break block65;
                    }
                    this.o = var2_5 = this.o - var2_5;
                    if (var2_5 <= 0) break block69;
                }
                var2_5 = 0;
            }
            return var2_5;
        }
        this.h.m(this.h(this.l), 1, this.c.c, 0, null);
        this.l += (long)this.c.g;
        this.o = 0;
        return 0;
    }

    private final long h(long l2) {
        apw apw2 = this.c;
        return this.k + l2 * 1000000L / (long)apw2.d;
    }

    private final void i() {
        long l2;
        Object object = this.p;
        if (object instanceof ara && object.d() && (l2 = this.n) != -1L && l2 != this.p.e()) {
            object = (ara)this.p;
            this.p = new ara(this.n, ((ara)object).a, ((ara)object).b, ((ara)object).c);
            object = this.f;
            abr.i(object);
            object.v(this.p);
        }
    }

    private static boolean j(int n2, long l2) {
        return (long)(n2 & 0xFFFE0C00) == (l2 & 0xFFFFFFFFFFFE0C00L);
    }

    private final boolean k(app app2) {
        long l2;
        are are2 = this.p;
        if (are2 != null && (l2 = are2.e()) != -1L && app2.e() > l2 - 4L) {
            return true;
        }
        try {
            boolean bl2 = app2.l(this.b.a, 0, 4, true);
            return !bl2;
        }
        catch (EOFException eOFException) {
            return true;
        }
    }

    private final boolean l(app app2, boolean bl2) {
        int n2;
        int n3;
        app2.i();
        if (((apl)app2).c == 0L) {
            aek aek2;
            this.j = aek2 = this.q.P(app2, null);
            if (aek2 != null) {
                apv apv2 = this.d;
                for (n3 = 0; n3 < aek2.a(); ++n3) {
                    aej aej2 = aek2.b(n3);
                    if (aej2 instanceof aqp) {
                        aej2 = (aqp)aej2;
                        if (!"iTunSMPB".equals(((aqp)aej2).b) || !apv2.a(((aqp)aej2).c)) continue;
                        break;
                    }
                    if (!(aej2 instanceof aqu)) continue;
                    aej2 = (aqu)aej2;
                    if ("com.apple.iTunes".equals(((aqu)aej2).a) && "iTunSMPB".equals(((aqu)aej2).b) && apv2.a(((aqu)aej2).c)) break;
                }
            }
            n2 = (int)app2.e();
            if (!bl2) {
                app2.j(n2);
            }
        } else {
            n2 = 0;
        }
        n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            block22: {
                block20: {
                    block21: {
                        block19: {
                            if (!this.k(app2)) break block19;
                            if (n4 <= 0) {
                                this.i();
                                throw new EOFException();
                            }
                            break block20;
                        }
                        this.b.v(0);
                        int n8 = this.b.c();
                        if (n3 != 0 && !ard.j(n8, n3) || (n7 = apx.a(n8)) == -1) {
                            n3 = true != bl2 ? 131072 : 32768;
                            n4 = n5 + 1;
                            if (n5 == n3) {
                                if (bl2) {
                                    return false;
                                }
                                this.i();
                                throw new EOFException();
                            }
                            if (bl2) {
                                app2.i();
                                app2.f(n2 + n4);
                            } else {
                                app2.j(1);
                            }
                            n3 = 0;
                            n5 = n4;
                            n4 = 0;
                            continue;
                        }
                        n6 = n4 + 1;
                        if (n6 != 1) break block21;
                        this.c.a(n8);
                        n4 = n8;
                        break block22;
                    }
                    n4 = n3;
                    if (n6 != 4) break block22;
                }
                if (bl2) {
                    app2.j(n2 + n5);
                } else {
                    app2.i();
                }
                this.i = n3;
                return true;
            }
            app2.f(n7 - 4);
            n3 = n4;
            n4 = n6;
        }
    }

    @Override
    public final int a(app object, apy apy2) {
        abr.j(this.g);
        int n2 = agf.a;
        n2 = this.g((app)object);
        if (n2 == -1 && this.p instanceof arb) {
            long l2 = this.h(this.l);
            if (this.p.a() != l2) {
                object = (arb)this.p;
                throw null;
            }
        }
        return n2;
    }

    @Override
    public final /* synthetic */ List b() {
        int n2 = gzx.d;
        return hct.a;
    }

    @Override
    public final void c(apq object) {
        this.f = object;
        this.g = object = object.y(0);
        this.h = object;
        this.f.q();
    }

    @Override
    public final void d(long l2, long l3) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.o = 0;
        are are2 = this.p;
        if (!(are2 instanceof arb)) {
            return;
        }
        are2 = (arb)are2;
        throw null;
    }

    @Override
    public final boolean e(app app2) {
        return this.l(app2, true);
    }

    @Override
    public final /* synthetic */ void f() {
    }
}

