/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class had
implements Serializable {
    private static final long serialVersionUID = 0L;
    final hac a;

    public had(hac hac2) {
        this.a = hac2;
    }

    Object readResolve() {
        return this.a.k();
    }
}

