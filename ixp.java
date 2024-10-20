/*
 * Decompiled with CFR 0.152.
 */
public final class ixp
extends kmp {
    private final ius a;
    private final kmp b;

    public ixp() {
        super(null);
    }

    public ixp(kmp kmp2, ius ius2) {
        this();
        this.b = kmp2;
        this.a = ius2;
    }

    @Override
    public final void W() {
        ius ius2 = this.a.a();
        try {
            this.b.W();
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }

    @Override
    public final void X() {
        ius ius2 = this.a.a();
        try {
            this.b.X();
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }

    @Override
    public final void e() {
        ius ius2 = this.a.a();
        try {
            this.b.e();
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }

    @Override
    public final void f(Object object) {
        ius ius2 = this.a.a();
        try {
            this.b.f(object);
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }

    @Override
    public final void g() {
        ius ius2 = this.a.a();
        try {
            this.b.g();
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }

    protected final kmp j() {
        return this.b;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.j());
        return gtn2.toString();
    }
}

