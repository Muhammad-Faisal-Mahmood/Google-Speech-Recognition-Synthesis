/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 */
import android.net.ConnectivityManager;

public final class gdc
implements imb {
    private final jnu a;

    public gdc(jnu jnu2) {
        this.a = jnu2;
    }

    public final ConnectivityManager a() {
        ConnectivityManager connectivityManager = (ConnectivityManager)((ilt)this.a).a().getSystemService("connectivity");
        idi.m(connectivityManager);
        return connectivityManager;
    }
}

