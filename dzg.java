/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.Set;
import java.util.concurrent.Executor;

public final class dzg
implements dzd {
    public final dze a;
    public final Set b;
    public final iku c;

    public dzg(dze dze2, iku iku2, Set set) {
        this.c = iku2;
        this.a = dze2;
        this.b = set;
    }

    @Override
    public final hpn a(dzc dzc2) {
        Object object = new bpr(17);
        this.a.b.e(object);
        object = object.a();
        Object object2 = new bpr(18);
        this.a.c.e(object2);
        object2 = object2.a();
        return fxf.aF(new hpn[]{object, object2}).D(new cvt((Object)this, (Object)dzc2, object, object2, 7), (Executor)hom.a);
    }
}

