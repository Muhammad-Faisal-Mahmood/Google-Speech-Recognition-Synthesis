/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public abstract class gzd
implements Iterable {
    private final gto a = gsl.a;

    protected gzd() {
    }

    public final String toString() {
        this.a.e(this);
        Iterator iterator = this.iterator();
        StringBuilder stringBuilder = new StringBuilder("[");
        boolean bl2 = true;
        while (iterator.hasNext()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(iterator.next());
            bl2 = false;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

