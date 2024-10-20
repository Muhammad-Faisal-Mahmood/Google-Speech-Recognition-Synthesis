/*
 * Decompiled with CFR 0.152.
 */
public final class fet {
    public final gzx a;

    static {
        int n2 = gzx.d;
        new fet(hct.a);
    }

    public fet() {
        throw null;
    }

    public fet(gzx gzx2) {
        if (gzx2 != null) {
            this.a = gzx2;
            return;
        }
        throw new NullPointerException("Null alternativeSpans");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fet) {
            object = (fet)object;
            return fvd.z(this.a, ((fet)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("AlternativeSpans{alternativeSpans=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

