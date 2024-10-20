/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class hze {
    public static final hze a = new hze(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e = -1;
    private boolean f;

    public hze() {
        this(0, new int[8], new Object[8], true);
    }

    public hze(int n2, int[] nArray, Object[] objectArray, boolean bl2) {
        this.b = n2;
        this.c = nArray;
        this.d = objectArray;
        this.f = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a() {
        int n2 = this.e;
        if (n2 != -1) return n2;
        int n3 = 0;
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n4 = this.c[i2];
            n2 = hzo.a(n4);
            if ((n4 = hzo.b(n4)) != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 != 3) {
                            if (n4 != 5) throw new IllegalStateException(new hxm());
                            ((Integer)this.d[i2]).intValue();
                            n2 = hwd.au(n2);
                        } else {
                            n2 = hwd.Z(n2);
                            n2 = n2 + n2 + ((hze)this.d[i2]).a();
                        }
                    } else {
                        n2 = hwd.G(n2, (hvu)this.d[i2]);
                    }
                } else {
                    ((Long)this.d[i2]).longValue();
                    n2 = hwd.av(n2);
                }
            } else {
                n2 = hwd.ac(n2, (Long)this.d[i2]);
            }
            n3 += n2;
        }
        this.e = n3;
        return n3;
    }

    final void b() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c(int n2) {
        int[] nArray = this.c;
        if (n2 > nArray.length) {
            int n3 = this.b;
            int n4 = n3 + n3 / 2;
            n3 = n2;
            if (n4 >= n2) {
                n3 = n4;
            }
            n2 = n3;
            if (n3 < 8) {
                n2 = 8;
            }
            this.c = Arrays.copyOf(nArray, n2);
            this.d = Arrays.copyOf(this.d, n2);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int n2, Object object) {
        this.b();
        this.c(this.b + 1);
        int[] nArray = this.c;
        int n3 = this.b;
        nArray[n3] = n2;
        this.d[n3] = object;
        this.b = n3 + 1;
    }

    public final boolean equals(Object objectArray) {
        block8: {
            if (this == objectArray) {
                return true;
            }
            if (objectArray == null) {
                return false;
            }
            if (!(objectArray instanceof hze)) {
                return false;
            }
            objectArray = (hze)objectArray;
            int n2 = this.b;
            if (n2 == objectArray.b) {
                int n3;
                Object[] objectArray2 = this.c;
                int[] nArray = objectArray.c;
                for (n3 = 0; n3 < n2; ++n3) {
                    if (objectArray2[n3] == nArray[n3]) {
                        continue;
                    }
                    break block8;
                }
                objectArray2 = this.d;
                objectArray = objectArray.d;
                n2 = this.b;
                for (n3 = 0; n3 < n2; ++n3) {
                    if (objectArray2[n3].equals(objectArray[n3])) {
                        continue;
                    }
                    break block8;
                }
                return true;
            }
        }
        return false;
    }

    public final void f(dlm dlm2) {
        if (this.b != 0) {
            for (int i2 = 0; i2 < this.b; ++i2) {
                int n2 = this.c[i2];
                Object object = this.d[i2];
                int n3 = hzo.b(n2);
                n2 = hzo.a(n2);
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 == 5) {
                                    dlm2.x(n2, (Integer)object);
                                    continue;
                                }
                                throw new RuntimeException(new hxm());
                            }
                            ((hwd)dlm2.a).A(n2, 3);
                            ((hze)object).f(dlm2);
                            ((hwd)dlm2.a).A(n2, 4);
                            continue;
                        }
                        dlm2.u(n2, (hvu)object);
                        continue;
                    }
                    dlm2.y(n2, (Long)object);
                    continue;
                }
                dlm2.C(n2, (Long)object);
            }
        }
    }

    public final int hashCode() {
        int n2;
        int n3 = this.b;
        Object[] objectArray = this.c;
        int n4 = 0;
        int n5 = 17;
        int n6 = 17;
        for (n2 = 0; n2 < n3; ++n2) {
            n6 = n6 * 31 + objectArray[n2];
        }
        objectArray = this.d;
        int n7 = this.b;
        n2 = n5;
        while (n4 < n7) {
            n2 = n2 * 31 + objectArray[n4].hashCode();
            ++n4;
        }
        return ((n3 + 527) * 31 + n6) * 31 + n2;
    }
}

