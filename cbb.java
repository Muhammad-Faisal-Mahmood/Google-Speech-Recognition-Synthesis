/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class cbb
extends cfm {
    public cbb(Context context, Looper looper, cfe cfe2, cct cct2, ccu ccu2) {
        super(context, looper, 40, cfe2, cct2, ccu2);
    }

    @Override
    public final int a() {
        return 11925000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService")) instanceof cbe ? (cbe)iInterface : new cbe((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override
    public final cbm[] e() {
        return caq.b;
    }
}

