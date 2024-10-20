/*
 * Decompiled with CFR 0.152.
 */
public final class kbm {
    public static final kbt a = new kbt("REMOVE_FROZEN");
    public final jub b;
    private final int c;
    private final boolean d;
    private final int e;
    private final juc f;
    private final dml g;

    public kbm(int n2, boolean bl2) {
        int n3;
        this.c = n2;
        this.d = bl2;
        this.e = n3 = n2 - 1;
        this.f = new juc(null, jud.a);
        this.b = new jub(0L, jud.a);
        this.g = new dml(n2);
        if (n3 <= 0x3FFFFFFF) {
            if ((n2 & n3) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object object) {
        Object object2;
        int n2;
        int n3;
        while (true) {
            long l2;
            if ((0x3000000000000000L & (l2 = this.b.b)) != 0L) {
                if ((l2 & 0x2000000000000000L) != 0L) {
                    return 2;
                }
                return 1;
            }
            n3 = (int)((l2 & 0xFFFFFFFC0000000L) >> 30);
            n2 = this.e;
            int n4 = (int)(0x3FFFFFFFL & l2);
            if ((n3 + 2 & n2) == (n4 & n2)) {
                return 1;
            }
            if (!this.d && this.g.B((int)(n3 & n2)).a != null) {
                n2 = this.c;
                if (n2 >= 1024 && (n3 - n4 & 0x3FFFFFFF) <= n2 >> 1) continue;
                return 1;
            }
            object2 = this.b;
            long l3 = jse.ar(l2, 0xFFFFFFFC0000000L);
            if (((jub)object2).c(l2, (long)(n3 + 1 & 0x3FFFFFFF) << 30 | l3)) break;
        }
        this.g.B(n3 & n2).c(object);
        Object object3 = this;
        while ((((kbm)object3).b.b & 0x1000000000000000L) != 0L) {
            object2 = ((kbm)object3).c();
            object3 = ((kbm)object2).g.B((int)(((kbm)object2).e & n3)).a;
            if (object3 instanceof kbl && ((kbl)object3).a == n3) {
                ((kbm)object2).g.B(((kbm)object2).e & n3).c(object);
            } else {
                object2 = null;
            }
            object3 = object2;
            if (object2 != null) continue;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public final Object b() {
        do lbl-1000:
        // 3 sources

        {
            block6: {
                if (((var5_5 = this.b.b) & 0x1000000000000000L) != 0L) {
                    return kbm.a;
                }
                var4_4 = (int)((0xFFFFFFFC0000000L & var5_5) >> 30);
                var2_2 = this.e;
                var1_1 = (int)(var5_5 & 0x3FFFFFFFL);
                var3_3 = var1_1 & var2_2;
                if ((var4_4 & var2_2) == var3_3) {
                    return null;
                }
                var9_7 = this.g.B((int)var3_3).a;
                if (var9_7 != null) break block6;
                if (!this.d) ** GOTO lbl-1000
                return null;
            }
            if (var9_7 instanceof kbl) {
                return null;
            }
            var8_6 = this.b;
            var2_2 = var1_1 + 1 & 0x3FFFFFFF;
            if (!var8_6.c(var5_5, jse.as(var5_5, var2_2))) continue;
            this.g.B(this.e & var1_1).c(null);
            return var9_7;
        } while (!this.d);
        var8_6 = this;
        block1: do {
            var10_9 = var8_6.b;
            do {
                var5_5 = var10_9.b;
                var7_8 = jve.a;
                if ((var5_5 & 0x1000000000000000L) == 0L) continue;
                var8_6 = var8_6.c();
                continue block1;
            } while (!var8_6.b.c(var5_5, jse.as(var5_5, var2_2)));
            var1_1 = (int)(var5_5 & 0x3FFFFFFFL);
            var8_6.g.B(var8_6.e & var1_1).c(null);
            var8_6 = null;
        } while (var8_6 != null);
        return var9_7;
    }

    public final kbm c() {
        long l2;
        Object object;
        block5: {
            long l3;
            do {
                object = this.b;
                l2 = ((jub)object).b;
                if ((l2 & 0x1000000000000000L) != 0L) break block5;
            } while (!((jub)object).c(l2, l3 = l2 | 0x1000000000000000L));
            l2 = l3;
        }
        juc juc2 = this.f;
        while ((object = (kbm)juc2.a) == null) {
            int n2;
            int n3;
            int n4;
            juc juc3 = this.f;
            int n5 = this.c;
            kbm kbm2 = new kbm(n5 + n5, this.d);
            n5 = (int)(0x3FFFFFFFL & l2);
            while ((n4 = n5 & (n3 = this.e)) != (n3 & (n2 = (int)((0xFFFFFFFC0000000L & l2) >> 30)))) {
                Object object2;
                object = object2 = this.g.B((int)n4).a;
                if (object2 == null) {
                    object = new kbl(n5);
                }
                kbm2.g.B(kbm2.e & n5).c(object);
                ++n5;
            }
            kbm2.b.b = jse.ar(l2, 0x1000000000000000L);
            juc3.d(null, kbm2);
        }
        return object;
    }

    public final boolean d() {
        long l2;
        jub jub2;
        do {
            jub2 = this.b;
            l2 = jub2.b;
            if ((l2 & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l2) == 0L) continue;
            return false;
        } while (!jub2.c(l2, 0x2000000000000000L | l2));
        return true;
    }

    public final boolean e() {
        long l2 = this.b.b;
        return (int)(0x3FFFFFFFL & l2) == (int)((l2 & 0xFFFFFFFC0000000L) >> 30);
    }
}

