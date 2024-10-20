/*
 * Decompiled with CFR 0.152.
 */
public final class cxs {
    public final cth a;
    public final cth b;

    public cxs() {
        throw null;
    }

    public cxs(cth cth2, cth cth3) {
        this.a = cth2;
        this.b = cth3;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof cxs)) break block4;
                    object2 = (cxs)object;
                    object = this.a;
                    if (!(object == null ? ((cxs)object2).a == null : ((hwv)object).equals(((cxs)object2).a))) break block4;
                    object = this.b;
                    object2 = ((cxs)object2).b;
                    if (object != null) break block5;
                    if (object2 != null) break block4;
                    break block6;
                }
                if (!((hwv)object).equals(object2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        cth cth2 = this.a;
        int n4 = 0;
        if (cth2 == null) {
            n3 = 0;
        } else if (cth2.B()) {
            n3 = cth2.i();
        } else {
            n2 = n3 = cth2.memoizedHashCode;
            if (n3 == 0) {
                cth2.memoizedHashCode = n2 = cth2.i();
            }
            n3 = n2;
        }
        cth2 = this.b;
        if (cth2 == null) {
            n2 = n4;
        } else if (cth2.B()) {
            n2 = cth2.i();
        } else {
            n2 = n4 = cth2.memoizedHashCode;
            if (n4 == 0) {
                cth2.memoizedHashCode = n2 = cth2.i();
            }
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        String string2 = String.valueOf(object);
        object = new StringBuilder("GroupPair{pendingGroup=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", downloadedGroup=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

