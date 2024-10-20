/*
 * Decompiled with CFR 0.152.
 */
public class kbw {
    private final jua a = new jua(0, jud.a);
    public kbx[] b;

    private final void h(int n2, int n3) {
        kbx[] kbxArray = this.b;
        jse.b(kbxArray);
        kbx kbx2 = kbxArray[n3];
        jse.b(kbx2);
        kbx kbx3 = kbxArray[n2];
        jse.b(kbx3);
        kbxArray[n2] = kbx2;
        kbxArray[n3] = kbx3;
        kbx2.e(n2);
        kbx3.e(n3);
    }

    public final int a() {
        return this.a.b;
    }

    public final kbx b() {
        kbx[] kbxArray = this.b;
        if (kbxArray != null) {
            return kbxArray[0];
        }
        return null;
    }

    public final kbx c() {
        synchronized (this) {
            kbx kbx2 = this.b();
            return kbx2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final kbx d(int var1_1) {
        block5: {
            var4_2 = jve.a;
            var5_3 = this.b;
            jse.b(var5_3);
            this.e(this.a() - 1);
            if (var1_1 >= this.a()) break block5;
            this.h(var1_1, this.a());
            var2_4 = var1_1;
            if (var1_1 <= 0) ** GOTO lbl-1000
            var3_5 = (var1_1 - 1) / 2;
            var6_6 /* !! */  = var5_3[var1_1];
            jse.b(var6_6 /* !! */ );
            var6_6 /* !! */  = (Comparable)var6_6 /* !! */ ;
            var7_7 = var5_3[var3_5];
            jse.b(var7_7);
            var2_4 = var1_1;
            if (var6_6 /* !! */ .compareTo(var7_7) < 0) {
                this.h(var1_1, var3_5);
                this.f(var3_5);
            } else lbl-1000:
            // 3 sources

            {
                while ((var1_1 = (var3_5 = var2_4 + var2_4) + 1) < this.a()) {
                    var6_6 /* !! */  = this.b;
                    jse.b(var6_6 /* !! */ );
                    if ((var3_5 += 2) < this.a()) {
                        var7_7 = var6_6 /* !! */ [var3_5];
                        jse.b(var7_7);
                        var8_8 = (Comparable)var7_7;
                        var7_7 = var6_6 /* !! */ [var1_1];
                        jse.b(var7_7);
                        if (var8_8.compareTo(var7_7) < 0) {
                            var1_1 = var3_5;
                        }
                    }
                    var7_7 = var6_6 /* !! */ [var2_4];
                    jse.b(var7_7);
                    var7_7 = (Comparable)var7_7;
                    var6_6 /* !! */  = var6_6 /* !! */ [var1_1];
                    jse.b(var6_6 /* !! */ );
                    if (var7_7.compareTo(var6_6 /* !! */ ) <= 0) break;
                    this.h(var2_4, var1_1);
                    var2_4 = var1_1;
                }
            }
        }
        var6_6 /* !! */  = var5_3[this.a()];
        jse.b(var6_6 /* !! */ );
        var6_6 /* !! */ .d(null);
        var6_6 /* !! */ .e(-1);
        var5_3[this.a()] = null;
        return var6_6 /* !! */ ;
    }

    public final void e(int n2) {
        this.a.b = n2;
    }

    public final void f(int n2) {
        while (n2 > 0) {
            Object object = this.b;
            jse.b(object);
            int n3 = n2 - 1 >> 1;
            Object object2 = object[n3];
            jse.b(object2);
            object2 = (Comparable)object2;
            object = object[n2];
            jse.b(object);
            if (object2.compareTo(object) <= 0) break;
            this.h(n2, n3);
            n2 = n3;
        }
    }

    public final boolean g() {
        return this.a() == 0;
    }
}

