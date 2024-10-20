/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class fre
implements hny {
    public final int a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ fre(cxd cxd2, int n2, cwq cwq2, int n3) {
        this.d = n3;
        this.c = cxd2;
        this.a = n2;
        this.b = cwq2;
    }

    public /* synthetic */ fre(frf frf2, int n2, List list, int n3) {
        this.d = n3;
        this.b = frf2;
        this.a = n2;
        this.c = list;
    }

    public /* synthetic */ fre(frf frf2, List list, int n2, int n3) {
        this.d = n3;
        this.b = frf2;
        this.c = list;
        this.a = n2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            int n3;
            if (n2 != 1) {
                n2 = this.a;
                object = new ArrayList(n2);
                for (n3 = 0; n3 < n2; ++n3) {
                    if (!((Boolean)hhk.S((Future)this.c.get(n3))).booleanValue()) continue;
                    object.add(((frd)((frf)this.b).a.get(n3)).a());
                }
                return hhk.aa((Iterable)object).a(new dwp(12), (Executor)hom.a);
            }
            if (((Boolean)object).booleanValue()) {
                Object object2 = this.b;
                n3 = this.a;
                Object object3 = this.c;
                object = cwq.a(n3);
                object3 = (cxd)object3;
                cqq.t(((cxd)object3).a, (cwq)((Object)object));
                object = ((cxd)object3).b((cwq)((Object)object2), n3 + 1);
            } else {
                object = hhk.K(false);
            }
            return object;
        }
        object = (hyf)object;
        Object object4 = this.c;
        int n4 = this.a;
        Object object5 = this.b;
        iuv iuv2 = hhk.Y((Iterable)object4);
        object5 = (frf)object5;
        return iuv2.b(gqk.c(new dqc((frf)object5, (hyf)object, n4, (List)object4, 2)), ((frf)object5).b);
    }
}

