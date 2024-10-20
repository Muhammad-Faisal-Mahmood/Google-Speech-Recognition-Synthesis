/*
 * Decompiled with CFR 0.152.
 */
public abstract class jbh
implements jhg {
    protected final void a(int n2) {
        if (this.f() >= n2) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
    }

    @Override
    public boolean d() {
        return false;
    }
}

