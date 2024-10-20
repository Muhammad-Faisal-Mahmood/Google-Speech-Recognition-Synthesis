/*
 * Decompiled with CFR 0.152.
 */
public final class drl {
    public int a;
    public float b;
    public gto c;
    public byte d;
    public int e;

    public drl() {
        throw null;
    }

    public drl(byte[] byArray) {
        this.c = gsl.a;
    }

    public final drm a() {
        int n2 = this.d;
        boolean bl2 = true;
        if (n2 == 3 && (n2 = this.e) != 0) {
            drm drm2 = new drm(n2, this.a, this.b, this.c);
            fxf.B(true, "Rate limit per second must be >= 0");
            float f2 = drm2.a;
            if (!(f2 > 0.0f) || !(f2 <= 1.0f)) {
                bl2 = false;
            }
            fxf.B(bl2, "Sampling Probability shall be > 0 and <= 1");
            return drm2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.e == 0) {
            stringBuilder.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            stringBuilder.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            stringBuilder.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(boolean bl2) {
        int n2 = true != bl2 ? 2 : 3;
        this.e = n2;
    }

    public final dnf c() {
        int n2 = this.d;
        boolean bl2 = true;
        if (n2 == 3 && (n2 = this.a) != 0) {
            dnf dnf2 = new dnf(n2, this.b, this.e, this.c);
            float f2 = dnf2.a;
            if (!(f2 > 0.0f) || !(f2 <= 100.0f)) {
                bl2 = false;
            }
            fxf.r(bl2, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return dnf2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a == 0) {
            stringBuilder.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            stringBuilder.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            stringBuilder.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void d(boolean bl2) {
        int n2 = true != bl2 ? 2 : 3;
        this.a = n2;
    }
}

