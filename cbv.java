/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class cbv
extends cfu {
    public final byte[] a;

    public cbv(byte[] byArray) {
        super(Arrays.copyOfRange(byArray, 0, 25));
        this.a = byArray;
    }

    @Override
    public final byte[] x() {
        return this.a;
    }
}

