/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.google.android.libraries.mdi.download.workmanager.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

public final class PeriodicWorker
extends bbh {
    public final cty e;
    private final Executor f;

    public PeriodicWorker(Context context, WorkerParameters workerParameters, cty cty2, hpq hpq2) {
        super(context, workerParameters);
        this.e = cty2;
        this.f = hpq2;
    }

    @Override
    public final hpn b() {
        String string = this.d().b("MDD_TASK_TAG_KEY");
        if (string == null) {
            Log.e((String)"MddPeriodicWorker", (String)"can't find MDD task tag");
            return hhk.K(new bbe());
        }
        return fxf.aj(fxf.ai(new ctz(this, string, 11, null), this.f), new cxc(9), this.f);
    }
}

