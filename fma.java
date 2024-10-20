/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.ExtractedText
 *  android.view.inputmethod.ExtractedTextRequest
 *  android.view.inputmethod.InputConnection
 */
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fma {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager");
    public final hpr b;
    public final flr c;
    public final Context d;
    public final Deque e = new ArrayDeque();
    public fly f;
    public fly g;
    public InputConnection h;
    public EditorInfo i;
    public Integer j;
    public fdl k;
    public String l;

    public fma(hpr hpr2, flr flr2, Context context) {
        this.b = hpr2;
        this.c = flr2;
        this.d = context;
    }

    public static void d() {
        boolean bl2 = Looper.getMainLooper().getThread() == Thread.currentThread();
        fxf.A(bl2);
    }

    private final void k(int n2, int n3) {
        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "setComposingRegion", 301, "VoiceInputMethodManager.java")).v("#setComposingRegion(%d, %d)", n2, n3);
        this.g = new fly(n2, n3);
        this.h.setComposingRegion(n2, n3);
    }

    public final fdl a(EditorInfo object, int n2) {
        Object object2;
        Object object3 = this.d.getPackageManager().getNameForUid(n2);
        String string = object3;
        if (object3 == null) {
            string = fxf.O(object.packageName);
        }
        object3 = this.c;
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = new AmbientModeSupport$AmbientController(this, null);
        if (ag$$ExternalSyntheticApiModelOutline1.m(object) == null) {
            n2 = gzx.d;
            object = hct.a;
        } else {
            object2 = new gzs();
            for (n2 = 0; n2 < ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(object)); ++n2) {
                ((gzs)object2).h(ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(object), n2));
            }
            object = ((gzs)object2).g();
        }
        ((heg)((heg)flr.b.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "startListening", 128, "VoiceInputMethodDataService.java")).r("#startListening");
        object2 = ((flr)object3).i;
        object2 = ((flr)object3).m.a;
        fdl fdl2 = fhq.k();
        fxf.al(((frr)object2).a(), new flm((flr)object3, ambientModeSupport$AmbientController, fdl2, string, (List)object), ((flr)object3).c);
        this.k = fdl2;
        this.l = "";
        return fdl2;
    }

    public final fly b() {
        if (this.e.isEmpty()) {
            return this.f;
        }
        return (fly)this.e.peekLast();
    }

    public final hpn c() {
        if (this.j()) {
            cqg cqg2 = new cqg(this, 20);
            hpr hpr2 = this.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return hhk.M(gqk.c(cqg2), 200L, timeUnit, hpr2);
        }
        return hpj.a;
    }

    public final void e() {
        Object object = this.k;
        if (object != null) {
            flr flr2 = this.c;
            ((heg)((heg)flr.b.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "closeMicrophone", 333, "VoiceInputMethodDataService.java")).r("#closeMicrophone");
            object = (hth)flr2.d.get(((fdl)object).c);
            if (object != null) {
                ((ffv)((hth)object).a).c();
            }
        }
    }

    public final void f() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "finish", 190, "VoiceInputMethodManager.java")).r("#finish");
        this.c.b(this.k);
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.l = null;
    }

    public final void g() {
        int n2;
        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "setComposingRegionAroundSelection", 261, "VoiceInputMethodManager.java")).r("#setComposingRegionAroundSelection");
        Object object = this.h;
        if (object == null) {
            return;
        }
        ExtractedText extractedText = object.getExtractedText(new ExtractedTextRequest(), 0);
        if (extractedText != null && !TextUtils.isEmpty((CharSequence)extractedText.text)) {
            n2 = extractedText.selectionStart;
            int n3 = extractedText.selectionEnd;
            int n4 = extractedText.text.length();
            object = flc.a;
            if (n2 >= 0 && n2 <= n4 && n3 >= 0 && n3 <= n4) {
                int n5 = Math.min(extractedText.selectionStart, extractedText.selectionEnd);
                n3 = Math.max(extractedText.selectionStart, extractedText.selectionEnd);
                object = extractedText.text;
                n4 = flc.a(object.subSequence(0, n5), false);
                n2 = flc.d(object.subSequence(n3, object.length()));
                if (n4 > 0 && n2 > 0 || n5 != n3) {
                    this.k(n5 - n4, n3 + n2);
                    return;
                }
                this.k(n3, n3);
                return;
            }
        }
        if ((object = this.f) != null) {
            n2 = ((fly)object).b;
            this.k(((fly)object).a, n2);
            return;
        }
        this.k(0, 0);
    }

    public final void h(String charSequence) {
        block5: {
            Object object;
            int n2;
            Object object2;
            hei hei2;
            block9: {
                String string;
                block6: {
                    int n3;
                    boolean bl2;
                    block7: {
                        block8: {
                            hei2 = a;
                            ((heg)((heg)hei2.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "setComposingText", 354, "VoiceInputMethodManager.java")).s("#setComposingText len = %d", charSequence.length());
                            fma.d();
                            if (this.h == null || charSequence.equals(this.l)) break block5;
                            this.l = charSequence;
                            object2 = this.g;
                            string = charSequence.trim();
                            charSequence = this.h.getExtractedText(new ExtractedTextRequest(), 0);
                            if (charSequence == null || ((ExtractedText)charSequence).text == null) break block6;
                            n2 = ((fly)object2).b - ((ExtractedText)charSequence).startOffset;
                            bl2 = n2 >= 0 && n2 < ((ExtractedText)charSequence).text.length() && !Character.isWhitespace(((ExtractedText)charSequence).text.charAt(n2)) && !flc.c(String.valueOf(((ExtractedText)charSequence).text.charAt(n2)));
                            n2 = ((fly)object2).a - 1 - ((ExtractedText)charSequence).startOffset;
                            n2 = n2 >= 0 && n2 < ((ExtractedText)charSequence).text.length() && !Character.isWhitespace(((ExtractedText)charSequence).text.charAt(n2)) ? 1 : 0;
                            n3 = n2;
                            if (string.length() <= 0) break block7;
                            if (flc.c(String.valueOf(string.charAt(0)))) break block8;
                            n3 = n2;
                            if (!Character.isWhitespace(string.charAt(0))) break block7;
                        }
                        n3 = 0;
                    }
                    n2 = ((fly)object2).a - ((ExtractedText)charSequence).startOffset;
                    object = "";
                    charSequence = n2 > 0 && n2 <= ((ExtractedText)charSequence).text.length() ? ((ExtractedText)charSequence).text.subSequence(0, n2) : "";
                    object2 = charSequence;
                    if (n3 != 0) {
                        object2 = String.valueOf(String.valueOf(charSequence)).concat(" ");
                    }
                    string = flc.b(string, (CharSequence)object2, this.i.inputType);
                    charSequence = true != bl2 ? "" : " ";
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = 1 != n3 ? object : " ";
                    stringBuilder.append((String)object2);
                    stringBuilder.append(string);
                    stringBuilder.append((String)charSequence);
                    charSequence = stringBuilder.toString();
                    break block9;
                }
                charSequence = flc.b(string, null, this.i.inputType);
            }
            object2 = this.g;
            object = new fly(((fly)object2).a + charSequence.length(), ((fly)object2).a + charSequence.length());
            if (!((fly)object).equals(this.b())) {
                ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "setAndUpdateComposingText", 311, "VoiceInputMethodManager.java")).v("#pendingUpdates.add %d %d", ((fly)object).a, ((fly)object).b);
                this.e.add(object);
            }
            n2 = ((fly)object2).a;
            this.g = new fly(n2, charSequence.length() + n2);
            this.h.setComposingText(charSequence, 1);
        }
    }

    public final void i(InputConnection inputConnection, EditorInfo editorInfo, int n2) {
        this.h = inputConnection;
        this.i = editorInfo;
        this.j = n2;
    }

    public final boolean j() {
        if (this.h == null) {
            return false;
        }
        this.c.a(this.k);
        this.h.finishComposingText();
        Object object = this.h.getExtractedText(new ExtractedTextRequest(), 0);
        if (object != null && !TextUtils.isEmpty((CharSequence)((ExtractedText)object).text)) {
            int n2;
            int n3 = Math.min(((ExtractedText)object).selectionStart, ((ExtractedText)object).selectionEnd);
            if (n3 != (n2 = Math.max(((ExtractedText)object).selectionStart, ((ExtractedText)object).selectionEnd))) {
                this.h.setSelection(n3, n3);
                this.h.deleteSurroundingText(0, n2 - n3);
            } else {
                InputConnection inputConnection = this.h;
                object = ((ExtractedText)object).text;
                hei hei2 = a;
                ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "deleteLastText", 330, "VoiceInputMethodManager.java")).r("#deleteLastText");
                if (n3 >= 0 && n3 <= object.length()) {
                    n2 = flc.a(object.subSequence(0, n3), true);
                    if (n2 > 0) {
                        ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "deleteLastText", 341, "VoiceInputMethodManager.java")).r("Deleting the last word.");
                        inputConnection.deleteSurroundingText(n2, Math.max(0, flc.d(object.subSequence(n3 - 1, object.length())) - 1));
                    } else {
                        ((heg)((heg)hei2.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "deleteLastText", 347, "VoiceInputMethodManager.java")).r("Deleting the last char.");
                        inputConnection.deleteSurroundingText(1, 0);
                    }
                } else {
                    ((heg)((heg)hei2.g()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "deleteLastText", 332, "VoiceInputMethodManager.java")).r("#deleteLastText cursor position out of text range. Should not happen");
                }
            }
            return true;
        }
        return false;
    }
}

