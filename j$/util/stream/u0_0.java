/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.k_0;
import j$.util.stream.l_0;
import j$.util.stream.w0;
import j$.util.stream.x0;
import java.util.function.Function;

/*
 * Renamed from j$.util.stream.u0
 */
final class u0_0
extends w0 {
    public final int l;
    final Function m;

    public /* synthetic */ u0_0(x0 x02, int n2, Function function, int n3) {
        this.l = n3;
        this.m = function;
        super(x02, n2, 1);
    }

    @Override
    final B0 q(int n2, B0 b0) {
        switch (this.l) {
            default: {
                return new k_0(this, b0);
            }
            case 0: 
        }
        return new l_0(this, b0, 2);
    }
}

