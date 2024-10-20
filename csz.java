/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class csz {
    public final String a;
    public final boolean b;
    public final boolean c;
    private final gto d;
    private final gto e;

    public csz() {
        throw null;
    }

    public csz(String string, gto gto2, gto gto3, boolean bl2, boolean bl3) {
        this.a = string;
        this.d = gto2;
        this.e = gto3;
        this.b = bl2;
        this.c = bl3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof csz) {
            object = (csz)object;
            if (this.a.equals(((csz)object).a) && this.d.equals(((csz)object).d) && this.e.equals(((csz)object).e) && this.b == ((csz)object).b && this.c == ((csz)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        boolean bl2 = this.b;
        int n3 = 1237;
        int n4 = true != bl2 ? 1237 : 1231;
        if (this.c) {
            n3 = 1231;
        }
        return ((((n2 ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n4) * 1000003 ^ n3;
    }

    public final String toString() {
        Serializable serializable = this.e;
        String string = String.valueOf(this.d);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("GetFileGroupRequest{groupName=");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(", accountOptional=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", variantIdOptional=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", preserveZipDirectories=");
        ((StringBuilder)serializable).append(this.b);
        ((StringBuilder)serializable).append(", verifyIsolatedStructure=");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

