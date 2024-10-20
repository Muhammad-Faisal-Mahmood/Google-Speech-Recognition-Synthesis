/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import java.util.ArrayList;

public final class fyy
implements fyv,
aas {
    public static final hei a;
    public static final fvd b;
    private final gib c;
    private final jny d;
    private final boolean e;
    private final hth f;

    static {
        b = new fvd();
        a = hei.m("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked");
    }

    public fyy(gib gib2, hth hth2, fzc fzc2, gto gto2, fvd fvd2) {
        jse.e(gib2, "fragmentHost");
        jse.e(hth2, "uiCallbacksHandler");
        jse.e(fzc2, "keepStateCallbacksHandler");
        jse.e(gto2, "disabledForMigration");
        jse.e(fvd2, "accountComponentManager");
        this.c = gib2;
        this.f = hth2;
        int n2 = jsk.a;
        this.d = new aci(new jrz(fza.class), new eop(gib2, 16), new eop(gib2, 17), new eop(gib2, 18));
        new ArrayList();
        this.e = (Boolean)gto2.e(false);
        gib2.getLifecycle().b(this);
    }

    private final fza b() {
        return (fza)this.d.a();
    }

    @Override
    public final int a() {
        fpk.c();
        return this.b().a;
    }

    @Override
    public final void onCreate(abe object) {
        int n2 = this.b().e && !this.e && this.b().d ? 1 : 0;
        this.b().d = this.e;
        if (n2 != 0) {
            object = this.b();
            ((fza)object).a = -1;
            ((fza)object).b = fze.a;
            ((fza)object).c = 0;
            object = this.c;
            b.f(object.b());
            return;
        }
        n2 = this.b().c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        this.f.j(gda.a);
                        return;
                    }
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
                object = this.f;
                gda gda2 = gda.a;
                fym.a(this.a(), gda.a);
                ((hth)object).l(gda2, this.b().b);
                return;
            }
            this.f.k(gda.a);
        }
    }

    @Override
    public final /* synthetic */ void onDestroy(abe abe2) {
        wc.e(abe2);
    }

    @Override
    public final /* synthetic */ void onPause(abe abe2) {
        wc.f(abe2);
    }

    @Override
    public final /* synthetic */ void onResume(abe abe2) {
        wc.g(abe2);
    }

    @Override
    public final /* synthetic */ void onStart(abe abe2) {
        wc.h(abe2);
    }

    @Override
    public final /* synthetic */ void onStop(abe abe2) {
        wc.i(abe2);
    }
}

