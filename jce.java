/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class jce
extends jcw {
    final jjq a;
    final jch b;

    public jce(jch jch2, jjq jjq2) {
        this.a = jjq2;
        this.b = jch2;
        super(jch2.b.e);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        int n2 = jnr.a;
        if (this.b.a == null) {
            InputStream inputStream;
            while (true) {
                inputStream = this.a.g();
                if (inputStream == null) return;
                jch jch2 = this.b;
                jch2.c.X(jch2.b.b.e.b(inputStream));
                break;
            }
            catch (Throwable throwable) {
                try {
                    jeb.h(inputStream);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    jeb.g(this.a);
                    this.b.b(iyh.c.d(throwable2).e("Failed to read message."));
                    return;
                }
            }
            {
                inputStream.close();
                continue;
            }
        }
        jeb.g(this.a);
    }
}

