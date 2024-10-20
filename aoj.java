/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aoj
implements aou {
    public final aox a;
    public final aop b;
    public final boolean c;
    public final int[] d;

    public /* synthetic */ aoj(aox aox2, aop aop2, boolean bl2, int[] nArray) {
        this.a = aox2;
        this.b = aop2;
        this.c = bl2;
        this.d = nArray;
    }

    @Override
    public final List a(int n2, aex aex2, int[] nArray) {
        cyl cyl2 = new cyl(this.a, 1);
        gzs gzs2 = new gzs();
        n2 = 0;
        while (true) {
            int n3 = aex2.a;
            if (n2 > 0) break;
            boolean bl2 = this.c;
            gzs2.h(new aol(0, aex2, n2, this.b, nArray[n2], bl2, cyl2));
            ++n2;
        }
        return gzs2.g();
    }
}

