/*
 * Decompiled with CFR 0.152.
 */
public final class dkw {
    public final kfc a;

    public dkw() {
        throw null;
    }

    public dkw(kfc kfc2) {
        if (kfc2 != null) {
            this.a = kfc2;
            return;
        }
        throw new NullPointerException("Null debugLogs");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dkw) {
            object = (dkw)object;
            return this.a.equals(((dkw)object).a);
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        kfc kfc2 = this.a;
        if (kfc2.B()) {
            n2 = kfc2.i();
        } else {
            int n3;
            n2 = n3 = kfc2.memoizedHashCode;
            if (n3 == 0) {
                kfc2.memoizedHashCode = n2 = kfc2.i();
            }
        }
        return n2 ^ 0xF4243;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("Snapshot{debugLogs=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

