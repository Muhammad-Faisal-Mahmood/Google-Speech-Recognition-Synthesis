/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.MessageQueue$IdleHandler
 */
import J.N;
import android.os.Looper;
import android.os.MessageQueue;
import org.chromium.base.ApplicationStatus;

public final class gni
implements Runnable {
    private final int a;

    public /* synthetic */ gni(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        block13: {
            block12: {
                switch (this.a) {
                    default: {
                        if (N.MnfJQqTB()) {
                            if (knj.b != null) break;
                            knj.b = new knj();
                            break;
                        }
                        break block12;
                    }
                    case 9: {
                        if (ApplicationStatus.a != null) {
                            return;
                        }
                        ApplicationStatus.a = new kmq();
                        ApplicationStatus.a(ApplicationStatus.a);
                    }
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: {
                        return;
                    }
                    case 2: {
                        throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                    }
                    case 1: {
                        gno.l = null;
                        return;
                    }
                    case 0: {
                        Object e2 = gno.f.remove();
                        if (e2 == gno.h) {
                            gno.g.pop();
                            return;
                        }
                        gno.g.push((gpc)e2);
                        return;
                    }
                }
                if (!knj.a) {
                    Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)knj.b);
                    knj.a = true;
                    return;
                }
                break block13;
            }
            if (knj.b != null && knj.a) {
                Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler)knj.b);
                knj.a = false;
            }
        }
    }
}

