/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.apps.speech.tts.googletts.dispatch;

import java.util.Locale;

public final class LanguageRegistry {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/dispatch/LanguageRegistry");
    private final ibd b;
    private long c;
    private final bwp d;

    public LanguageRegistry(ibd ibd2, bwp bwp2) {
        this.b = ibd2;
        this.d = bwp2;
    }

    private native String nativeGetRedirectForLanguage(long var1, String var3);

    private native void nativeRegistryDelete(long var1);

    private native long nativeRegistryInit(byte[] var1);

    public final Locale a(Locale object) {
        long l2;
        this.d.a();
        long l3 = l2 = this.c;
        if (l2 == 0L) {
            this.c = l3 = this.nativeRegistryInit(this.b.g());
        }
        if (l3 == 0L) {
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/dispatch/LanguageRegistry", "getRedirectForLocale", 70, "LanguageRegistry.java")).r("Native redirects not available.");
            return null;
        }
        if (object != null) {
            object = ((Locale)object).toLanguageTag();
            if (!fxf.P((String)(object = this.nativeGetRedirectForLanguage(this.c, (String)object)))) {
                return Locale.forLanguageTag((String)object);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void finalize() {
        synchronized (this) {
            long l2 = this.c;
            if (l2 != 0L) {
                this.nativeRegistryDelete(l2);
                this.c = 0L;
            }
            return;
        }
    }
}

