/*
 * Decompiled with CFR 0.152.
 */
final class deg
extends der {
    private final den a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private volatile transient String g;

    public deg(den den2, int n2, int n3, int n4, int n5, int n6) {
        this.a = den2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final int c() {
        return this.b;
    }

    @Override
    public final int d() {
        return this.d;
    }

    @Override
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof der && this.a.equals(((der)(object = (der)object)).f()) && this.b == ((der)object).c() && this.c == ((der)object).b() && this.d == ((der)object).d() && this.e == ((der)object).a() && this.f == ((der)object).e();
    }

    @Override
    public final den f() {
        return this.a;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.g != null) return this.g;
        synchronized (this) {
            if (this.g != null) return this.g;
            this.g = super.h(false, true);
            if (this.g != null) {
                return this.g;
            }
            NullPointerException nullPointerException = new NullPointerException("toString() cannot return null");
            throw nullPointerException;
        }
    }
}

