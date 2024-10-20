/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class jxp {
    public static final jwt a;

    static {
        Handler handler = rw.y(Looper.getMainLooper());
        int n2 = jxo.a;
        a = new jxm(handler, "main");
    }
}

