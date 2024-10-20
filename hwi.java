/*
 * Decompiled with CFR 0.152.
 */
final class hwi {
    private final Object a;
    private final int b;

    public hwi(Object object, int n2) {
        this.a = object;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof hwi)) {
            return false;
        }
        object = (hwi)object;
        return this.a == ((hwi)object).a && this.b == ((hwi)object).b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}

