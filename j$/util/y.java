/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.K;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

final class y
extends K {
    final SortedSet f;

    y(SortedSet sortedSet, Collection collection) {
        this.f = sortedSet;
        super(collection, 21);
    }

    @Override
    public final Comparator m() {
        return this.f.comparator();
    }
}

