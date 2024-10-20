/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dip {
    public static final Object a;
    public static final Map b;
    public static final Map c;
    public static final cxv d;
    public static final bmu e;

    static {
        cxv cxv2;
        d = cxv2 = new cxv((Executor)hom.a);
        a = new Object();
        b = new HashMap();
        c = new HashMap();
        e = new bmu(cxv2);
    }

    static String a(Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        while (throwable != null) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" >>>> ");
            }
            stringBuilder.append(throwable.getClass().getSimpleName());
            stringBuilder.append(":");
            stringBuilder.append(throwable.getMessage());
            throwable = throwable.getCause();
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    static void b(diu var0, bzq var1_19, dir var2_24, long var3_26, String var5_27) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [14 : 293->305)] java.lang.Throwable
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

    private static void c(dir object, String string, List object2, Set set, int n2, int n3, int n4) {
        if (((hfk)ddd.a.f()).M() && !object2.isEmpty()) {
            StringBuilder stringBuilder;
            hfk hfk2 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "logPendingDownloads", 607, "ScheduledDownloadManager.java");
            if (object == null) {
                object = "";
            } else {
                object = ((Object)((dir)object).e).toString();
                stringBuilder = new StringBuilder(" (");
                stringBuilder.append((String)object);
                stringBuilder.append(")");
                object = stringBuilder.toString();
            }
            int n5 = object2.size();
            stringBuilder = new StringBuilder();
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                object2 = (dfd)iterator.next();
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((dfd)object2).d().e());
                if (dip.e.c.containsKey(((dfd)object2).i())) {
                    stringBuilder.append(" @");
                }
                if (set.contains(object2)) {
                    stringBuilder.append(" *");
                }
                stringBuilder.append(" ");
                stringBuilder.append(((dfd)object2).b.m());
            }
            hfk2.K("Scheduling: %s%s, %d started, %d paused, %d scheduled, %d pending: %s", string, object, n2, n3, n4, n5, stringBuilder.toString());
        }
    }
}

