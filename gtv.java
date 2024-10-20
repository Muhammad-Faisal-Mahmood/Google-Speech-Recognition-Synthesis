/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class gtv
extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private final boolean a;

    public gtv() {
        this.a = true;
    }

    @Override
    public final void setSeed(long l2) {
        if (!this.a) {
            super.setSeed(l2);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}

