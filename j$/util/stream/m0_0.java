/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.I;
import j$.util.stream.N0;
import j$.util.stream.h_0;
import j$.util.stream.n0_0;
import j$.util.stream.q0_0;

/*
 * Renamed from j$.util.stream.m0
 */
final class m0_0
extends I {
    final h_0 a;
    final h_0 b;
    final h_0 c;

    m0_0(N0 n0, h_0 h_02, h_0 h_03, h_0 h_04) {
        this.a = h_02;
        this.b = h_03;
        this.c = h_04;
    }

    @Override
    public final q0_0 n() {
        h_0 h_02 = this.a;
        return new n0_0(this.c, this.b, h_02);
    }
}

