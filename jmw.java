/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jmw {
    static final boolean a;
    public static final itv b;
    private static final Logger c;

    static {
        boolean bl2;
        c = Logger.getLogger(jmw.class.getName());
        boolean bl3 = fxf.P(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        boolean bl4 = bl2 = false;
        if (!bl3) {
            bl4 = bl2;
            if (Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
                bl4 = true;
            }
        }
        a = bl4;
        b = new itv("internal-stub-type", null);
    }

    private jmw() {
    }

    public static hpn a(itz itz2, Object object) {
        jmq jmq2 = new jmq(itz2);
        jmw.e(itz2, object, new jmv(jmq2));
        return jmq2;
    }

    /*
     * Exception decompiling
     */
    public static Object b(itx var0, ixb var1_13, itw var2_14, Object var3_15) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [46[DOLOOP]], but top level block is 11[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static void c(itz itz2, jmr jmr2) {
        itz2.a(jmr2, new iwx());
        jmr2.aI();
    }

    /*
     * WARNING - void declaration
     */
    private static RuntimeException d(itz itz2, Throwable throwable) {
        block5: {
            void var0_3;
            try {
                itz2.c(null, throwable);
                break block5;
            }
            catch (Error error) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", (Throwable)var0_3);
        }
        if (!(throwable instanceof RuntimeException)) {
            if (throwable instanceof Error) {
                throw (Error)throwable;
            }
            throw new AssertionError((Object)throwable);
        }
        throw (RuntimeException)throwable;
    }

    /*
     * WARNING - void declaration
     */
    private static void e(itz itz2, Object object, jmr jmr2) {
        void var1_4;
        jmw.c(itz2, jmr2);
        try {
            itz2.f(object);
            itz2.d();
            return;
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        throw jmw.d(itz2, (Throwable)var1_4);
    }
}

