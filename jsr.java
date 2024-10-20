/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class jsr
implements Serializable {
    public static final jsr a = new jsr();
    private static final long serialVersionUID = 0L;

    private jsr() {
    }

    private final Object readResolve() {
        return jst.a;
    }
}

