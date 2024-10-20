/*
 * Decompiled with CFR 0.152.
 */
public final class ert
implements imb {
    private final jnu a;
    private final jnu b;

    public ert(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final erx a() {
        gto gto2 = (gto)((imc)this.a).a;
        erq erq2 = (erq)this.b.b();
        jse.e(gto2, "micStatePartialUpdaterOverride");
        jse.e(erq2, "defaultMicStatePartialUpdater");
        return (erx)gto2.e(erq2);
    }
}

