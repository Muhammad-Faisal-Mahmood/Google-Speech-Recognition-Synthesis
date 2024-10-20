/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class bum
implements des {
    private final dht a;
    private final bmu b;

    public bum(hpq hpq2) {
        this.b = new bmu(hpq2, null);
        this.a = new dht(hpq2);
    }

    @Override
    public final hpn a(ddn ddn2) {
        return this.b.o(ddn2);
    }

    @Override
    public final hpn b(den den2, String string, File file, File file2) {
        return this.a.b(den2, "zip", file, file2);
    }

    @Override
    public final String c() {
        return "ZvoiceUnpacker";
    }

    @Override
    public final boolean d(String string) {
        return "zip".equals(string) || "zvoice".equals(string);
        {
        }
    }
}

