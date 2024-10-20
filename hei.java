/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

public final class hei
extends hdz {
    private static final hev b = new hev(null);

    public hei(hfv hfv2) {
        super(hfv2);
    }

    @Deprecated
    public static hei m(String string) {
        hhk.f(string.isEmpty() ^ true, "injected class name is empty");
        return new hei(hgt.d(string.replace('/', '.')));
    }

    public final heg l(Level level) {
        boolean bl2 = this.k(level);
        hgt.n(this.i(), level, bl2);
        if (!bl2) {
            return b;
        }
        return new heh(this, level);
    }
}

