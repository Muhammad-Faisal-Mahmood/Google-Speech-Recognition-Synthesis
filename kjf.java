/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;

public final class kjf
extends khd {
    final kjl d;
    final int e;
    final List f;

    public kjf(String string, kjl kjl2, int n2, List list) {
        this.d = kjl2;
        this.e = n2;
        this.f = list;
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
        jse.e(this.f, "responseHeaders");
        try {
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

