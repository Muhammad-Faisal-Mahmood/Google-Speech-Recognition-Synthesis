/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

public final class OptionalInt {
    private static final OptionalInt c = new OptionalInt();
    private final boolean a;
    private final int b;

    private OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    private OptionalInt(int n2) {
        this.a = true;
        this.b = n2;
    }

    public static OptionalInt empty() {
        return c;
    }

    public static OptionalInt of(int n2) {
        return new OptionalInt(n2);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block2: {
            bl2 = true;
            if (this == object) {
                return true;
            }
            if (!(object instanceof OptionalInt)) {
                return false;
            }
            object = (OptionalInt)object;
            boolean bl3 = this.a;
            if (bl3 && ((OptionalInt)object).a ? this.b == ((OptionalInt)object).b : bl3 == ((OptionalInt)object).a) break block2;
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n2 = this.a ? this.b : 0;
        return n2;
    }

    public final String toString() {
        CharSequence charSequence;
        if (this.a) {
            charSequence = new StringBuilder("OptionalInt[");
            ((StringBuilder)charSequence).append(this.b);
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "OptionalInt.empty";
        }
        return charSequence;
    }
}

