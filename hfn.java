/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

public final class hfn
extends hfl {
    public hfn(hfv hfv2) {
        super(hfv2);
    }

    public static hfn o(String string) {
        return new hfn(hgt.d(string));
    }

    public static hfn p(String string) {
        return new hfn(hhj.c.a(string));
    }

    public static hfn q() {
        return new hfn(hgt.d(hgt.g().b(hfn.class)));
    }

    public final hfk n(Level level) {
        boolean bl2 = this.k(level);
        hgt.n(this.i(), level, bl2);
        if (!bl2) {
            return b;
        }
        return new hfm(this, level);
    }
}

