/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kjj
extends khd {
    final kjl d;
    final int e;
    final kiq f;

    public kjj(String string, kjl kjl2, int n2, kiq kiq2) {
        this.d = kjl2;
        this.e = n2;
        this.f = kiq2;
        super(string);
    }

    @Override
    public final long a() {
        try {
            this.d.j(this.e, this.f);
        }
        catch (IOException iOException) {
            this.d.d(iOException);
        }
        return -1L;
    }
}

