/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class hie
implements Closeable {
    public static final ThreadLocal a = new hid();
    public int b = 0;

    @Override
    public final void close() {
        int n2 = this.b;
        if (n2 > 0) {
            this.b = n2 - 1;
            return;
        }
        throw new AssertionError((Object)"Mismatched calls to RecursionDepth (possible error in core library)");
    }
}

