/*
 * Decompiled with CFR 0.152.
 */
public final class csh {
    public final csm a;
    private final gto b;
    private final gto c;

    public csh() {
        throw null;
    }

    public csh(csm csm2, gto gto2, gto gto3) {
        this.a = csm2;
        this.b = gto2;
        this.c = gto3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof csh) {
            object = (csh)object;
            if (this.a.equals(((csh)object).a) && this.b.equals(((csh)object).b) && this.c.equals(((csh)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        csm csm2 = this.a;
        if (csm2.B()) {
            n2 = csm2.i();
        } else {
            int n3;
            n2 = n3 = csm2.memoizedHashCode;
            if (n3 == 0) {
                csm2.memoizedHashCode = n2 = csm2.i();
            }
        }
        return ((n2 ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        Object object = this.c;
        Object object2 = this.b;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("AddFileGroupRequest{dataFileGroup=");
        stringBuilder.append(string);
        stringBuilder.append(", accountOptional=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", variantIdOptional=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

