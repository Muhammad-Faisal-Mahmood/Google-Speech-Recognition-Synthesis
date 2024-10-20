/*
 * Decompiled with CFR 0.152.
 */
public final class iuj {
    public final iui a;
    public final iyh b;

    public iuj(iui iui2, iyh iyh2) {
        a.s((Object)iui2, "state is null");
        this.a = iui2;
        a.s(iyh2, "status is null");
        this.b = iyh2;
    }

    public static iuj a(iui iui2) {
        boolean bl2 = iui2 != iui.c;
        fxf.r(bl2, "state is TRANSIENT_ERROR. Use forError() instead");
        return new iuj(iui2, iyh.b);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof iuj)) {
            return false;
        }
        object = (iuj)object;
        return this.a.equals((Object)((iuj)object).a) && this.b.equals(((iuj)object).b);
    }

    public final int hashCode() {
        iyh iyh2 = this.b;
        int n2 = this.a.hashCode();
        return iyh2.hashCode() ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        if (((iyh)object).g()) {
            return this.a.toString();
        }
        String string = ((Object)((Object)this.a)).toString();
        String string2 = object.toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("(");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

