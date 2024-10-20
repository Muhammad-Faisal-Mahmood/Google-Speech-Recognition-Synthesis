/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;
import java.util.Objects;

public final class g {
    public int a = 0;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;
    public final AmbientDelegate h;
    private final h i;
    private int j = 8;

    public g(h h2, AmbientDelegate ambientDelegate) {
        this.i = h2;
        this.h = ambientDelegate;
    }

    public final float a(k k2) {
        int n2 = this.e;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            if (this.b[n2] == k2.a) {
                return this.d[n2];
            }
            n2 = this.c[n2];
        }
        return 0.0f;
    }

    final float b(int n2) {
        int n3 = this.e;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                return this.d[n3];
            }
            n3 = this.c[n3];
        }
        return 0.0f;
    }

    public final float c(k object) {
        int n2 = this.e;
        if (n2 != -1) {
            int n3 = -1;
            for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
                int n4 = this.b[n2];
                if (n4 == ((k)object).a) {
                    if (n2 == this.e) {
                        this.e = this.c[n2];
                    } else {
                        object = this.c;
                        object[n3] = object[n2];
                    }
                    ((k[])this.h.a)[n4].a(this.i);
                    --this.a;
                    this.b[n2] = -1;
                    if (this.g) {
                        this.f = n2;
                    }
                    return this.d[n2];
                }
                n4 = this.c[n2];
                n3 = n2;
                n2 = n4;
            }
        }
        return 0.0f;
    }

    final k d(int n2) {
        int n3 = this.e;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                Object object = this.h.a;
                n2 = this.b[n3];
                return ((k[])object)[n2];
            }
            n3 = this.c[n3];
        }
        return null;
    }

    public final void e(k object, float object2) {
        block23: {
            if (object2 != 0.0f) {
                int n2 = this.e;
                if (n2 == -1) {
                    this.e = 0;
                    this.d[0] = object2;
                    this.b[0] = ((k)object).a;
                    this.c[0] = -1;
                    ++this.a;
                    if (!this.g) {
                        ++this.f;
                        return;
                    }
                } else {
                    int[] nArray;
                    int n3;
                    int n4;
                    int n5 = -1;
                    for (n4 = 0; n2 != -1 && n4 < this.a; ++n4) {
                        int n6 = this.b[n2];
                        n3 = ((k)object).a;
                        if (n6 == n3) {
                            object = this.d;
                            object2 = object[n2] + object2;
                            object[n2] = object2;
                            if (object2 == 0.0f) {
                                if (n2 == this.e) {
                                    this.e = this.c[n2];
                                } else {
                                    object = this.c;
                                    object[n5] = object[n2];
                                }
                                ((k[])this.h.a)[n6].a(this.i);
                                if (this.g) {
                                    this.f = n2;
                                }
                                --this.a;
                                return;
                            }
                            break block23;
                        }
                        if (n6 < n3) {
                            n5 = n2;
                        }
                        n2 = this.c[n2];
                    }
                    n4 = this.f;
                    if (this.g) {
                        nArray = this.b;
                        n2 = n4;
                        if (nArray[n4] != -1) {
                            n2 = nArray.length;
                        }
                    } else {
                        n2 = n4 + 1;
                    }
                    n3 = this.b.length;
                    n4 = n2;
                    if (n2 >= n3) {
                        n4 = n2;
                        if (this.a < n3) {
                            n3 = 0;
                            while (true) {
                                nArray = this.b;
                                n4 = n2;
                                if (n3 >= nArray.length) break;
                                if (nArray[n3] == -1) {
                                    n4 = n3;
                                    break;
                                }
                                ++n3;
                            }
                        }
                    }
                    n3 = this.b.length;
                    n2 = n4;
                    if (n4 >= n3) {
                        n2 = this.j;
                        n2 += n2;
                        this.j = n2;
                        this.g = false;
                        this.f = n3 - 1;
                        this.d = Arrays.copyOf(this.d, n2);
                        this.b = Arrays.copyOf(this.b, this.j);
                        this.c = Arrays.copyOf(this.c, this.j);
                        n2 = n3;
                    }
                    nArray = this.b;
                    nArray[n2] = ((k)object).a;
                    this.d[n2] = object2;
                    if (n5 != -1) {
                        object = this.c;
                        object[n2] = object[n5];
                        object[n5] = n2;
                    } else {
                        this.c[n2] = this.e;
                        this.e = n2;
                    }
                    ++this.a;
                    if (!this.g) {
                        ++this.f;
                    }
                    if ((n4 = this.f) >= (n2 = nArray.length)) {
                        this.g = true;
                        this.f = n2 - 1;
                    }
                }
            }
        }
    }

    public final void f(k object, float f2) {
        if (f2 == 0.0f) {
            this.c((k)object);
            return;
        }
        int n2 = this.e;
        if (n2 == -1) {
            this.e = 0;
            this.d[0] = f2;
            this.b[0] = ((k)object).a;
            this.c[0] = -1;
            ++this.a;
            if (!this.g) {
                ++this.f;
                return;
            }
        } else {
            int[] nArray;
            int n3;
            int n4;
            int n5 = -1;
            for (n4 = 0; n2 != -1 && n4 < this.a; ++n4) {
                int n6 = this.b[n2];
                n3 = ((k)object).a;
                if (n6 == n3) {
                    this.d[n2] = f2;
                    return;
                }
                if (n6 < n3) {
                    n5 = n2;
                }
                n2 = this.c[n2];
            }
            n4 = this.f;
            if (this.g) {
                nArray = this.b;
                n2 = n4;
                if (nArray[n4] != -1) {
                    n2 = nArray.length;
                }
            } else {
                n2 = n4 + 1;
            }
            n3 = this.b.length;
            n4 = n2;
            if (n2 >= n3) {
                n4 = n2;
                if (this.a < n3) {
                    n3 = 0;
                    while (true) {
                        nArray = this.b;
                        n4 = n2;
                        if (n3 >= nArray.length) break;
                        if (nArray[n3] == -1) {
                            n4 = n3;
                            break;
                        }
                        ++n3;
                    }
                }
            }
            n3 = this.b.length;
            n2 = n4;
            if (n4 >= n3) {
                n2 = this.j;
                n2 += n2;
                this.j = n2;
                this.g = false;
                this.f = n3 - 1;
                this.d = Arrays.copyOf(this.d, n2);
                this.b = Arrays.copyOf(this.b, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                n2 = n3;
            }
            nArray = this.b;
            nArray[n2] = ((k)object).a;
            this.d[n2] = f2;
            if (n5 != -1) {
                object = this.c;
                object[n2] = object[n5];
                object[n5] = n2;
            } else {
                this.c[n2] = this.e;
                this.e = n2;
            }
            this.a = n2 = this.a + 1;
            if (!this.g) {
                ++this.f;
            }
            if (n2 >= nArray.length) {
                this.g = true;
            }
        }
    }

    final void g(h h2, h h3) {
        int n2 = this.e;
        while (true) {
            for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
                int n3 = this.b[n2];
                Object object = h3.a;
                if (n3 == ((k)object).a) {
                    float f2 = this.d[n2];
                    this.c((k)object);
                    g g2 = h3.d;
                    i2 = g2.e;
                    for (n2 = 0; i2 != -1 && n2 < g2.a; ++n2) {
                        object = this.h.a;
                        n3 = g2.b[i2];
                        this.e(((k[])object)[n3], g2.d[i2] * f2);
                        i2 = g2.c[i2];
                    }
                    h2.b += h3.b * f2;
                    h3.a.a(h2);
                    n2 = this.e;
                    continue;
                }
                n2 = this.c[n2];
            }
            break;
        }
    }

    public final String toString() {
        int n2 = this.e;
        String string = "";
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            string = string.concat(" -> ");
            Object object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(this.d[n2]);
            ((StringBuilder)object).append(" : ");
            string = ((StringBuilder)object).toString();
            object = this.h.a;
            int n3 = this.b[n2];
            object = ((k[])object)[n3];
            Objects.toString(object);
            string = string.concat(String.valueOf(object));
            n2 = this.c[n2];
        }
        return string;
    }
}

