/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashSet;
import java.util.Set;

public final class bao {
    public boolean a;
    public boolean b;
    private bid c = new bid(null);
    private bbj d = bbj.a;
    private final Set e = new LinkedHashSet();

    public final baq a() {
        Set set = jns.x(this.e);
        return new baq(this.c, this.d, this.a, this.b, false, false, -1L, -1L, set);
    }

    public final void b(bbj bbj2) {
        jse.e((Object)bbj2, "networkType");
        this.d = bbj2;
        this.c = new bid(null);
    }
}

