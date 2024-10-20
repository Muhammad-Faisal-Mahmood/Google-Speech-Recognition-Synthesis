/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class fzm
implements hnx {
    public final long a;
    public final Object b;
    private final int c;

    public /* synthetic */ fzm(Object object, long l2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = l2;
    }

    @Override
    public final hpn a() {
        Object object;
        if (this.c != 0) {
            Object object2 = this.b;
            fby fby2 = (fby)object2;
            if (!fby2.i) {
                fby2.j.cancel(false);
                fby2.j = fby2.f.b(gqk.i(new dqv(object2, 18)), fby2.c, TimeUnit.MILLISECONDS);
                if (!fby2.k) {
                    fby2.g.ifPresent(new bme(object2, 13));
                    fby2.k = true;
                }
                fby2.h = (int)(this.a * 100L / fby2.b.e);
                ((heg)((heg)fby.a.f().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "onProgress", 106, "ModelDownloadCallback.java")).s("onProgress: %s", fby2.h);
                fby2.e.ifPresent(new bme(object2, 14));
            }
            return hpj.a;
        }
        Object object3 = this.b;
        fzp fzp2 = (fzp)object3;
        boolean bl2 = hav.n(((hth)fzp2.c.b()).i().g()).isEmpty();
        long l2 = this.a;
        if (bl2) {
            object = fzp2.a(l2);
        } else {
            object = (hth)fzp2.c.b();
            Object object4 = ((hth)object).i();
            ArrayList<hpn> arrayList = new ArrayList<hpn>();
            hdx hdx2 = ((hac)object4).k().k();
            while (hdx2.hasNext()) {
                Object object5 = (Map.Entry)hdx2.next();
                object4 = (String)object5.getKey();
                object5 = (fzk)object5.getValue();
                arrayList.add(hno.f(object5.a(), gqk.b(new ffp(object4, object5, 2, null)), (Executor)((hth)object).a));
            }
            object = hno.g(hno.g(hph.q(hhk.aa(arrayList).a(gqk.j(new fgm(arrayList, 16)), (Executor)((hth)object).a)), gqk.d(new frm(object3, 8)), (Executor)fzp2.f), gqk.d(new fzo(fzp2, l2)), (Executor)fzp2.f);
        }
        return object;
    }
}

