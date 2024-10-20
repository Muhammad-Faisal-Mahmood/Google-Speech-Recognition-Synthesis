/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

final class hyr
extends hvp {
    final hys a;
    hvr b;
    final hyt c;

    public hyr(hyt hyt2) {
        this.c = hyt2;
        this.a = new hys(hyt2);
        this.b = this.b();
    }

    private final hvr b() {
        hys hys2 = this.a;
        if (hys2.hasNext()) {
            return hys2.a().o();
        }
        return null;
    }

    @Override
    public final byte a() {
        hvr hvr2 = this.b;
        if (hvr2 != null) {
            byte by2 = hvr2.a();
            if (!this.b.hasNext()) {
                this.b = this.b();
            }
            return by2;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }
}

