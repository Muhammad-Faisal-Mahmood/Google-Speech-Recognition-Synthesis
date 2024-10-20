/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

abstract class jka
implements Runnable {
    final jkb b;

    public jka(jkb jkb2) {
        this.b = jkb2;
    }

    public abstract void a();

    @Override
    public final void run() {
        try {
            if (this.b.f != null) {
                this.a();
                return;
            }
            IOException iOException = new IOException("Unable to perform write due to unavailable sink.");
            throw iOException;
        }
        catch (Exception exception) {
            this.b.c.a(exception);
            return;
        }
    }
}

