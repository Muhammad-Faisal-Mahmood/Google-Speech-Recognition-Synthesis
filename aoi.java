/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aoi
implements aou {
    public final aop a;

    public /* synthetic */ aoi(aop aop2) {
        this.a = aop2;
    }

    @Override
    public final List a(int n2, aex aex2, int[] nArray) {
        gzs gzs2 = new gzs();
        n2 = 0;
        while (true) {
            int n3 = aex2.a;
            if (n2 > 0) break;
            gzs2.h(new aom(0, aex2, n2, this.a, nArray[n2]));
            ++n2;
        }
        return gzs2.g();
    }
}

