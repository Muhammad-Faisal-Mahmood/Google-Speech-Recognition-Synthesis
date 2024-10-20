/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class cxd
implements cxl {
    public final Context a;
    public final cuv b;
    private final Executor c;
    private final frr d;

    public cxd(Context context, cuv cuv2, frr frr2, Executor executor) {
        this.a = context;
        this.b = cuv2;
        this.d = frr2;
        this.c = executor;
    }

    @Override
    public final hpn a() {
        cxc cxc2 = new cxc(0);
        Executor executor = this.c;
        return this.d.b(cxc2, executor);
    }

    public final hpn b(cwq cwq2, int n2) {
        if (n2 <= cwq2.d) {
            Object object = cwq.a(n2);
            int n3 = object.ordinal();
            if (n3 != 1) {
                if (n3 != 2) {
                    String string = object.name();
                    object = new StringBuilder("Upgrade to version ");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("not supported!");
                    object = hhk.J(new UnsupportedOperationException(((StringBuilder)object).toString()));
                } else {
                    object = dah.e(this.d.b(new cws(this, 14), this.c)).f(new cxc(1), this.c).b(IOException.class, new cws(this, 15), this.c);
                }
            } else {
                object = dah.e(this.d.b(new cws(this, 17), this.c)).f(new cxc(2), this.c).b(IOException.class, new cws(this, 11), this.c);
            }
            return fxf.ak((hpn)object, new fre(this, n2, cwq2, 1), this.c);
        }
        return hhk.K(true);
    }

    @Override
    public final hpn c() {
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        bte bte2 = new bte(this, atomicReference, 11);
        return fxf.aj(this.d.b(bte2, this.c), new cws(atomicReference, 16), this.c);
    }

    @Override
    public final hpn d() {
        boolean bl2 = cqq.s(this.a);
        Object object = false;
        if (bl2) {
            cwq cwq2 = cwq.a(cqq.l());
            Object object2 = cqq.r(this.a, this.b);
            int n2 = cwq2.d;
            int n3 = ((cwq)((Object)object2)).d;
            if (n2 == n3) {
                object = hhk.K(true);
            } else if (n2 < n3) {
                cyr.i("%s Cannot migrate back from value %s to %s. Clear everything!", new Object[]{"ProtoDataStoreSharedFilesMetadata", object2, cwq2});
                cuv cuv2 = this.b;
                String string = String.valueOf(object2);
                String string2 = String.valueOf((Object)cwq2);
                object2 = new StringBuilder("Downgraded file key from ");
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append(" to ");
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(".");
                new Exception(((StringBuilder)object2).toString());
                cuv2.a();
                cqq.t(this.a, cwq2);
                object = hhk.K(object);
            } else {
                object = dah.e(this.b(cwq2, n3 + 1)).d(Exception.class, new cww(this, (Object)cwq2, 4, null), this.c).g(new cww(this, (Object)cwq2, 5, null), this.c);
            }
            return object;
        }
        cyr.c("%s Device isn't migrated to new file key, clear and set migration.", "ProtoDataStoreSharedFilesMetadata");
        cqq.u(this.a);
        cqq.t(this.a, cwq.a(cqq.l()));
        return hhk.K(object);
    }

    @Override
    public final hpn e(ctt ctt2) {
        return fxf.aj(this.f(new hdq(ctt2)), new cws(ctt2, 12), (Executor)hom.a);
    }

    @Override
    public final hpn f(hav hav2) {
        return fxf.aj(this.d.a(), new bte(this, hav2, 9), (Executor)hom.a);
    }

    @Override
    public final hpn g(ctt object) {
        cws cws2 = new cws(cqq.J((ctt)object, this.a, this.b), 13);
        object = this.c;
        return dah.e(this.d.b(cws2, (Executor)object)).f(new cwt(19), this.c).b(IOException.class, new cwt(20), this.c);
    }

    @Override
    public final hpn h(ctt object, ctv object2) {
        object2 = new bte(cqq.J((ctt)object, this.a, this.b), object2, 10, null);
        object = this.c;
        return dah.e(this.d.b((gte)object2, (Executor)object)).f(new cwt(17), this.c).b(IOException.class, new cwt(18), this.c);
    }

    public final void i(cwq cwq2) {
        if (cqq.r((Context)this.a, (cuv)this.b).d != cwq2.d && !cqq.t(this.a, cwq2)) {
            cyr.f(a.av((Object)cwq2, "Failed to commit migration version to disk. Fail to set target version to ", "."));
            cuv cuv2 = this.b;
            new Exception(a.av((Object)cwq2, "Fail to set target version ", "."));
            cuv2.a();
        }
    }
}

