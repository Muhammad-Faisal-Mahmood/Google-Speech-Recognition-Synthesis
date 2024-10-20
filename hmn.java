/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class hmn
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID = 0L;
    final float[] a;
    final int b;
    final int c;

    public hmn(float[] fArray, int n2, int n3) {
        this.a = fArray;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final boolean contains(Object object) {
        return object instanceof Float && hhk.aj(this.a, ((Float)object).floatValue(), this.b, this.c) != -1;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hmn) {
            object = (hmn)object;
            int n2 = this.size();
            if (((hmn)object).size() == n2) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (this.a[this.b + i2] == ((hmn)object).a[((hmn)object).b + i2]) continue;
                    return false;
                }
                return true;
            }
            return false;
        }
        return super.equals(object);
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = this.b; i2 < this.c; ++i2) {
            n2 = n2 * 31 + Float.valueOf(this.a[i2]).hashCode();
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        int n2;
        if (object instanceof Float && (n2 = hhk.aj(this.a, ((Float)object).floatValue(), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (object instanceof Float) {
            int n2;
            block4: {
                float[] fArray = this.a;
                float f2 = ((Float)object).floatValue();
                int n3 = this.b;
                for (n2 = this.c - 1; n2 >= n3; --n2) {
                    if (fArray[n2] != f2) {
                        continue;
                    }
                    break block4;
                }
                n2 = -1;
            }
            if (n2 >= 0) {
                return n2 - this.b;
            }
        }
        return -1;
    }

    @Override
    public final int size() {
        return this.c - this.b;
    }

    @Override
    public final List subList(int n2, int n3) {
        fxf.z(n2, n3, this.size());
        if (n2 == n3) {
            return Collections.emptyList();
        }
        float[] fArray = this.a;
        int n4 = this.b;
        return new hmn(fArray, n4 + n2, n3 + n4);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 12);
        stringBuilder.append('[');
        stringBuilder.append(this.a[this.b]);
        int n2 = this.b;
        while (++n2 < this.c) {
            stringBuilder.append(", ");
            stringBuilder.append(this.a[n2]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

