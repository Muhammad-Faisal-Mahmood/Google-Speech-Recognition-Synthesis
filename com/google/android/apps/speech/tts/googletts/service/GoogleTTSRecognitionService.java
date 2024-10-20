/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.AttributionSource
 *  android.content.Context
 *  android.content.ContextParams$Builder
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.speech.ModelDownloadListener
 *  android.speech.RecognitionService$Callback
 *  android.speech.RecognitionService$SupportCallback
 */
package com.google.android.apps.speech.tts.googletts.service;

import android.app.Service;
import android.content.AttributionSource;
import android.content.Context;
import android.content.ContextParams;
import android.content.Intent;
import android.os.Build;
import android.speech.ModelDownloadListener;
import android.speech.RecognitionService;
import j$.util.Optional;

public final class GoogleTTSRecognitionService
extends bwm {
    private bwg a;
    private boolean b;
    private final goi c = new goi((Service)this);

    @Deprecated
    public GoogleTTSRecognitionService() {
        fpk.c();
    }

    public final bwg a() {
        bwg bwg2 = this.a;
        if (bwg2 != null) {
            return bwg2;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final int getMaxConcurrentSessionsCount() {
        gpf gpf2 = this.c.d("getMaxConcurrentSessionsCount");
        try {
            super.getMaxConcurrentSessionsCount();
            int n2 = this.a().d;
            return n2;
        }
        finally {
            gpf2.close();
        }
    }

    protected final void onCancel(RecognitionService.Callback object) {
        gpf gpf2;
        block7: {
            gpf2 = this.c.d("onCancel");
            Object object2 = this.a().c;
            object = (fkg)((fki)object2).b.remove(object);
            if (object == null) break block7;
            object2 = ((fki)object2).c;
            ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "onCancel", 144, "RecognitionServiceImpl.java")).r("RecognitionService#onCancel");
            object = (ffv)((fjz)object2).d.remove(object);
            if (object == null) break block7;
            ((ffv)object).a();
        }
        return;
        finally {
            gpf2.close();
        }
    }

    public final void onCheckRecognitionSupport(Intent intent, AttributionSource attributionSource, RecognitionService.SupportCallback supportCallback) {
        gpf gpf2 = this.c.d("onCheckRecognitionSupport");
        try {
            super.onCheckRecognitionSupport(intent, attributionSource, supportCallback);
            bwg bwg2 = this.a();
            ((heg)((heg)bwg.a.f().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "onCheckRecognitionSupport", 124, "GoogleTTSRecognitionServicePeer.java")).r("#onCheckRecognitionSupport#AndroidU");
            bwg2.a(fhq.k().c, intent, ut$$ExternalSyntheticApiModelOutline0.m(attributionSource), supportCallback);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onCheckRecognitionSupport(Intent intent, RecognitionService.SupportCallback supportCallback) {
        gpf gpf2 = this.c.d("onCheckRecognitionSupport");
        try {
            super.onCheckRecognitionSupport(intent, supportCallback);
            bwg bwg2 = this.a();
            ((heg)((heg)bwg.a.f().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "onCheckRecognitionSupport", 109, "GoogleTTSRecognitionServicePeer.java")).r("#onCheckRecognitionSupport");
            bwg2.a(fhq.k().c, intent, -1, supportCallback);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void onCreate() {
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

    public final void onDestroy() {
        gpf gpf2 = this.c.e();
        try {
            super.onDestroy();
            fki fki2 = this.a().c;
            Object object = fki2.c;
            ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "onDestroy", 160, "RecognitionServiceImpl.java")).r("RecognitionService#onDestroy");
            Object object2 = ((fjz)object).d.values().iterator();
            while (object2.hasNext()) {
                ((ffv)object2.next()).a();
            }
            ((fjz)object).d.clear();
            object = ((fjz)object).f;
            object2 = new fbw(9);
            ((Optional)object).ifPresent(object2);
            fki2.b.clear();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    protected final void onStartListening(Intent object, RecognitionService.Callback object2) {
        gpf gpf2 = this.c.d("onStartListening");
        try {
            Object object3;
            Object object4 = this.a();
            Object object5 = ((bwg)object4).c;
            Object object6 = ((bwg)object4).b;
            object4 = new fkg((fki)object5, (RecognitionService.Callback)object2, (Intent)object);
            ((fki)object5).b.put(object2, object4);
            object5 = ((fki)object5).c;
            int n2 = object2.getCallingUid();
            ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "onStartListening", 116, "RecognitionServiceImpl.java")).r("RecognitionService#onStartListening");
            object = ((fjz)object5).b.a((Intent)object, n2, false);
            if (Build.VERSION.SDK_INT >= 31 && (object2 = ut$$ExternalSyntheticApiModelOutline0.m((RecognitionService.Callback)((fkg)object4).a)) != null) {
                ((fgt)object).e(Optional.of(object2));
                if (((fgt)object).a.isEmpty() || !((fev)((fgt)object).a.get()).e) {
                    ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "onStartListening", 132, "RecognitionServiceImpl.java")).r("Create an attribution context to skip platform permission check");
                    object3 = new ContextParams.Builder();
                    ut$$ExternalSyntheticApiModelOutline0.m((Context)object6, ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m((ContextParams.Builder)object3, (AttributionSource)object2)));
                }
            }
            object = ((fgt)object).a();
            object2 = ((fjz)object5).g;
            object2 = fhq.k().c;
            ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "startListening", 174, "RecognitionServiceImpl.java")).C("RecognitionService#logStartListening: callingApp: %s, locale: %s", ((fgu)object).e, ((fgu)object).b);
            object6 = fgc.a();
            ((fgb)object6).d(fgs.c);
            ((fgb)object6).c(n2);
            ((fgb)object6).b(((fgu)object).d);
            ((fgb)object6).h(((fgu)object).b);
            ((fgb)object6).j(((fgu)object).M);
            ((fgb)object6).i(((fgu)object).i);
            ((fgb)object6).e(false);
            ((fgb)object6).f(((fgu)object).m.isPresent());
            ((fgb)object6).g(((fgu)object).w.equals("smart_dictation"));
            object6 = ((fgb)object6).a();
            object3 = ((fjz)object5).f;
            fas fas2 = new fas(object2, object6, 9);
            ((Optional)object3).ifPresent(fas2);
            object6 = new fjw((fjz)object5, (fkg)object4, (String)object2);
            object3 = new fjy((fjz)object5, (fkg)object4, (String)object2, (fgu)object);
            object = ((fjz)object5).h.k((fgu)object, (ffk)object6, (fgr)object3);
            ((fjz)object5).d.put(object4, object);
            ((ffv)object).b();
            return;
        }
        finally {
            try {
                gpf2.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    protected final void onStopListening(RecognitionService.Callback object) {
        gpf gpf2;
        block7: {
            gpf2 = this.c.d("onStopListening");
            Object object2 = this.a().c;
            object = (fkg)((fki)object2).b.get(object);
            if (object == null) break block7;
            object2 = ((fki)object2).c;
            ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl", "onStopListening", 152, "RecognitionServiceImpl.java")).r("RecognitionService#onStopListening");
            object = (ffv)((fjz)object2).d.get(object);
            if (object == null) break block7;
            ((ffv)object).c();
        }
        return;
        finally {
            gpf2.close();
        }
    }

    public final void onTriggerModelDownload(Intent intent) {
        gpf gpf2 = this.c.d("onTriggerModelDownload");
        try {
            super.onTriggerModelDownload(intent);
            bwg bwg2 = this.a();
            ((heg)((heg)bwg.a.f().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "onTriggerModelDownload", 177, "GoogleTTSRecognitionServicePeer.java")).r("#onTriggerModelDownload");
            bwg2.b(fhq.k().c, intent, -1, Optional.empty());
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onTriggerModelDownload(Intent intent, AttributionSource attributionSource, ModelDownloadListener modelDownloadListener) {
        gpf gpf2 = this.c.d("onTriggerModelDownload");
        try {
            bwg bwg2 = this.a();
            ((heg)((heg)bwg.a.f().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "onTriggerModelDownload", 194, "GoogleTTSRecognitionServicePeer.java")).r("#onTriggerModelDownload#AndroidU");
            bwg2.b(fhq.k().c, intent, ut$$ExternalSyntheticApiModelOutline0.m(attributionSource), Optional.of(modelDownloadListener));
            return;
        }
        finally {
            gpf2.close();
        }
    }
}

