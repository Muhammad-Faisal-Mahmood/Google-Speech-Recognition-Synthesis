/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class cen {
    public ceo a;
    public ceo b;
    public cei c;
    public cbm[] d;
    public boolean e = true;
    public int f;
    private final Runnable g = new bpw(10);

    public final bmu a() {
        ceo ceo2 = this.a;
        boolean bl2 = true;
        boolean bl3 = ceo2 != null;
        kl.ao(bl3, "Must set register function");
        bl3 = this.b != null;
        kl.ao(bl3, "Must set unregister function");
        bl3 = this.c != null ? bl2 : false;
        kl.ao(bl3, "Must set holder");
        a.s(this.c.b, "Key must not be null");
        return new bmu((Object)new cem(this, this.c, this.d, this.e, this.f), (Object)new AmbientMode$AmbientController(this), (Object)this.g, null);
    }
}

