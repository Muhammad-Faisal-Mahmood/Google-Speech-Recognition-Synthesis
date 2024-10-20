/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class gae
implements frd {
    final hth a;
    public hth b;
    public final bmu c;

    public gae(bmu bmu2, hth hth2) {
        this.a = hth2;
        this.c = bmu2;
    }

    @Override
    public final hpn a() {
        hpn hpn2 = fxf.ah(new fgm(this, 17), (Executor)this.c.c);
        fmi fmi2 = new fmi(5);
        Object object = this.c.a;
        hom hom2 = hom.a;
        return hhk.ab(hpn2, ((frr)object).b(fmi2, (Executor)hom2)).a(new dwp(12), (Executor)hom.a);
    }

    @Override
    public final hpn b(hyf hyf2) {
        hth hth2;
        this.b = hth2 = new hth(((Context)this.c.b).getSharedPreferences("accounts", 0));
        return hhk.O(gqk.j(new gag((gam)hyf2, hth2)), (Executor)this.a.a);
    }

    @Override
    public final hpn c() {
        return fxf.ap(new frn(this, 6), (Executor)this.c.c);
    }
}

