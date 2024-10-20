/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class jmb
implements Closeable {
    public final klo a;
    public final jlw b;
    private final jlz c;

    public jmb(klo kmk2) {
        this.a = kmk2;
        kmk2 = new jlz((klo)kmk2);
        this.c = kmk2;
        this.b = new jlw(kmk2);
    }

    public final List a(int n2, short s2, byte by2, int n3) {
        Object object;
        Serializable serializable;
        block9: {
            serializable = this.c;
            ((jlz)((Object)serializable)).d = n2;
            ((jlz)((Object)serializable)).a = n2;
            ((jlz)((Object)serializable)).e = s2;
            ((jlz)((Object)serializable)).b = by2;
            ((jlz)((Object)serializable)).c = n3;
            while (true) {
                klp klp2;
                serializable = this.b;
                if (((jlw)((Object)serializable)).b.y()) break block9;
                n2 = ((jlw)((Object)serializable)).b.d();
                n3 = n2 & 0xFF;
                if (n3 == 128) break;
                if ((n2 & 0x80) == 128) {
                    n2 = ((jlw)((Object)serializable)).b(n3, 127);
                    if (jlw.g(n3 = n2 - 1)) {
                        object = jly.b[n3];
                        ((jlw)((Object)serializable)).a.add(object);
                        continue;
                    }
                    n3 = jly.b.length;
                    n3 = ((jlw)((Object)serializable)).a(n2 - 62);
                    if (n3 >= 0 && n3 <= ((jlv[])(object = ((jlw)((Object)serializable)).e)).length - 1) {
                        ((jlw)((Object)serializable)).a.add(object[n3]);
                        continue;
                    }
                    serializable = new StringBuilder("Header index too large ");
                    ((StringBuilder)serializable).append(n2);
                    throw new IOException(((StringBuilder)serializable).toString());
                }
                if (n3 == 64) {
                    object = ((jlw)((Object)serializable)).d();
                    jly.a((klp)object);
                    ((jlw)((Object)serializable)).f(new jlv((klp)object, ((jlw)((Object)serializable)).d()));
                    continue;
                }
                if ((n2 & 0x40) == 64) {
                    ((jlw)((Object)serializable)).f(new jlv(((jlw)((Object)serializable)).c(((jlw)((Object)serializable)).b(n3, 63) - 1), ((jlw)((Object)serializable)).d()));
                    continue;
                }
                if ((n2 & 0x20) == 32) {
                    ((jlw)((Object)serializable)).d = n2 = ((jlw)((Object)serializable)).b(n3, 31);
                    if (n2 >= 0 && n2 <= ((jlw)((Object)serializable)).c) {
                        ((jlw)((Object)serializable)).e();
                        continue;
                    }
                    throw new IOException(a.af(n2, "Invalid dynamic table size update "));
                }
                if (n3 != 16 && n3 != 0) {
                    klp2 = ((jlw)((Object)serializable)).c(((jlw)((Object)serializable)).b(n3, 15) - 1);
                    object = ((jlw)((Object)serializable)).d();
                    ((jlw)((Object)serializable)).a.add(new jlv(klp2, (klp)object));
                    continue;
                }
                object = ((jlw)((Object)serializable)).d();
                jly.a((klp)object);
                klp2 = ((jlw)((Object)serializable)).d();
                ((jlw)((Object)serializable)).a.add(new jlv((klp)object, klp2));
            }
            throw new IOException("index == 0");
        }
        object = this.b;
        serializable = new ArrayList(object.a);
        object.a.clear();
        return serializable;
    }

    public final void b() {
        this.a.f();
        this.a.d();
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

