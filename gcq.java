/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public final class gcq
implements gcp {
    private final int a;
    private final Object b;

    public gcq(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final hpn a(String string) {
        if (this.a != 0) {
            return ((bje)this.b).a();
        }
        return fxf.f(((bbq)((bbx)this.b).a((String)string)).c);
    }

    @Override
    public final hpn b(UUID uUID) {
        if (this.a != 0) {
            return ((bje)this.b).b();
        }
        return fxf.f(((bbq)((bbx)this.b).b((UUID)uUID)).c);
    }

    @Override
    public final hpn c(String string, int n2, List list) {
        if (this.a != 0) {
            return ((bje)this.b).e();
        }
        return fxf.f(((bbq)((bbx)this.b).e((String)string, (int)n2, (List)list)).c);
    }

    @Override
    public final hpn d(bmu bmu2) {
        if (this.a != 0) {
            return ((bje)this.b).c();
        }
        return fxf.f(((bbq)((bbx)this.b).f((bmu)bmu2)).c);
    }

    @Override
    public final hpn e(String string, int n2, bmu bmu2) {
        if (this.a != 0) {
            return ((bje)this.b).d();
        }
        return fxf.f(((bbq)((bbx)this.b).g((String)string, (int)n2, (bmu)bmu2)).c);
    }

    @Override
    public final /* synthetic */ hpn f(String string, int n2, bmu bmu2) {
        if (this.a != 0) {
            return fxf.g(this, string, n2, bmu2);
        }
        return fxf.g(this, string, n2, bmu2);
    }

    @Override
    public final hpn g(bzb bzb2) {
        if (this.a != 0) {
            return ((bje)this.b).f();
        }
        return ((bbx)this.b).h(bzb2);
    }
}

