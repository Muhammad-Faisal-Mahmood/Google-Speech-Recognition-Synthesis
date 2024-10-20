/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.inputmethodservice.InputMethodService
 *  android.view.View
 */
import android.inputmethodservice.InputMethodService;
import android.view.View;

public final class fmb {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodServiceImpl");
    public final InputMethodService b;
    public final fma c;
    public final fld d;
    public gic e;
    public final gpm f;

    public fmb(InputMethodService inputMethodService, fma fma2, fld fld2, gpm gpm2) {
        this.b = inputMethodService;
        this.c = fma2;
        this.d = fld2;
        this.f = gpm2;
    }

    public final void a() {
        Object object = this.e;
        if (object != null) {
            ((gic)object).c().ae();
            ((gic)object).b.d(aaz.ON_PAUSE);
            object = this.e;
            ((gic)object).c().ah();
            ((gic)object).b.d(aaz.ON_STOP);
            gic gic2 = this.e;
            View view = gic2.f.getDecorView();
            jse.e(view, "<this>");
            object = wl.c;
            object = view == null ? jth.a : new jtk(new jtp(view, 0), (jrk)object, 0);
            object = new jti(new jtk(new jtk((jtl)object, (jrk)wl.d, 2), (jrk)ero.p, 1));
            object = !object.hasNext() ? null : object.next();
            if ((abe)object == gic2) {
                we.f(gic2.f.getDecorView(), null);
                wf.d(gic2.f.getDecorView(), null);
                xm.f(gic2.f.getDecorView(), null);
            }
            gic2.a.a();
            gic2.g.S();
            gic2.c().ad();
            gic2.b.d(aaz.ON_DESTROY);
            this.e = null;
        }
    }
}

