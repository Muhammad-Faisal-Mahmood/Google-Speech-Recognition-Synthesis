/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class frf
implements hny {
    public final List a;
    public final Executor b;

    public frf(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override
    public final /* synthetic */ hpn a(Object object) {
        int n2 = ((hct)this.a).c;
        object = (AmbientModeSupport$AmbientController)object;
        ArrayList<hpn> arrayList = new ArrayList<hpn>(n2);
        Object object2 = ((gzx)this.a).v();
        while (object2.hasNext()) {
            arrayList.add(((frd)object2.next()).c());
        }
        hny hny2 = gqk.d(new fre(this, arrayList, n2, 0));
        object2 = ((frr)((AmbientModeSupport$AmbientController)object).a).d;
        hom hom2 = hom.a;
        ((gnt)object2).b();
        return hno.g(fvc.G(hno.g(hhk.L(((frr)((AmbientModeSupport$AmbientController)object).a).b.c()), gqk.d(new cxe(object, (Object)hny2, (Object)hom2, 13, null)), (Executor)hom.a)), gqk.d(new fre(this, n2, arrayList, 2)), (Executor)hom.a);
    }
}

