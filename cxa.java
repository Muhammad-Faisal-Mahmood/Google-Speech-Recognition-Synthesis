/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class cxa
implements cwk {
    public final cuv a;
    public final Executor b;
    public final frr c;

    public cxa(cuv cuv2, frr frr2, Executor executor) {
        this.a = cuv2;
        this.c = frr2;
        this.b = executor;
    }

    @Override
    public final hpn a(cth object) {
        cyr.d("%s: Adding file group %s", "ProtoDataStoreFileGroupsMetadata", ((cth)object).d);
        cth cth2 = cqq.Y((cth)object, cqq.x() / 1000L + ((cth)object).k);
        object = new ArrayList();
        object.add(cth2);
        return this.m((List)object);
    }

    @Override
    public final hpn b() {
        return dah.e(this.k()).g(new cwu(this, 11), this.b);
    }

    @Override
    public final hpn c() {
        ArrayList arrayList = new ArrayList();
        cws cws2 = new cws(arrayList, 9);
        Executor executor = this.b;
        return dah.e(this.c.b(cws2, executor)).f(new cws(arrayList, 10), this.b);
    }

    @Override
    public final hpn d() {
        ArrayList arrayList = new ArrayList();
        bte bte2 = new bte(this, arrayList, 7);
        Executor executor = this.b;
        return dah.e(this.c.b(bte2, executor)).f(new cws(arrayList, 6), this.b);
    }

    @Override
    public final hpn e() {
        return fxf.aj(this.c.a(), new cwt(9), this.b);
    }

    @Override
    public final hpn f() {
        return hpj.a;
    }

    @Override
    public final hpn g(ctq object) {
        object = cqq.U((ctq)object);
        return fxf.aj(this.c.a(), new cws(object, 7), this.b);
    }

    @Override
    public final hpn h(ctq object) {
        object = cqq.U((ctq)object);
        return fxf.aj(this.c.a(), new cws(object, 4), this.b);
    }

    @Override
    public final hpn i(ctq object) {
        cws cws2 = new cws(cqq.U((ctq)object), 8);
        object = this.b;
        return dah.e(this.c.b(cws2, (Executor)object)).f(new cwt(15), this.b).b(IOException.class, new cwt(16), this.b);
    }

    @Override
    public final hpn j(List object) {
        cws cws2 = new cws(object, 5);
        object = this.b;
        return dah.e(this.c.b(cws2, (Executor)object)).f(new cwt(7), this.b).b(IOException.class, new cwt(8), this.b);
    }

    @Override
    public final hpn k() {
        cwt cwt2 = new cwt(10);
        Executor executor = this.b;
        return this.c.b(cwt2, executor);
    }

    @Override
    public final hpn l(ctq object, cth object2) {
        object2 = new bte(cqq.U((ctq)object), object2, 8, null);
        object = this.b;
        return dah.e(this.c.b((gte)object2, (Executor)object)).f(new cwt(12), this.b).b(IOException.class, new cwt(13), this.b);
    }

    @Override
    public final hpn m(List object) {
        cws cws2 = new cws(object, 3);
        object = this.b;
        return dah.e(this.c.b(cws2, (Executor)object)).f(new cwt(11), this.b).b(IOException.class, new cwt(14), this.b);
    }
}

