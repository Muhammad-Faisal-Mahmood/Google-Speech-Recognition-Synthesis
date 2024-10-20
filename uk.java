/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.concurrent.Callable;

public final class uk
implements Runnable {
    private final Callable a;
    private final um b;
    private final Handler c;

    public uk(Handler handler, Callable callable, um um2) {
        this.a = callable;
        this.b = um2;
        this.c = handler;
    }

    @Override
    public final void run() {
        hti hti2;
        try {
            hti2 = ((ue)this.a).a();
        }
        catch (Exception exception) {
            hti2 = null;
        }
        um um2 = this.b;
        this.c.post((Runnable)new aj((Object)um2, (Object)hti2, 17, null));
    }
}

