/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;

public final class jpp
implements Map,
Serializable,
jsm {
    public static final jpp a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private jpr l;
    private jpq m;
    private jou n;

    static {
        jpp jpp2 = new jpp(0);
        jpp2.h = true;
        a = jpp2;
    }

    public jpp() {
        this(8);
    }

    public jpp(int n2) {
        Object[] objectArray = new Object[n2];
        int[] nArray = new int[n2];
        int[] nArray2 = new int[jjj.u(n2)];
        this.b = objectArray;
        this.c = null;
        this.d = nArray;
        this.i = nArray2;
        this.j = 2;
        this.e = 0;
        this.k = jjj.v(this.l());
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object object) {
        int n2 = object != null ? object.hashCode() : 0;
        return n2 * -1640531527 >>> this.k;
    }

    private final void n(int n2) {
        int n3 = this.d();
        int n4 = this.e;
        if ((n3 -= n4) < n2 && n3 + (n4 -= this.g) >= n2 && n4 >= this.d() >> 2) {
            this.p(this.l());
            return;
        }
        if ((n2 = this.e + n2) >= 0) {
            if (n2 > this.d()) {
                n2 = jns.ai(this.d(), n2);
                this.b = jjj.B(this.b, n2);
                Object object = this.c;
                object = object != null ? jjj.B(object, n2) : null;
                this.c = object;
                object = Arrays.copyOf(this.d, n2);
                jse.d(object, "copyOf(...)");
                this.d = (int[])object;
                n2 = jjj.u(n2);
                if (n2 > this.l()) {
                    this.p(n2);
                }
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void o() {
        ++this.f;
    }

    private final void p(int n2) {
        Object[] objectArray;
        int n3;
        this.o();
        int n4 = this.e;
        int n5 = this.g;
        int n6 = 0;
        if (n4 > n5) {
            Object[] objectArray2 = this.c;
            n4 = 0;
            for (n5 = 0; n5 < (n3 = this.e); ++n5) {
                n3 = n4;
                if (this.d[n5] >= 0) {
                    objectArray = this.b;
                    objectArray[n4] = objectArray[n5];
                    if (objectArray2 != null) {
                        objectArray2[n4] = objectArray2[n5];
                    }
                    n3 = n4 + 1;
                }
                n4 = n3;
            }
            jjj.z(this.b, n4, n3);
            if (objectArray2 != null) {
                jjj.z(objectArray2, n4, this.e);
            }
            this.e = n4;
        }
        if (n2 != this.l()) {
            this.i = new int[n2];
            this.k = jjj.v(n2);
            n4 = n6;
        } else {
            objectArray = this.i;
            n2 = this.l();
            jse.e(objectArray, "<this>");
            Arrays.fill(objectArray, 0, n2, 0);
            n4 = n6;
        }
        block1: while (n4 < this.e) {
            n3 = n4 + 1;
            n2 = this.m(this.b[n4]);
            n5 = this.j;
            while (true) {
                if ((objectArray = this.i)[n2] == 0) {
                    objectArray[n2] = n3;
                    this.d[n4] = n2;
                    n4 = n3;
                    continue block1;
                }
                if (--n5 < 0) break;
                if (n2 == 0) {
                    n2 = this.l() - 1;
                    continue;
                }
                --n2;
            }
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
    }

    private final Object writeReplace() {
        if (this.h) {
            return new jpt(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object object) {
        this.f();
        block0: while (true) {
            int n2 = this.m(object);
            int n3 = this.j;
            int n4 = this.l();
            int n5 = 0;
            while (true) {
                int n6;
                if ((n6 = this.i[n2]) <= 0) {
                    if (this.e >= this.d()) {
                        this.n(1);
                        continue block0;
                    }
                    n3 = this.e;
                    this.e = n4 = n3 + 1;
                    this.b[n3] = object;
                    this.d[n3] = n2;
                    this.i[n2] = n4;
                    ++this.g;
                    this.o();
                    if (n5 > this.j) {
                        this.j = n5;
                    }
                    return n3;
                }
                if (jse.i(this.b[n6 - 1], object)) {
                    return -n6;
                }
                n6 = jse.l(n3 + n3, n4 >> 1);
                if (++n5 > n6) {
                    n2 = this.l();
                    this.p(n2 + n2);
                    continue block0;
                }
                if (n2 == 0) {
                    n2 = this.l() - 1;
                    continue;
                }
                --n2;
            }
            break;
        }
    }

    public final int b(Object object) {
        int n2 = this.m(object);
        int n3 = this.j;
        int n4;
        while ((n4 = this.i[n2]) != 0) {
            Object[] objectArray;
            if (n4 > 0 && jse.i((objectArray = this.b)[--n4], object)) {
                return n4;
            }
            if (--n3 < 0) {
                return -1;
            }
            if (n2 == 0) {
                n2 = this.l() - 1;
                continue;
            }
            --n2;
        }
        return -1;
    }

    public final int c(Object object) {
        int n2;
        int n3 = this.e;
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (this.d[n2] < 0) continue;
            Object[] objectArray = this.c;
            jse.b(objectArray);
            n3 = n2;
            if (!jse.i(objectArray[n2], object)) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public final void clear() {
        this.f();
        Object[] objectArray = new jsw(0, this.e - 1).a();
        while (objectArray.a) {
            int[] nArray = this.d;
            int n2 = objectArray.a();
            int n3 = nArray[n2];
            if (n3 < 0) continue;
            this.i[n3] = 0;
            nArray[n2] = -1;
        }
        jjj.z(this.b, 0, this.e);
        objectArray = this.c;
        if (objectArray != null) {
            jjj.z(objectArray, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        this.o();
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.b(object) >= 0;
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.c(object) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        this.f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        jpp jpp2 = a;
        jse.c(jpp2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return jpp2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof Map)) return false;
        if (this.g != (object = (Map)object).size()) return false;
        if (!this.h(object.entrySet())) return false;
        return bl2;
    }

    public final void f() {
        if (!this.h) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(int n2) {
        block8: {
            int n3;
            jjj.y(this.b, n2);
            Object[] objectArray = this.c;
            if (objectArray != null) {
                jjj.y(objectArray, n2);
            }
            int n4 = this.d[n2];
            int n5 = this.j;
            int n6 = jse.l(n5 + n5, this.l() >> 1);
            n5 = 0;
            int n7 = n4;
            do {
                int n8;
                block11: {
                    block10: {
                        int n9;
                        block9: {
                            n4 = n4 == 0 ? this.l() - 1 : --n4;
                            n3 = n5 + 1;
                            if (n3 > this.j) {
                                this.i[n7] = 0;
                                break block8;
                            }
                            int[] nArray = this.i;
                            n9 = nArray[n4];
                            if (n9 == 0) {
                                nArray[n7] = 0;
                                break block8;
                            }
                            if (n9 >= 0) break block9;
                            nArray[n7] = -1;
                            break block10;
                        }
                        Object[] objectArray2 = this.b;
                        int n10 = n9 - 1;
                        n8 = n7;
                        n5 = n3;
                        if ((this.m(objectArray2[n10]) - n4 & this.l() - 1) < n3) break block11;
                        this.i[n7] = n9;
                        this.d[n10] = n7;
                    }
                    n8 = n4;
                    n5 = 0;
                }
                n3 = n6 - 1;
                n7 = n8;
                n6 = n3;
            } while (n3 >= 0);
            this.i[n8] = -1;
        }
        this.d[n2] = -1;
        --this.g;
        this.o();
    }

    public final Object get(Object objectArray) {
        int n2 = this.b(objectArray);
        if (n2 < 0) {
            return null;
        }
        objectArray = this.c;
        jse.b(objectArray);
        return objectArray[n2];
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean h(Collection iterator) {
        jse.e(iterator, "m");
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (e2 != null) {
                boolean bl2 = this.i((Map.Entry)e2);
                if (bl2) continue;
            }
            return false;
        }
        return true;
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        jpl jpl2 = new jpl(this);
        int n2 = 0;
        while (jpl2.hasNext()) {
            int n3 = jpl2.b;
            Object object = jpl2.a;
            if (n3 < ((jpp)object).e) {
                jpl2.b = n3 + 1;
                jpl2.c = n3;
                object = ((jpp)object).b[n3];
                n3 = object != null ? object.hashCode() : 0;
                object = jpl2.a.c;
                jse.b(object);
                object = object[jpl2.c];
                int n4 = object != null ? object.hashCode() : 0;
                jpl2.b();
                n2 += n3 ^ n4;
                continue;
            }
            throw new NoSuchElementException();
        }
        return n2;
    }

    public final boolean i(Map.Entry entry) {
        jse.e(entry, "entry");
        int n2 = this.b(entry.getKey());
        if (n2 < 0) {
            return false;
        }
        Object[] objectArray = this.c;
        jse.b(objectArray);
        return jse.i(objectArray[n2], entry.getValue());
    }

    @Override
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object object) {
        this.f();
        int n2 = this.b(object);
        if (n2 < 0) {
            return false;
        }
        this.g(n2);
        return true;
    }

    public final Object[] k() {
        Object[] objectArray = this.c;
        if (objectArray != null) {
            return objectArray;
        }
        objectArray = new Object[this.d()];
        this.c = objectArray;
        return objectArray;
    }

    public final Object put(Object objectArray, Object object) {
        this.f();
        int n2 = this.a(objectArray);
        objectArray = this.k();
        if (n2 < 0) {
            n2 = -n2 - 1;
            Object object2 = objectArray[n2];
            objectArray[n2] = object;
            return object2;
        }
        objectArray[n2] = object;
        return null;
    }

    public final void putAll(Map iterator) {
        jse.e(iterator, "from");
        this.f();
        iterator = iterator.entrySet();
        if (!iterator.isEmpty()) {
            this.n(iterator.size());
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                int n2 = this.a(entry.getKey());
                Object[] objectArray = this.k();
                if (n2 >= 0) {
                    objectArray[n2] = entry.getValue();
                    continue;
                }
                n2 = -n2 - 1;
                Object object = objectArray[n2];
                if (jse.i(entry.getValue(), object)) continue;
                objectArray[n2] = entry.getValue();
            }
        }
    }

    public final Object remove(Object object) {
        this.f();
        int n2 = this.b(object);
        if (n2 < 0) {
            return null;
        }
        object = this.c;
        jse.b(object);
        object = object[n2];
        this.g(n2);
        return object;
    }

    @Override
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.g * 3 + 2);
        stringBuilder.append("{");
        jpl jpl2 = new jpl(this);
        int n2 = 0;
        while (jpl2.hasNext()) {
            if (n2 > 0) {
                stringBuilder.append(", ");
            }
            int n3 = jpl2.b;
            jpp jpp2 = jpl2.a;
            if (n3 < jpp2.e) {
                jpl2.b = n3 + 1;
                jpl2.c = n3;
                Object object = jpp2.b[n3];
                if (object == jpp2) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                stringBuilder.append('=');
                object = jpl2.a.c;
                jse.b(object);
                object = object[jpl2.c];
                if (object == jpl2.a) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                jpl2.b();
                ++n2;
                continue;
            }
            throw new NoSuchElementException();
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

