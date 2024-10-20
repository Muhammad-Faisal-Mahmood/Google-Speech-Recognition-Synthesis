/*
 * Decompiled with CFR 0.152.
 */
public final class fzl {
    public final String a;
    public final fzk b;

    public fzl() {
        throw null;
    }

    public fzl(String string, fzk fzk2) {
        this.a = string;
        this.b = fzk2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fzl) {
            object = (fzl)object;
            if (this.a.equals(((fzl)object).a) && this.b.equals(((fzl)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("AccountProviderConfig{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", provider=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

