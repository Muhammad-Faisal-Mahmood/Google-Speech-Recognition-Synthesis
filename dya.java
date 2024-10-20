/*
 * Decompiled with CFR 0.152.
 */
public final class dya {
    public byte a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public final dyb a() {
        if (this.a != 63) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((this.a & 1) == 0) {
                stringBuilder.append(" tiktokIntegrationEnabled");
            }
            if ((this.a & 2) == 0) {
                stringBuilder.append(" throwExceptionForEventsLoggedInFuture");
            }
            if ((this.a & 4) == 0) {
                stringBuilder.append(" throwExceptionForEventsLoggedInFutureInCollector");
            }
            if ((this.a & 8) == 0) {
                stringBuilder.append(" enableIndividualFlowEventsSending");
            }
            if ((this.a & 0x10) == 0) {
                stringBuilder.append(" loggerIdMatchingEnabled");
            }
            if ((this.a & 0x20) == 0) {
                stringBuilder.append(" throwExceptionForLoggerIdMismatch");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
        }
        return new dyb(this.b, this.c, this.d, this.e);
    }

    public final void b(boolean bl2) {
        this.d = bl2;
        this.a = (byte)(this.a | 8);
    }

    public final void c(boolean bl2) {
        this.e = bl2;
        this.a = (byte)(this.a | 0x10);
    }

    public final void d(boolean bl2) {
        this.c = bl2;
        this.a = (byte)(this.a | 2);
    }

    public final void e(boolean bl2) {
        this.b = bl2;
        this.a = (byte)(this.a | 1);
    }

    public final dds f() {
        if (this.a != 15) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((this.a & 1) == 0) {
                stringBuilder.append(" requiresUnmeteredNetwork");
            }
            if ((this.a & 2) == 0) {
                stringBuilder.append(" requiresCharging");
            }
            if ((this.a & 4) == 0) {
                stringBuilder.append(" requiresIdle");
            }
            if ((this.a & 8) == 0) {
                stringBuilder.append(" requiresBatteryNotLow");
            }
            throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
        }
        return new dcr(this.b, this.e, this.c, this.d);
    }

    public final void g(boolean bl2) {
        this.d = bl2;
        this.a = (byte)(this.a | 8);
    }

    public final void h(boolean bl2) {
        this.e = bl2;
        this.a = (byte)(this.a | 2);
    }

    public final void i(boolean bl2) {
        this.c = bl2;
        this.a = (byte)(this.a | 4);
    }

    public final void j(boolean bl2) {
        this.b = bl2;
        this.a = (byte)(this.a | 1);
    }
}

