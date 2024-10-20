/*
 * Decompiled with CFR 0.152.
 */
public final class ein
implements imb {
    private final jnu a;
    private final jnu b;

    public ein(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final fpo a() {
        gto gto2 = (gto)((imc)this.a).a;
        fpo fpo2 = ((eii)this.b).a();
        jse.e(gto2, "defaultBluetoothHeadsetProfileShimFactoryOverride");
        return (fpo)gto2.e(fpo2);
    }
}

