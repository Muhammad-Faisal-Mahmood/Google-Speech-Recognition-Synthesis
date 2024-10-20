/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 */
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

final class alo
implements alv {
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public final MediaCodec c;
    public final AtomicReference d;
    public final afn e;
    private final HandlerThread f;
    private Handler g;
    private boolean h;

    public alo(MediaCodec mediaCodec, HandlerThread handlerThread) {
        afn afn2 = new afn();
        this.c = mediaCodec;
        this.f = handlerThread;
        this.e = afn2;
        this.d = new AtomicReference();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static aln h() {
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            if (!arrayDeque.isEmpty()) return (aln)arrayDeque.removeFirst();
            return new aln();
        }
    }

    private static byte[] i(byte[] byArray, byte[] byArray2) {
        if (byArray == null) {
            return byArray2;
        }
        if (byArray2 != null && byArray2.length >= 16) {
            System.arraycopy(byArray, 0, byArray2, 0, 16);
            return byArray2;
        }
        return Arrays.copyOf(byArray, 16);
    }

    private static int[] j(int[] nArray, int[] nArray2) {
        int n2;
        if (nArray == null) {
            return nArray2;
        }
        if (nArray2 != null && nArray2.length >= (n2 = nArray.length)) {
            System.arraycopy(nArray, 0, nArray2, 0, n2);
            return nArray2;
        }
        return Arrays.copyOf(nArray, nArray.length);
    }

    @Override
    public final void a() {
        if (this.h) {
            try {
                Handler handler = this.g;
                abr.i(handler);
                handler.removeCallbacksAndMessages(null);
                this.e.f();
                handler = this.g;
                abr.i(handler);
                handler.obtainMessage(3).sendToTarget();
                this.e.a();
                return;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(interruptedException);
            }
        }
    }

    @Override
    public final void b() {
        RuntimeException runtimeException = this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void c(Bundle bundle) {
        this.b();
        Handler handler = this.g;
        int n2 = agf.a;
        handler.obtainMessage(4, (Object)bundle).sendToTarget();
    }

    @Override
    public final void d() {
        if (this.h) {
            this.a();
            this.f.quit();
        }
        this.h = false;
    }

    @Override
    public final void e() {
        if (!this.h) {
            this.f.start();
            this.g = new alm(this, this.f.getLooper());
            this.h = true;
        }
    }

    @Override
    public final void f(int n2, int n3, long l2, int n4) {
        this.b();
        aln aln2 = alo.h();
        aln2.a(n2, n3, l2, n4);
        Handler handler = this.g;
        n2 = agf.a;
        handler.obtainMessage(1, (Object)aln2).sendToTarget();
    }

    @Override
    public final void g(int n2, ahu object, long l2) {
        this.b();
        aln aln2 = alo.h();
        aln2.a(n2, 0, l2, 0);
        MediaCodec.CryptoInfo cryptoInfo = aln2.d;
        cryptoInfo.numSubSamples = ((ahu)object).d;
        cryptoInfo.numBytesOfClearData = alo.j(((ahu)object).b, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = alo.j(((ahu)object).c, cryptoInfo.numBytesOfEncryptedData);
        byte[] byArray = alo.i(null, cryptoInfo.key);
        abr.i(byArray);
        cryptoInfo.key = byArray;
        object = alo.i(((ahu)object).a, cryptoInfo.iv);
        abr.i(object);
        cryptoInfo.iv = (byte[])object;
        cryptoInfo.mode = 0;
        n2 = agf.a;
        ag$$ExternalSyntheticApiModelOutline1.m(cryptoInfo, new MediaCodec.CryptoInfo.Pattern(0, 0));
        this.g.obtainMessage(2, (Object)aln2).sendToTarget();
    }
}

