/*
 * Decompiled with CFR 0.152.
 */
public abstract class avo
implements awj {
    public final awl f;
    public final String g;
    public boolean h;

    public avo(awl awl2, String string) {
        this.f = awl2;
        this.g = string;
    }

    protected final void i() {
        if (!this.h) {
            return;
        }
        yi.j(21, "statement is closed");
        throw new jnx();
    }

    @Override
    public final /* synthetic */ boolean j() {
        boolean bl2 = false;
        if (this.b(0) != 0L) {
            bl2 = true;
        }
        return bl2;
    }

    protected final void k() {
        this.h = true;
    }
}

