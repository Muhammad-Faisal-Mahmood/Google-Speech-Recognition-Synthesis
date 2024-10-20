/*
 * Decompiled with CFR 0.152.
 */
public final class ene
implements imb {
    private final jnu a;
    private final jnu b;

    public ene(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final enc a() {
        gto gto2 = (gto)((imc)this.a).a;
        enc enc2 = (enc)this.b.b();
        jse.e(gto2, "monitoringLoggerOverride");
        jse.e(enc2, "defaultMonitoringLogger");
        return (enc)gto2.e(enc2);
    }
}

