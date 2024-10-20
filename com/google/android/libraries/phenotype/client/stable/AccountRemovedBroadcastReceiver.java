/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 *  hom
 */
package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class AccountRemovedBroadcastReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent object2) {
        Object object3;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(object2.getAction()) && (object3 = object2.getStringExtra("accountType")) != null && ("com.google".equals(object3) || "com.google.work".equals(object3) || "cn.google".equals(object3) || "__logged_out_type".equals(object3))) {
            if ((object2 = (object2 = object2.getExtras()) != null ? object2.getString("authAccount") : null) != null && (((String)object2).contains("../") || ((String)object2).contains("/.."))) {
                Log.w((String)"AccountRemovedRecv", (String)a.aj((String)object2, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                return;
            }
            if (!dua.f()) {
                dua dua2 = dua.a(object);
                if (dua2 == null) {
                    Log.w((String)"AccountRemovedRecv", (String)"Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult pendingResult = this.goAsync();
                object3 = object2 != null ? hno.g(hph.q(dvv.b(dua2).b(new cym(object2, 16), dua2.d())), new cww(dua2, object2, 20), dua2.d()) : hpj.a;
                object3 = hmv.f((hpn)object3, IOException.class, new dti(3), (Executor)hom.a);
                object = object2 != null ? dua2.d().be(new dpw(object, object2, 5, null)) : hpj.a;
                hhk.Z(new hpn[]{object3, object}).a(new bdr(pendingResult, 10), (Executor)hom.a);
            }
        }
    }
}

