/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public class ccd {
    public static final ccd a = new ccd(true, null);
    public final boolean b;
    final Throwable c;

    public ccd(boolean bl2, Throwable throwable) {
        this.b = bl2;
        this.c = throwable;
    }

    public void a() {
    }

    public final void b() {
        if (!this.b && Log.isLoggable((String)"GoogleCertificatesRslt", (int)3)) {
            if (this.c != null) {
                this.a();
                return;
            }
            this.a();
        }
    }
}

