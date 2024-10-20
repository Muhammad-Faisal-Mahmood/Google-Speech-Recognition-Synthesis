/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  gda
 */
import android.os.Bundle;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public final class fyx
implements fyv,
aas {
    private static final hei e = hei.m("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked");
    public final boolean a;
    public int b;
    public fze c;
    public int d;
    private final gib f;
    private final hth g;

    public fyx(gib gib2, hth hth2, gto gto2) {
        new ArrayList();
        this.b = -1;
        this.c = fze.a;
        this.d = 0;
        this.f = gib2;
        this.g = hth2;
        this.a = (Boolean)gto2.e(false);
        gib2.getLifecycle().b(this);
        gib2.getSavedStateRegistry().b("tiktok_activity_account_state_saved_instance_state", new bo(this, 4));
    }

    private static void b(by object) {
        try {
            ((by)object).ac();
        }
        catch (IllegalStateException illegalStateException) {
            StringWriter stringWriter = new StringWriter();
            ((by)object).C("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            object = new hue(stringWriter.toString());
            ((heg)((heg)((heg)e.g()).i(illegalStateException)).j("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked", "clearFragments", 333, "ActivityAccountStateActivityBacked.java")).u("popBackStackImmediate failure, fragment state %s", object);
            throw illegalStateException;
        }
        Object object2 = ((by)object).h();
        if (object2 != null && !object2.isEmpty()) {
            object = new y((by)object);
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = (be)object2.next();
                if (object3 instanceof ilw && ((ilw)object3).bn() instanceof fyu) {
                    ((ce)object).j((be)object3);
                    continue;
                }
                object3 = ((be)object3).getChildFragmentManager();
                ((by)object3).Y();
                fyx.b((by)object3);
            }
            if (!((ce)object).g()) {
                ((ce)object).q();
                ((ce)object).b();
            }
        }
        return;
    }

    @Override
    public final int a() {
        fpk.c();
        return this.b;
    }

    @Override
    public final void onCreate(abe abe2) {
        abe2 = this.f.getSavedStateRegistry().d() ? this.f.getSavedStateRegistry().a("tiktok_activity_account_state_saved_instance_state") : null;
        if (abe2 != null) {
            int n2;
            if (!this.a && abe2.getBoolean("tiktok_accounts_disabled")) {
                fyx.b(this.f.b());
                return;
            }
            this.b = abe2.getInt("state_account_id", -1);
            try {
                this.c = (fze)fvc.ar((Bundle)abe2, "state_account_info", fze.a, hwj.a());
            }
            catch (hxn hxn2) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", hxn2);
            }
            this.d = n2 = abe2.getInt("state_account_state", 0);
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            this.g.j(gda.a);
                            return;
                        }
                        throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                    }
                    hth hth2 = this.g;
                    abe2 = gda.a;
                    fym.a(this.b, (gda)abe2);
                    hth2.l((gda)abe2, this.c);
                    return;
                }
                this.g.k(gda.a);
                return;
            }
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

