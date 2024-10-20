/*
 * Decompiled with CFR 0.152.
 */
final class dlg
implements dle {
    final gui a;
    final dli b;
    final Object c;
    private final int d;

    public dlg(dli dli2, gui gui2, Object object, int n2) {
        this.d = n2;
        this.a = gui2;
        this.c = object;
        this.b = dli2;
    }

    private final void a() {
        dld dld2 = this.b.b;
        if (dld2 != null) {
            ((dlq)this.c).g.remove(dld2);
            this.b.b = null;
        }
    }

    private final void b() {
        dlj dlj2 = this.b.a;
        if (dlj2 != null) {
            ((dlm)this.c).b(dlj2);
            this.b.a = null;
        }
    }

    @Override
    public final void i(djt djt2) {
        if (this.d != 0) {
            if (((Boolean)this.a.a()).booleanValue()) {
                this.b();
                return;
            }
            this.b.c.k(djt2);
            return;
        }
        if (((Boolean)this.a.a()).booleanValue()) {
            this.b.c.k(djt2);
            return;
        }
        this.a();
    }

    @Override
    public final void j(djt djt2) {
        if (this.d != 0) {
            if (((Boolean)this.a.a()).booleanValue()) {
                this.b();
                return;
            }
            this.b.c.l(djt2);
            return;
        }
        if (((Boolean)this.a.a()).booleanValue()) {
            this.b.c.l(djt2);
            return;
        }
        this.a();
    }
}

