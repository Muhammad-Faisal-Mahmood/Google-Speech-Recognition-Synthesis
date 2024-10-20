/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

public final class DownloadActivityStarterService
extends fdg {
    public fdf a;
    private final iys b = new iys();

    @Override
    public final IBinder onBind(Intent object) {
        super.onBind((Intent)object);
        object = this.b.a;
        fxf.K(object);
        return object;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        ivc ivc2 = new ivc(iyp.a((Context)this), this.b);
        Object object = ivc2.a;
        Object object2 = this.a;
        a.s(object2, "bindableService");
        object2 = fde.e((fdc)object2);
        Object object3 = ((jjc)object).r.a;
        object = ((iyc)((ksb)object2).b).a;
        ((HashMap)object3).put(object, object2);
        new hrs(ivc2.j(), this.b, this).b();
    }
}

