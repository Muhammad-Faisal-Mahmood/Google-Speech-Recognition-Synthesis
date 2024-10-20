/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

public final class qa
extends pw {
    public int f = 0;
    final pz g;
    private qb[] h = new qb[128];
    private qb[] i = new qb[128];

    public qa(AmbientDelegate ambientDelegate) {
        super(ambientDelegate);
        this.g = new pz(this);
    }

    @Override
    public final void d(px object, pw pw2, boolean bl2) {
        object = pw2.a;
        if (object == null) {
            return;
        }
        pv pv2 = pw2.e;
        int n2 = pv2.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f2;
            int n3;
            Object object2 = pv2.d(i2);
            float f3 = pv2.b(i2);
            pz pz2 = this.g;
            pz2.a = object2;
            if (pz2.a.b) {
                boolean bl3 = true;
                for (n3 = 0; n3 < 9; ++n3) {
                    object2 = pz2.a.i;
                    f2 = (float)(object2[n3] + ((qb)object).i[n3] * f3);
                    object2[n3] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        pz2.a.i[n3] = 0.0f;
                        continue;
                    }
                    bl3 = false;
                }
                if (bl3) {
                    pz2.b.n(pz2.a);
                }
            } else {
                for (n3 = 0; n3 < 9; ++n3) {
                    f2 = ((qb)object).i[n3];
                    if (f2 != 0.0f) {
                        float f4;
                        f2 = f4 = f2 * f3;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f2 = 0.0f;
                        }
                        pz2.a.i[n3] = f2;
                        continue;
                    }
                    pz2.a.i[n3] = 0.0f;
                }
                this.m((qb)object2);
            }
            this.b += pw2.b * f3;
        }
        this.n((qb)object);
    }

    @Override
    public final boolean e() {
        return this.f == 0;
    }

    @Override
    public final qb k(boolean[] blArray) {
        int n2 = -1;
        for (int i2 = 0; i2 < this.f; ++i2) {
            int n3;
            block10: {
                block9: {
                    float f2;
                    float f3;
                    int n4;
                    pz pz2;
                    Object object;
                    block11: {
                        object = this.h;
                        qb qb2 = object[i2];
                        n3 = n2;
                        if (blArray[qb2.c]) break block10;
                        pz2 = this.g;
                        pz2.a = qb2;
                        if (n2 != -1) break block11;
                        for (n4 = 8; n4 >= 0 && !((f3 = pz2.a.i[n4]) > 0.0f); --n4) {
                            if (!(f3 < 0.0f)) {
                                continue;
                            }
                            break block9;
                        }
                        n3 = -1;
                        break block10;
                    }
                    object = object[n2];
                    while (true) {
                        n3 = n2;
                        if (n4 < 0) break block10;
                        f3 = pz2.a.i[n4];
                        f2 = object.i[n4];
                        if (f3 != f2) break;
                        --n4;
                    }
                    n3 = n2;
                    if (!(f3 < f2)) break block10;
                }
                n3 = i2;
            }
            n2 = n3;
        }
        if (n2 == -1) {
            return null;
        }
        return this.h[n2];
    }

    public final void m(qb qb2) {
        int n2 = this.f;
        qb[] qbArray = this.h;
        int n3 = qbArray.length;
        if (n2 + 1 > n3) {
            this.h = qbArray = Arrays.copyOf(qbArray, n3 + n3);
            n3 = qbArray.length;
            this.i = Arrays.copyOf(qbArray, n3 + n3);
        }
        qbArray = this.h;
        n2 = this.f;
        qbArray[n2] = qb2;
        this.f = n3 = n2 + 1;
        if (n3 > 1 && qbArray[n2].c > qb2.c) {
            int n4;
            n2 = 0;
            for (n3 = 0; n3 < (n4 = this.f); ++n3) {
                this.i[n3] = this.h[n3];
            }
            Arrays.sort(this.i, 0, n4, new py(0));
            for (n3 = n2; n3 < this.f; ++n3) {
                this.h[n3] = this.i[n3];
            }
        }
        qb2.b = true;
        qb2.a(this);
    }

    public final void n(qb qb2) {
        for (int i2 = 0; i2 < this.f; ++i2) {
            int n2;
            if (this.h[i2] != qb2) continue;
            while (i2 < (n2 = this.f - 1)) {
                qb[] qbArray = this.h;
                n2 = i2 + 1;
                qbArray[i2] = qbArray[n2];
                i2 = n2;
            }
            this.f = n2;
            qb2.b = false;
            return;
        }
    }

    @Override
    public final String toString() {
        CharSequence charSequence = new StringBuilder(" goal -> (");
        charSequence.append(this.b);
        charSequence.append(") : ");
        charSequence = charSequence.toString();
        for (int i2 = 0; i2 < this.f; ++i2) {
            Comparable comparable = this.h[i2];
            this.g.a = comparable;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append(this.g);
            ((StringBuilder)comparable).append(" ");
            charSequence = ((StringBuilder)comparable).toString();
        }
        return charSequence;
    }
}

