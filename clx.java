/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class clx
extends clt {
    @Override
    public final void d(Status status) {
        if (!status.a()) {
            Log.e((String)"UsageReportingClientImp", (String)"disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
        }
    }
}

