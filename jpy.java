/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class jpy
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final jqf[] a;

    public jpy(jqf[] jqfArray) {
        this.a = jqfArray;
    }

    private final Object readResolve() {
        jqf[] jqfArray;
        jqf jqf2 = jqg.a;
        for (int i2 = 0; i2 < (jqfArray = this.a).length; ++i2) {
            jqf2 = jqf2.plus(jqfArray[i2]);
        }
        return jqf2;
    }
}

