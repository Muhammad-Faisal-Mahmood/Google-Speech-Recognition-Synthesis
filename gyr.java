/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

final class gyr
extends AbstractSet
implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    gyr() {
        this.f(3);
    }

    public gyr(int n2) {
        this.f(n2);
    }

    private final int h() {
        return (1 << (this.b & 0x1F)) - 1;
    }

    private final int i(int n2, int n3, int n4, int n5) {
        int n6 = n3 - 1;
        Object object = fvd.af(n3);
        if (n5 != 0) {
            fvd.ah(object, n4 & n6, n5 + 1);
        }
        Object object2 = this.j();
        int[] nArray = this.l();
        for (n3 = 0; n3 <= n2; ++n3) {
            n4 = fvd.ad(object2, n3);
            while (n4 != 0) {
                int n7 = n4 - 1;
                int n8 = nArray[n7];
                n5 = fvd.Z(n8, n2) | n3;
                int n9 = n5 & n6;
                int n10 = fvd.ad(object, n9);
                fvd.ah(object, n9, n4);
                nArray[n7] = fvd.aa(n5, n10, n6);
                n4 = n8 & n2;
            }
        }
        this.c = object;
        this.k(n6);
        return n6;
    }

    private final Object j() {
        return Objects.requireNonNull(this.c);
    }

    private final void k(int n2) {
        n2 = Integer.numberOfLeadingZeros(n2);
        this.b = fvd.aa(this.b, 32 - n2, 31);
    }

    private final int[] l() {
        return Objects.requireNonNull(this.d);
    }

    private final Object[] m() {
        return Objects.requireNonNull(this.a);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        if (n2 >= 0) {
            this.f(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                this.add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a.af(n2, "Invalid size: "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            objectOutputStream.writeObject(iterator.next());
        }
    }

    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override
    public final boolean add(Object object) {
        Object object2;
        int n2;
        int n3;
        if (this.g()) {
            fxf.B(this.g(), "Arrays already allocated");
            n3 = this.b;
            n2 = fvd.ae(n3);
            this.c = fvd.af(n2);
            this.k(n2 - 1);
            this.d = new int[n3];
            this.a = new Object[n3];
        }
        if ((object2 = this.d()) != null) {
            return object2.add(object);
        }
        int[] nArray = this.l();
        object2 = this.m();
        int n4 = this.e;
        int n5 = n4 + 1;
        int n6 = fvd.X(object);
        int n7 = this.h();
        n2 = n6 & n7;
        n3 = fvd.ad(this.j(), n2);
        if (n3 == 0) {
            if (n5 > n7) {
                n2 = this.i(n7, fvd.ab(n7), n6, n4);
            } else {
                fvd.ah(this.j(), n2, n5);
                n2 = n7;
            }
        } else {
            int n8;
            int n9 = fvd.Z(n6, n7);
            n2 = 0;
            do {
                int n10;
                if (fvd.Z(n8 = nArray[n10 = n3 - 1], n7) == n9 && a.k(object, object2[n10])) {
                    return false;
                }
                n3 = n8 & n7;
                ++n2;
            } while (n3 != 0);
            if (n2 >= 9) {
                object2 = new LinkedHashSet(this.h() + 1, 1.0f);
                n2 = this.a();
                while (n2 >= 0) {
                    object2.add(this.c(n2));
                    n2 = this.b(n2);
                }
                this.c = object2;
                this.d = null;
                this.a = null;
                this.e();
                return object2.add(object);
            }
            if (n5 > n7) {
                n2 = this.i(n7, fvd.ab(n7), n6, n4);
            } else {
                nArray[n10] = fvd.aa(n8, n5, n7);
                n2 = n7;
            }
        }
        n7 = this.l().length;
        if (n5 > n7 && (n3 = Math.min(0x3FFFFFFF, Math.max(1, n7 >>> 1) + n7 | 1)) != n7) {
            this.d = Arrays.copyOf(this.l(), n3);
            this.a = Arrays.copyOf(this.m(), n3);
        }
        this.l()[n4] = n2 = fvd.aa(n6, 0, n2);
        this.m()[n4] = object;
        this.e = n5;
        this.e();
        return true;
    }

    final int b(int n2) {
        if (++n2 < this.e) {
            return n2;
        }
        return -1;
    }

    public final Object c(int n2) {
        return this.m()[n2];
    }

    @Override
    public final void clear() {
        if (this.g()) {
            return;
        }
        this.e();
        Set set = this.d();
        if (set != null) {
            this.b = hhk.ai(this.size(), 3);
            set.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(this.m(), 0, this.e, null);
        fvd.ag(this.j());
        Arrays.fill(this.l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override
    public final boolean contains(Object object) {
        if (this.g()) {
            return false;
        }
        Object object2 = this.d();
        if (object2 != null) {
            return object2.contains(object);
        }
        Object object3 = fvd.X(object);
        int n2 = this.h();
        Object object4 = fvd.ad(this.j(), object3 & n2);
        if (object4 == 0) {
            return false;
        }
        int n3 = fvd.Z(object3, n2);
        do {
            if (fvd.Z(object4 = (Object)(object2 = (Object)this.l())[object3 = object4 - 1], n2) == n3 && a.k(object, this.c((int)object3))) {
                return true;
            }
            object4 = object3 = object4 & n2;
        } while (object3 != 0);
        return false;
    }

    final Set d() {
        Object object = this.c;
        if (object instanceof Set) {
            return (Set)object;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int n2) {
        fxf.r(true, "Expected size must be >= 0");
        this.b = hhk.ai(n2, 1);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Iterator iterator() {
        Set set = this.d();
        if (set != null) {
            return set.iterator();
        }
        return new gyq(this);
    }

    @Override
    public final boolean remove(Object objectArray) {
        if (!this.g()) {
            Object object = this.d();
            if (object != null) {
                return object.remove(objectArray);
            }
            int n2 = this.h();
            Object object2 = fvd.ac(objectArray, null, n2, this.j(), this.l(), this.m(), null);
            if (object2 != -1) {
                Object object3 = this.j();
                object = this.l();
                objectArray = this.m();
                int n3 = this.size();
                int n4 = n3 - 1;
                if (object2 < n4) {
                    Object object4;
                    int n5 = object2 + 1;
                    objectArray[object2] = object4 = objectArray[n4];
                    objectArray[n4] = null;
                    object[object2] = object[n4];
                    object[n4] = false;
                    int n6 = fvd.X(object4) & n2;
                    n4 = object2 = fvd.ad(object3, n6);
                    if (object2 == n3) {
                        fvd.ah(object3, n6, n5);
                    } else {
                        while ((n4 = (object2 = (Object)object[n6 = n4 - 1]) & n2) != n3) {
                        }
                        object[n6] = fvd.aa(object2, n5, n2);
                    }
                } else {
                    objectArray[object2] = null;
                    object[object2] = false;
                }
                --this.e;
                this.e();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int size() {
        Set set = this.d();
        int n2 = set != null ? set.size() : this.e;
        return n2;
    }

    @Override
    public final Object[] toArray() {
        if (this.g()) {
            return new Object[0];
        }
        Object[] objectArray = this.d();
        objectArray = objectArray != null ? objectArray.toArray() : Arrays.copyOf(this.m(), this.e);
        return objectArray;
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        if (this.g()) {
            if (objectArray.length > 0) {
                objectArray[0] = null;
            }
            return objectArray;
        }
        Object[] objectArray2 = this.d();
        if (objectArray2 != null) {
            objectArray2 = objectArray2.toArray(objectArray);
        } else {
            Object[] objectArray3 = this.m();
            int n2 = this.e;
            fxf.z(0, n2, objectArray3.length);
            int n3 = objectArray.length;
            if (n3 < n2) {
                objectArray2 = hhk.z(objectArray, n2);
            } else {
                objectArray2 = objectArray;
                if (n3 > n2) {
                    objectArray[n2] = null;
                    objectArray2 = objectArray;
                }
            }
            System.arraycopy(objectArray3, 0, objectArray2, 0, n2);
        }
        return objectArray2;
    }
}

