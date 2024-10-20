/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  gqv
 */
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class gpl
implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {
    final gpm a;
    private final GestureDetector.OnGestureListener b;
    private final GestureDetector.OnDoubleTapListener c;
    private final String d;

    public gpl(gpm gpm2, GestureDetector.OnGestureListener onGestureListener, GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a = gpm2;
        this.b = onGestureListener;
        this.c = onDoubleTapListener;
        this.d = "Backspace gesture listener";
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            return this.c.onDoubleTap(motionEvent);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.c.onDoubleTap(motionEvent);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            return this.c.onDoubleTapEvent(motionEvent);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.c.onDoubleTapEvent(motionEvent);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            return this.b.onDown(motionEvent);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.b.onDown(motionEvent);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (fxf.aw(gqv.a)) {
            return this.b.onFling(motionEvent, motionEvent2, f2, f3);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.b.onFling(motionEvent, motionEvent2, f2, f3);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            this.b.onLongPress(motionEvent);
            return;
        }
        gof gof2 = this.a.d(this.d);
        try {
            this.b.onLongPress(motionEvent);
            return;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (fxf.aw(gqv.a)) {
            return this.b.onScroll(motionEvent, motionEvent2, f2, f3);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.b.onScroll(motionEvent, motionEvent2, f2, f3);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            this.b.onShowPress(motionEvent);
            return;
        }
        gof gof2 = this.a.d(this.d);
        try {
            this.b.onShowPress(motionEvent);
            return;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            return this.c.onSingleTapConfirmed(motionEvent);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.c.onSingleTapConfirmed(motionEvent);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (fxf.aw(gqv.a)) {
            return this.b.onSingleTapUp(motionEvent);
        }
        gof gof2 = this.a.d(this.d);
        try {
            boolean bl2 = this.b.onSingleTapUp(motionEvent);
            return bl2;
        }
        finally {
            gof2.close();
        }
    }
}

