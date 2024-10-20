/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterators;
import j$.util.stream.I;
import j$.util.stream.Stream;

public final class Stream$_CC {
    public static <T> Stream<T> empty() {
        return I.o(Spliterators.c(), false);
    }
}

