/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$Callback
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.HandlerThread
 */
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

public final class alp
extends MediaCodec.Callback {
    public final Object a = new Object();
    public final HandlerThread b;
    public Handler c;
    public final ArrayDeque d;
    public final ArrayDeque e;
    public MediaFormat f;
    public long g;
    public boolean h;
    public IllegalStateException i;
    public final jgs j;
    public final jgs k;
    private MediaFormat l;
    private MediaCodec.CodecException m;
    private MediaCodec.CryptoException n;

    public alp(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.j = new jgs(null);
        this.k = new jgs(null);
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
    }

    private final void d(MediaFormat mediaFormat) {
        this.k.l(-2);
        this.e.add(mediaFormat);
    }

    public final void a() {
        if (!this.e.isEmpty()) {
            this.l = (MediaFormat)this.e.getLast();
        }
        this.j.m();
        this.k.m();
        this.d.clear();
        this.e.clear();
    }

    public final void b() {
        Throwable throwable = this.i;
        if (throwable == null) {
            throwable = this.m;
            if (throwable == null) {
                throwable = this.n;
                if (throwable == null) {
                    return;
                }
                this.n = null;
                throw throwable;
            }
            this.m = null;
            throw throwable;
        }
        this.i = null;
        throw throwable;
    }

    public final boolean c() {
        return this.g > 0L || this.h;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCryptoError(MediaCodec object, MediaCodec.CryptoException cryptoException) {
        object = this.a;
        synchronized (object) {
            this.n = cryptoException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onError(MediaCodec object, MediaCodec.CodecException codecException) {
        object = this.a;
        synchronized (object) {
            this.m = codecException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int n2) {
        Object object = this.a;
        synchronized (object) {
            this.j.l(n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputBufferAvailable(MediaCodec object, int n2, MediaCodec.BufferInfo bufferInfo) {
        object = this.a;
        synchronized (object) {
            MediaFormat mediaFormat = this.l;
            if (mediaFormat != null) {
                this.d(mediaFormat);
                this.l = null;
            }
            this.k.l(n2);
            this.d.add(bufferInfo);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputFormatChanged(MediaCodec object, MediaFormat mediaFormat) {
        object = this.a;
        synchronized (object) {
            this.d(mediaFormat);
            this.l = null;
            return;
        }
    }
}

