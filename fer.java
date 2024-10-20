/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class fer {
    public final int a;
    public final int b;
    public final ArrayList c;

    public fer() {
        throw null;
    }

    public fer(int n2, int n3, ArrayList arrayList) {
        this.a = n2;
        this.b = n3;
        this.c = arrayList;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fer) {
            object = (fer)object;
            if (this.a == ((fer)object).a && this.b == ((fer)object).b && this.c.equals(((fer)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        ArrayList arrayList = this.c;
        return ((n2 ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ arrayList.hashCode();
    }

    public final String toString() {
        String string = ((Object)this.c).toString();
        StringBuilder stringBuilder = new StringBuilder("AlternativeSpan{start=");
        stringBuilder.append(this.a);
        stringBuilder.append(", end=");
        stringBuilder.append(this.b);
        stringBuilder.append(", alternatives=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

