/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class jgn {
    public int a = -1;
    public jjw b;
    public iuf c = iud.a;
    public final jgl d = new jgl(this);
    public final ByteBuffer e = ByteBuffer.allocate(5);
    public final jjx f;
    public final jjo g;
    public boolean h;
    public int i;
    public int j = -1;
    public long k;
    private final jgm l;

    public jgn(jgm jgm2, jjx jjx2, jjo jjo2) {
        this.l = jgm2;
        this.f = jjx2;
        this.g = jjo2;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        int n2;
        block5: {
            inputStream = (jmh)inputStream;
            Object object = ((jmh)inputStream).a;
            if (object != null) {
                n2 = object.k();
                ((jmh)inputStream).a.f(outputStream);
                ((jmh)inputStream).a = null;
            } else {
                ByteArrayInputStream byteArrayInputStream = ((jmh)inputStream).c;
                if (byteArrayInputStream != null) {
                    a.s(outputStream, "outputStream cannot be null!");
                    object = new byte[8192];
                    long l2 = 0L;
                    while (true) {
                        if ((n2 = byteArrayInputStream.read((byte[])object)) == -1) {
                            n2 = (int)l2;
                            ((jmh)inputStream).c = null;
                            break block5;
                        }
                        outputStream.write((byte[])object, 0, n2);
                        l2 += (long)n2;
                    }
                }
                n2 = 0;
            }
        }
        return n2;
    }

    public final void b() {
        if (!this.h) {
            this.h = true;
            jjw jjw2 = this.b;
            if (jjw2 != null && jjw2.a() == 0 && this.b != null) {
                this.b = null;
            }
            this.c(true, true);
        }
    }

    public final void c(boolean bl2, boolean bl3) {
        jjw jjw2 = this.b;
        this.b = null;
        int n2 = this.i;
        this.l.u(jjw2, bl2, bl3, n2);
        this.i = 0;
    }

    public final void d(jgk object, boolean bl2) {
        Object object2 = ((jgk)object).a.iterator();
        int n2 = 0;
        while (object2.hasNext()) {
            n2 += ((jjw)object2.next()).a();
        }
        int n3 = this.a;
        if (n3 >= 0 && n2 > n3) {
            throw new iyj(iyh.g.e(String.format(Locale.US, "message too large %d > %d", n2, this.a)));
        }
        this.e.clear();
        this.e.put((byte)(bl2 ? 1 : 0)).putInt(n2);
        Object object3 = this.f;
        object2 = this.e;
        object3 = object3.a(5);
        object3.d(((ByteBuffer)object2).array(), 0, ((Buffer)object2).position());
        if (n2 == 0) {
            this.b = object3;
            return;
        }
        this.l.u((jjw)object3, false, false, this.i - 1);
        this.i = 1;
        object = ((jgk)object).a;
        for (n3 = 0; n3 < object.size() - 1; ++n3) {
            this.l.u((jjw)object.get(n3), false, false, 0);
        }
        this.b = (jjw)object.get(object.size() - 1);
        this.k = n2;
    }

    public final void e(byte[] byArray, int n2, int n3) {
        while (n3 > 0) {
            jjw jjw2 = this.b;
            if (jjw2 != null && jjw2.b() == 0) {
                this.c(false, false);
            }
            if (this.b == null) {
                this.b = this.f.a(n3);
            }
            int n4 = Math.min(n3, this.b.b());
            this.b.d(byArray, n2, n4);
            n2 += n4;
            n3 -= n4;
        }
    }
}

