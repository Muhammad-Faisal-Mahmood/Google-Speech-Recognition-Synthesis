/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Set;
import j$.util.j_0;

class s
extends j_0
implements java.util.Set,
Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override
    public boolean equals(Object object) {
        boolean bl2 = object == this || this.a.equals(object);
        return bl2;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

