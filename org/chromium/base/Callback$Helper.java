/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

import j$.util.Optional;
import org.chromium.base.Callback;

public abstract class Callback$Helper {
    static void onBooleanResultFromNative(Callback callback, boolean bl2) {
        callback.a();
    }

    static void onIntResultFromNative(Callback callback, int n2) {
        callback.a();
    }

    static void onLongResultFromNative(Callback callback, long l2) {
        callback.a();
    }

    static void onObjectResultFromNative(Callback callback, Object object) {
        callback.a();
    }

    static void onOptionalStringResultFromNative(Callback callback, boolean bl2, String string) {
        if (bl2) {
            Optional.of(string);
        } else {
            Optional.empty();
        }
        callback.a();
    }

    static void onTimeResultFromNative(Callback callback, long l2) {
        callback.a();
    }

    static void runRunnable(Runnable runnable) {
        runnable.run();
    }
}

