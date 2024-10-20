/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  gqv
 */
package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class TikTokListenableWorker
extends bbh {
    private static final hei e = hei.m("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    private final gpm f;
    private final jnu g;
    private final WorkerParameters h;
    private final gop i;
    private gcm j = null;
    private boolean k = false;

    public TikTokListenableWorker(Context context, gpm gpm2, jnu jnu2, WorkerParameters workerParameters, gop gop2) {
        super(context, workerParameters);
        this.g = jnu2;
        this.f = gpm2;
        this.h = workerParameters;
        this.i = gop2;
    }

    public static /* synthetic */ void c(hpn hpn2, hue hue2) {
        try {
            hhk.S(hpn2);
            return;
        }
        catch (CancellationException cancellationException) {
            ((heg)((heg)e.h()).j("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 177, "TikTokListenableWorker.java")).u("TikTokListenableWorker was cancelled while running client worker: %s", hue2);
            return;
        }
        catch (ExecutionException executionException) {
            ((heg)((heg)((heg)e.g()).i(executionException.getCause())).j("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 172, "TikTokListenableWorker.java")).u("TikTokListenableWorker encountered an exception while running client worker: %s", hue2);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a() {
        boolean bl2;
        Object object = gcz.c(this.h);
        gpf gpf2 = this.f.f("WorkManager:TikTokListenableWorker getForegroundInfoAsync()", gqv.a);
        object = fxf.at(a.aw((String)object, " getForegroundInfoAsync()"), gqv.a, this.i);
        try {
            bl2 = this.j == null;
        }
        catch (Throwable throwable) {
            try {
                ((gol)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
                throw throwable;
            }
        }
        fxf.B(bl2, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
        Object object2 = (gcm)this.g.b();
        this.j = object2;
        object2 = object2.a(this.h);
        ((gol)object).a((hpn)object2);
        try {
            ((gol)object).close();
            return object2;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final hpn b() {
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
}

