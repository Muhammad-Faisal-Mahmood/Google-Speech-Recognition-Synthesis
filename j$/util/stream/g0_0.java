/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.J;
import j$.util.stream.K;
import j$.util.stream.L;
import j$.util.stream.h0_0;

/*
 * Renamed from j$.util.stream.g0
 */
class g0_0
extends h0_0 {
    public final int c;
    private final Object d;

    public g0_0(J j2, Object object) {
        this.c = 0;
        super(j2);
        this.d = (int[])object;
    }

    public g0_0(L l2, Object[] objectArray) {
        this.c = 1;
        super(l2);
        this.d = objectArray;
    }

    public g0_0(g0_0 g0_02, K k2, int n2) {
        this.c = 0;
        super(g0_02, k2, n2);
        this.d = (int[])g0_02.d;
    }

    public g0_0(g0_0 g0_02, L l2, int n2) {
        this.c = 1;
        super(g0_02, l2, n2);
        this.d = (Object[])g0_02.d;
    }

    @Override
    final void a() {
        switch (this.c) {
            default: {
                this.a.g((Object[])this.d, this.b);
                return;
            }
            case 0: 
        }
        K k2 = (K)this.a;
        int[] nArray = (int[])this.d;
        k2.k(this.b, nArray);
    }

    @Override
    final h0_0 b(int n2, int n3) {
        switch (this.c) {
            default: {
                return new g0_0(this, this.a.a(n2), n3);
            }
            case 0: 
        }
        return new g0_0(this, ((K)this.a).a(n2), n3);
    }
}

