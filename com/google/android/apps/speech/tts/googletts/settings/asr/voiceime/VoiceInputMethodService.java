/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.os.PowerManager
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.ExtractedTextRequest
 *  android.view.inputmethod.InputMethodInfo
 *  android.widget.Toast
 */
package com.google.android.apps.speech.tts.googletts.settings.asr.voiceime;

import android.app.Service;
import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodInfo;
import android.widget.Toast;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

public final class VoiceInputMethodService
extends bza {
    private bzb a;
    private boolean b;
    private final goi c = new goi((Service)this);

    @Deprecated
    public VoiceInputMethodService() {
        fpk.c();
    }

    public final bzb a() {
        bzb bzb2 = this.a;
        if (bzb2 != null) {
            return bzb2;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final void hideWindow() {
        gpf gpf2 = this.c.d("hideWindow");
        try {
            super.hideWindow();
            Object object = this.a().a;
            ((heg)((heg)fmb.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onHideWindow", 157, "VoiceInputMethodServiceImpl.java")).r("#onHideWindow");
            ((fmb)object).d.a();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onCreate() {
        block20: {
            block21: {
                var1_1 = this.c.c();
                this.b = true;
                fxf.A(this.getApplication() instanceof ghv);
                if (this.a != null) break block20;
                if (!this.b) break block21;
                var3_3 = fxf.aq("CreateComponent");
                {
                    block23: {
                        block22: {
                            catch (Throwable var2_10) {
                                throw var2_10;
                            }
                            try {
                                this.bn();
                            }
                            catch (Throwable var2_8) {
                                try {
                                    var3_3.close();
                                    throw var2_8;
                                }
                                catch (Throwable var3_5) {
                                    var2_8.addSuppressed(var3_5);
                                    throw var2_8;
                                }
                            }
                            {
                                var3_3.close();
                                var2_6 = fxf.aq("CreatePeer");
                            }
                            try {
                                try {
                                    var5_11 = this.bn();
                                }
                                catch (ClassCastException var4_14) {
                                    var3_3 = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", var4_14);
                                    throw var3_3;
                                }
                                var3_3 = ((bre)var5_11).a;
                                if (!(var3_3 instanceof VoiceInputMethodService)) break block22;
                                var4_12 = (VoiceInputMethodService)var3_3;
                                idi.m(var4_12);
                                var5_11 = ((bre)var5_11).b;
                                var3_3 = new bmu((jnu)var5_11.H, (jnu)var5_11.z, (jnu)var5_11.F, null, null);
                                this.a = var5_11 = new bzb((VoiceInputMethodService)var4_12, (bmu)var3_3);
                            }
                            catch (Throwable var3_4) {
                                break block23;
                            }
                            ** try [egrp 5[TRYBLOCK] [6 : 145->152)] { 
lbl42:
                            // 1 sources

                            var2_6.close();
                            break block20;
                        }
                        var4_13 = new IllegalStateException(a.at(var3_3, bzb.class, "Attempt to inject a Service wrapper of type "));
                        throw var4_13;
                    }
                    try {
                        var2_6.close();
                        throw var3_4;
                    }
                    catch (Throwable var2_7) {}
                    {
                        var3_4.addSuppressed(var2_7);
                        throw var3_4;
                    }
                }
            }
            var2_9 = new IllegalStateException("createPeer() called outside of onCreate");
            throw var2_9;
        }
        super.onCreate();
        var2_6 = this.a().a;
        ((heg)((heg)fmb.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onCreate", 53, "VoiceInputMethodServiceImpl.java")).r("#onCreate");
        var4_12 = ((fmb)var2_6).d;
        var3_3 = new eyd(var2_6, 2);
        var4_12.b((gui)var3_3);
        this.b = false;
        return;
lbl66:
        // 1 sources

        finally {
            try {
                var1_1.close();
            }
            catch (Throwable var1_2) {
                var2_10.addSuppressed(var1_2);
            }
        }
    }

    public final View onCreateInputView() {
        gpf gpf2 = this.c.d("onCreateInputView");
        try {
            super.onCreateInputView();
            Object object = this.a().a;
            ((heg)((heg)fmb.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onCreateInputView", 58, "VoiceInputMethodServiceImpl.java")).r("#onCreateInputView");
            ((fmb)object).a();
            View view = ((LayoutInflater)((fmb)object).b.getSystemService("layout_inflater")).inflate(2131624123, null);
            Object object2 = ((fmb)object).b.getWindow().getWindow();
            gic gic2 = new gic();
            Object object3 = view.getContext();
            bzb bzb2 = new bzb(null, null);
            fxf.K(object2);
            gic2.f = object2;
            object2 = new gif((Context)object3, gic2);
            gic2.e = object2;
            object2 = gic2.e;
            nf nf2 = gic2.d;
            Objects.requireNonNull(view);
            AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = new AmbientModeSupport$AmbientController(view, null);
            object3 = new gii(gic2, (Context)object2, nf2, ambientModeSupport$AmbientController);
            object2 = new bzb(object3);
            gic2.h = object2;
            gic2.g = bzb2;
            gic2.bn();
            gic2 = ((fmb)object).e = gic2;
            acb.c(gic2);
            gic2.c.b(null);
            gic2.a.b((Context)gic2.e);
            gic2.c().aj();
            gic2.b.d(aaz.ON_CREATE);
            gic2.c().ac();
            gic2 = ((fmb)object).e;
            gic2.c().ai();
            gic2.c().ak();
            gic2.b.d(aaz.ON_START);
            gic2.c().ag();
            object = ((fmb)object).e;
            ((gic)object).c().ai();
            ((gic)object).c().ak();
            ((gic)object).b.d(aaz.ON_RESUME);
            ((gic)object).c().af();
            return view;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onDestroy() {
        gpf gpf2 = this.c.e();
        try {
            super.onDestroy();
            Object object = this.a();
            ((heg)((heg)fmb.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onDestroy", 177, "VoiceInputMethodServiceImpl.java")).r("#onDestroy");
            bpr bpr2 = new bpr(20);
            object = ((bzb)object).a;
            ((fmb)object).d.b(bpr2);
            ((fmb)object).a();
            ((fmb)object).c.f();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onFinishInput() {
        gpf gpf2 = this.c.d("onFinishInput");
        try {
            super.onFinishInput();
            this.a();
            ((heg)((heg)fmb.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onFinishInput", 166, "VoiceInputMethodServiceImpl.java")).r("#onFinishInput");
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onFinishInputView(boolean bl2) {
        gpf gpf2;
        block6: {
            gpf2 = this.c.d("onFinishInputView");
            super.onFinishInputView(bl2);
            Object object = this.a().a;
            ((heg)((heg)fmb.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onFinishInputView", 170, "VoiceInputMethodServiceImpl.java")).r("#onFinishInputView");
            ((fmb)object).c.f();
            Object object2 = ((fmb)object).f;
            object = ((AtomicReference)((gpm)object2).a).getAndSet(null);
            if (object == null) break block6;
            flg flg2 = new flg(0);
            if (!((fli)DesugarAtomicReference.updateAndGet((AtomicReference)((flh)object).b, flg2)).a()) break block6;
            object2 = ((gpm)object2).c;
            object = ((flh)object).a;
            object2.a(dxv.w.b("inputViewSessionId", (String)object).j());
        }
        return;
        finally {
            gpf2.close();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStartInputView(EditorInfo var1_1, boolean var2_5) {
        block23: {
            var6_6 = this.c.d("onStartInputView");
            super.onStartInputView((EditorInfo)var1_1, var2_5);
            var5_7 = this.a();
            var7_9 = (heg)fmb.a.f();
            try {
                block25: {
                    block31: {
                        block29: {
                            block30: {
                                block27: {
                                    block28: {
                                        ((heg)var7_9.j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onStartInputView", 81, "VoiceInputMethodServiceImpl.java")).u("#onStartInputView %b", var2_5);
                                        var7_9 = var5_7.a;
                                        var5_7 = (PowerManager)((fmb)var7_9).b.getSystemService("power");
                                        if (var5_7 == null || !var5_7.isScreenOn()) break block27;
                                        var8_10 = ((fmb)var7_9).f;
                                        var5_7 = new flh(var8_10);
                                        if (a.i((AtomicReference)var8_10.a, var5_7)) {
                                            var8_11 = var8_10.c;
                                            var5_7 = var5_7.a;
                                            var8_11.a(dxv.v.b("inputViewSessionId", (String)var5_7));
                                        }
                                        ((heg)((heg)flc.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/ImeUtils", "isVoiceInputSupported", 239, "ImeUtils.java")).r("#isDictationSupportedByField");
                                        var3_21 = var1_1.inputType & 4095;
                                        if (var3_21 == 129 || var3_21 == 225 || var3_21 == 18) break block28;
                                        if (var1_1.privateImeOptions == null) break block29;
                                        var5_7 = var1_1.privateImeOptions.split(",", -1);
                                        var4_22 = ((String[])var5_7).length;
                                        break block30;
                                    }
                                    ((heg)((heg)flc.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/ImeUtils", "isVoiceInputSupported", 252, "ImeUtils.java")).r("Voice IME is not supported for password input type");
                                    break block25;
                                }
                                ((fmb)var7_9).c.f();
                                ((fmb)var7_9).d.a();
lbl30:
                                // 4 sources

                                while (true) {
                                    var6_6.close();
                                    return;
                                }
                                catch (Throwable var1_3) {
                                    // empty catch block
                                }
                                break block23;
                            }
                            for (var3_21 = 0; var3_21 < var4_22; ++var3_21) {
                                block24: {
                                    var8_14 = var5_7[var3_21];
                                    if (var8_14.equals("noMicrophoneKey") || var8_14.equals("nm")) break block24;
                                    continue;
                                }
                                ((heg)((heg)flc.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/ImeUtils", "isVoiceInputSupported", 261, "ImeUtils.java")).r("Voice IME has been disabled for this field");
                                break block25;
                            }
                        }
                        var8_15 = ((fmb)var7_9).b.getCurrentInputConnection();
                        var9_23 /* !! */  = ((fmb)var7_9).b.getCurrentInputBinding();
                        if (var8_15 == null || var9_23 /* !! */  == null) break block31;
                        if (var2_5) {
                            ((fmb)var7_9).c.i(var8_15, (EditorInfo)var1_1, var9_23 /* !! */ .getUid());
                        }
                        if (((fmb)var7_9).e != null) {
                            block26: {
                                var5_7 = ((fmb)var7_9).c;
                                var3_21 = var9_23 /* !! */ .getUid();
                                ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "startOrContinue", 110, "VoiceInputMethodManager.java")).r("#startOrContinue");
                                var9_23 /* !! */  = new ExtractedTextRequest();
                                var9_23 /* !! */  = var8_15.getExtractedText((ExtractedTextRequest)var9_23 /* !! */ , 0);
                                if (a.k(var8_15, var5_7.h) && a.k(var1_1, var5_7.i) && a.k(var3_21, var5_7.j) && var5_7.k != null) {
                                    ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "startOrContinue", 118, "VoiceInputMethodManager.java")).r("continuing");
                                    if (var9_23 /* !! */  == null || TextUtils.isEmpty((CharSequence)var9_23 /* !! */ .text)) {
                                        ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "startOrContinue", 125, "VoiceInputMethodManager.java")).r("continuing with empty text");
                                        var5_7.e.clear();
                                        var5_7.f = var1_1 = new fly(0, 0);
                                        var5_7.g();
                                    }
                                    var1_1 = var5_7.k;
                                } else {
                                    var5_7.i(var8_15, (EditorInfo)var1_1, var3_21);
                                    if (var5_7.f == null) {
                                        ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "startOrContinue", 135, "VoiceInputMethodManager.java")).v("initial selection %d %d", var1_1.initialSelStart, var1_1.initialSelEnd);
                                        var5_7.f = var1_1.initialSelStart != -1 && var1_1.initialSelEnd != -1 ? (var8_16 = new fly(var1_1.initialSelStart, var1_1.initialSelEnd)) : (var9_23 /* !! */  == null ? (var8_17 = new fly(0, 0)) : (var8_18 = new fly(var9_23 /* !! */ .selectionStart, var9_23 /* !! */ .selectionEnd)));
                                    }
                                    if (var5_7.g == null) {
                                        var5_7.g();
                                    }
                                    Integer.valueOf(var3_21).getClass();
                                    var1_1 = var5_7.a((EditorInfo)var1_1, var3_21);
                                }
                                var8_20 = fmf.a.l();
                                if (!var8_20.b.B()) {
                                    var8_20.u();
                                }
                                var5_7 = (fmf)var8_20.b;
                                var1_1.getClass();
                                var5_7.c = var1_1;
                                var5_7.b |= 1;
                                var9_23 /* !! */  = ((fmb)var7_9).b.getClass().getName();
                                var1_1 = ((fmb)var7_9).d;
                                ((heg)((heg)fld.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "getSettingsActivity", 64, "InputMethodManagerWrapper.java")).u("Looking for input method service: %s", var9_23 /* !! */ );
                                var10_24 = var1_1.b;
                                var1_1 = var5_7 = null;
                                if (var10_24 != null) {
                                    var10_24 = var10_24.getEnabledInputMethodList().iterator();
                                    do {
                                        var1_1 = var5_7;
                                        if (!var10_24.hasNext()) break block26;
                                        var1_1 = (InputMethodInfo)var10_24.next();
                                        ((heg)((heg)fld.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "getSettingsActivity", 68, "InputMethodManagerWrapper.java")).C("Current service: %s, settings: %s", var1_1.getServiceName(), var1_1.getSettingsActivity());
                                    } while (!var1_1.getServiceName().equals(var9_23 /* !! */ ));
                                    var1_1 = var1_1.getSettingsActivity();
                                }
                            }
                            if (var1_1 != null) {
                                if (!var8_20.b.B()) {
                                    var8_20.u();
                                }
                                var5_7 = (fmf)var8_20.b;
                                var5_7.b |= 2;
                                var5_7.d = var1_1;
                            }
                            var1_1 = fls.e((fmf)var8_20.o());
                            var5_7 = ((fmb)var7_9).e.b();
                            var7_9 = new y((by)var5_7);
                            var7_9.r(2131427962, (be)var1_1);
                            var7_9.b();
                        }
                        ** GOTO lbl30
                    }
                    ((heg)((heg)fmb.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onStartInputView", 110, "VoiceInputMethodServiceImpl.java")).r("input connection is not ready");
                    ** GOTO lbl30
                }
                ((heg)((heg)fmb.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onStartInputView", 96, "VoiceInputMethodServiceImpl.java")).r("Voice IME cannot be started for this field");
                Toast.makeText((Context)((fmb)var7_9).b, (int)2132017478, (int)1).show();
                ((fmb)var7_9).d.a();
                ** continue;
            }
            catch (Throwable var1_2) {}
        }
        try {
            var6_6.close();
            throw var1_4;
        }
        catch (Throwable var5_8) {
            var1_4.addSuppressed(var5_8);
        }
        throw var1_4;
    }

    public final void onUpdateSelection(int n2, int n3, int n4, int n5, int n6, int n7) {
        gpf gpf2;
        block7: {
            gpf2 = this.c.d("onUpdateSelection");
            super.onUpdateSelection(n2, n3, n4, n5, n6, n7);
            Object object = this.a();
            ((heg)((heg)fmb.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl", "onUpdateSelection", 148, "VoiceInputMethodServiceImpl.java")).J("#onUpdateSelection %d %d %d %d %d %d", n2, n3, n4, n5, n6, n7);
            if (n2 == n4 && n3 == n5) break block7;
            Object object2 = ((bzb)object).a;
            ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "reportNewSelection", 238, "VoiceInputMethodManager.java")).v("#reportNewSelection %d %d", n4, n5);
            object = new fly(n4, n5);
            object2 = ((fmb)object2).c;
            ((fma)object2).f = object;
            if (((fly)object).equals(((fma)object2).e.peekFirst())) {
                ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "reportNewSelection", 242, "VoiceInputMethodManager.java")).r("IME did selection");
                ((fma)object2).e.remove();
                break block7;
            }
            ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "reportNewSelection", 246, "VoiceInputMethodManager.java")).r("User did selection");
            ((fma)object2).e.clear();
            ((fma)object2).c.a(((fma)object2).k);
            ((fma)object2).g();
        }
        return;
        finally {
            gpf2.close();
        }
    }
}

