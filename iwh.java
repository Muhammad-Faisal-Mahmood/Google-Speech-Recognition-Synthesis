/*
 * Decompiled with CFR 0.152.
 */
public abstract class iwh {
    public static final itr a = new itr("internal:health-checking-config");
    public static final ivv b = new ivv();
    public static final itr c = new itr("internal:has-health-check-producer-listener");
    public static final itr d = new itr("io.grpc.IS_PETIOLE_POLICY");
    private int e;

    public iyh a(iwd iwd2) {
        throw null;
    }

    public abstract void b(iyh var1);

    public void c(iwd iwd2) {
        int n2 = this.e;
        this.e = n2 + 1;
        if (n2 == 0) {
            this.a(iwd2);
        }
        this.e = 0;
    }

    public void d() {
    }

    public abstract void e();
}

