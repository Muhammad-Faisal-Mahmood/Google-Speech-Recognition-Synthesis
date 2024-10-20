/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.SpannedString
 *  android.view.View$OnClickListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.speech.transcription.ui.DrawSoundLevelsView;
import j$.util.Objects;

final class fku
implements geg {
    final fkv a;
    private final TextView b;
    private final TextView c;
    private final Button d;
    private final fkp e;
    private fhd f;
    private boolean g;
    private final gfl h;

    public fku(fkv fkv2, TextView textView, TextView textView2, gfl gfl2, Button button) {
        this.a = fkv2;
        this.f = fhd.a().a();
        this.g = false;
        this.b = textView;
        this.c = textView2;
        this.h = gfl2;
        this.d = button;
        this.e = new fkp(textView2.getContext(), textView2.getPaint());
    }

    @Override
    public final void a(Throwable throwable) {
        a.as(fkv.a.h(), "#onError", "com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer$TranscriptionStateSubscriptionCallbacks", "onError", '\u00f7', "TranscriptionFragmentPeer.java", throwable);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Object object2;
        object = (fhd)object;
        Object object3 = ((fhd)object).a;
        if (object3 != null && !((String)object3).equals(this.f.a)) {
            this.b.setText((CharSequence)((fhd)object).a);
        }
        if (!Objects.equals(((fhd)object).f, this.f.f) && (object3 = ((fhd)object).f) != null) {
            this.h.d();
            gfl gfl2 = this.h;
            fkv fkv2 = this.a;
            object2 = new fkt(this);
            gfl2.b(new gpg(fkv2.c, "Clicked 'mic image' to restart", (View.OnClickListener)object2, 0), fkv2.b.getString(2132017475));
            this.d.setVisibility(0);
            this.d.setEnabled(true);
            object2 = this.c;
            fkv2 = this.a.b;
            object2.setText((CharSequence)fde.d((Context)fkv2, (fdr)object3, ffi.k(fkv2.getIntent())));
            this.c.setImportantForAccessibility(1);
            this.c.sendAccessibilityEvent(128);
        }
        if (((fhd)object).f == null) {
            int n2;
            if (!Objects.equals(((fhd)object).b, this.f.b) || ((fhd)object).d != this.f.d) {
                object3 = new fhc(this.f);
                ((fhc)object3).b = ((fhd)object).b;
                this.f = ((fhc)object3).a();
                object3 = ((fhd)object).b;
                if (!(object3 == null || ((fgd)object3).c.isEmpty() && ((fgd)object3).d.isEmpty())) {
                    object2 = this.c;
                    object3 = wj.a;
                    if (object2.isLaidOut()) {
                        this.d();
                    } else if (!this.g) {
                        this.g = true;
                        this.c.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new fks(this));
                    }
                } else if (((fhd)object).d) {
                    this.c.setText(2132017468);
                }
            }
            if ((n2 = ((fhd)object).g) != this.f.g) {
                this.h.c(n2);
            }
            if (!(Objects.equals(((fhd)object).e, this.f.e) && Objects.equals(((fhd)object).c, this.f.c) && Objects.equals(((fhd)object).h, this.f.h))) {
                if (((fhd)object).c != null && ((fhd)object).h != null) {
                    object3 = this.h;
                    ((ProgressBar)((gfl)object3).h).setVisibility(4);
                    object2 = (Drawable)((gfl)object3).e;
                    ((ImageView)((gfl)object3).f).setImageDrawable((Drawable)object2);
                    ((ImageView)((gfl)object3).g).setBackgroundResource(2131231161);
                    ((DrawSoundLevelsView)((Object)((gfl)object3).b)).setEnabled(false);
                    this.h.b(null, null);
                    this.a.a(((fhd)object).c, ((fhd)object).h);
                } else if (Objects.equals(((fhd)object).e, false)) {
                    object2 = this.h;
                    ((ProgressBar)((gfl)object2).h).setVisibility(0);
                    object3 = (Drawable)((gfl)object2).d;
                    ((ImageView)((gfl)object2).f).setImageDrawable((Drawable)object3);
                    ((ImageView)((gfl)object2).g).setBackgroundResource(2131231162);
                    ((DrawSoundLevelsView)((Object)((gfl)object2).b)).setEnabled(false);
                } else if (Objects.equals(((fhd)object).e, true)) {
                    this.h.f();
                }
            }
        }
        this.f = object;
    }

    @Override
    public final /* synthetic */ void c() {
    }

    public final void d() {
        Object object = this.f.b;
        ((heg)((heg)fkv.a.f()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer$TranscriptionStateSubscriptionCallbacks", "setLatestRecognizedText", 220, "TranscriptionFragmentPeer.java")).C("#setLatestRecognizedText stableText: %s, pendingText: %s", ((fgd)object).c, ((fgd)object).d);
        Object object2 = this.c;
        int n2 = object2.getWidth() - object2.getPaddingLeft() - object2.getPaddingRight();
        object2 = this.e;
        int n3 = ((fkp)object2).e;
        int n4 = 0;
        if (n3 != n2) {
            ((fkp)object2).d = 0;
            ((fkp)object2).e = n2;
        }
        String string = ((fgd)object).c;
        object = ((fgd)object).d;
        string = String.valueOf(string);
        String string2 = String.valueOf(object);
        n3 = ((fkp)object2).d;
        string = string.concat(string2);
        n2 = n3;
        if (n3 > string.length()) {
            ((fkp)object2).d = 0;
            n2 = 0;
        }
        if (((fkp)object2).a(string.substring(n2)).getLineCount() > 2) {
            ((fkp)object2).b.setText(string);
            while (((fkp)object2).a("\u2026".concat(String.valueOf(string.substring(((fkp)object2).d).trim()))).getLineCount() > 2 && (n2 = ((fkp)object2).b.following(((fkp)object2).d)) != -1) {
                ((fkp)object2).d = n2;
            }
        }
        ((fkp)object2).a.clear();
        ((fkp)object2).a.clearSpans();
        if (((fkp)object2).d > 0) {
            ((fkp)object2).a.append((CharSequence)"\u2026");
        }
        ((fkp)object2).a.append((CharSequence)string.substring(((fkp)object2).d).trim());
        n2 = n4;
        if (((String)object).length() < ((fkp)object2).a.length()) {
            n2 = ((fkp)object2).a.length() - ((String)object).length();
        }
        if (n2 != ((fkp)object2).a.length()) {
            object = ((fkp)object2).a;
            object.setSpan((Object)((fkp)object2).c, n2, object.length(), 33);
        }
        this.c.setText((CharSequence)new SpannedString((CharSequence)this.e.a));
    }
}

