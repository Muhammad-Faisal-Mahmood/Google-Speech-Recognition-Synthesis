/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;
import java.util.Objects;

public final class pv {
    int a = 0;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    protected final AmbientDelegate f;
    private final pw g;
    private int h = 8;
    private int i = -1;
    private boolean j = false;

    public pv(pw pw2, AmbientDelegate ambientDelegate) {
        this.g = pw2;
        this.f = ambientDelegate;
    }

    public final float a(qb qb2) {
        int n2 = this.e;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            if (this.b[n2] == qb2.c) {
                return this.d[n2];
            }
            n2 = this.c[n2];
        }
        return 0.0f;
    }

    public final float b(int n2) {
        int n3 = this.e;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                return this.d[n3];
            }
            n3 = this.c[n3];
        }
        return 0.0f;
    }

    public final float c(qb qb2, boolean bl2) {
        int n2 = this.e;
        if (n2 != -1) {
            int n3 = -1;
            for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
                if (this.b[n2] == qb2.c) {
                    if (n2 == this.e) {
                        this.e = this.c[n2];
                    } else {
                        int[] nArray = this.c;
                        nArray[n3] = nArray[n2];
                    }
                    if (bl2) {
                        qb2.b(this.g);
                    }
                    --qb2.l;
                    --this.a;
                    this.b[n2] = -1;
                    if (this.j) {
                        this.i = n2;
                    }
                    return this.d[n2];
                }
                int n4 = this.c[n2];
                n3 = n2;
                n2 = n4;
            }
        }
        return 0.0f;
    }

    public final qb d(int n2) {
        int n3 = this.e;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                Object object = this.f.a;
                n2 = this.b[n3];
                return ((qb[])object)[n2];
            }
            n3 = this.c[n3];
        }
        return null;
    }

    public final void e(qb qb2, float f2, boolean bl2) {
        block27: {
            if (!(f2 > -0.001f) || !(f2 < 0.001f)) {
                int n2 = this.e;
                if (n2 == -1) {
                    this.e = 0;
                    this.d[0] = f2;
                    this.b[0] = qb2.c;
                    this.c[0] = -1;
                    ++qb2.l;
                    qb2.a(this.g);
                    ++this.a;
                    if (!this.j) {
                        this.i = n2 = this.i + 1;
                        int n3 = this.b.length;
                        if (n2 >= n3) {
                            this.j = true;
                            this.i = n3 - 1;
                            return;
                        }
                    }
                } else {
                    int[] nArray;
                    int n4;
                    int n5;
                    int n6 = -1;
                    for (n5 = 0; n2 != -1 && n5 < this.a; ++n5) {
                        n4 = this.b[n2];
                        int n7 = qb2.c;
                        if (n4 == n7) {
                            float f3;
                            Object[] objectArray = this.d;
                            f2 = f3 = objectArray[n2] + f2;
                            if (f3 > -0.001f) {
                                f2 = f3;
                                if (f3 < 0.001f) {
                                    f2 = 0.0f;
                                }
                            }
                            objectArray[n2] = f2;
                            if (f2 == 0.0f) {
                                if (n2 == this.e) {
                                    this.e = this.c[n2];
                                } else {
                                    objectArray = this.c;
                                    objectArray[n6] = objectArray[n2];
                                }
                                if (bl2) {
                                    qb2.b(this.g);
                                }
                                if (this.j) {
                                    this.i = n2;
                                }
                                --qb2.l;
                                --this.a;
                                return;
                            }
                            break block27;
                        }
                        if (n4 < n7) {
                            n6 = n2;
                        }
                        n2 = this.c[n2];
                    }
                    n5 = this.i;
                    if (this.j) {
                        nArray = this.b;
                        n2 = n5;
                        if (nArray[n5] != -1) {
                            n2 = nArray.length;
                        }
                    } else {
                        n2 = n5 + 1;
                    }
                    n4 = this.b.length;
                    n5 = n2;
                    if (n2 >= n4) {
                        n5 = n2;
                        if (this.a < n4) {
                            n4 = 0;
                            while (true) {
                                nArray = this.b;
                                n5 = n2;
                                if (n4 >= nArray.length) break;
                                if (nArray[n4] == -1) {
                                    n5 = n4;
                                    break;
                                }
                                ++n4;
                            }
                        }
                    }
                    n4 = this.b.length;
                    n2 = n5;
                    if (n5 >= n4) {
                        n2 = this.h;
                        n2 += n2;
                        this.h = n2;
                        this.j = false;
                        this.i = n4 - 1;
                        this.d = Arrays.copyOf(this.d, n2);
                        this.b = Arrays.copyOf(this.b, this.h);
                        this.c = Arrays.copyOf(this.c, this.h);
                        n2 = n4;
                    }
                    this.b[n2] = qb2.c;
                    this.d[n2] = f2;
                    if (n6 != -1) {
                        nArray = this.c;
                        nArray[n2] = nArray[n6];
                        nArray[n6] = n2;
                    } else {
                        this.c[n2] = this.e;
                        this.e = n2;
                    }
                    ++qb2.l;
                    qb2.a(this.g);
                    ++this.a;
                    if (!this.j) {
                        ++this.i;
                    }
                    if ((n5 = this.i) >= (n2 = this.b.length)) {
                        this.j = true;
                        this.i = n2 - 1;
                    }
                }
            }
        }
    }

    public final void f() {
        int n2 = this.e;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            Object object = this.f.a;
            int n3 = this.b[n2];
            if ((object = ((qb[])object)[n3]) != null) {
                ((qb)object).b(this.g);
            }
            n2 = this.c[n2];
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(qb qb2, float f2) {
        if (f2 == 0.0f) {
            this.c(qb2, true);
            return;
        }
        int n2 = this.e;
        if (n2 == -1) {
            this.e = 0;
            this.d[0] = f2;
            this.b[0] = qb2.c;
            this.c[0] = -1;
            ++qb2.l;
            qb2.a(this.g);
            ++this.a;
            if (!this.j) {
                this.i = n2 = this.i + 1;
                int n3 = this.b.length;
                if (n2 >= n3) {
                    this.j = true;
                    this.i = n3 - 1;
                    return;
                }
            }
        } else {
            int[] nArray;
            int n4;
            int n5;
            int n6 = -1;
            for (n5 = 0; n2 != -1 && n5 < this.a; ++n5) {
                n4 = this.b[n2];
                int n7 = qb2.c;
                if (n4 == n7) {
                    this.d[n2] = f2;
                    return;
                }
                if (n4 < n7) {
                    n6 = n2;
                }
                n2 = this.c[n2];
            }
            n5 = this.i;
            if (this.j) {
                nArray = this.b;
                n2 = n5;
                if (nArray[n5] != -1) {
                    n2 = nArray.length;
                }
            } else {
                n2 = n5 + 1;
            }
            n4 = this.b.length;
            n5 = n2;
            if (n2 >= n4) {
                n5 = n2;
                if (this.a < n4) {
                    n4 = 0;
                    while (true) {
                        nArray = this.b;
                        n5 = n2;
                        if (n4 >= nArray.length) break;
                        if (nArray[n4] == -1) {
                            n5 = n4;
                            break;
                        }
                        ++n4;
                    }
                }
            }
            n4 = this.b.length;
            n2 = n5;
            if (n5 >= n4) {
                n2 = this.h;
                n2 += n2;
                this.h = n2;
                this.j = false;
                this.i = n4 - 1;
                this.d = Arrays.copyOf(this.d, n2);
                this.b = Arrays.copyOf(this.b, this.h);
                this.c = Arrays.copyOf(this.c, this.h);
                n2 = n4;
            }
            this.b[n2] = qb2.c;
            this.d[n2] = f2;
            if (n6 != -1) {
                nArray = this.c;
                nArray[n2] = nArray[n6];
                nArray[n6] = n2;
            } else {
                this.c[n2] = this.e;
                this.e = n2;
            }
            ++qb2.l;
            qb2.a(this.g);
            this.a = n5 = this.a + 1;
            if (!this.j) {
                ++this.i;
            }
            if (n5 >= (n2 = this.b.length)) {
                this.j = true;
            }
            if (this.i >= n2) {
                this.j = true;
                this.i = n2 - 1;
            }
        }
    }

    public final String toString() {
        int n2 = this.e;
        CharSequence charSequence = "";
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            Object object = ((String)charSequence).concat(" -> ");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(this.d[n2]);
            ((StringBuilder)charSequence).append(" : ");
            charSequence = ((StringBuilder)charSequence).toString();
            object = this.f.a;
            int n3 = this.b[n2];
            object = ((qb[])object)[n3];
            Objects.toString(object);
            charSequence = ((String)charSequence).concat(String.valueOf(object));
            n2 = this.c[n2];
        }
        return charSequence;
    }
}

