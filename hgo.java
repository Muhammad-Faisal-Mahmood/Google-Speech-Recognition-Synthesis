/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class hgo
extends hgq {
    public final int[] a;
    public final int b;
    private final hfz d;
    private final hfz e;

    /*
     * Unable to fully structure code
     */
    public hgo(hfz var1_1, hfz var2_2) {
        super();
        this.d = var1_1;
        this.e = var2_2;
        var3_3 = var2_2.b();
        var11_4 = var3_3 <= 28;
        hhk.f(var11_4, "metadata size too large");
        var2_2 = new int[var3_3];
        this.a = (int[])var2_2;
        var7_5 = 0L;
        var5_6 = 0;
        for (var3_3 = 0; var3_3 < ((Object)var2_2).length; ++var3_3) {
            block5: {
                var1_1 = this.d(var3_3);
                var9_9 = var1_1.d | var7_5;
                if (var9_9 != var7_5) ** GOTO lbl-1000
                for (var4_7 = 0; var4_7 < var5_6; ++var4_7) {
                    if (!var1_1.equals(this.d(var2_2[var4_7] & 31))) {
                        continue;
                    }
                    break block5;
                }
                var4_7 = -1;
            }
            if (var4_7 != -1) {
                var6_8 = var1_1.b != false ? var2_2[var4_7] | 1 << var3_3 + 4 : var3_3;
                var2_2[var4_7] = var6_8;
            } else lbl-1000:
            // 2 sources

            {
                var2_2[var5_6] = var3_3;
                ++var5_6;
            }
            var7_5 = var9_9;
        }
        this.b = var5_6;
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final Set b() {
        return new hgm(this);
    }

    @Override
    public final void c(hgg hgg2, Object object) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n2 = this.a[i2];
            hez hez2 = this.d(n2 & 0x1F);
            if (!hez2.b) {
                hgg2.a(hez2, hez2.c(this.e(n2)), object);
                continue;
            }
            hgg2.b(hez2, new hgn(this, hez2, n2), object);
        }
    }

    public final hez d(int n2) {
        hfz hfz2 = n2 >= 0 ? this.e : this.d;
        return hfz2.c(n2);
    }

    public final Object e(int n2) {
        hfz hfz2 = n2 >= 0 ? this.e : this.d;
        return hfz2.e(n2);
    }
}

