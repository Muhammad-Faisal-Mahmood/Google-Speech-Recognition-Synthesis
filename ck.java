/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 */
import android.graphics.Rect;
import android.transition.Transition;

final class ck
extends Transition.EpicenterCallback {
    final Rect a;

    public ck(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}

