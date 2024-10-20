/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class buv
implements DialogInterface.OnClickListener {
    public final MultipleVoicesActivity a;
    public final izk b;

    public /* synthetic */ buv(MultipleVoicesActivity multipleVoicesActivity, izk izk2) {
        this.a = multipleVoicesActivity;
        this.b = izk2;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        this.a.H(this.b);
    }
}

