/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.EnumSet;

final class gzq
implements Serializable {
    private static final long serialVersionUID = 0L;
    final EnumSet a;

    public gzq(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new gzr((EnumSet)this.a.clone());
    }
}

