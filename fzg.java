/*
 * Decompiled with CFR 0.152.
 */
public final class fzg {
    private final fym a;
    private final fze b;

    public fzg() {
        throw null;
    }

    public fzg(fym fym2, fze fze2) {
        if (fym2 != null) {
            this.a = fym2;
            this.b = fze2;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fzg) {
            object = (fzg)object;
            if (((Object)this.a).equals(((fzg)object).a) && this.b.equals(((fzg)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = ((Object)this.a).hashCode();
        fze fze2 = this.b;
        if (fze2.B()) {
            n2 = fze2.i();
        } else {
            int n4;
            n2 = n4 = fze2.memoizedHashCode;
            if (n4 == 0) {
                fze2.memoizedHashCode = n2 = fze2.i();
            }
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        String string2 = object.toString();
        object = new StringBuilder("AccountContext{id=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", info=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

