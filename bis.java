/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.concurrent.Executor;

public final class bis
implements Executor {
    final czh a;

    public bis(czh czh2) {
        this.a = czh2;
    }

    @Override
    public final void execute(Runnable runnable) {
        ((Handler)this.a.b).post(runnable);
    }
}

