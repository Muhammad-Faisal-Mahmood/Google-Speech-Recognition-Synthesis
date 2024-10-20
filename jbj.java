/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

public abstract class jbj
implements jjp {
    @Override
    public final void d() {
        if (!this.v().h) {
            jgn jgn2 = this.v();
            jjw jjw2 = jgn2.b;
            if (jjw2 != null && jjw2.a() > 0) {
                jgn2.c(false, true);
            }
        }
    }

    @Override
    public final void f() {
        jbi jbi2 = this.q();
        jgj jgj2 = jbi2.m;
        jgj2.a = jbi2;
        jbi2.j = jgj2;
    }

    @Override
    public final void g(int n2) {
        jbi jbi2 = this.q();
        jcx jcx2 = jbi2.j;
        int n3 = jnr.a;
        jbi2.e(new cdw(jbi2, n2, 8));
    }

    @Override
    public final void h(iuf iuf2) {
        this.v().c = iuf2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(InputStream var1_1) {
        block18: {
            block19: {
                if (this.v().h != false) return;
                var5_2 = this.v();
                if (var5_2.h) break block18;
                ++var5_2.i;
                ++var5_2.j;
                var5_2.k = 0L;
                jjo.f(var5_2.g);
                var7_10 = var5_2.c;
                var6_11 = iud.a;
                try {
                    var3_12 = var1_1.available();
                    if (var3_12 == 0 || var7_10 == var6_11) ** GOTO lbl41
                }
                catch (RuntimeException var5_4) {
                    var6_11 = iyh.j.e("Failed to frame message").d(var5_4);
                    var5_5 = new iyj((iyh)var6_11);
                    throw var5_5;
                }
                catch (iyj var5_6) {
                    throw var5_6;
                }
                catch (IOException var5_7) {
                    var5_8 = iyh.j.e("Failed to frame message").d(var5_7);
                    var6_11 = new iyj(var5_8);
                    throw var6_11;
                }
                {
                    var6_11 = new jgk((jgn)var5_2);
                }
                try {
                    var2_13 = jgn.a(var1_1, (OutputStream)var6_11);
                }
                finally {
                    var6_11.close();
                }
                {
                    block20: {
                        var4_14 = var5_2.a;
                        if (var4_14 >= 0 && var2_13 > var4_14) {
                            var5_2 = iyh.g.e(String.format(Locale.US, "message too large %d > %d", new Object[]{var2_13, var5_2.a}));
                            var6_11 = new iyj((iyh)var5_2);
                            throw var6_11;
                        }
                        var5_2.d((jgk)var6_11, true);
                        break block20;
lbl41:
                        // 1 sources

                        if (var3_12 != -1) {
                            var5_2.k = var3_12;
                            var2_13 = var5_2.a;
                            if (var2_13 >= 0 && var3_12 > var2_13) {
                                var6_11 = iyh.g.e(String.format(Locale.US, "message too large %d > %d", new Object[]{var3_12, var5_2.a}));
                                var5_2 = new iyj((iyh)var6_11);
                                throw var5_2;
                            }
                            var5_2.e.clear();
                            var5_2.e.put((byte)0).putInt(var3_12);
                            if (var5_2.b == null) {
                                var5_2.b = var5_2.f.a(var5_2.e.position() + var3_12);
                            }
                            var5_2.e(var5_2.e.array(), 0, var5_2.e.position());
                            var2_13 = jgn.a(var1_1, var5_2.d);
                        } else {
                            var6_11 = new jgk((jgn)var5_2);
                            var2_13 = jgn.a(var1_1, (OutputStream)var6_11);
                            var5_2.d((jgk)var6_11, false);
                        }
                    }
                    if (var3_12 == -1 || var2_13 == var3_12) break block19;
                }
                var5_2 = String.format("Message length inaccurate %s != %s", new Object[]{var2_13, var3_12});
                var5_2 = iyh.j.e((String)var5_2);
                var6_11 = new iyj((iyh)var5_2);
                throw var6_11;
            }
            jjo.f(var5_2.g);
            var5_2.g.c(var5_2.k);
            jjo.f(var5_2.g);
            return;
        }
        var5_2 = new IllegalStateException("Framer already closed");
        throw var5_2;
    }

    @Override
    public boolean o() {
        throw null;
    }

    protected abstract jbi q();

    protected abstract jgn v();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w(int n2) {
        jbi jbi2 = this.q();
        Object object = jbi2.k;
        synchronized (object) {
            jbi2.n += n2;
            return;
        }
    }
}

