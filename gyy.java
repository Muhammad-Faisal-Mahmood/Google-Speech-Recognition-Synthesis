/*
 * Decompiled with CFR 0.152.
 */
final class gyy
extends gyz {
    public static final gyy a = new gyy();
    private static final long serialVersionUID = 0L;

    private gyy() {
    }

    private Object readResolve() {
        return a;
    }

    @Override
    public final int a(gyz gyz2) {
        if (gyz2 == this) {
            return 0;
        }
        return -1;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-\u221e";
    }
}

