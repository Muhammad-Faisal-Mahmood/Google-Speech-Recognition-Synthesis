/*
 * Decompiled with CFR 0.152.
 */
public abstract class jvm
extends kcf {
    public int e;

    public jvm(int n2) {
        super(0L, false);
        this.e = n2;
    }

    public final void E(Throwable throwable) {
        throwable = new jvd(a.ak(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), throwable);
        jvf.i(this.l().d(), throwable);
    }

    public Object c(Object object) {
        return object;
    }

    public abstract Object g();

    public Throwable k(Object object) {
        if ((object = object instanceof jut ? (jut)object : null) != null) {
            return ((jut)object).b;
        }
        return null;
    }

    public abstract jqb l();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block16: {
            block15: {
                var1_1 = jve.a;
                try {
                    var2_2 = this.l();
                    jse.c(var2_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                    var2_2 = (kaz)var2_2;
                    var6_4 = var2_2.b;
                    var2_2 = var2_2.d;
                    var5_5 = var6_4.d();
                    var7_6 = kbv.b(var5_5, var2_2);
                    var2_2 = kbv.a;
                    var4_7 = null;
                    if (var7_6 == var2_2) break block15;
                }
                catch (Throwable var2_3) {
                    this.E(var2_3);
                    return;
                }
                {
                    var2_2 = jux.c(var6_4, var5_5, var7_6);
                    break block16;
                }
            }
            var2_2 = null;
        }
        var10_8 = var6_4.d();
        var8_9 = this.g();
        var9_10 = this.k(var8_9);
        var3_11 = var4_7;
        if (var9_10 == null) {
            var3_11 = var4_7;
            if (jvf.n(this.e)) {
                var3_11 = (jwi)var10_8.get(jwi.c);
            }
        }
        if (var3_11 != null && !var3_11.s()) {
            var4_7 = var3_11.p();
            this.y((Throwable)var4_7);
            var3_11 = var4_7;
            if (jve.b) {
                var3_11 = kbs.a((Throwable)var4_7, (jqp)var6_4);
            }
            var6_4.bD(jns.aj((Throwable)var3_11));
        } else if (var9_10 != null) {
            var6_4.bD(jns.aj(var9_10));
        } else {
            var6_4.bD(this.c(var8_9));
        }
        if (var2_2 != null) {
        }
        ** GOTO lbl52
        {
            catch (Throwable var3_12) {
                if (var2_2 != null && !var2_2.S()) {
                    throw var3_12;
                }
                kbv.c(var5_5, var7_6);
                throw var3_12;
            }
            if (var2_2.S() == false) return;
lbl52:
            // 2 sources

            kbv.c(var5_5, var7_6);
            return;
        }
    }

    public void y(Throwable throwable) {
    }
}

