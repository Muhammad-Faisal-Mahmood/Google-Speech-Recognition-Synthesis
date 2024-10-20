/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.L;
import j$.util.stream.c_0;
import java.util.concurrent.CountedCompleter;

/*
 * Renamed from j$.util.stream.h0
 */
abstract class h0_0
extends CountedCompleter {
    protected final L a;
    protected final int b;

    h0_0(L l2) {
        this.a = l2;
        this.b = 0;
    }

    h0_0(h0_0 h0_02, L l2, int n2) {
        super(h0_02);
        this.a = l2;
        this.b = n2;
    }

    abstract void a();

    abstract h0_0 b(int var1, int var2);

    @Override
    public final void compute() {
        h0_0 h0_02 = this;
        while (true) {
            int n2;
            if (h0_02.a.h() == 0) {
                h0_02.a();
                c_0.i(h0_02);
                return;
            }
            c_0.j(h0_02, h0_02.a.h() - 1);
            int n3 = 0;
            for (n2 = 0; n2 < h0_02.a.h() - 1; ++n2) {
                h0_0 h0_03 = h0_02.b(n2, h0_02.b + n3);
                n3 = (int)((long)n3 + h0_03.a.count());
                h0_03.fork();
            }
            h0_02 = h0_02.b(n2, h0_02.b + n3);
        }
    }
}

