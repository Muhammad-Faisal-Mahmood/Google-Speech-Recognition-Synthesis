/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dbz
implements hnx {
    public final ded a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ddr h;
    public final String i;
    public final egg j;

    public /* synthetic */ dbz(egg egg2, ded ded2, String string, int n2, int n3, int n4, int n5, int n6, ddr ddr2, String string2) {
        this.j = egg2;
        this.a = ded2;
        this.b = string;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        this.h = ddr2;
        this.i = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        egg egg2 = this.j;
        egg2.f();
        ded ded2 = this.a;
        Object object = (dct)ded2;
        Object object2 = egg2.j;
        Object object3 = ((dct)object).a;
        int n2 = object2.a((String)object3);
        Object object4 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 514, "Superpacks.java");
        int n3 = this.c;
        int n4 = this.d;
        int n5 = this.e;
        int n6 = this.g;
        int n7 = this.f;
        object2 = dec.a(n3, n4, n5, n7);
        Object object5 = dec.i(n6);
        int n8 = ((dct)object).b;
        object = this.b;
        object4.J("Registering %s, url: %s, constraints: %s, flags: %s, requested: %d, current: %d", ded2, object, object2, object5, n8, n2);
        if (n2 == n8) {
            try {
                object2 = egg2.b((String)object3, n8, "registerManifest");
                if (object2 != null) {
                    object5 = egg2.i;
                    String string = egg.d((String)object3);
                    object4 = Collections.emptySet();
                    object4 = ((dhl)object5).a(string, (Set)object4);
                    object5 = new cyc(object2, 7);
                    return hno.g((hpn)object4, (hny)object5, (Executor)egg2.l);
                }
            }
            catch (IOException iOException) {
                ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 549, "Superpacks.java")).r("Manifest is corrupted, will delete and re-fetch");
            }
            ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 555, "Superpacks.java")).r("Deleting and re-fetching the manifest");
            object5 = egg2.c;
            object4 = new dco("manifests", dde.d((String)object3, n8));
            object2 = dhu.f;
            ((dfu)object5).o((ddn)object4, (dhu)object2, true);
        }
        object5 = this.h;
        object2 = den.p();
        ((dem)object2).k(dde.d((String)object3, n8));
        ((dem)object2).a = ded2;
        ((dem)object2).l("manifests");
        object5 = (dcq)object5;
        ((dem)object2).f(((dcq)object5).h);
        ((dem)object2).c().g(((dcq)object5).i.b);
        ((dem)object2).h(((AmbientMode$AmbientController)((dhl)egg2.i).j).g((String)object3).b());
        ((dem)object2).n(false);
        if (object != null) {
            ((dem)object2).d((String)object);
        }
        if ((object = this.i) != null) {
            ((dem)object2).c = object;
        }
        object2 = ((dem)object2).a();
        object5 = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 581, "Superpacks.java");
        object = (def)object2;
        if (((def)object).n == null) {
            synchronized (object2) {
                if (((def)object2).n == null) {
                    object4 = new gtn("");
                    ((gtn)object4).b("name", ((den)object2).o());
                    ((gtn)object4).f("size", ((def)object2).d);
                    ((gtn)object4).f("compressed", ((def)object2).e);
                    ((gtn)object4).e("gc priority", ((def)object2).f);
                    ((gtn)object4).e("down. priority", ((def)object2).g);
                    if (!((def)object2).h.isEmpty()) {
                        ((gtn)object4).b("urls", ((def)object2).h);
                    }
                    ((def)object2).n = object4 = ((gtn)object4).toString();
                    if (((def)object2).n == null) {
                        object3 = new NullPointerException("toDetailedString() cannot return null");
                        throw object3;
                    }
                }
            }
        }
        object5.u("Assembled manifest pack: %s", ((def)object).n);
        object = egg.d((String)object3);
        object5 = der.g();
        ((deq)object5).f((den)object2);
        ((deq)object5).d(n3);
        ((deq)object5).c(n4);
        ((deq)object5).e(n5);
        ((deq)object5).b(n7);
        ((deq)object5).g(n6);
        object4 = Collections.singletonList(((deq)object5).a());
        object5 = egg2.i;
        Set set = Collections.emptySet();
        return hno.g(((dhl)object5).c((String)object, (Collection)object4, set), new dcb(egg2, (den)object2, (String)object, (String)object3, n8, ded2), (Executor)egg2.l);
    }
}

