/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class krk
extends kpr {
    public final AtomicInteger a;
    public final Executor b;
    public final ksi c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    final krs k;
    private final Executor l;
    private final AtomicBoolean m;

    public krk(krs krs2, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, ksi ksi2) {
        this.k = krs2;
        this.a = new AtomicInteger(3);
        this.l = new gaj((Object)this, (Object)executor, 6);
        this.b = executor2;
        this.c = new ksi(ksi2);
        this.m = new AtomicBoolean(false);
        this.h = httpURLConnection;
    }

    @Override
    public final void a(boolean bl2) {
        if (this.a.compareAndSet(0, 2)) {
            krj krj2 = new krj(this, bl2, 0);
            this.b.execute(this.g(krj2));
            return;
        }
        int n2 = this.a.get();
        StringBuilder stringBuilder = new StringBuilder("onReadSucceeded() called when not awaiting a read result; in state: ");
        stringBuilder.append(n2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public final void b(Exception exception) {
        this.j(exception);
    }

    @Override
    public final void c() {
        if (this.a.compareAndSet(1, 2)) {
            this.f();
            return;
        }
        int n2 = this.a.get();
        StringBuilder stringBuilder = new StringBuilder("onRewindSucceeded() called when not awaiting a rewind; in state: ");
        stringBuilder.append(n2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void d(krt krt2) {
        try {
            Executor executor = this.l;
            krs krs2 = this.k;
            kot kot2 = new kot((Object)krs2, (Object)krt2, 12, null);
            executor.execute(kot2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.j(rejectedExecutionException);
            return;
        }
    }

    public final void e() {
        this.d(new kri(this, 1));
    }

    public final void f() {
        Runnable runnable = this.g(new kri(this, 0));
        this.b.execute(runnable);
    }

    protected final Runnable g(krt krt2) {
        return new kot((Object)this.k, (Object)krt2, 11, null);
    }

    public final void h() {
        if (this.i != null && this.m.compareAndSet(false, true)) {
            this.i.close();
        }
    }

    protected final void i() {
        this.h();
        this.k.k();
    }

    public final void j(Throwable throwable) {
        this.k.h(throwable);
    }
}

