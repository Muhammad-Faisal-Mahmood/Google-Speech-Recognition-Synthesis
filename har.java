/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class har
implements Serializable {
    private final gzx a;

    public har(gzx gzx2) {
        this.a = gzx2;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return has.a;
        }
        if (fvd.z(this.a, gzx.q(hcr.a))) {
            return has.b;
        }
        return new has(this.a);
    }
}

