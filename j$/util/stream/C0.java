/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.z0;
import java.util.Comparator;

abstract class C0
extends z0 {
    protected final Comparator b;
    protected boolean c;

    C0(B0 b0, Comparator comparator) {
        super(b0);
        this.b = comparator;
    }

    @Override
    public final boolean j() {
        this.c = true;
        return false;
    }
}

