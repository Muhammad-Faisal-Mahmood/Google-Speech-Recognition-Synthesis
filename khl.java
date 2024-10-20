/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class khl {
    public final kfs a;
    public final khp b;
    public khv c;
    public khw d;
    public int e;
    public int f;
    public int g;
    public kgy h;
    private final kht i;

    public khl(kht kht2, kfs kfs2, khp khp2) {
        this.i = kht2;
        this.a = kfs2;
        this.b = khp2;
    }

    /*
     * Exception decompiling
     */
    public final kib a(kgp var1_1, kid var2_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 46[TRYBLOCK] [136 : 2572->2577)] java.lang.Throwable
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

    public final void b(IOException iOException) {
        jse.e(iOException, "e");
        this.h = null;
        if (iOException instanceof kjy && ((kjy)iOException).a == kiq.h) {
            ++this.e;
            return;
        }
        if (iOException instanceof kip) {
            ++this.f;
            return;
        }
        ++this.g;
    }

    public final boolean c(kgm kgm2) {
        int n2 = kgm2.d;
        kgm kgm3 = this.a.i;
        return n2 == kgm3.d && jse.i(kgm2.c, kgm3.c);
    }
}

