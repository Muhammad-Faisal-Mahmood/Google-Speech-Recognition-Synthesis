/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class iwc {
    public final itw a;
    public final iwx b;
    public final ixb c;
    private final iwa d;

    public iwc() {
        throw null;
    }

    public iwc(ixb ixb2, iwx iwx2, itw itw2, iwa iwa2) {
        a.s(ixb2, "method");
        this.c = ixb2;
        a.s(iwx2, "headers");
        this.b = iwx2;
        a.s(itw2, "callOptions");
        this.a = itw2;
        a.s(iwa2, "pickDetailsConsumer");
        this.d = iwa2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (iwc)object;
            if (a.k(this.a, ((iwc)object).a) && a.k(this.b, ((iwc)object).b) && a.k(this.c, ((iwc)object).c) && a.k(this.d, ((iwc)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        Object object = this.a;
        Object object2 = this.b;
        String string = String.valueOf(this.c);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("[method=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" headers=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" callOptions=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }
}

