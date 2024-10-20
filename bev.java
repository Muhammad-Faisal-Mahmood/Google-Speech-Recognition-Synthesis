/*
 * Decompiled with CFR 0.152.
 */
public final class bev {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bev(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bev)) {
            return false;
        }
        object = (bev)object;
        if (this.a != ((bev)object).a) {
            return false;
        }
        if (this.b != ((bev)object).b) {
            return false;
        }
        if (this.c != ((bev)object).c) {
            return false;
        }
        return this.d == ((bev)object).d;
    }

    public final int hashCode() {
        int n2 = a.f(this.a);
        boolean bl2 = this.d;
        boolean bl3 = this.c;
        return ((n2 * 31 + a.f(this.b)) * 31 + a.f(bl3)) * 31 + a.f(bl2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkState(isConnected=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isValidated=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isMetered=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isNotRoaming=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

