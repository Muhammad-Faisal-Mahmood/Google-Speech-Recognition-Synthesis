/*
 * Decompiled with CFR 0.152.
 */
public final class bhb {
    public final String a;
    public final bbv b;

    public bhb(String string, bbv bbv2) {
        jse.e(string, "id");
        jse.e((Object)bbv2, "state");
        this.a = string;
        this.b = bbv2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bhb)) {
            return false;
        }
        object = (bhb)object;
        if (!jse.i(this.a, ((bhb)object).a)) {
            return false;
        }
        return this.b == ((bhb)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdAndState(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

