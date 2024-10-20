/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ox
implements Cloneable {
    public boolean a;
    public long[] b;
    public Object[] c;
    public int d;

    public ox() {
        int n2 = pd.e(10);
        this.b = new long[n2];
        this.c = new Object[n2];
    }

    public final int a() {
        if (this.a) {
            int n2 = this.d;
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object = objectArray[i2];
                int n4 = n3;
                if (object != oy.a) {
                    if (i2 != n3) {
                        lArray[n3] = lArray[i2];
                        objectArray[n3] = object;
                        objectArray[i2] = null;
                    }
                    n4 = n3 + 1;
                }
                n3 = n4;
            }
            this.a = false;
            this.d = n3;
        }
        return this.d;
    }

    public final long b(int n2) {
        if (n2 < 0 || n2 >= this.d) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int n3 = this.d;
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                Object object = objectArray[i2];
                int n5 = n4;
                if (object != oy.a) {
                    if (i2 != n4) {
                        lArray[n4] = lArray[i2];
                        objectArray[n4] = object;
                        objectArray[i2] = null;
                    }
                    n5 = n4 + 1;
                }
                n4 = n5;
            }
            this.a = false;
            this.d = n4;
        }
        return this.b[n2];
    }

    public final Object c(long l2) {
        Object object;
        int n2 = pd.b(this.b, this.d, l2);
        if (n2 >= 0 && (object = this.c[n2]) != oy.a) {
            return object;
        }
        return null;
    }

    public final Object d(int n2) {
        if (n2 < 0 || n2 >= this.d) {
            kl.p(a.af(n2, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int n3 = this.d;
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                Object object = objectArray[i2];
                int n5 = n4;
                if (object != oy.a) {
                    if (i2 != n4) {
                        lArray[n4] = lArray[i2];
                        objectArray[n4] = object;
                        objectArray[i2] = null;
                    }
                    n5 = n4 + 1;
                }
                n4 = n5;
            }
            this.a = false;
            this.d = n4;
        }
        return this.c[n2];
    }

    public final void e() {
        int n2 = this.d;
        Object[] objectArray = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void f(long l2, Object object) {
        int n2;
        Object[] objectArray;
        int n3 = pd.b(this.b, this.d, l2);
        if (n3 >= 0) {
            this.c[n3] = object;
            return;
        }
        int n4 = ~n3;
        int n5 = this.d;
        if (n4 < n5 && (objectArray = this.c)[n4] == oy.a) {
            this.b[n4] = l2;
            objectArray[n4] = object;
            return;
        }
        n3 = n4;
        if (this.a) {
            long[] lArray = this.b;
            n3 = n4;
            if (n5 >= lArray.length) {
                Object[] objectArray2 = this.c;
                n3 = 0;
                for (n4 = 0; n4 < n5; ++n4) {
                    objectArray = objectArray2[n4];
                    n2 = n3;
                    if (objectArray != oy.a) {
                        if (n4 != n3) {
                            lArray[n3] = lArray[n4];
                            objectArray2[n3] = objectArray;
                            objectArray2[n4] = null;
                        }
                        n2 = n3 + 1;
                    }
                    n3 = n2;
                }
                this.a = false;
                this.d = n3;
                n3 = ~pd.b(this.b, n3, l2);
            }
        }
        if ((n4 = this.d) >= (objectArray = (Object[])this.b).length) {
            n4 = pd.e(n4 + 1);
            objectArray = Arrays.copyOf((long[])objectArray, n4);
            jse.d(objectArray, "copyOf(...)");
            this.b = (long[])objectArray;
            objectArray = Arrays.copyOf(this.c, n4);
            jse.d(objectArray, "copyOf(...)");
            this.c = objectArray;
        }
        if ((n2 = this.d - n3) != 0) {
            objectArray = this.b;
            n4 = n3 + 1;
            jse.e(objectArray, "<this>");
            jse.e(objectArray, "destination");
            System.arraycopy(objectArray, n3, objectArray, n4, n2);
            objectArray = this.c;
            jns.X(objectArray, objectArray, n4, n3, this.d);
        }
        this.b[n3] = l2;
        this.c[n3] = object;
        ++this.d;
    }

    public final String toString() {
        Object object;
        if (this.a() <= 0) {
            object = "{}";
        } else {
            StringBuilder stringBuilder = new StringBuilder(this.d * 28);
            stringBuilder.append('{');
            int n2 = this.d;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(this.b(i2));
                stringBuilder.append('=');
                object = this.d(i2);
                if (object != stringBuilder) {
                    stringBuilder.append(object);
                    continue;
                }
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('}');
            object = stringBuilder.toString();
        }
        return object;
    }
}

