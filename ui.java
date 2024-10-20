/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;

public final class ui
extends Thread {
    private final int a;

    public ui(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority((int)this.a);
        super.run();
    }
}

