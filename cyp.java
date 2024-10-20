/*
 * Decompiled with CFR 0.152.
 */
public final class cyp {
    public final hlx a;
    public final hlq b;

    public cyp() {
        throw null;
    }

    public cyp(hlx hlx2, hlq hlq2) {
        if (hlx2 != null) {
            this.a = hlx2;
            if (hlq2 != null) {
                this.b = hlq2;
                return;
            }
            throw new NullPointerException("Null fileGroupDetails");
        }
        throw new NullPointerException("Null fileGroupStatus");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cyp) {
            object = (cyp)object;
            if (this.a.equals(((cyp)object).a) && this.b.equals(((cyp)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        hwv hwv2 = this.a;
        if (hwv2.B()) {
            n3 = hwv2.i();
        } else {
            n2 = n3 = hwv2.memoizedHashCode;
            if (n3 == 0) {
                hwv2.memoizedHashCode = n2 = hwv2.i();
            }
            n3 = n2;
        }
        hwv2 = this.b;
        if (hwv2.B()) {
            n2 = hwv2.i();
        } else {
            int n4;
            n2 = n4 = hwv2.memoizedHashCode;
            if (n4 == 0) {
                hwv2.memoizedHashCode = n2 = hwv2.i();
            }
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("FileGroupStatusWithDetails{fileGroupStatus=");
        stringBuilder.append(string);
        stringBuilder.append(", fileGroupDetails=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

