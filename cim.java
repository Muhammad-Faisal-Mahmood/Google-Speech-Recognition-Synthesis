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

public final class cim
extends cfm {
    public cim(Context context, Looper looper, cfe cfe2, cdr cdr2, cel cel2) {
        super(context, looper, 208, cfe2, cdr2, cel2);
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public final int a() {
        return 224500000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService")) instanceof cio ? (cio)iInterface : new cio((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    @Override
    public final cbm[] e() {
        return new cbm[]{cii.c, cii.b, cii.a};
    }
}

