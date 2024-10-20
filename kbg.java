/*
 * Decompiled with CFR 0.152.
 */
public final class kbg
extends juy
implements jvj {
    public final juy a;
    private final jvj d = jvh.a;
    private final int e;
    private final jua f;
    private final Object g;
    private final dml h;

    public kbg(juy juy2, int n2) {
        this.a = juy2;
        this.e = n2;
        this.f = new jua(0, jud.a);
        this.h = new dml(null, null);
        this.g = new Object();
    }

    private final boolean h() {
        Object object = this.g;
        synchronized (object) {
            block4: {
                int n2 = this.f.b;
                int n3 = this.e;
                if (n2 < n3) break block4;
                return false;
            }
            this.f.a();
            return true;
        }
    }

    @Override
    public final void a(jqf object, Runnable runnable) {
        this.h.A(runnable);
        if (this.f.b < this.e && this.h() && (object = this.e()) != null) {
            object = new krb(this, (Runnable)object, 1);
            this.a.a(this, (Runnable)object);
        }
    }

    @Override
    public final void c(long l2, jul jul2) {
        this.d.c(l2, jul2);
    }

    public final Runnable e() {
        Runnable runnable;
        while ((runnable = (Runnable)this.h.y()) == null) {
            Object object = this.g;
            synchronized (object) {
                block5: {
                    this.f.c();
                    int n2 = this.h.x();
                    if (n2 != 0) break block5;
                    return null;
                }
                this.f.a();
            }
        }
        return runnable;
    }

    @Override
    public final void f(jqf object, Runnable runnable) {
        this.h.A(runnable);
        if (this.f.b < this.e && this.h() && (object = this.e()) != null) {
            object = new krb(this, (Runnable)object, 1);
            this.a.f(this, (Runnable)object);
        }
    }

    @Override
    public final jvq g(long l2, Runnable runnable, jqf jqf2) {
        return this.d.g(l2, runnable, jqf2);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".limitedParallelism(");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

