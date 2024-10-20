/*
 * Decompiled with CFR 0.152.
 */
public final class cwg
implements hny {
    public final cwj a;
    public final ctf b;
    public final cth c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public /* synthetic */ cwg(cwj cwj2, ctf ctf2, cth cth2, boolean bl2, boolean bl3, int n2, int n3) {
        this.a = cwj2;
        this.b = ctf2;
        this.c = cth2;
        this.d = bl2;
        this.e = bl3;
        this.f = n2;
        this.g = n3;
    }

    @Override
    public final hpn a(Object object) {
        cwj cwj2 = this.a;
        cth cth2 = this.c;
        boolean bl2 = this.d;
        boolean bl3 = this.e;
        int n2 = this.f + 1;
        ctf ctf2 = this.b;
        int n3 = this.g;
        if ((object = (ctp)object) == ctp.e) {
            cyr.e("%s: File %s downloaded for group: %s", "FileGroupManager", ctf2.c, cth2.d);
            object = cwj2.i(cth2, bl2, bl3, n2, n3);
        } else if (object != ctp.b && object != ctp.c) {
            cyr.e("%s: File %s not downloaded for group: %s", "FileGroupManager", ctf2.c, cth2.d);
            object = cwj2.i(cth2, true, bl3, n2, n3);
        } else {
            cyr.e("%s: File %s not downloaded for group: %s", "FileGroupManager", ctf2.c, cth2.d);
            object = cwj2.i(cth2, bl2, true, n2, n3);
        }
        return object;
    }
}

