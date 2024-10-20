/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.AndroidRuntimeException
 */
import android.os.Build;
import android.util.AndroidRuntimeException;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public final class zh {
    public static final zg a = new za();
    public static final zg b = new zb();
    public static final zg c = new zc();
    public static final zg d = new zd();
    public static final zg e = new ze();
    public static final zg f = new yy();
    public float g = 0.0f;
    public float h = Float.MAX_VALUE;
    public boolean i = false;
    final Object j;
    final zi k;
    public boolean l = false;
    public float m = Float.MAX_VALUE;
    public float n = -3.4028235E38f;
    public float o;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public zk r;
    public boolean s;
    private long t = 0L;
    private float u;

    public zh(Object object, zi zi2) {
        float f2;
        this.j = object;
        this.k = zi2;
        object = c;
        float f3 = f2 = 0.1f;
        if (zi2 != object) {
            f3 = f2;
            if (zi2 != d) {
                if (zi2 == e) {
                    f3 = f2;
                } else if (zi2 == f) {
                    f3 = 0.00390625f;
                } else {
                    object = a;
                    f3 = f2 = 0.002f;
                    if (zi2 != object) {
                        f3 = zi2 == b ? f2 : 1.0f;
                    }
                }
            }
        }
        this.o = f3;
        this.r = null;
        this.u = Float.MAX_VALUE;
        this.s = false;
    }

    public zh(zj zj2) {
        this.j = null;
        this.k = new yz(zj2);
        this.o = 1.0f;
        this.r = null;
        this.u = Float.MAX_VALUE;
        this.s = false;
    }

    private static void d(ArrayList arrayList) {
        int n2;
        int n3 = arrayList.size();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (arrayList.get(n2) != null) continue;
            arrayList.remove(n2);
            n3 = n2;
        }
    }

    final void a(float f2) {
        this.k.b(this.j, f2);
        for (int i2 = 0; i2 < this.q.size(); ++i2) {
            if (this.q.get(i2) == null) continue;
            axy axy2 = (axy)this.q.get(i2);
            f2 = this.h;
            long l2 = Math.max(-1L, Math.min(axy2.h() + 1L, Math.round((double)f2)));
            long l3 = axy2.a;
            axy2.f.y(l2, l3);
            axy2.a = l2;
        }
        zh.d(this.q);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(long var1_1) {
        var10_2 = this.t;
        if (var10_2 == 0L) {
            this.t = var1_1;
            this.a(this.h);
            return;
        }
        this.t = var1_1;
        var7_3 = yx.a().f;
        var1_1 = var7_3 == 0.0f ? 0x7FFFFFFFL : (long)((float)(var1_1 - var10_2) / var7_3);
        if (this.s) {
            var7_3 = this.u;
            if (var7_3 != 3.4028235E38f) {
                this.r.d(var7_3);
                this.u = 3.4028235E38f;
            }
            this.h = this.r.a();
            this.g = 0.0f;
            this.s = false;
lbl17:
            // 2 sources

            while (true) {
                var9_8 = 1;
                break;
            }
        } else {
            if (this.u != 3.4028235E38f) {
                var12_7 = this.r;
                var5_5 = this.h;
                var3_4 = this.g;
                var12_7 = var12_7.b(var5_5, var3_4, var1_1 /= 2L);
                this.r.d(this.u);
                this.u = 3.4028235E38f;
                var12_7 = this.r.b(var12_7.a, var12_7.b, var1_1);
                this.h = var7_3 = var12_7.a;
                this.g = var12_7.b;
            } else {
                var12_7 = this.r.b(this.h, this.g, var1_1);
                this.h = var7_3 = var12_7.a;
                this.g = var12_7.b;
            }
            this.h = var7_3 = Math.max(var7_3, this.n);
            this.h = var7_3 = Math.min(var7_3, this.m);
            var8_6 = this.g;
            var12_7 = this.r;
            if ((double)Math.abs(var8_6) < var12_7.d && (double)Math.abs(var7_3 - var12_7.a()) < var12_7.c) {
                this.h = this.r.a();
                this.g = 0.0f;
                ** continue;
            }
            var9_8 = 0;
        }
        this.h = var7_3 = Math.min(this.h, this.m);
        this.h = var7_3 = Math.max(var7_3, this.n);
        this.a(var7_3);
        if (var9_8 != 0) {
            this.l = false;
            var12_7 = yx.a();
            var12_7.a.remove(this);
            var9_8 = var12_7.b.indexOf(this);
            if (var9_8 >= 0) {
                var12_7.b.set(var9_8, null);
                var12_7.e = true;
            }
            this.t = 0L;
            this.i = false;
            for (var9_8 = 0; var9_8 < this.p.size(); ++var9_8) {
                if (this.p.get(var9_8) == null) continue;
                var12_7 = (AmbientMode$AmbientController)this.p.get(var9_8);
                var7_3 = this.h;
                var12_7 = var12_7.a;
                if (var7_3 < 1.0f) {
                    var13_9 = (axy)var12_7;
                    var1_1 = var13_9.h();
                    var14_10 = ((ayk)var13_9.f).g(0);
                    var12_7 = var14_10.n;
                    var14_10.n = null;
                    var13_9.f.y(-1L, var13_9.a);
                    var13_9.f.y(var1_1, -1L);
                    var13_9.a = var1_1;
                    var14_10 = var13_9.e;
                    if (var14_10 != null) {
                        var14_10.run();
                    }
                    var13_9.f.o.clear();
                    if (var12_7 == null) continue;
                    var12_7.t((ayc)var12_7, ayb.b, true);
                    continue;
                }
                var12_7 = ((axy)var12_7).f;
                var12_7.t((ayc)var12_7, ayb.b, false);
            }
            zh.d(this.p);
        }
    }

    public final void c(float f2) {
        if (this.l) {
            this.u = f2;
            return;
        }
        if (this.r == null) {
            this.r = new zk(f2);
        }
        this.r.d(f2);
        Object object = this.r;
        if (object != null) {
            double d2 = ((zk)object).a();
            if (!(d2 > (double)this.m)) {
                if (!(d2 < (double)this.n)) {
                    ((zk)object).c = d2 = Math.abs((double)(this.o * 0.75f));
                    ((zk)object).d = d2 * 62.5;
                    if (yx.a().b()) {
                        if (!this.l) {
                            this.l = true;
                            if (!this.i) {
                                this.h = this.k.a(this.j);
                            }
                            if (!((f2 = this.h) > this.m) && !(f2 < this.n)) {
                                yx yx2 = yx.a();
                                if (yx2.b.size() == 0) {
                                    yx2.i.n(yx2.c);
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        yx2.f = a$$ExternalSyntheticApiModelOutline0.m();
                                        if (yx2.g == null) {
                                            yx2.g = new yv(yx2);
                                        }
                                        object = yx2.g;
                                        if (((yv)object).a == null) {
                                            ((yv)object).a = new yu((yv)object);
                                            a$$ExternalSyntheticApiModelOutline0.m$1(((yv)object).a);
                                        }
                                    }
                                }
                                if (!yx2.b.contains(this)) {
                                    yx2.b.add(this);
                                    return;
                                }
                            } else {
                                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                            }
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }
}

