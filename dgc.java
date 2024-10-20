/*
 * Decompiled with CFR 0.152.
 */
public final class dgc {
    public final String a;
    public final long b;
    public final boolean c;

    public dgc() {
        throw null;
    }

    public dgc(String string, long l2, boolean bl2) {
        if (string != null) {
            this.a = string;
            this.b = l2;
            this.c = bl2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void a() {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException("Operation is not supported in detached namespace: ".concat(this.a));
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dgc) {
            object = (dgc)object;
            if (this.a.equals(((dgc)object).a) && this.b == ((dgc)object).b && this.c == ((dgc)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.c ? 1237 : 1231;
        return ((n2 ^ 0xF4243) * 1000003 ^ (int)this.b) * 1000003 ^ n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NamespaceInfo{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", quota=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isDetached=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

