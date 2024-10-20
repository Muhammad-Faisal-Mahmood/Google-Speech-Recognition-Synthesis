/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class btn {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager");
    public final Object b = new Object();
    public volatile Map c = new HashMap();
    public final List d = new ArrayList();
    public final btj e;
    public final btp f;
    public final bxf g;
    public final bxt h;

    public btn(btj btj2, btp btp2, bxt bxt2, bxf bxf2) {
        this.e = btj2;
        this.g = bxf2;
        this.h = bxt2;
        this.f = btp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(bso object) {
        String string;
        block11: {
            Object object2;
            block10: {
                block12: {
                    Object object3;
                    block9: {
                        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadSync", 286, "VoiceDataManager.java")).u("Download voice sync %s", ((bso)object).m());
                        string = ((bso)object).h().c;
                        boolean bl2 = fxf.P(((bso)object).n());
                        object2 = "";
                        if (bl2) {
                            return "";
                        }
                        btj btj2 = this.e;
                        object3 = ((bso)object).h();
                        ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchBundledVoice", 326, "VoiceDataDownloader.java")).u("fetch bundled voice %s", ((buc)object3).c);
                        object = hno.g(hph.q(btj2.b((buc)object3, 100, null)), new bpu(this, object, 2, null), btj.b);
                        try {
                            object = (String)object.get();
                        }
                        catch (CancellationException cancellationException) {
                            break block9;
                        }
                        catch (ExecutionException executionException) {
                            // empty catch block
                            break block9;
                        }
                        catch (InterruptedException interruptedException) {
                            object = object2;
                            object2 = interruptedException;
                            break block10;
                        }
                        try {
                            this.d();
                            break block11;
                        }
                        catch (CancellationException cancellationException) {
                            break block12;
                        }
                        catch (ExecutionException executionException) {
                            break block12;
                        }
                        catch (InterruptedException interruptedException) {
                            break block10;
                        }
                    }
                    object3 = object;
                    object = object2;
                    object2 = object3;
                }
                a.as(a.g(), "Sync download failed", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadSync", '\u0139', "VoiceDataManager.java", (Throwable)object2);
                break block11;
            }
            Thread.currentThread().interrupt();
            a.as(a.g(), "Sync download was interrupted", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadSync", '\u0137', "VoiceDataManager.java", (Throwable)object2);
        }
        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadSync", 315, "VoiceDataManager.java")).C("fetchBundledVoice %s voicepack absolute path: %s", string, object);
        return object;
    }

    /*
     * Exception decompiling
     */
    public final List b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [26 : 709->712)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(bul bul2) {
        Object object = this.b;
        synchronized (object) {
            this.d.add(bul2);
            return;
        }
    }

    public final void d() {
        hhk.T(hph.q(this.e.c()), new btm(this), btj.b);
    }

    public final bzb e() {
        return this.h.l();
    }
}

