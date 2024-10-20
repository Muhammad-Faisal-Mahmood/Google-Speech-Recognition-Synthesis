/*
 * Decompiled with CFR 0.152.
 */
public final class dqj {
    public int a;
    public gto b;
    public byte c;
    public int d;

    public dqj() {
        throw null;
    }

    public dqj(byte[] byArray) {
        this.b = gsl.a;
    }

    public final dqk a() {
        int n2;
        if (this.c == 3 && (n2 = this.d) != 0) {
            dqk dqk2 = new dqk(n2, this.a, this.b);
            fxf.r(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
            return dqk2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.d == 0) {
            stringBuilder.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            stringBuilder.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            stringBuilder.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(boolean bl2) {
        int n2 = true != bl2 ? 2 : 3;
        this.d = n2;
    }
}

