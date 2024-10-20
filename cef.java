/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

public final class cef {
    public int a = 0;
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new ot());

    final void a(int n2, int n3, Intent intent) {
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((cec)iterator.next()).c(n2, n3, intent);
        }
    }

    /*
     * WARNING - void declaration
     */
    final void b(Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            void object;
            cec cec2 = (cec)entry.getValue();
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle((String)entry.getKey());
            } else {
                Object var2_6 = null;
            }
            cec2.d((Bundle)object);
        }
    }

    final void c() {
        this.a = 5;
        for (cec cec2 : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((cec)iterator.next()).h();
        }
    }

    final void e(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.c.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((cec)entry.getValue()).g(bundle2);
                bundle.putBundle((String)entry.getKey(), bundle2);
            }
        }
    }

    final void f() {
        this.a = 2;
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((cec)iterator.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((cec)iterator.next()).j();
        }
    }

    final void h(cec cec2) {
        if (!this.c.containsKey("ConnectionlessLifecycleHelper")) {
            this.c.put("ConnectionlessLifecycleHelper", cec2);
            if (this.a > 0) {
                new gbs(Looper.getMainLooper(), null).post(new ai(this, cec2, 11));
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    final void i() {
        for (cec cec2 : this.c.values()) {
        }
    }

    final cec j(Class clazz) {
        return (cec)clazz.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}

