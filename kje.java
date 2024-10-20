/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kje
extends khd {
    final kjl d;
    final int e;
    final klm f;
    final int g;

    public kje(String string, kjl kjl2, int n2, klm klm2, int n3) {
        this.d = kjl2;
        this.e = n2;
        this.f = klm2;
        this.g = n3;
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final long a() {
        try {
            this.f.x(this.g);
            this.d.u.h(this.e, kiq.i);
            kjl kjl2 = this.d;
            // MONITORENTER : kjl2
            this.d.w.remove(this.e);
        }
        catch (IOException iOException) {
            return -1L;
        }
        return -1L;
    }
}

