/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.concurrent.Executor;

public final class cei {
    public volatile Object a;
    public volatile ceg b;
    private final Executor c;

    public cei(Looper looper, Object object, String string) {
        this.c = new uj(looper, 2);
        a.s(object, "Listener must not be null");
        this.a = object;
        kl.ar(string);
        this.b = new ceg(object, string);
    }

    public final void a(ceh object) {
        object = new aks((Object)this, object, 20, null);
        this.c.execute((Runnable)object);
    }
}

