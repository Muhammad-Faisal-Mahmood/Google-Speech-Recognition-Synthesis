/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  gda
 *  gqv
 */
import android.app.Service;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

public final class goi {
    public final Object a;
    public Object b;

    public goi() {
        throw null;
    }

    public goi(Service service) {
        this.a = service;
    }

    public goi(Context context) {
        this.a = context;
    }

    public goi(be be2, Executor executor) {
        executor = new gbr(executor, gda.a);
        this.a = executor;
        gbr gbr2 = (gbr)executor;
        ((gbr)executor).c();
        be2.getLifecycle().b(new grd(new gek(this, be2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Context j() {
        synchronized (this) {
            if (this.b != null) return (Context)this.b;
            Object object = ag$$ExternalSyntheticApiModelOutline1.m((Context)this.a);
            if (object == null) {
                object = this.a;
            }
            this.b = object;
            return (Context)this.b;
        }
    }

    public final gop a() {
        if (fxf.aw(gqv.a)) {
            return gop.d(fxf.k((Context)this.a));
        }
        return goo.a;
    }

    public final gpf b(String string) {
        if (!fxf.aw(gqv.a)) {
            Object object = this.a;
            gpm gpm2 = fxf.j((Context)object);
            String string2 = object.getClass().getSimpleName();
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" ");
            ((StringBuilder)object).append(string2);
            return gpm2.c(((StringBuilder)object).toString(), goy.a, gqv.a);
        }
        return null;
    }

    public final gpf c() {
        Object object;
        gop gop2 = this.a();
        gpc gpc2 = gno.b();
        if (!fxf.aw(gqv.a)) {
            object = gno.e();
            if (object != null) {
                Object object2 = new gmq(2);
                gno.w((gpc)object);
                gon gon2 = gop.b();
                gon2.a(goy.c, object2);
                object2 = ((gop)((Object)gon2)).f();
                this.b = fxf.at("Creating ".concat(String.valueOf(this.a.getClass().getSimpleName())), gqv.a, (gop)object2);
            } else {
                object = this.a;
                object = fxf.j((Context)object).c("Creating ".concat(String.valueOf(object.getClass().getSimpleName())), goy.a, gqv.a);
            }
        } else {
            object = null;
        }
        return new goh(this, fxf.at(this.f("onCreate"), gqv.a, gop2), (gpf)object, gpc2);
    }

    public final gpf d(String string) {
        gop gop2 = this.a();
        gpc gpc2 = gno.b();
        gpf gpf2 = this.b(string);
        return new gog(fxf.at(this.f(string), gqv.a, gop2), gpf2, gpc2);
    }

    public final gpf e() {
        gop gop2 = this.a();
        gpc gpc2 = gno.b();
        gpf gpf2 = this.b("Destroying");
        return new gog(fxf.at(this.f("onDestroy"), gqv.a, gop2), gpf2, gpc2);
    }

    public final String f(String string) {
        String string2 = this.a.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final Uri g(gkc object, String string, gda gda2) {
        fxf.K(gda2);
        int n2 = ((gkc)object).b;
        int n3 = ((gkc)object).a;
        object = string;
        if (string.startsWith("/")) {
            object = string.substring(1);
        }
        gda2 = new Uri.Builder().scheme("android").authority(((Context)this.a).getPackageName());
        StringBuilder stringBuilder = new StringBuilder("/");
        string = n2 == 1 ? "directboot-" : "";
        stringBuilder.append(string.concat("files"));
        stringBuilder.append("/");
        stringBuilder.append((String)object);
        return gda2.path(stringBuilder.toString()).build();
    }

    public final File h(int n2, int n3) {
        Object object = n3 == 1 ? this.j() : this.a;
        if (n2 - 1 != 0) {
            return object.getCacheDir();
        }
        return object.getFilesDir();
    }

    public final void i(gds object, geg geg2) {
        fpk.c();
        fxf.B(geg2 instanceof gdn ^ true, "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        object = new fbx(this, (gds)object, geg2, 8);
        ((gbr)this.a).execute((Runnable)object);
    }
}

