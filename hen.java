/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class hen
extends hfz {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(hez hez2) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (!this.a[i2 + i2].equals(hez2)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final hez c(int n2) {
        if (n2 < this.b) {
            return (hez)this.a[n2 + n2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Object d(hez hez2) {
        int n2 = this.a(hez2);
        if (n2 != -1) {
            return hez2.c(this.a[n2 + n2 + 1]);
        }
        return null;
    }

    @Override
    public final Object e(int n2) {
        if (n2 < this.b) {
            return this.a[n2 + n2 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(hez objectArray, Object object) {
        int n2;
        if (!objectArray.b && (n2 = this.a((hez)objectArray)) != -1) {
            objectArray = this.a;
            hhk.h(object, "metadata value");
            objectArray[n2 + n2 + 1] = object;
            return;
        }
        int n3 = this.b + 1;
        Object[] objectArray2 = this.a;
        n2 = objectArray2.length;
        if (n3 + n3 > n2) {
            this.a = Arrays.copyOf(objectArray2, n2 + n2);
        }
        objectArray2 = this.a;
        n2 = this.b;
        hhk.h(objectArray, "metadata key");
        objectArray2[n2 + n2] = objectArray;
        objectArray = this.a;
        n2 = this.b++;
        hhk.h(object, "metadata value");
        objectArray[n2 + n2 + 1] = object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata{");
        for (int i2 = 0; i2 < this.b; ++i2) {
            stringBuilder.append(" '");
            stringBuilder.append(this.c(i2));
            stringBuilder.append("': ");
            stringBuilder.append(this.e(i2));
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

