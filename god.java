/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import java.util.Collection;
import java.util.Set;

public final class god
implements dxe {
    public final gto a;
    public final gto b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public /* synthetic */ god(dtu dtu2, gto gto2, Context context, jnu jnu2, gto gto3, int n2) {
        this.f = n2;
        this.d = dtu2;
        this.a = gto2;
        this.c = context;
        this.e = jnu2;
        this.b = gto3;
    }

    public /* synthetic */ god(gto gto2, gto gto3, gto gto4, Set set, gto gto5, int n2) {
        this.f = n2;
        this.c = gto2;
        this.d = gto3;
        this.a = gto4;
        this.e = set;
        this.b = gto5;
    }

    @Override
    public final void a() {
        if (this.f != 0) {
            if (!((dtu)this.d).b() && !((Boolean)this.a.e(false)).booleanValue()) {
                return;
            }
            gto gto2 = this.b;
            Object object = this.e;
            Application application = (Application)this.c;
            object = new dxb(application, (jnu)object, gto2);
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)((gte)((gtt)gto2).a).apply(object));
            return;
        }
        Object object = (gto)this.c;
        object = object.g() ? (gpd)((Object)object.c()) : gpd.a;
        Object object2 = this.d;
        gpe.a = object;
        object = (gto)object2;
        object = object.g() ? (gmx)((Object)object.c()) : gmx.c;
        object2 = this.a;
        gmy.a = object;
        object = ((gto)object2).g() ? (gor)((Object)((gto)object2).c()) : gor.a;
        object2 = this.e;
        gos.a = object;
        if (!object2.isEmpty()) {
            gno.p(hav.n((Collection)object2));
        }
        if ((object = this.b).g() && !((Boolean)object.c()).booleanValue()) {
            gne.a();
        }
        gna.a = 3;
    }
}

