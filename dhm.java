/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class dhm
implements hny {
    public final dhn a;
    public final hpn b;
    public final Map c;
    public final dfu d;
    public final Collection e;
    public final boolean f;
    public final hpq g;
    public final dfi h;
    public final kpo i;
    public final AmbientMode$AmbientController j;

    public /* synthetic */ dhm(dhn dhn2, hpn hpn2, Map map, dfu dfu2, Collection collection, boolean bl2, hpq hpq2, dfi dfi2, AmbientMode$AmbientController ambientMode$AmbientController, kpo kpo2) {
        this.a = dhn2;
        this.b = hpn2;
        this.c = map;
        this.d = dfu2;
        this.e = collection;
        this.f = bl2;
        this.g = hpq2;
        this.h = dfi2;
        this.j = ambientMode$AmbientController;
        this.i = kpo2;
    }

    @Override
    public final hpn a(Object object) {
        dhn dhn2 = this.a;
        object = (Map)object;
        if (dhn2.d) {
            object = this.b;
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "iterativelyRequestNewPacks", 196, "PacksRequest.java")).r("Request is canceled, will not request any other slices");
            object.cancel(false);
            object = hhk.K(new HashMap());
        } else {
            Object object2;
            Object object3;
            Object object4;
            this.c.putAll(object);
            object = object.keySet();
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "releaseCompressed", 400, "PacksRequest.java")).x("Releasing %d compressed files %s", object.size(), dhn2.a);
            Object object5 = object.iterator();
            while (true) {
                object = this.d;
                if (!object5.hasNext()) break;
                object4 = (den)object5.next();
                object3 = ((den)object4).o();
                object2 = dde.b((ddn)object3);
                object3 = dde.a((ddn)object3, ((den)object4).k());
                if (!dhn2.c.contains(object2)) {
                    ((dfu)object).p((ddn)object2);
                }
                if (dhn2.c.contains(object3)) continue;
                ((dfu)object).p((ddn)object3);
            }
            object5 = this.i;
            object2 = this.j;
            object4 = this.h;
            object3 = this.g;
            boolean bl2 = this.f;
            object = dhn2.e(this.e, bl2, (dfu)object, (hpq)object3, (dfi)object4, (AmbientMode$AmbientController)object2, (kpo)object5);
        }
        return object;
    }
}

