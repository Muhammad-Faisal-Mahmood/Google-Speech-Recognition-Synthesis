/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aok
implements aou {
    public final aop a;
    public final Object b;
    private final int c;

    public /* synthetic */ aok(aop aop2, Object object, int n2) {
        this.c = n2;
        this.a = aop2;
        this.b = object;
    }

    @Override
    public final List a(int n2, aex aex2, int[] nArray) {
        int n3 = this.c;
        n2 = 0;
        int n4 = 0;
        if (n3 != 0) {
            aop aop2 = this.a;
            if (aop2.a != Integer.MAX_VALUE && aop2.b != Integer.MAX_VALUE) {
                n2 = 0;
                while (true) {
                    n3 = aex2.a;
                    if (n2 > 0) break;
                    n3 = aex2.a((int)n2).v;
                    ++n2;
                }
            }
            gzs gzs2 = new gzs();
            n2 = n4;
            while (true) {
                n4 = aex2.a;
                if (n2 > 0) break;
                aex2.a(n2).a();
                gzs2.h(new aow(0, aex2, n2, aop2, nArray[n2], true));
                ++n2;
            }
            return gzs2.g();
        }
        gzs gzs3 = new gzs();
        while (true) {
            n4 = aex2.a;
            if (n2 > 0) break;
            Object object = this.b;
            gzs3.h(new aot(0, aex2, n2, this.a, nArray[n2], (String)object));
            ++n2;
        }
        return gzs3.g();
    }
}

