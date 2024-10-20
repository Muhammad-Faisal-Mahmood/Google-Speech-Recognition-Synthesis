/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

public final class jj
implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new py(1);
    public final ArrayList c = new ArrayList();
    long d;
    public long e;
    private final ArrayList f = new ArrayList();

    /*
     * Unable to fully structure code
     */
    private static final lg b(RecyclerView var0, int var1_1, long var2_2) {
        block7: {
            var5_3 = var0.h.c();
            for (var4_4 = 0; var4_4 < var5_3; ++var4_4) {
                var6_5 = RecyclerView.j(var0.h.f(var4_4));
                if (var6_5.mPosition != var1_1 || var6_5.isInvalid()) continue;
                return null;
            }
            var7_7 = var0.e;
            if (var2_2 != 0x7FFFFFFFFFFFFFFFL) ** GOTO lbl11
            if (tz.a()) {
                Trace.beginSection((String)"RV Prefetch forced - needed next frame");
            }
lbl11:
            // 4 sources

            var0.Q();
            var6_5 = var7_7.o(var1_1, var2_2);
            if (var6_5 == null) break block7;
            if (var6_5.isBound() && !var6_5.isInvalid()) {
                var7_7.j(var6_5.itemView);
                break block7;
            }
            var7_7.c(var6_5, false);
        }
        return var6_5;
        finally {
            var0.S(false);
            Trace.endSection();
        }
    }

    public final void a(RecyclerView object, int n2, int n3) {
        if (((RecyclerView)object).s && this.d == 0L) {
            this.d = RecyclerView.as();
            object.post((Runnable)this);
        }
        object = ((RecyclerView)object).N;
        ((jh)object).a = n2;
        ((jh)object).b = n3;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [5 : 129->142)] java.lang.Throwable
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

