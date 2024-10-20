/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class hao
implements Serializable {
    final hap a;

    public hao(hap hap2) {
        this.a = hap2;
    }

    Object readResolve() {
        return this.a.o();
    }
}

