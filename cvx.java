/*
 * Decompiled with CFR 0.152.
 */
public final class cvx
implements hny {
    public final cwj a;
    public final cth b;
    public final ctf c;
    public final ctt d;
    public final long e;
    public final int f;

    public /* synthetic */ cvx(cwj cwj2, int n2, cth cth2, ctf ctf2, ctt ctt2, long l2) {
        this.a = cwj2;
        this.f = n2;
        this.b = cth2;
        this.c = ctf2;
        this.d = ctt2;
        this.e = l2;
    }

    @Override
    public final hpn a(Object object) {
        if (!((Boolean)object).booleanValue() && this.f != 6) {
            long l2 = this.e;
            ctt ctt2 = this.d;
            ctf ctf2 = this.c;
            object = this.b;
            object = this.a.r((cth)object, ctf2, ctt2, l2);
        } else {
            object = hpj.a;
        }
        return object;
    }
}

