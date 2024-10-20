/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class fsq {
    static final Object[] a;
    static final fsq b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objectArray = new Object[]{};
        a = objectArray;
        b = new fsq(objectArray);
    }

    public fsq(Object ... objectArray) {
        this.c = objectArray;
        this.d = Arrays.hashCode(objectArray);
    }

    public final boolean equals(Object object) {
        if (object instanceof fsq) {
            int n2 = this.d;
            object = (fsq)object;
            if (n2 == ((fsq)object).d && Arrays.equals(this.c, ((fsq)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}

