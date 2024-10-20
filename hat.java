/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Arrays;

public class hat
extends gzk {
    Object[] d;
    private int e;

    public hat() {
        super(4);
    }

    public hat(int n2) {
        super(n2);
        this.d = new Object[hav.g(n2)];
    }

    public hav g() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object;
                if (this.d != null && hav.g(n2) == this.d.length) {
                    Object[] objectArray;
                    n2 = this.b;
                    object = objectArray = this.a;
                    if (hav.t(n2, objectArray.length)) {
                        object = Arrays.copyOf(objectArray, n2);
                    }
                    n2 = this.e;
                    objectArray = this.d;
                    object = new hdc((Object[])object, n2, objectArray, objectArray.length - 1, this.b);
                } else {
                    object = hav.j(this.b, this.a);
                    this.b = object.size();
                }
                this.c = true;
                this.d = null;
                return object;
            }
            return new hdq(Objects.requireNonNull(this.a[0]));
        }
        return hdc.a;
    }

    public final void h(Object ... objectArray) {
        if (this.d != null) {
            int n2 = objectArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.j(objectArray[i2]);
            }
            return;
        }
        super.d(objectArray);
    }

    public final void i(Iterable object) {
        fxf.K(object);
        if (this.d != null) {
            object = object.iterator();
            while (object.hasNext()) {
                this.j(object.next());
            }
            return;
        }
        super.e((Iterable)object);
    }

    public final void j(Object object) {
        Object object2;
        int n2;
        fxf.K(object);
        if (this.d != null && (n2 = hav.g(this.b)) <= ((Object[])(object2 = this.d)).length) {
            Objects.requireNonNull(object2);
            int n3 = this.d.length;
            int n4 = object.hashCode();
            n2 = fvd.W(n4);
            while (true) {
                Object[] objectArray;
                if ((object2 = (objectArray = this.d)[n2 &= n3 - 1]) == null) {
                    objectArray[n2] = object;
                    this.e += n4;
                    super.b(object);
                    return;
                }
                if (object2.equals(object)) {
                    return;
                }
                ++n2;
            }
        }
        this.d = null;
        super.b(object);
    }

    public final void k(hat hat2) {
        if (this.d != null) {
            for (int i2 = 0; i2 < hat2.b; ++i2) {
                this.j(Objects.requireNonNull(hat2.a[i2]));
            }
            return;
        }
        this.a(hat2.a, hat2.b);
    }
}

