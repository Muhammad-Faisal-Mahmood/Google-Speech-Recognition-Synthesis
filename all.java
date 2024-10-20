/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 */
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.nio.ByteBuffer;

final class all
implements alu {
    public final MediaCodec a;
    public final alp b;
    public final alv c;
    public int d;
    public final awf e;
    private boolean f;

    public all(MediaCodec mediaCodec, HandlerThread handlerThread, alv alv2, awf awf2) {
        this.a = mediaCodec;
        this.b = new alp(handlerThread);
        this.c = alv2;
        this.e = awf2;
        this.d = 0;
    }

    public static String d(int n2, String charSequence) {
        charSequence = new StringBuilder((String)charSequence);
        if (n2 == 1) {
            ((StringBuilder)charSequence).append("Audio");
        } else if (n2 == 2) {
            ((StringBuilder)charSequence).append("Video");
        } else {
            ((StringBuilder)charSequence).append("Unknown(");
            ((StringBuilder)charSequence).append(n2);
            ((StringBuilder)charSequence).append(")");
        }
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int a() {
        this.c.b();
        alp alp2 = this.b;
        Object object = alp2.a;
        synchronized (object) {
            alp2.b();
            boolean bl2 = alp2.c();
            int n2 = -1;
            if (bl2) {
                return n2;
            }
            if (!alp2.j.n()) return alp2.j.k();
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        this.c.b();
        alp alp2 = this.b;
        Object object = alp2.a;
        synchronized (object) {
            alp2.b();
            boolean bl2 = alp2.c();
            int n2 = -1;
            if (bl2) {
                return n2;
            }
            if (alp2.k.n()) {
                return n2;
            }
            n2 = alp2.k.k();
            if (n2 < 0) {
                if (n2 != -2) return n2;
                alp2.f = (MediaFormat)alp2.e.remove();
                return -2;
            }
            abr.j(alp2.f);
            alp2 = (MediaCodec.BufferInfo)alp2.d.remove();
            bufferInfo.set(((MediaCodec.BufferInfo)alp2).offset, ((MediaCodec.BufferInfo)alp2).size, ((MediaCodec.BufferInfo)alp2).presentationTimeUs, ((MediaCodec.BufferInfo)alp2).flags);
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final MediaFormat c() {
        Object object = this.b;
        Object object2 = object.a;
        synchronized (object2) {
            object = object.f;
            if (object != null) {
                return object;
            }
            object = new IllegalStateException();
            throw object;
        }
    }

    @Override
    public final ByteBuffer e(int n2) {
        return this.a.getInputBuffer(n2);
    }

    @Override
    public final ByteBuffer f(int n2) {
        return this.a.getOutputBuffer(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g() {
        this.c.a();
        this.a.flush();
        alp alp2 = this.b;
        Object object = alp2.a;
        synchronized (object) {
            ++alp2.g;
            Handler handler = alp2.c;
            int n2 = agf.a;
            akt akt2 = new akt((Object)alp2, 2);
            handler.post((Runnable)akt2);
        }
        this.a.start();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void h() {
        block11: {
            if (this.d != 1) ** GOTO lbl-1000
            this.c.d();
            var2_1 = this.b;
            var1_4 = var2_1.a;
            // MONITORENTER : var1_4
            var2_1.h = true;
            var2_1.b.quit();
            var2_1.a();
            // MONITOREXIT : var1_4
lbl-1000:
            // 2 sources

            {
                this.d = 2;
            }
            if (this.f != false) return;
            if (agf.a >= 30 && agf.a < 33) {
                this.a.stop();
            }
            if (agf.a < 35 || (var1_4 = this.e) == null) break block11;
            var1_4.g(this.a);
            {
                catch (Throwable var2_2) {}
            }
        }
        this.a.release();
        this.f = true;
        return;
        catch (Throwable var2_3) {
            block12: {
                if (this.f != false) throw var2_3;
                if (agf.a >= 30 && agf.a < 33) {
                    this.a.stop();
                }
                if (agf.a < 35 || (var1_5 = this.e) == null) break block12;
                var1_5.g(this.a);
            }
            this.a.release();
            this.f = true;
            throw var2_3;
        }
        if (agf.a >= 35 && (var1_4 = this.e) != null) {
            var1_4.g(this.a);
        }
        this.a.release();
        this.f = true;
        throw var2_2;
    }

    @Override
    public final void i(Bundle bundle) {
        this.c.c(bundle);
    }

    @Override
    public final void j(int n2, int n3, long l2, int n4) {
        this.c.f(n2, n3, l2, n4);
    }

    @Override
    public final void k(int n2, ahu ahu2, long l2) {
        this.c.g(n2, ahu2, l2);
    }

    @Override
    public final void l(int n2) {
        this.a.releaseOutputBuffer(n2, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void m() {
        Object object = this.b.a;
        // MONITORENTER : object
        // MONITOREXIT : object
    }
}

