/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net.impl;

import J.N;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.CronetUrlRequest;

public final class CronetUploadDataStream
extends kpr {
    public static final String a = "CronetUploadDataStream";
    public final ksi b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public final AtomicInteger f = new AtomicInteger();
    public ByteBuffer g;
    public final Object h;
    public long i;
    public int j = 3;
    private final Executor k;
    private long l;
    private final Runnable m = new jhz(this, 14);
    private boolean n;

    public CronetUploadDataStream(kpq kpq2, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.h = new Object();
        this.k = executor;
        this.b = new ksi(kpq2);
        this.c = cronetUrlRequest;
    }

    public static /* bridge */ /* synthetic */ void g(CronetUploadDataStream cronetUploadDataStream) {
        cronetUploadDataStream.h(3);
    }

    private final void h(int n2) {
        int n3 = this.j;
        if (n3 == n2) {
            return;
        }
        throw new IllegalStateException(a.an(n3, n2, "Expected ", ", but was "));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void i() {
        Object object = this.h;
        synchronized (object) {
            if (this.j == 0) {
                this.n = true;
                return;
            }
            long l2 = this.i;
            if (l2 == 0L) {
                return;
            }
            N.MMW1G0N1(l2);
            this.i = 0L;
        }
        this.f(new jhz(this, 16));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void j() {
        Object object = this.h;
        synchronized (object) {
            if (this.j == 0) {
                IllegalStateException illegalStateException = new IllegalStateException("Method should not be called when read has not completed.");
                throw illegalStateException;
            }
            if (this.n) {
                this.i();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(boolean bl2) {
        Object object = this.h;
        synchronized (object) {
            long l2;
            long l3;
            int n2;
            this.h(0);
            if (this.l != (long)this.g.limit()) {
                IllegalStateException illegalStateException = new IllegalStateException("ByteBuffer limit changed");
                throw illegalStateException;
            }
            if (bl2 && this.d >= 0L) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Non-chunked upload can't have last chunk");
                throw illegalArgumentException;
            }
            int n3 = n2 = this.g.position();
            if (n2 == 0) {
                if (!bl2) {
                    IllegalStateException illegalStateException = new IllegalStateException("Bytes read can't be zero except for last chunk!");
                    this.e(illegalStateException);
                    return;
                }
                n3 = 0;
            }
            this.e = l3 = this.e - (long)n3;
            if (l3 < 0L && (l2 = this.d) >= 0L) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", l2 - l3, this.d));
                throw illegalArgumentException;
            }
            ByteBuffer byteBuffer = (ByteBuffer)this.g.position(0);
            this.g = null;
            this.j = 3;
            this.j();
            l2 = this.i;
            if (l2 == 0L) {
                return;
            }
            N.MpWH3VIr(l2, this, n3, bl2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(Exception exception) {
        Object object = this.h;
        synchronized (object) {
            this.h(1);
            this.e(exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c() {
        Object object = this.h;
        synchronized (object) {
            this.h(1);
            this.j = 3;
            this.e = this.d;
            long l2 = this.i;
            if (l2 == 0L) {
                return;
            }
            N.MFpRjSMv(l2, this);
            return;
        }
    }

    public final void d() {
        this.c.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Throwable throwable) {
        Object object = this.h;
        synchronized (object) {
            if (this.j != 3) {
                this.j = 3;
                this.g = null;
                this.j();
                // MONITOREXIT @DISABLED, blocks:[2, 3] lbl7 : MonitorExitStatement: MONITOREXIT : var2_2
                this.c.k(throwable);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("There is no read or rewind or length check in progress.", throwable);
            throw illegalStateException;
        }
    }

    final void f(Runnable runnable) {
        try {
            this.k.execute(runnable);
            return;
        }
        catch (Throwable throwable) {
            this.c.k(throwable);
            return;
        }
    }

    void onUploadDataStreamDestroyed() {
        this.i();
    }

    void readData(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        this.l = byteBuffer.limit();
        this.f(this.m);
    }

    void rewind() {
        this.f(new jhz(this, 15));
    }
}

