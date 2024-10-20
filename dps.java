/*
 * Decompiled with CFR 0.152.
 */
public final class dps {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public Object e;

    public dps() {
        throw null;
    }

    public dps(byte[] byArray) {
        this.e = gsl.a;
    }

    public dps(char[] cArray) {
    }

    public final dpt a() {
        int n2;
        if (this.c == 127 && (n2 = this.d) != 0) {
            int n3 = this.a;
            Object object = this.e;
            boolean bl2 = this.b;
            return new dpt(n2, n3, (gto)object, bl2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.d == 0) {
            stringBuilder.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            stringBuilder.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            stringBuilder.append(" recordMetricPerProcess");
        }
        if ((this.c & 4) == 0) {
            stringBuilder.append(" forceGcBeforeRecordMemory");
        }
        if ((this.c & 8) == 0) {
            stringBuilder.append(" captureDebugMetrics");
        }
        if ((this.c & 0x10) == 0) {
            stringBuilder.append(" captureMemoryInfo");
        }
        if ((this.c & 0x20) == 0) {
            stringBuilder.append(" recordMemoryPeriodically");
        }
        if ((this.c & 0x40) == 0) {
            stringBuilder.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final dkd b() {
        byte by2 = this.c;
        boolean bl2 = true;
        if (by2 != 7) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((this.c & 1) == 0) {
                stringBuilder.append(" primesMetricExecutorPriority");
            }
            if ((this.c & 2) == 0) {
                stringBuilder.append(" primesMetricExecutorPoolSize");
            }
            if ((this.c & 4) == 0) {
                stringBuilder.append(" enableDeferredTasks");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
        }
        dkd dkd2 = new dkd((hpr)this.e, this.a, this.d, this.b);
        if (dkd2.c <= 0) {
            bl2 = false;
        }
        fxf.C(bl2, "Thread pool size must be less than or equal to %s", 2);
        return dkd2;
    }

    public final void c(boolean bl2) {
        this.b = bl2;
        this.c = (byte)(this.c | 4);
    }
}

