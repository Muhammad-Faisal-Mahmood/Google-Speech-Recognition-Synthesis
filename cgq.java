/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class cgq
extends cfm {
    public cgq(Context context, Looper looper, cfe cfe2, cdr cdr2, cel cel2) {
        super(context, looper, 270, cfe2, cdr2, cel2);
    }

    @Override
    public final int a() {
        return 203400000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService")) instanceof cgm ? (cgm)iInterface : new cgm((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final cbm[] e() {
        return cbj.b;
    }

    @Override
    protected final Bundle s() {
        return new Bundle();
    }

    @Override
    protected final boolean y() {
        return true;
    }
}

