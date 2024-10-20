/*
 * Decompiled with CFR 0.152.
 */
public final class zk {
    public double a = Math.sqrt(1500.0);
    public double b = 0.5;
    public double c;
    public double d;
    private boolean e = false;
    private double f;
    private double g;
    private double h;
    private double i = Double.MAX_VALUE;
    private final zf j = new zf();

    public zk() {
    }

    public zk(float f2) {
        this.i = f2;
    }

    public final float a() {
        return (float)this.i;
    }

    final zf b(double d2, double d3, long l2) {
        block11: {
            double d4;
            double d5;
            double d6;
            block10: {
                if (this.e) break block10;
                if (this.i == Double.MAX_VALUE) break block11;
                d6 = this.b;
                if (d6 > 1.0) {
                    d5 = -d6;
                    d4 = this.a;
                    this.f = d5 * d4 + d4 * Math.sqrt(d6 * d6 - 1.0);
                    d4 = this.b;
                    d6 = -d4;
                    d5 = this.a;
                    this.g = d6 * d5 - d5 * Math.sqrt(d4 * d4 - 1.0);
                } else if (d6 >= 0.0 && d6 < 1.0) {
                    this.h = this.a * Math.sqrt(1.0 - d6 * d6);
                }
                this.e = true;
            }
            d4 = l2;
            d5 = d2 - this.i;
            d6 = this.b;
            double d7 = d6 - 1.0;
            double d8 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            d4 /= 1000.0;
            if (d8 > 0) {
                d6 = this.g;
                d2 = (d6 * d5 - d3) / (d6 - this.f);
                d5 -= d2;
                double d9 = Math.pow(Math.E, d6 * d4);
                d6 = Math.pow(Math.E, this.f * d4);
                d3 = this.g;
                double d10 = Math.pow(Math.E, d3 * d4);
                double d11 = this.f;
                d3 = d5 * d3 * d10 + d2 * d11 * Math.pow(Math.E, d11 * d4);
                d2 = d9 * d5 + d6 * d2;
            } else if (d8 == false) {
                d2 = this.a;
                d3 += d2 * d5;
                d2 = Math.pow(Math.E, -d2 * d4) * (d5 += d3 * d4);
                d6 = Math.pow(Math.E, -this.a * d4);
                double d12 = -this.a;
                d3 = d5 * d6 * d12 + d3 * Math.pow(Math.E, d4 * d12);
            } else {
                double d13 = 1.0 / this.h;
                double d14 = this.a;
                d2 = Math.pow(Math.E, -d6 * d14 * d4);
                double d15 = Math.cos(this.h * d4);
                double d16 = this.h;
                d3 = d13 * (d6 * d14 * d5 + d3);
                d2 *= d15 * d5 + Math.sin(d16 * d4) * d3;
                d15 = this.a;
                d16 = -d15;
                d6 = this.b;
                d14 = Math.pow(Math.E, -d6 * d15 * d4);
                d13 = this.h;
                d15 = -d13;
                double d17 = Math.sin(d13 * d4);
                d13 = this.h;
                d3 = d16 * d2 * d6 + d14 * (d15 * d5 * d17 + d3 * d13 * Math.cos(d13 * d4));
            }
            zf zf2 = this.j;
            zf2.a = (float)(d2 + this.i);
            zf2.b = (float)d3;
            return zf2;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final void c(float f2) {
        if (!(f2 < 0.0f)) {
            this.b = f2;
            this.e = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void d(float f2) {
        this.i = f2;
    }

    public final void e(float f2) {
        if (!(f2 <= 0.0f)) {
            this.a = Math.sqrt(f2);
            this.e = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
}

