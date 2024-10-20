/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class gyp
extends AbstractMap
implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public gyp() {
        this.l(3);
    }

    public gyp(byte[] byArray) {
        this.l(12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        if (n2 >= 0) {
            this.l(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                this.put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a.af(n2, "Invalid size: "));
    }

    private final int s(int n2, int n3, int n4, int n5) {
        int n6 = n3 - 1;
        Object object = fvd.af(n3);
        if (n5 != 0) {
            fvd.ah(object, n4 & n6, n5 + 1);
        }
        Object object2 = this.g();
        int[] nArray = this.p();
        for (n3 = 0; n3 <= n2; ++n3) {
            n4 = fvd.ad(object2, n3);
            while (n4 != 0) {
                int n7 = n4 - 1;
                n5 = nArray[n7];
                int n8 = fvd.Z(n5, n2) | n3;
                int n9 = n8 & n6;
                int n10 = fvd.ad(object, n9);
                fvd.ah(object, n9, n4);
                nArray[n7] = fvd.aa(n8, n10, n6);
                n4 = n5 & n2;
            }
        }
        this.g = object;
        this.t(n6);
        return n6;
    }

    private final void t(int n2) {
        n2 = Integer.numberOfLeadingZeros(n2);
        this.e = fvd.aa(this.e, 32 - n2, 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        Iterator iterator = this.i();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }

    final int b(int n2) {
        if (++n2 < this.f) {
            return n2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 0x1F)) - 1;
    }

    @Override
    public final void clear() {
        if (this.o()) {
            return;
        }
        this.k();
        Map map = this.j();
        if (map != null) {
            this.e = hhk.ai(this.size(), 3);
            map.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(this.q(), 0, this.f, null);
        Arrays.fill(this.r(), 0, this.f, null);
        fvd.ag(this.g());
        Arrays.fill(this.p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override
    public final boolean containsKey(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    Map map = this.j();
                    if (map == null) break block2;
                    bl2 = map.containsKey(object);
                    break block3;
                }
                if (this.d(object) != -1) break block4;
                bl2 = false;
            }
            return bl2;
        }
        return true;
    }

    @Override
    public final boolean containsValue(Object object) {
        Map map = this.j();
        if (map == null) {
            for (int i2 = 0; i2 < this.f; ++i2) {
                if (!a.k(object, this.h(i2))) continue;
                return true;
            }
            return false;
        }
        return map.containsValue(object);
    }

    public final int d(Object object) {
        if (this.o()) {
            return -1;
        }
        int n2 = fvd.X(object);
        int n3 = this.c();
        int n4 = fvd.ad(this.g(), n2 & n3);
        if (n4 == 0) {
            return -1;
        }
        int n5 = fvd.Z(n2, n3);
        do {
            if (fvd.Z(n2 = this.p()[--n4], n3) == n5 && a.k(object, this.e(n4))) {
                return n4;
            }
            n4 = n2 &= n3;
        } while (n2 != 0);
        return -1;
    }

    public final Object e(int n2) {
        return this.q()[n2];
    }

    @Override
    public final Set entrySet() {
        Set set;
        Set set2 = set = this.i;
        if (set == null) {
            this.i = set2 = new gyk(this);
        }
        return set2;
    }

    public final Object f(Object object) {
        int n2;
        int n3;
        if (!this.o() && (n3 = fvd.ac(object, null, n2 = this.c(), this.g(), this.p(), this.q(), null)) != -1) {
            object = this.h(n3);
            this.m(n3, n2);
            --this.f;
            this.k();
            return object;
        }
        return a;
    }

    public final Object g() {
        return Objects.requireNonNull(this.g);
    }

    @Override
    public final Object get(Object object) {
        Map map = this.j();
        if (map != null) {
            return map.get(object);
        }
        int n2 = this.d(object);
        if (n2 == -1) {
            return null;
        }
        return this.h(n2);
    }

    public final Object h(int n2) {
        return this.r()[n2];
    }

    final Iterator i() {
        Map map = this.j();
        if (map != null) {
            return map.entrySet().iterator();
        }
        return new gyi(this);
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    final Map j() {
        Object object = this.g;
        if (object instanceof Map) {
            return (Map)object;
        }
        return null;
    }

    final void k() {
        this.e += 32;
    }

    @Override
    public final Set keySet() {
        Set set;
        Set set2 = set = this.h;
        if (set == null) {
            this.h = set2 = new gym(this);
        }
        return set2;
    }

    final void l(int n2) {
        fxf.r(true, "Expected size must be >= 0");
        this.e = hhk.ai(n2, 1);
    }

    final void m(int n2, int n3) {
        Object object = this.g();
        int[] nArray = this.p();
        Object[] objectArray = this.q();
        Object[] objectArray2 = this.r();
        int n4 = this.size();
        int n5 = n4 - 1;
        if (n2 < n5) {
            Object object2;
            int n6 = n2 + 1;
            objectArray[n2] = object2 = objectArray[n5];
            objectArray2[n2] = objectArray2[n5];
            objectArray[n5] = null;
            objectArray2[n5] = null;
            nArray[n2] = nArray[n5];
            nArray[n5] = 0;
            n5 = fvd.X(object2) & n3;
            n2 = fvd.ad(object, n5);
            if (n2 != n4) {
                int n7;
                while ((n2 = (n7 = nArray[n5 = n2 - 1]) & n3) != n4) {
                }
                nArray[n5] = fvd.aa(n7, n6, n3);
                return;
            }
            fvd.ah(object, n5, n6);
            return;
        }
        objectArray[n2] = null;
        objectArray2[n2] = null;
        nArray[n2] = 0;
    }

    public final void n(int n2, Object object) {
        this.r()[n2] = object;
    }

    final boolean o() {
        return this.g == null;
    }

    public final int[] p() {
        return Objects.requireNonNull(this.b);
    }

    @Override
    public final Object put(Object object, Object object2) {
        Object object3;
        int n2;
        int n3;
        if (this.o()) {
            fxf.B(this.o(), "Arrays already allocated");
            n3 = this.e;
            n2 = fvd.ae(n3);
            this.g = fvd.af(n2);
            this.t(n2 - 1);
            this.b = new int[n3];
            this.c = new Object[n3];
            this.d = new Object[n3];
        }
        if ((object3 = this.j()) != null) {
            return object3.put(object, object2);
        }
        int[] nArray = this.p();
        Object[] objectArray = this.q();
        object3 = this.r();
        int n4 = this.f;
        int n5 = n4 + 1;
        int n6 = fvd.X(object);
        int n7 = this.c();
        n3 = n6 & n7;
        n2 = fvd.ad(this.g(), n3);
        if (n2 == 0) {
            if (n5 > n7) {
                n3 = this.s(n7, fvd.ab(n7), n6, n4);
            } else {
                fvd.ah(this.g(), n3, n5);
                n3 = n7;
            }
        } else {
            int n8;
            int n9 = fvd.Z(n6, n7);
            n3 = 0;
            do {
                int n10;
                if (fvd.Z(n8 = nArray[n10 = n2 - 1], n7) == n9 && a.k(object, objectArray[n10])) {
                    object = object3[n10];
                    object3[n10] = object2;
                    return object;
                }
                n2 = n8 & n7;
                ++n3;
            } while (n2 != 0);
            if (n3 >= 9) {
                object3 = new LinkedHashMap(this.c() + 1, 1.0f);
                n3 = this.a();
                while (n3 >= 0) {
                    object3.put(this.e(n3), this.h(n3));
                    n3 = this.b(n3);
                }
                this.g = object3;
                this.b = null;
                this.c = null;
                this.d = null;
                this.k();
                return object3.put(object, object2);
            }
            if (n5 > n7) {
                n3 = this.s(n7, fvd.ab(n7), n6, n4);
            } else {
                nArray[n10] = fvd.aa(n8, n5, n7);
                n3 = n7;
            }
        }
        n7 = this.p().length;
        if (n5 > n7 && (n2 = Math.min(0x3FFFFFFF, Math.max(1, n7 >>> 1) + n7 | 1)) != n7) {
            this.b = Arrays.copyOf(this.p(), n2);
            this.c = Arrays.copyOf(this.q(), n2);
            this.d = Arrays.copyOf(this.r(), n2);
        }
        this.p()[n4] = n3 = fvd.aa(n6, 0, n3);
        this.q()[n4] = object;
        this.n(n4, object2);
        this.f = n5;
        this.k();
        return null;
    }

    public final Object[] q() {
        return Objects.requireNonNull(this.c);
    }

    public final Object[] r() {
        return Objects.requireNonNull(this.d);
    }

    @Override
    public final Object remove(Object object) {
        Object object2 = this.j();
        if (object2 != null) {
            return object2.remove(object);
        }
        object = object2 = this.f(object);
        if (object2 == a) {
            object = null;
        }
        return object;
    }

    @Override
    public final int size() {
        Map map = this.j();
        int n2 = map != null ? map.size() : this.f;
        return n2;
    }

    @Override
    public final Collection values() {
        Collection collection;
        Collection collection2 = collection = this.j;
        if (collection == null) {
            this.j = collection2 = new gyo(this);
        }
        return collection2;
    }
}

