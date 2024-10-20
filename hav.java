/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class hav
extends gzm
implements Set,
j$.util.Set {
    private static final long serialVersionUID = 912559L;
    private transient gzx a;

    static int g(int n2) {
        int n3 = Math.max(n2, 2);
        if (n3 < 0x2CCCCCCC) {
            n2 = Integer.highestOneBit(n3 - 1);
            while ((double)(n2 += n2) * 0.7 < (double)n3) {
            }
            return n2;
        }
        boolean bl2 = n3 < 0x40000000;
        fxf.r(bl2, "collection too large");
        return 0x40000000;
    }

    public static hat i(int n2) {
        fvd.al(n2, "expectedSize");
        return new hat(n2);
    }

    public static hav j(int n2, Object ... objectArray) {
        if (n2 != 0) {
            if (n2 != 1) {
                Object[] objectArray2;
                int n3;
                int n4 = hav.g(n2);
                Object[] objectArray3 = new Object[n4];
                int n5 = n4 - 1;
                int n6 = n3 = 0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n7;
                    int n8;
                    objectArray2 = objectArray[i2];
                    hhk.A(objectArray2, i2);
                    int n9 = objectArray2.hashCode();
                    int n10 = fvd.W(n9);
                    while (true) {
                        Object object;
                        if ((object = objectArray3[n8 = n10 & n5]) == null) {
                            objectArray[n6] = objectArray2;
                            objectArray3[n8] = objectArray2;
                            n8 = n3 + n9;
                            n7 = n6 + 1;
                            break;
                        }
                        n8 = n3;
                        n7 = n6;
                        if (object.equals(objectArray2)) break;
                        ++n10;
                    }
                    n3 = n8;
                    n6 = n7;
                }
                Arrays.fill(objectArray, n6, n2, null);
                if (n6 == 1) {
                    return new hdq(Objects.requireNonNull(objectArray[0]));
                }
                n2 = n4 / 2;
                if (hav.g(n6) < n2) {
                    return hav.j(n6, objectArray);
                }
                objectArray2 = objectArray;
                if (hav.t(n6, objectArray.length)) {
                    objectArray2 = Arrays.copyOf(objectArray, n6);
                }
                return new hdc(objectArray2, n3, objectArray3, n5, n6);
            }
            return new hdq(Objects.requireNonNull(objectArray[0]));
        }
        return hdc.a;
    }

    public static hav n(Collection objectArray) {
        hav hav2;
        if (objectArray instanceof hav && !(objectArray instanceof SortedSet) && !(hav2 = (hav)objectArray).l()) {
            return hav2;
        }
        objectArray = objectArray.toArray();
        return hav.j(objectArray.length, objectArray);
    }

    public static hav o(Object[] objectArray) {
        int n2 = objectArray.length;
        if (n2 != 0) {
            if (n2 != 1) {
                return hav.j(n2, (Object[])objectArray.clone());
            }
            return new hdq(objectArray[0]);
        }
        return hdc.a;
    }

    public static hav p(Object object, Object object2) {
        return hav.j(2, object, object2);
    }

    public static hav q(Object object, Object object2, Object object3) {
        return hav.j(3, object, object2, object3);
    }

    public static hav r(Object object, Object object2, Object object3, Object object4) {
        return hav.j(4, object, object2, object3, object4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @SafeVarargs
    public static hav s(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... objectArray) {
        fxf.r(true, "the total number of elements must fit in an int");
        int n2 = objectArray.length;
        int n3 = n2 + 6;
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        System.arraycopy(objectArray, 0, objectArray2, 6, n2);
        return hav.j(n3, objectArray2);
    }

    public static boolean t(int n2, int n3) {
        return n2 < (n3 >> 1) + (n3 >> 2);
    }

    public boolean c() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hav && this.c() && ((hav)object).c() && this.hashCode() != object.hashCode()) {
            return false;
        }
        return hhk.u(this, object);
    }

    @Override
    public gzx f() {
        gzx gzx2;
        gzx gzx3 = gzx2 = this.a;
        if (gzx2 == null) {
            this.a = gzx3 = this.h();
        }
        return gzx3;
    }

    public gzx h() {
        return gzx.h(this.toArray());
    }

    @Override
    public int hashCode() {
        return hhk.n(this);
    }

    @Override
    public abstract hdx k();

    @Override
    public Object writeReplace() {
        return new hau(this.toArray());
    }
}

