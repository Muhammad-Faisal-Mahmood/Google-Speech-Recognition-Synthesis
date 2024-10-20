/*
 * Decompiled with CFR 0.152.
 */
public final class eru
implements imb {
    private final jnu a;
    private final jnu b;

    public eru(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final ers a() {
        gto gto2 = (gto)((imc)this.a).a;
        ers ers2 = (ers)this.b.b();
        jse.e(gto2, "micUseOwnerCheckerOverride");
        jse.e(ers2, "defaultMicUseOwnerChecker");
        return (ers)gto2.e(ers2);
    }
}

