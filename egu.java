/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class egu
extends InputStream
implements InputStreamRetargetInterface {
    private final hpn a;
    private dzi b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private int d;

    public egu(hpn hpn2) {
        this.a = hpn2;
    }

    private final void a() {
        gto gto2;
        if (this.b != null) {
            return;
        }
        try {
            gto2 = (gto)this.a.get(30L, TimeUnit.SECONDS);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new elu("Initialization interrupted", interruptedException);
        }
        catch (CancellationException cancellationException) {
            throw new elu("Initialization failed", cancellationException);
        }
        catch (ExecutionException executionException) {
            if (executionException.getCause() == null) {
                throw new elu("Initialization failed", executionException);
            }
            throw new elu("Initialization failed", executionException.getCause());
        }
        catch (TimeoutException timeoutException) {
            throw new elu("Initialization timed out", timeoutException);
        }
        if (gto2.g()) {
            this.b = (dzi)gto2.c();
            return;
        }
        throw new elu("No AudioAccessor provided", new NoSuchElementException());
    }

    @Override
    public final void close() {
        ((heg)((heg)egv.a.c()).j("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "close", 170, "AudioInputStreamProducer.java")).r("#audio# close");
        this.c.set(true);
    }

    @Override
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        synchronized (this) {
            int n4;
            if (this.c.get()) {
                ((heg)((heg)egv.a.h()).j("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 79, "AudioInputStreamProducer.java")).r("#audio# read failed: stream closed.");
                return -1;
            }
            this.a();
            int n5 = Math.min(n3, byArray.length);
            n3 = 0;
            while (true) {
                n4 = n3;
                if (n3 >= n5) break;
                n4 = this.b.a(byArray, this.d + n3, n2 + n3, n5 - n3);
                if (n4 < 0) {
                    n4 = n3;
                    if (n3 != 0) break;
                    n4 = -1;
                    break;
                }
                n3 += n4;
            }
            if (n4 >= 0) {
                this.d += n4;
                return n4;
            }
            if (!this.c.get()) {
                ((heg)((heg)egv.a.h()).j("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 88, "AudioInputStreamProducer.java")).r("#audio# read failed: read EOF from AudioAccessor.");
                this.close();
            } else {
                ((heg)((heg)egv.a.f()).j("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer$AudioAccessorInputStream", "read", 91, "AudioInputStreamProducer.java")).r("#audio# AudioAccessor reached EOF.");
            }
            return -1;
        }
    }

    @Override
    public final long skip(long l2) {
        this.d += (int)l2;
        return l2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

