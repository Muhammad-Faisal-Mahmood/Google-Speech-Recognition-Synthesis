/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

final class cev
extends gbs {
    final cfc a;

    public cev(cfc cfc2, Looper looper) {
        this.a = cfc2;
        super(looper, (byte[])null);
    }

    private static final void a(Message object) {
        object = (cew)((Message)object).obj;
        ((cew)object).b();
        ((cew)object).f();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
        {
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message var1_1) {
        if (this.a.n.get() != var1_1.arg1) {
            if (cev.b((Message)var1_1)) {
                cev.a((Message)var1_1);
            }
            return;
        }
        if (!(var1_1.what != 1 && var1_1.what != 7 && var1_1.what != 4 && var1_1.what != 5 || this.a.k())) {
            cev.a((Message)var1_1);
            return;
        }
        var2_3 = var1_1.what;
        var3_4 = null;
        if (var2_3 == 4) {
            block26: {
                this.a.k = new cbk(var1_1.arg2);
                var1_1 = this.a;
                if (!(var1_1.l || TextUtils.isEmpty((CharSequence)var1_1.c()) || TextUtils.isEmpty(null))) {
                    Class.forName(var1_1.c());
                    var1_1 = this.a;
                    if (!var1_1.l) break block26;
                }
lbl19:
                // 4 sources

                while (true) {
                    var1_1 = var3_4 = this.a.k;
                    if (var3_4 == null) {
                        var1_1 = new cbk(8);
                    }
                    this.a.f.a((cbk)var1_1);
                    System.currentTimeMillis();
                    return;
                }
                catch (ClassNotFoundException var1_2) {
                    ** continue;
                }
            }
            cfc.C((cfc)var1_1, 3);
            return;
        }
        if (var1_1.what == 5) {
            var1_1 = var3_4 = this.a.k;
            if (var3_4 == null) {
                var1_1 = new cbk(8);
            }
            this.a.f.a((cbk)var1_1);
            System.currentTimeMillis();
            return;
        }
        if (var1_1.what == 3) {
            if (var1_1.obj instanceof PendingIntent) {
                var3_4 = (PendingIntent)var1_1.obj;
            }
            var1_1 = new cbk(var1_1.arg2, (PendingIntent)var3_4);
            this.a.f.a((cbk)var1_1);
            System.currentTimeMillis();
            return;
        }
        if (var1_1.what == 6) {
            cfc.C(this.a, 5);
            var3_4 = this.a.q;
            if (var3_4 != null) {
                var2_3 = var1_1.arg2;
                var3_4.a.a(var2_3);
            }
            var2_3 = var1_1.arg2;
            System.currentTimeMillis();
            this.a.x(5, 1, null);
            return;
        }
        if (var1_1.what == 2 && !this.a.j()) {
            cev.a((Message)var1_1);
            return;
        }
        if (!cev.b((Message)var1_1)) {
            var2_3 = var1_1.what;
            var1_1 = new StringBuilder("Don't know how to handle message: ");
            var1_1.append(var2_3);
            Log.wtf((String)"GmsClient", (String)var1_1.toString(), (Throwable)new Exception());
            return;
        }
        var1_1 = (cew)var1_1.obj;
        synchronized (var1_1) {
            var3_4 = var1_1.d;
            if (var1_1.e) {
                Log.w((String)"GmsClient", (String)a.ar(var1_1, "Callback proxy ", " being reused. This is not safe."));
            }
            ** if (var3_4 == null) goto lbl79
        }
lbl-1000:
        // 1 sources

        {
            var1_1.d();
        }
lbl79:
        // 2 sources

        synchronized (var1_1) {
            var1_1.e = true;
        }
        var1_1.f();
    }
}

