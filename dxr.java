/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class dxr {
    public String a;
    public Executor b;
    private boolean c;
    private boolean d;
    private gto e;
    private gto f;
    private hav g;
    private gto h;
    private byte i;

    public dxr() {
        throw null;
    }

    public dxr(byte[] object) {
        object = gsl.a;
        this.e = object;
        this.f = object;
        this.h = object;
    }

    public final dxs a() {
        if (this.g == null) {
            this.g = hdc.a;
        }
        if (this.i == 3 && this.a != null && this.b != null) {
            return new dxs(this.c, this.a, this.d, this.e, this.f, this.g, this.b, this.h);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if ((this.i & 1) == 0) {
            stringBuilder.append(" dumpable");
        }
        if (this.a == null) {
            stringBuilder.append(" loggerName");
        }
        if ((this.i & 2) == 0) {
            stringBuilder.append(" enableTikTokIntegration");
        }
        if (this.b == null) {
            stringBuilder.append(" listenerExecutor");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(int n2) {
        this.e = gto.i(n2);
    }

    public final void c() {
        this.c = true;
        this.i = (byte)(1 | this.i);
    }

    public final void d(boolean bl2) {
        this.d = bl2;
        this.i = (byte)(this.i | 2);
    }

    public final void e(int n2) {
        this.h = gto.i(n2);
    }
}

