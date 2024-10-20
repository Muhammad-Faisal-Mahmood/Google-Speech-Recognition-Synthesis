/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

import J.N;

public class JavaExceptionReporter
implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean bl2) {
        this.a = uncaughtExceptionHandler;
        this.b = bl2;
    }

    private static void installHandler(boolean bl2) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), bl2));
    }

    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        Object object;
        if (!this.c && !ag$$ExternalSyntheticApiModelOutline1.m(throwable)) {
            this.c = true;
            boolean bl2 = this.b;
            object = throwable instanceof kmz ? throwable.getCause() : throwable;
            N.MLlibBXh(bl2, object);
        }
        if ((object = this.a) != null) {
            object.uncaughtException(thread, throwable);
        }
    }
}

