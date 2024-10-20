/*
 * Decompiled with CFR 0.152.
 */
abstract class ixm
extends itz {
    @Override
    public void c(String string, Throwable throwable) {
        this.g().c(string, throwable);
    }

    @Override
    public void d() {
        this.g().d();
    }

    @Override
    public void e(int n2) {
        this.g().e(n2);
    }

    protected abstract itz g();

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.g());
        return gtn2.toString();
    }
}

