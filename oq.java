/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

final class oq
implements Iterator,
Map.Entry {
    int a;
    int b;
    boolean c;
    final ot d;

    public oq(ot ot2) {
        this.d = ot2;
        this.a = ot2.f - 1;
        this.b = -1;
    }

    @Override
    public final boolean equals(Object object) {
        if (this.c) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            return jse.i((object = (Map.Entry)object).getKey(), this.d.d(this.b)) && jse.i(object.getValue(), this.d.g(this.b));
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.c) {
            return this.d.d(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.d.g(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final int hashCode() {
        if (this.c) {
            Object object = this.d.d(this.b);
            Object object2 = this.d.g(this.b);
            int n2 = 0;
            int n3 = object == null ? 0 : object.hashCode();
            if (object2 != null) {
                n2 = object2.hashCode();
            }
            return n3 ^ n2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final void remove() {
        if (this.c) {
            this.d.e(this.b);
            --this.b;
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object object) {
        if (this.c) {
            return this.d.f(this.b, object);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append("=");
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}

