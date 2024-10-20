/*
 * Decompiled with CFR 0.152.
 */
public final class end
implements imb {
    private final jnu a;
    private final jnu b;

    public end(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final czh a() {
        gto gto2 = (gto)((imc)this.a).a;
        czh czh2 = (czh)this.b.b();
        jse.e(gto2, "audioResourcesLoggerOverride");
        jse.e(czh2, "defaultAudioResourcesLogger");
        return (czh)gto2.e(czh2);
    }
}

