/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

final class klb
extends OutputStream {
    final long a;
    final kln b;
    final klc c;
    private long d;

    public klb(klc klc2, long l2, kln kln2) {
        this.a = l2;
        this.b = kln2;
        this.c = klc2;
    }

    @Override
    public final void close() {
        this.c.f = true;
        long l2 = this.a;
        if (l2 != -1L && this.d < l2) {
            long l3 = this.d;
            StringBuilder stringBuilder = new StringBuilder("expected ");
            stringBuilder.append(l2);
            stringBuilder.append(" bytes but received ");
            stringBuilder.append(l3);
            throw new ProtocolException(stringBuilder.toString());
        }
        this.b.close();
    }

    @Override
    public final void flush() {
        if (this.c.f) {
            return;
        }
        this.b.flush();
    }

    @Override
    public final void write(int n2) {
        this.write(new byte[]{(byte)n2}, 0, 1);
    }

    @Override
    public final void write(byte[] object, int n2, int n3) {
        if (!this.c.f) {
            long l2 = n3;
            long l3 = this.a;
            if (l3 != -1L && this.d + l2 > l3) {
                l2 = this.d;
                object = new StringBuilder("expected ");
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append(" bytes but received ");
                ((StringBuilder)object).append(l2);
                ((StringBuilder)object).append(n3);
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            this.d += l2;
            try {
                this.b.D((byte[])object, n2, n3);
                return;
            }
            catch (InterruptedIOException interruptedIOException) {
                throw new SocketTimeoutException(interruptedIOException.getMessage());
            }
        }
        throw new IOException("closed");
    }
}

