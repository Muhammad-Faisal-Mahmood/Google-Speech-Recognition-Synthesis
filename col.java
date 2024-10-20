/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class col
implements imb {
    private final jnu a;

    public col(jnu jnu2) {
        this.a = jnu2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Handler a() {
        Handler handler;
        int n2 = ((cpj)((Object)((gto)((imc)this.a).a).e((Object)cpj.a))).ordinal();
        if (n2 != 0) {
            if (n2 != 1) throw new AssertionError((Object)"No matching UiThreadHandlerMode found.");
            handler = rw.y(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        idi.m(handler);
        return handler;
    }
}

