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

public final class cic
extends cfm {
    public final Context t;

    public cic(Context context, Looper looper, cct cct2, ccu ccu2, cfe cfe2) {
        super(context, looper, 29, cfe2, cct2, ccu2);
        this.t = context;
        cmj.b(context);
    }

    @Override
    public final int a() {
        return 11925000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService")) instanceof cid ? (cid)iInterface : new cid((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override
    public final cbm[] e() {
        return chp.b;
    }
}

