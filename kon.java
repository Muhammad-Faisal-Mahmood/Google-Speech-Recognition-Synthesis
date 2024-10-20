/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.AccountManagerCallback
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.net.HttpNegotiateAuthenticator;

final class kon
extends BroadcastReceiver {
    final Context a;
    final koo b;

    public kon(koo koo2, Context context) {
        this.b = koo2;
        this.a = context;
    }

    public final void onReceive(Context object, Intent object2) {
        this.a.unregisterReceiver((BroadcastReceiver)this);
        object2 = this.b;
        object = object2.b;
        object2 = object2.a;
        object2.b.getAuthToken(object2.e, object2.d, object2.c, true, (AccountManagerCallback)new koo((HttpNegotiateAuthenticator)object, (kop)object2, 0), null);
    }
}

