/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters;

public final class dcf
implements hnx {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ dcf(gcu gcu2, gol gol2, WorkerParameters workerParameters, int n2) {
        this.d = n2;
        this.c = gcu2;
        this.b = gol2;
        this.a = workerParameters;
    }

    public /* synthetic */ dcf(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    public /* synthetic */ dcf(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public /* synthetic */ dcf(kpo kpo2, ddn ddn2, hpn hpn2, int n2) {
        this.d = n2;
        this.c = kpo2;
        this.a = ddn2;
        this.b = hpn2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final hpn a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 53[TRYBLOCK] [57 : 2597->2600)] java.lang.Throwable
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

