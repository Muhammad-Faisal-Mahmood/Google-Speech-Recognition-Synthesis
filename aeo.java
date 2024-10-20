/*
 * Decompiled with CFR 0.152.
 */
public final class aeo {
    public static final aeo a = new aeo(1.0f);
    public final float b;
    public final int c;

    static {
        agf.z(0);
        agf.z(1);
    }

    public aeo(float f2) {
        boolean bl2 = f2 > 0.0f;
        abr.d(bl2);
        abr.d(true);
        this.b = f2;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aeo)object;
            if (this.b == ((aeo)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToRawIntBits(this.b) + 527) * 31 + Float.floatToRawIntBits(1.0f);
    }

    public final String toString() {
        return agf.r("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(1.0f));
    }
}

