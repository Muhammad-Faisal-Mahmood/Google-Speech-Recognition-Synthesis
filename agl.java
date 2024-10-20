/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class agl
implements agr {
    private final boolean a;
    private final ArrayList b;
    private int c;
    private agt d;

    protected agl(boolean bl2) {
        this.a = bl2;
        this.b = new ArrayList(1);
    }

    @Override
    public /* synthetic */ Map e() {
        return Collections.emptyMap();
    }

    @Override
    public final void f(ahl ahl2) {
        abr.i(ahl2);
        if (!this.b.contains(ahl2)) {
            this.b.add(ahl2);
            ++this.c;
        }
    }

    protected final void g(int n2) {
        agt agt2 = this.d;
        int n3 = agf.a;
        for (n3 = 0; n3 < this.c; ++n3) {
            ((ahl)this.b.get(n3)).a(agt2, this.a, n2);
        }
    }

    protected final void h() {
        agt agt2 = this.d;
        int n2 = agf.a;
        for (n2 = 0; n2 < this.c; ++n2) {
            ((ahl)this.b.get(n2)).b(agt2, this.a);
        }
        this.d = null;
    }

    protected final void i(agt agt2) {
        this.d = agt2;
        for (int i2 = 0; i2 < this.c; ++i2) {
            ((ahl)this.b.get(i2)).d(agt2, this.a);
        }
    }

    protected final void j() {
        for (int i2 = 0; i2 < this.c; ++i2) {
            ((ahl)this.b.get(i2)).c();
        }
    }
}

