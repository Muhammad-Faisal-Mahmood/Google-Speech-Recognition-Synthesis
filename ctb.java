/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class ctb {
    public final boolean a;
    public final gto b;
    public final gto c;
    public final gto d;
    public final gto e;
    public final boolean f;
    public final boolean g;

    public ctb() {
        throw null;
    }

    public ctb(boolean bl2, gto gto2, gto gto3, gto gto4, gto gto5, boolean bl3, boolean bl4) {
        this.a = bl2;
        this.b = gto2;
        this.c = gto3;
        this.d = gto4;
        this.e = gto5;
        this.f = bl3;
        this.g = bl4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ctb) {
            object = (ctb)object;
            if (this.a == ((ctb)object).a && this.b.equals(((ctb)object).b) && this.c.equals(((ctb)object).c) && this.d.equals(((ctb)object).d) && this.e.equals(((ctb)object).e) && this.f == ((ctb)object).f && this.g == ((ctb)object).g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2 = this.a;
        int n2 = 1231;
        int n3 = true != bl2 ? 1237 : 1231;
        int n4 = true != this.f ? 1237 : 1231;
        if (!this.g) {
            n2 = 1237;
        }
        return (((((((n3 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n4) * 1000003 ^ n2;
    }

    public final String toString() {
        Serializable serializable = this.e;
        Object object = this.d;
        Object object2 = this.c;
        String string = String.valueOf(this.b);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("GetFileGroupsByFilterRequest{includeAllGroups=");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(", groupWithNoAccountOnly=false, groupNameOptional=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", groupNamePrefixOptional=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", accountOptional=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", sourceOptional=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", preserveZipDirectories=");
        ((StringBuilder)serializable).append(this.f);
        ((StringBuilder)serializable).append(", verifyIsolatedStructure=");
        ((StringBuilder)serializable).append(this.g);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

