/*
 * Decompiled with CFR 0.152.
 */
public final class cxr {
    public final ctq a;
    public final cth b;

    public cxr() {
        throw null;
    }

    public cxr(ctq ctq2, cth cth2) {
        if (ctq2 != null) {
            this.a = ctq2;
            if (cth2 != null) {
                this.b = cth2;
                return;
            }
            throw new NullPointerException("Null dataFileGroup");
        }
        throw new NullPointerException("Null groupKey");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cxr) {
            object = (cxr)object;
            if (this.a.equals(((cxr)object).a) && this.b.equals(((cxr)object).b)) {
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
        String string2 = object.toString();
        object = new StringBuilder("GroupKeyAndGroup{groupKey=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", dataFileGroup=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

