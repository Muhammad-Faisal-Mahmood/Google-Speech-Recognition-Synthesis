/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class gud
implements Iterable {
    final CharSequence a;
    final guf b;

    public gud(guf guf2, CharSequence charSequence) {
        this.a = charSequence;
        this.b = guf2;
    }

    public final Iterator iterator() {
        return this.b.f(this.a);
    }

    public final String toString() {
        gtk gtk2 = new gtk(", ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        gtk2.g(stringBuilder, this);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

