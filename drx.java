/*
 * Decompiled with CFR 0.152.
 */
public final class drx {
    public float a;
    public byte b;
    public int c;

    public final dry a() {
        int n2 = this.b;
        boolean bl2 = true;
        if (n2 == 1 && (n2 = this.c) != 0) {
            dry dry2 = new dry(n2, this.a);
            float f2 = dry2.a;
            if (!(f2 >= 0.0f) || !(f2 <= 1.0f)) {
                bl2 = false;
            }
            fxf.B(bl2, "Probability shall be between 0 and 1.");
            return dry2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.c == 0) {
            stringBuilder.append(" enablement");
        }
        if (this.b == 0) {
            stringBuilder.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(boolean bl2) {
        int n2 = true != bl2 ? 2 : 3;
        this.c = n2;
    }
}

