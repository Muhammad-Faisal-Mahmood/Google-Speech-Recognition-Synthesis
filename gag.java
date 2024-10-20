/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class gag
implements Callable {
    public final gam a;
    public final hth b;

    public /* synthetic */ gag(gam gam2, hth hth2) {
        this.a = gam2;
        this.b = hth2;
    }

    public final Object call() {
        Object object = this.a;
        hwp hwp2 = (hwp)((hwv)object).C(5);
        hwp2.x((hwv)object);
        hth hth2 = this.b;
        int n2 = hth2.d();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object2 = (gam)hwp2.b;
        object = gam.a;
        ((gam)object2).b |= 1;
        ((gam)object2).c = n2;
        int n3 = hth2.d();
        object = new gzs();
        for (n2 = 0; n2 < n3; ++n2) {
            if (!hth2.b.contains(hth.f(n2, "created"))) continue;
            ((gzs)object).h(fym.a(n2, gda.a));
        }
        object2 = ((gzs)object).g();
        int n4 = ((hct)object2).c;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object3;
            Object object4;
            Object object5 = (fym)object2.get(n3);
            for (n2 = 0; n2 < 12; ++n2) {
                object4 = (new String[]{"display_name", "account_name", "effective_gaia_id", "gaia_id", "profile_photo_url", "is_managed_account", "display_name", "avatar_url", "gaia_id", "email_gaia_id", "logged_in", "logged_out"})[n2];
                object = hth2.a;
                object4 = hth.g((fym)object5, (String)object4);
                ((ArrayList)object).add(object4);
            }
            object4 = (hwr)fze.a.l();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object = (fze)((hwr)object4).b;
            ((fze)object).b |= 0x100;
            ((fze)object).i = "google";
            boolean bl2 = hth2.h((fym)object5, "is_managed_account");
            int n5 = 2;
            if (bl2) {
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object = (fze)((hwr)object4).b;
                ((fze)object).b |= 0x40;
                ((fze)object).g = true;
                object = hth2.e((fym)object5, "account_name");
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object3 = (fze)((hwr)object4).b;
                object.getClass();
                ((fze)object3).b |= 0x10;
                ((fze)object3).e = object;
                object3 = hth2.e((fym)object5, "display_name");
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object = (fze)((hwr)object4).b;
                object3.getClass();
                ((fze)object).b |= 2;
                ((fze)object).d = object3;
                object3 = hth2.e((fym)object5, "effective_gaia_id");
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object = (fze)((hwr)object4).b;
                object3.getClass();
                ((fze)object).b |= 1;
                ((fze)object).c = object3;
                object3 = hth2.e((fym)object5, "gaia_id");
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object = (fze)((hwr)object4).b;
                object3.getClass();
                ((fze)object).b |= 0x80;
                ((fze)object).h = object3;
                object3 = hth2.e((fym)object5, "avatar_url");
                if (object3 != null) {
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object = (fze)((hwr)object4).b;
                    ((fze)object).b |= 0x20;
                    ((fze)object).f = object3;
                }
            } else {
                block24: {
                    object = hth2.e((fym)object5, "account_name");
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object3 = (fze)((hwr)object4).b;
                    object.getClass();
                    ((fze)object3).b |= 0x10;
                    ((fze)object3).e = object;
                    for (n2 = 0; n2 < 2; ++n2) {
                        object = hth2.e((fym)object5, (new String[]{"display_name", "account_name"})[n2]);
                        if (object == null) {
                            continue;
                        }
                        break block24;
                    }
                    object = null;
                }
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object3 = (fze)((hwr)object4).b;
                object.getClass();
                ((fze)object3).b |= 2;
                ((fze)object3).d = object;
                object3 = hth2.e((fym)object5, "gaia_id");
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object = (fze)((hwr)object4).b;
                object3.getClass();
                ((fze)object).b |= 1;
                ((fze)object).c = object3;
                object3 = hth2.e((fym)object5, "profile_photo_url");
                if (object3 != null) {
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object = (fze)((hwr)object4).b;
                    ((fze)object).b |= 0x20;
                    ((fze)object).f = object3;
                }
            }
            bl2 = hth2.h((fym)object5, "logged_in");
            boolean bl3 = hth2.h((fym)object5, "logged_out");
            object = gap.a.l();
            n2 = ((fym)object5).a;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = ((hwp)object).b;
            object5 = (gap)object3;
            ((gap)object5).b |= 1;
            ((gap)object5).c = n2;
            if (!((hwv)object3).B()) {
                ((hwp)object).u();
            }
            object5 = (gap)((hwp)object).b;
            object4 = (fze)((hwp)object4).o();
            object4.getClass();
            ((gap)object5).d = object4;
            ((gap)object5).b |= 2;
            n2 = bl2 ? n5 : (bl3 ? 3 : 1);
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object5 = (gap)((hwp)object).b;
            ((gap)object5).e = n2 - 1;
            ((gap)object5).b |= 4;
            object = (gap)((hwp)object).o();
            hwp2.M(((gap)object).c, (gap)object);
        }
        return (gam)hwp2.o();
    }
}

