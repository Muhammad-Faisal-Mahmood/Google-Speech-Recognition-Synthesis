/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

final class jgl
extends OutputStream {
    final jgn a;

    public jgl(jgn jgn2) {
        this.a = jgn2;
    }

    @Override
    public final void write(int n2) {
        this.write(new byte[]{(byte)n2}, 0, 1);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        this.a.e(byArray, n2, n3);
    }
}

