/*
 * Decompiled with CFR 0.152.
 */
public final class anm {
    public final int a;
    public final boolean b;

    public anm(int n2, boolean bl2) {
        this.a = 0;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (anm)object;
            if (this.b == ((anm)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ? 1 : 0;
    }
}

