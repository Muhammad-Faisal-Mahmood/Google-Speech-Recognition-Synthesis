/*
 * Decompiled with CFR 0.152.
 */
final class hfi
implements hes {
    private final hes a;
    private final Object b;

    public hfi(hes hes2, Object object) {
        hhk.h(hes2, "log site key");
        this.a = hes2;
        hhk.h(object, "log site qualifier");
        this.b = object;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof hfi)) {
            return false;
        }
        object = (hfi)object;
        return this.a.equals(((hfi)object).a) && this.b.equals(((hfi)object).b);
    }

    public final int hashCode() {
        Object object = this.b;
        int n2 = this.a.hashCode();
        return object.hashCode() ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = this.a.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("SpecializedLogSiteKey{ delegate='");
        stringBuilder.append(string);
        stringBuilder.append("', qualifier='");
        stringBuilder.append((String)object);
        stringBuilder.append("' }");
        return stringBuilder.toString();
    }
}

