/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Arrays;

public final class hmm
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final String a;
    public final int b;

    public hmm(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public final boolean a() {
        return this.b >= 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof hmm) {
            object = (hmm)object;
            if (a.k(this.a, ((hmm)object).a) && this.b == ((hmm)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            stringBuilder.append('[');
            stringBuilder.append(this.a);
            stringBuilder.append(']');
        } else {
            stringBuilder.append(this.a);
        }
        if (this.a()) {
            stringBuilder.append(':');
            stringBuilder.append(this.b);
        }
        return stringBuilder.toString();
    }
}

