/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.b_0;
import j$.util.stream.w_0;
import j$.util.stream.x_0;
import j$.util.stream.y0_0;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/*
 * Renamed from j$.util.stream.v
 */
final class v_0
extends y0_0 {
    public final int b;
    final b_0 c;

    public /* synthetic */ v_0(b_0 b_02, B0 b0, int n2) {
        this.b = n2;
        this.c = b_02;
        super(b0);
    }

    @Override
    public final void accept(int n2) {
        switch (this.b) {
            default: {
                if (((IntPredicate)((x_0)this.c).l).test(n2)) {
                    this.a.accept(n2);
                }
                return;
            }
            case 0: 
        }
        Object r2 = ((IntFunction)((w_0)this.c).m).apply(n2);
        this.a.accept(r2);
    }

    @Override
    public void e(long l2) {
        switch (this.b) {
            default: {
                super.e(l2);
                return;
            }
            case 1: 
        }
        this.a.e(-1L);
    }
}

