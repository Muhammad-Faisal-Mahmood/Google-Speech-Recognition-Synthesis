/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 */
import android.content.Context;
import android.os.SystemClock;

public abstract class ghs
extends ghr
implements ggz,
ghv {
    public gpm e;
    public jnu f;

    static {
        SystemClock.elapsedRealtime();
    }

    protected void attachBaseContext(Context context) {
        if (fs$$ExternalSyntheticApiModelOutline0.m()) {
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
        t.b((Context)this);
    }

    /*
     * Unable to fully structure code
     */
    protected final boolean c() {
        if (dww.b == null) {
            if (fs$$ExternalSyntheticApiModelOutline0.m()) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_1 = true;
                    break;
                }
            } else {
                var4_2 = dww.a;
                var1_3 = -1;
                if (var4_2 == null) {
                    var4_2 = dww.a((Context)this);
                    if (var4_2 == null) {
                        var4_2 = null;
                    } else {
                        var2_4 = var4_2.indexOf(58);
                        dww.a = var2_4 == -1 ? "" : var4_2.substring(var2_4);
                        var4_2 = dww.a;
                    }
                }
                if (var4_2 == null) {
                    while (true) {
                        var3_1 = false;
                        break;
                    }
                } else {
                    switch (var4_2.hashCode()) {
                        default: {
                            break;
                        }
                        case 1892872565: {
                            if (!var4_2.equals(":leakcanary")) break;
                            var1_3 = 3;
                            break;
                        }
                        case 1771111950: {
                            if (!var4_2.equals(":train")) break;
                            var1_3 = 1;
                            break;
                        }
                        case -733923188: {
                            if (!var4_2.equals(":learning_bg")) break;
                            var1_3 = 0;
                            break;
                        }
                        case -737791795: {
                            if (!var4_2.equals(":primes_lifeboat")) break;
                            var1_3 = 2;
                        }
                    }
                    if (var1_3 != 0 && var1_3 != 1 && var1_3 != 2 && var1_3 != 3 && !var4_2.startsWith(":privileged_process")) ** continue;
                    ** continue;
                }
            }
            dww.b = var3_1;
        }
        return dww.b == false;
    }

    /*
     * Exception decompiling
     */
    public void onCreate() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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

    @Override
    public final long p() {
        return ag$$ExternalSyntheticApiModelOutline1.m();
    }
}

