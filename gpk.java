/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
public final class gpk {
    public gof a;
    public boolean b;
    final gpm c;

    public gpk(gpm gpm2) {
        this.c = gpm2;
        this.a = null;
        this.b = false;
    }

    public final void a(boolean bl2) {
        if (bl2 && this.a == null && !fxf.aw(gqv.a)) {
            this.b = bl2 = gno.s();
            if (!bl2) {
                this.a = this.c.d("FragmentTransaction Popped");
            }
        }
    }
}

