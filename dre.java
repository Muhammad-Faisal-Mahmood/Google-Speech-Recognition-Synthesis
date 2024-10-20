/*
 * Decompiled with CFR 0.152.
 */
public final class dre {
    public byte a;
    public int b;
    public Object c;

    public dre() {
        throw null;
    }

    public dre(byte[] byArray) {
        this.c = gsl.a;
    }

    public dre(char[] cArray) {
    }

    public final drf a() {
        int n2;
        if (this.a == 1 && (n2 = this.b) != 0) {
            return new drf(n2, (gto)this.c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b == 0) {
            stringBuilder.append(" enablement");
        }
        if (this.a == 0) {
            stringBuilder.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final dlx b() {
        Object object;
        int n2;
        if (this.a == 1 && (n2 = this.b) != 0 && (object = this.c) != null) {
            return new dlx(n2, (dly)object);
        }
        object = new StringBuilder();
        if (this.b == 0) {
            ((StringBuilder)object).append(" enablement");
        }
        if (this.a == 0) {
            ((StringBuilder)object).append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            ((StringBuilder)object).append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void c(boolean bl2) {
        int n2 = true != bl2 ? 2 : 3;
        this.b = n2;
    }
}

