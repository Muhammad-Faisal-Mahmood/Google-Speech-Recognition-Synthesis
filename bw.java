/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class bw
implements bv {
    final int a;
    final by b;

    public bw(by by2, int n2) {
        this.b = by2;
        this.a = n2;
    }

    @Override
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        int n2 = this.a;
        return this.b.ad(arrayList, arrayList2, n2, 1);
    }
}

