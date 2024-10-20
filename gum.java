/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Arrays;

public final class gum
implements Serializable,
gui {
    private static final long serialVersionUID = 0L;
    public final Object a;

    public gum(Object object) {
        this.a = object;
    }

    @Override
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof gum) {
            object = (gum)object;
            return a.k(this.a, ((gum)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("Suppliers.ofInstance(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

