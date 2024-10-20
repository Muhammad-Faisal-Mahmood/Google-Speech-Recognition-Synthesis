/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fji {
    public final fig a;
    public final Optional b;
    public final Optional c;

    public fji() {
        throw null;
    }

    public fji(fig fig2, Optional optional, Optional optional2) {
        this.a = fig2;
        this.b = optional;
        this.c = optional2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fji) {
            object = (fji)object;
            if (this.a.equals(((fji)object).a) && this.b.equals(((fji)object).b) && this.c.equals(((fji)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        fig fig2 = this.a;
        if (fig2.B()) {
            n2 = fig2.i();
        } else {
            int n3;
            n2 = n3 = fig2.memoizedHashCode;
            if (n3 == 0) {
                fig2.memoizedHashCode = n2 = fig2.i();
            }
        }
        return ((n2 ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        Object object = this.c;
        Object object2 = this.b;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("StartListeningRequest{startAction=");
        stringBuilder.append(string);
        stringBuilder.append(", audioSource=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", attributionSource=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

