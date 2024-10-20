/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

public final class cwc
implements hny {
    public final long a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public /* synthetic */ cwc(csu csu2, sk sk2, long l2, sp sp2, int n2, int n3) {
        this.f = n3;
        this.c = csu2;
        this.d = sk2;
        this.a = l2;
        this.e = sp2;
        this.b = n2;
    }

    public /* synthetic */ cwc(cwj cwj2, ctf ctf2, cth cth2, int n2, long l2, int n3) {
        this.f = n3;
        this.c = cwj2;
        this.d = ctf2;
        this.e = cth2;
        this.b = n2;
        this.a = l2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.f;
        boolean bl2 = false;
        if (n2 != 0) {
            if (!((gto)(object = (gto)object)).g()) {
                object = hpj.a;
            } else if (((hpn)((gto)object).c()).isDone()) {
                object = hpj.a;
            } else {
                long l2 = this.a;
                object = (csu)this.c;
                if (((csu)object).j == 2) {
                    int n3 = this.b;
                    Object object2 = this.e;
                    sk sk2 = (sk)this.d;
                    sk2.n = "progress";
                    sk2.i(0x1080081);
                    sk2.e((CharSequence)((csu)object).e.e(((csu)object).a));
                    int n4 = ((csu)object).h;
                    n2 = (int)l2;
                    if (n4 <= 0) {
                        bl2 = true;
                    }
                    sk2.h(n4, n2, bl2);
                    sk2 = sk2.a();
                    ((sp)object2).a(n3, (Notification)sk2);
                }
                if (((csu)object).g.g()) {
                    ((csv)((csu)object).g.c()).c(l2);
                }
                object = hpj.a;
            }
            return object;
        }
        bl2 = (Boolean)object;
        Object object3 = this.e;
        Object object4 = this.d;
        object = this.c;
        if (!bl2) {
            ctf ctf2 = (ctf)object4;
            object4 = ctf2.c;
            object3 = (cth)object3;
            cyr.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", object4, ((cth)object3).d);
            cwj.A(((cwj)object).i, (cth)object3, ctf2, 15);
            object = hhk.K(false);
        } else {
            cyu cyu2 = ((cwj)object).i;
            object = hlt.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            n2 = this.b;
            Object object5 = (hlt)((hwp)object).b;
            ((hlt)object5).c = hhk.aA(n2);
            ((hlt)object5).b |= 1;
            object3 = (cth)object3;
            object5 = ((cth)object3).d;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv hwv2 = ((hwp)object).b;
            hlt hlt2 = (hlt)hwv2;
            object5.getClass();
            hlt2.b = 2 | hlt2.b;
            hlt2.d = object5;
            n2 = ((cth)object3).f;
            if (!hwv2.B()) {
                ((hwp)object).u();
            }
            hwv2 = ((hwp)object).b;
            object5 = (hlt)hwv2;
            ((hlt)object5).b |= 4;
            ((hlt)object5).e = n2;
            long l3 = ((cth)object3).s;
            if (!hwv2.B()) {
                ((hwp)object).u();
            }
            object5 = ((hwp)object).b;
            hwv2 = (hlt)object5;
            ((hlt)hwv2).b |= 0x80;
            ((hlt)hwv2).i = l3;
            object3 = ((cth)object3).t;
            if (!((hwv)object5).B()) {
                ((hwp)object).u();
            }
            object5 = ((hwp)object).b;
            hwv2 = (hlt)object5;
            object3.getClass();
            ((hlt)hwv2).b |= 0x100;
            ((hlt)hwv2).j = object3;
            object4 = ((ctf)object4).c;
            if (!((hwv)object5).B()) {
                ((hwp)object).u();
            }
            object3 = ((hwp)object).b;
            object5 = (hlt)object3;
            object4.getClass();
            ((hlt)object5).b |= 8;
            ((hlt)object5).f = object4;
            if (!((hwv)object3).B()) {
                ((hwp)object).u();
            }
            object4 = ((hwp)object).b;
            object3 = (hlt)object4;
            ((hlt)object3).b |= 0x10;
            ((hlt)object3).g = true;
            if (!((hwv)object4).B()) {
                ((hwp)object).u();
            }
            l3 = this.a;
            object4 = (hlt)((hwp)object).b;
            ((hlt)object4).b |= 0x20;
            ((hlt)object4).h = l3;
            cyu2.a((hlt)((hwp)object).o());
            object = hhk.K(true);
        }
        return object;
    }
}

