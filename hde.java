/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class hde
extends hcp
implements Serializable {
    public static final hde a = new hde();
    private static final long serialVersionUID = 0L;

    private hde() {
    }

    private Object readResolve() {
        return a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

