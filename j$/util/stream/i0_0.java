/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.a;
import j$.util.stream.I;
import j$.util.stream.N0;
import j$.util.stream.h_0;
import j$.util.stream.j0_0;
import j$.util.stream.p0_0;
import j$.util.stream.q0_0;

/*
 * Renamed from j$.util.stream.i0
 */
final class i0_0
extends I {
    public final int a;
    final Object b;

    public /* synthetic */ i0_0(N0 n0, Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final q0_0 n() {
        switch (this.a) {
            default: {
                return new p0_0((h_0)this.b);
            }
            case 0: 
        }
        return new j0_0((a)this.b);
    }
}

