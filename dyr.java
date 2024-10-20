/*
 * Decompiled with CFR 0.152.
 */
public final class dyr {
    public int a;
    public Object b;

    public dyr() {
    }

    public dyr(byte[] byArray) {
        this.a = 3;
    }

    public final dys a() {
        int n2;
        Object object = this.b;
        if (object != null && (n2 = this.a) != 0) {
            return new dys((gzx)object, n2);
        }
        object = new StringBuilder();
        if (this.b == null) {
            ((StringBuilder)object).append(" records");
        }
        if (this.a == 0) {
            ((StringBuilder)object).append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(gzx gzx2) {
        if (gzx2 != null) {
            this.b = gzx2;
            return;
        }
        throw new NullPointerException("Null records");
    }
}

