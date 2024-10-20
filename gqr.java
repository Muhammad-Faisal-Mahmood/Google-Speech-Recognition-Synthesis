/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class gqr {
    public final boolean a;
    Object b;

    public gqr(gto gto2, Map map) {
        this.a = gto2.g() ^ true;
        this.b = map;
    }

    public gqr(boolean bl2) {
        gpc gpc2 = bl2 ? gno.d() : null;
        this.b = gpc2;
        this.a = bl2;
    }

    public final void a() {
        if (this.a) {
            fpk.c();
        }
        a.s(this.b, "init() was already called");
        for (dwz dwz2 : dwz.values()) {
            dxa object = (dxa)this.b.get((Object)dwz2);
            if (object == null) continue;
            object.a();
        }
        this.b = null;
    }
}

