/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.inputmethod.EditorInfo
 */
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.speech.transcription.voiceime.permissions.PermissionsActivity;

public final class flv
implements View.OnClickListener {
    public final flw a;

    public /* synthetic */ flv(flw flw2) {
        this.a = flw2;
    }

    public final void onClick(View object) {
        Object object2;
        ((heg)((heg)fma.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "restart", 166, "VoiceInputMethodManager.java")).r("#restart");
        flw flw2 = this.a;
        Object object3 = flw2.a.e;
        int n2 = ye.e(((fma)object3).d, "android.permission.RECORD_AUDIO");
        Object object4 = null;
        if (n2 == -1) {
            ((heg)((heg)fma.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodManager", "restart", 169, "VoiceInputMethodManager.java")).r("Requesting RECORD_AUDIO permission before starting");
            object = ((fma)object3).d;
            object2 = new Intent((Context)object, PermissionsActivity.class);
            object2.addFlags(0x10800000);
            object.startActivity((Intent)object2);
            object = object4;
        } else {
            ((fma)object3).c.b(((fma)object3).k);
            ((fma)object3).k = null;
            EditorInfo editorInfo = ((fma)object3).i;
            object = object4;
            if (editorInfo != null) {
                object2 = ((fma)object3).j;
                object = object4;
                if (object2 != null) {
                    object = ((fma)object3).a(editorInfo, (Integer)object2);
                }
            }
        }
        if (object != null) {
            object4 = fmf.a.l();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object2 = ((hwp)object4).b;
            object3 = (fmf)object2;
            ((fmf)object3).c = object;
            ((fmf)object3).b |= 1;
            object = flw2.a;
            if (!((hwv)object2).B()) {
                ((hwp)object4).u();
            }
            object = ((flx)object).d;
            object2 = (fmf)((hwp)object4).b;
            object.getClass();
            ((fmf)object2).b |= 2;
            ((fmf)object2).d = object;
            object = fls.e((fmf)((hwp)object4).o());
            object4 = new y(flw2.a.b.getParentFragmentManager());
            ((ce)object4).r(2131427962, (be)object);
            ((ce)object4).b();
        }
    }
}

