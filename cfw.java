/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.util.Log
 */
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

public final class cfw
extends bow
implements IInterface {
    private cfc a;
    private final int b;

    public cfw() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public cfw(cfc cfc2, int n2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = cfc2;
        this.b = n2;
    }

    public final void b(int n2, IBinder iBinder, Bundle bundle) {
        a.s(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.v(n2, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override
    protected final boolean y(int n2, Parcel object, Parcel parcel) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return false;
                }
                n2 = object.readInt();
                IBinder iBinder = object.readStrongBinder();
                cfg cfg2 = (cfg)box.a((Parcel)object, cfg.CREATOR);
                box.b((Parcel)object);
                object = this.a;
                a.s(object, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                kl.at(cfg2);
                ((cfc)object).m = cfg2;
                if (((cfc)object).A()) {
                    object = cfg2.d;
                    cgf cgf2 = cgf.a();
                    object = object == null ? null : ((cfh)object).a;
                    cgf2.b((cgg)object);
                }
                this.b(n2, iBinder, cfg2.a);
            } else {
                object.readInt();
                Bundle bundle = (Bundle)box.a((Parcel)object, Bundle.CREATOR);
                box.b((Parcel)object);
                Log.wtf((String)"GmsClient", (String)"received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
            }
        } else {
            n2 = object.readInt();
            IBinder iBinder = object.readStrongBinder();
            Bundle bundle = (Bundle)box.a((Parcel)object, Bundle.CREATOR);
            box.b((Parcel)object);
            this.b(n2, iBinder, bundle);
        }
        parcel.writeNoException();
        return true;
    }
}

