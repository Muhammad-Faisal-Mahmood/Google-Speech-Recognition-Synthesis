/*
 * Decompiled with CFR 0.152.
 */
import com.google.audio.hearing.common.OggOpusEncoder;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class ezb
extends InputStream
implements InputStreamRetargetInterface {
    public static final hei a = hei.m("com/google/android/libraries/speech/encoding/OggOpusInputStream");
    public static boolean b = false;
    private final InputStream c;
    private final int d;
    private boolean e = false;
    private long f;
    private final OggOpusEncoder g;
    private final grz h;
    private final ksn i;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ezb(InputStream object, int n2, int n3, int n4) {
        ksn ksn2;
        grz grz2;
        this.c = object;
        this.d = 2048;
        if (!b) {
            ezb.a();
        }
        this.g = object = new OggOpusEncoder();
        if (((OggOpusEncoder)object).a != 0L) {
            ((OggOpusEncoder)object).a();
        }
        ((OggOpusEncoder)object).a = ((OggOpusEncoder)object).init(n4, n3, n2, true);
        this.h = grz2 = new grz(n3 * 8);
        object = grz2.e;
        synchronized (object) {
            ksn2 = new ksn(grz2);
            grz2.e.add(ksn2);
        }
        this.i = ksn2;
        ((heg)((heg)a.b()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "<init>", 90, "OggOpusInputStream.java")).H("OggOpus encoder initialized: %d channels, %d bitRate, %d sampleRate, %d readSize", n4, n3, n2, 2048);
    }

    private static void a() {
        ((heg)((heg)a.h()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 63, "OggOpusInputStream.java")).r("Native lib ogg_opus_encoder has not been explicitly loaded! Relying on System.loadLibrary() is unsafe on Android: attempts to use encoder may crash. Please call #initNativeOggOpusLib in the process before instantiating OggOpusInputStream.");
        try {
            System.loadLibrary("ogg_opus_encoder");
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            a.as(a.g(), "Implicit load of libogg_opus_encoder.so failed and OggOpusInputStream will crash! Please call #maybeInitNativeOggOpusLib() before instantiating OggOpusInputStream.", "com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 'G', "OggOpusInputStream.java", unsatisfiedLinkError);
            return;
        }
    }

    private final void b(byte[] byArray) {
        int n2 = byArray.length;
        if (!this.h.b(byArray, n2)) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "enqueueEncodedBytes", 103, "OggOpusInputStream.java")).s("OggOpus-encoded bytes are not being read quickly enough! Up to %s encoded bytes may be discarded.", n2);
        }
    }

    @Override
    public final void close() {
        this.c.close();
    }

    @Override
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        block15: {
            long l2;
            Object object;
            block14: {
                int n4;
                Object object2 = ByteBuffer.wrap(new byte[this.d]);
                if (!this.e) {
                    try {
                        n4 = this.c.read(((ByteBuffer)object2).array());
                        if (n4 == -1) {
                            this.e = true;
                            ((heg)((heg)a.b()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "read", 124, "OggOpusInputStream.java")).r("OggOpus encoder detected end of raw audio stream.");
                            this.b(this.g.a());
                        } else {
                            this.f += (long)n4;
                            object = this.g;
                            byte[] byArray2 = ((ByteBuffer)object2).array();
                            n4 = ((ByteBuffer)object2).array().length;
                            this.b(((OggOpusEncoder)object).processAudioBytes(((OggOpusEncoder)object).a, byArray2, 0, n4));
                        }
                    }
                    catch (IOException iOException) {
                        this.b(this.g.a());
                        throw iOException;
                    }
                }
                n3 = Math.min(n3, this.i.a());
                if (this.e && n3 == 0) {
                    ((heg)((heg)a.b()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "read", 139, "OggOpusInputStream.java")).r("OggOpus encoder finished processing all audio bytes.");
                    return -1;
                }
                object = this.i;
                object2 = (grz)((ksn)object).a;
                long l3 = ((grz)object2).d - ((ksn)object).c;
                l2 = ((grz)object2).c;
                if (l3 > l2) {
                    ((ksn)object).b((int)((l3 -= (long)n3) % l2));
                    ((ksn)object).c += l3;
                    ((heg)((heg)grz.a.g()).j("com/google/audio/hearing/common/CircularByteBuffer", "internalRead", 204, "CircularByteBuffer.java")).r("We lost data before this read!");
                }
                if (n3 == 0) break block14;
                if (n3 < 0 || n3 > ((ksn)object).a()) break block15;
                int n5 = ((ksn)object).b;
                int n6 = ((grz)object2).c;
                n4 = (n5 + n3) % n6;
                if (n5 < n4) {
                    System.arraycopy(((grz)object2).b, n5, byArray, n2, n4 - n5);
                } else {
                    System.arraycopy(((grz)object2).b, n5, byArray, n2, n6 - n5);
                    n6 = ((grz)object2).c;
                    n4 = ((ksn)object).b;
                    System.arraycopy(((grz)object2).b, 0, byArray, n2 + n6 - n4, n3 - (n6 - n4));
                }
            }
            l2 = n3;
            ((ksn)object).b(n3);
            ((ksn)object).c += l2;
        }
        return n3;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

