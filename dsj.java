/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class dsj {
    private final float a;
    private final Random b;

    public dsj(Random random, float f2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (f2 >= 0.0f) {
            bl3 = bl2;
            if (f2 <= 1.0f) {
                bl3 = true;
            }
        }
        fxf.r(bl3, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f2;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}

