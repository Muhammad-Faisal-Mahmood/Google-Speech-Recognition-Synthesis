/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.zip.Inflater;

public final class fqa
implements Closeable {
    public final Object a;
    private final int b;

    public fqa(int n2) {
        this.b = n2;
        this.a = new Inflater(true);
    }

    public fqa(Closeable closeable, int n2) {
        this.b = n2;
        this.a = closeable;
    }

    @Override
    public final void close() {
        if (this.b != 0) {
            ((Inflater)this.a).end();
            return;
        }
        Object object = this.a;
        if (object != null) {
            object.close();
        }
    }
}

