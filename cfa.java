/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class cfa
extends ceu {
    public final IBinder g;
    final cfc h;

    public cfa(cfc cfc2, int n2, IBinder iBinder, Bundle bundle) {
        this.h = cfc2;
        super(cfc2, n2, bundle);
        this.g = iBinder;
    }

    @Override
    protected final void a(cbk cbk2) {
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = this.h.r;
        if (ambientModeSupport$AmbientController != null) {
            ambientModeSupport$AmbientController.b(cbk2);
        }
        System.currentTimeMillis();
    }

    @Override
    protected final boolean c() {
        Object object;
        block4: {
            StringBuilder stringBuilder;
            String string;
            try {
                object = this.g;
                kl.at(object);
                string = object.getInterfaceDescriptor();
                if (this.h.c().equals(string)) break block4;
                object = this.h;
                stringBuilder = new StringBuilder("service descriptor mismatch: ");
                stringBuilder.append(((cfc)object).c());
            }
            catch (RemoteException remoteException) {
                Log.w((String)"GmsClient", (String)"service probably died");
                return false;
            }
            stringBuilder.append(" vs. ");
            stringBuilder.append(string);
            Log.w((String)"GmsClient", (String)stringBuilder.toString());
            return false;
        }
        object = this.h.b(this.g);
        if (object != null && (this.h.x(2, 4, (IInterface)object) || this.h.x(3, 4, (IInterface)object))) {
            object = this.h;
            ((cfc)object).k = null;
            object = ((cfc)object).q;
            if (object != null) {
                ((AmbientMode$AmbientController)object).a.b();
            }
            return true;
        }
        return false;
    }
}

