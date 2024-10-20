/*
 * Decompiled with CFR 0.152.
 */
public final class cgf {
    private static cgf b;
    private static final cgg c;
    public cgg a;

    static {
        c = new cgg(0, false, false, 0, 0);
    }

    private cgf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cgf a() {
        synchronized (cgf.class) {
            cgf cgf2;
            if (b != null) return b;
            b = cgf2 = new cgf();
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(cgg cgg2) {
        synchronized (this) {
            int n2;
            int n3;
            if (cgg2 == null) {
                this.a = c;
                return;
            }
            cgg cgg3 = this.a;
            if (cgg3 != null && (n3 = cgg3.a) >= (n2 = cgg2.a)) {
                return;
            }
            this.a = cgg2;
            return;
        }
    }
}

