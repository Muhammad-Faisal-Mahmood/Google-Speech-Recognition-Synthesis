/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 *  android.util.Log
 */
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

public final class om
extends Thread {
    public static final om a;
    public final ArrayBlockingQueue b = new ArrayBlockingQueue(10);
    public final up c = new up(10);

    static {
        om om2;
        a = om2 = new om();
        om2.setName("AsyncLayoutInflator");
        om2.start();
    }

    private om() {
    }

    @Override
    public final void run() {
        while (true) {
            ol ol2;
            try {
                ol2 = (ol)this.b.take();
            }
            catch (InterruptedException interruptedException) {
                Log.w((String)"AsyncLayoutInflater", (Throwable)interruptedException);
                continue;
            }
            try {
                ol2.e = ol2.a.inflate(ol2.d, ol2.c, false);
            }
            catch (RuntimeException runtimeException) {
                Log.w((String)"AsyncLayoutInflater", (String)"Failed to inflate resource in the background! Retrying on the UI thread", (Throwable)runtimeException);
            }
            if (ol2.e != null) {
                Executor executor = ol2.f;
            }
            Message.obtain((Handler)ol2.b, (int)0, (Object)ol2).sendToTarget();
            continue;
            break;
        }
    }
}

