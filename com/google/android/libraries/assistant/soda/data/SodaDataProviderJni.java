/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
package com.google.android.libraries.assistant.soda.data;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class SodaDataProviderJni {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/data/SodaDataProviderJni");
    public final ReadWriteLock b = new ReentrantReadWriteLock();
    public boolean c = false;
    private final giu d;

    public SodaDataProviderJni(giu giu2) {
        this.d = giu2;
    }

    private final void getData(long l2, long l3, byte[] object) {
        object = (ifd)((hwp)ifd.a.l().c((byte[])object, hwj.a())).o();
        fxf.al(this.d.e((ifd)object), new cnm(this, l2, l3), (Executor)hom.a);
    }

    private final void onShutdown() {
        this.b.writeLock().lock();
        try {
            this.c = true;
            return;
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    public native void nativeHandleDataResponse(long var1, long var3, byte[] var5);
}

