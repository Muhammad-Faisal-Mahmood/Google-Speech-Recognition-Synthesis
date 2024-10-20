/*
 * Decompiled with CFR 0.152.
 */
final class dwl {
    public final dvf a;
    public final duo b;

    public dwl() {
        throw null;
    }

    public dwl(dvf dvf2, duo duo2) {
        this.a = dvf2;
        if (duo2 != null) {
            this.b = duo2;
            return;
        }
        throw new NullPointerException("Null snapshotResult");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dwl) {
            dwl dwl2 = (dwl)object;
            object = this.a;
            if ((object == null ? dwl2.a == null : object.equals(dwl2.a)) && this.b.equals(dwl2.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        Object object = this.a;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (((hwv)object).B()) {
            n2 = ((hwv)object).i();
        } else {
            int n4;
            n2 = n4 = ((hwv)object).memoizedHashCode;
            if (n4 == 0) {
                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
            }
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("SnapshotBlobAndResult{snapshotBlob=");
        stringBuilder.append(string);
        stringBuilder.append(", snapshotResult=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

