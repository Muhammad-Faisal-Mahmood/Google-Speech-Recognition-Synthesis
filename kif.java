/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class kif
implements kgn {
    private final kgp a;

    public kif(kgp kgp2) {
        this.a = kgp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean b(IOException object, khp khp2, kgs object2, boolean bl2) {
        int n2;
        Object var2_2;
        Object object3;
        boolean bl3;
        if (!this.a.f) {
            return false;
        }
        if (bl3) {
            object3 = ((kgs)object3).d;
            if (object3 != null) {
                if (((kgt)object3).c()) return false;
            }
            if (object instanceof FileNotFoundException) return false;
        }
        if (object instanceof ProtocolException) {
            return false;
        }
        if (object instanceof InterruptedIOException) {
            if (!(object instanceof SocketTimeoutException)) return false;
            if (bl3) return false;
        } else {
            if (object instanceof SSLHandshakeException) {
                if (((Throwable)object).getCause() instanceof CertificateException) return false;
            }
            if (object instanceof SSLPeerUnverifiedException) {
                return false;
            }
        }
        object3 = var2_2.g;
        jse.b(object3);
        int n3 = n2 = ((khl)object3).e;
        if (n2 == 0) {
            if (((khl)object3).f == 0) {
                if (((khl)object3).g == 0) return false;
            }
            n3 = 0;
        }
        if (((khl)object3).h != null) {
            return true;
        }
        var2_2 = null;
        object = var2_2;
        if (n3 <= 1) {
            object = var2_2;
            if (((khl)object3).f <= 1) {
                if (((khl)object3).g > 0) {
                    object = var2_2;
                } else {
                    khr khr2 = ((khl)object3).b.h;
                    if (khr2 == null) {
                        object = var2_2;
                    } else {
                        synchronized (khr2) {
                            n3 = khr2.j;
                            if (n3 != 0) {
                                // MONITOREXIT @DISABLED, blocks:[3, 9, 10, 12, 14, 15] lbl42 : MonitorExitStatement: MONITOREXIT : var7_7
                                object = var2_2;
                            } else {
                                bl3 = khb.t(khr2.a.a.i, ((khl)object3).a.i);
                                if (!bl3) {
                                    // MONITOREXIT @DISABLED, blocks:[3, 7, 8, 10, 12, 14, 15] lbl47 : MonitorExitStatement: MONITOREXIT : var7_7
                                    object = var2_2;
                                } else {
                                    object = khr2.a;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (object != null) {
            ((khl)object3).h = object;
            return true;
        }
        object = ((khl)object3).c;
        if (object != null) {
            if (((khv)object).b()) return true;
        }
        if ((object = ((khl)object3).d) == null) return true;
        if (((khw)object).a()) return true;
        return false;
    }

    private static final int c(kgv object, int n2) {
        if ((object = kgv.a((kgv)object, "Retry-After")) == null) {
            return n2;
        }
        if (new jtv("\\d+").b((CharSequence)object)) {
            return Integer.valueOf((String)object);
        }
        return Integer.MAX_VALUE;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final kgv a(kid var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [41[UNCONDITIONALDOLOOP]], but top level block is 37[CATCHBLOCK]
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
}

