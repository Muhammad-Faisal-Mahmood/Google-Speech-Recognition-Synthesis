/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class kaa
extends jqs
implements jro {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final jyx[] f;
    final jqz g;
    final jrp h;
    final jyy i;
    private Object j;

    public kaa(jyx[] jyxArray, jqz jqz2, jrp jrp2, jyy jyy2, jqb jqb2) {
        this.f = jyxArray;
        this.g = jqz2;
        this.h = jrp2;
        this.i = jyy2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object a(Object var1_1) {
        block9: {
            block12: {
                block10: {
                    block11: {
                        var10_2 = jqh.a;
                        var2_3 = this.e;
                        if (var2_3 == 0) break block10;
                        if (var2_3 == 1) break block11;
                        var4_4 = this.d;
                        var2_3 = this.c;
                        var8_5 = this.b;
                        var6_6 = this.a;
                        var7_7 = (Object[])this.j;
                        jns.ak(var1_1);
                        var1_1 = var8_5;
                        break block12;
                    }
                    var2_3 = this.d;
                    var3_8 = this.c;
                    var9_9 = this.b;
                    var6_6 = this.a;
                    var7_7 = (Object[])this.j;
                    jns.ak(var1_1);
                    var8_5 = ((jyc)var1_1).b;
                    var1_1 = var9_9;
                    ** GOTO lbl51
                }
                jns.ak(var1_1);
                var1_1 = (jvb)this.j;
                var3_8 = this.f.length;
                if (var3_8 == 0) break block9;
                var7_7 = new Object[var3_8];
                jns.ac(var7_7, kag.b);
                var6_6 = jns.ao(var3_8, 0, 6);
                var8_5 = new AtomicInteger(var3_8);
                for (var2_3 = 0; var2_3 < var3_8; ++var2_3) {
                    jse.ah((jvb)var1_1, null, null, new jzz(this.f, var2_3, (AtomicInteger)var8_5, (jxy)var6_6, null), 3);
                }
                var1_1 = new byte[var3_8];
                var4_4 = 0;
                var2_3 = var3_8;
            }
            while (true) {
                this.j = var7_7;
                this.a = var6_6;
                this.b = var1_1;
                this.c = var2_3;
                this.d = var4_4 = (int)((byte)(var4_4 + 1));
                this.e = 1;
                var8_5 = var6_6.c(this);
                if (var8_5 == var10_2) break;
                var3_8 = var2_3;
                var2_3 = var4_4;
lbl51:
                // 2 sources

                var8_5 = (jpd)jyc.a(var8_5);
                if (var8_5 != null) {
                    var4_4 = var3_8;
                    do {
                        var5_10 = var8_5.a;
                        var9_9 = var7_7[var5_10];
                        var7_7[var5_10] = var8_5.b;
                        var3_8 = var4_4;
                        if (var9_9 == kag.b) {
                            var3_8 = var4_4 - 1;
                        }
                        if ((var8_5 = (Object)((byte[])var1_1))[var5_10] == var2_3) break;
                        var8_5[var5_10] = (byte)var2_3;
                        var8_5 = var9_9 = (jpd)jyc.a(var6_6.f());
                        var4_4 = var3_8;
                    } while (var9_9 != null);
                    if (var3_8 == 0) {
                        var11_11 = this.g.a();
                        jns.aa(var7_7, (Object[])var11_11, 0, 0, 14);
                        var9_9 = this.i;
                        this.j = var7_7;
                        this.a = var6_6;
                        this.b = var1_1;
                        this.c = 0;
                        this.d = var2_3;
                        this.e = 3;
                        var8_5 = new bex(this);
                        var8_5.b = var9_9;
                        var8_5.c = var11_11;
                        var4_4 = var2_3;
                        var2_3 = var3_8;
                        if (var8_5.a(jon.a) != var10_2) continue;
                        return var10_2;
                    }
                    var4_4 = var2_3;
                    var2_3 = var3_8;
                    continue;
                }
                break block9;
                break;
            }
            return var10_2;
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new kaa(this.f, this.g, this.h, this.i, jqb2);
        ((kaa)jqb2).j = object;
        return jqb2;
    }
}

