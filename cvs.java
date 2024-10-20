/*
 * Decompiled with CFR 0.152.
 */
public final class cvs
implements hny {
    public final cwj a;
    public final ctt b;
    public final String c;
    public final long d;
    public final ctf e;
    public final cth f;
    public final int g;

    public /* synthetic */ cvs(cwj cwj2, ctt ctt2, String string, long l2, ctf ctf2, cth cth2, int n2) {
        this.a = cwj2;
        this.b = ctt2;
        this.c = string;
        this.d = l2;
        this.e = ctf2;
        this.f = cth2;
        this.g = n2;
    }

    @Override
    public final hpn a(Object object) {
        object = (Void)object;
        hwp hwp2 = ctv.a.l();
        Object object2 = ctp.e;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = this.c;
        hwv hwv2 = hwp2.b;
        Object object3 = (ctv)hwv2;
        ((ctv)object3).d = ((ctp)object2).h;
        ((ctv)object3).b |= 2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object2 = String.valueOf(object);
        hwv2 = hwp2.b;
        object3 = (ctv)hwv2;
        ((ctv)object3).b |= 1;
        ((ctv)object3).c = "android_shared_".concat((String)object2);
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object3 = (ctv)hwv2;
        ((ctv)object3).b |= 4;
        ((ctv)object3).e = true;
        if (!hwv2.B()) {
            hwp2.u();
        }
        long l2 = this.d;
        object3 = hwp2.b;
        hwv2 = object3;
        ((ctv)hwv2).b |= 8;
        ((ctv)hwv2).f = l2;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        object3 = this.a;
        int n2 = this.g;
        cth cth2 = this.f;
        object2 = this.e;
        hwv2 = this.b;
        ctv ctv2 = (ctv)hwp2.b;
        object.getClass();
        ctv2.b |= 0x10;
        ctv2.g = object;
        object = (ctv)hwp2.o();
        return ((cwj)object3).q(((cwj)object3).j.f.h((ctt)hwv2, (ctv)object), new cwc((cwj)object3, (ctf)object2, cth2, n2, l2, 0));
    }
}

