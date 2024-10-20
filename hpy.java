/*
 * Decompiled with CFR 0.152.
 */
public final class hpy
implements Runnable {
    Runnable a;
    final Object b;
    private final int c;

    public hpy(Object object, int n2) {
        this.c = n2;
        this.b = object;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [12 : 181->186)] java.lang.Throwable
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

    public final String toString() {
        int n2 = this.c;
        String string = "null";
        if (n2 != 0) {
            Runnable runnable = this.a;
            if (runnable != null) {
                string = a.ar(runnable, "SequentialExecutorWorker{running=", "}");
            } else {
                n2 = ((gbr)this.b).b;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            string = "RUNNING";
                        }
                    } else {
                        string = "QUEUED";
                    }
                } else {
                    string = "IDLE";
                }
                string = a.aj(string, "SequentialExecutorWorker{state=", "}");
            }
            return string;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            string = a.ar(runnable, "SequentialExecutorWorker{running=", "}");
        } else {
            n2 = ((hpz)this.b).d;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            string = "RUNNING";
                        }
                    } else {
                        string = "QUEUED";
                    }
                } else {
                    string = "QUEUING";
                }
            } else {
                string = "IDLE";
            }
            string = a.aj(string, "SequentialExecutorWorker{state=", "}");
        }
        return string;
    }
}

