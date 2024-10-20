/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public interface jhg
extends Closeable {
    public void b();

    public void c();

    @Override
    public void close();

    public boolean d();

    public int e();

    public int f();

    public jhg g(int var1);

    public void i(ByteBuffer var1);

    public void j(OutputStream var1, int var2);

    public void k(byte[] var1, int var2, int var3);

    public void l(int var1);
}

