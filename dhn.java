/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteException
 */
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dhn {
    public final String a;
    public final List b;
    public final Set c;
    public boolean d = false;
    public hpn e = hpj.a;
    public final dhl f;
    private hpn g = null;

    public dhn(String string, List list, Set set, dhl dhl2) {
        this.a = string;
        this.b = list;
        this.c = set;
        this.f = dhl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            this.d = true;
            hpn hpn2 = this.g;
            if (hpn2 != null) {
                hpn2.cancel(false);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void b(dhn object) {
        synchronized (this) {
            object = ((dhn)object).g;
            if (object != null) {
                this.c((hpn)object);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c(hpn hpn2) {
        synchronized (this) {
            this.e = hpn2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(hpn hpn2) {
        synchronized (this) {
            this.g = hpn2;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final hpn e(Collection object, boolean bl2, dfu hashMap, hpq object2, dfi object32, AmbientMode$AmbientController object4, kpo kpo2) {
        Object object5;
        int n2;
        Object object62;
        Object object72;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "requestNewPacks", 233, "PacksRequest.java")).s("Start Requesting %d slices.", object.size());
        if (bl2) {
            object12 = new HashSet();
            object11 = object.iterator();
            while (object11.hasNext()) {
                object10 = ((der)object11.next()).f();
                bl2 = ((dfu)((Object)hashMap)).f(((den)object10).o()).exists();
                object9 = ((dfu)((Object)hashMap)).b(((dco)((den)object10).o()).a);
                object8 = dfy.g();
                ((dfx)object8).d(2);
                object72 = ((den)object10).o();
                object62 = ((den)object10).k();
                n2 = dde.a;
                ((dfx)object8).c((ddn)object72);
                ((dfx)object8).e(((den)object10).d());
                object12.add(((dfx)object8).a());
                if (bl2) continue;
                object5 = dde.a((ddn)object72, (String)object62);
                ((dfx)object8).c(((den)object10).o());
                ((dfx)object8).b(((den)object10).b());
                ((dfx)object8).a = object9;
                if (object62 == null) {
                    ((dfx)object8).c((ddn)object5);
                    ((dfx)object8).e(0L);
                    object12.add(((dfx)object8).a());
                    continue;
                }
                ((dfx)object8).c((ddn)object5);
                ((dfx)object8).e(((den)object10).c());
                object12.add(((dfx)object8).a());
                ((dfx)object8).c(dde.b((ddn)object72));
                ((dfx)object8).e(0L);
                object12.add(((dfx)object8).a());
            }
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "requestNewPacks", 253, "PacksRequest.java")).H("Attempting %d reservations for %s for %d bytes: %s", object12.size(), this.a, new aim(object12, 9).a(), object12);
            ((dfu)((Object)hashMap)).k(new ArrayList(object12));
        }
        object5 = object.iterator();
        while (object5.hasNext()) {
            long l2;
            hashMap = ((der)object5.next()).f();
            object11 = new dfh(((den)((Object)hashMap)).o(), ((den)((Object)hashMap)).k());
            hashMap = this.a;
            try {
                object8 = ((dfn)object32).a.getWritableDatabase();
                object72 = new ContentValues(3);
                object72.put("parent_id", hashMap);
                object72.put("pack_name", ((dfh)object11).a.toString());
                object72.put("packing_scheme", ((dfh)object11).b);
                l2 = object8.replaceOrThrow("pending_packs", null, (ContentValues)object72);
                if (l2 >= 0L) continue;
            }
            catch (SQLiteException sQLiteException) {
                object2 = ((dfn)object32).a;
                IOException iOException = new IOException("SqlitePendingPacks#add, SQL replace failed, parentId: ".concat((String)((Object)hashMap)), sQLiteException);
                object2.a(iOException);
                throw iOException;
            }
            object = ((dfn)object32).a;
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("SqlitePendingPacks#add, SQL replace returned < 0, parentId: ");
            ((StringBuilder)object4).append((String)((Object)hashMap));
            ((StringBuilder)object4).append(" rowId: ");
            ((StringBuilder)object4).append(l2);
            object2 = new IOException(((StringBuilder)object4).toString());
            object.a((IOException)object2);
            throw object2;
        }
        object9 = new ArrayList(object.size());
        hashMap = object.iterator();
        while (hashMap.hasNext()) {
            den den2;
            block17: {
                object12 = (der)hashMap.next();
                den2 = ((der)object12).f();
                for (Object object72 : ((AmbientMode$AmbientController)object4).h()) {
                    object5 = object72.d(den2);
                    if (object5 == null) continue;
                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/FetchContext", "create", 66, "FetchContext.java")).C("Found fetcher for %s: %s", den2, object72.c());
                    break block17;
                }
                object72 = null;
                object5 = null;
            }
            if (object72 == null) throw new dhi(den2);
            fxf.K(object5);
            object8 = ((elq)object5).b;
            if (object8 != null) {
                block18: {
                    for (Object object32 : ((AmbientMode$AmbientController)object4).i()) {
                        if (!object32.d((String)object8)) continue;
                        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/FetchContext", "create", 83, "FetchContext.java")).C("Found unpacker for %s: %s", den2, object32.c());
                        break block18;
                    }
                    object32 = null;
                }
                if (object32 == null) throw new dhj(den2, (String)object8);
                object8 = object32;
            } else {
                object8 = null;
            }
            object32 = den2.h();
            n2 = ((hct)object32).c;
            object11 = null;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string;
                block19: {
                    string = (String)object32.get(i2);
                    for (Object object62 : ((AmbientMode$AmbientController)object4).j()) {
                        dly dly2 = ((dgh)object62).b;
                        if (string == null || dly.F(string) == null) continue;
                        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/FetchContext", "create", 103, "FetchContext.java")).C("Found validator for %s: %s", den2, "ChecksumValidator");
                        break block19;
                    }
                    object62 = null;
                }
                if (object62 == null) throw new dhk(den2, string);
                object10 = object11;
                if (object11 == null) {
                    object10 = new gzy();
                }
                ((gzy)object10).d(string, object62);
                object11 = object10;
            }
            object32 = object11 == null ? hcy.a : ((gzy)object11).b();
            ((ArrayList)object9).add(new dge((der)object12, (dej)object72, (elq)object5, (des)object8, (hac)object32, ((AmbientMode$AmbientController)object4).g(((dco)den2.o()).a)));
        }
        hashMap = new HashMap<Object, hpn>();
        object5 = object9.iterator();
        while (object5.hasNext()) {
            object72 = (dgx)object5.next();
            object32 = ((dgx)object72).c().f();
            object8 = ((dgx)object72).c();
            object4 = ((der)object8).f().o();
            ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "request", 242, "FetchPipeline.java")).u("Fetch pipeline requesting slice %s", object8);
            object8 = (AmbientDelegate)kpo2.d.get(object4);
            if (object8 != null) {
                ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "request", 247, "FetchPipeline.java")).u("There is a pending fetch request for %s", object4);
                ((AmbientDelegate)object8).a.cancel(true);
                ((dcx)((AmbientDelegate)object8).c).b();
            }
            object72 = new AmbientDelegate((dgx)object72);
            object8 = kpo2.j((AmbientDelegate)object72);
            ((AmbientDelegate)object72).a = object8 = hhk.Z(new hpn[]{object8}).b(new dcf(kpo2, (ddn)object4, (hpn)object8, 3), (Executor)kpo2.b);
            kpo2.d.put(object4, object72);
            hashMap.put(object32, hhk.L((hpn)object8));
        }
        return hhk.Y(hashMap.values()).a(new czm(object, hashMap, 4), (Executor)object2);
    }
}

