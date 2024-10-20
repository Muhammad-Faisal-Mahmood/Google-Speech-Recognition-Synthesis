/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.MessageQueue$IdleHandler
 */
import android.os.MessageQueue;

public final class gqb
implements MessageQueue.IdleHandler {
    public final gpc a;
    public final MessageQueue.IdleHandler b;

    public /* synthetic */ gqb(gpc gpc2, MessageQueue.IdleHandler idleHandler) {
        this.a = gpc2;
        this.b = idleHandler;
    }

    public final boolean queueIdle() {
        boolean bl2;
        long l2 = gqk.a;
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        MessageQueue.IdleHandler idleHandler = this.b;
        try {
            bl2 = idleHandler.queueIdle();
        }
        catch (Throwable throwable) {
            try {
                gne.c(throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                gno.f(goz2, gpc2);
                throw throwable2;
            }
        }
        gno.f(goz2, gpc2);
        return bl2;
    }
}

