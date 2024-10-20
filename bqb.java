/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  hom
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

public final class bqb
implements bpm {
    public static final String a = "bqb";
    public static final ComponentName b;
    public static final ComponentName c;
    public final hpq d;
    protected final Context e;
    public final Executor f;
    private final Object g = new Object();
    private bqa h;

    static {
        ComponentName componentName;
        b = componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
        c = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
    }

    public bqb(bpo bpo2) {
        this.e = bpo2.a;
        this.d = hhk.E(bpo2.b);
        this.f = bpo2.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        Object object;
        Object object2;
        block10: {
            object2 = this.g;
            synchronized (object2) {
                object = this.h;
                if (object != null) {
                } else {
                    object = new bqa(this);
                    this.h = object;
                    Object object3 = new Intent();
                    object3.setComponent(b);
                    try {
                        if (((bqa)object).c((Intent)object3)) break block10;
                        ((bqa)object).c.e.unbindService((ServiceConnection)object);
                        object3 = new Intent();
                        object3.setComponent(c);
                        if (!((bqa)object).c((Intent)object3)) {
                            object3 = new bpp(4, 601, "AiCore service failed to bind.", null);
                            ((bqa)object).a((bpp)object3);
                        }
                    }
                    catch (SecurityException securityException) {
                        bpp bpp2 = new bpp(4, 601, "AiCore service failed to bind.", securityException);
                        ((bqa)object).a(bpp2);
                    }
                }
            }
        }
        object2 = ((bqa)object).a;
        synchronized (object2) {
            if (!((bqa)object).b.isCancelled()) return ((bqa)object).b;
            ((bqa)object).b();
            return ((bqa)object).b;
        }
    }

    public final hpn b() {
        return hno.f(hph.q(this.a()), new ain(3), (Executor)hom.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.g;
        synchronized (object) {
            bqa bqa2 = this.h;
            if (bqa2 != null) {
                this.e.unbindService((ServiceConnection)bqa2);
                this.h = null;
            }
            return;
        }
    }

    @Override
    public final void close() {
        this.c();
    }
}

