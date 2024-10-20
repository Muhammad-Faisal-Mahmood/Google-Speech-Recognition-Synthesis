/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.work.WorkerParameters;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class etu
implements hnx {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ etu(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ etu(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final hpn a() {
        switch (this.c) {
            default: {
                gmb gmb2 = (gmb)this.b;
                hhk.S(gmb2.b);
                ((Long)hhk.S((Future)this.a)).longValue();
                return gmb2.a.b();
            }
            case 15: {
                UUID uUID = ((WorkerParameters)this.b).a;
                return ((gls)this.a).e.a(uUID);
            }
            case 14: {
                UUID uUID = ((WorkerParameters)this.b).a;
                return ((glp)this.a).b.a(uUID);
            }
            case 13: {
                Object object = this.b;
                frn frn2 = new frn(object, 18);
                gld gld2 = (gld)this.a;
                return hhk.R(hno.f(fxf.ai(frn2, gld2.c), new gtf(), (Executor)hom.a), ((gkl)object).a().b, TimeUnit.MILLISECONDS, gld2.b);
            }
            case 12: {
                ((heg)((heg)gld.a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInline", 613, "SyncManagerImpl.java")).r("Scheduling next wakeup");
                gld gld3 = (gld)this.b;
                long l2 = (Long)hhk.S(gld3.j);
                hpn hpn2 = gld3.g((hpn)this.a, l2);
                gld3.d.d(hpn2);
                hpn2.c(new gjf(hpn2, 5), gld3.b);
                return hpn2;
            }
            case 11: {
                Object object = this.a;
                cya cya2 = ((ggh)this.b).l;
                String string = ((AmbientModeSupport$AmbientController)cya2.e).h((String)object);
                object = (hnx)((Map)cya2.c.b()).get(string);
                Object object2 = (ggo)((Map)cya2.d.b()).get(string);
                object = object != null ? fxf.ai((hnx)object, (Executor)cya2.a) : (object2 != null && (object = object2.b()) != null ? fxf.ai((hnx)object, (Executor)cya2.a) : null);
                object2 = object2 != null && (object2 = object2.a()) != null ? fxf.aj(fxf.ai((hnx)object2, (Executor)cya2.a), new fmi(gga.a, 20), (Executor)hom.a) : null;
                if (object == null && object2 == null) {
                    object = hpj.a;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    jns.ad(new hpn[]{object, object2}, linkedHashSet);
                    object = fxf.aB(linkedHashSet).C(new cvt((Object)cya2, (Object)string, object, (hpn)object2, 10), (Executor)hom.a);
                }
                return object;
            }
            case 10: {
                Object object = this.b;
                jse.e(object, "$snapshot");
                Object object3 = this.a;
                return hno.g(((gfv)object3).n.c(), gqk.d(new fbk(object3, object, 8)), (Executor)hom.a);
            }
            case 9: {
                boolean bl2;
                hwv hwv2;
                gfq gfq2 = (gfq)this.b;
                Object object = gfq2.a;
                jse.e(object, "packageName");
                cya cya3 = (cya)this.a;
                cya cya4 = (cya)cya3.b;
                if (((bzo)cya4.c).L((String)object)) {
                    dvi dvi2 = ((dwq)cya4.a).b();
                    if (dvi2.e) {
                        new hxd(dvi2.i, dvi.a).contains(hqn.e);
                    }
                    hvu hvu2 = dvi2.d;
                    jse.d(hvu2, "getSecret(...)");
                    String string = dvi2.f;
                    jse.d(string, "getDirPath(...)");
                    object = dvi2.g;
                    jse.d(object, "getIncludeStaticConfigPackagesList(...)");
                    Set set = jns.x((Iterable)object);
                    object = dvi2.h;
                    jse.d(object, "getExcludeStaticConfigPackagesList(...)");
                    Set set2 = jns.x((Iterable)object);
                    hwv2 = dvi2.j;
                    object = hwv2;
                    if (hwv2 == null) {
                        object = dvj.a;
                    }
                    jse.d(object, "getGmsCoreDataDirectory(...)");
                    cya.j((dvj)object);
                    bl2 = dvi2.k;
                    ((dwq)cya4.a).d();
                    jse.e(hvu2, "secret");
                    jse.e(string, "dirPath");
                    jse.e(set, "includeStaticConfigPackages");
                    jse.e(set2, "excludeStaticConfigPackages");
                } else {
                    dvh dvh2 = ((dwq)cya4.a).a();
                    if (dvh2.e) {
                        new hxd(dvh2.j, dvh.a).contains(hqn.e);
                    }
                    hvu hvu3 = dvh2.d;
                    jse.d(hvu3, "getSecret(...)");
                    String string = dvh2.f;
                    jse.d(string, "getDirPath(...)");
                    object = dvh2.h;
                    jse.d(object, "getIncludeStaticConfigPackagesList(...)");
                    Set set = jns.x((Iterable)object);
                    object = dvh2.i;
                    jse.d(object, "getExcludeStaticConfigPackagesList(...)");
                    Set set3 = jns.x((Iterable)object);
                    hwv2 = dvh2.k;
                    object = hwv2;
                    if (hwv2 == null) {
                        object = dvj.a;
                    }
                    jse.d(object, "getGmsCoreDataDirectory(...)");
                    cya.j((dvj)object);
                    bl2 = dvh2.l;
                    ((dwq)cya4.a).e();
                    jse.e(hvu3, "secret");
                    jse.e(string, "dirPath");
                    jse.e(set, "includeStaticConfigPackages");
                    jse.e(set3, "excludeStaticConfigPackages");
                }
                if (bl2) {
                    object = cya3.d;
                    hwv2 = gfq2.b;
                    object = ((duw)object).a().b((dup)hwv2);
                } else {
                    object = cya3.d;
                    hwv2 = gfq2.b;
                    object = ((duw)object).a().a(((dup)hwv2).c);
                }
                return fxf.ae((hpn)object, dut.class, new fmi(ero.k, 17), (Executor)hom.a);
            }
            case 8: {
                Object object = this.a;
                jse.e(object, "$packageName");
                return this.b.a(object);
            }
            case 7: {
                Object object = (Set)((imc)((cya)this.b).d).a;
                ArrayList<hpn> arrayList = new ArrayList<hpn>(object.size());
                object = object.iterator();
                while (object.hasNext()) {
                    fzf fzf2 = (fzf)object.next();
                    try {
                        arrayList.add(fzf2.a());
                    }
                    catch (Exception exception) {
                        arrayList.add(hhk.J(exception));
                    }
                }
                object = this.a;
                object.addAll(arrayList);
                return hhk.aa((Iterable)object).a(new dwp(12), (Executor)hom.a);
            }
            case 6: {
                Object object = (fby)this.b;
                if (!((fby)object).i) {
                    Object object4 = this.a;
                    ((fby)object).i = true;
                    long l3 = ((fby)object).c;
                    StringBuilder stringBuilder = new StringBuilder("onSchedule: ");
                    stringBuilder.append(l3 / 1000L);
                    stringBuilder.append(" sec timeout.");
                    ((fby)object).e(stringBuilder.toString(), 1);
                    object = new fbw(0);
                    ((Optional)object4).ifPresent(object);
                }
                return hpj.a;
            }
            case 5: {
                fby fby2 = (fby)this.b;
                if (!fby2.i) {
                    Object object = this.a;
                    fby2.i = true;
                    heg heg2 = (heg)((heg)fby.a.g().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "onFailure", 140, "ModelDownloadCallback.java");
                    ezj ezj2 = fby2.b;
                    int n2 = ezj2.b;
                    object = ((Throwable)object).getMessage();
                    heg2.G("Language pack %s[%s] download MDD failure: %s", ezj2.a, n2, object);
                    fby2.e("onSchedule", 3);
                    fby2.e.ifPresent(new fbw(0));
                }
                return hpj.a;
            }
            case 4: {
                Object object = this.b;
                Object object5 = this.a;
                hpn hpn3 = object.b();
                ((euc)object5).c.x(hpn3, ((etn)object).d);
                return hpn3;
            }
            case 3: {
                Object object = this.b;
                jse.e(object, "$reason");
                return ((eua)this.a).a.c((ebg)object);
            }
            case 2: {
                Object object = this.b;
                Object object6 = this.a;
                hpn hpn4 = object.b();
                ((etw)object6).c.x(hpn4, ((etn)object).d);
                return hpn4;
            }
            case 1: {
                Object object = this.b;
                jse.e(object, "$reason");
                return ((eqo)this.a).a.h((ebv)object);
            }
            case 0: 
        }
        Object object = this.b;
        jse.e(object, "$reason");
        return ((ets)this.a).a.c((ebg)object);
    }
}

