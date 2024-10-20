/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.LinkedHashSet;

public abstract class bfs {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final czh e;

    protected bfs(Context context, czh czh2) {
        jse.e(context, "context");
        this.e = czh2;
        context = context.getApplicationContext();
        jse.d(context, "context.applicationContext");
        this.a = context;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            Object object3;
            block5: {
                object3 = this.d;
                if (object3 == null) break block5;
                boolean bl2 = jse.i(object3, object);
                if (!bl2) break block5;
                return;
            }
            this.d = object;
            object = jns.s(this.c);
            object3 = this.e.c;
            aks aks2 = new aks(object, (Object)this, 9, null);
            object3.execute(aks2);
            return;
        }
    }
}

