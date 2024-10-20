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

public final class ckm
extends cfm
implements ccp {
    public final cfe t;
    public final Integer u;
    private final boolean v;
    private final Bundle w;

    public ckm(Context context, Looper looper, cfe cfe2, Bundle bundle, cct cct2, ccu ccu2) {
        super(context, looper, 44, cfe2, cct2, ccu2);
        this.v = true;
        this.t = cfe2;
        this.w = bundle;
        this.u = cfe2.g;
    }

    @Override
    public final int a() {
        return 12451000;
    }

    @Override
    protected final /* synthetic */ IInterface b(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService")) instanceof ckk ? (ckk)iInterface : new ckk((IBinder)object));
        return object;
    }

    @Override
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final boolean l() {
        return this.v;
    }

    @Override
    protected final Bundle s() {
        cfe cfe2 = this.t;
        if (!this.b.getPackageName().equals(cfe2.d)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", this.t.d);
        }
        return this.w;
    }
}

