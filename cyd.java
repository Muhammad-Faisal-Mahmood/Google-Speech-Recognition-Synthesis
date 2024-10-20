/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.concurrent.Executor;

public final class cyd
implements cyh {
    private final cxl a;
    private final ctf b;
    private final String c;
    private final ctq d;
    private final int e;
    private final long f;
    private final String g;
    private final Executor h;
    private final cyu i;
    private final int j;
    private final cqq k;
    private final bmu l;

    public cyd(cxl cxl2, bmu bmu2, ctf ctf2, int n2, cyu cyu2, ctq ctq2, int n3, long l2, String string, cqq cqq2, Executor executor) {
        this.a = cxl2;
        this.l = bmu2;
        this.b = ctf2;
        this.j = n2;
        this.c = cqq.Z(ctf2);
        this.i = cyu2;
        this.d = ctq2;
        this.e = n3;
        this.f = l2;
        this.g = string;
        this.k = cqq2;
        this.h = executor;
    }

    public static hpn c(ctp ctp2, ctf hwv2, int n2, cxl cxl2, Executor executor) {
        hwv2 = crh.l(hwv2, n2);
        return dah.e(cyd.e(cxl2, (ctt)hwv2, executor)).g(new cxe(ctp2, cxl2, (Object)hwv2, 5), executor).g(new cwu(hwv2, 19), executor);
    }

    static hpn d(cxl cxl2, ctf ctf2, int n2, bmu bmu2, Uri uri, String string, cyu cyu2, Executor executor) {
        return dah.e(cyd.e(cxl2, crh.l(ctf2, n2), executor)).g(new cvq((Object)string, (Object)cyu2, (Object)bmu2, (Object)uri, 16, null), executor);
    }

    private static hpn e(cxl cxl2, ctt ctt2, Executor executor) {
        return fxf.ak(cxl2.e(ctt2), new cyc(ctt2, 0), executor);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final hpn a(Uri var1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 27[TRYBLOCK] [66 : 1294->1317)] css
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

    @Override
    public final hpn b(css object) {
        cyr.d("%s: Failed to download file %s", "DownloaderCallbackImpl", this.c);
        if (((css)object).a.equals((Object)csr.B)) {
            ctf ctf2 = this.b;
            int n2 = this.j;
            object = this.a;
            Executor executor = this.h;
            return cyd.c(ctp.f, ctf2, n2, (cxl)object, executor);
        }
        ctf ctf3 = this.b;
        int n3 = this.j;
        object = this.a;
        Executor executor = this.h;
        return cyd.c(ctp.d, ctf3, n3, (cxl)object, executor);
    }
}

