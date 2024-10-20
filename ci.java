/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 */
import android.transition.Transition;
import java.util.ArrayList;

final class ci
implements Transition.TransitionListener {
    final Object a;
    final ArrayList b;
    final Object c;
    final ArrayList d;
    final cl e;

    public ci(cl cl2, Object object, ArrayList arrayList, Object object2, ArrayList arrayList2) {
        this.e = cl2;
        this.a = object;
        this.b = arrayList;
        this.c = object2;
        this.d = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener((Transition.TransitionListener)this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition object) {
        object = this.a;
        if (object != null) {
            this.e.g(object, this.b, null);
        }
        if ((object = this.c) != null) {
            this.e.g(object, this.d, null);
        }
    }
}

