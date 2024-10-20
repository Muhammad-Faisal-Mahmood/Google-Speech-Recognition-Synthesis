/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.EnumMap;

final class gzo
implements Serializable {
    private static final long serialVersionUID = 0L;
    final EnumMap a;

    public gzo(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new gzp(this.a);
    }
}

