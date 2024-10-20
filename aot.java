/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class aot
extends aov
implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    public aot(int n2, aex object, int n3, aop aop2, int n4, String string) {
        int n5;
        block4: {
            n5 = 0;
            super(0, (aex)object, n3);
            this.f = vy.l(n4, false);
            n2 = this.d.e;
            this.g = false;
            this.h = false;
            object = aop2.h.isEmpty() ? gzx.q("") : aop2.h;
            for (n2 = 0; n2 < ((hct)object).c; ++n2) {
                n3 = aox.a(this.d, (String)object.get(n2), false);
                if (n3 <= 0) {
                    continue;
                }
                break block4;
            }
            n2 = Integer.MAX_VALUE;
            n3 = 0;
        }
        this.i = n2;
        this.j = n3;
        n2 = this.d.f;
        this.k = n2 = aox.b(0, aop2.i);
        int n6 = this.d.f;
        this.m = false;
        boolean bl2 = aox.c(string) == null;
        this.l = n6 = aox.a(this.d, string, bl2);
        n2 = !(n3 > 0 || aop2.h.isEmpty() && n2 > 0 || this.g || this.h && n6 > 0) ? 0 : 1;
        n3 = n5;
        if (vy.l(n4, aop2.q)) {
            n3 = n5;
            if (n2 != 0) {
                n3 = 1;
            }
        }
        this.e = n3;
    }

    public final int a(aot aot2) {
        gyv gyv2 = gyv.b.e(this.f, aot2.f).d(this.i, aot2.i, hde.a).b(this.j, aot2.j).b(this.k, aot2.k).e(this.g, aot2.g);
        boolean bl2 = this.h;
        boolean bl3 = aot2.h;
        Object object = this.j == 0 ? hcm.a : hde.a;
        gyv2 = gyv2.d(bl2, bl3, (Comparator)object).b(this.l, aot2.l);
        object = gyv2;
        if (this.k == 0) {
            object = gyv2.f(this.m, aot2.m);
        }
        return ((gyv)object).a();
    }

    @Override
    public final int b() {
        return this.e;
    }
}

