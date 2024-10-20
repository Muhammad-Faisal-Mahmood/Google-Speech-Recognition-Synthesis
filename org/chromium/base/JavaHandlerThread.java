/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 */
package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;

public class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    public JavaHandlerThread(String string, int n2) {
        this.a = new HandlerThread(string, n2);
    }

    private static JavaHandlerThread create(String string, int n2) {
        return new JavaHandlerThread(string, n2);
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    private boolean isAlive() {
        return this.a.isAlive();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void joinThread() {
        boolean bl2 = false;
        while (!bl2) {
            try {
                this.a.join();
                return;
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        kmy kmy2 = new kmy(this, 0);
        this.a.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)kmy2);
    }

    private void quitThreadSafely(long l2) {
        new Handler(this.a.getLooper()).post((Runnable)new knf(this, l2, 1));
        this.a.getLooper().quitSafely();
    }

    private void startAndInitialize(long l2, long l3) {
        if (this.a.getState() == Thread.State.NEW) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post((Runnable)new kmx(l2, l3));
    }
}

