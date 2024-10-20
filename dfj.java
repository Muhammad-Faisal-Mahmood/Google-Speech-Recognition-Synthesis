/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class dfj {
    public final gzx a;
    public final byte[] b;
    private final String c;

    public dfj() {
        throw null;
    }

    public dfj(String string, gzx gzx2, byte[] byArray) {
        if (string != null) {
            this.c = string;
            if (gzx2 != null) {
                this.a = gzx2;
                this.b = byArray;
                return;
            }
            throw new NullPointerException("Null names");
        }
        throw new NullPointerException("Null superpackName");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dfj) {
            object = (dfj)object;
            if (this.c.equals(((dfj)object).c) && fvd.z(this.a, ((dfj)object).a)) {
                byte[] byArray = this.b;
                boolean bl2 = object instanceof dfj;
                if (Arrays.equals(byArray, ((dfj)object).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        object = Arrays.toString(object);
        StringBuilder stringBuilder = new StringBuilder("SelectedPacks{superpackName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", names=");
        stringBuilder.append(string);
        stringBuilder.append(", syncMetadata=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

