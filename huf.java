/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.logging.Level;

public final class huf
extends hgw {
    private final Collection a;

    public huf(String string, Collection collection) {
        super(string);
        this.a = collection;
    }

    @Override
    public final void b(hfu hfu2) {
        hdy hdy2 = ((gzx)this.a).v();
        while (hdy2.hasNext()) {
            hfv hfv2 = (hfv)hdy2.next();
            if (!hfu2.N() && !hfv2.c(hfu2.o())) continue;
            hfv2.b(hfu2);
        }
    }

    @Override
    public final boolean c(Level level) {
        hdy hdy2 = ((gzx)this.a).v();
        while (hdy2.hasNext()) {
            if (!((hfv)hdy2.next()).c(level)) continue;
            return true;
        }
        return false;
    }
}

