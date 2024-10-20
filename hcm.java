/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class hcm
extends hcp
implements Serializable {
    public static final hcm a = new hcm();
    private static final long serialVersionUID = 0L;

    private hcm() {
    }

    private Object readResolve() {
        return a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

