/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public final class kmd
extends InputStream
implements InputStreamRetargetInterface {
    final Object a;
    private final int b;

    public kmd(klm klm2, int n2) {
        this.b = n2;
        this.a = klm2;
    }

    public kmd(kme kme2, int n2) {
        this.b = n2;
        this.a = kme2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int available() {
        long l2;
        if (this.b != 0) {
            l2 = Math.min(((klm)this.a).b, Integer.MAX_VALUE);
            return (int)l2;
        }
        kme kme2 = (kme)this.a;
        if (kme2.c) throw new IOException("closed");
        l2 = Math.min(kme2.b.b, Integer.MAX_VALUE);
        return (int)l2;
    }

    @Override
    public final void close() {
        if (this.b != 0) {
            return;
        }
        ((kme)this.a).close();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int read() {
        byte by2;
        if (this.b != 0) {
            klm klm2 = (klm)this.a;
            if (klm2.b <= 0L) return -1;
            by2 = klm2.d();
            return by2 & 0xFF;
        }
        kme kme2 = (kme)this.a;
        if (kme2.c) throw new IOException("closed");
        klm klm3 = kme2.b;
        if (klm3.b == 0L && kme2.a.b(klm3, 8192L) == -1L) {
            return -1;
        }
        by2 = ((kme)this.a).b.d();
        return by2 & 0xFF;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.b != 0) {
            jse.e(byArray, "sink");
            return ((klm)this.a).e(byArray, n2, n3);
        }
        jse.e(byArray, "data");
        if (!((kme)this.a).c) {
            kmp.x(byArray.length, n2, n3);
            kme kme2 = (kme)this.a;
            klm klm2 = kme2.b;
            if (klm2.b == 0L && kme2.a.b(klm2, 8192L) == -1L) {
                return -1;
            }
            return ((kme)this.a).b.e(byArray, n2, n3);
        }
        throw new IOException("closed");
    }

    public final String toString() {
        if (this.b != 0) {
            Object object = this.a;
            Objects.toString(object);
            return object.toString().concat(".inputStream()");
        }
        Object object = this.a;
        Objects.toString(object);
        return object.toString().concat(".inputStream()");
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        if (this.b != 0) {
            return DesugarInputStream.transferTo(this, outputStream);
        }
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

