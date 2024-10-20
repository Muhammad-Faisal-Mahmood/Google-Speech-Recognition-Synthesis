/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 */
import android.content.Context;
import android.net.ConnectivityManager;

public final class bfv
extends bfs {
    public final ConnectivityManager e;
    private final bfu f;

    public bfv(Context object, czh czh2) {
        jse.e(object, "context");
        super((Context)object, czh2);
        object = this.a.getSystemService("connectivity");
        jse.c(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.e = (ConnectivityManager)object;
        this.f = new bfu(this);
    }

    @Override
    public final void d() {
        try {
            bbi.a();
            Object object = bfw.a;
            ConnectivityManager connectivityManager = this.e;
            object = this.f;
            jse.e(connectivityManager, "<this>");
            jse.e(object, "networkCallback");
            ag$$ExternalSyntheticApiModelOutline1.m(connectivityManager, (ConnectivityManager.NetworkCallback)object);
            return;
        }
        catch (SecurityException securityException) {
            bbi.a().d(bfw.a, "Received exception while registering network callback", securityException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            bbi.a().d(bfw.a, "Received exception while registering network callback", illegalArgumentException);
            return;
        }
    }

    @Override
    public final void e() {
        try {
            bbi.a();
            String string = bfw.a;
            string = this.e;
            bfu bfu2 = this.f;
            jse.e(string, "<this>");
            jse.e((Object)bfu2, "networkCallback");
            string.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)bfu2);
            return;
        }
        catch (SecurityException securityException) {
            bbi.a().d(bfw.a, "Received exception while unregistering network callback", securityException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            bbi.a().d(bfw.a, "Received exception while unregistering network callback", illegalArgumentException);
            return;
        }
    }
}

