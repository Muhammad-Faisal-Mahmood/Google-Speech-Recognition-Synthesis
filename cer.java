/*
 * Decompiled with CFR 0.152.
 */
public final class cer {
    public ceo a;
    public cbm[] b;
    public int c = 0;
    private boolean d = true;

    public final ces a() {
        boolean bl2 = this.a != null;
        kl.ao(bl2, "execute parameter required");
        return new ces(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.d = false;
    }
}

