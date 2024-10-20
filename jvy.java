/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public abstract class jvy
extends jvt
implements jvj {
    private final jtz a;
    public final juc e = new juc(null, jud.a);
    public final juc f;

    public jvy() {
        jud jud2 = jud.a;
        this.f = new juc(null, jud2);
        this.a = new jtz(false, jud2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void y() {
        kbx kbx2;
        jvx jvx2 = (jvx)this.f.a;
        if (jvx2 == null) return;
        if (jvx2.g()) return;
        long l2 = System.nanoTime();
        do {
            synchronized (jvx2) {
                kbx kbx3 = jvx2.b();
                kbx2 = null;
                kbx kbx4 = null;
                if (kbx3 == null) {
                    continue;
                }
                kbx3 = (jvw)kbx3;
                kbx2 = kbx4;
                if (l2 - ((jvw)kbx3).b >= 0L) {
                    kbx2 = kbx4;
                    if (this.z((Runnable)((Object)kbx3))) {
                        kbx2 = jvx2.d(0);
                    }
                }
            }
        } while ((jvw)kbx2 != null);
    }

    private final boolean z(Runnable runnable) {
        while (true) {
            kbm kbm2;
            Object object = this.e.a;
            if (this.w()) {
                return false;
            }
            if (object == null) {
                if (!this.e.d(null, runnable)) continue;
                return true;
            }
            if (object instanceof kbm) {
                kbm2 = (kbm)object;
                int n2 = kbm2.a(runnable);
                if (n2 != 0) {
                    if (n2 != 1) {
                        return false;
                    }
                    this.e.d(object, kbm2.c());
                    continue;
                }
                return true;
            }
            if (object == jvz.b) {
                return false;
            }
            kbm2 = new kbm(8, true);
            kbm2.a((Runnable)object);
            kbm2.a(runnable);
            if (this.e.d(object, kbm2)) break;
        }
        return true;
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        this.h(runnable);
    }

    @Override
    public final void c(long l2, jul jul2) {
        long l3 = jvz.a(l2);
        if (l3 < 0x3FFFFFFFFFFFFFFFL) {
            l2 = System.nanoTime();
            jvu jvu2 = new jvu(this, l3 + l2, jul2);
            this.v(l2, jvu2);
            jsl.r(jul2, jvu2);
        }
    }

    @Override
    public jvq g(long l2, Runnable runnable, jqf jqf2) {
        return jvh.a.g(l2, runnable, jqf2);
    }

    public void h(Runnable runnable) {
        this.y();
        if (this.z(runnable)) {
            this.r();
            return;
        }
        ((jvy)jvg.a).h(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j() {
        Object object;
        Object object2 = jxc.a;
        jxc.a.set(null);
        this.a.a = 1;
        boolean bl2 = jve.a;
        while (true) {
            if ((object = this.e.a) == null) {
                if (!this.e.d(null, jvz.b)) continue;
                break;
            }
            if (object instanceof kbm) {
                ((kbm)object).d();
                break;
            }
            if (object == jvz.b) break;
            object2 = new kbm(8, true);
            ((kbm)object2).a((Runnable)object);
            if (this.e.d(object, object2)) break;
        }
        while (((jvt)this).k() <= 0L) {
        }
        long l2 = System.nanoTime();
        while ((object = (jvx)this.f.a) != null) {
            synchronized (object) {
                object2 = ((kbw)object).a() > 0 ? ((kbw)object).d(0) : null;
            }
            object2 = (jvw)object2;
            if (object2 == null) {
                return;
            }
            this.i(l2, (jvw)object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long k() {
        block10: {
            block12: {
                block15: {
                    block13: {
                        block14: {
                            block11: {
                                block9: {
                                    var5_1 = this.q();
                                    var3_2 = 0L;
                                    if (var5_1) {
                                        return 0L;
                                    }
                                    this.y();
                                    var8_3 = this.e;
                                    while (true) {
                                        var7_5 = var8_3.a;
                                        var6_4 = null;
                                        if (var7_5 == null) break block9;
                                        if (var7_5 instanceof kbm) {
                                            var9_6 = (kbm)var7_5;
                                            var6_4 = var9_6.b();
                                            if (var6_4 != kbm.a) {
                                                var6_4 = (Runnable)var6_4;
                                                break block9;
                                            }
                                            this.e.d(var7_5, var9_6.c());
                                            continue;
                                        }
                                        if (var7_5 == jvz.b) break block9;
                                        if (this.e.d(var7_5, null)) break;
                                    }
                                    var6_4 = (Runnable)var7_5;
                                }
                                if (var6_4 != null) break block10;
                                var6_4 = this.d;
                                if (var6_4 == null) {
                                    while (true) {
                                        var1_7 = 0x7FFFFFFFFFFFFFFFL;
                                        break;
                                    }
                                } else {
                                    if (var6_4.isEmpty()) ** continue;
                                    var1_7 = 0L;
                                }
                                if (var1_7 != 0L) break block11;
                                var1_7 = var3_2;
                                break block12;
                            }
                            var6_4 = this.e.a;
                            if (var6_4 == null) break block13;
                            if (!(var6_4 instanceof kbm)) break block14;
                            if (((kbm)var6_4).e()) break block13;
                            var1_7 = var3_2;
                            break block12;
                        }
                        if (var6_4 != jvz.b) {
                            return 0L;
                        }
                        break block15;
                    }
                    if ((var6_4 = (jvx)this.f.a) != null && (var6_4 = (jvw)var6_4.c()) != null) {
                        return jse.m(var6_4.b - System.nanoTime(), 0L);
                    }
                }
                var1_7 = 0x7FFFFFFFFFFFFFFFL;
            }
            return var1_7;
        }
        var6_4.run();
        return 0L;
    }

    protected final jvq u(long l2, Runnable object) {
        if ((l2 = jvz.a(l2)) < 0x3FFFFFFFFFFFFFFFL) {
            long l3 = System.nanoTime();
            object = new jvv(l2 + l3, (Runnable)object);
            this.v(l3, (jvw)object);
        } else {
            object = jwv.a;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void v(long l2, jvw jvw2) {
        int n2;
        boolean bl2;
        jvx jvx2;
        Object var10_4;
        Object object;
        block26: {
            block25: {
                if (this.w()) break block25;
                object = (jvx)this.f.a;
                var10_4 = null;
                jvx2 = object;
                if (object == null) {
                    this.f.d(null, new jvx(l2));
                    object = this.f.a;
                    jse.b(object);
                    jvx2 = (jvx)object;
                }
                // MONITORENTER : jvw2
                if (jvw2._heap == jvz.a) {
                    // MONITOREXIT : jvw2
                    return;
                }
                // MONITORENTER : jvx2
                object = (jvw)jvx2.b();
                bl2 = this.w();
                if (!bl2) break block26;
                // MONITOREXIT : jvx2
                // MONITOREXIT : jvw2
            }
            this.i(l2, jvw2);
            return;
        }
        if (object == null) {
            jvx2.a = l2;
        } else {
            long l3 = object.b;
            if (l3 - l2 < 0L) {
                l2 = l3;
            }
            l3 = jvx2.a;
            if (l2 - l3 > 0L) {
                jvx2.a = l2;
            } else {
                l2 = l3;
            }
        }
        if (jvw2.b - l2 < 0L) {
            jvw2.b = l2;
        }
        bl2 = jve.a;
        jvw2.d(jvx2);
        kbx[] kbxArray = jvx2.b;
        if (kbxArray == null) {
            jvx2.b = object = new kbx[4];
        } else {
            object = kbxArray;
            if (jvx2.a() >= kbxArray.length) {
                n2 = jvx2.a();
                object = Arrays.copyOf(kbxArray, n2 + n2);
                jse.d(object, "copyOf(...)");
                jvx2.b = object;
            }
        }
        n2 = jvx2.a();
        jvx2.e(n2 + 1);
        object[n2] = jvw2;
        jvw2.e(n2);
        jvx2.f(n2);
        // MONITOREXIT : jvx2
        // MONITOREXIT : jvw2
        jvx2 = (jvx)this.f.a;
        object = var10_4;
        if (jvx2 != null) {
            object = (jvw)jvx2.c();
        }
        if (object != jvw2) return;
        this.r();
    }

    public final boolean w() {
        return this.a.b();
    }

    protected final boolean x() {
        block8: {
            boolean bl2;
            block6: {
                Object object;
                block7: {
                    block5: {
                        boolean bl3 = this.p();
                        bl2 = false;
                        if (!bl3) {
                            return false;
                        }
                        object = (jvx)this.f.a;
                        if (object != null && !((kbw)object).g()) {
                            return false;
                        }
                        object = this.e.a;
                        if (object != null) break block5;
                        bl2 = true;
                        break block6;
                    }
                    if (!(object instanceof kbm)) break block7;
                    bl2 = ((kbm)object).e();
                    break block6;
                }
                if (object == jvz.b) break block8;
            }
            return bl2;
        }
        return true;
    }
}

