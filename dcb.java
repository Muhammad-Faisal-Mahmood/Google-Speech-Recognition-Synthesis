/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class dcb
implements hny {
    public final den a;
    public final String b;
    public final String c;
    public final int d;
    public final ded e;
    public final egg f;

    public /* synthetic */ dcb(egg egg2, den den2, String string, String string2, int n2, ded ded2) {
        this.f = egg2;
        this.a = den2;
        this.b = string;
        this.c = string2;
        this.d = n2;
        this.e = ded2;
    }

    @Override
    public final hpn a(Object object) {
        String string;
        block7: {
            object = (Void)object;
            Object object2 = this.a;
            Object object3 = ((den)object2).o();
            int n2 = dde.a;
            Object object4 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 606, "Superpacks.java");
            object = this.b;
            object4.C("Successfully got manifest for %s: %s", object, object3);
            Object object5 = this.e;
            string = this.c;
            n2 = this.d;
            object4 = this.f;
            try {
                object3 = ((czh)((egg)object4).h).d(string, n2);
                if (object3 == null) break block7;
                ((egg)object4).j.c((ded)object5);
            }
            catch (dbo dbo2) {
                object3 = ((egg)object4).c;
                object2 = ((den)object2).o();
                object3 = ((dfu)object3).i((ddn)object2);
                object4 = ((egg)object4).e;
                object3 = new dcg((ded)object5, (String)object3, dbo2, 0);
                ((cxv)object4).a((dau)object3);
                throw dbo2;
            }
            object2 = (dct)object5;
            string = ((dct)object2).a;
            object5 = new HashSet();
            object5.add(((dct)object2).b);
            List list = ((dhl)((egg)object4).i).f.a((String)object);
            if (list.isEmpty()) {
                object = null;
            } else {
                if (list.size() > 1) {
                    ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/packs/PackUtil", "getPendingManifest", 29, "PackUtil.java")).A("There is more than 1 pending pack for manifest %s, count: %d", object, list.size());
                }
                object = dde.c(((dco)((dfh)list.iterator().next()).a).b);
            }
            if (object != null) {
                object5.add(((dct)object).b);
            }
            object = ((gzx)((egg)object4).b.b(string)).v();
            while (object.hasNext()) {
                object5.add(((ddo)object.next()).a());
            }
            object = ((egg)object4).h;
            object2 = ((dct)object2).a;
            ((czh)object).e((String)object2, (Set)object5, 32);
            ddb.a();
            object4 = ((egg)object4).f;
            object = new dbc(object3, 5);
            ((cxv)object4).a((dau)object);
            return hhk.K(object3);
        }
        throw new ddg("Manifest registration failed for ".concat(string));
    }
}

