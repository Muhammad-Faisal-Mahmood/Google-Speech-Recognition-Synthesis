/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class hij
extends hil {
    public final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override
    public final void a(char c2) {
        this.a.putChar(c2);
        this.b(2);
    }

    public final void b(int n2) {
        try {
            this.c(this.a.array(), n2);
            return;
        }
        finally {
            ((Buffer)this.a).clear();
        }
    }

    protected void c(byte[] byArray, int n2) {
        throw null;
    }

    @Override
    public final void d(byte[] byArray, int n2) {
        fxf.z(0, n2, byArray.length);
        this.c(byArray, n2);
    }
}

