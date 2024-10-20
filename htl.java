/*
 * Decompiled with CFR 0.152.
 */
public final class htl {
    public static final htl a = new htl(htk.a, null, null, null);
    public static final htl b = new htl(htk.e, null, null, null);
    public final htk c;
    public final hth d;
    public final itw e;
    private final hpn f;

    public htl(htk htk2, hth hth2, hpn hpn2, itw itw2) {
        fxf.K((Object)htk2);
        this.c = htk2;
        this.d = hth2;
        this.f = hpn2;
        this.e = itw2;
    }

    public static htl b(iyh iyh2, iwx iwx2) {
        fxf.K(iyh2);
        fxf.B(iyh2.g() ^ true, "Error status must not be ok");
        return new htl(htk.b, new hth(iyh2, iwx2), null, null);
    }

    public static htl c(hpn hpn2) {
        fxf.K(hpn2);
        return new htl(htk.d, null, hpn2, null);
    }

    public final hpn a() {
        boolean bl2 = this.c == htk.d;
        fxf.A(bl2);
        return this.f;
    }
}

