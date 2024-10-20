/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class bgb
implements bew,
bcc {
    public static final String a = bbi.b("SystemFgDispatcher");
    public final bdn b;
    public final Object c;
    bgs d;
    final Map e;
    public final Map f;
    public final Map g;
    public bga h;
    public final czh i;
    public final bzb j;
    private final Context k;

    public bgb(Context object) {
        this.k = object;
        this.c = new Object();
        object = bdn.i(object);
        this.b = object;
        this.i = object.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.j = new bzb(object.j, null);
        object.f.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(bgs bgs2, boolean bl2) {
        Object object;
        Object object2 = this.c;
        synchronized (object2) {
            object = (bhd)this.f.remove(bgs2) != null ? (jwi)this.g.remove(bgs2) : null;
            if (object != null) {
                object.r(null);
            }
        }
        object2 = (bay)this.e.remove(bgs2);
        if (bgs2.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator iterator = this.e.entrySet().iterator();
                object = iterator.next();
                while (iterator.hasNext()) {
                    object = iterator.next();
                }
                this.d = (bgs)object.getKey();
                if (this.h != null) {
                    object = (bay)object.getValue();
                    this.h.c(((bay)object).a, ((bay)object).b, ((bay)object).c);
                    this.h.a(((bay)object).a);
                }
            } else {
                this.d = null;
            }
        }
        object = this.h;
        if (object2 != null && object != null) {
            bbi.a();
            int n2 = ((bay)object2).a;
            Objects.toString(bgs2);
            n2 = ((bay)object2).b;
            object.a(((bay)object2).a);
        }
    }

    public final void b(Intent object) {
        if (this.h != null) {
            int n2 = 0;
            int n3 = object.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int n4 = object.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            bgs bgs2 = new bgs(object.getStringExtra("KEY_WORKSPEC_ID"), object.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification)object.getParcelableExtra("KEY_NOTIFICATION");
            bbi.a();
            if (notification != null) {
                Object object2 = new bay(n3, notification, n4);
                this.e.put(bgs2, object2);
                object = (bay)this.e.get(this.d);
                if (object == null) {
                    this.d = bgs2;
                    object = object2;
                } else {
                    this.h.b(n3, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        object2 = this.e.entrySet().iterator();
                        while (object2.hasNext()) {
                            n2 |= ((bay)((Map.Entry)object2.next()).getValue()).b;
                        }
                        object = new bay(object.a, object.c, n2);
                    }
                }
                this.h.c(object.a, object.b, object.c);
                return;
            }
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        this.h = null;
        Object object = this.c;
        synchronized (object) {
            Iterator iterator = this.g.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    // MONITOREXIT @DISABLED, blocks:[2, 3, 4] lbl7 : MonitorExitStatement: MONITOREXIT : var1_1
                    this.b.f.b(this);
                    return;
                }
                ((jwi)iterator.next()).r(null);
            }
        }
    }

    public final void d(int n2) {
        bbi.a().e(a, a.af(n2, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((bay)entry.getValue()).b != n2) continue;
            bgs bgs2 = (bgs)entry.getKey();
            this.b.l(bgs2, -128);
        }
        bga bga2 = this.h;
        if (bga2 != null) {
            bga2.d();
        }
    }

    @Override
    public final void e(bhd bhd2, ass ass2) {
        if (ass2 instanceof ber) {
            String string = bhd2.b;
            bbi.a();
            this.b.l(AmbientLifecycleObserverKt.o(bhd2), ((ber)ass2).a);
        }
    }
}

