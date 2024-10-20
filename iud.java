/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public final class iud
implements iue {
    public static final iue a = new iud(0);
    private final int b;

    public iud(int n2) {
        this.b = n2;
    }

    @Override
    public final InputStream a(InputStream inputStream) {
        if (this.b != 0) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @Override
    public final String b() {
        if (this.b != 0) {
            return "gzip";
        }
        return "identity";
    }
}

