/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public class gbs
extends Handler {
    public gbs() {
        Looper.getMainLooper();
    }

    public gbs(Looper looper) {
        super(looper);
    }

    public gbs(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }

    public gbs(Looper looper, byte[] byArray) {
        super(looper);
        Looper.getMainLooper();
    }
}

