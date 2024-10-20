/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class pa {
    public int[] d;
    public Object[] e;
    public int f;

    public pa() {
        this(null);
    }

    public pa(int n2) {
        Object[] objectArray = n2 == 0 ? pd.a : new int[n2];
        this.d = objectArray;
        objectArray = n2 == 0 ? (Object[])pd.b : (Object[])new Object[n2 + n2];
        this.e = objectArray;
    }

    public /* synthetic */ pa(byte[] byArray) {
        this(0);
    }

    private final int a(Object object, int n2) {
        int n3;
        int n4 = this.f;
        if (n4 == 0) {
            return -1;
        }
        int n5 = pd.a(this.d, n4, n2);
        if (n5 < 0) {
            return n5;
        }
        if (jse.i(object, this.e[n5 + n5])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && this.d[n3] == n2; ++n3) {
            if (!jse.i(object, this.e[n3 + n3])) continue;
            return n3;
        }
        for (n4 = n5 - 1; n4 >= 0 && this.d[n4] == n2; --n4) {
            if (!jse.i(object, this.e[n4 + n4])) continue;
            return n4;
        }
        return ~n3;
    }

    private final int i() {
        int n2;
        int n3 = this.f;
        if (n3 == 0) {
            return -1;
        }
        int n4 = pd.a(this.d, n3, 0);
        if (n4 < 0) {
            return n4;
        }
        if (this.e[n4 + n4] == null) {
            return n4;
        }
        for (n2 = n4 + 1; n2 < n3 && this.d[n2] == 0; ++n2) {
            if (this.e[n2 + n2] != null) continue;
            return n2;
        }
        --n4;
        while (n4 >= 0 && this.d[n4] == 0) {
            if (this.e[n4 + n4] == null) {
                return n4;
            }
            --n4;
        }
        return ~n2;
    }

    public final int b(Object object) {
        int n2 = this.f;
        int n3 = n2 + n2;
        Object[] objectArray = this.e;
        if (object == null) {
            for (n2 = 1; n2 < n3; n2 += 2) {
                if (objectArray[n2] != null) continue;
                return n2 >> 1;
            }
        } else {
            for (n2 = 1; n2 < n3; n2 += 2) {
                if (!jse.i(object, objectArray[n2])) continue;
                return n2 >> 1;
            }
        }
        return -1;
    }

    public final int c(Object object) {
        int n2 = object == null ? this.i() : this.a(object, object.hashCode());
        return n2;
    }

    public final void clear() {
        if (this.f > 0) {
            this.d = pd.a;
            this.e = pd.b;
            this.f = 0;
        }
    }

    public final boolean containsKey(Object object) {
        return this.c(object) >= 0;
    }

    public final boolean containsValue(Object object) {
        return this.b(object) >= 0;
    }

    public final Object d(int n2) {
        if (n2 < 0 || n2 >= this.f) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        return this.e[n2 + n2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object e(int n2) {
        if (n2 < 0 || n2 >= this.f) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objectArray = this.e;
        int n3 = n2 + n2;
        Object object = objectArray[n3 + 1];
        int n4 = this.f;
        if (n4 <= 1) {
            this.clear();
            return object;
        } else {
            int n5 = n4 - 1;
            int[] nArray = this.d;
            int n6 = nArray.length;
            int n7 = 8;
            if (n6 > 8 && n4 < n6 / 3) {
                if (n4 > 8) {
                    n7 = n4 + (n4 >> 1);
                }
                int[] nArray2 = Arrays.copyOf(nArray, n7);
                jse.d(nArray2, "copyOf(...)");
                this.d = nArray2;
                Object[] objectArray2 = Arrays.copyOf(this.e, n7 + n7);
                jse.d(objectArray2, "copyOf(...)");
                this.e = objectArray2;
                if (n4 != this.f) throw new ConcurrentModificationException();
                if (n2 > 0) {
                    jns.W(nArray, this.d, 0, 0, n2);
                    jns.X(objectArray, this.e, 0, 0, n3);
                }
                if (n2 < n5) {
                    int[] nArray3 = this.d;
                    n7 = n2 + 1;
                    jns.W(nArray, nArray3, n2, n7, n4);
                    jns.X(objectArray, this.e, n3, n7 + n7, n4 + n4);
                }
            } else {
                if (n2 < n5) {
                    n7 = n2 + 1;
                    jns.W(nArray, nArray, n2, n7, n4);
                    Object[] objectArray3 = this.e;
                    jns.X(objectArray3, objectArray3, n3, n7 + n7, n4 + n4);
                }
                Object[] objectArray4 = this.e;
                n2 = n5 + n5;
                objectArray4[n2] = null;
                objectArray4[n2 + 1] = null;
            }
            if (n4 != this.f) throw new ConcurrentModificationException();
            this.f = n5;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        block16: {
            int n2;
            block17: {
                block14: {
                    if (this == object) {
                        return true;
                    }
                    if (!(object instanceof pa)) break block14;
                    int n3 = this.f;
                    object = (pa)object;
                    if (n3 != ((pa)object).f) return false;
                    for (int i2 = 0; i2 < n3; ++i2) {
                        Object object2;
                        Object object3;
                        block15: {
                            Object object4 = this.d(i2);
                            object3 = this.g(i2);
                            object2 = ((pa)object).get(object4);
                            if (object3 != null) break block15;
                            if (object2 != null) return false;
                            if (((pa)object).containsKey(object4)) continue;
                            return false;
                        }
                        if (jse.i(object3, object2)) continue;
                        return false;
                    }
                    return true;
                }
                if (!(object instanceof Map)) break block16;
                if (this.f == ((Map)object).size()) break block17;
                return false;
            }
            try {
                n2 = this.f;
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                return false;
            }
            for (int i3 = 0; i3 < n2; ++i3) {
                Object v2;
                Object object5;
                block18: {
                    Object object6 = this.d(i3);
                    object5 = this.g(i3);
                    Map map = (Map)object;
                    v2 = map.get(object6);
                    if (object5 != null) break block18;
                    if (v2 != null) return false;
                    if (map.containsKey(object6)) continue;
                    return false;
                }
                boolean bl2 = jse.i(object5, v2);
                if (bl2) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final Object f(int n2, Object object) {
        if (n2 < 0 || n2 >= this.f) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objectArray = this.e;
        n2 = n2 + n2 + 1;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public final Object g(int n2) {
        if (n2 < 0 || n2 >= this.f) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        return this.e[n2 + n2 + 1];
    }

    public final Object get(Object object) {
        int n2 = this.c(object);
        if (n2 >= 0) {
            return this.e[n2 + n2 + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object object, Object object2) {
        int n2 = this.c(object);
        if (n2 >= 0) {
            return this.e[n2 + n2 + 1];
        }
        return object2;
    }

    public final void h(int n2) {
        int n3 = this.f;
        Object[] objectArray = this.d;
        if (objectArray.length < n2) {
            objectArray = Arrays.copyOf(objectArray, n2);
            jse.d(objectArray, "copyOf(...)");
            this.d = objectArray;
            objectArray = Arrays.copyOf(this.e, n2 + n2);
            jse.d(objectArray, "copyOf(...)");
            this.e = objectArray;
        }
        if (this.f == n3) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int[] nArray = this.d;
        Object[] objectArray = this.e;
        int n2 = this.f;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            Object object = objectArray[n3];
            int n6 = nArray[n4];
            int n7 = object != null ? object.hashCode() : 0;
            n5 += n7 ^ n6;
            ++n4;
            n3 += 2;
        }
        return n5;
    }

    public final boolean isEmpty() {
        return this.f <= 0;
    }

    public final Object put(Object objectArray, Object object) {
        int n2 = this.f;
        int n3 = objectArray != null ? objectArray.hashCode() : 0;
        int n4 = objectArray != null ? this.a(objectArray, n3) : this.i();
        if (n4 >= 0) {
            n4 = n4 + n4 + 1;
            objectArray = this.e;
            Object object2 = objectArray[n4];
            objectArray[n4] = object;
            return object2;
        }
        int n5 = ~n4;
        Object[] objectArray2 = this.d;
        if (n2 >= objectArray2.length) {
            n4 = 8;
            if (n2 >= 8) {
                n4 = (n2 >> 1) + n2;
            } else if (n2 < 4) {
                n4 = 4;
            }
            objectArray2 = Arrays.copyOf(objectArray2, n4);
            jse.d(objectArray2, "copyOf(...)");
            this.d = objectArray2;
            objectArray2 = Arrays.copyOf(this.e, n4 + n4);
            jse.d(objectArray2, "copyOf(...)");
            this.e = objectArray2;
            if (n2 != this.f) {
                throw new ConcurrentModificationException();
            }
        }
        if (n5 < n2) {
            objectArray2 = this.d;
            n4 = n5 + 1;
            jns.W(objectArray2, objectArray2, n4, n5, n2);
            objectArray2 = this.e;
            int n6 = this.f;
            jns.X(objectArray2, objectArray2, n4 + n4, n5 + n5, n6 + n6);
        }
        if (n2 == (n4 = this.f) && n5 < (objectArray2 = this.d).length) {
            objectArray2[n5] = n3;
            objectArray2 = this.e;
            n3 = n5 + n5;
            objectArray2[n3] = (int)objectArray;
            objectArray2[n3 + 1] = (int)object;
            this.f = n4 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object object, Object object2) {
        Object object3 = this.get(object);
        if (object3 == null) {
            return this.put(object, object2);
        }
        return object3;
    }

    public final Object remove(Object object) {
        int n2 = this.c(object);
        if (n2 >= 0) {
            return this.e(n2);
        }
        return null;
    }

    public final boolean remove(Object object, Object object2) {
        int n2 = this.c(object);
        if (n2 >= 0 && jse.i(object2, this.g(n2))) {
            this.e(n2);
            return true;
        }
        return false;
    }

    public final Object replace(Object object, Object object2) {
        int n2 = this.c(object);
        if (n2 >= 0) {
            return this.f(n2, object2);
        }
        return null;
    }

    public final boolean replace(Object object, Object object2, Object object3) {
        int n2 = this.c(object);
        if (n2 >= 0 && jse.i(object2, this.g(n2))) {
            this.f(n2, object3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f;
    }

    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f * 28);
        stringBuilder.append('{');
        int n2 = this.f;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.d(i2)) != stringBuilder) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            object = this.g(i2);
            if (object != stringBuilder) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

