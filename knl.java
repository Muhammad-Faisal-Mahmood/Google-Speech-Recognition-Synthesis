/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class knl {
    public final Object a;
    public final Object b;
    public final Object c;

    public knl() {
        this.a = new ReentrantReadWriteLock(false);
        this.b = new HashMap();
        this.c = new AtomicInteger();
        new ArrayList();
    }

    public knl(Context context, PackageManager packageManager, hpq hpq2) {
        jse.e(hpq2, "backgroundExecutor");
        this.b = context;
        this.a = packageManager;
        this.c = hpq2;
    }

    public knl(bzo bzo2, jnu jnu2, jnu jnu3) {
        this.c = bzo2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public knl(Method method, Method method2, Method method3) {
        this.b = method;
        this.c = method2;
        this.a = method3;
    }

    public knl(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public knl(byte[] byArray) {
        this.c = new gzs();
        this.b = new gzs();
        this.a = "DEFAULT";
    }

    public final hpn a(hpn object, hny object2) {
        Object object3 = (Set)this.a.b();
        Object object4 = hav.i(object3.size());
        object3 = object3.iterator();
        while (object3.hasNext()) {
            ((hat)object4).j(new gme((hny)object2, (gmh)object3.next(), 0));
        }
        object2 = this.c;
        object = new grg(object, 1);
        object4 = ((hat)object4).g();
        return ((bzo)object2).I((hnx)object, (hav)object4);
    }
}

