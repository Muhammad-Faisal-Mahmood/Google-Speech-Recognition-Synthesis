/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.view.View
 */
import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

final class ch
implements Transition.TransitionListener {
    final View a;
    final ArrayList b;

    public ch(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener((Transition.TransitionListener)this);
        this.a.setVisibility(8);
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((View)this.b.get(i2)).setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        transition.removeListener((Transition.TransitionListener)this);
        transition.addListener((Transition.TransitionListener)this);
    }
}

