/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 */
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;

public interface alu {
    public int a();

    public int b(MediaCodec.BufferInfo var1);

    public MediaFormat c();

    public ByteBuffer e(int var1);

    public ByteBuffer f(int var1);

    public void g();

    public void h();

    public void i(Bundle var1);

    public void j(int var1, int var2, long var3, int var5);

    public void k(int var1, ahu var2, long var3);

    public void l(int var1);

    public void m();
}

