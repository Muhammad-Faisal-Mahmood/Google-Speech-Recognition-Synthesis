/*
 * Decompiled with CFR 0.152.
 */
public abstract class hhu {
    public final int a;
    public final hfr b;

    protected hhu(hfr hfr2, int n2) {
        if (hfr2 != null) {
            if (n2 >= 0) {
                this.a = n2;
                this.b = hfr2;
                return;
            }
            throw new IllegalArgumentException(a.af(n2, "invalid index: "));
        }
        throw new IllegalArgumentException("format options cannot be null");
    }

    public abstract void a(hhy var1, Object var2);
}

