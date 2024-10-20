/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class gke {
    public String a;
    public gkc b;
    public Executor c;
    public byte d;
    private gto e;
    private hyf f;
    private gzs g;
    private gzx h;
    private gto i;
    private gto j;

    public gke() {
        throw null;
    }

    public gke(byte[] object) {
        object = gsl.a;
        this.e = object;
        this.i = object;
        this.j = object;
    }

    public final gkf a() {
        hyf hyf2;
        String string;
        Object object = this.g;
        if (object != null) {
            this.h = ((gzs)object).g();
        } else if (this.h == null) {
            int n2 = gzx.d;
            this.h = hct.a;
        }
        if (this.d == 1 && (string = this.a) != null && (hyf2 = this.f) != null && (object = this.b) != null) {
            return new gkf(string, this.e, hyf2, (gkc)object, this.h, this.i, this.j, this.c);
        }
        object = new StringBuilder();
        if (this.d == 0) {
            ((StringBuilder)object).append(" blockingSafeReads");
        }
        if (this.a == null) {
            ((StringBuilder)object).append(" name");
        }
        if (this.f == null) {
            ((StringBuilder)object).append(" schema");
        }
        if (this.b == null) {
            ((StringBuilder)object).append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(frd frd2) {
        if (this.g == null) {
            this.g = new gzs();
        }
        this.g.h(frd2);
    }

    public final void c(frb frb2) {
        this.i = gto.i(frb2);
    }

    public final void d(hyf hyf2) {
        if (hyf2 != null) {
            this.f = hyf2;
            return;
        }
        throw new NullPointerException("Null schema");
    }
}

