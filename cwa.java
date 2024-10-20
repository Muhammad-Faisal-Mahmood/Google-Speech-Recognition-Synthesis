/*
 * Decompiled with CFR 0.152.
 */
public final class cwa
implements hny {
    public final cwj a;
    public final cth b;
    public final ctf c;
    public final ctt d;
    public final long e;

    public /* synthetic */ cwa(cwj cwj2, cth cth2, ctf ctf2, ctt ctt2, long l2) {
        this.a = cwj2;
        this.b = cth2;
        this.c = ctf2;
        this.d = ctt2;
        this.e = l2;
    }

    @Override
    public final hpn a(Object object) {
        if (!((Boolean)object).booleanValue()) {
            long l2 = this.e;
            object = this.d;
            ctf ctf2 = this.c;
            cth cth2 = this.b;
            object = this.a.r(cth2, ctf2, (ctt)object, l2);
        } else {
            object = hpj.a;
        }
        return object;
    }
}

