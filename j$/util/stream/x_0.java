/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.b_0;
import j$.util.stream.l_0;
import j$.util.stream.v_0;
import j$.util.stream.z_0;

/*
 * Renamed from j$.util.stream.x
 */
final class x_0
extends z_0 {
    public final int k;
    final Object l;

    public /* synthetic */ x_0(b_0 b_02, int n2, Object object, int n3) {
        this.k = n3;
        this.l = object;
        super(b_02, n2);
    }

    @Override
    final boolean p() {
        return false;
    }

    @Override
    final B0 q(int n2, B0 b0) {
        switch (this.k) {
            default: {
                return new l_0(this, b0, 3);
            }
            case 0: 
        }
        return new v_0(this, b0, 1);
    }
}

