/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public final class brf
implements gkq,
gkr,
ilv {
    private img a;
    private img b;
    private img c;
    private final brg d;

    public brf() {
        throw null;
    }

    public brf(brg brg2, fym object) {
        this.d = brg2;
        this.a = object = imc.c(object);
        this.b = new gdh((jnu)object, 11);
        object = imj.a;
        List list = fvc.aj(0);
        object = fvc.aj(1);
        idi.h(this.b, (List)object);
        this.c = new imj(list, (List)object);
        imk.a(new egt((jnu)brg2.e, (jnu)brg2.f, (jnu)this.c, 19, null));
    }

    @Override
    public final Map a() {
        return hcy.a;
    }

    @Override
    public final knl b() {
        Object object = this.d;
        Object object2 = (cgw)((brg)object).a.b();
        object = new bzo((hpr)((brg)object).b.b(), null);
        hdc hdc2 = hdc.a;
        object2 = imj.a;
        fxf.r(hdc2.isEmpty(), "Can't provide Sync SyncSystemMonitor to any account level. Only application scoped SyncSystemMonitors may be provided");
        return new knl((bzo)object, (jnu)new dan(hdc2, 10), (jnu)object2);
    }
}

