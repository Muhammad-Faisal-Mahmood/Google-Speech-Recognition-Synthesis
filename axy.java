/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.AnimationUtils
 */
import android.view.animation.AnimationUtils;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class axy
extends ayd {
    public long a;
    public boolean b;
    public boolean c;
    public int d;
    public Runnable e;
    public final ayc f;
    public zh g;
    public final htf h;

    public axy(ayc ayc2) {
        this.f = ayc2;
        this.a = -1L;
        this.d = 0;
        this.h = new htf(null);
    }

    private final void k() {
        block16: {
            block15: {
                float f2;
                zh zh2;
                Object object;
                block18: {
                    float f3;
                    long l2;
                    int n2;
                    int n3;
                    int n4;
                    block17: {
                        if (this.g != null) break block15;
                        this.h.c(AnimationUtils.currentAnimationTimeMillis(), this.a);
                        this.g = new zh(new zj());
                        object = new zk();
                        ((zk)object).c(1.0f);
                        ((zk)object).e(200.0f);
                        zh2 = this.g;
                        zh2.r = object;
                        zh2.h = this.a;
                        zh2.i = true;
                        if (zh2.l) break block16;
                        if (!zh2.q.contains(this)) {
                            zh2.q.add(this);
                        }
                        zh2 = this.g;
                        object = this.h;
                        n4 = ((htf)object).b;
                        n3 = 0;
                        f2 = 0.0f;
                        n2 = n4;
                        if (n4 != 0) break block17;
                        if (((long[])((htf)object).a)[0] == Long.MIN_VALUE) break block18;
                        n2 = 0;
                    }
                    long l3 = l2 = ((long[])((htf)object).a)[n2];
                    while (true) {
                        long l4 = ((long[])((htf)object).a)[n2];
                        n4 = n3;
                        if (l4 == Long.MIN_VALUE) break;
                        f3 = Math.abs(l4 - l3);
                        n4 = n3;
                        if ((float)(l2 - l4) > 100.0f) break;
                        if (f3 > 40.0f) {
                            n4 = n3;
                            break;
                        }
                        n4 = n2;
                        if (n2 == 0) {
                            n4 = 20;
                        }
                        n2 = n4 - 1;
                        n4 = ++n3;
                        if (n3 >= 20) break;
                        l3 = l4;
                    }
                    if (n4 >= 2) {
                        if (n4 == 2) {
                            long[] lArray = (long[])((htf)object).a;
                            n3 = (n2 = ((htf)object).b) == 0 ? 19 : n2 - 1;
                            f3 = lArray[n2] - lArray[n3];
                            if (f3 != 0.0f) {
                                object = (float[])((htf)object).c;
                                f2 = (float)((object[n2] - object[n3]) / f3 * 1000.0f);
                            }
                        } else {
                            n2 = ((htf)object).b;
                            int n5 = (n2 - n4 + 21) % 20;
                            Object object2 = ((htf)object).a;
                            Object object3 = ((htf)object).c;
                            n4 = n5 + 1;
                            n3 = n4 % 20;
                            l3 = ((long[])object2)[n5];
                            f2 = ((float[])object3)[n5];
                            f3 = 0.0f;
                            while (n3 != (n2 + 21) % 20) {
                                l2 = ((long[])((htf)object).a)[n3];
                                float f4 = l2 - l3;
                                if (f4 != 0.0f) {
                                    float f5 = ((float[])((htf)object).c)[n3];
                                    float f6 = htf.d(f3);
                                    f2 = (f5 - f2) / f4;
                                    f3 += (f2 - f6) * Math.abs(f2);
                                    f2 = f3;
                                    if (n3 == n4) {
                                        f2 = f3 * 0.5f;
                                    }
                                    l3 = l2;
                                    f3 = f2;
                                    f2 = f5;
                                }
                                n3 = (n3 + 1) % 20;
                            }
                            f2 = htf.d(f3) * 1000.0f;
                        }
                    }
                }
                zh2.g = f2;
                zh2 = this.g;
                zh2.m = this.h() + 1L;
                zh2.n = -1.0f;
                zh2.o = 4.0f;
                object = new AmbientMode$AmbientController(this, null);
                if (!zh2.p.contains(object)) {
                    zh2.p.add(object);
                }
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    @Override
    public final void a(ayc ayc2) {
        this.c = true;
    }

    public final long h() {
        return this.f.p;
    }

    public final void i() {
        if (!this.b) {
            this.d = 1;
            this.e = null;
            return;
        }
        this.k();
        this.g.c(this.h() + 1L);
    }

    public final void j(Runnable runnable) {
        this.e = runnable;
        if (!this.b) {
            this.d = 2;
            return;
        }
        this.k();
        this.g.c(0.0f);
    }
}

