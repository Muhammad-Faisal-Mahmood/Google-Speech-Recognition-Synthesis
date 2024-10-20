/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  hom
 */
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

public final class frn
implements hnx {
    public final Object a;
    private final int b;

    public /* synthetic */ frn(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public frn(Map.Entry entry, int n2) {
        this.b = n2;
        this.a = entry;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        int n2 = this.b;
        int n3 = 0;
        switch (n2) {
            default: {
                return this.a.a();
            }
            case 19: {
                return this.a;
            }
            case 18: {
                Object object = (gkl)this.a;
                hue hue2 = new hue(((gkl)object).b().b());
                ((heg)((heg)gld.a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 420, "SyncManagerImpl.java")).u("Starting synclet: %s", hue2);
                fxf.B(((gkl)object).a, "Synclet binding must be enabled to have a Synclet");
                fxf.B(((gkl)object).a, "Synclet binding must be enabled to have a SyncletProvider");
                object = ((gkl)object).b;
                fxf.K(object);
                ((hfk)((hfk)ezw.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/backgroundtask/LanguagePackAutoUpdateSynclet", "sync", 36, "LanguagePackAutoUpdateSynclet.java")).r("#sync");
                object = (ezw)((dan)object).a;
                if (crt.d(((ezw)object).c)) {
                    ((hfk)((hfk)ezw.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/backgroundtask/LanguagePackAutoUpdateSynclet", "sync", 39, "LanguagePackAutoUpdateSynclet.java")).r("Skipping LanguagePackSynclet because of direct boot mode.");
                    return hpj.a;
                }
                object = (ezy)((ezw)object).b.b();
                ((ezy)object).d.a(dxv.ah);
                grf.g(((ezy)object).c.a()).i(new cyc(object, 19), ((ezy)object).e).j(new cmr(object, 6), ((ezy)object).e);
                return hpj.a;
            }
            case 17: {
                Object object = this.a;
                ghi ghi2 = new ghi(object, 4);
                gld gld2 = (gld)object;
                object = gld2.b;
                return gld2.f(fxf.ak(gld2.j, ghi2, (Executor)object));
            }
            case 16: {
                return ((ghb)((jnu)this.a.getValue()).b()).a();
            }
            case 15: {
                hpn hpn2 = fxf.ae(((ggh)this.a).k.i(), cdb.class, new ggk(ero.l, 1), (Executor)hom.a);
                gax.c(hpn2, "Failed to update StorageInfos after registration", new Object[0]);
                return hpn2;
            }
            case 14: {
                return ((gfv)this.a).n.c();
            }
            case 13: {
                fxf.av();
                Object object = this.a;
                grf grf2 = grf.g(((gfv)object).q.a()).i(new frm(new eia(object, 8, null), 13), (Executor)hom.a);
                return hhk.Z(grf2).a(gqk.j(new czm(grf2, object, 19, null)), (Executor)hom.a);
            }
            case 12: {
                Object object = this.a;
                jse.e(object, "$futures");
                return hhk.H((Iterable)object);
            }
            case 11: {
                Object object = this.a;
                jse.e(object, "$callable");
                return ((hnx)object.b()).a();
            }
            case 10: {
                Object object = this.a;
                jse.e(object, "$proto");
                return hhk.K(object.b());
            }
            case 9: {
                Object object = this.a;
                jse.e(object, "$callable");
                return fxf.aj(((hnx)object.b()).a(), new fmi(gfg.a, 14), (Executor)hom.a);
            }
            case 8: {
                Object object = this.a;
                jse.e(object, "$proto");
                return hhk.K(((hyf)object.b()).g());
            }
            case 7: {
                return this.a;
            }
            case 6: {
                gae gae2 = (gae)this.a;
                File file = new File(((Context)gae2.c.b).getApplicationInfo().dataDir, "shared_prefs/accounts.xml");
                Object object = file;
                if (!file.exists()) {
                    object = new File(String.valueOf(file.getPath()).concat(".bak"));
                }
                if (!((File)object).exists()) return hhk.K(false);
                return fxf.aj(((frr)gae2.c.a).a(), new fmi(4), (Executor)hom.a);
            }
            case 5: {
                return this.a.a();
            }
            case 4: {
                Object object = this.a;
                Object object2 = ((fyq)object).c;
                synchronized (object2) {
                    object = gzx.o(((fyq)object).c);
                }
                ArrayList<Object> arrayList = new ArrayList<Object>(((AbstractCollection)object).size());
                n2 = object.size();
                while (n3 < n2) {
                    object2 = (fyp)object.get(n3);
                    try {
                        object2 = object2.a();
                    }
                    catch (Throwable throwable) {
                        a.as(fyq.a.g(), "OnRequirementStateChanged observer failed.", "com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", '\u00c6', "AccountRequirementManagerImpl.java", throwable);
                        object2 = hhk.K(null);
                    }
                    arrayList.add(object2);
                    ++n3;
                }
                return hhk.Y(arrayList).a(new dwp(12), (Executor)hom.a);
            }
            case 3: {
                return hhk.K(this.a);
            }
            case 2: {
                return this.a;
            }
            case 1: {
                Object object = this.a;
                hny hny2 = gqk.d(new frm(object, 0));
                object = (frp)object;
                Executor executor = ((frp)object).c;
                return hhk.L(hno.g(((frp)object).b, hny2, executor));
            }
            case 0: 
        }
        Object object = this.a;
        frp frp2 = (frp)object;
        Object object3 = (Uri)hhk.S(frp2.b);
        try {
            return hhk.K(((frp)object).b((Uri)object3));
        }
        catch (IOException iOException) {
            object3 = new bzq(object, null);
            if (!frp2.d.g()) {
                return hhk.J(iOException);
            }
            if (iOException instanceof fpx) return hhk.J(iOException);
            if (iOException.getCause() instanceof fpx) return hhk.J(iOException);
            return hno.g(((frb)frp2.d.c()).a(iOException, (bzq)object3), gqk.d(new frm(object, 1)), frp2.c);
        }
    }
}

