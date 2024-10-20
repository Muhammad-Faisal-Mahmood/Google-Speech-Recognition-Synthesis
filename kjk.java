/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kjk
extends khd {
    final kjl d;
    final int e;
    final long f;

    public kjk(String string, kjl kjl2, int n2, long l2) {
        this.d = kjl2;
        this.e = n2;
        this.f = l2;
        super(string);
    }

    @Override
    public final long a() {
        try {
            this.d.u.j(this.e, this.f);
        }
        catch (IOException iOException) {
            this.d.d(iOException);
        }
        return -1L;
    }
}

