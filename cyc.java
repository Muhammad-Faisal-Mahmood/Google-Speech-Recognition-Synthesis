/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

public final class cyc
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ cyc(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        switch (this.b) {
            default: {
                Object object2 = (hav)object;
                object = this.a;
                object2 = Collection$_EL.stream((Collection)object2);
                Objects.requireNonNull(object);
                object = object2.filter(new bod(object, 19));
                int n2 = gzx.d;
                return hhk.K((gzx)object.collect(gye.a));
            }
            case 19: {
                ezy ezy2;
                Object object3 = (fao)object;
                int n3 = gzx.d;
                object = hhk.K(hct.a);
                boolean bl2 = ((Enum)object3).equals(fao.b);
                object3 = this.a;
                if (!bl2) {
                    ezy2 = (ezy)object3;
                    Object object4 = ezy2.b;
                    object = object4.a();
                    object4 = object4.d();
                    object = fxf.aE(new hpn[]{object, object4}).C(new dcf(object3, object, object4, 5), ezy2.e);
                }
                ezy2 = (ezy)object3;
                return fxf.aE(new hpn[]{object, fxf.ak(ezy2.b.g(), new cyc(object3, 18), ezy2.e)}).C(new evs(2), ezy2.e);
            }
            case 18: {
                object = (gzx)object;
                ((hfk)((hfk)ezy.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/backgroundtask/LanguagePackMaintenance", "purgeStalePacks", 150, "LanguagePackMaintenance.java")).x("Background deleting %d stale packs: %s", ((AbstractCollection)object).size(), ezj.a((Collection)object));
                object = Collection$_EL.stream(object);
                ezl ezl2 = ((ezy)this.a).b;
                Objects.requireNonNull(ezl2);
                return hhk.H((Iterable)object.map(new bof(ezl2, 13)).collect(gye.a));
            }
            case 17: {
                return a.n((jrk)this.a, object);
            }
            case 16: {
                return a.n((jrk)this.a, object);
            }
            case 15: {
                return a.n((jrk)this.a, object);
            }
            case 14: {
                return a.n((jrk)this.a, object);
            }
            case 13: {
                object = (Void)object;
                return hhk.L((hpn)((dwq)this.a).g.a());
            }
            case 12: {
                object = (dwn)object;
                return ((dwm)this.a).b((dwn)object);
            }
            case 11: {
                int n4;
                dut dut2 = (dut)object;
                int n5 = n4 = dut2.a;
                if (n4 != 29501) {
                    n5 = n4;
                    if (n4 != 29537) {
                        n5 = n4;
                        if (n4 != 29538) {
                            n5 = n4;
                            if (n4 != 29539) {
                                n5 = n4;
                                if (n4 != 29540) {
                                    n5 = n4;
                                    if (n4 != 29541) {
                                        n5 = n4;
                                        if (n4 != 29542) {
                                            n5 = n4;
                                            if (n4 != 29543) {
                                                if (n4 != 29544) return hhk.J(dut2);
                                                n5 = 29544;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                dvr dvr2 = (dvr)this.a;
                boolean bl3 = dvr2.f.c();
                object = new StringBuilder("Failed to commit due to stale snapshot for ");
                ((StringBuilder)object).append(dvr2.b);
                ((StringBuilder)object).append(". Experiments may be delayed til next app start. Error code: ");
                ((StringBuilder)object).append(n5);
                String string = ((StringBuilder)object).toString();
                object = string;
                if (!bl3) {
                    object = string.concat(". Triggering flag update.");
                }
                Log.w((String)"MobStoreFlagStore", (String)object);
                if (bl3) return hhk.J(dut2);
                dvr2.b();
                return hhk.J(dut2);
            }
            case 10: {
                object = (dwn)object;
                return ((dwm)this.a).b((dwn)object);
            }
            case 9: {
                object = (Throwable)object;
                ((hfk)((hfk)((hfk)ddd.a.g()).i((Throwable)object)).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadTask", "download", 123, "ScheduledDownloadTask.java")).u("Download %s failed to stop", ((dfd)this.a).d().e());
                return hhk.K(new dei(null));
            }
            case 8: {
                object = (Map)object;
                Object object5 = this.a;
                object5.putAll(object);
                return hhk.K(object5);
            }
            case 7: {
                object = (Boolean)object;
                return hhk.K(this.a);
            }
            case 6: {
                object = (gto)object;
                if (!((gto)object).g()) return hpj.a;
                cyr.k("%s: CancelForegroundDownload future found for key = %s, cancelling...", "DownloaderImp", this.a);
                ((hpn)((gto)object).c()).cancel(false);
                return hpj.a;
            }
            case 5: {
                object = (Void)object;
                return ((cyx)this.a).c.a();
            }
            case 4: {
                Object object6;
                Object object7 = (cts)object;
                object = object6 = ((cts)object7).f;
                if (object6 == null) {
                    object = ctu.a;
                }
                if ((((ctu)object).b & 1) != 0) {
                    object = object6 = ((cts)object7).f;
                    if (object6 != null) return hhk.K(object);
                    object = ctu.a;
                    return hhk.K(object);
                }
                Object object8 = this.a;
                object = new cym(object8, 4);
                object7 = (cyx)object8;
                object6 = ((cyx)object7).a;
                return dah.e(((cyx)object7).c.b((gte)object, (Executor)object6)).g(new cyc(object8, 5), ((cyx)object7).a).f(new cxc(8), ((cyx)object7).a);
            }
            case 3: {
                object = (Map)object;
                return ((cyo)this.a).f((Map)object);
            }
            case 2: {
                object = (Void)object;
                throw (Throwable)this.a;
            }
            case 1: {
                object = (Void)object;
                return hhk.J((Throwable)this.a);
            }
            case 0: 
        }
        object = (ctv)object;
        if (object != null) return hhk.K(object);
        cyr.h("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", this.a);
        object = css.a();
        ((kqr)object).b = csr.w;
        return hhk.J(((kqr)object).a());
    }
}

