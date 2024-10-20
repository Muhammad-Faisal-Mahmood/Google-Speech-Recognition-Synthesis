/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  gda
 *  hom
 */
import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class frm
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ frm(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object arrayList) {
        int n2 = this.b;
        int n3 = 0;
        switch (n2) {
            default: {
                return a.n((jrk)this.a, arrayList);
            }
            case 19: {
                return a.n((jrk)this.a, arrayList);
            }
            case 18: {
                return a.n((jrk)this.a, arrayList);
            }
            case 17: {
                return a.n((jrk)this.a, arrayList);
            }
            case 16: {
                arrayList = (String)((Object)arrayList);
                return ((gpm)this.a).t((String)((Object)arrayList));
            }
            case 15: {
                return a.n((jrk)this.a, arrayList);
            }
            case 14: {
                return a.n((jrk)this.a, arrayList);
            }
            case 13: {
                return a.n((jrk)this.a, arrayList);
            }
            case 12: {
                arrayList = (String)((Object)arrayList);
                return ((gpm)this.a).t((String)((Object)arrayList));
            }
            case 11: {
                arrayList = (hac)((Object)arrayList);
                ArrayList<hpn> arrayList2 = new ArrayList<hpn>();
                hdx hdx2 = ((hac)((Object)arrayList)).k().k();
                while (hdx2.hasNext()) {
                    arrayList = (Map.Entry)hdx2.next();
                    Object object = (fym)arrayList.getKey();
                    Object object2 = (gap)arrayList.getValue();
                    Iterator iterator = fym.a(((gap)object2).c, gda.a);
                    Object object3 = ((gap)object2).d;
                    arrayList = object3;
                    if (object3 == null) {
                        arrayList = fze.a;
                    }
                    n3 = n2 = a.t(((gap)object2).e);
                    if (n2 == 0) {
                        n3 = 1;
                    }
                    object3 = this.a;
                    arrayList = fzd.a((fym)((Object)iterator), (fze)((Object)arrayList), (int)n3, (gda)gda.a).b;
                    fxf.K(gda.a);
                    new fzg((fym)object, (fze)((Object)arrayList));
                    object = (cya)object3;
                    iterator = ((imj)((cya)object).e).a();
                    arrayList = new ArrayList<hpn>(iterator.size());
                    iterator = iterator.iterator();
                    while (iterator.hasNext()) {
                        object2 = (fzh)iterator.next();
                        try {
                            arrayList.add(object2.a());
                        }
                        catch (Exception exception) {
                            arrayList.add(hhk.J(exception));
                        }
                    }
                    arrayList2.add(hhk.Y(arrayList).b(gqk.c(new etu(object3, arrayList, 7, null)), (Executor)((cya)object).c));
                }
                return hhk.aa(arrayList2).a(new dwp(12), (Executor)hom.a);
            }
            case 10: {
                arrayList = (IOException)((Object)arrayList);
                Object object = this.a;
                ((IOException)object).addSuppressed((Throwable)((Object)arrayList));
                throw (Throwable)object;
            }
            case 9: {
                arrayList = (Void)((Object)arrayList);
                hth hth2 = ((fzy)this.a).a;
                arrayList = hth2.c(true);
                ArrayList<hpn> arrayList3 = new ArrayList<hpn>();
                n2 = ((hct)((Object)arrayList)).c;
                while (n3 < n2) {
                    Object object = (File)arrayList.get(n3);
                    Object object4 = hth2.b;
                    object = gqk.j(new fgm(object, 19));
                    arrayList3.add(((bzb)object4).a.bf((Callable)object));
                    ++n3;
                }
                return hhk.Y(arrayList3).a(new fgm(arrayList3, 18), (Executor)hom.a);
            }
            case 8: {
                Object object = (gzx)((Object)arrayList);
                fxf.K(gda.a);
                Object object5 = this.a;
                arrayList = fxf.aq("Sync Accounts");
                object5 = ((hth)((fzp)object5).d).b;
                try {
                    Object object6 = ((cya)object5).a;
                    Object object7 = new gaa((Collection)object);
                    object = new AtomicReference();
                    Object object8 = new ffp(object7, object, 3);
                    gte gte2 = gqk.b((gte)object8);
                    Object object9 = ((cya)object5).b;
                    Object object10 = ((hth)object6).b;
                    object8 = new gaj(object6, (Executor)object9, 0);
                    object8 = ((frr)object10).b(gte2, (Executor)object8);
                    object7 = new gak((hth)object6, (hpn)object8);
                    object6 = new fmi(object, 3);
                    object6 = grf.g(hno.f((hpn)object7, gqk.b((gte)object6), (Executor)hom.a));
                    object = new frm(object5, 11);
                    object5 = ((grf)object6).i((hny)object, (Executor)((cya)object5).c);
                    object6 = new gtf();
                    object5 = ((grf)object5).h((gte)object6, (Executor)hom.a);
                    ((gol)((Object)arrayList)).a((hpn)object5);
                    return object5;
                }
                finally {
                    ((gol)((Object)arrayList)).close();
                }
            }
            case 7: {
                arrayList = (Throwable)((Object)arrayList);
                ((heg)((heg)((heg)fzi.a.g()).i((Throwable)((Object)arrayList))).j("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).r("Account sync failed");
                fxf.K(gda.a);
                arrayList = ((fzi)this.a).b.h;
                fiz fiz2 = new fiz(6);
                hom hom2 = hom.a;
                return ((frr)((Object)arrayList)).b(fiz2, (Executor)hom2);
            }
            case 6: {
                arrayList = (IOException)((Object)arrayList);
                Object object = this.a;
                ((IOException)object).addSuppressed((Throwable)((Object)arrayList));
                throw (Throwable)object;
            }
            case 5: {
                return ((frr)this.a).f.a();
            }
            case 4: {
                arrayList = (AmbientModeSupport$AmbientController)((Object)arrayList);
                return ((frr)this.a).b.c();
            }
            case 3: {
                return hhk.K(this.a.apply(arrayList));
            }
            case 2: {
                Object object = this.a;
                arrayList = ((frp)object).e;
                synchronized (arrayList) {
                    return ((frp)object).f;
                }
            }
            case 1: {
                arrayList = (Void)((Object)arrayList);
                arrayList = (frp)this.a;
                return hhk.K(((frp)((Object)arrayList)).b((Uri)hhk.S(((frp)((Object)arrayList)).b)));
            }
            case 0: 
        }
        Uri uri = (Uri)arrayList;
        arrayList = fvc.F(uri, ".bak");
        Object object = this.a;
        try {
            if (!((frp)object).g.B((Uri)arrayList)) return hpj.a;
            ((frp)object).g.A((Uri)arrayList, uri);
            return hpj.a;
        }
        catch (IOException iOException) {
            return hhk.J(iOException);
        }
    }
}

