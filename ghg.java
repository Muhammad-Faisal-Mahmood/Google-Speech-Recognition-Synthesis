/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class ghg
implements dxe {
    private final Optional a;
    private final Optional b;
    private final jnu c;
    private final jnu d;
    private final jnu e;

    public ghg(Optional optional, Optional optional2, jnu jnu2, jnu jnu3, jnu jnu4) {
        jse.e(optional, "disableListener");
        jse.e(optional2, "enableListenerForTests");
        jse.e(jnu2, "oneTryRunner");
        jse.e(jnu3, "withRetryRunner");
        jse.e(jnu4, "retryOnFailure");
        this.a = optional;
        this.b = optional2;
        this.c = jnu2;
        this.d = jnu3;
        this.e = jnu4;
    }

    @Override
    public final void a() {
        Object object;
        block9: {
            block7: {
                block8: {
                    if (this.a.isPresent() && !this.b.isPresent() || !dww.b()) break block7;
                    object = ((imc)this.e).a;
                    jse.d(object, "get(...)");
                    Object object2 = (Optional)object;
                    object = false;
                    jse.e(object2, "<this>");
                    if (((Optional)object2).isPresent()) {
                        object = ((Optional)object2).get();
                    }
                    if (!((Boolean)object).booleanValue()) break block8;
                    ghl ghl2 = ((ghm)this.d).a();
                    if (dww.a(ghl2.a) == null) {
                        ((heg)ghl2.f.h().j("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 92, "StartupAfterPackageReplacedWithRetryRunner.kt")).r("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                        return;
                    }
                    if (ghl2.i.b() || ghl2.g && !ghl2.e.isEmpty()) {
                        int n2 = ghl2.d;
                        bzq bzq2 = ghl2.a();
                        object = new StringBuilder();
                        object2 = new ArrayList();
                        ((StringBuilder)object).append("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
                        ((ArrayList)object2).add(Long.valueOf(n2));
                        gax.c(fxf.ak(new gre(bzq2.X(fvc.R((StringBuilder)object, (ArrayList)object2))).a(new ghj(ghk.b, 1), ghl2.b).b().e(Exception.class, new ggk(new etv(ghl2, 9), 2), (Executor)hom.a), new frm(new etv(ghl2, 11), 17), ghl2.b), "StartupAfterPackageReplacedListenerImpl infrastructure failure.", new Object[0]);
                        return;
                    }
                    break block7;
                }
                object = ((ghf)this.c).a();
                if (((ghe)object).i.b() || ((ghe)object).g && !((ghe)object).b.isEmpty()) break block9;
            }
            return;
        }
        ((ghe)object).a(true);
    }
}

