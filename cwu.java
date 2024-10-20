/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  hom
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cwu
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ cwu(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.b;
        Object object2 = true;
        Object object3 = false;
        switch (n2) {
            default: {
                object = (IOException)object;
                ((css)this.a).addSuppressed((Throwable)object);
                return hpj.a;
            }
            case 19: {
                if (!((Boolean)object).booleanValue()) {
                    cyr.h("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", this.a);
                    object = css.a();
                    ((kqr)object).b = csr.I;
                    object = hhk.J(((kqr)object).a());
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 18: {
                object = (Void)object;
                return hhk.J((Throwable)this.a);
            }
            case 17: {
                object = (IOException)object;
                ((css)this.a).addSuppressed((Throwable)object);
                return hpj.a;
            }
            case 16: {
                object3 = (List)object;
                object2 = new ArrayList();
                Iterator iterator = object3.iterator();
                while (true) {
                    object = this.a;
                    if (!iterator.hasNext()) break;
                    ctq ctq2 = (ctq)iterator.next();
                    object2.add(((cxm)object).g(ctq2));
                }
                return crh.w((Iterable)object2).v(new ctz(object3, object2, 9, null), ((cxm)object).a);
            }
            case 15: {
                if (!((Boolean)object).booleanValue()) {
                    cyr.h("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", this.a);
                    object = hhk.K(object3);
                } else {
                    object = hhk.K(object2);
                }
                return object;
            }
            case 14: {
                if (!((Boolean)object).booleanValue()) {
                    cyr.h("%s: Unable to modify file subscription for key %s", "SharedFileManager", this.a);
                    object = hhk.K(object3);
                } else {
                    object = hhk.K(object2);
                }
                return object;
            }
            case 13: {
                object3 = (List)object;
                object = new ArrayList();
                object2 = this.a;
                try {
                    for (ctt ctt2 : object3) {
                        object.add(((egg)object2).j(ctt2));
                    }
                }
                catch (Exception exception) {
                    ((egg)object2).d.a();
                }
                return crh.w((Iterable)object).v(new cqg(object2, 4), (Executor)((egg)object2).a);
            }
            case 12: {
                object = (ctv)object;
                if (object == null) {
                    cyr.h("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", this.a);
                    object = hhk.J(new cxk());
                } else {
                    object = hhk.K(object);
                }
                return object;
            }
            case 11: {
                object = (Void)object;
                object3 = new cwt(6);
                object2 = (cxa)this.a;
                object = ((cxa)object2).b;
                return ((cxa)object2).c.b((gte)object3, (Executor)object);
            }
            case 10: {
                object = (Void)object;
                object = this.a;
                object2 = (cwz)object;
                return fxf.ak(((cwz)object2).e.a(), new cvv(object, 20), ((cwz)object2).i);
            }
            case 9: {
                int n3;
                object = (Void)object;
                object2 = this.a;
                object = (cwz)object2;
                object3 = ((cwz)object).h;
                object3 = cqq.z(((cwz)object).b, "gms_icing_mdd_manager_metadata", object3);
                if (!object3.contains("gms_icing_mdd_reset_trigger")) {
                    object3.edit().putInt("gms_icing_mdd_reset_trigger", cqq.p()).commit();
                }
                if ((n3 = object3.getInt("gms_icing_mdd_reset_trigger", 0)) < (n2 = cqq.p())) {
                    object3.edit().putInt("gms_icing_mdd_reset_trigger", n2).commit();
                    cyr.c("%s Received reset trigger. Clearing all Mdd data.", "MDDManager");
                    ((cwz)object).m.d(1045);
                    object3 = ((cwz)object).q;
                    object = fxf.ak(fxf.ak(object3.f.c(), new cwu(object3, 13), (Executor)object3.a), new cwu(object2, 10), ((cwz)object).i);
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 8: {
                object = (Void)object;
                return ((cwz)this.a).d.c();
            }
            case 7: {
                object = (Void)object;
                object = !inw.a.b().g() ? hhk.K(-1) : dah.e(((cwz)this.a).k.b()).b(IOException.class, new cwt(2), (Executor)hom.a).f(new cwt(3), (Executor)hom.a);
                return object;
            }
            case 6: {
                object = (Void)object;
                return ((cwz)this.a).d.f();
            }
            case 5: {
                object = (Void)object;
                object2 = this.a;
                object = (cwz)object2;
                return fxf.ak(((cwz)object).e.d(), new cwu(object2, 0), ((cwz)object).i);
            }
            case 4: {
                object = (Void)object;
                object = this.a;
                object3 = (cwz)object;
                egg egg2 = object3.q;
                SharedPreferences sharedPreferences = cqq.z((Context)egg2.k, "gms_icing_mdd_shared_file_manager_metadata", (gto)egg2.l);
                if (sharedPreferences.contains("migrated_to_new_file_key")) {
                    if (sharedPreferences.getBoolean("migrated_to_new_file_key", false)) {
                        cqq.u((Context)egg2.k);
                    }
                    sharedPreferences.edit().remove("migrated_to_new_file_key").commit();
                }
                return fxf.ak(hhk.K(object2), new cwu(object, 1), object3.i);
            }
            case 3: {
                object = (Void)object;
                object = (cwz)this.a;
                object2 = ((cwz)object).h;
                object2 = cqq.z(((cwz)object).b, "gms_icing_mdd_manager_metadata", (gto)object2);
                if (!object2.getBoolean("mdd_migrated_to_offroad", false)) {
                    cyr.c("%s Clearing MDD as device isn't migrated to offroad.", "MDDManager");
                    object = fxf.aj(((cwz)object).a(), new cws(object2, 1), ((cwz)object).i);
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 2: {
                object2 = (List)object;
                object = new ArrayList();
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    Object object4 = this.a;
                    cxr cxr2 = (cxr)iterator.next();
                    object2 = cxr2.a.c;
                    object3 = (cwz)object4;
                    object.add(dah.e(object3.l.c((String)object2)).g(new cww(object4, cxr2, 0), object3.i).g(new cww(object4, cxr2, 2), object3.i));
                }
                return crh.w((Iterable)object).u(new cuh(12), (Executor)hom.a);
            }
            case 1: {
                if (!((Boolean)object).booleanValue()) {
                    object = this.a;
                    cyr.m("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                    object = ((cwz)object).a();
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 0: 
        }
        if (!((Boolean)object).booleanValue()) {
            object = this.a;
            cyr.m("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
            object = ((cwz)object).a();
        } else {
            object = hpj.a;
        }
        return object;
    }
}

