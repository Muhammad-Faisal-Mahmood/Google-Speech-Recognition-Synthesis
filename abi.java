/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.wear.ambient.AmbientDelegate;

public class abi
extends Service
implements abe {
    private final AmbientDelegate a = new AmbientDelegate(this);

    @Override
    public final abb getLifecycle() {
        return (abb)this.a.b;
    }

    public IBinder onBind(Intent intent) {
        jse.e(intent, "intent");
        this.a.j(aaz.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.j(aaz.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        AmbientDelegate ambientDelegate = this.a;
        ambientDelegate.j(aaz.ON_STOP);
        ambientDelegate.j(aaz.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int n2) {
        this.a.j(aaz.ON_START);
        super.onStart(intent, n2);
    }
}

