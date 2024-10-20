/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.concurrent.Executor;

public final class cdv
implements Executor {
    public final Object a;
    private final int b;

    public /* synthetic */ cdv(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void execute(Runnable runnable) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        ((cqm)this.a).b(runnable);
                        return;
                    }
                    ((cqm)this.a).b(runnable);
                    return;
                }
                ((cqm)this.a).b(runnable);
                return;
            }
            ((Handler)this.a).post(runnable);
            return;
        }
        ((Handler)this.a).post(runnable);
    }
}

