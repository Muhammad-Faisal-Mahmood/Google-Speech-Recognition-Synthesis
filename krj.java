/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Locale;

public final class krj
implements krt {
    public final krk a;
    public final boolean b;
    private final int c;

    public /* synthetic */ krj(krk krk2, boolean bl2, int n2) {
        this.c = n2;
        this.a = krk2;
        this.b = bl2;
    }

    @Override
    public final void a() {
        ByteBuffer byteBuffer;
        krk krk2;
        block13: {
            long l2;
            long l3;
            block14: {
                if (this.c != 0) {
                    long l4;
                    krk krk3 = this.a;
                    krk3.e = l4 = krk3.c.a();
                    long l5 = l4 - 0L;
                    long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                    if (l6 == false) {
                        krk3.i();
                        return;
                    }
                    krk3.d = l6 > 0 && l4 < 8192L ? ByteBuffer.allocateDirect((int)l4 + 1) : ByteBuffer.allocateDirect(8192);
                    l4 = krk3.e;
                    if (l4 > 0L) {
                        krk3.h.setFixedLengthStreamingMode(l4);
                    } else {
                        krk3.h.setChunkedStreamingMode(8192);
                    }
                    if (this.b) {
                        krk3.f();
                        return;
                    }
                    krk3.a.set(1);
                    krk3.c.c(krk3);
                    return;
                }
                krk2 = this.a;
                byteBuffer = (ByteBuffer)krk2.d.flip();
                l3 = krk2.e;
                if (l3 != -1L && l3 - krk2.f < (long)krk2.d.remaining()) {
                    krk2.j(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", krk2.f + (long)krk2.d.remaining(), krk2.e)));
                    return;
                }
                boolean bl2 = this.b;
                if (krk2.d.remaining() == 0 && !bl2) {
                    krk2.j(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                    return;
                }
                l3 = krk2.f;
                byteBuffer = krk2.d;
                int n2 = 0;
                while (byteBuffer.hasRemaining()) {
                    n2 += krk2.i.write(byteBuffer);
                }
                krk2.j.flush();
                krk2.f = l2 = l3 + (long)n2;
                long l7 = krk2.e;
                if (l2 < l7) break block13;
                l3 = l7;
                if (l7 != -1L) break block14;
                if (!bl2) break block13;
                l3 = -1L;
            }
            if (l3 == -1L) {
                krk2.i();
                return;
            }
            if (l3 == l2) {
                krk2.i();
                return;
            }
            krk2.j(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", krk2.f, krk2.e)));
            return;
        }
        byteBuffer = (ByteBuffer)krk2.d.clear();
        krk2.a.set(0);
        krk2.e();
    }
}

