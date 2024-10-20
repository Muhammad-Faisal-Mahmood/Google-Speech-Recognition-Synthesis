/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import java.util.concurrent.Executor;
import java.util.function.LongUnaryOperator;

final class flw
implements geg {
    final flx a;
    private final TextView b;
    private final TextView c;
    private fhd d;
    private final gfl e;

    public flw(flx flx2, TextView textView, gfl gfl2, TextView textView2) {
        this.a = flx2;
        this.d = fhd.a().a();
        this.b = textView;
        this.e = gfl2;
        this.c = textView2;
    }

    private final void d(View.OnClickListener onClickListener, String string) {
        this.b.setOnClickListener(onClickListener);
        this.e.b(onClickListener, string);
        this.c.setOnClickListener(onClickListener);
    }

    private final void e() {
        flv flv2 = new flv(this);
        flx flx2 = this.a;
        this.d(new gpg(flx2.g, "Clicked 'mic image' to start listening", flv2, 0), flx2.b.getString(2132017486));
        this.b.setText(2132017486);
    }

    @Override
    public final void a(Throwable throwable) {
        ((heg)((heg)((heg)flx.a.h()).i(throwable)).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer$VoiceInputMethodCallbacks", "onError", 268, "VoiceInputMethodFragmentPeer.java")).u("#onError, request-id = %s", this.a.c.c);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        boolean bl2;
        int n2;
        Object object2;
        object = (fhd)object;
        ((heg)((heg)flx.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer$VoiceInputMethodCallbacks", "onNewData", 166, "VoiceInputMethodFragmentPeer.java")).u("#onNewData, request-id = %s", this.a.c.c);
        ((heg)((heg)flx.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer$VoiceInputMethodCallbacks", "onNewData", 167, "VoiceInputMethodFragmentPeer.java")).u("#onNewData %s", object);
        Object object3 = this.d;
        if (((fhd)object3).f != null) {
            return;
        }
        Object object4 = ((fhd)object).f;
        if (object4 != null) {
            ((heg)((heg)flx.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer$VoiceInputMethodCallbacks", "onNewData", 175, "VoiceInputMethodFragmentPeer.java")).u("Showing error %s", object4);
            this.c.setText((CharSequence)fde.d(this.a.h, (fdr)object4, false));
            int n3 = ((fdr)object4).b;
            if (n3 != 2 && n3 != 8) {
                this.e.d();
                this.c.setImportantForAccessibility(1);
                this.c.sendAccessibilityEvent(128);
            } else {
                this.e.e();
            }
            this.e();
            this.d = object;
            return;
        }
        if (((fhd)object).i && !((fhd)object3).i) {
            object4 = this.a.f;
            object3 = ((flr)object4).k;
            object4 = Duration.ofMillis(cgw.p().toEpochMilli() - ((flr)object4).e.get());
            ((heg)((heg)flr.b.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "shouldShowAudioRationaleToast", 292, "VoiceInputMethodDataService.java")).u("%s since the last time audio toast was shown", object4);
            if (flr.a.compareTo((Duration)object4) < 0) {
                Toast.makeText((Context)this.a.h, (int)2132017477, (int)1).show();
                object4 = this.a;
                object3 = ((flx)object4).c.c;
                object3 = new flk();
                object4 = ((flx)object4).f;
                object2 = new fll(DesugarAtomicLong.updateAndGet(((flr)object4).e, (LongUnaryOperator)object3), 0);
                object3 = ((flr)object4).c;
                ((flr)object4).g.b((gte)object2, (Executor)object3);
            }
        }
        if ((n2 = ((fhd)object).g) != this.d.g) {
            this.e.c(n2);
        }
        if (!Objects.equals(((fhd)object).e, this.d.e)) {
            if (Objects.equals(((fhd)object).e, false)) {
                this.e.e();
                this.e();
            } else if (Objects.equals(((fhd)object).e, true)) {
                this.e.f();
                object4 = this.e;
                object2 = this.a;
                object3 = new flt(this);
                ((gfl)object4).b(new gpg(((flx)object2).g, "Clicked 'mic image' to stop listening", (View.OnClickListener)object3, 0), ((flx)object2).b.getString(2132017485));
                this.b.setText(2132017473);
            }
        }
        if ((bl2 = ((fhd)object).d) != this.d.d && bl2 && Objects.equals(((fhd)object).e, true)) {
            this.b.setText(2132017485);
            object3 = this.a;
            object4 = new flu(this);
            this.d(new gpg(((flx)object3).g, "Clicked 'Tap to pause' to stop listening", (View.OnClickListener)object4, 0), ((flx)object3).b.getString(2132017485));
        }
        this.d = object;
    }

    @Override
    public final /* synthetic */ void c() {
    }
}

