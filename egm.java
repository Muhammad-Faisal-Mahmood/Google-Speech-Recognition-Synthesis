/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.IOException;

public final class egm
implements efo {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource");
    private final String b;
    private final Context c;
    private gto d = gsl.a;

    public egm(String string, Context context) {
        this.b = string;
        this.c = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ebq a() {
        synchronized (this) {
            Object object = a;
            ((heg)((heg)((hdz)object).f().h(hfo.a, "ALT.URIAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 75, "AudioUriAudioSource.java")).u("#audio# close audio source(%s)", crh.K(this));
            if (!this.d.g()) {
                ((heg)((heg)((hdz)object).h().h(hfo.a, "ALT.URIAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 89, "AudioUriAudioSource.java")).u("#audio# close audio source(%s) failed: no audio stream", crh.K(this));
                return elb.c(ebp.h);
            }
            object = this.d.c();
            try {
                ((egp)object).b();
                return elb.d(ebr.b);
            }
            catch (IOException iOException) {
                ((heg)((heg)((heg)a.h().h(hfo.a, "ALT.URIAudioSource")).i(iOException)).j("com/google/android/libraries/search/audio/audiosource/impl/AudioUriAudioSource", "closeAudioSource", 81, "AudioUriAudioSource.java")).u("#audio# close audio source(%s) failed: error closing audio stream", crh.K(this));
                return elb.c(ebp.z);
            }
        }
    }

    @Override
    public final efq b() {
        return dww.i(efs.i);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final gto c() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 40[TRYBLOCK] [161 : 1695->1697)] java.lang.Throwable
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
}

