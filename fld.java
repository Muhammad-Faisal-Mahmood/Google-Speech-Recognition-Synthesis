/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.view.inputmethod.InputMethodManager
 */
import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;

public final class fld {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper");
    public final InputMethodManager b;
    public gui c = new bpr(19);

    public fld(Context context) {
        this.b = (InputMethodManager)context.getSystemService("input_method");
    }

    public final void a() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "switchToLastInputMethod", 43, "InputMethodManagerWrapper.java")).r("#switchToLastInputMethod");
        gto gto2 = (gto)this.c.a();
        InputMethodManager inputMethodManager = this.b;
        if (inputMethodManager != null && gto2 != null && gto2.g()) {
            try {
                inputMethodManager.switchToLastInputMethod((IBinder)gto2.c());
                return;
            }
            catch (NullPointerException nullPointerException) {
                a.as(a.h(), "Expected exception from framework.", "com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "switchToLastInputMethod", '2', "InputMethodManagerWrapper.java", nullPointerException);
            }
        }
    }

    public final void b(gui gui2) {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "updateTokenSupplier", 38, "InputMethodManagerWrapper.java")).r("#updateService");
        this.c = gui2;
    }
}

