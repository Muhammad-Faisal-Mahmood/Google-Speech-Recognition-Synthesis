/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class eey
implements eeu {
    public final gto b;
    public final int c;
    public final eae d;

    public /* synthetic */ eey(gto gto2, int n2, eae eae2) {
        this.b = gto2;
        this.c = n2;
        this.d = eae2;
    }

    @Override
    public final Object a() {
        gto gto2 = this.b;
        jse.e(gto2, "$this_offsetBy");
        eae eae2 = this.d;
        jse.e(eae2, "$params");
        return fxf.aj((hpn)dpg.g(gto2).a(), new eex(new epv(this.c, eae2, 1), 0), (Executor)hom.a);
    }
}

