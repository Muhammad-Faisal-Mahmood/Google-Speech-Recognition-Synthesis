/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class dbn
implements dej {
    private final bmu a;

    public dbn(hpq hpq2) {
        this.a = new bmu(hpq2, "ManifestInstanceFetcher");
    }

    @Override
    public final hpn a(ddn ddn2) {
        return this.a.o(ddn2);
    }

    @Override
    public final hpn b(den object, deh object2, File file) {
        object2 = ((den)object).o();
        object = new dbm((den)object, file);
        return this.a.p(object2, (ddz)object);
    }

    @Override
    public final String c() {
        return "ManifestInstanceFetcher";
    }

    @Override
    public final elq d(den den2) {
        if (den2.n().a("manifest_instance") != null) {
            return elq.c();
        }
        return null;
    }
}

