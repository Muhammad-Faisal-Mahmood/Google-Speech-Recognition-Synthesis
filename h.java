/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;
import java.util.Objects;

public final class h {
    public k a = null;
    public float b = 0.0f;
    boolean c = false;
    public final g d;
    boolean e = false;

    public h(AmbientDelegate ambientDelegate) {
        this.d = new g(this, ambientDelegate);
    }

    public final void a(k object) {
        Object object2 = this.a;
        if (object2 != null) {
            this.d.f((k)object2, -1.0f);
            this.a = null;
        }
        float f2 = -this.d.c((k)object);
        this.a = object;
        if (f2 != 1.0f) {
            this.b /= f2;
            object2 = this.d;
            int n2 = ((g)object2).e;
            for (int i2 = 0; n2 != -1 && i2 < ((g)object2).a; ++i2) {
                object = ((g)object2).d;
                object[n2] = object[n2] / f2;
                n2 = ((g)object2).c[n2];
            }
        }
    }

    final void b() {
        g g2 = this.d;
        int n2 = g2.e;
        for (int i2 = 0; n2 != -1 && i2 < g2.a; ++i2) {
            block4: {
                int n3;
                Object object = g2.h.a;
                int n4 = g2.b[n2];
                object = ((k[])object)[n4];
                for (n4 = 0; n4 < (n3 = ((k)object).g); ++n4) {
                    if (((k)object).f[n4] != this) {
                        continue;
                    }
                    break block4;
                }
                h[] hArray = ((k)object).f;
                n4 = hArray.length;
                if (n3 >= n4) {
                    ((k)object).f = Arrays.copyOf(hArray, n4 + n4);
                }
                hArray = ((k)object).f;
                n4 = ((k)object).g;
                hArray[n4] = this;
                ((k)object).g = n4 + 1;
            }
            n2 = g2.c[n2];
        }
    }

    public final void c(k k2, k k3) {
        this.d.f(k2, 1.0f);
        this.d.f(k3, -1.0f);
    }

    final void d(k k2, k k3, int n2, float f2, k k4, k k5, int n3) {
        float f3;
        block10: {
            block9: {
                block8: {
                    if (k3 == k4) {
                        this.d.f(k2, 1.0f);
                        this.d.f(k5, 1.0f);
                        this.d.f(k3, -2.0f);
                        return;
                    }
                    if (f2 != 0.5f) break block8;
                    this.d.f(k2, 1.0f);
                    this.d.f(k3, -1.0f);
                    this.d.f(k4, -1.0f);
                    this.d.f(k5, 1.0f);
                    if (n2 > 0 || n3 > 0) {
                        this.b = -n2 + n3;
                        return;
                    }
                    break block9;
                }
                if (f2 <= 0.0f) {
                    this.d.f(k2, -1.0f);
                    this.d.f(k3, 1.0f);
                    this.b = n2;
                    return;
                }
                if (f2 >= 1.0f) {
                    this.d.f(k4, -1.0f);
                    this.d.f(k5, 1.0f);
                    this.b = n3;
                    return;
                }
                g g2 = this.d;
                f3 = 1.0f - f2;
                g2.f(k2, f3);
                this.d.f(k3, -f3);
                this.d.f(k4, -f2);
                this.d.f(k5, f2);
                if (n2 > 0 || n3 > 0) break block10;
            }
            return;
        }
        n2 = -n2;
        float f4 = n3;
        this.b = (float)n2 * f3 + f4 * f2;
    }

    public final void e(k k2, k k3, k k4, k k5, float f2) {
        this.d.f(k2, -1.0f);
        this.d.f(k3, 1.0f);
        this.d.f(k4, f2);
        f2 = -f2;
        this.d.f(k5, f2);
    }

    public final void f(float f2, float f3, float f4, k k2, int n2, k k3, int n3, k k4, int n4, k k5, int n5) {
        n2 = -n2 - n3;
        if (f3 != 0.0f && f2 != f4) {
            f2 /= f3;
            float f5 = f4 / f3;
            f4 = n4;
            float f6 = n5;
            f3 = n2;
            this.b = f3 + f4 * (f2 /= f5) + f6 * f2;
            this.d.f(k2, 1.0f);
            this.d.f(k3, -1.0f);
            this.d.f(k5, f2);
            this.d.f(k4, -f2);
            return;
        }
        this.b = n2 + n4 + n5;
        this.d.f(k2, 1.0f);
        this.d.f(k3, -1.0f);
        this.d.f(k5, 1.0f);
        this.d.f(k4, -1.0f);
    }

    public final void g(k k2, int n2) {
        if (n2 < 0) {
            this.b = -n2;
            this.d.f(k2, 1.0f);
            return;
        }
        this.b = n2;
        this.d.f(k2, -1.0f);
    }

    public final void h(k k2, k k3, int n2) {
        if (n2 != 0) {
            int n3;
            if (n2 < 0) {
                n3 = -n2;
                n2 = 1;
            } else {
                int n4 = 0;
                n3 = n2;
                n2 = n4;
            }
            this.b = n3;
            if (n2 != 0) {
                this.d.f(k2, 1.0f);
                this.d.f(k3, -1.0f);
                return;
            }
        }
        this.d.f(k2, -1.0f);
        this.d.f(k3, 1.0f);
    }

    public final void i(k k2, k k3, k k4, int n2) {
        if (n2 != 0) {
            int n3;
            if (n2 < 0) {
                n3 = -n2;
                n2 = 1;
            } else {
                int n4 = 0;
                n3 = n2;
                n2 = n4;
            }
            this.b = n3;
            if (n2 != 0) {
                this.d.f(k2, 1.0f);
                this.d.f(k3, -1.0f);
                this.d.f(k4, -1.0f);
                return;
            }
        }
        this.d.f(k2, -1.0f);
        this.d.f(k3, 1.0f);
        this.d.f(k4, 1.0f);
    }

    public final void j(k k2, k k3, k k4, int n2) {
        if (n2 != 0) {
            boolean bl2;
            if (n2 < 0) {
                n2 = -n2;
                bl2 = true;
            } else {
                bl2 = false;
            }
            this.b = n2;
            if (bl2) {
                this.d.f(k2, 1.0f);
                this.d.f(k3, -1.0f);
                this.d.f(k4, 1.0f);
                return;
            }
        }
        this.d.f(k2, -1.0f);
        this.d.f(k3, 1.0f);
        this.d.f(k4, -1.0f);
    }

    public final void k(h h2) {
        this.d.g(this, h2);
    }

    public final String toString() {
        boolean bl2;
        Object object;
        Object object2 = this.a;
        if (object2 == null) {
            object2 = "0";
        } else {
            Objects.toString(object2);
            object2 = "".concat(String.valueOf(object2));
        }
        float f2 = this.b;
        object2 = ((String)object2).concat(" = ");
        int n2 = 0;
        if (f2 != 0.0f) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(this.b);
            object2 = ((StringBuilder)object).toString();
            bl2 = true;
        } else {
            bl2 = false;
        }
        int n3 = this.d.a;
        boolean bl3 = bl2;
        while (n2 < n3) {
            object = object2;
            bl2 = bl3;
            if (this.d.d(n2) != null) {
                float f3 = this.d.b(n2);
                if (!bl3) {
                    object = object2;
                    f2 = f3;
                    if (f3 < 0.0f) {
                        f2 = -f3;
                        object = ((String)object2).concat("- ");
                    }
                } else {
                    if (f3 > 0.0f) {
                        object = " + ";
                        f2 = f3;
                    } else {
                        f2 = -f3;
                        object = " - ";
                    }
                    object = ((String)object2).concat((String)object);
                }
                if (f2 == 1.0f) {
                    object2 = ((String)object).concat("null");
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(f2);
                    ((StringBuilder)object2).append(" null");
                    object2 = ((StringBuilder)object2).toString();
                }
                bl2 = true;
                object = object2;
            }
            ++n2;
            object2 = object;
            bl3 = bl2;
        }
        object = object2;
        if (!bl3) {
            object = ((String)object2).concat("0.0");
        }
        return object;
    }
}

