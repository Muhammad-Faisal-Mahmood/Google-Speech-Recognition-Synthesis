/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  gqv
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;
import java.util.HashMap;

public final class bux
implements View.OnClickListener {
    public final Object a;
    private final int b;

    public /* synthetic */ bux(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onClick(View object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                object = (flx)this.a;
                                Object object2 = ((flx)object).d;
                                if (object2 != null && !((String)object2).isEmpty()) {
                                    Context context = ((flx)object).h;
                                    object2 = ((flx)object).d;
                                    context = new ComponentName(context.getPackageName(), (String)object2);
                                    object2 = ((flx)object).b;
                                    context = new Intent(new Intent("android.intent.action.MAIN").setComponent((ComponentName)context).setFlags(0x18000000));
                                    object = gqk.a((Intent)context, gqv.a);
                                    try {
                                        ((be)object2).startActivity((Intent)context);
                                        return;
                                    }
                                    finally {
                                        ((gqe)object).close();
                                    }
                                }
                                ((heg)((heg)flx.a.g()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer", "onCreateView", 129, "VoiceInputMethodFragmentPeer.java")).r("Settings activity is not specified");
                                return;
                            }
                            ((flx)this.a).i.a();
                            return;
                        }
                        ((fkv)this.a).b();
                        return;
                    }
                    Object object3 = (fkv)this.a;
                    object = ((fkv)object3).f.a;
                    object3 = ((fkv)object3).d.c;
                    if ((object = (fha)((HashMap)object).get(object3)) != null && (object3 = ((fha)object).g) != null) {
                        ((fha)object).d("stop listening", fxf.aC(new hpn[]{object3}).B(new fgm(object, 5), ((fha)object).c));
                    }
                    return;
                }
                object = (MultipleVoicesActivity)this.a;
                ((MultipleVoicesActivity)object).D((buc)((MultipleVoicesActivity)object).m.c);
                return;
            }
            Object object4 = this.a;
            object = (MultipleVoicesActivity)object4;
            izk izk2 = ((MultipleVoicesActivity)object).m;
            ((MultipleVoicesActivity)object).I((Context)object4, izk2);
            return;
        }
        object = (MultipleVoicesActivity)this.a;
        ((MultipleVoicesActivity)object).H(((MultipleVoicesActivity)object).m);
    }
}

