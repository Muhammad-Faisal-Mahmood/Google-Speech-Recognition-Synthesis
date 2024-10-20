/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class akz {
    public static final byte[] a = new byte[]{79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] b = new byte[]{79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer c = afh.a;
    public int d = 2;
    public int e = 0;

    public static final void b(ByteBuffer byteBuffer, long l2, int n2, int n3, boolean bl2) {
        byteBuffer.put((byte)79);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)83);
        byteBuffer.put((byte)0);
        byte by2 = true != bl2 ? (byte)0 : 2;
        byteBuffer.put(by2);
        byteBuffer.putLong(l2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n2);
        byteBuffer.putInt(0);
        byteBuffer.put(hhk.ac(n3));
    }

    public final void a() {
        this.c = afh.a;
        this.e = 0;
        this.d = 2;
    }
}

