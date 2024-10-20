/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
import android.view.GestureDetector;
import android.view.MotionEvent;

final class fky
extends GestureDetector.SimpleOnGestureListener {
    final fkz a;

    public fky(fkz fkz2) {
        this.a = fkz2;
    }

    public final void onLongPress(MotionEvent object) {
        ((heg)((heg)fkz.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/BackspaceViewPeer$BackspaceGestureListener", "onLongPress", 85, "BackspaceViewPeer.java")).u("#onLongPress(%s)", object);
        object = this.a;
        ((fkz)object).a(((fkz)object).b.c());
    }
}

