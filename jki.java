/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class jki
implements jfu {
    final iuy a;
    private final int b;

    public jki(iuy iuy2, int n2) {
        this.b = n2;
        this.a = iuy2;
    }

    @Override
    public final jco a() {
        if (this.b != 0) {
            jav jav2 = (jav)this.a;
            boolean bl2 = jav2.e;
            int n2 = jav2.f;
            boolean bl3 = jav2.g;
            int n3 = jav2.h;
            jau jau2 = new jau(jav2.b, bl2, n2, bl3, n3);
            dml dml2 = jav2.i;
            return new jat(jau2, (Executor)hom.a, jav2.a, jav2.d, dml2.C());
        }
        jkk jkk2 = (jkk)this.a;
        return new jkj(jkk2.d, jkk2.e, jkk2.k(), jkk2.f, jkk2.h);
    }
}

