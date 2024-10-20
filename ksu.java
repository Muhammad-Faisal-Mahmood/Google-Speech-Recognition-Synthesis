/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;

final class ksu
extends kps {
    final ksv a;

    public ksu(ksv ksv2) {
        this.a = ksv2;
    }

    private final void g(IOException iOException) {
        ksv ksv2 = this.a;
        ksv2.f = iOException;
        Closeable closeable = ksv2.c;
        if (closeable != null) {
            closeable.c = iOException;
            closeable.a = true;
            closeable.b = null;
        }
        if ((closeable = ksv2.d) != null) {
            ((ksx)closeable).d = iOException;
            ((ksx)closeable).f = true;
        }
        ksv.e(ksv2);
        this.a.a.c();
    }

    @Override
    public final void a(kpt kpt2, kpv kpv2, kod kod2) {
        if (kod2 != null) {
            this.a.e = kpv2;
            this.g(kod2);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    @Override
    public final void b(kpt object, kpv kpv2, ByteBuffer byteBuffer) {
        object = this.a;
        ((ksv)object).e = kpv2;
        ((ksv)object).a.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(kpt object, kpv kpv2, String string) {
        this.a.g = true;
        try {
            object = new URL(string);
            boolean bl2 = ((URL)object).getProtocol().equals(ksv.a(this.a).getProtocol());
            if (ksv.c(this.a)) {
                ksv.f(this.a, (URL)object);
            }
            if (ksv.d(this.a) && bl2) {
                this.a.b.b();
                return;
            }
        }
        catch (MalformedURLException malformedURLException) {}
        object = this.a;
        ((ksv)object).e = kpv2;
        ((ksv)object).b.a();
        this.g(null);
    }

    @Override
    public final void d(kpt object, kpv kpv2) {
        object = this.a;
        ((ksv)object).e = kpv2;
        ksv.e((ksv)object);
        this.a.a.c();
    }

    @Override
    public final void e(kpt kpt2, kpv kpv2) {
        this.a.e = kpv2;
        this.g(null);
    }

    @Override
    public final void f(kpt kpt2, kpv kpv2) {
        this.a.e = kpv2;
        this.g(new IOException("disconnect() called"));
    }
}

