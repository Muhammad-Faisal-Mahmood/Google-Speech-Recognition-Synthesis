/*
 * Decompiled with CFR 0.152.
 */
public class ixo
extends ixx {
    private final ixx a;

    protected ixo(ixx ixx2) {
        this.a = ixx2;
    }

    @Override
    public void a(iyh iyh2, iwx iwx2) {
        this.a.a(iyh2, iwx2);
    }

    @Override
    public void b(iwx iwx2) {
        this.a.b(iwx2);
    }

    @Override
    public final its c() {
        return this.a.c();
    }

    @Override
    public final void d(int n2) {
        this.a.d(n2);
    }

    @Override
    public final ixb e() {
        return this.a.e();
    }

    @Override
    public final void f(Object object) {
        this.a.f(object);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.a);
        return gtn2.toString();
    }
}

