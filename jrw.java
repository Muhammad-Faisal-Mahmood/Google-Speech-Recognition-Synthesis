/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jrw
implements Serializable {
    public static final jrw a = new jrw();

    private Object readResolve() {
        return a;
    }
}

