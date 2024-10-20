/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 */
import android.content.Context;
import android.view.GestureDetector;
import com.google.android.libraries.speech.transcription.voiceime.BackspaceView;
import java.util.concurrent.atomic.AtomicReference;

public final class fkz {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/voiceime/BackspaceViewPeer");
    public final fma b;
    public final gpm c;
    public final GestureDetector d;
    private final fky e;
    private final AtomicReference f;

    public fkz(fma fma2, BackspaceView backspaceView, ghn ghn2, gpm gpm2) {
        fky fky2;
        this.e = fky2 = new fky(this);
        this.f = new AtomicReference<Object>(null);
        this.b = fma2;
        this.c = gpm2;
        this.d = new GestureDetector((Context)ghn2, (GestureDetector.OnGestureListener)new gpl(gpm2, (GestureDetector.OnGestureListener)fky2, (GestureDetector.OnDoubleTapListener)fky2));
        backspaceView.setOnTouchListener(new bkl(this, 2));
    }

    public final void a(hpn hpn2) {
        if ((hpn2 = this.f.getAndSet(hpn2)) != null) {
            hpn2.cancel(false);
        }
    }
}

