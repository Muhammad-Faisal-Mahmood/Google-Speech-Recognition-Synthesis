/*
 * Decompiled with CFR 0.152.
 */
class hjx
extends hjy {
    final int a;

    public hjx(int n2) {
        this.a = hjy.c(n2);
    }

    @Override
    public final boolean bo(int n2) {
        boolean bl2 = n2 >= 0;
        fxf.x(bl2, "%s (%s) must be >= 0", "tries", n2);
        return n2 < this.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof hjx) {
            object = (hjx)object;
            if (this.a == ((hjx)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}

