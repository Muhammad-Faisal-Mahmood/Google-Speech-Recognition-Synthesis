/*
 * Decompiled with CFR 0.152.
 */
public final class dyq {
    private final kcw a;
    private final gto b;
    private final boolean c;

    public dyq() {
        throw null;
    }

    public dyq(kcw kcw2, gto gto2, boolean bl2) {
        if (kcw2 != null) {
            this.a = kcw2;
            this.b = gto2;
            this.c = bl2;
            return;
        }
        throw new NullPointerException("Null appFlow");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dyq) {
            object = (dyq)object;
            if (this.a.equals(((dyq)object).a) && this.b.equals(((dyq)object).b) && this.c == ((dyq)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        kcw kcw2 = this.a;
        if (kcw2.B()) {
            n3 = kcw2.i();
        } else {
            n3 = n2 = kcw2.memoizedHashCode;
            if (n2 == 0) {
                kcw2.memoizedHashCode = n3 = kcw2.i();
            }
        }
        int n4 = this.b.hashCode();
        n2 = true != this.c ? 1237 : 1231;
        return ((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("LoggedAppFlow{appFlow=");
        stringBuilder.append(string);
        stringBuilder.append(", loggedTimeMillis=");
        stringBuilder.append((String)object);
        stringBuilder.append(", sampledOut=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

