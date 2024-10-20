/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Comparator;

public final class haw
extends hat {
    private final Comparator e;

    public haw(Comparator comparator) {
        fxf.K(comparator);
        this.e = comparator;
    }

    @Override
    public final /* synthetic */ void c(Object object) {
        super.j(object);
    }

    public final hay l() {
        Object object;
        Object[] objectArray = this.a;
        int n2 = this.b;
        Comparator comparator = this.e;
        if (n2 == 0) {
            object = hay.B(comparator);
        } else {
            hhk.C(objectArray, n2);
            Arrays.sort(objectArray, 0, n2, comparator);
            int n3 = 1;
            for (int i2 = 1; i2 < n2; ++i2) {
                object = objectArray[i2];
                int n4 = n3;
                if (comparator.compare(object, objectArray[n3 - 1]) != 0) {
                    objectArray[n3] = object;
                    n4 = n3 + 1;
                }
                n3 = n4;
            }
            Arrays.fill(objectArray, n3, n2, null);
            object = objectArray;
            if (n3 < objectArray.length >> 1) {
                object = Arrays.copyOf(objectArray, n3);
            }
            object = new hdd(gzx.i(object, n3), comparator);
        }
        this.b = object.size();
        this.c = true;
        return object;
    }

    public final void m(Object object) {
        super.j(object);
    }

    public final void n(Object ... objectArray) {
        super.h(objectArray);
    }
}

