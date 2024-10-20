/*
 * Decompiled with CFR 0.152.
 */
public final class ehd {
    public final egz a;
    public final ehc b;

    public ehd(egz egz2, ehc ehc2) {
        jse.e((Object)ehc2, "status");
        this.a = egz2;
        this.b = ehc2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ehd)) {
            return false;
        }
        object = (ehd)object;
        if (!jse.i(this.a, ((ehd)object).a)) {
            return false;
        }
        return this.b == ((ehd)object).b;
    }

    public final int hashCode() {
        egz egz2 = this.a;
        int n2 = egz2 == null ? 0 : egz2.hashCode();
        return n2 * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectResult(device=");
        stringBuilder.append(this.a);
        stringBuilder.append(", status=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

