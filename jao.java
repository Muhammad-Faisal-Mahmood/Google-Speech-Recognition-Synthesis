/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.admin.DevicePolicyManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jao
implements ServiceConnection,
iza {
    private static final Logger a = Logger.getLogger(jao.class.getName());
    private final Intent b;
    private final int c;
    private final Executor d;
    private Context e;
    private int f;
    private int g;
    private final izg h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public jao(Executor executor, Context context, Intent intent, izg izg2) {
        synchronized (this) {
            this.b = intent;
            this.c = 1;
            this.h = izg2;
            this.e = context;
            this.d = executor;
            this.f = 1;
            this.g = 1;
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        synchronized (this) {
            block11: {
                if (this.f != 1) break block11;
                this.f = 2;
                var4_1 = this.e;
                var7_4 = this.b;
                var1_5 = this.c;
                var5_6 = jan.a;
                try {
                    block14: {
                        block12: {
                            block13: {
                                fxf.B(true, "BindingChannelCredentials is expected to have null devicePolicyAdmin when targetUserHandle is not set");
                                var2_8 = var5_6.ordinal();
                                if (var2_8 == 0) break block12;
                                if (var2_8 == 1) break block13;
                                if (var2_8 != 2) ** GOTO lbl-1000
                                var3_9 = ag$$ExternalSyntheticApiModelOutline0.m((DevicePolicyManager)var4_1.getSystemService("device_policy"), null, (Intent)var7_4, this, var1_5, null);
                                break block14;
                            }
                            var3_9 = sk$$ExternalSyntheticApiModelOutline1.m((Context)var4_1, (Intent)var7_4, this, var1_5, null);
                            break block14;
                        }
                        var3_9 = var4_1.bindService((Intent)var7_4, (ServiceConnection)this, var1_5);
                    }
                    if (var3_9) {
                        var4_1 = iyh.b;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_10 = iyh.i;
                        var4_1 = var5_6.d;
                        var8_11 = String.valueOf(var7_4);
                        var7_4 = new StringBuilder();
                        var7_4.append((String)var4_1);
                        var7_4.append("(");
                        var7_4.append(var8_11);
                        var7_4.append(") returned false");
                        var4_1 = var6_10.e(var7_4.toString());
                    }
                }
                catch (RuntimeException var4_2) {
                    var4_1 = iyh.j.d(var4_2).e("RuntimeException from ".concat(String.valueOf(var5_6.d)));
                }
                catch (SecurityException var4_3) {
                    var4_1 = iyh.f.d(var4_3).e("SecurityException from ".concat(String.valueOf(var5_6.d)));
                }
                if (!var4_1.g()) {
                    var5_6 = this.e;
                    try {
                        var5_6.unbindService((ServiceConnection)this);
                    }
                    catch (RuntimeException var5_7) {
                        jao.a.logp(Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", var5_7);
                    }
                    this.f = 4;
                    var5_6 = this.d;
                    var6_10 = new hsk((Object)this, var4_1, 14, null);
                    var5_6.execute((Runnable)var6_10);
                    return;
                }
            }
            return;
        }
    }

    public final void b(iyh iyh2) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", iyh2);
        this.e = null;
        if (this.g != 4) {
            this.g = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.h.m(iyh2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c(iyh iyh2) {
        Object object;
        synchronized (this) {
            int n2 = this.f;
            object = n2 != 2 && n2 != 3 ? null : this.e;
            this.f = 4;
        }
        this.d.execute(new hsk((Object)this, (Object)iyh2, 15, null));
        if (object != null) {
            object.unbindService((ServiceConnection)this);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        this.c(iyh.k.e("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    public final void onNullBinding(ComponentName componentName) {
        this.c(iyh.i.e("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean bl2;
        synchronized (this) {
            if (this.f != 2) return;
            this.f = 3;
            bl2 = true;
        }
        if (!bl2) return;
        if (this.g != 1) return;
        this.g = 3;
        a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
        this.h.k(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.c(iyh.k.e("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}

