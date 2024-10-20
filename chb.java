/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;

final class chb
extends Thread {
    public chb(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Process.setThreadPriority((int)19);
        synchronized (this) {
            try {
                try {
                    while (true) {
                        this.wait();
                    }
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

