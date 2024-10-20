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
import java.io.InputStream;
import java.io.OutputStream;

public final class eyv
extends InputStream
implements InputStreamRetargetInterface {
    private final MediaCodec.BufferInfo a;
    private InputStream b;
    private MediaCodec c;
    private boolean d;
    private boolean e;
    private final byte[] f;
    private int g;
    private int h;
    private final byte[] i;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public eyv(InputStream inputStream) {
        Throwable throwable2222222;
        block5: {
            MediaCodec mediaCodec;
            this.f = new byte[320];
            this.g = 0;
            this.h = 0;
            this.i = new byte[1];
            this.b = inputStream;
            inputStream = new MediaFormat();
            inputStream.setString("mime", "audio/3gpp");
            inputStream.setInteger("sample-rate", 8000);
            inputStream.setInteger("channel-count", 1);
            inputStream.setInteger("bitrate", 12200);
            this.c = mediaCodec = MediaCodec.createEncoderByType((String)"audio/3gpp");
            mediaCodec.configure((MediaFormat)inputStream, null, null, 1);
            this.c.start();
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (Exception exception) {}
                {
                    MediaCodec mediaCodec2 = this.c;
                    if (mediaCodec2 != null) {
                        mediaCodec2.release();
                    }
                    this.c = null;
                    throw exception;
                }
            }
            this.a = new MediaCodec.BufferInfo();
            return;
        }
        this.a = new MediaCodec.BufferInfo();
        throw throwable2222222;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Throwable throwable222222;
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.b = null;
        inputStream = this.c;
        if (inputStream != null) {
            inputStream.release();
        }
        this.c = null;
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            this.b = null;
            MediaCodec mediaCodec = this.c;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            this.c = null;
            throw throwable3;
        }
        this.c = null;
        throw throwable222222;
    }

    protected final void finalize() {
        MediaCodec mediaCodec = this.c;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    @Override
    public final int read() {
        if (this.read(this.i, 0, 1) == 1) {
            return this.i[0] & 0xFF;
        }
        return -1;
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.c != null) {
            int n4;
            int n5;
            if (this.h >= this.g && !this.d) {
                int n6;
                this.h = 0;
                this.g = 0;
                while (!this.e && (n6 = this.c.dequeueInputBuffer(0L)) >= 0) {
                    for (n4 = 0; n4 < 320; n4 += n5) {
                        n5 = this.b.read(this.f, n4, 320 - n4);
                        if (n5 != -1) continue;
                        this.e = true;
                        break;
                    }
                    this.c.getInputBuffer(n6).put(this.f, 0, n4);
                    MediaCodec mediaCodec = this.c;
                    n5 = true != this.e ? 0 : 4;
                    mediaCodec.queueInputBuffer(n6, 0, n4, 0L, n5);
                }
                n4 = this.c.dequeueOutputBuffer(this.a, 0L);
                if (n4 >= 0) {
                    this.g = this.a.size;
                    this.c.getOutputBuffer(n4).get(this.f, 0, this.g);
                    this.c.releaseOutputBuffer(n4, false);
                    if ((this.a.flags & 4) != 0) {
                        this.d = true;
                    }
                }
            }
            if ((n5 = this.h) < (n4 = this.g)) {
                if (n3 > (n4 -= n5)) {
                    n3 = n4;
                }
                System.arraycopy(this.f, n5, byArray, n2, n3);
                this.h += n3;
                return n3;
            }
            if (this.e && this.d) {
                return -1;
            }
            return 0;
        }
        throw new IllegalStateException("not open");
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

