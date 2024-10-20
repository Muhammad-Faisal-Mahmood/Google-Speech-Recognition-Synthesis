/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.MessageQueue$IdleHandler
 */
import android.app.Activity;
import android.os.MessageQueue;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

public final class ggs
implements MessageQueue.IdleHandler {
    public final Object a;
    private final int b;

    public /* synthetic */ ggs(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final boolean queueIdle() {
        if (this.b != 0) {
            Object object = this.a;
            bdr bdr2 = new bdr(object, 8);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ((djs)object).a.c(bdr2, 7000L, timeUnit);
            return false;
        }
        Object object = this.a;
        Object object2 = (ggv)object;
        if (!((ggv)object2).a && ((ggv)object2).c.isEmpty()) {
            block7: {
                object2 = fxf.aq("Recreating all activities");
                try {
                    if (!((ggv)object).a()) break block7;
                    ((ggv)object).a = true;
                    Object object3 = new ffd(object, 17);
                    fpk.e(gqk.i((Runnable)object3));
                    object3 = ((ggv)object).b.iterator();
                    while (object3.hasNext()) {
                        se.a((Activity)object3.next());
                    }
                    object3 = new ffd(object, 18);
                    fpk.e((Runnable)object3);
                }
                catch (Throwable throwable) {
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        jsd.f((Closeable)object2, throwable);
                        throw throwable2;
                    }
                }
            }
            jsd.f((Closeable)object2, null);
        }
        return false;
    }
}

