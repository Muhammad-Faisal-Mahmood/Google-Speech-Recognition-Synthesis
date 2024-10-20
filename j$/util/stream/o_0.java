/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Optional;
import j$.util.stream.N0;
import j$.util.stream.h_0;
import j$.util.stream.n_0;
import j$.util.stream.p_0;

/*
 * Renamed from j$.util.stream.o
 */
final class o_0
extends p_0 {
    static final n_0 c;

    static {
        N0 n0 = N0.REFERENCE;
        c = new n_0(true, n0, Optional.empty(), new h_0(17), new h_0(3));
        new n_0(false, n0, Optional.empty(), new h_0(17), new h_0(3));
    }

    public final Object get() {
        Optional<Object> optional = this.a ? Optional.of(this.b) : null;
        return optional;
    }
}

