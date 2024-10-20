/*
 * Decompiled with CFR 0.152.
 */
final class gyw
extends gyz {
    public static final gyw a = new gyw();
    private static final long serialVersionUID = 0L;

    private gyw() {
    }

    private Object readResolve() {
        return a;
    }

    @Override
    public final int a(gyz gyz2) {
        if (gyz2 == this) {
            return 0;
        }
        return 1;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+\u221e";
    }
}

