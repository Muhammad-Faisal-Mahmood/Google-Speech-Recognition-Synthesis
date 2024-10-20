/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class dwk {
    public final boolean a;
    public final hvu b;
    public final String c;
    public final String d;
    public final gzx e;
    public final gzx f;
    public final boolean g;

    public dwk() {
        throw null;
    }

    public dwk(boolean bl2, hvu hvu2, String string, String string2, gzx gzx2, gzx gzx3, boolean bl3) {
        this.a = bl2;
        if (hvu2 != null) {
            this.b = hvu2;
            if (string != null) {
                this.c = string;
                if (string2 != null) {
                    this.d = string2;
                    if (gzx2 != null) {
                        this.e = gzx2;
                        if (gzx3 != null) {
                            this.f = gzx3;
                            this.g = bl3;
                            return;
                        }
                        throw new NullPointerException("Null excludeStaticConfigPackages");
                    }
                    throw new NullPointerException("Null includeStaticConfigPackages");
                }
                throw new NullPointerException("Null gmsCoreDirPath");
            }
            throw new NullPointerException("Null dirPath");
        }
        throw new NullPointerException("Null secret");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dwk) {
            object = (dwk)object;
            if (this.a == ((dwk)object).a && this.b.equals(((dwk)object).b) && this.c.equals(((dwk)object).c) && this.d.equals(((dwk)object).d) && fvd.z(this.e, ((dwk)object).e) && fvd.z(this.f, ((dwk)object).f) && this.g == ((dwk)object).g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2 = this.a;
        int n2 = 1237;
        int n3 = true != bl2 ? 1237 : 1231;
        int n4 = this.b.hashCode();
        int n5 = this.c.hashCode();
        int n6 = this.d.hashCode();
        int n7 = this.e.hashCode();
        int n8 = this.f.hashCode();
        if (this.g) {
            n2 = 1231;
        }
        return ((((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n2;
    }

    public final String toString() {
        Serializable serializable = this.f;
        Object object = this.e;
        String string = ((Object)this.b).toString();
        object = object.toString();
        String string2 = serializable.toString();
        serializable = new StringBuilder("SharedStorageInfo{shouldUseSharedStorage=");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(", secret=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", dirPath=");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append(", gmsCoreDirPath=");
        ((StringBuilder)serializable).append(this.d);
        ((StringBuilder)serializable).append(", includeStaticConfigPackages=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", excludeStaticConfigPackages=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", hasStorageInfoFromGms=");
        ((StringBuilder)serializable).append(this.g);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

