/*
 * Decompiled with CFR 0.152.
 */
import java.io.Writer;

final class cr
extends Writer {
    private final StringBuilder a = new StringBuilder(128);

    private final void a() {
        if (this.a.length() > 0) {
            this.a.toString();
            StringBuilder stringBuilder = this.a;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    @Override
    public final void close() {
        this.a();
    }

    @Override
    public final void flush() {
        this.a();
    }

    @Override
    public final void write(char[] cArray, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = cArray[n2 + i2];
            if (c2 == '\n') {
                this.a();
                continue;
            }
            this.a.append(c2);
        }
    }
}

