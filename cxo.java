/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  hom
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class cxo
implements cxl {
    private final Context a;
    private final cuv b;
    private final gto c;

    public cxo(Context context, cuv cuv2, gto gto2) {
        this.a = context;
        this.b = cuv2;
        this.c = gto2;
    }

    @Override
    public final hpn a() {
        cqq.z(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return hhk.K(null);
    }

    @Override
    public final hpn c() {
        ArrayList<ctt> arrayList = new ArrayList<ctt>();
        SharedPreferences sharedPreferences = cqq.z(this.a, "gms_icing_mdd_shared_files", this.c);
        Iterator iterator = sharedPreferences.getAll().keySet().iterator();
        cuv cuv2 = null;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            try {
                arrayList.add(cqq.I(string, this.a, this.b));
            }
            catch (czs czs2) {
                cyr.q(czs2, "Failed to deserialize newFileKey:".concat(String.valueOf(string)));
                cuv cuv3 = this.b;
                guf.c("|").g(string).size();
                cuv3.a();
                cuv3 = cuv2;
                if (cuv2 == null) {
                    cuv3 = sharedPreferences.edit();
                }
                cuv3.remove(string);
                cuv2 = cuv3;
            }
        }
        if (cuv2 != null) {
            cuv2.commit();
        }
        return hhk.K(arrayList);
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn d() {
        boolean bl2 = cqq.s(this.a);
        boolean bl3 = false;
        if (bl2) {
            Object object;
            cwq cwq2;
            block24: {
                cwq2 = cwq.a(cqq.l());
                Object object2 = cqq.r(this.a, this.b);
                int n2 = cwq2.d;
                int n3 = object2.d;
                if (n2 == n3) {
                    bl3 = true;
                } else if (n2 < n3) {
                    cyr.i("%s Cannot migrate back from value %s to %s. Clear everything!", new Object[]{"SharedFilesMetadata", object2, cwq2});
                    cuv cuv2 = this.b;
                    object2 = String.valueOf(object2);
                    String string = String.valueOf((Object)cwq2);
                    StringBuilder stringBuilder = new StringBuilder("Downgraded file key from ");
                    stringBuilder.append((String)object2);
                    stringBuilder.append(" to ");
                    stringBuilder.append(string);
                    stringBuilder.append(".");
                    new Exception(stringBuilder.toString());
                    cuv2.a();
                    cqq.t(this.a, cwq2);
                } else {
                    n2 = n3 + 1;
                    while (true) {
                        block22: {
                            block23: {
                                hwv hwv2;
                                hwv hwv3;
                                String string;
                                if (n2 > cwq2.d) break;
                                object2 = cwq.a(n2);
                                n3 = object2.ordinal();
                                if (n3 != 1) {
                                    if (n3 == 2) {
                                        cyr.c("%s: Starting migration to dedup on checksum only", "SharedFilesMetadata");
                                        object2 = cqq.z(this.a, "gms_icing_mdd_shared_files", this.c);
                                        string = object2.edit();
                                        for (String string2 : object2.getAll().keySet()) {
                                            try {
                                                hwv3 = cqq.I(string2, this.a, this.b);
                                            }
                                            catch (czs czs2) {
                                                cyr.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", string2);
                                                this.b.a();
                                                string.remove(string2);
                                                continue;
                                            }
                                            hwv2 = (ctv)cqq.B((SharedPreferences)object2, string2, (hym)ctv.a.C(7));
                                            if (hwv2 == null) {
                                                cyr.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                                string.remove(string2);
                                                continue;
                                            }
                                            cqq.E((SharedPreferences.Editor)string, string2);
                                            cqq.F((SharedPreferences.Editor)string, cqq.L(hwv3), hwv2);
                                        }
                                        if (string.commit()) break block22;
                                        cyr.f("Failed to commit migration metadata to disk");
                                        object = this.b;
                                        new Exception("Migrate to ChecksumOnly failed.");
                                        object.a();
                                        break block23;
                                    }
                                    string = object2.name();
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("Upgrade to version ");
                                    ((StringBuilder)object2).append(string);
                                    ((StringBuilder)object2).append("not supported!");
                                    object = new UnsupportedOperationException(((StringBuilder)object2).toString());
                                    throw object;
                                }
                                cyr.c("%s: Starting migration to add download transform", "SharedFilesMetadata");
                                object2 = cqq.z(this.a, "gms_icing_mdd_shared_files", this.c);
                                string = object2.edit();
                                for (String string2 : object2.getAll().keySet()) {
                                    try {
                                        hwv2 = cqq.I(string2, this.a, this.b);
                                    }
                                    catch (czs czs3) {
                                        cyr.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", string2);
                                        this.b.a();
                                        string.remove(string2);
                                        continue;
                                    }
                                    hwv3 = (ctv)cqq.B((SharedPreferences)object2, string2, (hym)ctv.a.C(7));
                                    if (hwv3 == null) {
                                        cyr.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        string.remove(string2);
                                        continue;
                                    }
                                    cqq.E((SharedPreferences.Editor)string, string2);
                                    cqq.F((SharedPreferences.Editor)string, cqq.M(hwv2), hwv3);
                                }
                                if (string.commit()) break block22;
                                cyr.f("Failed to commit migration metadata to disk");
                                object = this.b;
                                new Exception("Migrate to DownloadTransform failed.");
                                object.a();
                            }
                            if (cqq.r((Context)this.a, (cuv)this.b).d != cwq2.d && !cqq.t(this.a, cwq2)) {
                                cyr.f(a.av((Object)cwq2, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                object = this.b;
                                new Exception(a.av((Object)cwq2, "Fail to set target version ", "."));
                                object.a();
                            }
                            bl3 = false;
                            break block24;
                        }
                        cqq.t(this.a, cwq.a(n2));
                        ++n2;
                        continue;
                        break;
                    }
                    if (cqq.r((Context)this.a, (cuv)this.b).d != cwq2.d && !cqq.t(this.a, cwq2)) {
                        cyr.f(a.av((Object)cwq2, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                        object = this.b;
                        new Exception(a.av((Object)cwq2, "Fail to set target version ", "."));
                        object.a();
                    }
                    bl3 = true;
                }
            }
            return hhk.K(bl3);
            catch (Throwable throwable) {
                if (cqq.r((Context)this.a, (cuv)this.b).d != cwq2.d && !cqq.t(this.a, cwq2)) {
                    cyr.f(a.av((Object)cwq2, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                    object = this.b;
                    new Exception(a.av((Object)cwq2, "Fail to set target version ", "."));
                    object.a();
                }
                throw throwable;
            }
        }
        cyr.c("%s Device isn't migrated to new file key, clear and set migration.", "SharedFilesMetadata");
        cqq.u(this.a);
        cqq.t(this.a, cwq.a(cqq.l()));
        return hhk.K(false);
    }

    @Override
    public final hpn e(ctt ctt2) {
        return fxf.aj(this.f(new hdq(ctt2)), new cws(ctt2, 19), (Executor)hom.a);
    }

    @Override
    public final hpn f(hav object) {
        SharedPreferences sharedPreferences = cqq.z(this.a, "gms_icing_mdd_shared_files", this.c);
        gzy gzy2 = new gzy();
        hdx hdx2 = ((hav)object).k();
        while (hdx2.hasNext()) {
            object = (ctt)hdx2.next();
            ctv ctv2 = (ctv)cqq.B(sharedPreferences, cqq.J((ctt)object, this.a, this.b), (hym)ctv.a.C(7));
            if (ctv2 == null) continue;
            gzy2.d(object, ctv2);
        }
        return hhk.K(gzy2.a());
    }

    @Override
    public final hpn g(ctt object) {
        Context context = this.a;
        gto gto2 = this.c;
        object = cqq.J((ctt)object, context, this.b);
        return hhk.K(cqq.G(cqq.z(context, "gms_icing_mdd_shared_files", gto2), (String)object));
    }

    @Override
    public final hpn h(ctt object, ctv ctv2) {
        Context context = this.a;
        gto gto2 = this.c;
        object = cqq.J((ctt)object, context, this.b);
        return hhk.K(cqq.H(cqq.z(context, "gms_icing_mdd_shared_files", gto2), (String)object, ctv2));
    }
}

