/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class l {
    final m a;
    l b;
    public int c = 0;
    int d = -1;
    public int e = 0;
    public k f;
    final int g;
    public int h = 1;
    public int i = 1;

    public l(m m2, int n2) {
        this.a = m2;
        this.g = n2;
    }

    private final String f(HashSet object) {
        if (((HashSet)object).add(this)) {
            StringBuilder stringBuilder = new StringBuilder("null:");
            stringBuilder.append(a.a(this.g));
            l l2 = this.b;
            object = l2 != null ? " connected to ".concat(l2.f((HashSet)object)) : "";
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        return "<-";
    }

    public final int a() {
        l l2;
        if (this.a.K == 8) {
            return 0;
        }
        int n2 = this.d;
        if (n2 >= 0 && (l2 = this.b) != null && l2.a.K == 8) {
            return n2;
        }
        return this.c;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    /*
     * Unable to fully structure code
     */
    public final void d(l var1_1, int var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6) {
        block17: {
            block19: {
                block23: {
                    block24: {
                        block20: {
                            block22: {
                                block21: {
                                    block18: {
                                        var10_7 = 1;
                                        if (var1_1 == null) {
                                            this.b = null;
                                            this.c = 0;
                                            this.d = -1;
                                            this.h = 1;
                                            this.e = 2;
                                            return;
                                        }
                                        if (var6_6) break block17;
                                        var8_8 = var1_1.g;
                                        var7_9 = this.g;
                                        if (var8_8 != var7_9) break block18;
                                        if (var7_9 == 7 || var7_9 == 6 && (!var1_1.a.r() || !this.a.r())) break block19;
                                        break block17;
                                    }
                                    if (--var7_9 == 1) break block20;
                                    if (var7_9 == 2) break block21;
                                    if (var7_9 == 3) break block20;
                                    if (var7_9 == 4) break block21;
                                    if (var7_9 != 6 || var8_8 == 6 || var8_8 == 8 || var8_8 == 9) break block19;
                                    break block17;
                                }
                                var7_9 = var8_8;
                                if (var8_8 == 3) ** GOTO lbl30
                                if (var8_8 != 5) {
                                    var7_9 = 0;
                                    var9_10 = var8_8;
                                } else {
                                    var7_9 = 5;
lbl30:
                                    // 2 sources

                                    var8_8 = 1;
                                    var9_10 = var7_9;
                                    var7_9 = var8_8;
                                }
                                if (!(var1_1.a instanceof o)) break block22;
                                var8_8 = var10_7;
                                if (var7_9 != 0) break block23;
                                if (var9_10 != 9) ** GOTO lbl-1000
                                var8_8 = var10_7;
                                break block23;
                            }
                            var8_8 = var7_9;
                            break block23;
                        }
                        if (var8_8 != 2) {
                            if (var8_8 == 4) {
                                var7_9 = 1;
                                var9_11 = 4;
                            } else {
                                var7_9 = 0;
                                var9_11 = var8_8;
                            }
                        } else {
                            var7_9 = 1;
                            var9_11 = var8_8;
                        }
                        if (var1_1.a instanceof o) {
                            var8_8 = var10_7;
                            if (var7_9 == 0) {
                                ** if (var9_11 != 8) goto lbl-1000
lbl-1000:
                                // 1 sources

                                {
                                    var8_8 = var10_7;
                                    ** GOTO lbl65
                                }
                            } else {
                                ** GOTO lbl60
                            }
                        }
                        break block24;
lbl60:
                        // 2 sources

                        break block23;
lbl-1000:
                        // 2 sources

                        {
                            var8_8 = 0;
                        }
                        break block23;
                    }
                    var8_8 = var7_9;
                }
                if (var8_8 != 0) break block17;
            }
            return;
        }
        this.b = var1_1;
        this.c = var2_2 > 0 ? var2_2 : 0;
        this.d = var3_3;
        this.h = var4_4;
        this.e = var5_5;
    }

    public final void e() {
        k k2 = this.f;
        if (k2 == null) {
            this.f = new k(1);
            return;
        }
        k2.b();
    }

    public final String toString() {
        Object object = new HashSet();
        StringBuilder stringBuilder = new StringBuilder("null:");
        stringBuilder.append(a.a(this.g));
        l l2 = this.b;
        object = l2 != null ? " connected to ".concat(l2.f((HashSet)object)) : "";
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

