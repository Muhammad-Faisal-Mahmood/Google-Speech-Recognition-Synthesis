/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class buw
implements DialogInterface.OnClickListener {
    private final int a;

    public /* synthetic */ buw(int n2) {
        this.a = n2;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        if (this.a != 0) {
            return;
        }
        ((heg)((heg)MultipleVoicesActivity.k.c()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity", "showUninstallWarning", 379, "MultipleVoicesActivity.java")).r("Canceled delete.");
    }
}

