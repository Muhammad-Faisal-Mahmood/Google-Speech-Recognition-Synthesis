/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class jgh
implements jjq {
    private InputStream a;

    public jgh(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}

