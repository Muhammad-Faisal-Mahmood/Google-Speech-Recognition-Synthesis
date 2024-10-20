/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 */
package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class PhenotypeUpdateBackgroundBroadcastReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent object2) {
        if ((object2 = object2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) != null) {
            if (!((String)object2).contains("../") && !((String)object2).contains("/..")) {
                dua dua2 = dua.a((Context)object);
                if (dua2 == null) {
                    fxf.A(dua.f());
                    return;
                }
                if (!(object = dvt.a((Context)object)).isEmpty()) {
                    Object object3 = (dvt)object.get(object2);
                    if (object3 != null && ((dvt)object3).b.equals(hqn.d)) {
                        object = this.goAsync();
                        object3 = hno.g(hph.q(hno.f(hph.q(dvv.b(dua2).a()), new cym(object2, 17), dua2.d())), new cxe(object3, object2, (Object)dua2, 9, null), dua2.d());
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        hpr hpr2 = dua2.d();
                        object3 = ((hph)object3).r(25L, timeUnit, hpr2);
                        ((hnk)object3).c(new ai(object3, object2, object, 19), dua2.d());
                        return;
                    }
                    Log.i((String)"PhenotypeBackgroundRecv", (String)a.aj((String)object2, "Skipping ", " which doesn't use ProcessStable flags."));
                    return;
                }
            } else {
                Log.w((String)"PhenotypeBackgroundRecv", (String)a.aj((String)object2, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            }
        }
    }
}

