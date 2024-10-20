/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.b_0;
import j$.util.stream.l_0;
import j$.util.stream.v_0;
import j$.util.stream.w0;

/*
 * Renamed from j$.util.stream.w
 */
final class w_0
extends w0 {
    public final int l;
    final Object m;

    public /* synthetic */ w_0(b_0 b_02, int n2, Object object, int n3) {
        this.l = n3;
        this.m = object;
        super(b_02, n2, 1);
    }

    @Override
    final B0 q(int n2, B0 b0) {
        switch (this.l) {
            default: {
                return new l_0(this, b0, 1);
            }
            case 0: 
        }
        return new v_0(this, b0, 0);
    }
}

