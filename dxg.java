/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class dxg {
    public final String a;
    public final List b;

    public dxg() {
        throw null;
    }

    public dxg(String string, List list) {
        this.a = string;
        this.b = list;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dxg) {
            object = (dxg)object;
            if (this.a.equals(((dxg)object).a) && this.b.equals(((dxg)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("SafeSql{query=");
        stringBuilder.append(this.a);
        stringBuilder.append(", queryArgs=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

