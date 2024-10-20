/*
 * Decompiled with CFR 0.152.
 */
public final class avk
implements aui {
    public final bzb a;
    private int b;

    public avk(bzb bzb2) {
        this.a = bzb2;
    }

    @Override
    public final Object a(String object, jrk object2, jqb jqb2) {
        object = this.a.L((String)object);
        try {
            object2 = object2.a(object);
            return object2;
        }
        finally {
            object.e();
        }
    }

    public final Object b() {
        return this.a.a.i();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(int var1_1, jro var2_2, jqb var3_5) {
        block22: {
            if (!(var3_5 instanceof avj)) ** GOTO lbl-1000
            var5_6 = (avj)var3_5;
            var4_10 = var5_6.c;
            if ((var4_10 & -2147483648) != 0) {
                var5_6.c = var4_10 + -2147483648;
            } else lbl-1000:
            // 2 sources

            {
                var5_6 = new avj(this, (jqb)var3_5);
            }
            var9_11 = var5_6.a;
            var6_12 = jqh.a;
            var4_10 = var5_6.c;
            if (var4_10 == 0) ** GOTO lbl25
            if (var4_10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            var6_12 = var5_6.e;
            var5_6 = var5_6.d;
            var3_5 = var6_12;
            var2_2 = var5_6;
            var8_13 = var6_12;
            var7_14 = var5_6;
            try {
                jns.ak(var9_11);
                ** GOTO lbl58
            }
            catch (avd var2_4) {
                var3_5 = var8_13;
                var2_2 = var7_14;
                throw null;
            }
            {
                catch (Throwable var5_7) {
                    break block22;
                }
lbl25:
                // 1 sources

                jns.ak(var9_11);
                var3_5 = this.a.a;
                if (!var3_5.i()) {
                    this.b = var1_1;
                }
                var4_10 = var1_1 - 1;
                if (var1_1 == 0) {
                    throw null;
                }
                if (var4_10 != 0) {
                    if (var4_10 == 1) {
                        var3_5.e();
                    }
                } else if (yi.f() != null && yi.g() != null) {
                    var7_14 = yi.f();
                    jse.b(var7_14);
                    var8_13 = yi.g();
                    jse.b(var8_13);
                    var8_13 = var8_13.invoke((Object)((awu)var3_5).d, null);
                    if (var8_13 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    var9_11 = 0;
                    var7_14.invoke(var8_13, new Object[]{var9_11, null, var9_11, null});
                } else {
                    ((awu)var3_5).d();
                }
                var7_14 = new avi(this);
                var5_6.d = this;
                var5_6.e = (awu)var3_5;
                var5_6.c = 1;
                var9_11 = var2_2.b(var7_14, var5_6);
                if (var9_11 == var6_12) return var6_12;
                var5_6 = this;
                var6_12 = var3_5;
lbl58:
                // 2 sources

                var3_5 = var6_12;
                var2_2 = var5_6;
                var8_13 = var6_12;
                var7_14 = var5_6;
                var6_12.h();
                var6_12.f();
                if (var6_12.i()) return var9_11;
                var5_6.b = 0;
                return var9_11;
            }
            {
                catch (Throwable var5_8) {
                    var2_2 = this;
                    break block22;
                }
                catch (avd var2_3) {}
                var2_2 = this;
                {
                    throw null;
                }
            }
        }
        var3_5.f();
        if (var3_5.i()) throw var5_9;
        var2_2.b = 0;
        throw var5_9;
    }
}

