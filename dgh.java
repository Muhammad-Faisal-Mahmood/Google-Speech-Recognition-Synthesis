/*
 * Decompiled with CFR 0.152.
 */
public final class dgh
implements dcy {
    public final bmu a;
    public final dly b;

    public dgh(hpq hpq2, dly dly2) {
        this.a = new bmu(hpq2, "ChecksumValidator");
        this.b = dly2;
    }

    @Override
    public final hpn a(ddn ddn2) {
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/packs/ChecksumValidator", "cancel", 122, "ChecksumValidator.java")).u("Canceling checksum validation of %s", ddn2);
        return this.a.o(ddn2);
    }

    @Override
    public final String c() {
        return "ChecksumValidator";
    }
}

