/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
public final class fzd {
    public final fym a;
    public final fze b;
    private final int c;

    public fzd() {
        throw null;
    }

    public fzd(fym fym2, fze fze2, int n2) {
        this.a = fym2;
        if (fze2 != null) {
            this.b = fze2;
            this.c = n2;
            return;
        }
        throw new NullPointerException("Null info");
    }

    public static fzd a(fym fym2, fze fze2, int n2, gda gda2) {
        fxf.K(gda2);
        return new fzd(fym2, fze2, n2);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fzd) {
            object = (fzd)object;
            if (((Object)this.a).equals(((fzd)object).a) && this.b.equals(((fzd)object).b) && this.c == ((fzd)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4 = ((Object)this.a).hashCode();
        fze fze2 = this.b;
        if (fze2.B()) {
            n3 = fze2.i();
        } else {
            n3 = n2 = fze2.memoizedHashCode;
            if (n2 == 0) {
                fze2.memoizedHashCode = n3 = fze2.i();
            }
        }
        n2 = this.c;
        a.L(n2);
        return ((n4 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n2;
    }

    public final String toString() {
        int n2 = a.x(this.c);
        Object object = this.b;
        String string = ((Object)this.a).toString();
        String string2 = object.toString();
        String string3 = Integer.toString(n2);
        object = new StringBuilder("Account{id=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", info=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", state=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

