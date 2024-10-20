/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class gtr
implements Serializable,
gtq {
    private static final long serialVersionUID = 0L;
    private final List a;

    public gtr(List list) {
        this.a = list;
    }

    @Override
    public final boolean a(Object object) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (((gtq)this.a.get(i2)).a(object)) continue;
            return false;
        }
        return true;
    }

    public final boolean equals(Object object) {
        if (object instanceof gtr) {
            object = (gtr)object;
            return this.a.equals(((gtr)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Predicates.and(");
        Iterator iterator = this.a.iterator();
        boolean bl2 = true;
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!bl2) {
                stringBuilder.append(',');
            }
            stringBuilder.append(t2);
            bl2 = false;
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

