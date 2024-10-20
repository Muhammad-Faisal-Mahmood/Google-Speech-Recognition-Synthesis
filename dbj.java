/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class dbj {
    public final gzx a;
    public final String b;

    public dbj() {
        throw null;
    }

    public dbj(gzx gzx2, String string) {
        this.a = gzx2;
        this.b = string;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof dbj)) break block4;
                    object2 = (dbj)object;
                    object = this.a;
                    if (!(object == null ? ((dbj)object2).a == null : fvd.z((List)object, ((dbj)object2).a))) break block4;
                    object = this.b;
                    object2 = ((dbj)object2).b;
                    if (object != null) break block5;
                    if (object2 != null) break block4;
                    break block6;
                }
                if (!((String)object).equals(object2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : ((gzx)object).hashCode();
        object = this.b;
        if (object != null) {
            n2 = ((String)object).hashCode();
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("CustomValues{downloadUrls=");
        stringBuilder.append(string);
        stringBuilder.append(", downloadPackingScheme=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

