/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;

final class jwo
implements jwe {
    public final jwu a;
    public final jtz b;
    private final juc c;
    private final juc d;

    public jwo(jwu jwu2, Throwable throwable) {
        this.a = jwu2;
        this.b = new jtz(false, jud.a);
        this.c = new juc(throwable, jud.a);
        this.d = new juc(null, jud.a);
    }

    @Override
    public final jwu bt() {
        return this.a;
    }

    @Override
    public final boolean bv() {
        return this.d() == null;
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable)this.c.a;
    }

    public final void e(Throwable throwable) {
        Object object;
        block8: {
            block7: {
                object = this.d();
                if (object == null) {
                    this.c.c(throwable);
                    return;
                }
                if (throwable == object) break block7;
                object = this.c();
                if (object == null) {
                    this.f(throwable);
                    return;
                }
                if (!(object instanceof Throwable)) break block8;
                if (throwable != object) {
                    ArrayList<Object> arrayList = new ArrayList<Object>(4);
                    arrayList.add(object);
                    arrayList.add(throwable);
                    this.f(arrayList);
                }
            }
            return;
        }
        if (object instanceof ArrayList) {
            ((ArrayList)object).add(throwable);
            return;
        }
        Objects.toString(object);
        throw new IllegalStateException("State is ".concat(object.toString()));
    }

    public final void f(Object object) {
        this.d.c(object);
    }

    public final boolean g() {
        return this.d() != null;
    }

    public final boolean h() {
        return this.b.b();
    }

    public final String toString() {
        boolean bl2 = this.g();
        boolean bl3 = this.h();
        Throwable throwable = this.d();
        Object object = this.c();
        StringBuilder stringBuilder = new StringBuilder("Finishing[cancelling=");
        stringBuilder.append(bl2);
        stringBuilder.append(", completing=");
        stringBuilder.append(bl3);
        stringBuilder.append(", rootCause=");
        stringBuilder.append(throwable);
        stringBuilder.append(", exceptions=");
        stringBuilder.append(object);
        stringBuilder.append(", list=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

