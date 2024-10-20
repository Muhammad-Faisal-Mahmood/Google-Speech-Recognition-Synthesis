/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.l_0;
import java.util.List;
import java.util.RandomAccess;

final class r
extends l_0
implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new l_0(this.b);
    }

    @Override
    public final List subList(int n2, int n3) {
        return new l_0(this.b.subList(n2, n3));
    }
}

