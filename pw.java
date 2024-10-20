/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;
import java.util.Objects;

public class pw {
    qb a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public pv e;

    public pw() {
    }

    public pw(AmbientDelegate ambientDelegate) {
        this.e = new pv(this, ambientDelegate);
    }

    public static final boolean l(qb qb2) {
        return qb2.l <= 1;
    }

    public final qb a(boolean[] blArray, qb qb2) {
        int n2 = this.e.a;
        qb qb3 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f3;
            qb qb4;
            block5: {
                qb qb5;
                float f4;
                block7: {
                    block6: {
                        f4 = this.e.b(i2);
                        qb4 = qb3;
                        f3 = f2;
                        if (!(f4 < 0.0f)) break block5;
                        qb5 = this.e.d(i2);
                        if (blArray == null) break block6;
                        qb4 = qb3;
                        f3 = f2;
                        if (blArray[qb5.c]) break block5;
                    }
                    qb4 = qb3;
                    f3 = f2;
                    if (qb5 == qb2) break block5;
                    int n3 = qb5.n;
                    if (n3 == 3) break block7;
                    qb4 = qb3;
                    f3 = f2;
                    if (n3 != 4) break block5;
                }
                qb4 = qb3;
                f3 = f2;
                if (f4 < f2) {
                    f3 = f4;
                    qb4 = qb5;
                }
            }
            qb3 = qb4;
            f2 = f3;
        }
        return qb3;
    }

    final void b(qb object) {
        Object object2 = this.a;
        if (object2 != null) {
            this.e.g((qb)object2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f2 = -this.e.c((qb)object, true);
        this.a = object;
        if (f2 != 1.0f) {
            this.b /= f2;
            object = this.e;
            int n2 = ((pv)object).e;
            for (int i2 = 0; n2 != -1 && i2 < ((pv)object).a; ++i2) {
                object2 = ((pv)object).d;
                object2[n2] = object2[n2] / f2;
                n2 = ((pv)object).c[n2];
            }
        }
    }

    public final void c(px px2, qb qb2, boolean bl2) {
        if (qb2 != null && qb2.g) {
            float f2 = this.e.a(qb2);
            this.b += qb2.f * f2;
            this.e.c(qb2, bl2);
            if (bl2) {
                qb2.b(this);
            }
            if (this.e.a == 0) {
                this.d = true;
                px2.c = true;
            }
        }
    }

    public void d(px px2, pw pw2, boolean bl2) {
        pv pv2 = this.e;
        float f2 = pv2.a(pw2.a);
        pv2.c(pw2.a, bl2);
        pv pv3 = pw2.e;
        int n2 = pv3.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            qb qb2 = pv3.d(i2);
            pv2.e(qb2, pv3.a(qb2) * f2, bl2);
        }
        this.b += pw2.b * f2;
        if (bl2) {
            pw2.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            px2.c = true;
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(px px2, int n2) {
        this.e.g(px2.p(n2), 1.0f);
        this.e.g(px2.p(n2), -1.0f);
    }

    public final void g(qb qb2, qb qb3, qb qb4, qb qb5, float f2) {
        this.e.g(qb2, -1.0f);
        this.e.g(qb3, 1.0f);
        this.e.g(qb4, f2);
        f2 = -f2;
        this.e.g(qb5, f2);
    }

    public final void h(qb qb2, qb qb3, qb qb4, int n2) {
        if (n2 != 0) {
            int n3;
            if (n2 < 0) {
                n3 = -n2;
                n2 = 1;
            } else {
                int n4 = 0;
                n3 = n2;
                n2 = n4;
            }
            this.b = n3;
            if (n2 != 0) {
                this.e.g(qb2, 1.0f);
                this.e.g(qb3, -1.0f);
                this.e.g(qb4, -1.0f);
                return;
            }
        }
        this.e.g(qb2, -1.0f);
        this.e.g(qb3, 1.0f);
        this.e.g(qb4, 1.0f);
    }

    public final void i(qb qb2, qb qb3, qb qb4, int n2) {
        if (n2 != 0) {
            boolean bl2;
            if (n2 < 0) {
                n2 = -n2;
                bl2 = true;
            } else {
                bl2 = false;
            }
            this.b = n2;
            if (bl2) {
                this.e.g(qb2, 1.0f);
                this.e.g(qb3, -1.0f);
                this.e.g(qb4, 1.0f);
                return;
            }
        }
        this.e.g(qb2, -1.0f);
        this.e.g(qb3, 1.0f);
        this.e.g(qb4, -1.0f);
    }

    public final void j(qb qb2, qb qb3, qb qb4, qb qb5, float f2) {
        this.e.g(qb4, 0.5f);
        this.e.g(qb5, 0.5f);
        this.e.g(qb2, -0.5f);
        this.e.g(qb3, -0.5f);
        this.b = -f2;
    }

    public qb k(boolean[] blArray) {
        return this.a(blArray, null);
    }

    public String toString() {
        boolean bl2;
        Object object;
        Object object2 = this.a;
        if (object2 == null) {
            object2 = "0";
        } else {
            Objects.toString(object2);
            object2 = "".concat(String.valueOf(object2));
        }
        float f2 = this.b;
        object2 = ((String)object2).concat(" = ");
        int n2 = 0;
        if (f2 != 0.0f) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(this.b);
            object2 = ((StringBuilder)object).toString();
            bl2 = true;
        } else {
            bl2 = false;
        }
        int n3 = this.e.a;
        while (n2 < n3) {
            Object object3 = this.e.d(n2);
            object = object2;
            boolean bl3 = bl2;
            if (object3 != null) {
                float f3 = this.e.b(n2);
                float f4 = f3 - 0.0f;
                float f5 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                object = object2;
                bl3 = bl2;
                if (f5 != false) {
                    object3 = ((qb)object3).toString();
                    if (!bl2) {
                        object = object2;
                        f2 = f3;
                        if (f3 < 0.0f) {
                            f2 = -f3;
                            object = ((String)object2).concat("- ");
                        }
                    } else {
                        if (f5 > 0) {
                            object = " + ";
                            f2 = f3;
                        } else {
                            f2 = -f3;
                            object = " - ";
                        }
                        object = ((String)object2).concat((String)object);
                    }
                    if (f2 == 1.0f) {
                        object2 = ((String)object).concat((String)object3);
                    } else {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append(f2);
                        ((StringBuilder)object2).append(" ");
                        ((StringBuilder)object2).append((String)object3);
                        object2 = ((StringBuilder)object2).toString();
                    }
                    bl3 = true;
                    object = object2;
                }
            }
            ++n2;
            object2 = object;
            bl2 = bl3;
        }
        object = object2;
        if (!bl2) {
            object = ((String)object2).concat("0.0");
        }
        return object;
    }
}

