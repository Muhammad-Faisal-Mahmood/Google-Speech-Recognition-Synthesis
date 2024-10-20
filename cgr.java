/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 */
import android.content.Context;
import android.content.ServiceConnection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

public final class cgr {
    public static final Object a = new Object();
    public static volatile cgr b;

    public cgr() {
        new ConcurrentHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException runtimeException) {
            return;
        }
    }
}

