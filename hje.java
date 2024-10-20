/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

final class hje
extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int n2) {
    }

    @Override
    public final void write(byte[] byArray) {
        fxf.K(byArray);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        fxf.K(byArray);
        fxf.z(n2, n3 + n2, byArray.length);
    }
}

