/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.libraries.assistant.soda.Soda;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class cms {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/SodaAudioPusher");
    public final hpq b;
    public final Soda c;
    public final int d;
    public final int e;
    public hqa f;
    public final Object g = new Object();
    public hpn h;
    public hqa i;

    public cms(hpq hpq2, Soda soda, int n2, int n3) {
        this.b = hpq2;
        this.c = soda;
        this.d = n3;
        this.e = n2;
        ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "<init>", 64, "SodaAudioPusher.java")).v("channelCount %d, sampleRate %d", n3, n2);
    }

    /*
     * Unable to fully structure code
     */
    static void b(Soda var0, InputStream var1_1, gto var2_5, hqa var3_6, int var4_7) {
        block9: {
            ((heg)((heg)cms.a.f()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", 161, "SodaAudioPusher.java")).r("Starting to push audio to Soda");
            var8_8 = new byte[var4_7];
            var7_9 = ByteBuffer.allocateDirect(var4_7);
            ByteBuffer.allocateDirect(16);
            if (var4_7 == 0) {
                var3_6.n(new RuntimeException("Invalid audio buffer size for reading"));
                cms.c(var0, var7_9, var3_6, var2_5);
            }
            while (true) {
                if (var3_6.isCancelled()) break block9;
                var7_9.clear();
                var5_10 = var1_1.read(var8_8, 0, var4_7);
                if (var5_10 < 0) break block9;
                if (var5_10 <= 0) continue;
                var6_11 = var2_5.g();
                if (!var6_11) ** GOTO lbl27
                try {
                    ((OutputStream)var2_5.c()).write(var8_8, 0, var5_10);
                    ** GOTO lbl27
                }
                catch (IOException var9_12) {
                    try {
                        ((heg)((heg)cms.a.g()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "dumpAudioIfNeeded", 263, "SodaAudioPusher.java")).u("Failed to write to output stream: %s", var9_12.getMessage());
lbl27:
                        // 3 sources

                        var7_9.put(var8_8, 0, var5_10);
                        var0.g(var7_9, var5_10);
                        continue;
                    }
                    catch (IOException var1_2) {
                    }
                    catch (UnsupportedOperationException var1_3) {
                        // empty catch block
                    }
                }
                break;
            }
            a.as(cms.a.h(), "Failed to push audio to Soda", "com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", '\u00cf', "SodaAudioPusher.java", (Throwable)var1_4);
            var3_6.n((Throwable)var1_4);
        }
        cms.c(var0, var7_9, var3_6, var2_5);
    }

    private static void c(Soda soda, ByteBuffer byteBuffer, hqa hqa2, gto gto2) {
        ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "endPushingAudioToSoda", 143, "SodaAudioPusher.java")).r("Sending end of audio to Soda.");
        try {
            soda.g(byteBuffer, 0);
        }
        catch (IllegalStateException illegalStateException) {
            hqa2.n(illegalStateException);
        }
        if (gto2.g()) {
            try {
                ((OutputStream)gto2.c()).close();
                return;
            }
            catch (IOException iOException) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "finishDumpingAudioIfNeeded", 273, "SodaAudioPusher.java")).u("Failed to write to output stream: %s", iOException.getMessage());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.g;
        synchronized (object) {
            hqa hqa2 = this.i;
            if (hqa2 != null) {
                hqa2.m(null);
            }
            this.h = null;
            return;
        }
    }
}

