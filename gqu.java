/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;

public final class gqu
implements dxe {
    public final gto a;
    public final gto b;
    public final gto c;
    public final gto d;
    public final Set e;
    public final gto f;
    public final gto g;

    public /* synthetic */ gqu(gto gto2, gto gto3, gto gto4, gto gto5, Set set, gto gto6, gto gto7) {
        this.a = gto2;
        this.b = gto3;
        this.c = gto4;
        this.d = gto5;
        this.e = set;
        this.f = gto6;
        this.g = gto7;
    }

    @Override
    public final void a() {
        Object object = this.a;
        if (((gto)object).g()) {
            gpe.a = (gpd)((Object)((gto)object).c());
        }
        if (((gto)(object = this.b)).g()) {
            gmy.a = (gmx)((Object)((gto)object).c());
        }
        if (((gto)(object = this.c)).g()) {
            gos.a = (gor)((Object)((gto)object).c());
        }
        if (((gto)(object = this.d)).g() && !((Boolean)((gto)object).c()).booleanValue()) {
            gne.a();
        }
        if (!(object = this.e).isEmpty()) {
            gno.p(hav.n((Collection)object));
        }
        if (((gto)(object = this.f)).g() && !((Boolean)((gto)object).c()).booleanValue()) {
            gno.a = false;
        }
        if (((gto)(object = this.g)).g() && ((Boolean)((gto)object).c()).booleanValue()) {
            gno.b = true;
        }
    }
}

