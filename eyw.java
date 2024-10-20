/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaFormat
 */
import android.media.MediaCodec;
import android.media.MediaFormat;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class eyw
extends InputStream
implements InputStreamRetargetInterface {
    private static final hei a = hei.m("com/google/android/libraries/speech/encoding/AudioEncoderInputStream");
    private final InputStream b;
    private final int c;
    private final int d;
    private final int e;
    private final String f;
    private final int g;
    private final ByteBuffer h;
    private final ByteBuffer i;
    private MediaCodec j;
    private ByteBuffer[] k;
    private ByteBuffer[] l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public eyw(InputStream var1_1, String var2_6, int var3_9, int var4_10, int var5_11) {
        block19: {
            block20: {
                block21: {
                    super();
                    var6_12 = -1;
                    this.m = -1;
                    this.p = false;
                    this.c = 2048;
                    this.b = var1_1;
                    this.d = var3_9;
                    this.e = var5_11;
                    this.f = var2_6;
                    if (var2_6 == null) throw new IllegalArgumentException("Null mimetype provided");
                    switch (var2_6.hashCode()) {
                        default: {
                            break;
                        }
                        case 1504891608: {
                            if (!var2_6.equals("audio/opus")) break;
                            var6_12 = 3;
                            break;
                        }
                        case 1504619009: {
                            if (!var2_6.equals("audio/flac")) break;
                            var6_12 = 2;
                            break;
                        }
                        case -53558318: {
                            if (!var2_6.equals("audio/mp4a-latm")) break;
                            var6_12 = 0;
                            break;
                        }
                        case -1606874997: {
                            if (!var2_6.equals("audio/amr-wb")) break;
                            var6_12 = 1;
                        }
                    }
                    if (var6_12 == 0) break block20;
                    if (var6_12 == 1) break block21;
                    if (var6_12 != 2) {
                        if (var6_12 != 3) throw new IllegalArgumentException("Unsupported audio codec");
                        this.g = 3;
                        this.i = ByteBuffer.allocate(21).order(ByteOrder.LITTLE_ENDIAN);
                        break block19;
                    } else {
                        this.g = 2;
                        var8_13 = ByteBuffer.wrap(new byte[42]);
                        this.i = var8_13;
                        var7_14 = var8_13.remaining() >= 42;
                        fxf.A(var7_14);
                        var1_1 = new htf();
                        var1_1.b(1716281667L, 32);
                        var1_1.b(1L, 1);
                        var1_1.b(0L, 7);
                        var1_1.b(34L, 24);
                        var1_1.b(16L, 16);
                        var1_1.b(65535L, 16);
                        var1_1.b(0L, 24);
                        var1_1.b(0L, 24);
                        var1_1.b(var3_9, 20);
                        var1_1.b(var5_11 - 1, 3);
                        var1_1.b(15L, 5);
                        var1_1.b(0L, 36);
                        var1_1.b(0L, 64);
                        var1_1.b(0L, 64);
                        var7_14 = var1_1.b == 0;
                        fxf.B(var7_14, "Cannot convert to byte array if not byte aligned.");
                        ((ByteArrayOutputStream)var1_1.a).flush();
                        var8_13.put(((ByteArrayOutputStream)var1_1.a).toByteArray());
                        var8_13.flip();
                    }
                    break block19;
                    catch (IOException var1_2) {
                        throw new RuntimeException(var1_2);
                    }
                }
                var7_14 = var3_9 == 16000;
                fxf.A(var7_14);
                var7_14 = var5_11 == 1;
                fxf.A(var7_14);
                this.g = 1;
                this.i = ByteBuffer.wrap("#!AMR-WB\n".getBytes());
                break block19;
            }
            this.g = 0;
            this.i = ByteBuffer.wrap(new byte[7]);
        }
        this.h = var1_1 = ByteBuffer.wrap(new byte[2048]);
        var1_1.position(2048);
        var1_1 = new MediaFormat();
        var1_1.setString("mime", var2_6);
        var1_1.setInteger("sample-rate", var3_9);
        var1_1.setInteger("bitrate", var4_10);
        var1_1.setInteger("channel-count", var5_11);
        if (this.g == 2) {
            var1_1.setInteger("flac-compression-level", 5);
        }
        var7_14 = eyw.e(this.g);
        if (!var7_14) ** GOTO lbl103
        try {
            try {
                this.c(MediaCodec.createByCodecName((String)"OMX.google.aac.encoder"), (MediaFormat)var1_1);
                return;
            }
            catch (IOException var2_7) {
                var8_13 = new ezc(var2_7);
                throw var8_13;
            }
        }
        catch (Exception var2_8) {
            try {
                this.d(this.f, (MediaFormat)var1_1);
                return;
lbl103:
                // 1 sources

                this.d(var2_6, (MediaFormat)var1_1);
                return;
            }
            catch (IllegalArgumentException var1_3) {
                throw new RuntimeException("Failed to create codec mimeType: ".concat(String.valueOf(this.f)), (Throwable)var1_5);
            }
            catch (IOException var1_4) {
                // empty catch block
            }
        }
        throw new RuntimeException("Failed to create codec mimeType: ".concat(String.valueOf(this.f)), (Throwable)var1_5);
    }

    private final void a(boolean bl2) {
        Object object = this.j;
        if (object != null) {
            int n2;
            if (bl2) {
                this.b((MediaCodec)object);
            }
            Object object2 = new MediaCodec.BufferInfo();
            int n3 = n2 = this.j.dequeueOutputBuffer((MediaCodec.BufferInfo)object2, 10000L);
            if (n2 == -2) {
                object = this.j.getOutputFormat();
                bl2 = this.d == object.getInteger("sample-rate");
                fxf.A(bl2);
                bl2 = this.e == object.getInteger("channel-count");
                fxf.A(bl2);
                fxf.A(this.f.equals(object.getString("mime")));
                n3 = this.j.dequeueOutputBuffer((MediaCodec.BufferInfo)object2, 10000L);
            }
            bl2 = n3 != -2;
            fxf.A(bl2);
            n2 = ((MediaCodec.BufferInfo)object2).flags;
            int n4 = 4;
            if ((n2 & 4) != 0) {
                ((heg)((heg)a.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "fillOutputBuffer", 260, "AudioEncoderInputStream.java")).s("End of Output Stream : %d", ((MediaCodec.BufferInfo)object2).size);
                this.o = true;
            }
            if (n3 != -1) {
                if (n3 == -3) {
                    this.l = this.j.getOutputBuffers();
                    return;
                }
                if (n3 != -1) {
                    if ((((MediaCodec.BufferInfo)object2).flags & 2) != 0) {
                        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "fillOutputBuffer", 289, "AudioEncoderInputStream.java")).r("Ignoring codec config packet");
                        this.m = n3;
                        object = this.j;
                        if (object != null) {
                            this.b((MediaCodec)object);
                            return;
                        }
                    } else {
                        int n5 = ((MediaCodec.BufferInfo)object2).offset;
                        int n6 = ((MediaCodec.BufferInfo)object2).size;
                        object = a;
                        ((heg)((heg)((hdz)object).c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "onOutputBufferReady", 335, "AudioEncoderInputStream.java")).r("#onOutputBufferReady");
                        this.m = n3;
                        n2 = this.g;
                        if (eyw.e(n2)) {
                            this.i.clear();
                            n2 = this.d;
                            int n7 = this.e;
                            object = this.i;
                            bl2 = ((Buffer)object).remaining() >= 7;
                            fxf.A(bl2);
                            switch (n2) {
                                default: {
                                    throw new IllegalArgumentException(a.af(n2, "Invalid sample rate: "));
                                }
                                case 96000: {
                                    n2 = 0;
                                    break;
                                }
                                case 88200: {
                                    n2 = 1;
                                    break;
                                }
                                case 64000: {
                                    n2 = 2;
                                    break;
                                }
                                case 48000: {
                                    n2 = 3;
                                    break;
                                }
                                case 44100: {
                                    n2 = 4;
                                    break;
                                }
                                case 32000: {
                                    n2 = 5;
                                    break;
                                }
                                case 24000: {
                                    n2 = 6;
                                    break;
                                }
                                case 22050: {
                                    n2 = 7;
                                    break;
                                }
                                case 16000: {
                                    n2 = 8;
                                    break;
                                }
                                case 12000: {
                                    n2 = 9;
                                    break;
                                }
                                case 11025: {
                                    n2 = 10;
                                    break;
                                }
                                case 8000: {
                                    n2 = 11;
                                    break;
                                }
                                case 7350: {
                                    n2 = 12;
                                }
                            }
                            long l2 = crh.D(crh.D(crh.D(crh.D(crh.D(crh.D(crh.D(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0), 4, n2), 1, 0);
                            n2 = n4;
                            switch (n7) {
                                default: {
                                    throw new IllegalArgumentException(a.af(n7, "Invalid channel count: "));
                                }
                                case 8: {
                                    n2 = 7;
                                    break;
                                }
                                case 6: {
                                    n2 = 6;
                                    break;
                                }
                                case 5: {
                                    n2 = 5;
                                    break;
                                }
                                case 3: {
                                    n2 = 3;
                                    break;
                                }
                                case 2: {
                                    n2 = 2;
                                    break;
                                }
                                case 1: {
                                    n2 = 1;
                                }
                                case 4: 
                            }
                            l2 = crh.D(crh.D(crh.D(crh.D(crh.D(crh.D(crh.D(crh.D(l2, 3, n2), 1, 0), 1, 0), 1, 0), 1, 0), 13, n6 + 7), 11, 2047), 2, 0);
                            ((ByteBuffer)object).put((byte)(l2 >>> 48 & 0xFFL));
                            ((ByteBuffer)object).put((byte)(l2 >>> 40 & 0xFFL));
                            ((ByteBuffer)object).put((byte)(l2 >>> 32 & 0xFFL));
                            ((ByteBuffer)object).put((byte)(l2 >>> 24 & 0xFFL));
                            ((ByteBuffer)object).put((byte)(l2 >>> 16 & 0xFFL));
                            ((ByteBuffer)object).put((byte)(l2 >>> 8 & 0xFFL));
                            ((ByteBuffer)object).put((byte)l2);
                            this.i.flip();
                        } else if (n2 == 3) {
                            this.i.clear();
                            if (!this.p) {
                                this.p = true;
                                n2 = this.d;
                                n4 = this.e;
                                object2 = this.i;
                                ((ByteBuffer)object2).put("OpusHead".getBytes());
                                ((ByteBuffer)object2).put((byte)1);
                                ((ByteBuffer)object2).put((byte)(n4 & 0xFF));
                                ((ByteBuffer)object2).putShort((short)80);
                                ((ByteBuffer)object2).putInt((int)((long)n2 & 0xFFFFFFFFL));
                                ((ByteBuffer)object2).putShort((short)0);
                                ((ByteBuffer)object2).put((byte)0);
                            }
                            ((heg)((heg)((hdz)object).c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "onOutputBufferReady", 349, "AudioEncoderInputStream.java")).s("#onOutputBufferReady Opus frame of size %d", n6);
                            object = this.i;
                            if (n6 > 223) {
                                ((ByteBuffer)object).put((byte)((n6 & 0x1F) + 223));
                                ((ByteBuffer)object).put((byte)((n6 >> 5) - 7));
                            } else {
                                ((ByteBuffer)object).put((byte)n6);
                            }
                            this.i.flip();
                        }
                        object = this.l[n3];
                        ((ByteBuffer)object).clear();
                        ((ByteBuffer)object).position(n5);
                        ((ByteBuffer)object).limit(n5 + n6);
                    }
                }
            }
            return;
        }
        throw new ezc();
    }

    private final void b(MediaCodec mediaCodec) {
        int n2 = this.m;
        if (n2 >= 0) {
            mediaCodec.releaseOutputBuffer(n2, false);
            this.m = -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c(MediaCodec mediaCodec, MediaFormat object) {
        synchronized (this) {
            hei hei2 = a;
            ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "startAndConfigureCodec", 179, "AudioEncoderInputStream.java")).r("#startAndConfigureCodec started");
            try {
                this.j = mediaCodec;
                mediaCodec.configure(object, null, null, 1);
                this.j.start();
                this.k = this.j.getInputBuffers();
                this.l = this.j.getOutputBuffers();
                ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "startAndConfigureCodec", 186, "AudioEncoderInputStream.java")).r("#startAndConfigureCodec ended");
                return;
            }
            catch (Exception exception) {
                object = new IllegalArgumentException("Could not create codec", exception);
                throw object;
            }
        }
    }

    private final void d(String string, MediaFormat mediaFormat) {
        try {
            this.c(MediaCodec.createEncoderByType((String)string), mediaFormat);
            return;
        }
        catch (IOException iOException) {
            throw new ezc(iOException);
        }
    }

    private static boolean e(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        synchronized (this) {
            hjh.a(this.b);
            MediaCodec mediaCodec = this.j;
            if (mediaCodec == null) {
                ((heg)((heg)a.h()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", 196, "AudioEncoderInputStream.java")).r("close() called when codec is already closed");
                return;
            }
            try {
                mediaCodec.stop();
                this.j.release();
            }
            catch (IllegalStateException illegalStateException) {
                a.as(a.h(), "MediaCodec has already been stopped or released.", "com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", '\u00cb', "AudioEncoderInputStream.java", illegalStateException);
            }
            this.j = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void finalize() {
        synchronized (this) {
            if (this.j != null) {
                this.close();
                ((heg)((heg)a.g()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "finalize", 433, "AudioEncoderInputStream.java")).r("No one closed");
                return;
            }
            return;
        }
    }

    @Override
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final int read(byte[] object, int n2, int n3) {
        boolean bl2 = this.n;
        int n4 = 0;
        int n5 = bl2 && !this.h.hasRemaining() ? 1 : 0;
        while (true) {
            block13: {
                Object object2;
                MediaCodec mediaCodec;
                int n6;
                block14: {
                    block12: {
                        if (n5 != 0 || this.n || (n6 = this.m) != -1 && this.l[n6].hasRemaining()) break block12;
                        mediaCodec = this.j;
                        if (mediaCodec == null) throw new ezc();
                        this.b(mediaCodec);
                        // MONITORENTER : this
                        n6 = mediaCodec.dequeueInputBuffer(10000L);
                        if (n6 == -1) break block13;
                        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "onInputBufferReady", 301, "AudioEncoderInputStream.java")).s("#onInputBufferReady %d", n6);
                        object2 = this.k[n6];
                        ((ByteBuffer)object2).clear();
                        ((ByteBuffer)object2).position(0);
                        fxf.A(((Buffer)object2).hasRemaining());
                        break block14;
                    }
                    if (this.n && ((n5 = this.m) == -1 || !this.l[n5].hasRemaining())) {
                        if (this.o) {
                            ((heg)((heg)a.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "read", 393, "AudioEncoderInputStream.java")).r("Returning -1");
                            return -1;
                        }
                        object2 = a;
                        ((heg)((heg)((hdz)object2).c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "read", 397, "AudioEncoderInputStream.java")).r("Calling fillOutputBuffer explicitly");
                        this.a(true);
                        n5 = this.m;
                        if (n5 == -1 || !this.l[n5].hasRemaining()) {
                            ((heg)((heg)((hdz)object2).c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "read", 404, "AudioEncoderInputStream.java")).r("Returning 0");
                            return 0;
                        }
                    }
                    n6 = n2;
                    n5 = n3;
                    if (this.i.hasRemaining()) {
                        n4 = Math.min(n3, this.i.remaining());
                        this.i.get((byte[])object, n2, n4);
                        n6 = n2 + n4;
                        n5 = n3 - n4;
                    }
                    object2 = this.l[this.m];
                    fxf.A(((Buffer)object2).hasRemaining());
                    n2 = Math.min(n5, ((Buffer)object2).remaining());
                    ((ByteBuffer)object2).get((byte[])object, n6, n2);
                    object = (heg)((heg)a.c()).j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "read", 424, "AudioEncoderInputStream.java");
                    object.s("Returning %d", n2 += n4);
                    return n2;
                }
                while (((Buffer)object2).position() < this.c && ((Buffer)object2).hasRemaining() && !this.n) {
                    int n7;
                    if (this.h.hasRemaining()) {
                        n7 = hhk.af(this.h.remaining(), ((Buffer)object2).remaining(), this.c - ((Buffer)object2).position());
                        ((ByteBuffer)object2).put(this.h.array(), this.h.position(), n7);
                        ByteBuffer byteBuffer = this.h;
                        byteBuffer.position(byteBuffer.position() + n7);
                        continue;
                    }
                    n7 = this.b.read(this.h.array());
                    if (n7 == -1) break;
                    this.h.position(0);
                    this.h.limit(n7);
                }
                if (((Buffer)object2).position() > 0) {
                    mediaCodec.queueInputBuffer(n6, 0, ((Buffer)object2).position(), 0L, 0);
                } else {
                    this.n = true;
                    mediaCodec.queueInputBuffer(n6, 0, 0, 0L, 4);
                }
            }
            // MONITOREXIT : this
            this.a(false);
        }
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

