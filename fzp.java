/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.Executor;

public final class fzp {
    public final jnu a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public fzp(Context context, gto object, String string, jnu jnu2) {
        this.g = context;
        this.a = jnu2;
        this.e = context.getPackageName();
        jnu2 = dlt.a;
        this.f = dlt.c(context.getPackageName(), dlt.b());
        if (((gto)object).g()) {
            object = (dmo)((gto)object).c();
        }
        this.c = string;
        object = context.getPackageManager();
        int n2 = object.hasSystemFeature("android.hardware.type.watch") ? 3 : (object.hasSystemFeature("android.software.leanback") ? 4 : 2);
        if (object.hasSystemFeature("android.hardware.type.automotive")) {
            n2 = 5;
        }
        this.b = n2;
        this.h = new AmbientDelegate(context);
        this.d = fvd.ap(new aim(this, 13));
    }

    public fzp(jnu jnu2, hth hth2, frr frr2, cgw cgw2, jnu jnu3, int n2, Executor executor) {
        this.e = new hou();
        this.c = jnu2;
        this.d = hth2;
        this.h = frr2;
        this.g = cgw2;
        this.a = jnu3;
        this.b = n2;
        this.f = executor;
    }

    public final hpn a(long l2) {
        fzn fzn2 = new fzn(this, l2);
        Object object = this.h;
        hom hom2 = hom.a;
        return ((frr)object).b(fzn2, (Executor)hom2);
    }
}

