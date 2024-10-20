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

public final class ckd
extends cfm {
    public ckd(Context context, Looper looper, cfe cfe2, cct cct2, ccu ccu2) {
        super(context, looper, 51, cfe2, cct2, ccu2);
    }

    @Override
    public final int a() {
        return 9410000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService")) instanceof ckc ? (ckc)iInterface : new ckc((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override
    public final cbm[] e() {
        return cjo.j;
    }
}

