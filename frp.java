/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  gqv
 *  hom
 */
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class frp {
    public final String a;
    public final hpn b;
    public final Executor c;
    public final gto d;
    public final Object e = new Object();
    public hpn f = null;
    public final bmu g;
    private final gnt h;
    private final hou i = new hou();
    private final frv j;

    public frp(String string, hpn hpn2, frv frv2, Executor executor, bmu bmu2, gto gto2, gnt gnt2) {
        this.a = string;
        this.b = hhk.L(hpn2);
        this.j = frv2;
        this.c = new hpz(executor);
        this.g = bmu2;
        this.d = gto2;
        this.h = gnt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn a() {
        Object object = this.e;
        synchronized (object) {
            boolean bl2;
            Object object2 = this.f;
            if (object2 != null && (bl2 = object2.isDone())) {
                try {
                    hhk.S(this.f);
                }
                catch (ExecutionException executionException) {
                    this.f = null;
                }
            }
            if (this.f != null) return this.f;
            hou hou2 = this.i;
            object2 = new frn(this, 0);
            this.f = hhk.L(hou2.b(gqk.c((hnx)object2), this.c));
            return this.f;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final Object b(Uri var1_1) {
        block17: {
            var3_2 = this.h;
            var4_5 = this.a;
            var2_7 = new StringBuilder("Read ");
            var2_7.append((String)var4_5);
            var2_7 = var3_2.a(var2_7.toString(), gqv.a);
            var4_5 = this.g;
            var3_2 = new fqq();
            var3_2 = (InputStream)var4_5.w(var1_1, (fpp)var3_2);
            var4_5 = this.j;
            var4_5 = var4_5.a.u().f((InputStream)var3_2, var4_5.b);
            if (var3_2 == null) break block17;
            var3_2.close();
        }
        var2_7.close();
        return var4_5;
        catch (Throwable var4_6) {
            if (var3_2 == null) ** GOTO lbl30
            try {
                var3_2.close();
                ** GOTO lbl30
            }
            catch (Throwable var3_3) {
                try {
                    var4_6.addSuppressed(var3_3);
lbl30:
                    // 3 sources

                    throw var4_6;
                }
                catch (Throwable var3_4) {
                    try {
                        var2_7.close();
                        ** GOTO lbl39
                    }
                    catch (Throwable var2_8) {
                        try {
                            var3_4.addSuppressed(var2_8);
lbl39:
                            // 2 sources

                            throw var3_4;
                        }
                        catch (FileNotFoundException var2_10) {
                            if (!this.g.B(var1_1)) {
                                return this.j.a;
                            }
                            throw var2_10;
                        }
                        catch (IOException var2_9) {}
                        {
                        }
                    }
                }
            }
        }
        throw fvc.P(this.g, var1_1, var2_9, this.a);
    }

    /*
     * Exception decompiling
     */
    public final void c(Uri var1_1, Object var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 6 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public final hpn d(hny object, Executor executor) {
        object = gqk.c(new cvt((Object)this, this.a(), (hny)object, executor, 8));
        return this.i.b((hnx)object, (Executor)hom.a);
    }
}

