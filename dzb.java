/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class dzb {
    private kcw a;
    private hav b;
    private dyg c;
    private boolean d;
    private gzx e;
    private byte f;

    public final dzc a() {
        Object object;
        dyg dyg2;
        hav hav2;
        Object object2;
        if (this.f == 1 && (object2 = this.a) != null && (hav2 = this.b) != null && (dyg2 = this.c) != null && (object = this.e) != null) {
            object = new dzc((kcw)object2, hav2, dyg2, this.d, (gzx)object);
            gto.i(object2);
            fxf.B(true, "AppFlow not set.");
            return object;
        }
        object2 = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object2).append(" appFlow");
        }
        if (this.b == null) {
            ((StringBuilder)object2).append(" testCodes");
        }
        if (this.c == null) {
            ((StringBuilder)object2).append(" appFlowType");
        }
        if (this.f == 0) {
            ((StringBuilder)object2).append(" sampledOut");
        }
        if (this.e == null) {
            ((StringBuilder)object2).append(" globalMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(object2.toString()));
    }

    public final void b(kcw kcw2) {
        if (kcw2 != null) {
            this.a = kcw2;
            return;
        }
        throw new NullPointerException("Null appFlow");
    }

    public final void c(dyg dyg2) {
        if (dyg2 != null) {
            this.c = dyg2;
            return;
        }
        throw new NullPointerException("Null appFlowType");
    }

    public final void d(gzx gzx2) {
        if (gzx2 != null) {
            this.e = gzx2;
            return;
        }
        throw new NullPointerException("Null globalMetadata");
    }

    public final void e(boolean bl2) {
        this.d = bl2;
        this.f = 1;
    }

    public final void f(Set set) {
        this.b = hav.n(set);
    }
}

