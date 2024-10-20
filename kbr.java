/*
 * Decompiled with CFR 0.152.
 */
public final class kbr {
    public static final boolean a(Object object) {
        return object == kat.a;
    }

    public static final kau b(Object object) {
        if (object != kat.a) {
            jse.c(object, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (kau)object;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public final boolean equals(Object object) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

